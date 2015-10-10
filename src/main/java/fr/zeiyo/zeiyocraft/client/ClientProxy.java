package fr.zeiyo.zeiyocraft.client;

import fr.zeiyo.zeiyocraft.CommonProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);

	    BlockRenderRegister.registerBlockRenderer();
        ItemRenderRegister.registerItemRenderer();

    }
	
	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
	
}