package com.example.info.yukihide.ballaction;

import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleLayoutGameActivity;

import java.util.ArrayList;

public abstract class MultiSceneActivity extends SimpleLayoutGameActivity {
//    ResourceUtilのインスタンス
    private ResourceUtil mResourceUtil;

//    起動済みのSceneの配列
    private ArrayList<KeyListenScene> mSceneArray;

    @Override
    protected void onCreateResources() {
        mResourceUtil = ResourceUtil.getInstance(this);
        mSceneArray = new ArrayList<KeyListenScene>();
    }

    public ResourceUtil getResourceUtil(){
        return mResourceUtil;
    }
    public ArrayList<KeyListenScene> getSceneArray(){
        return mSceneArray;
    }

//    起動済みのKeyListSceneを格納する配列
    public abstract void appendScene(KeyListenScene scene);
//    最初のシーンに戻るための関数
    public abstract void backToInitial();
//    シーンとシーン格納配列を更新する関数
    public abstract void refreshRunningScene(KeyListenScene scene);


//    @Override
//    protected int getLayoutID() {
//        return 0;
//    }

//    @Override
//    protected Scene onCreateScene() {
//        return null;
//    }
//    @Override
//    protected int getRenderSurfaceViewID() {
//        return 0;
//    }

//    @Override
//    public EngineOptions onCreateEngineOptions() {
//        return null;
//    }
}
