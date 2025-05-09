package com.taobao.search.musie.component.audio;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.t2o;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Audio extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_AUTOPLAY = "autoplay";
    private static final String ATTR_LOOP = "loop";
    private static final String ATTR_SRC = "src";
    private Runnable delayRunnable;
    private MediaPlayer mediaPlayer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/audio/Audio$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Audio.this.play();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/audio/Audio$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Audio.this.pause();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements MediaPlayer.OnBufferingUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ae0494f", new Object[]{this, mediaPlayer, new Integer(i)});
            } else if (i >= 100 && !Audio.access$000(Audio.this).isPlaying()) {
                Audio.access$000(Audio.this).start();
            }
        }
    }

    static {
        t2o.a(815792688);
    }

    public Audio(int i) {
        super(i);
    }

    public static /* synthetic */ MediaPlayer access$000(Audio audio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayer) ipChange.ipc$dispatch("a26e8132", new Object[]{audio});
        }
        return audio.mediaPlayer;
    }

    public static /* synthetic */ Object ipc$super(Audio audio, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/audio/Audio");
    }

    private boolean isLoop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute("loop");
        if (!(attribute instanceof Boolean) || !((Boolean) attribute).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.LAYOUT;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        String str = (String) getAttribute("src");
        if (!TextUtils.isEmpty(str)) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.mediaPlayer = mediaPlayer;
            mediaPlayer.setLooping(isLoop());
            try {
                this.mediaPlayer.setDataSource(str);
                this.mediaPlayer.prepareAsync();
                Boolean bool = (Boolean) getAttribute("autoplay");
                if (bool != null && bool.booleanValue()) {
                    this.mediaPlayer.setOnBufferingUpdateListener(new c());
                }
                Runnable runnable = this.delayRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.delayRunnable = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        try {
            this.mediaPlayer.stop();
            this.mediaPlayer.release();
            this.delayRunnable = null;
        } catch (Exception unused) {
        }
        this.mediaPlayer = null;
    }

    @MUSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            this.delayRunnable = new b();
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                this.mediaPlayer.pause();
            }
        } catch (Exception unused) {
        }
    }

    @MUSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            this.delayRunnable = new a();
            return;
        }
        try {
            if (!mediaPlayer.isPlaying()) {
                this.mediaPlayer.start();
            }
        } catch (Exception unused) {
        }
    }

    @MUSNodeProp(name = "loop", refresh = true)
    public void refreshLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567126e", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(isLoop());
        }
    }

    @MUSNodeProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("loop", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }
}
