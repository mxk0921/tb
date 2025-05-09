package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.joc;
import tb.q6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zyg implements olc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = zyg.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Context f33100a;
    public final ux9 b;
    public IRewardProxy.a c;
    public final String d;
    public final TBLiveDataModel e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements IRewardProxy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33101a;

        public a(jnr jnrVar) {
            this.f33101a = jnrVar;
        }

        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            zyg.c(zyg.this, str, str2, str3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str2);
            jSONObject.put("errMsg", (Object) str3);
            jSONObject.put(tl.KEY_STEP, (Object) str);
            this.f33101a.c(jSONObject.toJSONString());
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            zyg.b(zyg.this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "0");
            this.f33101a.h(jSONObject.toJSONString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t0u.c(zyg.d(zyg.this), "充值成功");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f33103a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(String str, String str2, String str3) {
            this.f33103a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (TextUtils.equals(this.f33103a, IRewardProxy.b.STEP_H5CALL)) {
                str = "参数异常";
            } else if (TextUtils.equals(this.f33103a, IRewardProxy.b.STEP_CREATE_ORDER)) {
                if (!TextUtils.isEmpty(this.b)) {
                    str = this.b;
                } else {
                    str = "创建订单失败";
                }
            } else if (TextUtils.equals(this.f33103a, IRewardProxy.b.STEP_RECHARGE)) {
                str = "充值失败（" + this.c + "）";
            } else {
                str = "";
            }
            t0u.c(zyg.d(zyg.this), str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements joc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(zyg zygVar, String str) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements joc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(zyg zygVar, String str) {
        }
    }

    static {
        t2o.a(779093245);
        t2o.a(806356588);
    }

    public zyg(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        this.d = null;
        this.f33100a = context;
        this.b = ux9Var;
        this.e = tBLiveDataModel;
        if (ux9Var != null) {
            this.d = ux9Var.C();
        }
    }

    public static /* synthetic */ void b(zyg zygVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6f0089", new Object[]{zygVar});
        } else {
            zygVar.k();
        }
    }

    public static /* synthetic */ void c(zyg zygVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820f2ee8", new Object[]{zygVar, str, str2, str3});
        } else {
            zygVar.j(str, str2, str3);
        }
    }

    public static /* synthetic */ Context d(zyg zygVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ae641e83", new Object[]{zygVar});
        }
        return zygVar.f33100a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.olc
    public Boolean a(IWVWebView iWVWebView, String str, String str2, jnr jnrVar) {
        ISmartLandingProxy.b bVar;
        JSONObject a2;
        JSONObject d2;
        skd y0;
        ISmartLandingProxy.b bVar2;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1325c444", new Object[]{this, iWVWebView, str, str2, jnrVar});
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1810455735:
                if (str.equals("joinFansClubNotify")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1778565890:
                if (str.equals("openAnchorPageCard")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1778223639:
                if (str.equals("showFarmGuide")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1620712196:
                if (str.equals("addPanelIcon")) {
                    c2 = 3;
                    break;
                }
                break;
            case -951156885:
                if (str.equals("openRewardPanel")) {
                    c2 = 4;
                    break;
                }
                break;
            case -772859263:
                if (str.equals("auctionFetchData")) {
                    c2 = 5;
                    break;
                }
                break;
            case -768879098:
                if (str.equals("openInsideDetailPage")) {
                    c2 = 6;
                    break;
                }
                break;
            case -650981635:
                if (str.equals("closeRewardPanel")) {
                    c2 = 7;
                    break;
                }
                break;
            case -643396662:
                if (str.equals("getEnterSmartLayer")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -430146909:
                if (str.equals("openNewUserPanel")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -238051800:
                if (str.equals("isRewardPanelShow")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -180090468:
                if (str.equals("sendComments")) {
                    c2 = 11;
                    break;
                }
                break;
            case 165243968:
                if (str.equals("auctionEventNotify")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 222710944:
                if (str.equals("addShareConfig")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 252820411:
                if (str.equals("checkResourceFileIsExist")) {
                    c2 = 14;
                    break;
                }
                break;
            case 331048772:
                if (str.equals("installWidgetSuccess")) {
                    c2 = 15;
                    break;
                }
                break;
            case 573961180:
                if (str.equals("isRewardEnable")) {
                    c2 = 16;
                    break;
                }
                break;
            case 628790393:
                if (str.equals("removePanelIcon")) {
                    c2 = 17;
                    break;
                }
                break;
            case 963853882:
                if (str.equals("refreshRewardPanel")) {
                    c2 = 18;
                    break;
                }
                break;
            case 970788705:
                if (str.equals("getMuteStatus")) {
                    c2 = 19;
                    break;
                }
                break;
            case 1087326811:
                if (str.equals("aliveLayerHeightChange")) {
                    c2 = 20;
                    break;
                }
                break;
            case 1215347749:
                if (str.equals("resourcePrefetch")) {
                    c2 = 21;
                    break;
                }
                break;
            case 1321206772:
                if (str.equals("sendLocalGiftMessage")) {
                    c2 = 22;
                    break;
                }
                break;
            case 1580155909:
                if (str.equals("getSJSDPopStatus")) {
                    c2 = 23;
                    break;
                }
                break;
            case 1623533838:
                if (str.equals("getScreenOrientation")) {
                    c2 = 24;
                    break;
                }
                break;
            case 1626149085:
                if (str.equals("removeShareConfig")) {
                    c2 = 25;
                    break;
                }
                break;
            case 1804502712:
                if (str.equals("sendRechargeMessage")) {
                    c2 = JSONLexer.EOI;
                    break;
                }
                break;
            case 1844430880:
                if (str.equals("onRewardPanelOpen")) {
                    c2 = 27;
                    break;
                }
                break;
            case 1914927727:
                if (str.equals("openWidgetInstallGuide")) {
                    c2 = 28;
                    break;
                }
                break;
            case 2078328323:
                if (str.equals("showSmartLayerWithBizId")) {
                    c2 = 29;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                sjr.g().c(uyg.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT, str2, this.d);
                return Boolean.TRUE;
            case 1:
                sjr.g().c("com.taobao.taolive.room.avatar_card_show", str2, this.d);
                return Boolean.TRUE;
            case 2:
                sjr.g().c("taolive.showFarmGuide", str2, this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case 3:
                sjr.g().c("com.taolive.taolive.room.mediaplatform_addPanelIcon", mxf.c(str2), this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case 4:
            case 27:
                f(str2, jnrVar);
                return Boolean.TRUE;
            case 5:
                Map<String, String> c3 = mxf.c(str2);
                if (c3 == null || c3.isEmpty()) {
                    jnrVar.b();
                    return Boolean.FALSE;
                } else if ("fetchBottomPosition".equals(c3.get("dataType"))) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("left", (Object) Integer.valueOf(d9m.g().getBottomBarLeftDP()));
                    int bottomBarBottomDP = d9m.g().getBottomBarBottomDP();
                    if (bottomBarBottomDP <= 0) {
                        bottomBarBottomDP = 66;
                    }
                    jSONObject2.put("bottom", (Object) Integer.valueOf(bottomBarBottomDP));
                    jSONObject.put("data", (Object) jSONObject2);
                    jnrVar.h(jSONObject.toJSONString());
                    return Boolean.TRUE;
                } else {
                    jnrVar.b();
                    return Boolean.FALSE;
                }
            case 6:
                try {
                } catch (Throwable th) {
                    v7t.d("openInsideDetailPage", th.getMessage());
                }
                if (TextUtils.isEmpty(str2)) {
                    v7t.d("openInsideDetailPage", "params is null");
                    return Boolean.FALSE;
                }
                JSONObject parseObject = JSON.parseObject(str2);
                if (parseObject == null) {
                    v7t.d("openInsideDetailPage", "jsonObject is null");
                    return Boolean.FALSE;
                }
                sjr.g().c(uyg.OPEN_INSIDE_DETAIL_EVENT, parseObject, this.d);
                return Boolean.TRUE;
            case 7:
                e(str2, jnrVar);
                JSONObject jSONObject3 = new JSONObject();
                Boolean bool = Boolean.TRUE;
                jSONObject3.put("result", (Object) bool);
                jnrVar.h(jSONObject3.toJSONString());
                return bool;
            case '\b':
                JSONObject jSONObject4 = new JSONObject();
                cv1 f2 = vx9.f(this.b);
                if (!(f2 == null || (bVar = f2.u) == null || (a2 = bVar.a()) == null || !"dx_smart".equals(a2.getString("actionType")))) {
                    jSONObject4.putAll(a2);
                }
                jnrVar.h(jSONObject4.toJSONString());
                return Boolean.TRUE;
            case '\t':
                Map<String, String> c4 = mxf.c(str2);
                HashMap hashMap = new HashMap();
                if (c4.containsKey("data")) {
                    String str3 = c4.get("data");
                    if (!TextUtils.isEmpty(str3) && (d2 = fkx.d(str3)) != null) {
                        hashMap.put("popviewTransParam", d2.get("popviewTransParam"));
                    }
                }
                sjr.g().c(amr.EventType_SHOW_POPVIEW, hashMap, this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case '\n':
                break;
            case 11:
                i(str2);
                break;
            case '\f':
                Map<String, String> c5 = mxf.c(str2);
                if (str2 == null || !c5.containsKey("eventType")) {
                    return Boolean.FALSE;
                }
                String str4 = c5.get("eventType");
                if (!TextUtils.equals("cardShow", str4) && !TextUtils.equals("cardHide", str4)) {
                    return Boolean.FALSE;
                }
                sjr.g().c("com.taobao.taolive.showcase.control", c5, this.d);
                return Boolean.TRUE;
            case '\r':
                sjr.g().c("com.taolive.taolive.room.mediaplatform_addShareConfig", mxf.c(str2), this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case 14:
                try {
                    JSONObject parseObject2 = JSON.parseObject(str2);
                    String str5 = (String) parseObject2.get("url");
                    String str6 = "";
                    if (g9a.a() && d9m.m().enableMD5FileCheck()) {
                        str6 = (String) parseObject2.get("md5");
                    }
                    if (!z8a.i(this.f33100a, str5, str6) || !g9a.a() || !d9m.m().enablePresaleScreenGift()) {
                        z = false;
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("result", (Object) Boolean.valueOf(z));
                    jnrVar.h(jSONObject5.toString());
                } catch (Exception e2) {
                    v7t.a("checkResourceFileIsExist", e2.getMessage());
                }
                return Boolean.TRUE;
            case 15:
                sjr.g().c("com.taobao.taolive.room.install_widget_success", str2, this.d);
                return Boolean.TRUE;
            case 16:
                boolean isRewardEnable = d9m.D().isRewardEnable(e7w.h(this.b), this.b);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("result", (Object) Boolean.valueOf(isRewardEnable));
                jnrVar.h(jSONObject6.toJSONString());
                return Boolean.TRUE;
            case 17:
                sjr.g().c("com.taolive.taolive.room.mediaplatform_removePanelIcon", mxf.c(str2), this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case 18:
                h(str2, jnrVar);
                return Boolean.TRUE;
            case 19:
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("muteKey", (Object) "initMuteStatus");
                jSONObject7.put("isMuted", (Object) Boolean.valueOf(vx9.d().u().j()));
                jnrVar.h(jSONObject7.toJSONString());
                return Boolean.TRUE;
            case 20:
                try {
                } catch (Throwable th2) {
                    v7t.d("aliveLayerHeightChange", th2.getMessage());
                }
                if (TextUtils.isEmpty(str2)) {
                    v7t.d("aliveLayerHeightChange", "params is null");
                    return Boolean.FALSE;
                }
                JSONObject parseObject3 = JSON.parseObject(str2);
                if (parseObject3 == null) {
                    v7t.d("aliveLayerHeightChange", "jsonObject is null");
                    return Boolean.FALSE;
                }
                if ("alivemodx-reward-gift-vote".equals((String) parseObject3.get("componentName"))) {
                    int intValue = parseObject3.getIntValue("height");
                    if (g9a.a()) {
                        d9m.m().adjustSmallHeightInAliveScene(intValue);
                    }
                }
                return Boolean.TRUE;
            case 21:
                sjr.g().c(uyg.EVENT_PREFETCH_GIFT_RESOURCE, str2, this.d);
                return Boolean.TRUE;
            case 22:
                sjr.g().c(uyg.EVENT_SEND_GIFT, str2, this.d);
                return Boolean.TRUE;
            case 23:
                JSONObject jSONObject8 = new JSONObject();
                cv1 f3 = vx9.f(this.b);
                if (!(f3 == null || (bVar2 = f3.u) == null)) {
                    z2 = bVar2.h();
                }
                jSONObject8.put("hasWYSIWYG", (Object) Boolean.valueOf(z2));
                jnrVar.h(jSONObject8.toJSONString());
                return Boolean.TRUE;
            case 24:
                JSONObject jSONObject9 = new JSONObject();
                Context context = this.f33100a;
                jSONObject9.put(yj4.PARAM_SCREEN_ORIENTATION, (Object) ((!(context instanceof Activity) || ((Activity) context).getRequestedOrientation() != 0) ? "portrait" : "landscape"));
                jnrVar.h(jSONObject9.toJSONString());
                return Boolean.TRUE;
            case 25:
                sjr.g().c("com.taolive.taolive.room.mediaplatform_removeShareConfig", mxf.c(str2), this.d);
                jnrVar.f();
                return Boolean.TRUE;
            case 26:
                g(this.f33100a, str2, new a(jnrVar));
                return Boolean.TRUE;
            case 28:
                sjr.g().c(uyg.EVENT_OPEN_WIDGET_INSTALL_GUIDE, str2, this.d);
                return Boolean.TRUE;
            case 29:
                if (TextUtils.isEmpty(str2)) {
                    return Boolean.FALSE;
                }
                JSONObject parseObject4 = JSON.parseObject(str2);
                if (parseObject4 != null) {
                    String string = parseObject4.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                    String string2 = parseObject4.getString("smartBizId");
                    String string3 = parseObject4.getString("benefitType");
                    ViewGroup c6 = iba.c(this.f33100a, vx9.f(this.b));
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put(yj4.PARAM_FANDOM_INTERACTTYPE, string3);
                    hashMap2.put(yh6.CONFIG_KEY_TEMPLATE_NAME, string);
                    cv1 f4 = vx9.f(this.b);
                    if (f4 instanceof dba) {
                        dba dbaVar = (dba) f4;
                        if (dbaVar.k0 != null) {
                            sj9.D("alive SmartLayer showSmartLayerWithBizId ");
                            dbaVar.k0.k(string2, hashMap2, q6q.b(this.b, this.e, parseObject4), (Activity) this.f33100a, this.b, c6, new q6q.a((cba) f4, null, null));
                        }
                    }
                }
                return Boolean.TRUE;
            default:
                rbu.L(this.b, "runExternalApi", "action=".concat(str));
                return null;
        }
        ux9 ux9Var = this.b;
        if ((ux9Var instanceof t54) && (y0 = ((t54) ux9Var).y0()) != null) {
            z2 = y0.isPanelShowing();
        }
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put("isRewardPanelShow", (Object) Boolean.valueOf(z2));
        jnrVar.h(jSONObject10.toJSONString());
        return Boolean.TRUE;
    }

    @Override // tb.olc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f33100a = null;
        }
    }

    public final void e(String str, jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639173dc", new Object[]{this, str, jnrVar});
        } else {
            this.b.h().c(uyg.EVENT_HIDE_REWARD_PANEL, null, this.d);
        }
    }

    public final void f(String str, jnr jnrVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70075d2e", new Object[]{this, str, jnrVar});
            return;
        }
        boolean isRewardEnable = d9m.D().isRewardEnable(e7w.h(this.b), this.b);
        if (isRewardEnable) {
            l(str);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", (Object) Boolean.valueOf(isRewardEnable));
        jnrVar.h(jSONObject.toJSONString());
        Map<String, String> c2 = mxf.c(str);
        String str3 = c2.get("source");
        m4e E = v2s.o().E();
        if (E != null && !TextUtils.isEmpty(str3)) {
            HashMap hashMap = new HashMap(c2);
            if (isRewardEnable) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            hashMap.put("result", str2);
            E.track4Click("Page_TaobaoLiveWatch", "onRewardPanelOpen", hashMap);
        }
    }

    public final void g(Context context, String str, IRewardProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e07b49", new Object[]{this, context, str, bVar});
            return;
        }
        if (this.c == null) {
            this.c = d9m.D().createRecharge();
        }
        this.c.a((Activity) context, str, bVar);
    }

    public final void h(String str, jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989b2e3f", new Object[]{this, str, jnrVar});
            return;
        }
        joc u = v2s.o().u();
        if (u == null) {
            q0h.a(f, "loginAdapter null");
        } else if (!u.checkSessionValid()) {
            u.a((Activity) this.f33100a, new d(this, str));
        } else {
            this.b.h().c(uyg.EVENT_REFRESH_REWARD_PANEL, str, this.d);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bbe72d", new Object[]{this, str});
        } else {
            this.b.h().c(uyg.EVENT_SEND_COMMENT, fkx.d(str), this.d);
        }
    }

    public final void j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21eca48", new Object[]{this, str, str2, str3});
        } else {
            new Handler(Looper.getMainLooper()).post(new c(str, str3, str2));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15348f4f", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new b());
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4181efa9", new Object[]{this, str});
            return;
        }
        joc u = v2s.o().u();
        if (u == null) {
            q0h.a(f, "loginAdapter null");
        } else if (!u.checkSessionValid()) {
            u.a((Activity) this.f33100a, new e(this, str));
        } else {
            this.b.h().c(uyg.EVENT_SHOW_REWARD_PANEL, str, this.d);
        }
    }
}
