package com.example.info.yukihide.ballaction;
//================================================
//MEMO
//ButtonSprite とSprite の引数なしコンストラクタでエラー　⇒理由がわからないのでコメントアウトで対応中
//public SpriteMenuItem(final int pID, final ITextureRegion pTextureRegion, final ISpriteVertexBufferObject pVertexBufferObject, final ShaderProgram pShaderProgram)
//⇒理由がわからないのでコメントアウトで対応中

//================================================
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleLayoutGameActivity;

//public class MainActivity extends SimpleLayoutGameActivity {
public class MainActivity extends MultiSceneActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    private int CAMERA_WIDTH = 480;
    private int CAMERA_HEIGHT = 800;

    @Override
    public EngineOptions onCreateEngineOptions() {

        final Camera camera = new Camera(0,0,CAMERA_WIDTH,CAMERA_HEIGHT);

        EngineOptions eo = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,
                new RatioResolutionPolicy(CAMERA_WIDTH,CAMERA_HEIGHT),camera);
        return eo;
    }

//    -------------------------------------------------------
//    @Override
//    protected void onCreateResources() {
//
//    }

    @Override
    public void appendScene(KeyListenScene scene) {

    }

    @Override
    public void backToInitial() {

    }

    @Override
    public void refreshRunningScene(KeyListenScene scene) {

    }
//    -------------------------------------------------------

    @Override
    protected Scene onCreateScene() {
        MainScene mainScene = new MainScene(this);
        return mainScene;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected int getRenderSurfaceViewID() {
        return R.id.renderView;
    }
}