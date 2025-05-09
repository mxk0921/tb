package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.security.realidentity.service.media.audio.RPMediaPlayManager;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String j = "MediaService";
    public Context b;
    public AssetFileDescriptor d;
    public int e;
    public HandlerThread f;
    public Handler g;
    public int h;
    public long i;
    public boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f2731a = new MediaPlayer();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPMediaPlayManager.AudioType f2732a;

        public a(RPMediaPlayManager.AudioType audioType) {
            this.f2732a = audioType;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                h3.this.a(this.f2732a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPMediaPlayManager.AudioType f2733a;

        public b(RPMediaPlayManager.AudioType audioType) {
            this.f2733a = audioType;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                h3.this.a(this.f2733a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements MediaPlayer.OnCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
                return;
            }
            try {
                AssetFileDescriptor assetFileDescriptor = h3.this.d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                    h3.this.d = null;
                }
            } catch (IOException e) {
                com.alibaba.security.realidentity.a.a(h3.j, e);
            }
        }
    }

    public h3(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("face-sound-play-thread");
        this.f = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.f.getLooper());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MediaPlayer mediaPlayer = this.f2731a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setOnCompletionListener(null);
                this.f2731a.reset();
                this.f2731a.release();
                this.f2731a = null;
            } catch (Throwable unused) {
            }
        }
    }

    public int b(RPMediaPlayManager.AudioType audioType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a303a09", new Object[]{this, audioType})).intValue();
        }
        if (audioType == RPMediaPlayManager.AudioType.POS_PITCH_UP) {
            return SecExceptionCode.SEC_ERROR_SAFETOKEN_INVALID_SEED;
        }
        if (audioType == RPMediaPlayManager.AudioType.MOUTH) {
            return 1350;
        }
        if (audioType == RPMediaPlayManager.AudioType.POS_YAW) {
            return 1600;
        }
        if (audioType == RPMediaPlayManager.AudioType.BLINK) {
            return 1400;
        }
        RPMediaPlayManager.AudioType audioType2 = RPMediaPlayManager.AudioType.BLINK;
        return 200;
    }

    public int c(RPMediaPlayManager.AudioType audioType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6337ff0a", new Object[]{this, audioType})).intValue();
        }
        if (this.c) {
            return 0;
        }
        long b2 = b();
        this.i = System.currentTimeMillis();
        this.h = b(audioType);
        if (b2 > 0) {
            this.g.postDelayed(new a(audioType), b2);
        } else {
            this.g.post(new b(audioType));
        }
        return (int) (this.h + b2);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            MediaPlayer mediaPlayer = this.f2731a;
            if (mediaPlayer == null) {
                return false;
            }
            if (mediaPlayer.isPlaying()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (d()) {
                this.f2731a.pause();
                this.f2731a.stop();
            }
            MediaPlayer mediaPlayer = this.f2731a;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
        } catch (Throwable unused) {
        }
    }

    public int a(RPMediaPlayManager.AudioType audioType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91287508", new Object[]{this, audioType})).intValue();
        }
        try {
            if (this.c) {
                return 0;
            }
            this.h = b(audioType);
            int raw = audioType.getRaw(this.b);
            this.e = raw;
            if (raw == 0) {
                return 0;
            }
            a();
            MediaPlayer create = MediaPlayer.create(this.b, this.e);
            this.f2731a = create;
            if (create == null) {
                return 0;
            }
            if (create.isPlaying()) {
                this.f2731a.pause();
            }
            this.f2731a.reset();
            AssetFileDescriptor assetFileDescriptor = this.d;
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            AssetFileDescriptor openRawResourceFd = this.b.getResources().openRawResourceFd(this.e);
            this.d = openRawResourceFd;
            this.f2731a.setDataSource(openRawResourceFd.getFileDescriptor(), this.d.getStartOffset(), this.d.getLength());
            this.f2731a.setOnCompletionListener(new c());
            this.f2731a.prepare();
            this.f2731a.start();
            this.i = System.currentTimeMillis();
            int duration = this.f2731a.getDuration();
            this.h = duration;
            return duration;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        long currentTimeMillis = (this.h + this.i) - System.currentTimeMillis();
        if (currentTimeMillis < 0 || currentTimeMillis > 3000) {
            return 0L;
        }
        return currentTimeMillis;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z) {
            e();
        }
    }
}
