package a.a.a.a.a.a.a.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDCoreSDK;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.rpc.model.IifaaClientRequest;
import com.alipay.android.phone.iifaa.did.rpc.service.IifaaDidService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.taobao.login4android.api.Login;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONTokener;
import tb.asx;
import tb.aux;
import tb.h7r;
import tb.kpw;
import tb.lsx;
import tb.lux;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a extends kpw {

    /* compiled from: Taobao */
    /* renamed from: a.a.a.a.a.a.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class RunnableC0002a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1752a;
        public final /* synthetic */ WVCallBackContext b;

        public RunnableC0002a(String str, WVCallBackContext wVCallBackContext) {
            this.f1752a = str;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(JSON.parseObject(this.f1752a), this.b);
        }
    }

    public final String a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("tb_sid", Login.getSid());
        String str = Build.BRAND;
        hashMap.put("brand", str);
        hashMap.put(h7r.DEVICE_MODEL, Build.MODEL);
        hashMap.put("os_type", str);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("app_name", context.getPackageName());
        try {
            hashMap.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return JSON.toJSONString(hashMap);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        if (!"didProcessCmd".equals(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        new Thread(new RunnableC0002a(str2, wVCallBackContext), "IifaaDidTBJsBridge").start();
        return true;
    }

    public final void a(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject2;
        long currentTimeMillis = System.currentTimeMillis();
        String string = jSONObject.getString("action");
        string.hashCode();
        if (string.equals("initDID")) {
            jSONObject2 = ((asx) DIDCoreSDK.getTrustedCertService()).g(getContext(), jSONObject);
        } else if (!string.equals("fetchVerifiableCredentialsAndDisclose")) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("resultCode", (Object) DIDResult.a.WRONG_PARAMS);
            jSONObject2.put("message", (Object) "wrong params");
        } else {
            jSONObject2 = ((asx) DIDCoreSDK.getTrustedCertService()).a(getContext(), jSONObject);
        }
        nsw nswVar = new nsw();
        try {
            nswVar.h(new org.json.JSONObject(new JSONTokener(jSONObject2.toJSONString())));
        } catch (JSONException e) {
            nswVar.a("resultCode", DIDResult.a.FAILED_EXCP);
            nswVar.b("message", "结果 JSON 转换异常");
            e.printStackTrace();
        }
        lux a2 = lux.a();
        a2.c("IifaaDidTBJsBridge", "processIfaaDIDCmd action:" + string + "\nresult:" + nswVar.m());
        wVCallBackContext.success(nswVar);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        HashMap hashMap = new HashMap();
        hashMap.put("action", string);
        hashMap.put("resultCode", jSONObject2.getString("resultCode"));
        hashMap.put("message", jSONObject2.getString("message"));
        hashMap.put("time_cost", String.valueOf(currentTimeMillis2));
        String d = lsx.d();
        if (!TextUtils.isEmpty(d)) {
            hashMap.put(MtopConnection.KEY_DID, d);
        }
        String string2 = jSONObject.getString("token");
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("biz_token", string2);
        }
        Context context = getContext();
        try {
            hashMap.put("ext_info", a(context));
            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context.getApplicationContext());
            IifaaDidService iifaaDidService = (IifaaDidService) mpaasRpcServiceImpl.getRpcProxy(IifaaDidService.class);
            mpaasRpcServiceImpl.getRpcInvokeContext(iifaaDidService).setGwUrl(aux.b().a(context.getApplicationContext()));
            IifaaClientRequest iifaaClientRequest = new IifaaClientRequest();
            iifaaClientRequest.clientLog = JSON.toJSONString(hashMap);
            lux a3 = lux.a();
            a3.d("IifaaDidTBJsBridge", "request: " + JSON.toJSONString(iifaaClientRequest));
            boolean clientLogDispatch = iifaaDidService.clientLogDispatch(iifaaClientRequest);
            lux a4 = lux.a();
            a4.d("IifaaDidTBJsBridge", "resp: " + clientLogDispatch);
        } catch (Exception e2) {
            lux.a().b("IifaaDidTBJsBridge", "事件上报接口请求异常");
            lux.a().b("IifaaDidTBJsBridge", e2.getLocalizedMessage());
        }
    }
}
