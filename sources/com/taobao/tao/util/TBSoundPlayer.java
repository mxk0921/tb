package com.taobao.tao.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Global;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.SoundPlayer;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBSoundPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SETTINGS_SYSTEM_MESSAGE_SOUND = "systemMessageSound";
    private static final String SETTINGS_SYSTEM_SOUND = "systemSound";
    private static final String TAG = "TBSoundPlayer";
    private static TBSoundPlayer _INSTANCE;
    private static boolean sOnlineConfig = true;
    private static HashMap sSceneConfigMap = new HashMap<Integer, String>() { // from class: com.taobao.tao.util.TBSoundPlayer.1
        {
            put(0, "message");
            put(1, "tap");
            put(2, "pullRefresh");
            put(3, "favorite");
            put(4, "cart");
            put(5, "like");
            put(6, "page");
            put(7, "page");
        }
    };
    private Context mContext;
    private SoundPlayer mRealPlayer;
    private boolean mEnable = true;
    private boolean mMessageEnable = true;
    private boolean mIsTouchSoundsEnabled = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Scene {
        public static final int CART = 4;
        public static final int FAVORITE = 3;
        public static final int LIKE = 5;
        public static final int PAY = 6;
        public static final int PUBLISH = 7;
        public static final int PUSH = 0;
        public static final int REFRESH = 2;
        public static final int TAP = 1;

        static {
            t2o.a(931135491);
        }
    }

    static {
        t2o.a(931135489);
    }

    private TBSoundPlayer() {
        Context context = Global.getContext();
        this.mContext = context;
        SoundPlayer instance = SoundPlayer.getInstance(context);
        this.mRealPlayer = instance;
        instance.register(0, R.raw.sound_push);
        this.mRealPlayer.register(1, R.raw.sound_tap);
        this.mRealPlayer.register(2, R.raw.sound_refresh);
        this.mRealPlayer.register(3, R.raw.sound_favorite);
        this.mRealPlayer.register(5, R.raw.sound_like);
        SoundPlayer soundPlayer = this.mRealPlayer;
        int i = R.raw.sound_page_success;
        soundPlayer.register(6, i);
        this.mRealPlayer.register(4, R.raw.sound_add_to_cart);
        this.mRealPlayer.register(7, i);
    }

    public static HashMap<Integer, String> getConfigMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("25ce72e", new Object[0]);
        }
        return sSceneConfigMap;
    }

    public static TBSoundPlayer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSoundPlayer) ipChange.ipc$dispatch("6de4fa2e", new Object[0]);
        }
        if (_INSTANCE == null) {
            synchronized (TBSoundPlayer.class) {
                _INSTANCE = new TBSoundPlayer();
            }
        }
        return _INSTANCE;
    }

    public static void setOnlineConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aa5896", new Object[]{new Boolean(z)});
        } else {
            sOnlineConfig = z;
        }
    }

    public Object getSound(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("422e31ef", new Object[]{this, new Integer(i)});
        }
        return this.mRealPlayer.getSound(i);
    }

    public void play(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d41d4a8", new Object[]{this, new Integer(i)});
        } else if (shouldPlaySound()) {
            this.mRealPlayer.play(i);
        }
    }

    public void playScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab6d4a4", new Object[]{this, new Integer(i)});
        } else if (shouldPlayScene(i)) {
            this.mRealPlayer.playScene(i);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.mRealPlayer.release();
        }
    }

    public void updateSound(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122afbb2", new Object[]{this, new Integer(i), obj});
        } else if (obj instanceof Integer) {
            this.mRealPlayer.register(i, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.mRealPlayer.register(i, (String) obj);
        }
    }

    public boolean shouldPlaySound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ec5253", new Object[]{this})).booleanValue();
        }
        Context context = this.mContext;
        if (context == null) {
            TLog.loge(TAG, "shouldPlaySound, mContext is null. use online config: " + sOnlineConfig);
            return sOnlineConfig;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains("systemSound")) {
            this.mEnable = defaultSharedPreferences.getBoolean("systemSound", true);
            TLog.loge(TAG, "shouldPlaySound, changed, use local config: " + this.mEnable);
            return this.mEnable;
        }
        TLog.loge(TAG, "shouldPlaySound, not changed, use online config: " + sOnlineConfig);
        return sOnlineConfig;
    }

    public void play(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858a6c5", new Object[]{this, str});
        } else if (shouldPlaySound()) {
            this.mRealPlayer.play(str);
        }
    }

    public boolean shouldPlayScene(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660b413b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Context context = this.mContext;
        if (context == null) {
            TLog.loge(TAG, "shouldPlayScene, mContext is null. use online config: " + sOnlineConfig);
            return sOnlineConfig;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean contains = defaultSharedPreferences.contains("systemSound");
        if (contains) {
            this.mEnable = defaultSharedPreferences.getBoolean("systemSound", true);
        }
        this.mMessageEnable = defaultSharedPreferences.getBoolean(SETTINGS_SYSTEM_MESSAGE_SOUND, true);
        this.mIsTouchSoundsEnabled = Settings.System.getInt(this.mContext.getContentResolver(), "sound_effects_enabled", 1) != 0;
        if (i == 0) {
            TLog.loge(TAG, "shouldPlayScene, sceneId is PUSH. use local config: " + this.mMessageEnable);
            return this.mMessageEnable;
        }
        if (contains) {
            TLog.loge(TAG, "shouldPlayScene, sceneId is not PUSH and not changed. use mEnable: " + this.mEnable);
            z = this.mEnable;
        } else {
            TLog.loge(TAG, "shouldPlayScene, sceneId is not PUSH and changed. use online config: " + sOnlineConfig);
            z = sOnlineConfig;
        }
        if (!z || !this.mIsTouchSoundsEnabled) {
            return z;
        }
        if (i == 2 || i == 7) {
            TLog.loge(TAG, "shouldPlayScene, sceneId is PUBLISH or REFRESH and result and mIsTouchSoundsEnabled. result set to true");
            return true;
        }
        TLog.loge(TAG, "shouldPlayScene, sceneId is default and result and mIsTouchSoundsEnabled. result set to false");
        return false;
    }
}
