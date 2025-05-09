package com.taobao.taobaoavsdk.widget.media;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.a;
import tb.qbi;
import tb.t2o;
import tb.tfb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SurfaceRenderView extends SurfaceView implements com.taobao.taobaoavsdk.widget.media.a, SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = SurfaceRenderView.class.getSimpleName();
    private a.AbstractC0740a mCallback;
    private qbi mMeasureHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SurfaceRenderView f12973a;
        public final SurfaceHolder b;

        static {
            t2o.a(774897970);
            t2o.a(774897967);
        }

        public a(SurfaceRenderView surfaceRenderView, SurfaceHolder surfaceHolder) {
            this.f12973a = surfaceRenderView;
            this.b = surfaceHolder;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61c8e096", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer != null) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " bindToMediaPlayer " + iMediaPlayer + ", " + this.f12973a);
                iMediaPlayer.setDisplay(this.b);
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public com.taobao.taobaoavsdk.widget.media.a getRenderView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("12305290", new Object[]{this});
            }
            return this.f12973a;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public Surface getSurface() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
            }
            return null;
        }
    }

    static {
        t2o.a(774897969);
        t2o.a(774897965);
    }

    public SurfaceRenderView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mMeasureHelper = new qbi("");
        getHolder().addCallback(this);
    }

    public static /* synthetic */ Object ipc$super(SurfaceRenderView surfaceRenderView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/widget/media/SurfaceRenderView");
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void addRenderCallback(a.AbstractC0740a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672fa3e5", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mMeasureHelper.a(i, i2);
        setMeasuredDimension(this.mMeasureHelper.e(), this.mMeasureHelper.d());
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void removeRenderCallback(a.AbstractC0740a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f887322", new Object[]{this, aVar});
        } else {
            this.mCallback = null;
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.f(i);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " setAspectRatio " + i);
        requestLayout();
    }

    public void setUseCrop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20df4e58", new Object[]{this, new Boolean(z)});
        } else {
            this.mMeasureHelper.h(z);
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.i(i);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " setVideoRotation " + i);
        setRotation((float) i);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSampleAspectRatio(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.j(i, i2);
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " setVideoSampleAspectRatio ");
            requestLayout();
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.k(i, i2);
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " setVideoSize ");
            requestLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " surfaceChanged holder=" + surfaceHolder + ", format=" + i + ", width=" + i2 + ", height=" + i3);
        a aVar = new a(this, surfaceHolder);
        a.AbstractC0740a aVar2 = this.mCallback;
        if (aVar2 != null) {
            aVar2.b(aVar, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " surfaceCreated");
        a aVar = new a(this, surfaceHolder);
        a.AbstractC0740a aVar2 = this.mCallback;
        if (aVar2 != null) {
            aVar2.a(aVar, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " surfaceDestroyed");
        a aVar = new a(this, surfaceHolder);
        a.AbstractC0740a aVar2 = this.mCallback;
        if (aVar2 != null) {
            aVar2.c(aVar, true);
        }
    }
}
