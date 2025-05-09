package com.taobao.android.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.DeliverRequest;
import com.taobao.android.address.model.RecommendAddressContainer;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.cookies.LoginCookie;
import com.taobao.login4android.session.cookies.LoginCookieUtils;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bbh;
import tb.d0m;
import tb.ef0;
import tb.gs6;
import tb.m6g;
import tb.of0;
import tb.r4p;
import tb.unr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AddressSDKDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDRESS_FILE = "globalAddress";
    public static final String PAGE_NAME = "globalAddress";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6283a;
    public final SharedPreferences b;
    public final ExecutorService c;
    public RecommendAddressContainer d = new RecommendAddressContainer();
    public boolean e = false;
    public long f = 0;
    public boolean g = false;
    public BroadcastReceiver h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6286a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ ef0 g;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.address.AddressSDKDelegate$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0329a implements unr {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DeliverRequest f6287a;

            public C0329a(DeliverRequest deliverRequest) {
                this.f6287a = deliverRequest;
            }

            @Override // tb.unr
            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                    return;
                }
                a aVar = a.this;
                AddressSDKDelegate.b(AddressSDKDelegate.this, tBLocationDTO, this.f6287a, aVar.c, aVar.d, aVar.e, aVar.b, aVar.f, aVar.f6286a, aVar.g);
            }
        }

        public a(boolean z, String str, Context context, String str2, String str3, boolean z2, ef0 ef0Var) {
            this.f6286a = z;
            this.b = str;
            this.c = context;
            this.d = str2;
            this.e = str3;
            this.f = z2;
            this.g = ef0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DeliverRequest deliverRequest = new DeliverRequest();
            try {
                if (!this.f6286a || (TextUtils.equals("appLaunch", this.b) && AddressSDKDelegate.a(AddressSDKDelegate.this, "ingoreLBSWhenLaunch", "true"))) {
                    AddressSDKDelegate.d(AddressSDKDelegate.this, this.c, this.d, this.e, this.b, deliverRequest, this.f, this.f6286a, this.g);
                    return;
                }
                TBLocationOption tBLocationOption = new TBLocationOption();
                tBLocationOption.setTimeout(TBLocationOption.Timeout.THREE_SECONDS);
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.FIR_MIN);
                TBLocationClient.g(AddressSDKDelegate.c(AddressSDKDelegate.this)).h(tBLocationOption, new C0329a(deliverRequest), Looper.getMainLooper());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends TypeReference<Map<String, String>> {
        public b(AddressSDKDelegate addressSDKDelegate) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6288a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public c(String str, boolean z, String str2) {
            this.f6288a = str;
            this.b = z;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AddressSDKDelegate.g(AddressSDKDelegate.this, this.f6288a, false, this.b, this.c, null, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends TypeReference<Map<String, RecommendedAddress>> {
        public d(AddressSDKDelegate addressSDKDelegate) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AddressSDKDelegate(Context context) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new of0("AddressSDKDelegate"));
        this.c = newFixedThreadPool;
        Context applicationContext = context.getApplicationContext();
        this.f6283a = applicationContext;
        this.b = applicationContext.getSharedPreferences("globalAddress", 0);
        try {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
            threadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ boolean a(AddressSDKDelegate addressSDKDelegate, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aacde329", new Object[]{addressSDKDelegate, str, str2})).booleanValue();
        }
        return addressSDKDelegate.q(str, str2);
    }

    public static /* synthetic */ void b(AddressSDKDelegate addressSDKDelegate, TBLocationDTO tBLocationDTO, DeliverRequest deliverRequest, Context context, String str, String str2, String str3, boolean z, boolean z2, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41adb767", new Object[]{addressSDKDelegate, tBLocationDTO, deliverRequest, context, str, str2, str3, new Boolean(z), new Boolean(z2), ef0Var});
        } else {
            addressSDKDelegate.H(tBLocationDTO, deliverRequest, context, str, str2, str3, z, z2, ef0Var);
        }
    }

    public static /* synthetic */ Context c(AddressSDKDelegate addressSDKDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fb0981c7", new Object[]{addressSDKDelegate});
        }
        return addressSDKDelegate.f6283a;
    }

    public static /* synthetic */ void d(AddressSDKDelegate addressSDKDelegate, Context context, String str, String str2, String str3, DeliverRequest deliverRequest, boolean z, boolean z2, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd928b2f", new Object[]{addressSDKDelegate, context, str, str2, str3, deliverRequest, new Boolean(z), new Boolean(z2), ef0Var});
        } else {
            addressSDKDelegate.F(context, str, str2, str3, deliverRequest, z, z2, ef0Var);
        }
    }

    public static /* synthetic */ boolean e(AddressSDKDelegate addressSDKDelegate, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2beda6d", new Object[]{addressSDKDelegate, new Boolean(z)})).booleanValue();
        }
        addressSDKDelegate.g = z;
        return z;
    }

    public static /* synthetic */ void f(AddressSDKDelegate addressSDKDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942e5bac", new Object[]{addressSDKDelegate});
        } else {
            addressSDKDelegate.D();
        }
    }

    public static /* synthetic */ void g(AddressSDKDelegate addressSDKDelegate, String str, boolean z, boolean z2, String str2, DeliverRequest deliverRequest, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca27d528", new Object[]{addressSDKDelegate, str, new Boolean(z), new Boolean(z2), str2, deliverRequest, ef0Var});
        } else {
            addressSDKDelegate.s(str, z, z2, str2, deliverRequest, ef0Var);
        }
    }

    public static /* synthetic */ boolean h(AddressSDKDelegate addressSDKDelegate, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ebbda30", new Object[]{addressSDKDelegate, new Boolean(z)})).booleanValue();
        }
        addressSDKDelegate.e = z;
        return z;
    }

    public static /* synthetic */ BroadcastReceiver i(AddressSDKDelegate addressSDKDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("111fa940", new Object[]{addressSDKDelegate});
        }
        return addressSDKDelegate.h;
    }

    public static /* synthetic */ void j(AddressSDKDelegate addressSDKDelegate, Context context, String str, String str2, String str3, boolean z, boolean z2, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0a36e2", new Object[]{addressSDKDelegate, context, str, str2, str3, new Boolean(z), new Boolean(z2), ef0Var});
        } else {
            addressSDKDelegate.y(context, str, str2, str3, z, z2, ef0Var);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e035290", new Object[]{this});
            return;
        }
        String jSONString = JSON.toJSONString(this.d);
        this.b.edit().putString("globalAddressKey", jSONString).apply();
        AdapterForTLog.loge("globalAddress", "syncAddressInfoToLocal data = " + jSONString);
    }

    public void B(Context context, String str, String str2, String str3, String str4, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650b1417", new Object[]{this, context, str, str2, str3, str4, ef0Var});
        } else {
            C(context, str, str2, str3, str4, ef0Var);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c2907", new Object[]{this});
        } else if (q("updateLocaleWhenPullFail", "false")) {
            z();
            int n = n("expireTimeWhenPullFail", "5");
            this.d.timestamp = System.currentTimeMillis() - ((n("recommendAddressExpireTimeV2", "30") - n) * 60000);
            A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:8:0x0036, B:10:0x003a, B:12:0x003e, B:17:0x0047, B:18:0x004a, B:20:0x0050, B:21:0x0058, B:23:0x005e, B:25:0x0066, B:27:0x006a, B:29:0x0072), top: B:32:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.address.AddressSDKDelegate.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "1241ae42"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 1
            r2[r3] = r8
            r8 = 2
            r2[r8] = r9
            r8 = 3
            r2[r8] = r10
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateRecommendAddr addressId = "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "globalAddress"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x008a
            com.taobao.android.address.model.RecommendAddressContainer r0 = r7.d     // Catch: all -> 0x0045
            if (r0 == 0) goto L_0x0047
            java.util.Map<java.lang.String, com.taobao.android.address.model.RecommendedAddress> r0 = r0.recommendAddressMap     // Catch: all -> 0x0045
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0045
            if (r0 == 0) goto L_0x004a
            goto L_0x0047
        L_0x0045:
            r8 = move-exception
            goto L_0x0087
        L_0x0047:
            r7.z()     // Catch: all -> 0x0045
        L_0x004a:
            com.taobao.android.address.model.RecommendAddressContainer r0 = r7.d     // Catch: all -> 0x0045
            java.util.Map<java.lang.String, com.taobao.android.address.model.RecommendedAddress> r0 = r0.recommendAddressMap     // Catch: all -> 0x0045
            if (r0 == 0) goto L_0x008a
            java.util.Collection r0 = r0.values()     // Catch: all -> 0x0045
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0045
        L_0x0058:
            boolean r1 = r0.hasNext()     // Catch: all -> 0x0045
            if (r1 == 0) goto L_0x008a
            java.lang.Object r1 = r0.next()     // Catch: all -> 0x0045
            com.taobao.android.address.model.RecommendedAddress r1 = (com.taobao.android.address.model.RecommendedAddress) r1     // Catch: all -> 0x0045
            if (r1 == 0) goto L_0x0058
            com.taobao.android.address.model.AddressInfo r1 = r1.recommendedAddress     // Catch: all -> 0x0045
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r1.addressId     // Catch: all -> 0x0045
            boolean r1 = android.text.TextUtils.equals(r1, r9)     // Catch: all -> 0x0045
            if (r1 == 0) goto L_0x0058
            com.taobao.android.address.model.RecommendAddressContainer r9 = r7.d     // Catch: all -> 0x0045
            java.util.Map<java.lang.String, com.taobao.android.address.model.RecommendedAddress> r9 = r9.recommendAddressMap     // Catch: all -> 0x0045
            r9.clear()     // Catch: all -> 0x0045
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "addressInfoChange"
            r6 = 0
            r0 = r7
            r1 = r8
            r5 = r10
            r0.B(r1, r2, r3, r4, r5, r6)     // Catch: all -> 0x0045
            goto L_0x008a
        L_0x0087:
            r8.printStackTrace()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.AddressSDKDelegate.G(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b84543", new Object[]{this});
            return;
        }
        AdapterForTLog.loge("globalAddress", "clearDeliverAddress");
        this.d = new RecommendAddressContainer();
        SharedPreferences.Editor edit = this.b.edit();
        edit.clear();
        edit.apply();
    }

    public String m(String str) {
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98647322", new Object[]{this, str});
        }
        AdapterForTLog.loge("globalAddress", "enter getAllRecommendAddrData " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || (map = recommendAddressContainer.recommendAddressMap) == null || map.isEmpty()) {
            z();
        }
        String jSONString = JSON.toJSONString(this.d.recommendAddressMap);
        AdapterForTLog.loge("globalAddress", "getAllRecommendAddrData:" + jSONString);
        return jSONString;
    }

    public RecommendedAddress o(String str) {
        String str2;
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("8ae30b86", new Object[]{this, str});
        }
        AdapterForTLog.loge("globalAddress", "enterGlobalRecommendAdd " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || (map = recommendAddressContainer.recommendAddressMap) == null || map.isEmpty()) {
            z();
        }
        RecommendedAddress recommendedAddress = this.d.recommendAddressMap.get(str);
        if (recommendedAddress == null || recommendedAddress.recommendedAddress == null) {
            recommendedAddress = this.d.recommendAddressMap.get("biz_common");
        }
        if (("getGlobalRecommendAdd:" + recommendedAddress) == null) {
            str2 = "";
        } else {
            str2 = JSON.toJSONString(recommendedAddress);
        }
        AdapterForTLog.loge("globalAddress", str2);
        return recommendedAddress;
    }

    public final String p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{this, str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public final void r(String str, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae4a4c2", new Object[]{this, str, ef0Var});
        } else if (ef0Var != null) {
            RecommendedAddress o = o(str);
            if (o != null) {
                ef0Var.onSuccess(JSON.toJSONString(o));
            } else {
                ef0Var.onSuccess("");
            }
        }
    }

    public final void t(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d17bba", new Object[]{this, strArr});
        } else if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    LoginCookie parseCookie = LoginCookieUtils.parseCookie(str);
                    try {
                        CookieManager.getInstance().setCookie(LoginCookieUtils.getHttpDomin(parseCookie), parseCookie.toString());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    public final boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd76c105", new Object[]{this, str})).booleanValue();
        }
        return q(str + "_needForceRefresh", "true");
    }

    public final void x(final String str, final String str2, final String str3, final boolean z, final ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6414f8", new Object[]{this, str, str2, str3, new Boolean(z), ef0Var});
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.address.AddressSDKDelegate.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str4, Object... objArr) {
                str4.hashCode();
                int hashCode = str4.hashCode();
                throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/android/address/AddressSDKDelegate$6");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    int i = e.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i == 1) {
                        LoginBroadcastHelper.unregisterLoginReceiver(AddressSDKDelegate.c(AddressSDKDelegate.this), AddressSDKDelegate.i(AddressSDKDelegate.this));
                    } else if (i == 2 || i == 3) {
                        LoginBroadcastHelper.unregisterLoginReceiver(AddressSDKDelegate.c(AddressSDKDelegate.this), AddressSDKDelegate.i(AddressSDKDelegate.this));
                        AddressSDKDelegate.j(AddressSDKDelegate.this, context, str, str2, str3, z, false, ef0Var);
                    }
                }
            }
        };
        this.h = broadcastReceiver;
        LoginBroadcastHelper.registerLoginReceiver(this.f6283a, broadcastReceiver);
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ee7c01", new Object[]{this});
            return;
        }
        String string = this.b.getString("globalAddressKey", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.d = (RecommendAddressContainer) JSON.parseObject(string, RecommendAddressContainer.class);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.d == null) {
                RecommendAddressContainer recommendAddressContainer = new RecommendAddressContainer();
                this.d = recommendAddressContainer;
                recommendAddressContainer.recommendAddressMap = new HashMap();
            }
        }
    }

    public static int n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfc030af", new Object[]{str, str2})).intValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, str, str2);
            AdapterForTLog.loge("globalAddress", "LoginSwitch:getConfig, key=" + str + ", value=" + config);
            return Integer.parseInt(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:8:0x0046, B:10:0x004a, B:12:0x004e, B:17:0x0057, B:18:0x005a, B:20:0x006d), top: B:23:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.address.AddressSDKDelegate.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0023
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r7)
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r3 = 0
            r7[r3] = r4
            r7[r0] = r5
            r5 = 2
            r7[r5] = r6
            r5 = 3
            r7[r5] = r2
            r5 = 4
            r7[r5] = r8
            java.lang.String r5 = "1cc0c282"
            r1.ipc$dispatch(r5, r7)
            return
        L_0x0023:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "updateRecommendAddr recommendAddr = "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = ";;;bizId = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "globalAddress"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0073
            com.taobao.android.address.model.RecommendAddressContainer r1 = r4.d     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x0057
            java.util.Map<java.lang.String, com.taobao.android.address.model.RecommendedAddress> r1 = r1.recommendAddressMap     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x0057
            boolean r1 = r1.isEmpty()     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x005a
            goto L_0x0057
        L_0x0055:
            r5 = move-exception
            goto L_0x0070
        L_0x0057:
            r4.z()     // Catch: all -> 0x0055
        L_0x005a:
            java.util.concurrent.ExecutorService r1 = r4.c     // Catch: all -> 0x0055
            com.taobao.android.address.AddressSDKDelegate$c r2 = new com.taobao.android.address.AddressSDKDelegate$c     // Catch: all -> 0x0055
            r2.<init>(r5, r7, r8)     // Catch: all -> 0x0055
            r1.execute(r2)     // Catch: all -> 0x0055
            java.lang.String r5 = "deliver"
            boolean r5 = android.text.TextUtils.equals(r6, r5)     // Catch: all -> 0x0055
            if (r5 == 0) goto L_0x0073
            r4.e = r0     // Catch: all -> 0x0055
            goto L_0x0073
        L_0x0070:
            r5.printStackTrace()
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.AddressSDKDelegate.E(java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    public final boolean q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7f2a49", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, str, str2);
            AdapterForTLog.loge("globalAddress", "LoginSwitch:getConfig, key=" + str + ", value=" + config);
            return Boolean.parseBoolean(config);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void s(String str, boolean z, boolean z2, String str2, DeliverRequest deliverRequest, ef0 ef0Var) {
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce69167", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, deliverRequest, ef0Var});
            return;
        }
        try {
            String str3 = "";
            if (TextUtils.isEmpty(str2)) {
                z();
                this.d.timestamp = System.currentTimeMillis();
                RecommendAddressContainer recommendAddressContainer = this.d;
                recommendAddressContainer.locationEnabled = z;
                recommendAddressContainer.isSessionValid = Login.checkSessionValid();
                A();
                r(str, ef0Var);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString("Lat", deliverRequest == null ? str3 : deliverRequest.lat);
                if (deliverRequest != null) {
                    str3 = deliverRequest.lng;
                }
                edit.putString(DispatchConstants.LONGTITUDE, str3);
                edit.apply();
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("data");
            if (!TextUtils.isEmpty(optString) && (map = (Map) JSON.parseObject(optString, new d(this), new Feature[0])) != null) {
                this.d.timestamp = System.currentTimeMillis();
                RecommendAddressContainer recommendAddressContainer2 = this.d;
                recommendAddressContainer2.locationEnabled = z;
                recommendAddressContainer2.recommendAddressMap = map;
                recommendAddressContainer2.isSessionValid = Login.checkSessionValid();
                A();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("clientCache");
            JSONArray optJSONArray = jSONObject.optJSONArray("cookies");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("extInfo");
            String jSONObject2 = optJSONObject == null ? str3 : optJSONObject.toString();
            String jSONArray = optJSONArray == null ? str3 : optJSONArray.toString();
            String jSONObject3 = optJSONObject2 == null ? str3 : optJSONObject2.toString();
            SharedPreferences.Editor edit2 = this.b.edit();
            edit2.putString("clientCache", jSONObject2);
            edit2.putString("ccokiesKey", jSONArray);
            edit2.putString("extInfoKey", jSONObject3);
            edit2.putString("Lat", deliverRequest == null ? str3 : deliverRequest.lat);
            if (deliverRequest != null) {
                str3 = deliverRequest.lng;
            }
            edit2.putString(DispatchConstants.LONGTITUDE, str3);
            edit2.apply();
            if (TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME) || z2) {
                I(jSONObject2, jSONArray);
            }
            r(str, ef0Var);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void w(String str, String str2, String str3) {
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcdc79b", new Object[]{this, str, str2, str3});
            return;
        }
        AdapterForTLog.loge("globalAddress", "onUserSwitchAddr");
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || (map = recommendAddressContainer.recommendAddressMap) == null || map.isEmpty()) {
            z();
        }
        s(str, TextUtils.equals(str2, "location"), false, str3, null, null);
        if (TextUtils.equals(str2, "deliver")) {
            this.e = true;
        }
    }

    public final void H(TBLocationDTO tBLocationDTO, DeliverRequest deliverRequest, Context context, String str, String str2, String str3, boolean z, boolean z2, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d392748f", new Object[]{this, tBLocationDTO, deliverRequest, context, str, str2, str3, new Boolean(z), new Boolean(z2), ef0Var});
            return;
        }
        if (tBLocationDTO == null) {
            TBLocationDTO d2 = TBLocationClient.d();
            if (d2 != null) {
                deliverRequest.lat = d2.latitude;
                deliverRequest.lng = d2.longitude;
                deliverRequest.city = d2.cityName;
            }
        } else {
            deliverRequest.lat = tBLocationDTO.latitude;
            deliverRequest.lng = tBLocationDTO.longitude;
            deliverRequest.city = tBLocationDTO.cityName;
        }
        F(context, str, str2, str3, deliverRequest, z, z2, ef0Var);
    }

    public final boolean u(long j, String str, String str2) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69cd94e2", new Object[]{this, new Long(j), str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            j2 = n(str + "_recommendAddressExpireTimeV2", "-1");
        } else {
            j2 = -1;
        }
        if (j2 < 0 && !TextUtils.isEmpty(str2)) {
            j2 = n(str2 + "_recommendAddressExpireTimeV2", "-1");
        }
        if (j2 < 0) {
            j2 = n("recommendAddressExpireTimeV2", "30");
        }
        return (System.currentTimeMillis() - (j2 * 60000)) - j > 0;
    }

    public final void I(String str, String str2) {
        List parseArray;
        Map map;
        AdapterForTLog.loge("globalAddress", "updateTmallMarket clientCacheStr = " + str + ";;cookieStr=" + str2);
        try {
            if (!TextUtils.isEmpty(str) && q("refreshAddressClientCache", "true") && (map = (Map) JSON.parseObject(str, new b(this), new Feature[0])) != null && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        IpChange ipChange = m6g.$ipChange;
                        m6g.class.getMethod("updateCache", String.class, String.class, String.class, String.class).invoke(null, "LBS", entry.getKey(), entry.getValue(), "JSBRIDGE");
                    }
                }
            }
            if (!TextUtils.isEmpty(str2) && q("refreshAddressCookies", "true") && (parseArray = JSON.parseArray(str2, String.class)) != null && parseArray.size() > 0) {
                t((String[]) parseArray.toArray(new String[0]));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void k(Context context, String str, String str2, String str3, boolean z, String str4, ef0 ef0Var) {
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dce155", new Object[]{this, context, str, str2, str3, new Boolean(z), str4, ef0Var});
            return;
        }
        AdapterForTLog.loge("globalAddress", "enter asyncGetRecommendAdd " + str);
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || (map = recommendAddressContainer.recommendAddressMap) == null || map.isEmpty()) {
            z();
        }
        if (z) {
            y(context, str, str2, str3, d0m.a(context, str4), true, ef0Var);
        } else {
            B(context, str, str2, str3, str4, ef0Var);
        }
    }

    public final void y(Context context, String str, String str2, String str3, boolean z, boolean z2, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b834073e", new Object[]{this, context, str, str2, str3, new Boolean(z), new Boolean(z2), ef0Var});
            return;
        }
        AdapterForTLog.loge("globalAddress", "startSyncRecommendAddrFromRemote,eventType=" + str3 + ",hasLocation=" + z);
        this.c.execute(new a(z, str3, context, str, str2, z2, ef0Var));
    }

    public void C(Context context, String str, String str2, String str3, String str4, ef0 ef0Var) {
        CharSequence charSequence;
        Map<String, RecommendedAddress> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d910d", new Object[]{this, context, str, str2, str3, str4, ef0Var});
            return;
        }
        RecommendAddressContainer recommendAddressContainer = this.d;
        if (recommendAddressContainer == null || (map = recommendAddressContainer.recommendAddressMap) == null || map.isEmpty()) {
            z();
        }
        boolean a2 = d0m.a(context, str4);
        AdapterForTLog.loge("globalAddress", "enter syncGlobalRecommend " + str + "；;locationPermission:" + a2 + ";isUserSwitchAdd:" + this.e);
        if (TextUtils.equals(str3, "addressInfoChange") || TextUtils.equals(str3, "login")) {
            charSequence = "addressInfoChange";
            this.e = false;
            l();
        } else {
            if (v(str)) {
                if (this.e && !TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                    r(str, ef0Var);
                    return;
                } else if (TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                    this.e = false;
                }
            } else if (this.e) {
                r(str, ef0Var);
                return;
            }
            if (a2) {
                charSequence = "addressInfoChange";
                if (!u(this.d.timestamp, str, str3) && this.d.locationEnabled) {
                    AdapterForTLog.loge("globalAddress", "isDataExpire = false ");
                    if (TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                        I(this.b.getString("clientCache", ""), this.b.getString("ccokiesKey", ""));
                    }
                    r(str, ef0Var);
                    return;
                }
            } else {
                charSequence = "addressInfoChange";
                if (!u(this.d.timestamp, str, str3) && !this.d.locationEnabled) {
                    AdapterForTLog.loge("globalAddress", "isDataExpire = false ");
                    if (TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                        I(this.b.getString("clientCache", ""), this.b.getString("ccokiesKey", ""));
                    }
                    r(str, ef0Var);
                    return;
                }
            }
        }
        if (TextUtils.equals(str3, "login") && !q("requestAddressWhenLogin", "true")) {
            r(str, ef0Var);
        } else if (TextUtils.equals(str3, charSequence) && !q("requestAddressWhenAddressChange", "true")) {
            r(str, ef0Var);
        } else if (!TextUtils.isEmpty(Login.getUserId()) || !TextUtils.equals("appLaunch", str3) || !q("ingoreLBSWhenLaunch", "true")) {
            if (TextUtils.isEmpty(Login.getUserId()) && this.d.isSessionValid) {
                AdapterForTLog.loge("globalAddress", "clearDeliverAddr");
                l();
            }
            if (Login.checkSessionValid() || TextUtils.isEmpty(Login.getLoginToken())) {
                y(context, str, str2, str3, a2, false, ef0Var);
                return;
            }
            Login.login(false);
            x(str, str2, str3, a2, ef0Var);
        } else {
            r(str, ef0Var);
        }
    }

    public final void F(Context context, final String str, String str2, String str3, final DeliverRequest deliverRequest, boolean z, final boolean z2, final ef0 ef0Var) {
        HashMap hashMap;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21417539", new Object[]{this, context, str, str2, str3, deliverRequest, new Boolean(z), new Boolean(z2), ef0Var});
        } else if (z || Login.checkSessionValid() || !TextUtils.isEmpty(deliverRequest.lng) || !TextUtils.isEmpty(deliverRequest.lat)) {
            int n = n("address_traffic_limit_interval", String.valueOf(3000));
            if (z || System.currentTimeMillis() - this.f >= n) {
                if (z || System.currentTimeMillis() - this.f >= n * 5 || !this.g) {
                    try {
                        Double b2 = bbh.b(deliverRequest.lng, deliverRequest.lat, this.b.getString(DispatchConstants.LONGTITUDE, ""), this.b.getString("Lat", ""));
                        AdapterForTLog.loge("globalAddress", "updateRecommendAddressFromRemote distance = " + b2);
                        int n2 = n("forceRequestInterval", "1440");
                        if (!z && b2 != null && q("checkDistanceThreshold", "true") && b2.doubleValue() < n("distanceThreshold", "300") && System.currentTimeMillis() - this.d.timestamp < n2 * 60000) {
                            if (ef0Var != null) {
                                ef0Var.onFail(103, "间隔过近，不需要刷新");
                                return;
                            }
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                    AdapterForTLog.loge("globalAddress", "updateRecommendAddressFromRemote");
                    String string = this.b.getString("extInfoKey", "");
                    try {
                        if (TextUtils.isEmpty(string)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(string);
                        }
                        jSONObject.put("bizIdentity", str);
                        jSONObject.put("channel", str2);
                        if (TextUtils.equals(str, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME)) {
                            jSONObject.put("eventType", "enterSearch");
                        } else if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("eventType", str3);
                        } else {
                            jSONObject.put("eventType", "nativeInvoke");
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    deliverRequest.extInfo = string;
                    this.f = System.currentTimeMillis();
                    this.g = true;
                    if (q("lbs_pull_flow_control", "true")) {
                        String p = p("lbs_pull_flow_control_info", "group=guide");
                        if (!TextUtils.isEmpty(p)) {
                            hashMap = new HashMap();
                            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "mbis");
                            if (!TextUtils.isEmpty(str)) {
                                p = p + ";biz_identity=" + str;
                            }
                            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, p);
                            gs6.b(this.f6283a, deliverRequest, hashMap, new IRemoteBaseListener() { // from class: com.taobao.android.address.AddressSDKDelegate.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                /* compiled from: Taobao */
                                /* renamed from: com.taobao.android.address.AddressSDKDelegate$2$a */
                                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
                                public class a implements Runnable {
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    /* renamed from: a  reason: collision with root package name */
                                    public final /* synthetic */ String f6284a;

                                    public a(String str) {
                                        this.f6284a = str;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange = $ipChange;
                                        if (ipChange instanceof IpChange) {
                                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        AnonymousClass2 r1 = AnonymousClass2.this;
                                        AddressSDKDelegate.g(AddressSDKDelegate.this, str, z2, false, this.f6284a, deliverRequest, ef0Var);
                                        AddressSDKDelegate.h(AddressSDKDelegate.this, false);
                                    }
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                                    ef0 ef0Var2 = ef0Var;
                                    if (ef0Var2 != null) {
                                        ef0Var2.onFail(104, "网络异常");
                                    }
                                    AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onError = " + i);
                                    AddressSDKDelegate.f(AddressSDKDelegate.this);
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                        return;
                                    }
                                    AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                                    if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                                        try {
                                            String optString = mtopResponse.getDataJsonObject().optString("returnValue");
                                            AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote returnValue = " + optString);
                                            AddressSDKDelegate.this.c.execute(new a(optString));
                                        } catch (Throwable th2) {
                                            ef0 ef0Var2 = ef0Var;
                                            if (ef0Var2 != null) {
                                                ef0Var2.onSuccess("");
                                            }
                                            th2.printStackTrace();
                                        }
                                    }
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onSystemError = " + i);
                                    ef0 ef0Var2 = ef0Var;
                                    if (ef0Var2 != null) {
                                        ef0Var2.onFail(104, "网络异常");
                                    }
                                    AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                                    AddressSDKDelegate.f(AddressSDKDelegate.this);
                                }
                            });
                        }
                    }
                    hashMap = null;
                    gs6.b(this.f6283a, deliverRequest, hashMap, new IRemoteBaseListener() { // from class: com.taobao.android.address.AddressSDKDelegate.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* compiled from: Taobao */
                        /* renamed from: com.taobao.android.address.AddressSDKDelegate$2$a */
                        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
                        public class a implements Runnable {
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: a  reason: collision with root package name */
                            public final /* synthetic */ String f6284a;

                            public a(String str) {
                                this.f6284a = str;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                AnonymousClass2 r1 = AnonymousClass2.this;
                                AddressSDKDelegate.g(AddressSDKDelegate.this, str, z2, false, this.f6284a, deliverRequest, ef0Var);
                                AddressSDKDelegate.h(AddressSDKDelegate.this, false);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                            ef0 ef0Var2 = ef0Var;
                            if (ef0Var2 != null) {
                                ef0Var2.onFail(104, "网络异常");
                            }
                            AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onError = " + i);
                            AddressSDKDelegate.f(AddressSDKDelegate.this);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                            if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                                try {
                                    String optString = mtopResponse.getDataJsonObject().optString("returnValue");
                                    AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote returnValue = " + optString);
                                    AddressSDKDelegate.this.c.execute(new a(optString));
                                } catch (Throwable th2) {
                                    ef0 ef0Var2 = ef0Var;
                                    if (ef0Var2 != null) {
                                        ef0Var2.onSuccess("");
                                    }
                                    th2.printStackTrace();
                                }
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            AdapterForTLog.loge("globalAddress", "updateRecommendAddrFromRemote onSystemError = " + i);
                            ef0 ef0Var2 = ef0Var;
                            if (ef0Var2 != null) {
                                ef0Var2.onFail(104, "网络异常");
                            }
                            AddressSDKDelegate.e(AddressSDKDelegate.this, false);
                            AddressSDKDelegate.f(AddressSDKDelegate.this);
                        }
                    });
                } else if (ef0Var != null) {
                    ef0Var.onFail(102, "调用频繁");
                }
            } else if (ef0Var != null) {
                ef0Var.onFail(102, "调用频繁");
            }
        } else {
            AdapterForTLog.loge("globalAddress", "AddrFromRemote no lbs");
            if (ef0Var != null) {
                ef0Var.onFail(101, "没有登录态和LBS，不更新");
            }
        }
    }
}
