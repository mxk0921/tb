package com.taobao.avplayer.embed;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.uc.webview.export.media.CommandID;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.asc;
import tb.aub;
import tb.b75;
import tb.ew0;
import tb.feh;
import tb.htb;
import tb.psb;
import tb.qtb;
import tb.r65;
import tb.t2o;
import tb.tmu;
import tb.vu3;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TriverEmbedTBVideoView extends BaseEmbedView implements asc, aub, htb, qtb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ENDED = 4;
    public static final int STATE_LOADING = 3;
    public static final int STATE_PAUSE = 2;
    public static final int STATE_PLAY = 1;
    public static final int STATE_RENDER_START = 5;
    public static final int STATE_STOP = 0;
    public static final String TYPE = "video";

    /* renamed from: a  reason: collision with root package name */
    public s f10170a;
    public String b;
    public WeakReference<Context> c;
    public FrameLayoutResize d;
    public String f;
    public String h;
    public boolean i;
    public DWAspectRatio j;
    public int m;
    public boolean p;
    public boolean q;
    public boolean r;
    public BridgeCallback s;
    public feh w;
    public String e = "";
    public String g = "EmbedCDNVideo";
    public boolean k = true;
    public boolean l = false;
    public int n = 0;
    public int o = 0;
    public final boolean t = true;
    public boolean u = false;
    public HashMap<String, String> v = null;
    public String z = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class FrameLayoutResize extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(451936409);
        }

        public FrameLayoutResize(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(FrameLayoutResize frameLayoutResize, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/TriverEmbedTBVideoView$FrameLayoutResize");
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                TriverEmbedTBVideoView.this.k(i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements IEmbedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TriverEmbedTBVideoView triverEmbedTBVideoView) {
        }

        @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
        public void onResponse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
            } else {
                jSONObject.toString();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements IEmbedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TriverEmbedTBVideoView triverEmbedTBVideoView) {
        }

        @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
        public void onResponse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
            } else {
                AVSDKLog.d("EmbedLiveView", "sendError");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements SendToRenderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IEmbedCallback f10171a;

        public c(TriverEmbedTBVideoView triverEmbedTBVideoView, IEmbedCallback iEmbedCallback) {
            this.f10171a = iEmbedCallback;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
        public void onCallBack(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
                return;
            }
            IEmbedCallback iEmbedCallback = this.f10171a;
            if (iEmbedCallback != null) {
                iEmbedCallback.onResponse(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements SendToRenderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TriverEmbedTBVideoView triverEmbedTBVideoView) {
        }

        @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
        public void onCallBack(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
            } else {
                AVSDKLog.d("TriverVideoView", jSONObject.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TriverEmbedTBVideoView.a(TriverEmbedTBVideoView.this);
            }
        }
    }

    static {
        t2o.a(451936403);
        t2o.a(774897787);
        t2o.a(452985012);
        t2o.a(452985040);
        t2o.a(452985045);
    }

    public static /* synthetic */ void a(TriverEmbedTBVideoView triverEmbedTBVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4490f9", new Object[]{triverEmbedTBVideoView});
        } else {
            triverEmbedTBVideoView.c();
        }
    }

    public static /* synthetic */ Object ipc$super(TriverEmbedTBVideoView triverEmbedTBVideoView, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/TriverEmbedTBVideoView");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e());
        this.p = false;
        j();
    }

    public final boolean d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db295d6e", new Object[]{this, str, jSONObject})).booleanValue();
        }
        try {
            return jSONObject.getBoolean(str).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final double e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4735caed", new Object[]{this, str, jSONObject})).doubleValue();
        }
        try {
            return jSONObject.getDouble(str).doubleValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public final int f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c083064", new Object[]{this, str, jSONObject})).intValue();
        }
        try {
            return jSONObject.getInteger(str).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "video";
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.d == null) {
            this.d = new FrameLayoutResize(this.c.get());
        }
        this.n = i;
        this.o = i2;
        return this.d;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea426875", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.w;
        AVSDKLog.e(fehVar, "TriverEmbedTBVideoView postMessage state=" + i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) Integer.valueOf(i));
        sendEvent("onChangeState", jSONObject, new a(this));
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf104403", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f10170a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(i));
            hashMap.put("height", Integer.valueOf(i2));
            this.f10170a.c("setFrame", hashMap);
        }
    }

    public final void l(BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61134f26", new Object[]{this, bridgeCallback, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, "true");
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("elementid", (Object) this.mViewId);
        EngineUtils.sendToRender(this.mOuterPage.getRender(), RVEvents.NBCOMPONENT_CANRENDER, jSONObject, new d(this));
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        Page page = this.mOuterPage;
        if (page != null) {
            PageContext pageContext = page.getPageContext();
            if (pageContext != null) {
                this.c = new WeakReference<>(pageContext.getActivity());
            }
            this.w = new feh(toString(), "");
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView
    public void onEmbedViewSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6967c1b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            k(i, i2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        i(4);
        AVSDKLog.e(this.w, "TriverEmbedTBVideoView::onMediaComplete");
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else if ((i == 1 && i2 == 0) || (-400 > i && i > -600)) {
            sendError(1008);
        } else if (i == -5 || i == -1094995529 || i == -104 || i == -110 || i == -103) {
            sendError(1005);
        } else {
            sendError(1);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else {
            i(2);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            i(1);
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        int i = this.m;
        if (i > 0) {
            s sVar = this.f10170a;
            if (sVar != null) {
                sVar.y(i * 1000, false);
            }
            this.m = 0;
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        psb psbVar = r65.b;
        if (psbVar == null || !ew0.s(((b75) psbVar).getConfig("DWInteractive", "EmbedTimeUpdateUseSecond", "true"))) {
            jSONObject.put(tmu.CURRENT_TIME, (Object) Integer.valueOf(i));
            jSONObject.put("userPlayDuration", (Object) Integer.valueOf(i));
            jSONObject.put("videoDuration", (Object) Integer.valueOf(i3));
        } else if (!this.u) {
            int i4 = i / 1000;
            jSONObject.put(tmu.CURRENT_TIME, (Object) Integer.valueOf(i4));
            jSONObject.put("userPlayDuration", (Object) Integer.valueOf(i4));
            jSONObject.put("videoDuration", (Object) Integer.valueOf(i3 / 1000));
        } else {
            double d2 = i / 1000.0d;
            jSONObject.put(tmu.CURRENT_TIME, (Object) Double.valueOf(d2));
            jSONObject.put("userPlayDuration", (Object) Double.valueOf(d2));
            jSONObject.put("videoDuration", (Object) Double.valueOf(i3 / 1000.0d));
        }
        sendEvent("onTimeUpdate", jSONObject, null);
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
            sendFullScreenChange(true, true);
        } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
            sendFullScreenChange(false, false);
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        i(5);
        i(1);
    }

    @Override // tb.htb
    public void onMutedChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (jSONObject != null && jSONObject.size() != 0) {
            if (TextUtils.isEmpty(this.b)) {
                h(jSONObject);
            }
            if (TextUtils.isEmpty(this.b) && !"TBVideo".equals(this.g) && (!"YKVideo".equals(this.g) || TextUtils.isEmpty(this.h))) {
                AVSDKLog.e(this.w, "src or videoid is empty");
            } else if (this.f10170a == null) {
                g();
            }
            s sVar = this.f10170a;
            if (!(sVar == null || sVar.o() == null)) {
                this.d.addView(this.f10170a.o(), new FrameLayout.LayoutParams(-1, -1, 17));
            }
            l(bridgeCallback, "success");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        s sVar = this.f10170a;
        if (sVar != null) {
            sVar.u();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        } else if (this.t && (sVar = this.f10170a) != null && sVar.m(1500) == 2) {
            this.f10170a.F();
        }
    }

    public final void sendError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8093fc", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        sendEvent("onError", jSONObject, new b(this));
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put("element", (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            EngineUtils.sendToRender(render, render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render)), str, jSONObject2, new c(this, iEmbedCallback));
        } else {
            throw new IllegalStateException("You should call super.onCreate first!!!");
        }
    }

    public final void sendFullScreenChange(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7398da1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = "vertical";
        if (z2) {
            jSONObject.put("fullScreen", (Object) Boolean.TRUE);
            if (z) {
                str = "horizontal";
            }
            jSONObject.put("direction", (Object) str);
        } else {
            jSONObject.put("direction", (Object) str);
            jSONObject.put("fullScreen", (Object) Boolean.FALSE);
        }
        sendEvent("onFullScreenChange", jSONObject, null);
        if (this.s != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("onFullScreenChange", (Object) jSONObject);
            jSONObject2.put("success", (Object) "true");
            this.s.sendJSONResponse(jSONObject2);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8562a58", new Object[]{this});
            return;
        }
        s sVar = this.f10170a;
        if (sVar != null) {
            if (sVar.m(1503) == 1) {
                View o = this.f10170a.o();
                ViewGroup viewGroup = (ViewGroup) o.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(o);
                }
                this.f10170a.c("toggleScreen", null);
            }
            this.f10170a.c("unRegisterIMediaPlayLifecycleListener", null);
            this.f10170a.h();
            this.f10170a = null;
            i(0);
        }
    }

    public final void g() {
        WeakReference<Context> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5684c666", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.w, "TriverEmbedTBVideoView create mTBPlayerInstance begin.");
        if (this.p || (weakReference = this.c) == null || weakReference.get() == null) {
            feh fehVar = this.w;
            AVSDKLog.e(fehVar, "TriverEmbedTBVideoView create mTBPlayerInstance return by mInit=" + this.p + ", mContextRef=" + this.c);
            return;
        }
        s.d dVar = new s.d();
        dVar.g = (Activity) this.c.get();
        dVar.o = this.e;
        dVar.l = this.b;
        dVar.i = this.k;
        dVar.x = this.n;
        dVar.m = this.h;
        dVar.j = this.g;
        dVar.y = this.o;
        boolean z = this.q;
        dVar.A = z;
        dVar.b0 = this.l;
        DWAspectRatio dWAspectRatio = this.j;
        if (dWAspectRatio != null) {
            dVar.q = dWAspectRatio;
        }
        dVar.W = this.f;
        dVar.r = 2;
        dVar.Q = "triver";
        dVar.n = "triver";
        dVar.t = this;
        dVar.G = this;
        if (z) {
            dVar.I = this;
        }
        if (this.r) {
            dVar.T = true;
        }
        if (!TextUtils.isEmpty(this.z)) {
            dVar.R = this.z;
        }
        s c2 = s.c.c("", dVar);
        this.f10170a = c2;
        feh fehVar2 = this.w;
        if (fehVar2 == null) {
            this.w = new feh(toString(), this.f10170a.e.e());
        } else {
            fehVar2.c(c2.e.e());
        }
        feh fehVar3 = this.w;
        AVSDKLog.e(fehVar3, "TriverEmbedTBVideoView create mTBPlayerInstance finish = " + this.f10170a);
        if (this.i) {
            i(3);
            this.f10170a.F();
        }
        this.p = true;
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.s != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) 0);
            jSONObject2.put("y", (Object) 0);
            jSONObject.put("ptInView", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("onTap", (Object) jSONObject);
            this.s.sendJSONResponse(jSONObject3);
        }
        return false;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (this.s == null) {
                this.s = bridgeCallback;
            }
            if ("play".equals(str)) {
                if (this.f10170a == null) {
                    g();
                }
                this.f10170a.F();
                l(bridgeCallback, "success");
                return;
            }
            if ("pause".equals(str)) {
                s sVar2 = this.f10170a;
                if (sVar2 != null) {
                    sVar2.u();
                }
            } else if ("setup".equals(str)) {
                g();
            } else if ("stop".equals(str)) {
                b();
            } else if (!"changeControllerStatus".equals(str)) {
                if ("mute".equals(str) && jSONObject != null && jSONObject.get("ison") != null) {
                    boolean d2 = d("ison", jSONObject);
                    s sVar3 = this.f10170a;
                    if (sVar3 != null) {
                        sVar3.t(d2);
                    }
                } else if ("seek".equals(str) && jSONObject != null && jSONObject.get("time") != null) {
                    int e2 = (int) (e("time", jSONObject) * 1000.0d);
                    s sVar4 = this.f10170a;
                    if (sVar4 != null) {
                        sVar4.y(e2, false);
                    }
                } else if (CommandID.exitFullScreen.equals(str)) {
                    s sVar5 = this.f10170a;
                    if (sVar5 != null && sVar5.m(1503) == 1) {
                        this.f10170a.c("toggleScreen", null);
                        return;
                    }
                    return;
                } else if ("requestFullScreen".equals(str)) {
                    s sVar6 = this.f10170a;
                    if (sVar6 != null && sVar6.m(1503) != 1) {
                        this.f10170a.c("toggleScreen", null);
                        return;
                    }
                    return;
                } else if (!(!"playbackRate".equals(str) || jSONObject == null || jSONObject.get("rate") == null)) {
                    float floatValue = jSONObject.getFloatValue("rate");
                    if (floatValue <= 2.0f && floatValue >= 0.5f && (sVar = this.f10170a) != null) {
                        sVar.B(2000, floatValue);
                    }
                }
            }
            l(bridgeCallback, "success");
        } catch (Throwable th) {
            feh fehVar = this.w;
            AVSDKLog.e(fehVar, "onReceivedMessage Error = " + th.getMessage());
            th.printStackTrace();
            l(bridgeCallback, "fail");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x0043, B:12:0x0049, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:20:0x0076, B:31:0x0107, B:33:0x010d, B:34:0x0114, B:36:0x011c, B:38:0x0120, B:39:0x013c, B:41:0x0144, B:42:0x0148, B:44:0x0150, B:46:0x0158, B:47:0x015c, B:49:0x0162, B:50:0x0168, B:52:0x016e, B:54:0x0178, B:61:0x018c, B:64:0x0196, B:67:0x01a0, B:77:0x01b4, B:78:0x01b9, B:79:0x01be, B:80:0x01c2, B:82:0x01c8, B:83:0x01ce, B:85:0x01d4, B:86:0x01da, B:88:0x01e0, B:89:0x01e6, B:91:0x01ec, B:92:0x01f2, B:94:0x01f8, B:95:0x0220, B:97:0x0226, B:98:0x022c, B:100:0x0232), top: B:104:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.alibaba.fastjson.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.embed.TriverEmbedTBVideoView.h(com.alibaba.fastjson.JSONObject):void");
    }
}
