package com.example.info.yukihide.ballaction;

import android.view.KeyEvent;

import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.ui.activity.BaseGameActivity;

public abstract class KeyListenScene extends Scene {

//    private BaseGameActivity baseActivity;
    private MultiSceneActivity baseActivity;


//    コンストラクタ
    public KeyListenScene(MultiSceneActivity baseGameActivity){
//        タッチ＆リリース
//        ボタンをタップし画面外へスライドしたときに画像が戻らない衣装を防ぐ
        setTouchAreaBindingOnActionDownEnabled(true);
        this.baseActivity = baseGameActivity;
        prepareSoundAndMusic();
    }

    public MultiSceneActivity getBaseActivity(){
        return baseActivity;
    }

//    各クラスで呼ぶためabstractで宣言
//    イニシャライザ
    public abstract void init();
//    サウンド準備
    public abstract void prepareSoundAndMusic();
//    KeyEventのリスナー
    public abstract boolean dispatchKeyEvent(KeyEvent e);

//    Spriteの座標を画面中央に設定する
    public Sprite placeToCenter(Sprite sp){
        sp.setPosition(baseActivity.getEngine().getCamera().getWidth()
                        /2.0f -sp.getWidth() / 2.0f,
                baseActivity.getEngine().getCamera().getHeight()
                        / 2.0f - sp.getHeight() /2.0f);
        return sp;
    }

//    Spriteのｘ座標を画面中央に設定
    public Sprite placeToCenterX(Sprite sp,float y){
        sp.setPosition(baseActivity.getEngine().getCamera().getWidth()
                /2.0f-sp.getWidth()/2.0f,y);

        return sp;
    }
//    Spriteのｙ座標を画面中央に設定
    public Sprite placeToCenterY(Sprite sp,float x){
        sp.setPosition(x,baseActivity.getEngine().getCamera().getHeight()
                /2.0f-sp.getHeight()/2.0f);
        return sp;
    }
}
