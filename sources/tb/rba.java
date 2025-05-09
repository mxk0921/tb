package tb;

import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rba extends i10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean i;
    public DWPenetrateFrameLayout j;
    public WVUCWebView k;
    public String n;
    public vrp p;
    public long l = -1;
    public int m = -1;
    public final Handler o = new Handler(Looper.getMainLooper());
    public boolean q = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, String str2) {
            super(context);
            this.b = str;
            this.c = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1262473342) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            } else if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/globalinteraction/eventhandler/h5/GlobalH5MessageHandler$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            ir9.b("GlobalH5MessageHandler", "web view load finish, webView: " + webView + ", url: " + str);
            rba.this.a0(webView, this.b, this.c);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            rba.t(rba.this, 3);
            ir9.b("GlobalH5MessageHandler", "web view receive error, webView: " + webView + ", url: " + str2 + ", errorCode: " + i + ", description: " + str);
            rba.u(rba.this).setVisibility(8);
            if (rba.v(rba.this) != null) {
                ryr.c(rba.w(rba.this).getContext(), this.b, "gg_interactive_render_h5", "webError", null);
            }
            soa.a(rba.z(rba.this), ((ICardService) rba.x(rba.this).getService(ICardService.class)).getActiveCard(), i, str, "2", this.c);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            rba.B(rba.this, 3);
            ir9.b("GlobalH5MessageHandler", "web view receive ssl error");
            if (rba.C(rba.this) != null) {
                ryr.c(rba.E(rba.this).getContext(), this.b, "gg_interactive_render_h5", "webSSLError", null);
            }
            rba.u(rba.this).setVisibility(8);
        }
    }

    static {
        t2o.a(468713499);
    }

    public rba(FluidContext fluidContext, ViewGroup viewGroup) {
        super(fluidContext, viewGroup);
    }

    public static /* synthetic */ int B(rba rbaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1db1335", new Object[]{rbaVar, new Integer(i)})).intValue();
        }
        rbaVar.e = i;
        return i;
    }

    public static /* synthetic */ ViewGroup C(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2ad15a75", new Object[]{rbaVar});
        }
        return rbaVar.g;
    }

    public static /* synthetic */ ViewGroup E(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6db5f994", new Object[]{rbaVar});
        }
        return rbaVar.g;
    }

    public static /* synthetic */ Object ipc$super(rba rbaVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/globalinteraction/eventhandler/h5/GlobalH5MessageHandler");
    }

    public static /* synthetic */ int t(rba rbaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e8e90fb", new Object[]{rbaVar, new Integer(i)})).intValue();
        }
        rbaVar.e = i;
        return i;
    }

    public static /* synthetic */ DWPenetrateFrameLayout u(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWPenetrateFrameLayout) ipChange.ipc$dispatch("7d4acbeb", new Object[]{rbaVar});
        }
        return rbaVar.j;
    }

    public static /* synthetic */ ViewGroup v(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("dc5a3eda", new Object[]{rbaVar});
        }
        return rbaVar.g;
    }

    public static /* synthetic */ ViewGroup w(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1f3eddf9", new Object[]{rbaVar});
        }
        return rbaVar.g;
    }

    public static /* synthetic */ FluidContext x(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("77a639cb", new Object[]{rbaVar});
        }
        return rbaVar.h;
    }

    public static /* synthetic */ FluidContext z(rba rbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("e78b136a", new Object[]{rbaVar});
        }
        return rbaVar.h;
    }

    public boolean F(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72dac7d4", new Object[]{this, vrpVar})).booleanValue();
        }
        return vrp.BIZ_SHORTVIDEO_GLOBAL_H5.equals(vrpVar.f30209a);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3882", new Object[]{this});
        } else if (this.i && this.e != 3 && !((HashSet) this.f).isEmpty()) {
            this.e = 2;
        }
    }

    public final void I(Map<String, Object> map, Map<String, Object> map2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce25e4bb", new Object[]{this, map, map2, str});
        } else if (map != null && map2 != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getValue() instanceof Map) {
                        I((Map) entry.getValue(), (Map) map2.get(entry.getKey()), entry.getKey());
                    } else {
                        entry.setValue(map2.get(entry.getKey()));
                    }
                }
            } catch (Throwable th) {
                ir9.b("GlobalH5MessageHandler", "copyMapValue error: " + str);
                th.printStackTrace();
            }
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3227a68d", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.k;
        if (wVUCWebView != null && (wVUCWebView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.k.getParent()).removeView(this.k);
        }
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52336e5", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableFilterPageStateMsg", true);
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5076b0c6", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableFixGlobalH5Reload", true);
    }

    public final vrp N(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrp) ipChange.ipc$dispatch("613e69e2", new Object[]{this, vrpVar});
        }
        a.d O = O();
        if (O != null) {
            return new vrp(vrp.MSG_DATA_CHANGE, vrpVar.d, O.h(this.h));
        }
        return new vrp(vrp.MSG_DATA_CHANGE, vrpVar.d, new HashMap());
    }

    public final a.d O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("548daa07", new Object[]{this});
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.h.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null) {
            return currentMediaSetData.e();
        }
        return null;
    }

    public final vrp Q(vrp vrpVar) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrp) ipChange.ipc$dispatch("4a3b8979", new Object[]{this, vrpVar});
        }
        Map map = vrpVar.h;
        if (map != null) {
            Object obj = map.get("scene");
            if ((obj instanceof String) && String.valueOf(obj).equals("curMediaData")) {
                com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.h.getService(IDataService.class)).getCurrentMediaSetData();
                Map<String, Object> map2 = (Map) vrpVar.h.get("targetData");
                if (!(map2 == null || map2.isEmpty() || currentMediaSetData == null || (e = currentMediaSetData.e()) == null)) {
                    Map<String, Object> h = e.h(this.h);
                    if (!h.isEmpty()) {
                        I(map2, h, "getTargetDataInScene");
                        return vrpVar;
                    }
                }
            }
        }
        return new vrp("VSMSG_getTargetDataInScene", vrpVar.d, new HashMap());
    }

    public String R(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83afd96e", new Object[]{this, fluidContext});
        }
        ncp j = ((IDataService) this.h.getService(IDataService.class)).getConfig().j();
        if (j != null) {
            return j.c;
        }
        return null;
    }

    public void U(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        vrp vrpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0d5c72", new Object[]{this, aVar});
            return;
        }
        ir9.b("GlobalH5MessageHandler", "init, ");
        if (aVar == null || aVar.e() == null) {
            vrpVar = null;
        } else {
            vrpVar = new vrp("VSMSG_initWebView", "-1", aVar.e().h(this.h));
        }
        V(vrpVar);
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbea805c", new Object[]{this});
        } else if (this.k != null) {
            ir9.b("GlobalH5MessageHandler", "H5全局互动层隐藏 disappear，webView=" + this.k);
            this.o.removeCallbacksAndMessages(null);
            this.k.setVisibility(8);
            this.k.onPause();
        }
    }

    public final void Z(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c83a25e", new Object[]{this, list});
        } else if (((HashSet) this.f).isEmpty()) {
            this.f.addAll(list);
            G();
            T();
        }
    }

    public void a0(WebView webView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a84f26c", new Object[]{this, webView, str, str2});
            return;
        }
        this.m = (int) (System.currentTimeMillis() - this.l);
        this.i = true;
        G();
        T();
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            ryr.d(viewGroup.getContext(), str, "gg_interactive_render_h5", null);
        }
        soa.b(this.h, ((ICardService) this.h.getService(ICardService.class)).getActiveCard(), this.m, "2", str2);
    }

    public Map e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("495e68c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.vx1, tb.lr9
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.k != null) {
            K();
            this.k.destroy();
            this.k = null;
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868340e5", new Object[]{this});
            return;
        }
        ir9.b("GlobalH5MessageHandler", "handle if reload");
        if (M() && !this.q && !((HashSet) this.f).isEmpty()) {
            ir9.b("GlobalH5MessageHandler", "handle if reload, check web view is reloaded");
            this.e = 2;
            DWPenetrateFrameLayout dWPenetrateFrameLayout = this.j;
            if (dWPenetrateFrameLayout != null) {
                dWPenetrateFrameLayout.setVisibility(0);
            }
            IMessageService iMessageService = (IMessageService) this.h.getService(IMessageService.class);
            if (iMessageService != null) {
                vrp vrpVar = this.p;
                if (vrpVar != null) {
                    iMessageService.sendMessage(vrpVar);
                    ir9.b("GlobalH5MessageHandler", "handle if reload, send init web view message to message center");
                }
                a.d O = O();
                if (O != null) {
                    Map h = O.h(this.h);
                    h.put(sj4.UPDATE_DATA_MSG_FOR_GLOBAL_H5, Boolean.TRUE);
                    iMessageService.sendMessage(new vrp(vrp.MSG_DATA_CHANGE, O.c, h));
                    ir9.b("GlobalH5MessageHandler", "handle if reload, send update media data message to message center");
                }
            }
        }
        this.q = false;
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
        } else if (this.k != null) {
            if (M() && this.e == 3) {
                ir9.b("GlobalH5MessageHandler", "state is error on page appear");
                this.k.reload();
            }
            ir9.b("GlobalH5MessageHandler", "H5全局互动层显示 webView=" + this.k);
            this.k.setVisibility(0);
            this.k.onResume();
        }
    }

    public final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22b2343", new Object[]{this})).booleanValue();
        }
        if (this.e != 2 || ((ArrayList) this.f30309a).isEmpty()) {
            return false;
        }
        Iterator it = ((ArrayList) this.f30309a).iterator();
        while (it.hasNext()) {
            vrp vrpVar = (vrp) it.next();
            if (((HashSet) this.f).contains(vrpVar.c)) {
                try {
                    ir9.b("GlobalH5MessageHandler", "state is ready, send pending message to h5, message: " + vrpVar.toString() + ", message.args: " + vrpVar.h);
                    WVStandardEventCenter.postNotificationToJS(this.k, "onShortVideoMessage", JSON.toJSONString(vrpVar.a()));
                } catch (Exception e) {
                    ir9.c("GlobalH5MessageHandler", "", e);
                }
            } else if (vrpVar.c.equals("VSMSG_initWebView")) {
                ir9.b("GlobalH5MessageHandler", "initWebView lost:" + vrpVar.d + "  current:" + this.b);
            }
        }
        ((ArrayList) this.f30309a).clear();
        return true;
    }

    public final void V(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9358d7", new Object[]{this, vrpVar});
            return;
        }
        this.e = 1;
        StringBuilder sb = new StringBuilder("init web view, message: ");
        sb.append(vrpVar != null ? vrpVar.toString() : null);
        ir9.b("GlobalH5MessageHandler", sb.toString());
        String b = pto.b(this.h);
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            ryr.b(viewGroup.getContext(), b, "gg_interactive_render_h5");
        }
        String R = R(this.h);
        if (TextUtils.isEmpty(R)) {
            ir9.b("GlobalH5MessageHandler", "init web view, url is empty");
            this.e = 3;
            ViewGroup viewGroup2 = this.g;
            if (viewGroup2 != null) {
                ryr.c(viewGroup2.getContext(), b, "gg_interactive_render_h5", "webUrlEmpty", null);
            }
            soa.a(this.h, ((ICardService) this.h.getService(ICardService.class)).getActiveCard(), 0, "url empty", "2", null);
            return;
        }
        ir9.b("GlobalH5MessageHandler", "init web view, url: " + R);
        this.l = System.currentTimeMillis();
        DWPenetrateFrameLayout dWPenetrateFrameLayout = new DWPenetrateFrameLayout(this.g.getContext());
        this.j = dWPenetrateFrameLayout;
        dWPenetrateFrameLayout.setBackgroundColor(0);
        W(null, b, R, vrpVar);
    }

    public final void W(WVUCWebView wVUCWebView, String str, String str2, vrp vrpVar) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7702", new Object[]{this, wVUCWebView, str, str2, vrpVar});
            return;
        }
        if (wVUCWebView == null) {
            wVUCWebView = new WVUCWebView(this.g.getContext());
        }
        this.k = wVUCWebView;
        wVUCWebView.setTag(((IMessageService) this.h.getService(IMessageService.class)).getMessageCenter());
        this.k.setTag(R.id.fluid_sdk_fluid_intance, this.h);
        this.k.setWebViewClient(new a(this.g.getContext(), str, str2));
        this.k.setBackgroundColor(0);
        p(this.k);
        this.k.getSettings().setJavaScriptEnabled(true);
        this.k.loadUrl(str2);
        soa.c(this.h, ((ICardService) this.h.getService(ICardService.class)).getActiveCard(), "2", str2);
        this.j.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
        this.g.addView(this.j, new ViewGroup.LayoutParams(-1, -1));
        this.k.setContentDescription(null);
        HashMap hashMap = new HashMap();
        Map b = wmi.b(this.h, vrpVar);
        b.put("TTMC", Long.valueOf(this.l));
        b.put("isUseDXPop", Boolean.valueOf(((ICollectionService) this.h.getService(ICollectionService.class)).checkUseNativePopupCollection()));
        if (e() != null) {
            b.put("isRealtime", Boolean.TRUE);
            b.put("configs", e());
        }
        b.put("globalInteractMultiTabEnabled", "false");
        hashMap.put("options", b);
        if (!(vrpVar == null || (map = vrpVar.h) == null)) {
            hashMap.put("data", map);
        }
        hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
        vrp vrpVar2 = new vrp("VSMSG_initWebView", "-1", hashMap);
        this.p = vrpVar2;
        ((ArrayList) this.f30309a).add(vrpVar2);
        ir9.b("GlobalH5MessageHandler", "init web view end");
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        if (vrpVar.c.equals(vrp.MSG_DATA_CHANGE)) {
            Map map = vrpVar.h;
            if (map == null || !nwv.o(map.get(sj4.UPDATE_DATA_MSG_FOR_GLOBAL_H5), false)) {
                z = false;
            }
            ir9.a("GlobalH5MessageHandler", "MSG_DATA_CHANGE ifForGlobalH5=" + z);
            return z;
        } else if (vrpVar.c.equals("VSMSG_registerFilter")) {
            return F(vrpVar);
        } else {
            if (((HashSet) this.f).isEmpty()) {
                return true;
            }
            return ((HashSet) this.f).contains(vrpVar.c);
        }
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
        } else if (!F(vrpVar) || !vrpVar.c.equals("VSMSG_registerFilter")) {
            if (vrpVar.c.equals(vrp.MSG_DATA_CHANGE)) {
                ir9.b("NewGlobalVCH5", "GlobalH5 msg VSMSG_updateMediaData");
                yyr.c(vrpVar);
            }
            if (this.k == null && this.e == 0) {
                ir9.b("GlobalH5MessageHandler", "handle message, state is init, ");
                V(vrpVar);
                return;
            }
            int i = this.e;
            if (i == 2) {
                try {
                    if (L()) {
                        if ("VSMSG_pageStateChanged".equals(vrpVar.c) && (map = vrpVar.h) != null) {
                            String I = nwv.I(map.get("state"), "");
                            if (!I.equals(this.n)) {
                                this.n = I;
                            } else {
                                return;
                            }
                        } else if ("VSMSG_getCurrentMediaData".equals(vrpVar.c)) {
                            vrpVar.g.b(this, N(vrpVar).h);
                            return;
                        } else if ("VSMSG_getTargetDataInScene".equals(vrpVar.c)) {
                            vrpVar.g.b(this, Q(vrpVar).h);
                            return;
                        }
                    }
                    WVStandardEventCenter.postNotificationToJS(this.k, "onShortVideoMessage", JSON.toJSONString(vrpVar.a(), SerializerFeature.DisableCircularReferenceDetect));
                } catch (Exception e) {
                    ir9.c("GlobalH5MessageHandler", "", e);
                }
            } else if (i != 3 && i != 4 && ((ArrayList) this.f30309a).size() < 200) {
                ((ArrayList) this.f30309a).add(vrpVar);
            }
        } else {
            List o = o(vrpVar);
            if (o != null) {
                Z(o);
            }
            S();
        }
    }
}
