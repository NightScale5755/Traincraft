/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("LocomotiveSteamSmall.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.entity.train.steam.small;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import traincraft.Traincraft;
import traincraft.api.*;
import traincraft.renderer.TraincraftModel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class LocomotiveSteamSmall extends LocomotiveSteam<LocomotiveSteamSmall> {
    
    private static final TraincraftModel MODEL = TCUtil.loadModelFromJTMT(new ResourceLocation(Traincraft.MOD_ID, "steam/steam_train.jtmt"));
    
    public LocomotiveSteamSmall(World worldIn){
        super(worldIn);
    }
    
    public LocomotiveSteamSmall(World worldIn, double x, double y, double z){
        super(worldIn, x, y, z);
    }
    
    @Override
    public Vec3d getSize(AbstractRollingStock<?> rollingStock){
        return new Vec3d(1.04D, 1.856D, 2.2D);
    }
    
    @Override
    public double getAcceleration(AbstractRollingStock<?> rollingStock){
        return 0.5D; // original value
    }
    
    @Override
    public double getBreakPower(AbstractRollingStock<?> rollingStock){
        return 0.968D; // original value
    }
    
    @Override
    public double getMaxSpeed(AbstractRollingStock<?> rollingStock){
        return Units.kmhToMs(45D);
    }
    
    @Override
    public double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock){
        return 0;
    }
    
    @Override
    public double getMass(AbstractRollingStock<?> rollingStock){
        return 5000D;
    }
    
    @Override
    public void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins){
        skins.put("red", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_red.png"));
        skins.put("green", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_green.png"));
        skins.put("blue", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_blue.png"));
        skins.put("yellow", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_yellow.png"));
        skins.put("black", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_black.png"));
    }
    
    @Override
    public void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats){
        seats.add(new PassengerSeat(new AxisAlignedBB(-0.5D, 0, -0.5D, 0.5D, 0.5D, 0.5D)));
    }
    
    @Override
    public TraincraftModel getModel(AbstractRollingStock<?> rollingStock){
        return MODEL;
    }
    
    @Override
    public float getModelScale(AbstractRollingStock<?> rollingStock){
        return 0.8F;
    }
    
    @Nullable
    @Override
    public GuiScreen openGui(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        return new GuiLocomotiveSteam(this, player);
    }
    
    @Nullable
    @Override
    public Container openContainer(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player){
        return new ContainerLocomotiveSteam(this, player);
    }
}
