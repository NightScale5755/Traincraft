package train.client.render.models;

import train.client.tmt.ModelBase;
import net.minecraft.entity.Entity;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;
import train.common.core.handlers.ConfigHandler;

public class ModelFreightCenterBeam_Wood_1 extends ModelBase {

	public ModelFreightCenterBeam_Wood_1() {
		box = new CustomModelRenderer(this, 1, 7, 256, 256);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(5F, 0F, 10F);

		box0 = new CustomModelRenderer(this, 4, 29, 256, 256);
		box0.addBox(0F, 0F, 0F, 1, 4, 10);
		box0.setPosition(6F, 1F, 12F);

		box1 = new CustomModelRenderer(this, 22, 2, 256, 256);
		box1.addBox(0F, 0F, 0F, 10, 1, 1);
		box1.setPosition(-5F, 3F, -22F);

		box10 = new CustomModelRenderer(this, 84, 22, 256, 256);
		box10.addBox(0F, 0F, 0F, 1, 2, 48);
		box10.setPosition(3F, 4F, -24F);

		box11 = new CustomModelRenderer(this, 84, 22, 256, 256);
		box11.addBox(0F, 0F, 0F, 1, 2, 48);
		box11.setPosition(-4F, 4F, -24F);

		box12 = new CustomModelRenderer(this, 84, 27, 256, 256);
		box12.addBox(0F, 0F, 0F, 2, 22, 46);
		box12.setPosition(-1F, 8F, -23F);

		box13 = new CustomModelRenderer(this, 0, 0, 256, 256);
		box13.addBox(0F, 0F, 0F, 8, 1, 48);
		box13.setPosition(-4F, 30F, -24F);

		box14 = new CustomModelRenderer(this, 6, 88, 256, 256);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setPosition(-8F, 2F, 16F);

		box15 = new CustomModelRenderer(this, 22, 2, 256, 256);
		box15.addBox(0F, 0F, 0F, 10, 1, 1);
		box15.setPosition(-5F, 3F, 21F);

		box16 = new CustomModelRenderer(this, 65, 1, 256, 256);
		box16.addBox(0F, 0F, 0F, 18, 22, 1);
		box16.setPosition(-9F, 8F, 23F);

		box17 = new CustomModelRenderer(this, 29, 37, 256, 256);
		box17.addBox(0F, 0F, 0F, 4, 2, 4);
		box17.setPosition(-2F, 4F, -19F);

		box18 = new CustomModelRenderer(this, 64, 25, 256, 256);
		box18.addBox(0F, 0F, 0F, 18, 22, 1);
		box18.setPosition(-9F, 8F, -24F);

		box19 = new CustomModelRenderer(this, 135, 22, 256, 256);
		box19.addBox(0F, 0F, 0F, 6, 3, 44);
		box19.setPosition(2F, 8F, -22F);

		box2 = new CustomModelRenderer(this, 1, 7, 256, 256);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(-6F, 0F, -24F);

		box20 = new CustomModelRenderer(this, 140, 72, 256, 256);
		box20.addBox(0F, 0F, 0F, 5, 2, 40);
		box20.setPosition(2F, 11F, -21F);

		box21 = new CustomModelRenderer(this, 141, 115, 256, 256);
		box21.addBox(0F, 0F, 0F, 4, 2, 40);
		box21.setPosition(2F, 13F, -20F);

		box22 = new CustomModelRenderer(this, 29, 37, 256, 256);
		box22.addBox(0F, 0F, 0F, 4, 2, 4);
		box22.setPosition(-2F, 4F, 15F);

		box23 = new CustomModelRenderer(this, 144, 158, 256, 256);
		box23.addBox(0F, 0F, 0F, 3, 1, 38);
		box23.setPosition(2F, 15F, -19F);

		box24 = new CustomModelRenderer(this, 135, 22, 256, 256);
		box24.addBox(0F, 0F, 0F, 6, 3, 44);
		box24.setPosition(-2F, 8F, 22F);
		box24.rotateAngleY = -3.141592653589793F;

		box25 = new CustomModelRenderer(this, 140, 72, 256, 256);
		box25.addBox(0F, 0F, 0F, 5, 2, 40);
		box25.setPosition(-2F, 11F, 20F);
		box25.rotateAngleY = -3.141592653589793F;

		box26 = new CustomModelRenderer(this, 141, 115, 256, 256);
		box26.addBox(0F, 0F, 0F, 4, 2, 40);
		box26.setPosition(-2F, 13F, 21F);
		box26.rotateAngleY = -3.141592653589793F;

		box27 = new CustomModelRenderer(this, 144, 158, 256, 256);
		box27.addBox(0F, 0F, 0F, 3, 1, 38);
		box27.setPosition(-2F, 15F, 20F);
		box27.rotateAngleY = -3.141592653589793F;

		box3 = new CustomModelRenderer(this, 1, 7, 256, 256);
		box3.addBox(0F, 0F, 0F, 1, 6, 14);
		box3.setPosition(5F, 0F, -24F);

		box31 = new CustomModelRenderer(this, 1, 7, 256, 256);
		box31.addBox(0F, 0F, 0F, 1, 6, 14);
		box31.setPosition(-6F, 0F, 10F);

		box32 = new CustomModelRenderer(this, 4, 29, 256, 256);
		box32.addBox(0F, 0F, 0F, 1, 4, 10);
		box32.setPosition(-7F, 1F, 12F);

		box4 = new CustomModelRenderer(this, 4, 29, 256, 256);
		box4.addBox(0F, 0F, 0F, 1, 4, 10);
		box4.setPosition(-7F, 1F, -22F);

		box41 = new CustomModelRenderer(this, 0, 49, 256, 256);
		box41.addBox(0F, 0F, 0F, 18, 2, 48);
		box41.setPosition(-9F, 6F, -24F);

		box43 = new CustomModelRenderer(this, 3, 61, 256, 256);
		box43.addBox(0F, 0F, 0F, 4, 2, 9);
		box43.setPosition(-2F, 5F, -28F);

		box5 = new CustomModelRenderer(this, 4, 29, 256, 256);
		box5.addBox(0F, 0F, 0F, 1, 4, 10);
		box5.setPosition(6F, 1F, -22F);

		box6 = new CustomModelRenderer(this, 6, 88, 256, 256);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setPosition(-8F, 2F, -18F);

		box7 = new CustomModelRenderer(this, 22, 2, 256, 256);
		box7.addBox(0F, 0F, 0F, 10, 1, 1);
		box7.setPosition(-5F, 3F, -13F);

		box8 = new CustomModelRenderer(this, 22, 2, 256, 256);
		box8.addBox(0F, 0F, 0F, 10, 1, 1);
		box8.setPosition(-5F, 3F, 12F);

		box9 = new CustomModelRenderer(this, 3, 49, 256, 256);
		box9.addBox(0F, 0F, 0F, 4, 2, 9);
		box9.setPosition(-2F, 5F, 19F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box22.render(f5);
		box3.render(f5);
		box31.render(f5);
		box32.render(f5);
		box4.render(f5);
		box41.render(f5);
		box43.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		box2.render(f5);

		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
			if(cargo<=((Freight) entity).getSizeInventory()/6) {
				//bottom
				box24.render(f5);
				box19.render(f5);
			}
			else if(cargo<=((Freight) entity).getSizeInventory()/3 && cargo>((Freight) entity).getSizeInventory()/6) {
				//bottom
				box24.render(f5);
				box19.render(f5);
				//bottom+1
				box25.render(f5);
				box20.render(f5);
			}
			else if(cargo<=((Freight) entity).getSizeInventory()/2 && cargo>((Freight) entity).getSizeInventory()/3) {
				//bottom
				box24.render(f5);
				box19.render(f5);
				//bottom+1
				box25.render(f5);
				box20.render(f5);
				//bottom+2
				box26.render(f5);
				box21.render(f5);
			}
			else if(cargo>((Freight) entity).getSizeInventory()/2) {
				//bottom
				box24.render(f5);
				box19.render(f5);
				//bottom+1
				box25.render(f5);
				box20.render(f5);
				//bottom+2
				box26.render(f5);
				box21.render(f5);
				//top
				box23.render(f5);
				box27.render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box16;
	public CustomModelRenderer box17;
	public CustomModelRenderer box18;
	public CustomModelRenderer box19;
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box21;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box3;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box4;
	public CustomModelRenderer box41;
	public CustomModelRenderer box43;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;
}
