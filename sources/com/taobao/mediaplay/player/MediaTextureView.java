package com.taobao.mediaplay.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.c;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.Field;
import tb.ew0;
import tb.feh;
import tb.qbi;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaTextureView extends TextureView implements c, TextureView.SurfaceTextureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mBackground;
    private c.a mCallback;
    private boolean mEnableStaySurfaceTexture;
    private feh mLogContext;
    private qbi mMeasureHelper;
    private String mPlayToken;
    private a mSurfaceHolder;
    private String mTag;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MediaTextureView f11024a;
        public SurfaceTexture b;
        public Surface c;
        public boolean d;

        static {
            t2o.a(774897801);
            t2o.a(774897791);
        }

        public a(MediaTextureView mediaTextureView) {
            this.f11024a = mediaTextureView;
        }

        public static /* synthetic */ Surface b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("56a444f3", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ Surface c(a aVar, Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("ab0cf8a5", new Object[]{aVar, surface});
            }
            aVar.c = surface;
            return surface;
        }

        public static /* synthetic */ SurfaceTexture d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SurfaceTexture) ipChange.ipc$dispatch("ceefdf0f", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ SurfaceTexture e(a aVar, SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SurfaceTexture) ipChange.ipc$dispatch("1ee7c3fc", new Object[]{aVar, surfaceTexture});
            }
            aVar.b = surfaceTexture;
            return surfaceTexture;
        }

        @Override // com.taobao.mediaplay.player.c.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61c8e096", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer != null) {
                feh access$000 = MediaTextureView.access$000(this.f11024a);
                AVSDKLog.e(access$000, iMediaPlayer + "bindToMediaPlayer mSurfaceHolder, mSurface=" + this.c);
                iMediaPlayer.setSurface(this.c);
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        @Override // com.taobao.mediaplay.player.c.b
        public c getRenderView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b45a4273", new Object[]{this});
            }
            return this.f11024a;
        }

        @Override // com.taobao.mediaplay.player.c.b
        public Surface getSurface() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.taobao.mediaplay.player.c.b
        public boolean isBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
            }
            return this.d;
        }
    }

    static {
        t2o.a(774897800);
        t2o.a(774897789);
    }

    public MediaTextureView(Context context, String str) {
        super(context);
        this.mTag = "MediaTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mBackground = false;
        this.mPlayToken = str;
        init();
    }

    public static /* synthetic */ feh access$000(MediaTextureView mediaTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("c01db681", new Object[]{mediaTextureView});
        }
        return mediaTextureView.getLogContext();
    }

    private feh getLogContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("62d1ffc3", new Object[]{this});
        }
        return this.mLogContext;
    }

    public static /* synthetic */ Object ipc$super(MediaTextureView mediaTextureView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/player/MediaTextureView");
        }
    }

    private boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.c
    public void addRenderCallback(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640151f8", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }

    public int getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371757", new Object[]{this})).intValue();
        }
        return this.mMeasureHelper.b();
    }

    @Override // com.taobao.mediaplay.player.c
    public float getDisplayAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0487f5e", new Object[]{this})).floatValue();
        }
        return this.mMeasureHelper.c();
    }

    @Override // com.taobao.mediaplay.player.c
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mLogContext = new feh(toString(), this.mPlayToken);
        this.mMeasureHelper = new qbi(this.mPlayToken);
        this.mSurfaceHolder = new a(this);
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "SeamlessSwitch MediaTextureView init holder: " + this.mSurfaceHolder);
        setSurfaceTextureListener(this);
    }

    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.mBackground;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        AVSDKLog.e(this.mLogContext, "onAttachedToWindow.");
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (!isMainThread()) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "mediaTextureView onDetachedFromWindow at subThread, stackTrace" + ew0.k(new Exception()));
        }
        super.onDetachedFromWindow();
        AVSDKLog.e(this.mLogContext, "onDetachedFromWindow.");
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        qbi qbiVar = this.mMeasureHelper;
        if (qbiVar != null) {
            qbiVar.a(i, i2);
            setMeasuredDimension(this.mMeasureHelper.e(), this.mMeasureHelper.d());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "onSurfaceTextureAvailable surface=" + surfaceTexture + ", width=" + i + ", height=" + i2 + ", background=" + this.mBackground);
        a aVar = this.mSurfaceHolder;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < d.H1) {
            surface = new Surface(surfaceTexture);
        } else {
            surface = a.b(aVar);
        }
        a.c(aVar, surface);
        if (a.d(this.mSurfaceHolder) != null && i3 >= d.H1) {
            try {
                setSurfaceTexture(a.d(this.mSurfaceHolder));
            } catch (Exception unused) {
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 21 || i4 == 22) {
                try {
                    Field declaredField = getClass().getSuperclass().getDeclaredField("mUpdateListener");
                    declaredField.setAccessible(true);
                    a.d(this.mSurfaceHolder).setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) declaredField.get(this));
                } catch (Throwable th) {
                    feh fehVar2 = this.mLogContext;
                    AVSDKLog.e(fehVar2, "setOnFrameAvailableListener error" + th.getMessage());
                }
            }
        }
        if (a.b(this.mSurfaceHolder) == null) {
            feh fehVar3 = this.mLogContext;
            AVSDKLog.e(fehVar3, "onSurfaceTextureAvailable new surface=" + surfaceTexture + ", width=" + i + ", height=" + i2 + ", background=" + this.mBackground);
            a.c(this.mSurfaceHolder, new Surface(surfaceTexture));
            a.e(this.mSurfaceHolder, surfaceTexture);
        } else if (!this.mEnableStaySurfaceTexture && a.d(this.mSurfaceHolder) != surfaceTexture) {
            a.c(this.mSurfaceHolder, new Surface(surfaceTexture));
            a.e(this.mSurfaceHolder, surfaceTexture);
            feh fehVar4 = this.mLogContext;
            AVSDKLog.e(fehVar4, "onSurfaceTextureAvailable re-create surface=" + surfaceTexture + ", width=" + i + ", height=" + i2 + ", background=" + this.mBackground);
        }
        c.a aVar2 = this.mCallback;
        if (aVar2 != null) {
            aVar2.c(this.mSurfaceHolder, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
            return;
        }
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.b(this.mSurfaceHolder);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "onWindowVisibilityChanged " + i);
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onWindowVisibilityChanged(i);
        }
    }

    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= d.H1) {
            try {
                a aVar = this.mSurfaceHolder;
                if (aVar != null && a.b(aVar) != null) {
                    a.b(this.mSurfaceHolder).release();
                    a.c(this.mSurfaceHolder, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.mediaplay.player.c
    public void removeRenderCallback(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8c13db", new Object[]{this, aVar});
        } else {
            this.mCallback = null;
        }
    }

    @Override // com.taobao.mediaplay.player.c
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.f(i);
        requestLayout();
    }

    @Override // com.taobao.mediaplay.player.c
    public void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mBackground = z;
        a aVar = this.mSurfaceHolder;
        if (aVar != null) {
            aVar.f(z);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setStaySurfaceTexture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed245e64", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableStaySurfaceTexture = z;
        }
    }

    @Override // com.taobao.mediaplay.player.c
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.i(i);
        setRotation(i);
    }

    @Override // com.taobao.mediaplay.player.c
    public void setVideoSampleAspectRatio(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.j(i, i2);
        }
    }

    @Override // com.taobao.mediaplay.player.c
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.k(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "onSurfaceTextureSizeChanged width=" + i + ", height=" + i2);
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a(this.mSurfaceHolder, 0, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "onSurfaceTextureDestroyed " + surfaceTexture + ", mEnableStaySurfaceTexture=" + this.mEnableStaySurfaceTexture);
        if (this.mEnableStaySurfaceTexture && Build.VERSION.SDK_INT >= d.H1) {
            z = false;
        }
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.d(this.mSurfaceHolder, z);
        }
        if (Build.VERSION.SDK_INT < d.H1) {
            if (a.b(this.mSurfaceHolder) != null) {
                a.b(this.mSurfaceHolder).release();
            }
            a.c(this.mSurfaceHolder, null);
        }
        return z;
    }

    public MediaTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTag = "MediaTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mPlayToken = "";
        this.mBackground = false;
        init();
    }

    public MediaTextureView(Context context, AttributeSet attributeSet, int i, qbi qbiVar) {
        super(context, attributeSet, i);
        this.mTag = "MediaTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mPlayToken = "";
        this.mBackground = false;
        init();
    }
}
