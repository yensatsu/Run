package com.example.info.yukihide.ballaction;
import android.graphics.Bitmap;
import android.view.KeyEvent;

import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.bitmap.BitmapTexture;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.ui.activity.BaseGameActivity;

import javax.microedition.khronos.opengles.GL10;

//public class MainScene extends Scene {


public class MainScene extends KeyListenScene {

//    private BaseGameActivity baseActivity;
//    private MultiSceneActivity baseActivity;
//    private ResourceUtil resourceUtil;

    public MainScene(MultiSceneActivity baseActivity){
        super(baseActivity);
//        this.baseActivity = baseActivity;
        init();
    }


    public void init() {
//        BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
//        BitmapTextureAtlas bta = new BitmapTextureAtlas(
//                baseActivity.getTextureManager(),512,1024, TextureOptions.BILINEAR_PREMULTIPLYALPHA
//        );
//        baseActivity.getTextureManager().loadTexture(bta);
//        ITextureRegion btr
//                = BitmapTextureAtlasTextureRegionFactory.createFromAsset(
//                        bta,baseActivity,"main_bg.png",0,0);
//        Sprite bg = new Sprite
//                (0,0,btr,baseActivity.getVertexBufferObjectManager());
//        bg.setBlendFunction(GL10.GL_SRC_ALPHA,GL10.GL_ONE_MINUS_SRC_ALPHA);
//        attachChild(bg);

//        resourceUtil = ResourceUtil.getInstance(baseActivity);
//        attachChild(resourceUtil.getSprite("main_bg.png"));
        attachChild(getBaseActivity().getResourceUtil().getSprite("main_bg.png"));

    }

    @Override
    public void prepareSoundAndMusic() {

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        return false;
    }


}
