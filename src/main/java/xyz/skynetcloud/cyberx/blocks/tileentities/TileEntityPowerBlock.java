package xyz.skynetcloud.cyberx.blocks.tileentities;

import com.ibm.icu.impl.duration.impl.DataRecord.EUnitVariant;

import cofh.redstoneflux.api.IEnergyHandler;
import cofh.redstoneflux.api.IEnergyProvider;
import cofh.redstoneflux.api.IEnergyReceiver;
import cofh.redstoneflux.api.IEnergyStorage;
import cofh.redstoneflux.impl.EnergyStorage;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.energy.CapabilityEnergy;
import xyz.skynetcloud.cyberx.util.ModConfig;

public  class TileEntityPowerBlock extends TileEntity implements  IEnergyHandler, IEnergyProvider, IEnergyReceiver {
	
	
	
	protected float fireRisk = 0.02f;
	protected int maxStorage = 10000;
	protected int currentStorage = 0;
	protected int generationRate = 10;
	protected int consumeRate = 1;
	public net.minecraftforge.energy.IEnergyStorage energy;

	
	public TileEntityPowerBlock() {
		super();
		setEnergyStorage(20000, 0.5f);
	}
	
	
	public void setEnergyStorage(int size, float rate) {
		maxStorage = size;
		generationRate = (int) ((float)ModConfig.rfCost * rate);
	}
	
	
	//Energy stuff
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		return true;
	}

	@Override
	public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
		return 0;
	}

	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
		int energyExtracted = Math.min(currentStorage, maxExtract);
		if (!simulate) {
			changeCharge((energyExtracted * -1));
		}
		return energyExtracted;
	}

	public void changeCharge(int amount) { 
		int prevAmount = currentStorage;
		
		currentStorage += amount;
		if (currentStorage >= maxStorage) currentStorage = maxStorage;
		if (currentStorage < 0) currentStorage = 0;
		
		if (currentStorage != prevAmount);
	}

	@Override
	public int getEnergyStored(EnumFacing facing) {
		return getEnergyStored();
	}
	
	public int getEnergyStored() {
		return currentStorage;
	}

	@Override
	public int getMaxEnergyStored(EnumFacing facing) {
		return getMaxEnergyStored();
	}
	
	public int getMaxEnergyStored() {
		return maxStorage;
	}

	public void outputEnergy() {
		//Lets go around the world and try and give it to someone!
		for(EnumFacing facing : EnumFacing.values()) {
			//Do we have any energy up for grabs?
			if (currentStorage>0) {
				TileEntity entity = world.getTileEntity(pos.offset(facing));
				if (entity!=null) {
					if (entity.hasCapability(CapabilityEnergy.ENERGY, facing.getOpposite())) {
						energy = entity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite());
						if (energy.canReceive()) {
							int giveAmount = energy.receiveEnergy(currentStorage, false);
							if (giveAmount>0) {
								changeCharge(giveAmount * -1);
							}
						}
					} else if (entity instanceof IEnergyReceiver) {
						IEnergyReceiver energy = (IEnergyReceiver) entity;
						if (energy.canConnectEnergy(facing.getOpposite())) {
							int giveAmount = energy.receiveEnergy(facing.getOpposite(), currentStorage, false);
							if (giveAmount>0) {
								changeCharge(giveAmount * -1);
							}
						}
					}
				}
			}
		}
	}	
}
