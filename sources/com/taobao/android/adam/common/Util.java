package com.taobao.android.adam.common;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.c8;
import tb.i19;
import tb.k8;
import tb.n8;
import tb.o58;
import tb.t2o;
import tb.u55;
import tb.u8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Util {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_ENGINE = "ViewEngine";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface LoadingType {
        public static final String API_HIDE = "hideLoading";
        public static final String API_SHOW = "showLoading";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface TaoSettingType {
        public static final String AUTO_PLAY_VIDEO = "autoPlayVideo";
        public static final String TAO_PASS_WORD_CUT_OPEN = "taoPassWordCutOpen";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            }
        }
    }

    static {
        t2o.a(350224404);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88c28498", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("adam_android", "downloadOptimize", "false"));
    }

    public static HashMap<String, String> c(String str, String str2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4434e849", new Object[]{str, str2, dXRuntimeContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("from", str);
        hashMap.put("eventName", str2);
        String str3 = "";
        hashMap.put("bizCode", dXRuntimeContext == null ? str3 : dXRuntimeContext.c());
        if (!(dXRuntimeContext == null || dXRuntimeContext.p() == null)) {
            str3 = dXRuntimeContext.p().f7343a;
        }
        hashMap.put("template", str3);
        return hashMap;
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("514875c3", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showLoading", (Object) "false");
        jSONObject.put("renderType", (Object) "downloadFirst");
        jSONObject.put("readCurTemplate", (Object) "true");
        return jSONObject;
    }

    public static u55 e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("fb481866", new Object[]{dXRuntimeContext});
        }
        ViewEngine k = k(dXRuntimeContext);
        if (k != null) {
            return k.N().d();
        }
        return null;
    }

    public static JSONObject g(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3851530b", new Object[]{str, dXRuntimeContext});
        }
        if (TextUtils.isEmpty(str) || dXRuntimeContext == null || dXRuntimeContext.q() == null) {
            return null;
        }
        return h(str, e(dXRuntimeContext));
    }

    public static JSONObject h(String str, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5c685fc", new Object[]{str, u55Var});
        }
        if (u55Var == null) {
            return null;
        }
        IDMComponent componentByName = u55Var.getComponentByName(str);
        if (componentByName != null) {
            return componentByName.getContainerInfo();
        }
        JSONObject j = j(str, u55Var);
        o58 i = i(j == null ? null : j.getString("type"), u55Var);
        if (i == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) i.f25148a);
        jSONObject.put("name", (Object) i.c);
        jSONObject.put("version", (Object) i.e);
        jSONObject.put("url", (Object) i.d);
        jSONObject.put("md5", (Object) i.f);
        return jSONObject;
    }

    public static o58 i(String str, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o58) ipChange.ipc$dispatch("e20e421", new Object[]{str, u55Var});
        }
        if (!TextUtils.isEmpty(str) && u55Var != null && u55Var.h() != null && !u55Var.h().isEmpty()) {
            for (o58 o58Var : u55Var.h()) {
                JSONArray jSONArray = o58Var.f25148a;
                if (jSONArray != null && jSONArray.contains(str)) {
                    return o58Var;
                }
            }
        }
        return null;
    }

    public static JSONObject j(String str, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a29d551", new Object[]{str, u55Var});
        }
        if (TextUtils.isEmpty(str) || u55Var == null || u55Var.r() == null) {
            return null;
        }
        return u55Var.r().getJSONObject(str);
    }

    public static ViewEngine k(DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewEngine) ipChange.ipc$dispatch("b694d65b", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            obj = null;
        } else {
            obj = dXRuntimeContext.q();
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("ViewEngine");
            if (obj2 instanceof ViewEngine) {
                return (ViewEngine) obj2;
            }
        }
        return null;
    }

    public static void l(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63b606", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject2 != null) {
            i19.c(jSONObject, jSONObject2);
        }
    }

    public static void m(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a0188e", new Object[]{str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Adam", 2201, "Page_Adam_" + str, null, null, map).build());
    }

    public static void n(Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad93e22", new Object[]{context, dinamicXEngine, str});
        } else if (context != null) {
            n8 n8Var = new n8(str, new JSONObject());
            k8 k8Var = new k8();
            k8Var.i(context);
            dinamicXEngine.v().b(n8Var, k8Var, new a());
        }
    }

    public static void b(Object obj, JSONObject jSONObject) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df405e8", new Object[]{obj, jSONObject});
        } else if (jSONObject != null && obj != null && obj.getClass().isArray()) {
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.startsWith("ultronGlobalComponentKey:") && str.length() > 25) {
                        jSONObject.put("componentKeys", (Object) str.substring(25).split(","));
                    } else if (str.startsWith("ultronShowloading:") && str.length() > 18) {
                        jSONObject.put("showLoading", (Object) str.substring(18));
                    } else if (str.startsWith("ultronRendertype:") && str.length() > 17) {
                        jSONObject.put("renderType", (Object) str.substring(17));
                    } else if (str.startsWith("readCurTemplate:") && str.length() > 16) {
                        jSONObject.put("readCurTemplate", (Object) str.substring(16));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:8:0x0029, B:13:0x0038, B:16:0x0043, B:23:0x0053, B:25:0x005c), top: B:29:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.adam.common.Util.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "ec2e9a6e"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            android.content.Context r2 = r5.getApplicationContext()
            java.lang.String r3 = "mytaobao"
            tb.j9t r2 = tb.j9t.e(r2, r3)
            if (r2 == 0) goto L_0x0065
            int r3 = r6.hashCode()     // Catch: all -> 0x0065
            r4 = 1314173112(0x4e54b0b8, float:8.9208781E8)
            if (r3 == r4) goto L_0x0043
            r4 = 2053839983(0x7a6b1c6f, float:3.0519162E35)
            if (r3 == r4) goto L_0x0038
            goto L_0x004d
        L_0x0038:
            java.lang.String r3 = "taoPassWordCutOpen"
            boolean r6 = r6.equals(r3)     // Catch: all -> 0x0065
            if (r6 == 0) goto L_0x004d
            r6 = 0
            goto L_0x004e
        L_0x0043:
            java.lang.String r3 = "autoPlayVideo"
            boolean r6 = r6.equals(r3)     // Catch: all -> 0x0065
            if (r6 == 0) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = -1
        L_0x004e:
            if (r6 == 0) goto L_0x005c
            if (r6 == r0) goto L_0x0053
            goto L_0x0065
        L_0x0053:
            tb.dhb r6 = r2.b()     // Catch: all -> 0x0065
            boolean r5 = r6.isAutoPlayVideoUnderCurrentNetwork(r5)     // Catch: all -> 0x0065
            return r5
        L_0x005c:
            tb.dhb r5 = r2.b()     // Catch: all -> 0x0065
            boolean r5 = r5.g(r0)     // Catch: all -> 0x0065
            return r5
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.adam.common.Util.f(android.content.Context, java.lang.String):boolean");
    }
}
