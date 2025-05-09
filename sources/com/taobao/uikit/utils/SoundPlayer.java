package com.taobao.uikit.utils;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SoundPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SoundPlayer";
    public static SoundPlayer _INSTANCE;
    private Context mContext;
    private SoundPool mSoundPool;
    private HashMap<Object, Integer> mSoundsLoaded;
    private boolean mShoudPlay = true;
    private HashMap<Integer, Object> mScenesMap = new HashMap<>();

    static {
        t2o.a(931135580);
    }

    public SoundPlayer(Context context) {
        this.mContext = context;
        initSoundPool();
    }

    public static /* synthetic */ SoundPool access$000(SoundPlayer soundPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoundPool) ipChange.ipc$dispatch("62b7d6c5", new Object[]{soundPlayer});
        }
        return soundPlayer.mSoundPool;
    }

    public static SoundPlayer getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoundPlayer) ipChange.ipc$dispatch("5947945d", new Object[]{context});
        }
        if (_INSTANCE == null) {
            synchronized (SoundPlayer.class) {
                _INSTANCE = new SoundPlayer(context);
            }
        }
        return _INSTANCE;
    }

    private void initSoundPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cbe1a2", new Object[]{this});
            return;
        }
        this.mSoundPool = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
        Coordinator.postTaskToHandler(new Runnable() { // from class: com.taobao.uikit.utils.SoundPlayer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SoundPlayer.access$000(SoundPlayer.this).setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.taobao.uikit.utils.SoundPlayer.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.media.SoundPool.OnLoadCompleteListener
                        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f68edc", new Object[]{this, soundPool, new Integer(i), new Integer(i2)});
                            } else if (i2 == 0) {
                                soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
                                new StringBuilder("play sound success. sampleId=").append(i);
                            }
                        }
                    });
                }
            }
        });
        this.mSoundsLoaded = new HashMap<>();
    }

    public Object getSound(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("422e31ef", new Object[]{this, new Integer(i)});
        }
        HashMap<Integer, Object> hashMap = this.mScenesMap;
        if (hashMap != null && hashMap.containsKey(Integer.valueOf(i))) {
            return this.mScenesMap.get(Integer.valueOf(i));
        }
        new StringBuilder("No sound has been registered with scene id=").append(i);
        return null;
    }

    public void play(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d41d4a8", new Object[]{this, new Integer(i)});
        } else if (this.mShoudPlay) {
            if (this.mSoundPool == null) {
                initSoundPool();
            }
            if (this.mSoundsLoaded.containsKey(Integer.valueOf(i))) {
                this.mSoundPool.play(this.mSoundsLoaded.get(Integer.valueOf(i)).intValue(), 1.0f, 1.0f, 0, 0, 1.0f);
                return;
            }
            Context context = this.mContext;
            if (context != null) {
                this.mSoundsLoaded.put(Integer.valueOf(i), Integer.valueOf(this.mSoundPool.load(context, i, 1)));
            }
        }
    }

    public void playScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab6d4a4", new Object[]{this, new Integer(i)});
        } else if (this.mScenesMap.containsKey(Integer.valueOf(i))) {
            Object obj = this.mScenesMap.get(Integer.valueOf(i));
            if (obj instanceof Integer) {
                play(((Integer) obj).intValue());
            } else if (obj instanceof String) {
                play((String) obj);
            }
        } else {
            Log.e(TAG, "sound with sceneId=" + i + " not binded");
        }
    }

    public void register(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fee478a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mScenesMap.containsKey(Integer.valueOf(i))) {
            StringBuilder sb = new StringBuilder("sound has been registered for id=");
            sb.append(i);
            sb.append(", will replace it");
        }
        this.mScenesMap.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        SoundPool soundPool = this.mSoundPool;
        if (soundPool != null) {
            soundPool.release();
            this.mSoundsLoaded.clear();
            this.mSoundsLoaded = null;
            this.mSoundPool = null;
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.mShoudPlay = z;
        }
    }

    public void register(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a81423", new Object[]{this, new Integer(i), str});
            return;
        }
        if (this.mScenesMap.containsKey(Integer.valueOf(i))) {
            StringBuilder sb = new StringBuilder("sound has been registered for id=");
            sb.append(i);
            sb.append(", will replace it");
        }
        if (TextUtils.isEmpty(str)) {
            switch (i) {
                case 0:
                    register(i, R.raw.sound_push);
                    return;
                case 1:
                    register(i, R.raw.sound_tap);
                    return;
                case 2:
                    register(i, R.raw.sound_refresh);
                    return;
                case 3:
                    register(i, R.raw.sound_favorite);
                    return;
                case 4:
                    register(i, R.raw.sound_add_to_cart);
                    return;
                case 5:
                    register(i, R.raw.sound_like);
                    return;
                case 6:
                    register(i, R.raw.sound_page_success);
                    return;
                case 7:
                    register(i, R.raw.sound_page_success);
                    return;
                default:
                    return;
            }
        } else {
            this.mScenesMap.put(Integer.valueOf(i), str);
        }
    }

    public void play(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858a6c5", new Object[]{this, str});
        } else if (this.mSoundsLoaded.containsKey(str)) {
            this.mSoundPool.play(this.mSoundsLoaded.get(str).intValue(), 1.0f, 1.0f, 0, 0, 1.0f);
        } else {
            this.mSoundsLoaded.put(str, Integer.valueOf(this.mSoundPool.load(str, 1)));
        }
    }
}
