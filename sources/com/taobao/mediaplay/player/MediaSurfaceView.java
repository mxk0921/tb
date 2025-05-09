package com.taobao.mediaplay.player;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DoubleReflectionUtils;
import com.taobao.mediaplay.player.c;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.ew0;
import tb.feh;
import tb.ihi;
import tb.ja1;
import tb.jhi;
import tb.qbi;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaSurfaceView extends SurfaceView implements c, SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int aspectRatioHeight;
    private int aspectRatioWidth;
    private boolean mBackground;
    private volatile Object mBackgroundControl;
    private c.a mCallback;
    private boolean mIsAvailable;
    private feh mLogContext;
    private qbi mMeasureHelper;
    private String mPlayToken;
    private volatile Object mSurfaceControl;
    private final Object mSurfaceControlLock;
    private volatile boolean mSurfaceDestroyed;
    private a mSurfaceHolder;
    private String mTag;
    private ScaleType scaleType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum ScaleType {
        FIT_CENTER,
        CENTER_CROP,
        FIT_XY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ScaleType scaleType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/player/MediaSurfaceView$ScaleType");
        }

        public static ScaleType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScaleType) ipChange.ipc$dispatch("3fd9dc5a", new Object[]{str});
            }
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MediaSurfaceView f11023a;
        public boolean b;
        public final SurfaceHolder c;

        static {
            t2o.a(774897798);
            t2o.a(774897791);
        }

        public a(MediaSurfaceView mediaSurfaceView, SurfaceHolder surfaceHolder) {
            this.f11023a = mediaSurfaceView;
            this.c = surfaceHolder;
            feh logContext = mediaSurfaceView.getLogContext();
            AVSDKLog.e(logContext, "InternalSurfaceHolder created, mSurfaceHolder=" + surfaceHolder + ", surface=" + surfaceHolder.getSurface());
        }

        @Override // com.taobao.mediaplay.player.c.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61c8e096", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer != null) {
                feh logContext = this.f11023a.getLogContext();
                AVSDKLog.e(logContext, iMediaPlayer + " bindToMediaPlayer mSurfaceHolder=" + this.c + ", surface=" + this.c.getSurface());
                iMediaPlayer.setDisplay(this.c);
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        @Override // com.taobao.mediaplay.player.c.b
        public c getRenderView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b45a4273", new Object[]{this});
            }
            return this.f11023a;
        }

        @Override // com.taobao.mediaplay.player.c.b
        public Surface getSurface() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
            }
            feh logContext = this.f11023a.getLogContext();
            AVSDKLog.e(logContext, "getSurface mSurfaceHolder=" + this.c + ", surface=" + this.c.getSurface());
            SurfaceHolder surfaceHolder = this.c;
            if (surfaceHolder != null) {
                return surfaceHolder.getSurface();
            }
            return null;
        }

        @Override // com.taobao.mediaplay.player.c.b
        public boolean isBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
            }
            return this.b;
        }
    }

    static {
        t2o.a(774897797);
        t2o.a(774897789);
    }

    public MediaSurfaceView(Context context, String str) {
        super(context);
        this.mTag = "MediaSurfaceView";
        this.mSurfaceControl = null;
        this.mBackgroundControl = null;
        this.mSurfaceControlLock = new Object();
        this.mSurfaceDestroyed = false;
        this.scaleType = ScaleType.FIT_CENTER;
        this.mBackground = false;
        this.mPlayToken = str;
        init();
    }

    private void initSurfaceControl() {
        SurfaceControl surfaceControl;
        int i = Build.VERSION.SDK_INT;
        if (i == 29 || i == 28) {
            synchronized (this.mSurfaceControlLock) {
                try {
                    Field privateField = DoubleReflectionUtils.getPrivateField(SurfaceView.class, "mBackgroundControl");
                    privateField.setAccessible(true);
                    this.mBackgroundControl = privateField.get(this);
                } catch (Exception e) {
                    feh fehVar = this.mLogContext;
                    AVSDKLog.e(fehVar, "os_version=" + Build.VERSION.SDK_INT + " try to get mBackgroundControl with reflect failed!!" + e + "," + ew0.k(e));
                }
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 == 29) {
                        surfaceControl = getSurfaceControl();
                        this.mSurfaceControl = surfaceControl;
                    } else if (i2 == 28) {
                        Field privateField2 = DoubleReflectionUtils.getPrivateField(SurfaceView.class, "mSurfaceControl");
                        privateField2.setAccessible(true);
                        this.mSurfaceControl = privateField2.get(this);
                    }
                } catch (Exception e2) {
                    feh fehVar2 = this.mLogContext;
                    AVSDKLog.e(fehVar2, "os_version=" + Build.VERSION.SDK_INT + " try to get mSurfaceControl with reflect failed!!" + e2 + "," + ew0.k(e2));
                }
                feh fehVar3 = this.mLogContext;
                AVSDKLog.e(fehVar3, "os_version=" + Build.VERSION.SDK_INT + " MediaSurfaceView initSurfaceControl=" + this.mSurfaceControl + ",mBackgroundControl=" + this.mBackgroundControl);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MediaSurfaceView mediaSurfaceView, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/player/MediaSurfaceView");
        }
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

    public feh getLogContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("62d1ffc3", new Object[]{this});
        }
        return this.mLogContext;
    }

    public boolean getSurfaceDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("776826ed", new Object[]{this})).booleanValue();
        }
        return this.mSurfaceDestroyed;
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
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "SeamlessSwitch MediaTextureView init holder: " + this.mSurfaceHolder);
        getHolder().setFormat(-2);
        getHolder().addCallback(this);
    }

    @Override // com.taobao.mediaplay.player.c
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return this.mIsAvailable;
    }

    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.mBackground;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        AVSDKLog.e(this.mLogContext, " onAttachedToWindow ");
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onAttachedToWindow();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MediaSurfaceView catch onWindowVisibilityChanged error:" + e.toString());
        }
        AVSDKLog.e(this.mLogContext, " onDetachedFromWindow ");
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!ja1.K0 || this.scaleType != ScaleType.FIT_CENTER) {
            qbi qbiVar = this.mMeasureHelper;
            if (qbiVar != null) {
                qbiVar.a(i, i2);
                setMeasuredDimension(this.mMeasureHelper.e(), this.mMeasureHelper.d());
            }
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.aspectRatioWidth;
            if (i4 == 0 || (i3 = this.aspectRatioHeight) == 0) {
                setMeasuredDimension(size, size2);
                return;
            }
            if (size * i3 > size2 * i4) {
                size = (i4 * size2) / i3;
            } else {
                size2 = (i3 * size) / i4;
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.onWindowVisibilityChanged(i);
        } catch (Exception e) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MediaSurfaceView catch onWindowVisibilityChanged error:" + e.toString());
        }
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, " onWindowVisibilityChanged " + i);
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onWindowVisibilityChanged(i);
        }
    }

    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        }
    }

    public void releaseSurfaceControl() {
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            synchronized (this.mSurfaceControlLock) {
                try {
                    if (ihi.a(this.mSurfaceControl)) {
                        feh fehVar = this.mLogContext;
                        AVSDKLog.e(fehVar, "os_version=29 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                        jhi.a(this.mSurfaceControl).release();
                        this.mSurfaceControl = null;
                    }
                    if (ihi.a(this.mBackgroundControl)) {
                        feh fehVar2 = this.mLogContext;
                        AVSDKLog.e(fehVar2, "os_version=29 MediaSurfaceView release mBackgroundControl=" + this.mBackgroundControl);
                        jhi.a(this.mBackgroundControl).release();
                        this.mBackgroundControl = null;
                    }
                    AVSDKLog.e(this.mLogContext, "os_version=29 MediaSurfaceView releaseSurfaceControl finished.");
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 28) {
            synchronized (this.mSurfaceControlLock) {
                try {
                    feh fehVar3 = this.mLogContext;
                    AVSDKLog.e(fehVar3, "os_version=28 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                    Method declaredMethod = this.mSurfaceControl.getClass().getDeclaredMethod("release", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.mSurfaceControl, new Object[0]);
                    feh fehVar4 = this.mLogContext;
                    AVSDKLog.e(fehVar4, "os_version=28 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                    Method declaredMethod2 = this.mBackgroundControl.getClass().getDeclaredMethod("release", new Class[0]);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(this.mBackgroundControl, new Object[0]);
                    AVSDKLog.e(this.mLogContext, "os_version=28 MediaSurfaceView releaseSurfaceControl finished.");
                } catch (Exception e) {
                    feh fehVar5 = this.mLogContext;
                    AVSDKLog.e(fehVar5, "os_version=" + Build.VERSION.SDK_INT + " try to call release with reflect failed!!" + e + "," + ew0.k(e));
                }
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
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MediaSurfaceView setAspectRatio aspectRatio=" + i);
        this.mMeasureHelper.f(i);
        if (ja1.K0) {
            setScaleType(i);
        }
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
            aVar.b(z);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.scaleType = ScaleType.FIT_CENTER;
        } else if (i == 1) {
            this.scaleType = ScaleType.CENTER_CROP;
        } else if (i == 3) {
            this.scaleType = ScaleType.FIT_XY;
        }
    }

    public void setUseCrop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20df4e58", new Object[]{this, new Boolean(z)});
        } else {
            this.mMeasureHelper.h(z);
        }
    }

    @Override // com.taobao.mediaplay.player.c
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
        }
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
            if (this.scaleType != ScaleType.CENTER_CROP && ja1.K0) {
                updateAspectRatioParams(i, i2);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        c.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, " surfaceChanged holder=" + surfaceHolder + ", format=" + i + ", width=" + i2 + ", height=" + i3 + ", mSurfaceHolder=" + this.mSurfaceHolder + ", mCallback=" + this.mCallback);
        a aVar2 = this.mSurfaceHolder;
        if (aVar2 != null && (aVar = this.mCallback) != null) {
            aVar.a(aVar2, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, " surfaceCreated holder=" + surfaceHolder + ", surface=" + surfaceHolder.getSurface() + ", mCallback=" + this.mCallback);
        this.mIsAvailable = true;
        this.mSurfaceHolder = new a(this, surfaceHolder);
        initSurfaceControl();
        c.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.c(this.mSurfaceHolder, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, " surfaceDestroyed 111 holder=" + surfaceHolder + ", mSurfaceHolder=, mCallback=" + this.mCallback);
        if (this.mSurfaceHolder != null) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, " surfaceDestroyed 222 holder=" + surfaceHolder + ", surface=" + surfaceHolder.getSurface());
            c.a aVar = this.mCallback;
            if (aVar != null) {
                aVar.d(this.mSurfaceHolder, true);
                this.mSurfaceHolder = null;
            }
            this.mSurfaceDestroyed = true;
        }
    }

    public void updateAspectRatioParams(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b93b57", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        } else {
            this.aspectRatioWidth = i;
            this.aspectRatioHeight = i2;
        }
    }

    public MediaSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTag = "MediaSurfaceView";
        this.mSurfaceControl = null;
        this.mBackgroundControl = null;
        this.mSurfaceControlLock = new Object();
        this.mSurfaceDestroyed = false;
        this.scaleType = ScaleType.FIT_CENTER;
        this.mPlayToken = "";
        this.mBackground = false;
        init();
    }
}
