package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.orange.OrangeConfig;
import com.taobao.walle.bridge.CppApiBridge;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.internal.config.ConfigServiceNative;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.o0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v24 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CommBridge";

    /* renamed from: a  reason: collision with root package name */
    public static v24 f29742a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(1034944527);
        new JSONObject();
    }

    public static synchronized v24 e() {
        synchronized (v24.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v24) ipChange.ipc$dispatch("2db6fa7a", new Object[0]);
            }
            if (f29742a == null) {
                f29742a = new v24();
            }
            return f29742a;
        }
    }

    public void a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7bcb92", new Object[]{this, str, wVCallBackContext});
            return;
        }
        gtf.i().h().execute(new b());
        try {
            if (TextUtils.equals(new org.json.JSONObject(str).optString("betaSwitch"), "true")) {
                cxw.b("WalleBridge", "betaOn", "true");
                b();
            } else {
                cxw.b("WalleBridge", "betaOn", "false");
            }
            wVCallBackContext.success("set switch success!!!");
        } catch (Throwable unused) {
            wVCallBackContext.error("set switch failed!!!");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8acfef9", new Object[]{this});
        } else if ("true".equals(cxw.a("WalleBridge", "betaOn"))) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "betaSwitch");
            DAI.runComputeByAlias("LoadTaskBridge#Start", hashMap, new a(this));
        }
    }

    public void c(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22c7f35", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(cxw.a("WalleBridge", "betaOn"));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!equals) {
                str2 = "false";
            }
            jSONObject.put("resultData", str2);
            nsw nswVar = new nsw();
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
        } catch (Throwable unused) {
            wVCallBackContext.error("get beta switch error!!!");
        }
    }

    public void d(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3683bea2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!equals) {
                str2 = "false";
            }
            jSONObject.put("resultData", str2);
            nsw nswVar = new nsw();
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
        } catch (Throwable unused) {
            wVCallBackContext.error("getFeatureUploadAllSwitch switch error!!!");
        }
    }

    public final HashMap f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8290edde", new Object[]{this, str});
        }
        return qow.a(str);
    }

    public void g(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b243772", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String optString = jSONObject.optString("groupName");
            String optString2 = jSONObject.optString("key");
            if (TextUtils.isEmpty(optString2)) {
                str2 = OrangeConfig.getInstance().getCustomConfig(optString, "");
            } else {
                str2 = OrangeConfig.getInstance().getConfig(optString, optString2, "");
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("resultData", str2);
            nsw nswVar = new nsw();
            nswVar.h(jSONObject2);
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error("get Orange Config Error!!!");
        }
    }

    public void h(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899f3ced", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            h45 registeredModelForSceneName = DAI.getRegisteredModelForSceneName(new org.json.JSONObject(str).optString("sceneName"));
            if (registeredModelForSceneName != null) {
                String str2 = "" + registeredModelForSceneName.b;
                String str3 = registeredModelForSceneName.d;
                String h = registeredModelForSceneName.h();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(r4p.KEY_IS_BETA, str2);
                jSONObject.put("condition", str3);
                jSONObject.put("solutionName", h);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("resultData", jSONObject);
                nsw nswVar = new nsw();
                nswVar.h(jSONObject2);
                wVCallBackContext.success(nswVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void k(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73e5bae", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(new org.json.JSONObject(str).optString("featureUploadAllSwitch"));
            TaskManager.getInstance().setDevicePreviewEnabled(equals);
            vxa.k(equals);
            if (!equals) {
                str2 = "false";
            }
            DAIKVStoreage.put("JARVIS", "featureUploadAllSwitch", str2);
            wVCallBackContext.success("setFeatureUploadAllSwitch success!!!");
        } catch (Throwable unused) {
            wVCallBackContext.error("setFeatureUploadAllSwitch failed!!!");
        }
    }

    public void l(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6df561", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ConfigServiceNative.a(str, 4);
        wVCallBackContext.success();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(v24 v24Var) {
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
            } else {
                Log.e("DAITest", "call Beta task error");
            }
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            new StringBuilder("betaSwitchInner is ").append(JSON.toJSONString(objArr));
            if (objArr != null && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof HashMap) {
                    String valueOf = String.valueOf(((HashMap) obj).get("result"));
                    if (!TextUtils.isEmpty(valueOf)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("beta_config", valueOf);
                        CppApiBridge.b().a("ScenesManager#SetBetaConfig", hashMap);
                    }
                }
            }
        }
    }

    public void j(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff76536", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String c = sd8.c(Base64.decode(new org.json.JSONObject(str).optString("zipString"), 0));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("resultData", c);
            nsw nswVar = new nsw();
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void i(String str, WVCallBackContext wVCallBackContext) {
        Exception e;
        String str2;
        Object obj;
        String str3 = "walle是否启动";
        String str4 = "des";
        String str5 = "name";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a983af18", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            Map<String, Object> statusInfo = DAI.getStatusInfo();
            String optString = new org.json.JSONObject(str).optString(BaseMnnRunUnit.KEY_TASK_NAME);
            nsw nswVar = new nsw();
            JSONArray jSONArray = new JSONArray();
            boolean booleanValue = ((Boolean) statusInfo.get(Constant.API_PARAMS_KEY_ENABLE)).booleanValue();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str5, "环境初始化");
                jSONObject.put("status", "finish");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("overallInfo", "环境开关已全部开启");
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put(str5, "isStarted");
                jSONObject4.put("value", booleanValue);
                jSONObject4.put(str4, str3);
                Iterator<Map.Entry<String, Object>> it = statusInfo.entrySet().iterator();
                org.json.JSONObject jSONObject5 = jSONObject;
                JSONArray jSONArray3 = jSONArray;
                while (it.hasNext()) {
                    Map.Entry<String, Object> next = it.next();
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    jSONObject6.put(str5, next.getKey());
                    if (!"models".equals(next.getKey()) && next.getValue() != null) {
                        if ("true".equals(next.getValue().toString())) {
                            jSONObject6.put("value", true);
                        } else if ("false".equals(next.getValue().toString())) {
                            jSONObject6.put("value", false);
                        } else if (next.getValue() instanceof Map) {
                            jSONObject6.put("value", new JSONObject((Map) next.getValue()).toString());
                        } else {
                            jSONObject6.put("value", next.getValue().toString());
                        }
                        jSONObject6.put("description", "");
                        jSONArray2.put(jSONObject6);
                    }
                    jSONArray3 = jSONArray3;
                    jSONObject5 = jSONObject5;
                    jSONObject2 = jSONObject2;
                    str3 = str3;
                    it = it;
                    str4 = str4;
                    str5 = str5;
                }
                jSONObject3.put("items", jSONArray2);
                jSONObject3.put(Constant.API_PARAMS_KEY_ENABLE, booleanValue);
                jSONObject3.put("sectionTitle", "walle");
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(v82.ORANGE_GROUP_NAME);
                JSONArray jSONArray4 = new JSONArray();
                org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                jSONObject8.put(str5, "isStarted");
                jSONObject8.put("value", true);
                jSONObject8.put(str4, str3);
                for (Iterator<Map.Entry<String, String>> it2 = configs.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                    Map.Entry<String, String> next2 = it2.next();
                    org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                    jSONObject9.put(str5, next2.getKey());
                    if (!o0r.b.K_BIZARGS_CONFIG.equals(next2.getKey()) && !o0r.a.K_BEHAVIX_CONFIG.equals(next2.getKey())) {
                        if ("true".equals(next2.getValue())) {
                            jSONObject9.put("value", true);
                        } else if ("false".equals(next2.getValue())) {
                            jSONObject9.put("value", false);
                        } else {
                            jSONObject9.put("value", next2.getValue());
                        }
                        jSONObject9.put("description", "");
                        jSONArray4.put(jSONObject9);
                    }
                }
                boolean z = false;
                jSONObject7.put("items", jSONArray4);
                jSONObject7.put(Constant.API_PARAMS_KEY_ENABLE, true);
                jSONObject7.put("sectionTitle", "BehaviX");
                JSONArray jSONArray5 = new JSONArray();
                jSONArray5.put(jSONObject3);
                jSONArray5.put(jSONObject7);
                jSONObject2.put("submodule", jSONArray5);
                jSONObject5.put("content", jSONObject2);
                jSONArray3.put(jSONObject5);
                HashMap f = f(optString);
                org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                if (f != null) {
                    org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                    jSONObject13.put("overallInfo", "register成功");
                    jSONObject13.put("data", new JSONArray());
                    jSONObject10.put(str5, "register");
                    jSONObject10.put("status", "finish");
                    jSONObject10.put("content", jSONObject13);
                    jSONArray3.put(jSONObject10);
                    org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                    Boolean bool = (Boolean) f.get(qow.MODEL_STATUS_KEY_TRIGGER);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    if (z) {
                        str2 = "trigger成功";
                    } else {
                        str2 = "没有触发过";
                    }
                    jSONObject14.put("overallInfo", str2);
                    jSONObject14.put("data", new JSONArray());
                    Object obj2 = "wait";
                    jSONObject11.put("status", z ? "finish" : obj2);
                    jSONObject11.put(str5, "trigger");
                    jSONObject11.put("content", jSONObject14);
                    jSONArray3.put(jSONObject11);
                    String str6 = (String) f.get(qow.MODEL_STATUS_KEY_LAST_RUN_TIME);
                    org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                    if (str6 != null) {
                        obj2 = "finish";
                    }
                    if (str6 != null) {
                        obj = "运行时间" + str6;
                    } else {
                        obj = "未运行";
                    }
                    jSONObject15.put("overallInfo", obj);
                    JSONArray jSONArray6 = new JSONArray();
                    String str7 = (String) f.get(qow.MODEL_STATUS_KEY_LAST_ERROR);
                    if (!TextUtils.isEmpty(str7)) {
                        org.json.JSONObject jSONObject16 = new org.json.JSONObject();
                        jSONObject16.put(str5, "运行错误");
                        jSONObject16.put("value", str7);
                        jSONObject16.put("description", "model run failed");
                        jSONArray6.put(jSONObject16);
                    }
                    jSONObject15.put("data", jSONArray6);
                    jSONObject12.put(str5, "walle运行");
                    jSONObject12.put("status", obj2);
                    jSONObject12.put("content", jSONObject15);
                    jSONArray3.put(jSONObject12);
                } else {
                    org.json.JSONObject jSONObject17 = new org.json.JSONObject();
                    jSONObject17.put("overallInfo", "没有注册");
                    jSONObject17.put("data", new JSONArray());
                    jSONObject10.put(str5, "register");
                    jSONObject10.put("status", "error");
                    jSONObject10.put("content", jSONObject17);
                    jSONArray3.put(jSONObject10);
                }
                org.json.JSONObject jSONObject18 = new org.json.JSONObject();
                jSONObject18.put("data", jSONArray3);
                nswVar.h(jSONObject18);
                wVCallBackContext.success(nswVar);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
