package com.taobao.linkmanager.afc.reduction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.ut.mini.UTAnalytics;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ah0;
import tb.ai7;
import tb.ajh;
import tb.c0c;
import tb.c21;
import tb.i4j;
import tb.i6j;
import tb.kkd;
import tb.pg1;
import tb.t2o;
import tb.uih;
import tb.vp9;
import tb.zih;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginReductionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements i6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10907a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ HashMap d;

        public a(Context context, boolean z, String str, HashMap hashMap) {
            this.f10907a = context;
            this.b = z;
            this.c = str;
            this.d = hashMap;
        }

        @Override // tb.i6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
            } else {
                LoginReductionManager.a(LoginReductionManager.this, jSONObject, this.f10907a, this.b, this.c);
            }
        }

        @Override // tb.i6j
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            vp9.a("linkx", "LoginReductionManager === onError === 请求失败:" + jSONObject + " 错误码：" + str);
            this.d.put("errMsg", str);
            ah0.d("afc_reduct_request_result", "fail", "", this.d);
        }

        @Override // tb.i6j
        public void c(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7369b0e", new Object[]{this, mtopResponse, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements kkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AfcReductResult f10908a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;

        public b(AfcReductResult afcReductResult, String str, Context context, boolean z, String str2) {
            this.f10908a = afcReductResult;
            this.b = str;
            this.c = context;
            this.d = z;
            this.e = str2;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1148a834", new Object[]{this, str});
                return;
            }
            String url = this.f10908a.getUrl();
            if (!TextUtils.equals("2200803434242", this.b) || TextUtils.isEmpty(str)) {
                str = url;
            }
            LoginReductionManager.c(LoginReductionManager.this, this.c, str, this.b, LoginReductionManager.b(LoginReductionManager.this, this.c, str));
            LoginReductionManager.d(LoginReductionManager.this, str, this.b, this.d, this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final LoginReductionManager f10910a = new LoginReductionManager(null);

        static {
            t2o.a(744489020);
        }

        public static /* synthetic */ LoginReductionManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginReductionManager) ipChange.ipc$dispatch("5c1cc267", new Object[0]);
            }
            return f10910a;
        }
    }

    static {
        t2o.a(744489014);
    }

    public /* synthetic */ LoginReductionManager(a aVar) {
        this();
    }

    public static /* synthetic */ void a(LoginReductionManager loginReductionManager, JSONObject jSONObject, Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9df1b93", new Object[]{loginReductionManager, jSONObject, context, new Boolean(z), str});
        } else {
            loginReductionManager.k(jSONObject, context, z, str);
        }
    }

    public static /* synthetic */ boolean b(LoginReductionManager loginReductionManager, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401e2274", new Object[]{loginReductionManager, context, str})).booleanValue();
        }
        return loginReductionManager.p(context, str);
    }

    public static /* synthetic */ void c(LoginReductionManager loginReductionManager, Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0819db", new Object[]{loginReductionManager, context, str, str2, new Boolean(z)});
        } else {
            loginReductionManager.r(context, str, str2, z);
        }
    }

    public static /* synthetic */ void d(LoginReductionManager loginReductionManager, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a386a26", new Object[]{loginReductionManager, str, str2, new Boolean(z), str3});
        } else {
            loginReductionManager.o(str, str2, z, str3);
        }
    }

    public static /* synthetic */ void e(LoginReductionManager loginReductionManager, Context context, LoginResultBean loginResultBean, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d86ad2c", new Object[]{loginReductionManager, context, loginResultBean, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            loginReductionManager.m(context, loginResultBean, str, str2, z, z2);
        }
    }

    public static /* synthetic */ Map f(LoginReductionManager loginReductionManager, Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f1a06b", new Object[]{loginReductionManager, context, str, str2, new Boolean(z), new Boolean(z2)});
        }
        return loginReductionManager.h(context, str, str2, z, z2);
    }

    public static LoginReductionManager l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginReductionManager) ipChange.ipc$dispatch("38e60822", new Object[0]);
        }
        return e.a();
    }

    public final com.alibaba.fastjson.JSONObject i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("ebd8c88e", new Object[]{this, context});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                float f = c21.g().getFloat(ai7.KEY_DISPLAY_DENSITY, 0.0f);
                jSONObject.put("width", (Object) String.valueOf((int) Math.ceil(TFCCommonUtils.v(i))));
                jSONObject.put("height", (Object) String.valueOf((int) Math.ceil(TFCCommonUtils.v(i2))));
                jSONObject.put("scale", (Object) s(String.valueOf(f)));
                jSONObject.put("version", (Object) Build.VERSION.RELEASE);
                jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) Build.MODEL);
            }
        } catch (Throwable unused) {
            vp9.b("linkx", "LoginReductionManager.getDeviceInfoParam.error.");
        }
        return jSONObject;
    }

    public LoginResultBean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginResultBean) ipChange.ipc$dispatch("56a1f9c9", new Object[]{this, str});
        }
        LoginResultBean loginResultBean = new LoginResultBean();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY)) {
                loginResultBean.loginToken = (String) jSONObject.get(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
            }
            if (jSONObject.has("h5Data")) {
                String str2 = (String) jSONObject.get("h5Data");
                if (!TextUtils.isEmpty(str2)) {
                    loginResultBean.landingUrl = (String) new JSONObject(str2).get("url");
                }
            }
            if (jSONObject.has("source")) {
                loginResultBean.source = (String) jSONObject.get("source");
            }
        } catch (JSONException e2) {
            vp9.b("linkx", "LoginReductionManager === getLoginInfoBean === 解析免登信息异常：" + e2);
        }
        return loginResultBean;
    }

    public final void q(Context context, final String str, final String str2, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f199be0a", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.reduction.LoginReductionManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/reduction/LoginReductionManager$4");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    vp9.a("linkx", "LoginReductionManager === registerLoginCallBack === 登录广播回调，intent：" + intent);
                    if (intent != null) {
                        Map f = LoginReductionManager.f(LoginReductionManager.this, context2, str, str2, z, z2);
                        int i = d.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            ah0.d("afc_auto_login_result", "true", "", f);
                        } else if (i == 2) {
                            ah0.d("afc_auto_login_result", "false", "", f);
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                        vp9.a("linkx", "LoginReductionManager === registerLoginCallBack === 广播解注册了");
                    }
                }
            });
        }
    }

    public final String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6be50c3c", new Object[]{this, str});
        }
        return zih.a(new BigDecimal(str)).toPlainString();
    }

    public LoginReductionManager() {
    }

    public void g(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec083fc7", new Object[]{this, context, new Boolean(z)});
            return;
        }
        String x = AfcUtils.x(context);
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.j(TbFcLinkInit.instance().mApplication != null ? TbFcLinkInit.instance().mApplication.getApplicationContext() : null, false));
        hashMap.put("deviceId2", TFCCommonUtils.k(TbFcLinkInit.instance().mApplication));
        hashMap.put("isAfc", z + "");
        hashMap.put("growthWord", x);
        hashMap.put("deviceInfo", i(context).toJSONString());
        hashMap.put("isActivation", String.valueOf(AfcUtils.s(context)));
        hashMap.put("mediaType", Build.BRAND);
        String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        if (!TextUtils.isEmpty(globalProperty)) {
            hashMap.put("afcId", globalProperty);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("requestParams", hashMap.toString());
        ah0.d("afc_reduct_before_request", "", "", hashMap2);
        vp9.a("linkx", "LoginReductionManager === executeLogin === 请求参数:" + hashMap);
        i4j.b().d(TBLinkRequest.REDUCTION_LOGIN_API, "1.0", hashMap, false, new a(context, z, x, hashMap), new Handler(zsa.b.f32989a.getLooper()), 4000);
    }

    public final Map<String, String> h(Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33403183", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.j(context, false));
        hashMap.put("deviceId2", TFCCommonUtils.k(context));
        hashMap.put("userId", Login.getUserId());
        hashMap.put("adId", str);
        hashMap.put("channel", str2);
        hashMap.put("isAfc", z + "");
        hashMap.put("isAutoLogin", z2 + "");
        return hashMap;
    }

    public final void m(Context context, LoginResultBean loginResultBean, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496d5935", new Object[]{this, context, loginResultBean, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            q(context, str, str2, z, z2);
            Bundle bundle = new Bundle();
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, loginResultBean.loginToken);
            bundle.putString("source", loginResultBean.source);
            Login.login(false, bundle);
            vp9.a("linkx", "LoginReductionManager === loginFree === 开始免登");
        } catch (Throwable th) {
            vp9.b("linkx", "LoginReductionManager === loginFree === 免登或者导航数据解析异常：" + th);
        }
    }

    public void n(Context context, String str, String str2, boolean z, boolean z2, kkd kkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805936eb", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2), kkdVar});
            return;
        }
        vp9.a("linkx", "LoginReductionManager === loginWithToken === 开始aidl获取免登信息");
        uih.f().d(context, new c(context, str, str2, z, z2, kkdVar));
    }

    public final boolean p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e2704ff", new Object[]{this, context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            vp9.a("linkx", "LoginReductionManager === reductionNav === 还原URL为空，不导航");
            return false;
        }
        boolean uri = Nav.from(context).toUri(str);
        vp9.a("linkx", "LoginReductionManager === reductionNav === 导航：" + uri);
        return uri;
    }

    public final void r(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d73c94", new Object[]{this, context, str, str2, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.j(context, false));
        hashMap.put("deviceId2", TFCCommonUtils.k(context));
        hashMap.put("userId", Login.getUserId());
        hashMap.put("channel", str2);
        hashMap.put("url", str);
        ah0.d("afc_reduct_result", z + "", "", hashMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements ajh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10909a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ kkd f;

        public c(Context context, String str, String str2, boolean z, boolean z2, kkd kkdVar) {
            this.f10909a = context;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = z2;
            this.f = kkdVar;
        }

        @Override // tb.ajh
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63008921", new Object[]{this, str});
                return;
            }
            vp9.a("linkx", "LoginReductionManager === loginWithToken === 获取到的免登信息：" + str);
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                LoginResultBean j = LoginReductionManager.this.j(str);
                String str3 = j.landingUrl;
                LoginReductionManager.e(LoginReductionManager.this, this.f10909a, j, this.b, this.c, this.d, this.e);
                ah0.d("afc_auto_login_start", str2, str2, LoginReductionManager.f(LoginReductionManager.this, this.f10909a, this.b, this.c, this.d, this.e));
                str2 = str3;
            }
            kkd kkdVar = this.f;
            if (kkdVar != null) {
                ((b) kkdVar).a(str2);
            }
        }
    }

    public final void o(String str, String str2, boolean z, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5f58f6", new Object[]{this, str, str2, new Boolean(z), str3});
            return;
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (!TextUtils.isEmpty(globalProperty)) {
                String[] split = globalProperty.split(c0c.UNESCAPED_SEPARATOR);
                if (split.length >= 4) {
                    if (!TextUtils.isEmpty(str2)) {
                        split[1] = str2;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains("bc_fl_src")) {
                            String queryParameter = Uri.parse(str).getQueryParameter("bc_fl_src");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                split[2] = queryParameter;
                            }
                        } else {
                            if (z) {
                                str4 = "growthWord";
                            } else {
                                str4 = "dahanghai";
                            }
                            split[2] = str4;
                        }
                    }
                    String p = AfcUtils.p(Arrays.asList(split), "^");
                    UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("_afc_id", p);
                    vp9.a("linkx", "LoginReductionManager === reWriteAfcId === _afc_id：" + p);
                }
            }
        } catch (Exception e2) {
            vp9.b("linkx", "LoginReductionManager === reWriteAfcId === 重写afc_id异常：" + e2);
        }
    }

    public final void k(JSONObject jSONObject, Context context, boolean z, String str) {
        AfcReductResult afcReductResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10c1450", new Object[]{this, jSONObject, context, new Boolean(z), str});
            return;
        }
        vp9.a("linkx", "LoginReductionManager === onSuccess === 返回结果:" + jSONObject);
        if (jSONObject != null && (afcReductResult = (AfcReductResult) JSON.parseObject(jSONObject.toString(), AfcReductResult.class)) != null) {
            boolean isAutoLogin = afcReductResult.isAutoLogin();
            String channel = afcReductResult.getChannel();
            boolean isIsGrowthWord = afcReductResult.isIsGrowthWord();
            String adid = afcReductResult.getAdid();
            Map<String, String> h = h(context, adid, channel, z, isAutoLogin);
            h.put("url", afcReductResult.getUrl());
            h.put("type", String.valueOf(afcReductResult.getType()));
            ah0.d("afc_reduct_request_result", "success", "", h);
            if (isAutoLogin) {
                ah0.d("afc_auto_login", "", "", h(context, adid, channel, z, true));
                n(context, adid, channel, z, true, new b(afcReductResult, channel, context, isIsGrowthWord, str));
                return;
            }
            vp9.a("linkx", "LoginReductionManager === onSuccess === 不需要免登，开始还原");
            String url = afcReductResult.getUrl();
            r(context, url, channel, p(context, url));
            o(url, channel, isIsGrowthWord, str);
        }
    }
}
