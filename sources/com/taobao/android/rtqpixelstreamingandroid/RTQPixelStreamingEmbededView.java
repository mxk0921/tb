package com.taobao.android.rtqpixelstreamingandroid;

import android.content.Context;
import android.graphics.Color;
import android.taobao.windvane.embed.BaseEmbedView;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RTQPixelStreamingEmbededView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RTQPixelStreamingEmbededView";
    public Boolean disableNativeInput;
    public Boolean isSingleMode;
    public LinearLayout mLayout;
    public Boolean videoMuted;
    public String rtq_session_id = "";
    private PixelStreamingSurfaceView mSurfaceView = null;
    private View mForegroundView = null;
    private FrameLayout mFrameLayout = null;
    private SurfaceHolder mSurfaceHolder = null;
    private c mSurfaceHolderVideoSink = null;
    private boolean needRemoveForegroundView = false;
    public boolean showDebugToolButtons = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RTQPixelStreamingEmbededView.access$100(RTQPixelStreamingEmbededView.this).removeView(RTQPixelStreamingEmbededView.access$000(RTQPixelStreamingEmbededView.this));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements SurfaceHolder.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            StringBuilder sb = new StringBuilder("surfaceChanged format=");
            sb.append(i);
            sb.append(", width=");
            sb.append(i2);
            sb.append(", height=");
            sb.append(i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            new StringBuilder("RTQPixelStreamingEmbededView registerSurface sessionId: ").append(RTQPixelStreamingEmbededView.this.rtq_session_id);
            PixelStreamingNativeLib.registerSurface(RTQPixelStreamingEmbededView.this.rtq_session_id, surfaceHolder.getSurface());
            PixelStreamingNativeLib.requestVideoKeyframe(RTQPixelStreamingEmbededView.this.rtq_session_id);
            RTQPixelStreamingEmbededView.access$202(RTQPixelStreamingEmbededView.this, true);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                return;
            }
            if (!(RTQPixelStreamingEmbededView.access$100(RTQPixelStreamingEmbededView.this) == null || RTQPixelStreamingEmbededView.access$000(RTQPixelStreamingEmbededView.this) == null)) {
                try {
                    RTQPixelStreamingEmbededView.access$100(RTQPixelStreamingEmbededView.this).addView(RTQPixelStreamingEmbededView.access$000(RTQPixelStreamingEmbededView.this));
                } catch (Exception unused) {
                }
            }
            PixelStreamingNativeLib.registerSurface(RTQPixelStreamingEmbededView.this.rtq_session_id, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SurfaceHolder f9321a;
        public final String b;

        static {
            t2o.a(316669979);
        }

        public c(SurfaceHolder surfaceHolder, String str) {
            this.f9321a = surfaceHolder;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/RTQPixelStreamingEmbededView$SurfaceHolderVideoSink");
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d357db", new Object[]{this});
                return;
            }
            Surface surface = this.f9321a.getSurface();
            new StringBuilder("setting surface ").append(surface);
            PixelStreamingNativeLib.registerSurface(this.b, surface);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(316669980);
        }
    }

    static {
        t2o.a(316669974);
    }

    public RTQPixelStreamingEmbededView() {
        Boolean bool = Boolean.FALSE;
        this.videoMuted = bool;
        this.disableNativeInput = bool;
        this.isSingleMode = bool;
    }

    public static /* synthetic */ View access$000(RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ec92455e", new Object[]{rTQPixelStreamingEmbededView});
        }
        return rTQPixelStreamingEmbededView.mForegroundView;
    }

    public static /* synthetic */ FrameLayout access$100(RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b714c9c", new Object[]{rTQPixelStreamingEmbededView});
        }
        return rTQPixelStreamingEmbededView.mFrameLayout;
    }

    public static /* synthetic */ boolean access$202(RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb51da38", new Object[]{rTQPixelStreamingEmbededView, new Boolean(z)})).booleanValue();
        }
        rTQPixelStreamingEmbededView.needRemoveForegroundView = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1980158489:
                super.onVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/RTQPixelStreamingEmbededView");
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return "RTQPixelStreaming";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        PixelStreamingJniHelper.onSessionStarted(this.rtq_session_id, this);
        super.onAttachedToWebView();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        PixelStreamingJniHelper.onSessionDestroyed(this.rtq_session_id);
        PixelStreamingNativeLib.destroyStreaming(this.rtq_session_id);
        PixelStreamingPreLoadService.j.e();
        super.onDestroy();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            return;
        }
        PixelStreamingJniHelper.onSessionDestroyed(this.rtq_session_id);
        super.onDetachedFromWebView();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        Object obj = this.params.mObjectParam.get("rtq_session_id");
        if (obj instanceof String) {
            this.rtq_session_id = (String) obj;
        }
        Object obj2 = this.params.mObjectParam.get("muted");
        if (obj2 instanceof String) {
            this.videoMuted = Boolean.valueOf(Boolean.parseBoolean((String) obj2));
        }
        Object obj3 = this.params.mObjectParam.get("disable_native_input");
        if (obj3 instanceof String) {
            this.disableNativeInput = Boolean.valueOf(Boolean.parseBoolean((String) obj3));
        }
        boolean z = this.params.mObjectParam.get("rtq_connection_string") instanceof String;
        Object obj4 = this.params.mObjectParam.get("disable_audio_receive");
        if (obj4 instanceof String) {
            Boolean.parseBoolean((String) obj4);
        }
        PixelStreamingSurfaceView pixelStreamingSurfaceView = this.mSurfaceView;
        if (pixelStreamingSurfaceView != null) {
            pixelStreamingSurfaceView.mSessionIdentifier = this.rtq_session_id;
        }
        new StringBuilder("RTQPixelStreamingEmbededView onParamChanged sessionId: ").append(this.rtq_session_id);
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        PixelStreamingNativeLib.onViewPaused(this.rtq_session_id);
        super.onPause();
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        PixelStreamingJniHelper.onSessionStarted(this.rtq_session_id, this);
        PixelStreamingNativeLib.requestVideoKeyframe(this.rtq_session_id);
        PixelStreamingNativeLib.onViewResumed(this.rtq_session_id);
        super.onResume();
    }

    public void onVideoFrameCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75c05dd", new Object[]{this});
        } else if (this.needRemoveForegroundView) {
            this.needRemoveForegroundView = false;
            FrameLayout frameLayout = this.mFrameLayout;
            if (frameLayout != null) {
                frameLayout.postDelayed(new a(), 1L);
            }
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
        } else {
            super.onVisibilityChanged(i);
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        Object obj = this.params.mObjectParam.get("rtq_session_id");
        if (obj instanceof String) {
            this.rtq_session_id = (String) obj;
        }
        Object obj2 = this.params.mObjectParam.get("muted");
        if (obj2 instanceof String) {
            this.videoMuted = Boolean.valueOf(Boolean.parseBoolean((String) obj2));
        }
        Object obj3 = this.params.mObjectParam.get("disable_native_input");
        if (obj3 instanceof String) {
            this.disableNativeInput = Boolean.valueOf(Boolean.parseBoolean((String) obj3));
        }
        boolean z = this.params.mObjectParam.get("rtq_connection_string") instanceof String;
        Object obj4 = this.params.mObjectParam.get("disable_audio_receive");
        if (obj4 instanceof String) {
            Boolean.parseBoolean((String) obj4);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mLayout = linearLayout;
        linearLayout.setOrientation(1);
        View view = new View(context);
        this.mForegroundView = view;
        view.setBackgroundColor(Color.rgb(219, 226, 245));
        this.mFrameLayout = new FrameLayout(context);
        PixelStreamingSurfaceView pixelStreamingSurfaceView = new PixelStreamingSurfaceView(context);
        this.mSurfaceView = pixelStreamingSurfaceView;
        pixelStreamingSurfaceView.mSessionIdentifier = this.rtq_session_id;
        pixelStreamingSurfaceView.disabledNativeInput = this.disableNativeInput.booleanValue();
        SurfaceHolder holder = this.mSurfaceView.getHolder();
        this.mSurfaceHolder = holder;
        holder.addCallback(new b());
        c cVar = new c(this.mSurfaceHolder, this.rtq_session_id);
        this.mSurfaceHolderVideoSink = cVar;
        cVar.a();
        this.mLayout.addView(this.mFrameLayout);
        this.mFrameLayout.addView(this.mSurfaceView);
        this.mFrameLayout.addView(this.mForegroundView);
        this.needRemoveForegroundView = true;
        this.mLayout.setBackgroundColor(Color.rgb(219, 226, 245));
        return this.mLayout;
    }
}
