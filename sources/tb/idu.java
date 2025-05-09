package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.ModelBean;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardResponse;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.TrafficCardModel;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.ui.LiveCustomToast;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class idu implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TelephonyManager i;
    public static SubscriptionManager j;
    public static Method k;
    public static String l;
    public static volatile boolean m;
    public static Handler n;
    public static volatile int o;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f21261a;
    public String b;
    public NetworkStatusHelper.NetworkStatus c;
    public NetworkStatusHelper.INetworkStatusChangeListener d;
    public volatile boolean e;
    public WeakReference<ux9> f;
    public final boolean g;
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrafficCardModel f21262a;
        public final /* synthetic */ long b;

        public a(TrafficCardModel trafficCardModel, long j) {
            this.f21262a = trafficCardModel;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            idu iduVar = idu.this;
            idu.b(iduVar, idu.a(iduVar), this.f21262a);
            u6t.f("traffic_card_fatigue_key", this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21263a;

        public b(long j) {
            this.f21263a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            idu iduVar = idu.this;
            idu.c(iduVar, idu.a(iduVar));
            u6t.f("traffic_card_fatigue_key", this.f21263a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            idu iduVar = idu.this;
            idu.d(iduVar, idu.a(iduVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrafficCardModel f21265a;

        public d(TrafficCardModel trafficCardModel) {
            this.f21265a = trafficCardModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!TextUtils.isEmpty(this.f21265a.jumpUrl) && idu.a(idu.this) != null) {
                giv.f().m(idu.i(idu.this) == null ? null : (ux9) idu.i(idu.this).get(), "taolive_traffic_card", new HashMap());
                Nav.from(idu.a(idu.this)).toUri(this.f21265a.jumpUrl);
                o3s.b("TrafficCardManager", "click to nav:" + this.f21265a.jumpUrl);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295700060);
            t2o.a(607125966);
            t2o.a(607125969);
            t2o.a(607125968);
        }

        public e() {
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                return;
            }
            o3s.b("TrafficCardManager", " NetCallBack onDataReceived:" + progressEvent.getFragmentIndex());
            byte[] bArr = new byte[progressEvent.getSize()];
            System.arraycopy(progressEvent.getBytedata(), 0, bArr, 0, progressEvent.getSize());
            String str = new String(bArr);
            o3s.b("TrafficCardManager", " NetCallBack str:".concat(str));
            idu.j(idu.this, str);
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            o3s.b("TrafficCardManager", " NetCallBack onFinished:" + obj);
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            o3s.b("TrafficCardManager", " NetCallBack onResponseCode:" + i);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f {
        public static final idu INSTANCE = new idu(null);

        static {
            t2o.a(295700061);
        }
    }

    static {
        t2o.a(295700053);
        t2o.a(806355932);
    }

    public /* synthetic */ idu(a aVar) {
        this();
    }

    public static /* synthetic */ Context a(idu iduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("896dd000", new Object[]{iduVar});
        }
        return iduVar.n();
    }

    public static /* synthetic */ void b(idu iduVar, Context context, TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96e1774", new Object[]{iduVar, context, trafficCardModel});
        } else {
            iduVar.v(context, trafficCardModel);
        }
    }

    public static /* synthetic */ void c(idu iduVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdf1e7e", new Object[]{iduVar, context});
        } else {
            iduVar.t(context);
        }
    }

    public static /* synthetic */ void d(idu iduVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55110fdd", new Object[]{iduVar, context});
        } else {
            iduVar.u(context);
        }
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus e(idu iduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("c9d47592", new Object[]{iduVar});
        }
        return iduVar.c;
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus f(idu iduVar, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("198d1a2b", new Object[]{iduVar, networkStatus});
        }
        iduVar.c = networkStatus;
        return networkStatus;
    }

    public static /* synthetic */ void g(idu iduVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a6e3fa", new Object[]{iduVar, context});
        } else {
            iduVar.x(context);
        }
    }

    public static /* synthetic */ Handler h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("224633c8", new Object[0]);
        }
        return n;
    }

    public static /* synthetic */ WeakReference i(idu iduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("f1460bde", new Object[]{iduVar});
        }
        return iduVar.f;
    }

    public static /* synthetic */ void j(idu iduVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b97a85b", new Object[]{iduVar, str});
        } else {
            iduVar.w(str);
        }
    }

    public static idu o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idu) ipChange.ipc$dispatch("c6352a95", new Object[0]);
        }
        return f.INSTANCE;
    }

    public static String p(Context context) {
        SubscriptionInfo a2;
        CharSequence carrierName;
        try {
            if (i == null) {
                i = (TelephonyManager) context.getSystemService("phone");
            }
            l = i.getSimOperator();
            if (Build.VERSION.SDK_INT >= 22) {
                if (!(j != null || context == null || context.getApplicationContext() == null)) {
                    SubscriptionManager a3 = xtj.a(context.getApplicationContext().getSystemService("telephony_subscription_service"));
                    j = a3;
                    k = a3.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                Method method = k;
                if (method == null || (a2 = suj.a(method.invoke(j, new Object[0]))) == null) {
                    return "";
                }
                carrierName = a2.getCarrierName();
                return carrierName.toString();
            }
        } catch (Exception e2) {
            o3s.b("TrafficCardManager", "e:" + e2.getMessage());
            if ("46001".equals(l) || "46006".equals(l) || "46009".equals(l)) {
                return "CUC";
            }
            if ("46000".equals(l) || "46002".equals(l) || "46004".equals(l) || "46007".equals(l)) {
                return Constant.CMCC;
            }
            if ("46003".equals(l) || "46005".equals(l) || "46011".equals(l)) {
                return "CTC";
            }
        }
        return "";
    }

    public void k(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291687e5", new Object[]{this, context, ux9Var});
        } else if (this.g) {
            this.f21261a = new WeakReference<>(context);
            this.f = new WeakReference<>(ux9Var);
            if (!this.e) {
                r();
                this.e = true;
            }
            this.h = ux9Var.p();
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            this.c = status;
            if (status == NetworkStatusHelper.NetworkStatus.WIFI || status == NetworkStatusHelper.NetworkStatus.NO || status == NetworkStatusHelper.NetworkStatus.NONE) {
                o3s.b("TrafficCardManager", "enterLive not 4G mode");
            } else if (o < 2) {
                synchronized (idu.class) {
                    o++;
                }
                if (!m) {
                    m = true;
                    this.b = "";
                    x(context);
                }
            }
        }
    }

    public final void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb46491", new Object[]{this, context});
            return;
        }
        String p = p(context);
        if (p.contains(Constant.CMCC) || p.contains("中国移动")) {
            this.b = Constant.CMCC;
        } else if (p.contains("CUC") || p.contains("中国联通")) {
            this.b = "CUC";
        } else if (p.contains("CTC") || p.contains("中国电信")) {
            this.b = "CTC";
        }
        o3s.b("TrafficCardManager", "getCarrierInfo isp:" + this.b);
    }

    public final Context n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f21261a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void q(TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d869ac64", new Object[]{this, trafficCardModel});
        } else if (trafficCardModel != null) {
            o3s.b("TrafficCardManager", "start processTrafficCardData:" + trafficCardModel.state);
            long currentTimeMillis = System.currentTimeMillis();
            if (TextUtils.equals(trafficCardModel.state, "CAN_APPLY")) {
                if (System.currentTimeMillis() - u6t.c("traffic_card_fatigue_key") <= 86400000) {
                    o3s.b("TrafficCardManager", "startRequestCarrier isp hit fatigue fatigueTime:1440");
                    return;
                }
                n.post(new a(trafficCardModel, currentTimeMillis));
            } else if (TextUtils.equals(trafficCardModel.state, "CAN_NOT_APPLY") || TextUtils.equals(trafficCardModel.state, "UNKNOWN")) {
                if (System.currentTimeMillis() - u6t.c("traffic_card_fatigue_key") <= 86400000) {
                    o3s.b("TrafficCardManager", "startRequestCarrier isp hit fatigue fatigueTime:1440");
                    return;
                }
                n.post(new b(currentTimeMillis));
            } else if (TextUtils.equals(trafficCardModel.state, "SUBSCRIBING")) {
                n.post(new c());
            } else {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("traffic_card_state", trafficCardModel.state);
            g5h f2 = giv.f();
            WeakReference<ux9> weakReference = this.f;
            f2.p(weakReference == null ? null : weakReference.get(), "taolive_traffic_card", hashMap);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        kdu kduVar = new kdu(this);
        this.d = kduVar;
        NetworkStatusHelper.addStatusChangeListener(kduVar);
        o3s.b("TrafficCardManager", "registerListener");
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
            return;
        }
        n = new Handler(Looper.getMainLooper());
        NetworkSdkSetting.init(v2s.o().f().getApplication());
        NetworkStatusHelper.startListener(v2s.o().f().getApplication());
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        this.c = status;
        o3s.b("TrafficCardManager", "status:" + status);
        boolean isConnected = NetworkStatusHelper.isConnected();
        o3s.b("TrafficCardManager", "connected:" + isConnected);
    }

    public final void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7538c98", new Object[]{this, str});
            return;
        }
        new n8n(this).K(this.b, str);
        o3s.b("TrafficCardManager", " startQueryTrafficCard isp:" + this.b + " str：" + str);
    }

    public final void x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4bc696", new Object[]{this, context});
        } else if (context != null) {
            m(context);
            if (TextUtils.isEmpty(this.b)) {
                o3s.b("TrafficCardManager", "startRequestCarrier isp null");
                return;
            }
            new f8n(this).K(this.b);
            o3s.d("TrafficCardManager", "startRequestCarrier isp:" + this.b);
        }
    }

    public final void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410ab62", new Object[]{this, str});
        } else if (n() != null) {
            new DegradableNetwork(n()).asyncSend(new RequestImpl(str), null, null, new e());
            o3s.b("TrafficCardManager", "startRequestOperator:" + str);
        }
    }

    public idu() {
        this.g = true;
        if (giv.c() != null && giv.c().b()) {
            this.g = false;
            o3s.b("TrafficCardManager", "TrafficCardManager diantaoApp avoid");
        }
        o3s.b("TrafficCardManager", "TrafficCardManager mEnableFreeFlow:" + this.g);
        if (this.g) {
            s();
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69833e3b", new Object[]{this, str});
        } else if (str != null) {
            String str2 = this.h;
            if (str2 != null) {
                str2.equals(str);
            }
        } else if (this.g) {
            if (this.e) {
                this.e = false;
                NetworkStatusHelper.removeStatusChangeListener(this.d);
                this.d = null;
                o3s.b("TrafficCardManager", "removeStatusChangeListener");
            }
            this.f21261a = null;
        }
    }

    @Override // tb.b0d
    public void onError(int i2, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
            return;
        }
        m = false;
        o3s.d("TrafficCardManager", "onError");
    }

    @Override // tb.b0d
    public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof QueryOperatorResponse) {
            QueryOperatorRealResponse queryOperatorRealResponse = (QueryOperatorRealResponse) netBaseOutDo.getData();
            ModelBean modelBean = queryOperatorRealResponse.model;
            if (modelBean != null && modelBean.urlMap != null) {
                if (TextUtils.equals(this.b, Constant.CMCC)) {
                    str = queryOperatorRealResponse.model.urlMap.CMCC;
                } else if (TextUtils.equals(this.b, "CUC")) {
                    str = queryOperatorRealResponse.model.urlMap.CUC;
                } else if (TextUtils.equals(queryOperatorRealResponse.model.urlMap.CTC, "CTC")) {
                    str = queryOperatorRealResponse.model.urlMap.CTC;
                } else {
                    str = "";
                }
                o3s.b("TrafficCardManager", "QueryOperatorRealResponse url :" + str);
                if (!TextUtils.isEmpty(str)) {
                    y(str);
                }
            }
        } else if (netBaseOutDo instanceof QueryTrafficCardResponse) {
            m = false;
            QueryTrafficCardRealResponse data = ((QueryTrafficCardResponse) netBaseOutDo).getData();
            if (data != null && data.model != null) {
                if (!(n() instanceof Activity) || !((Activity) n()).isDestroyed()) {
                    q(data.model);
                } else {
                    o3s.b("TrafficCardManager", "realResponse Activity destroyed");
                }
            }
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i2, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
            return;
        }
        m = false;
        o3s.d("TrafficCardManager", "onSystemError");
    }

    public final void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef494943", new Object[]{this, context});
        } else if (context != null) {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText("当前为非WiFi网络环境");
            liveCustomToast.setTopIconRes("https://gw.alicdn.com/imgextra/i4/O1CN01MQVlSX1IfrfsUcPEA_!!6000000000921-2-tps-68-56.png");
            liveCustomToast.setBottomText("注意流量消耗");
            liveCustomToast.show();
        }
    }

    public final void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abd843c", new Object[]{this, context});
        } else if (context != null) {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText("免流观看中");
            liveCustomToast.setBottomText("");
            liveCustomToast.show();
        }
    }

    public final void v(Context context, TrafficCardModel trafficCardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7829297f", new Object[]{this, context, trafficCardModel});
        } else if (context != null) {
            LiveCustomToast liveCustomToast = new LiveCustomToast(context);
            liveCustomToast.setDuration(1);
            liveCustomToast.setTopText("当前为非WiFi网络环境");
            liveCustomToast.setTopIconRes("https://gw.alicdn.com/imgextra/i4/O1CN01MQVlSX1IfrfsUcPEA_!!6000000000921-2-tps-68-56.png");
            liveCustomToast.setBottomText("办理免流量观看");
            liveCustomToast.setBottomIcon("https://gw.alicdn.com/imgextra/i4/O1CN01vQGePQ1JWzcvGtJlZ_!!6000000001037-2-tps-22-40.png");
            liveCustomToast.setBottomClickCallback(new d(trafficCardModel));
            liveCustomToast.show();
        }
    }
}
