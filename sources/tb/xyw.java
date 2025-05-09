package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView;
import com.taobao.android.fluid.framework.card.cards.web.WebPenetrateFrameLayout;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.layoutmanager.container.ScrollConflictWebView;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import java.util.HashMap;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xyw extends uq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "游戏卡";
    private static final String V = "[webcomponent]";
    private static final String W = "https://gw.alicdn.com/imgextra/i3/O1CN01FtdfNs1JCNnU4LdOh_!!6000000000992-54-tps-390-86.apng";
    private static final int X = 0;
    private static final int Y = 0;
    private static boolean Z;
    private WebPenetrateFrameLayout A;
    private FscrmidFavorFrameLayout B;
    private FrameLayout C;
    private FrameLayout D;
    private TUrlImageView E;
    private ImageView F;
    private FrameLayout.LayoutParams G;
    private ImageStrategyConfig H;
    private ViewGroup I;
    private ImageView J;
    private WVUCWebView K;
    private TBVideoErrorView L;
    private int M;
    private int N;
    private String O;
    private boolean P;
    private Handler Q;
    private azw R;
    private a.f S;
    private Handler T;
    private dzw U;
    private final czw z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                xyw.this.f1();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements yhb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.yhb
        public void onBackClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
            } else {
                xyw.w0(xyw.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ece {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31723a = false;
        public boolean b = false;

        public c() {
        }

        @Override // tb.ece
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            ir9.b(xyw.V, "hasSendAppear:" + this.f31723a + ",webViewLoadFailed:" + this.b + ",webView onFinish url: " + str);
            if (!this.f31723a && !this.b) {
                xyw.x0(xyw.this, 2, true, "");
                xyw.E0(xyw.this);
                xyw.F0(xyw.this);
                this.f31723a = true;
            }
        }

        @Override // tb.ece
        public void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("197e2a71", new Object[]{this, renderProcessGoneDetail});
                return;
            }
            ir9.b(xyw.V, "webViewWebContentProcessDidTerminate,didCrash:" + renderProcessGoneDetail.didCrash());
            if (renderProcessGoneDetail.didCrash()) {
                ezw.b(xyw.L0(xyw.this), "webterminate");
                xyw.y0(xyw.this, 0);
                xyw.z0(xyw.this, 0);
                xyw.this.f1();
                xyw.F0(xyw.this);
                xyw.this.l1();
            }
        }

        @Override // tb.ece
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            ir9.b(xyw.V, "webView onFailed error: " + str);
            this.b = true;
            xyw.G0(xyw.this, false);
            if (zyw.a(xyw.H0(xyw.this))) {
                xyw.x0(xyw.this, 3, true, str);
                xyw.I0(xyw.this, true);
                xyw.J0(xyw.this);
                xyw.K0(xyw.this, true);
            }
        }

        @Override // tb.ece
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            ir9.b(xyw.V, "webView onStart url: " + str);
            this.b = false;
            this.f31723a = false;
            xyw.x0(xyw.this, 1, true, "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebCard$4");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                xyw.A0(xyw.this, message.what);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebCard$5");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                xyw.B0(xyw.this, message.what);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends yyw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebCard$6");
        }

        @Override // tb.yyw
        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("292f7ef0", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                xyw.this.V0(f, f2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f31727a;

        public g(boolean z) {
            this.f31727a = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                xyw.C0(xyw.this, this.f31727a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h extends atw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f31728a;
        public View b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ir9.b(xyw.V, "loadErrorPage，webView为null 直接调用webView load的方法");
                xyw.C0(xyw.this, true);
            }
        }

        static {
            t2o.a(468714113);
        }

        public h(Context context, WVUCWebView wVUCWebView) {
            super(context, wVUCWebView);
            this.f31728a = context;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebCard$CustomErrorUIModel");
        }

        @Override // tb.atw
        public void loadErrorPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            } else {
                loadErrorPage("ANDROID_SYS_NETWORK_ERROR");
            }
        }

        public void loadErrorPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37044242", new Object[]{this, str});
            } else if (this.b == null && (xpw.a(this.f31728a) instanceof Activity)) {
                ir9.b(xyw.V, "loadErrorPage 初始化错误页," + str);
                TBVideoErrorView tBVideoErrorView = new TBVideoErrorView(xyw.D0(xyw.this));
                this.b = tBVideoErrorView;
                tBVideoErrorView.setBackgroundColor(-16777216);
                ((TBVideoErrorView) this.b).setErrorAction(new a());
                setErrorView(this.b);
            }
        }
    }

    static {
        t2o.a(468714105);
        t2o.a(468713610);
    }

    public xyw(FluidContext fluidContext) {
        super(fluidContext);
        this.z = new czw(fluidContext, this);
    }

    public static /* synthetic */ void A0(xyw xywVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc64271", new Object[]{xywVar, new Integer(i)});
        } else {
            xywVar.O0(i);
        }
    }

    private void A1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d908743b", new Object[]{this, new Boolean(z)});
        } else if (Y0()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", "page");
            if (z) {
                z1("appear", jSONObject);
                if (h0()) {
                    z1("active", jSONObject);
                    return;
                }
                return;
            }
            if (h0()) {
                z1("disactive", jSONObject);
            }
            z1("disappear", jSONObject);
        }
    }

    public static /* synthetic */ void B0(xyw xywVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f887be32", new Object[]{xywVar, new Integer(i)});
        } else {
            xywVar.r1(i);
        }
    }

    public static /* synthetic */ void C0(xyw xywVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44979c4", new Object[]{xywVar, new Boolean(z)});
        } else {
            xywVar.P0(z);
        }
    }

    private void C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2524f9c0", new Object[]{this});
            return;
        }
        WebPenetrateFrameLayout webPenetrateFrameLayout = this.A;
        if (webPenetrateFrameLayout != null) {
            webPenetrateFrameLayout.disableTouch(false);
            this.A.setWebCardClickListener(new f());
        }
    }

    public static /* synthetic */ Context D0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("68aba527", new Object[]{xywVar});
        }
        return xywVar.o;
    }

    private void D1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824f0f1f", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(V, "setWebGameStateChange state:" + i);
        this.N = i;
    }

    public static /* synthetic */ void E0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0464161", new Object[]{xywVar});
        } else {
            xywVar.E1();
        }
    }

    private void E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd522bf", new Object[]{this});
            return;
        }
        azw azwVar = this.R;
        if (azwVar != null) {
            azwVar.w(Y0());
        }
    }

    public static /* synthetic */ void F0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75c980", new Object[]{xywVar});
        } else {
            xywVar.N0();
        }
    }

    public static /* synthetic */ void G0(xyw xywVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20059515", new Object[]{xywVar, new Boolean(z)});
        } else {
            xywVar.B1(z);
        }
    }

    private void G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (zyw.c()) {
            this.p.setKeepScreenOn(true);
        }
    }

    public static /* synthetic */ boolean H0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded4d9c2", new Object[]{xywVar})).booleanValue();
        }
        return xywVar.X0();
    }

    public static /* synthetic */ void I0(xyw xywVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7888c97", new Object[]{xywVar, new Boolean(z)});
        } else {
            xywVar.F1(z);
        }
    }

    public static /* synthetic */ void J0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b333e9fc", new Object[]{xywVar});
        } else {
            xywVar.hideLoading();
        }
    }

    public static /* synthetic */ void K0(xyw xywVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0b8419", new Object[]{xywVar, new Boolean(z)});
        } else {
            xywVar.I1(z);
        }
    }

    public static /* synthetic */ dzw L0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzw) ipChange.ipc$dispatch("6d0de8d3", new Object[]{xywVar});
        }
        return xywVar.U;
    }

    private String M0() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4234cee", new Object[]{this});
        }
        a.f fVar = this.S;
        if (fVar == null) {
            return "";
        }
        String e2 = fVar.e("url");
        String n = zyw.n();
        ir9.b(V, "buildUrlAndInitWebTrackInfo，游戏卡片数据：\n,serverUrl:" + e2 + "\n orangeUrl:" + n);
        String str3 = (TextUtils.isEmpty(n) || TextUtils.equals("null", n)) ? e2 : n;
        if (TextUtils.isEmpty(str3)) {
            ir9.b(V, "reload url为null return");
            return "";
        }
        String tabId = this.f29555a.getInstanceConfig().getTabId();
        if (f() != null) {
            str2 = String.valueOf(A());
            str = String.valueOf(T().f());
        } else {
            str2 = null;
            str = null;
        }
        String str4 = sj4.GAME_SPM + str;
        ir9.b(V, "buildUrlAndInitWebTrackInfo,spm:" + str4);
        JSONObject jSONObject = new JSONObject();
        String a2 = this.S.a();
        jSONObject.put("id", (Object) a2);
        jSONObject.put("tabid", (Object) tabId);
        jSONObject.put("sessionid", (Object) b0());
        jSONObject.put(Constants.Weex.INSTANCEID, (Object) str2);
        jSONObject.put("index", (Object) str);
        jSONObject.put("version", (Object) String.valueOf(31));
        jSONObject.put(Component.KEY_PAGE_NAME, (Object) "Page_videointeract");
        String encode = Uri.encode(jSONObject.toJSONString());
        StringBuilder sb = new StringBuilder(str3);
        if (str3.contains("?")) {
            sb.append("&x-tab2=");
            sb.append(encode);
        } else {
            sb.append("?x-tab2=");
            sb.append(encode);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&spm=");
            sb.append(str4);
        }
        String sb2 = sb.toString();
        ir9.b(V, "buildUrlAndInitWebTrackInfo，游戏卡片数据：" + this.S.d() + ",url:" + sb2 + "\n,serverUrl:" + e2 + "\n orangeUrl:" + n);
        dzw dzwVar = new dzw();
        this.U = dzwVar;
        dzwVar.c(tabId, b0(), str2, str, a2, sb2);
        return sb2;
    }

    private void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960957bc", new Object[]{this});
            return;
        }
        try {
            TBVideoErrorView tBVideoErrorView = this.L;
            if (!(tBVideoErrorView == null || tBVideoErrorView.getParent() == null)) {
                ir9.b(V, "关闭错误页");
                ((ViewGroup) this.L.getParent()).removeView(this.L);
                this.L = null;
            }
            this.D.setVisibility(8);
        } catch (Throwable th) {
            ir9.c(V, "", th);
        }
    }

    private void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a93a2e0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            WVUCWebView wVUCWebView = this.K;
            if (wVUCWebView != null) {
                wVUCWebView.destroy();
                if (zyw.d() && this.K.getParent() != null) {
                    ir9.b(V, "移除webview");
                    ((ViewGroup) this.K.getParent()).removeView(this.K);
                }
                this.K = null;
            }
            WVUCWebView T0 = T0(this.o);
            this.K = T0;
            this.A.addView(T0, this.G);
            v1();
        } else {
            if (this.K == null) {
                WVUCWebView T02 = T0(this.o);
                this.K = T02;
                this.A.addView(T02, this.G);
            }
            v1();
        }
    }

    private WVUCWebView T0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("cb941d9a", new Object[]{this, context});
        }
        ScrollConflictWebView scrollConflictWebView = new ScrollConflictWebView(context);
        scrollConflictWebView.setTag(R.id.fluid_sdk_fluid_intance, this.f29555a);
        scrollConflictWebView.setBackgroundColor(0);
        scrollConflictWebView.setTag(this);
        ygl yglVar = new ygl(context);
        yglVar.a(new c());
        scrollConflictWebView.setWebViewClient(yglVar);
        return scrollConflictWebView;
    }

    private boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983864e8", new Object[]{this})).booleanValue();
        }
        TBVideoErrorView tBVideoErrorView = this.L;
        if (tBVideoErrorView == null || tBVideoErrorView.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    private boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cd78fa", new Object[]{this})).booleanValue();
        }
        if (this.N == 2) {
            return true;
        }
        return false;
    }

    public static boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("162b1f41", new Object[0])).booleanValue();
        }
        return Z;
    }

    private void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df3f098", new Object[]{this});
        } else if (this.T != null) {
            ir9.b(V, "onCancelDelayDestroyMsg 取消延迟销毁");
            this.T.removeCallbacksAndMessages(null);
        }
    }

    private void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827fa0d5", new Object[]{this});
        } else if (zyw.j() && this.Q != null) {
            ir9.b(V, "onCancelWaitTimeoutMsg 取消超时下翻计时");
            this.Q.removeCallbacksAndMessages(null);
        }
    }

    private void e1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca09a31", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.T == null) {
            this.T = new d(Looper.getMainLooper());
        }
        if (!this.T.hasMessages(i)) {
            ir9.b(V, "onDelayDestroyTimeout 延迟销毁");
            this.T.sendEmptyMessageDelayed(i, zyw.i() * 1000);
        }
    }

    private void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        ir9.b(V, "hideLoading");
        fx0.b(this.C, 200);
    }

    public static /* synthetic */ Object ipc$super(xyw xywVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1836003525:
                super.onWillDisActive((uq9) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1249298707:
                super.onDisActive((uq9) objArr[0]);
                return null;
            case -372824644:
                super.onDisAppear((uq9) objArr[0]);
                return null;
            case -228339441:
                super.onWillActive((uq9) objArr[0]);
                return null;
            case -147728739:
                super.onActive((uq9) objArr[0]);
                return null;
            case 610311722:
                super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 715537612:
                super.onRecycle((uq9) objArr[0]);
                return null;
            case 728745324:
                super.onAppear((uq9) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2063982600:
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/WebCard");
        }
    }

    private void q1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1078af", new Object[]{this, new Integer(i)});
        } else if (zyw.j()) {
            if (this.Q == null) {
                this.Q = new e(Looper.getMainLooper());
            }
            if (!this.Q.hasMessages(i) && W0()) {
                this.Q.sendEmptyMessageDelayed(i, zyw.h() * 1000);
            }
        }
    }

    private void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (zyw.c()) {
            this.p.setKeepScreenOn(false);
        }
    }

    private void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0ed94e", new Object[]{this});
            return;
        }
        ir9.b(V, "播放下一坑数据");
        ((IFeedsListService) this.f29555a.getService(IFeedsListService.class)).publicNextVideo();
    }

    public static /* synthetic */ boolean w0(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe73127", new Object[]{xywVar})).booleanValue();
        }
        return xywVar.a1();
    }

    public static /* synthetic */ void x0(xyw xywVar, int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf803fd", new Object[]{xywVar, new Integer(i), new Boolean(z), str});
        } else {
            xywVar.H1(i, z, str);
        }
    }

    private void x1(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a87ce7c", new Object[]{this, new Boolean(z)});
        } else if (Y0()) {
            if (z) {
                str = "appear";
            } else {
                str = "disappear";
            }
            z1(str, null);
        } else {
            ir9.b(V, "webView为load结束sendToWebCardAppearMessage,isAppear:" + z);
        }
    }

    public static /* synthetic */ int y0(xyw xywVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c23ae4", new Object[]{xywVar, new Integer(i)})).intValue();
        }
        xywVar.M = i;
        return i;
    }

    private void y1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5a10a7", new Object[]{this, str});
        } else if (this.K != null) {
            try {
                ir9.b(V, "发送给Web，sendToWebMessage eventName: onVideoMessage eventData: " + str);
                WVStandardEventCenter.postNotificationToJS(this.K, "onVideoMessage", str);
            } catch (Exception e2) {
                ir9.b(V, "postNotificationToJS Exception: " + e2.getMessage());
            }
        }
    }

    public static /* synthetic */ int z0(xyw xywVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc83b6a5", new Object[]{xywVar, new Integer(i)})).intValue();
        }
        xywVar.N = i;
        return i;
    }

    @Override // tb.ulb
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a3ace76", new Object[]{this})).intValue();
        }
        return R.layout.fluid_sdk_ly_web_card;
    }

    @Override // tb.ulb
    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5435485a", new Object[]{this})).intValue();
        }
        return 5;
    }

    @Override // tb.uq9
    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        a.f fVar = this.S;
        if (fVar == null) {
            return "";
        }
        return fVar.a();
    }

    public String Q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0316222", new Object[]{this, str});
        }
        return "game_" + str;
    }

    @Override // tb.uq9
    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f5131d", new Object[]{this});
        }
        return null;
    }

    public dzw U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzw) ipChange.ipc$dispatch("71b3155c", new Object[]{this});
        }
        return this.U;
    }

    public void V0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21ccdd7", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (this.A != null && X0() && ((ILifecycleService) this.f29555a.getService(ILifecycleService.class)).getConfig().b()) {
            this.A.setChildTrusteeshipTouchRect(null);
            i1(f2, f3);
        }
    }

    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdba6d69", new Object[]{this})).booleanValue();
        }
        if (this.N > 0) {
            return true;
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        }
    }

    public uq9 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("a24b222", new Object[]{this});
        }
        return this;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
        }
    }

    public void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        ezw.b(this.U, "pagedisappear");
        f1();
        ezw.a(this.U);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5658d4", new Object[]{this});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474d741c", new Object[]{this});
        }
    }

    public void k(int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51aced8", new Object[]{this, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf5fbec", new Object[]{this, new Boolean(z)});
        }
    }

    public void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
            return;
        }
        this.C.setVisibility(0);
        fx0.a(this.C, 0);
        this.E.setStrategyConfig(this.H);
        this.E.setImageUrl(this.S.e("cover"));
        String e2 = this.S.e("loadingUrl");
        if (!TextUtils.isEmpty(e2)) {
            this.F.setVisibility(0);
            FluidSDK.getImageAdapter().load(e2, this.F);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa940ea", new Object[]{this});
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21f51eb", new Object[]{this});
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        super.onActive(uq9Var);
        if (this.t) {
            if (Y0()) {
                z1("active", null);
            }
            ezw.b(this.U, "active");
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        super.onAppear(uq9Var);
        if (this.t) {
            this.f.R().x(false);
            x1(true);
            ezw.b(this.U, "appear");
            if (this.S != null) {
                if (this.K == null) {
                    WVUCWebView T0 = T0(this.o);
                    this.K = T0;
                    this.A.addView(T0, this.G);
                    v1();
                } else if (!zyw.m()) {
                    v1();
                }
                if (!X0()) {
                    q1(0);
                }
                b1();
            }
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        super.onBindData(uq9Var, aVar, i);
        if (this.t) {
            this.S = aVar.e().L();
            ir9.b(V, "bindData");
            this.O = M0();
            ezw.b(this.U, "databind");
            if (zyw.m()) {
                v1();
            }
            l1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        ir9.b(V, "WebComponentsController初始化");
        FscrmidFavorFrameLayout fscrmidFavorFrameLayout = (FscrmidFavorFrameLayout) this.p.findViewById(R.id.card_root_layout);
        this.B = fscrmidFavorFrameLayout;
        fscrmidFavorFrameLayout.setCanPullInterceptHorizontal(false);
        WebPenetrateFrameLayout webPenetrateFrameLayout = (WebPenetrateFrameLayout) this.p.findViewById(R.id.web_container);
        this.A = webPenetrateFrameLayout;
        webPenetrateFrameLayout.disableTouch(true);
        this.K = T0(this.o);
        this.C = (FrameLayout) this.p.findViewById(R.id.cover_layout);
        this.E = (TUrlImageView) this.p.findViewById(R.id.img_cover);
        this.F = (ImageView) this.p.findViewById(R.id.img_process);
        this.D = (FrameLayout) this.p.findViewById(R.id.error_layout);
        boolean m = pto.m(this.f29555a);
        this.I = (ViewGroup) this.p.findViewById(R.id.web_card_top_layout);
        if (!pto.i(this.f29555a) && m) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I.getLayoutParams();
            layoutParams.topMargin = s6o.z(this.o) + pr9.c(this.o, 4);
            this.I.setLayoutParams(layoutParams);
        }
        this.I.setTranslationZ(1.0f);
        ImageView imageView = (ImageView) this.p.findViewById(R.id.web_card_tbvideo_back);
        this.J = imageView;
        imageView.setOnClickListener(new a());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.G = layoutParams2;
        this.A.addView(this.K, layoutParams2);
        this.K.setWvUIModel(new h(this.o, this.K));
        this.H = FluidSDK.getImageAdapter().getImageStrategyConfig();
        ((IBackEventService) this.f29555a.getService(IBackEventService.class)).addBackEventListener(new b());
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        super.onDisActive(uq9Var);
        if (Y0()) {
            z1("disactive", null);
        }
        ezw.b(this.U, "disactive");
        f1();
        ezw.a(this.U);
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        super.onDisAppear(uq9Var);
        this.f.R().x(true);
        x1(false);
        ezw.b(this.U, "disappear");
        c1();
        if (!h0()) {
            e1(0);
        }
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (this.t) {
            g1();
            A1(false);
            if (h0()) {
                t1();
            }
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            super.onRecycle(uq9Var);
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        super.onWillActive(uq9Var);
        if (this.t) {
            G1();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        super.onWillDisActive(uq9Var);
        if (this.t) {
            t1();
        }
    }

    @Override // tb.ulb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc13a868", new Object[]{this});
        }
        return CARD_NAME;
    }

    private void B1(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c15f39", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(V, "setIsPlayingGame isPlayingGame: " + z);
        if (!z) {
            this.A.clearChildTouchRect();
        }
        if (z != Z) {
            Z = z;
            w1(z);
            ((IFeedsListService) this.f29555a.getService(IFeedsListService.class)).setScrollLockedExternal(z);
            ir9.b(V, "mediaController 不为null，禁止滑动");
            this.B.setWebCardPlayingGame(z);
            if (zyw.f() && !this.P) {
                ViewGroup viewGroup = this.I;
                if (!z) {
                    i = 8;
                }
                viewGroup.setVisibility(i);
            }
        }
    }

    private void F1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bca2dd", new Object[]{this, new Boolean(z)});
        } else if (zyw.g()) {
            try {
                ir9.b(V, "showErrorView 显示错误页，errorFromWeb：" + z);
                if (this.L == null) {
                    ir9.b(V, "showErrorView 初始化错误页");
                    TBVideoErrorView tBVideoErrorView = new TBVideoErrorView(this.o);
                    this.L = tBVideoErrorView;
                    tBVideoErrorView.setBackgroundColor(-16777216);
                    this.L.setErrorAction(new g(z));
                    this.D.addView(this.L, this.G);
                }
                this.D.setVisibility(0);
            } catch (Throwable th) {
                ir9.c(V, "", th);
            }
        }
    }

    private void I1(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620e594b", new Object[]{this, new Boolean(z)});
        } else if (!z || zyw.k()) {
            if (f() != null) {
                z2 = f().h0();
            }
            ir9.b(V, "tryPlayNext,isActive:" + z2);
            if (z2) {
                u1();
            }
        }
    }

    private void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64c4f2c", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(V, "onDelayDestroyTimeout appear:" + i0() + ",isActive:" + h0());
        if (i == 0 && !i0() && !h0()) {
            ezw.b(this.U, "destroytimeout");
            j1(false);
        }
    }

    private void i1(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425a234c", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        ir9.b(V, "onPlayGame");
        B1(true);
        String str = s6o.J(this.o, f2) + "," + s6o.J(this.o, f3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("point", (Object) str);
        z1("play", jSONObject);
        ezw.c(this.U, "play", jSONObject);
    }

    private void w1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841c6df7", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(V, "sendToRootTnodeMessage isPlayingGame: " + z);
        ((IHostTNodeService) this.f29555a.getService(IHostTNodeService.class)).showOrHideTab2TopBar(z ^ true);
    }

    public void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdbe77f", new Object[]{this});
            return;
        }
        ir9.b(V, "onGameBack");
        if (Z) {
            z1("stop", null);
            ezw.b(this.U, "back");
        }
        B1(false);
    }

    public void j1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59827bf9", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(V, "onRecycle方法调用");
        WVUCWebView wVUCWebView = this.K;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
            if (this.K.getParent() != null && (this.K.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.K.getParent()).removeView(this.K);
            }
            this.K = null;
        }
        D1(0);
        H1(0, false, null);
        this.C.setVisibility(8);
        N0();
    }

    @Override // tb.uq9, tb.ulb, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.t) {
            ezw.b(this.U, "pageappear");
            A1(true);
            if (h0()) {
                G1();
            }
        }
    }

    private void H1(int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33008d79", new Object[]{this, new Integer(i), new Boolean(z), str});
            return;
        }
        ir9.b(V, "stateChanged state:" + i);
        this.M = i;
        if (z) {
            if (i == 0) {
                ezw.b(this.U, "webloadinit");
            } else if (i == 2) {
                ezw.b(this.U, "webloadfinished");
            } else if (i == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("error", str);
                ezw.c(this.U, "webloadfailed", hashMap);
            }
        }
    }

    private boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9666ff2a", new Object[]{this})).booleanValue();
        }
        boolean Z0 = Z0();
        ir9.b(V, "onBackPress,isPlayingGame:" + Z0);
        if (!Z0) {
            return false;
        }
        f1();
        return true;
    }

    private void r1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0468cf2", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(V, "onWaitTimeout appear:" + i0() + "_state:" + this.M + "_gameState:" + this.N);
        if (i == 0 && !X0()) {
            ezw.b(this.U, "waittimeout");
            f1();
            F1(false);
            hideLoading();
            I1(true);
        }
    }

    public void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.O)) {
            this.O = M0();
        }
        if (TextUtils.isEmpty(this.O)) {
            ir9.b(V, "reload url为null return");
            return;
        }
        H1(0, true, "");
        D1(0);
        N0();
        l1();
        if (this.K == null) {
            ir9.b(V, "webView 为null 重新创建，+mUrl：" + this.O);
            WVUCWebView T0 = T0(this.o);
            this.K = T0;
            this.A.addView(T0, this.G);
        }
        this.K.getSettings().setJavaScriptEnabled(true);
        this.K.loadUrl(this.O);
    }

    public void z1(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408f1b29", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        y1(JSON.toJSONString(new vrp("game", "native", str, P(), null, jSONObject, null).a(), SerializerFeature.DisableCircularReferenceDetect));
    }

    public void s1(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845b7e40", new Object[]{this, vrpVar});
        } else if (vrpVar == null) {
            ir9.b(V, "onWebMessage msg 为null");
        } else {
            ir9.b(V, "接收Web发来的消息onHandlerH5Message name: " + vrpVar.c + " args: " + vrpVar.h);
            a.f fVar = this.S;
            if (fVar == null) {
                ir9.b(V, "onWebMessage detail为null");
            } else if (!TextUtils.equals(vrpVar.d, fVar.a())) {
                ir9.b(V, "onWebMessage msg id 和contentId 不相等，msg.id：" + vrpVar.d + ",detail.contentId():" + this.S.a());
            } else {
                String str = vrpVar.c;
                str.hashCode();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -934641255:
                        if (str.equals("reload")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -690213213:
                        if (str.equals("register")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3540994:
                        if (str.equals("stop")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 52573147:
                        if (str.equals("registerfilter")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 310351011:
                        if (str.equals("loadfailed")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 545472344:
                        if (str.equals("loadfinished")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1879530535:
                        if (str.equals("playnext")) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        if (zyw.b()) {
                            B1(false);
                            P0(true);
                            ezw.b(this.U, Q0("reload"));
                            break;
                        }
                        break;
                    case 1:
                        boolean b2 = ((ILifecycleService) this.f29555a.getService(ILifecycleService.class)).getConfig().b();
                        ir9.b(V, "mIsPageAppear:" + b2);
                        D1(1);
                        if (f().i0() && b2) {
                            z1("appear", null);
                        }
                        if (f().h0() && b2) {
                            z1("active", null);
                        }
                        ezw.b(this.U, Q0("register"));
                        break;
                    case 2:
                        B1(false);
                        ezw.b(this.U, Q0("stop"));
                        break;
                    case 3:
                        if (zyw.l()) {
                            IMessageService iMessageService = (IMessageService) this.f29555a.getService(IMessageService.class);
                            azw azwVar = new azw(this.K, this);
                            this.R = azwVar;
                            azwVar.r(this.S.a());
                            if (iMessageService != null) {
                                iMessageService.registerMessageHandler(this.R);
                            }
                            E1();
                            ezw.b(this.U, Q0("registerfilter"));
                            break;
                        }
                        break;
                    case 4:
                        D1(3);
                        B1(false);
                        F1(false);
                        hideLoading();
                        I1(true);
                        ezw.b(this.U, Q0("loadfailed"));
                        break;
                    case 5:
                        if (!sz3.b(vrpVar.h)) {
                            this.P = TextUtils.equals(nwv.I(vrpVar.h.get("back"), null), "custom");
                        }
                        D1(2);
                        C1();
                        hideLoading();
                        N0();
                        c1();
                        ezw.b(this.U, Q0("loadfinished"));
                        break;
                    case 6:
                        B1(false);
                        I1(false);
                        ezw.b(this.U, Q0("playnext"));
                        break;
                }
                vrp.a aVar = vrpVar.g;
                if (aVar != null) {
                    aVar.b(this.R, "success");
                }
            }
        }
    }
}
