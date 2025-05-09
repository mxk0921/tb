package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.event.util.AlipayUtil;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class et0 extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements AlipayUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f18800a;
        public final /* synthetic */ b8v b;

        public a(JSONObject jSONObject, b8v b8vVar) {
            this.f18800a = jSONObject;
            this.b = b8vVar;
        }

        public void a(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a552c861", new Object[]{this, context, intent});
            } else {
                et0.H(et0.this, this.b, this.f18800a.getString("unSuccessUrl"));
            }
        }

        public void b(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5381b5b", new Object[]{this, context, intent});
            } else {
                et0.H(et0.this, this.b, this.f18800a.getString("backUrl"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements VIListenerByVerifyId {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f18801a;
        public final /* synthetic */ String b;

        public b(JSONObject jSONObject, String str) {
            this.f18801a = jSONObject;
            this.b = str;
        }

        @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
        public void onVerifyResult(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa9841f2", new Object[]{this, str, str2, str3, verifyIdentityResult});
            } else if (verifyIdentityResult != null) {
                String code = verifyIdentityResult.getCode();
                if (!TextUtils.isEmpty(code)) {
                    code.hashCode();
                    if (code.equals("1000")) {
                        JSONObject jSONObject = this.f18801a;
                        if (jSONObject != null) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
                            et0 et0Var = et0.this;
                            et0Var.z(et0.I(et0Var), "mtopWithOpenUrlV3", jSONObject2);
                        }
                    } else if (!code.equals("1003")) {
                        if (verifyIdentityResult.getMessage() != null) {
                            str4 = verifyIdentityResult.getMessage();
                        } else {
                            str4 = this.b;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("message", (Object) str4);
                        et0 et0Var2 = et0.this;
                        et0Var2.z(et0.J(et0Var2), "toastV3", jSONObject3);
                    }
                }
            }
        }
    }

    static {
        t2o.a(156237830);
    }

    public static /* synthetic */ void H(et0 et0Var, b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7e7bd5", new Object[]{et0Var, b8vVar, str});
        } else {
            et0Var.M(b8vVar, str);
        }
    }

    public static /* synthetic */ b8v I(et0 et0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("f260ad38", new Object[]{et0Var});
        }
        return et0Var.f23143a;
    }

    public static /* synthetic */ b8v J(et0 et0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("ae09db57", new Object[]{et0Var});
        }
        return et0Var.f23143a;
    }

    public static /* synthetic */ Object ipc$super(et0 et0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/AlipayV2Subscriber");
    }

    public final void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24da20fa", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("verifyIdentity");
        JSONObject jSONObject3 = jSONObject.getJSONObject("verifyIdentityParams");
        if (jSONObject3 != null) {
            String string = jSONObject3.getString(Constants.VI_ENGINE_VERIFYID);
            jSONObject3.getJSONObject("extParams");
            String string2 = jSONObject3.getString("bizName");
            String string3 = jSONObject3.getString("token");
            String string4 = jSONObject3.getString("errorMsg");
            if (string != null) {
                VerifyIdentityEngine.getInstance(this.b).startVerifyByVerifyId(string, string3, string2, new Bundle(), new b(jSONObject2, string4));
            }
        }
    }

    public final JSONObject K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("64c0906c", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("pageType", (Object) "H5");
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("pageType", (Object) str2);
        }
        return jSONObject;
    }

    public final void L(b8v b8vVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a886380", new Object[]{this, b8vVar, jSONObject});
            return;
        }
        String string = jSONObject.getString("errorMsg");
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            string = "服务异常";
        }
        jSONObject2.put("message", (Object) string);
        z(b8vVar, "toastV3", jSONObject2);
    }

    public final void M(b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587d6ea9", new Object[]{this, b8vVar, str});
            return;
        }
        z(this.f23143a, "refreshPageV3", D(b8vVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        z(this.f23143a, "openUrlV3", jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r4.equals("share") == false) goto L_0x0041;
     */
    @Override // tb.m6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(tb.b8v r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.et0.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "146e2815"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            com.alibaba.fastjson.JSONObject r3 = r7.D(r8)
            if (r3 != 0) goto L_0x002a
            java.lang.Class<tb.et0> r8 = tb.et0.class
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r0 = "EVENT_CHAIN_PARAMS_VALID_ERROR"
            java.lang.String r1 = "获取fields失败"
            tb.tj8.a(r8, r0, r1)
            return
        L_0x002a:
            java.lang.String r4 = "eventType"
            java.lang.String r4 = r3.getString(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00e4
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case 96784904: goto L_0x0070;
                case 109400031: goto L_0x0066;
                case 439604311: goto L_0x005a;
                case 665890530: goto L_0x004e;
                case 1536904518: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = -1
            goto L_0x007a
        L_0x0043:
            java.lang.String r0 = "checkout"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r0 = 4
            goto L_0x007a
        L_0x004e:
            java.lang.String r0 = "unrealName"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0041
        L_0x0058:
            r0 = 3
            goto L_0x007a
        L_0x005a:
            java.lang.String r0 = "verifyIdentity"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0064
            goto L_0x0041
        L_0x0064:
            r0 = 2
            goto L_0x007a
        L_0x0066:
            java.lang.String r1 = "share"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x007a
            goto L_0x0041
        L_0x0070:
            java.lang.String r0 = "error"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x0041
        L_0x0079:
            r0 = 0
        L_0x007a:
            switch(r0) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00ae;
                case 3: goto L_0x008c;
                case 4: goto L_0x0081;
                default: goto L_0x007d;
            }
        L_0x007d:
            r7.L(r8, r3)
            goto L_0x00e7
        L_0x0081:
            android.content.Context r0 = r7.b
            tb.et0$a r1 = new tb.et0$a
            r1.<init>(r3, r8)
            com.alibaba.android.ultron.ext.event.util.AlipayUtil.d(r0, r3, r1)
            goto L_0x00e7
        L_0x008c:
            java.lang.String r0 = "realNameUrl"
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = "pageType"
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L_0x00a1
            java.lang.String r1 = r3.getString(r1)
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r1 = "H5"
        L_0x00a3:
            java.lang.String r2 = "openUrlV3"
            com.alibaba.fastjson.JSONObject r0 = r7.K(r0, r1)
            r7.z(r8, r2, r0)
            goto L_0x00e7
        L_0x00ae:
            r7.G(r3)
            goto L_0x00e7
        L_0x00b2:
            java.lang.String r0 = "shareParams"
            com.alibaba.fastjson.JSONObject r0 = r3.getJSONObject(r0)
            java.lang.String r1 = "shareWithRefreshV3"
            r7.z(r8, r1, r0)
            goto L_0x00e7
        L_0x00c0:
            java.lang.String r0 = "errorCode"
            r3.getString(r0)
            java.lang.String r0 = "errorMsg"
            java.lang.String r0 = r3.getString(r0)
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.String r2 = "message"
            r1.put(r2, r0)
            java.lang.String r0 = "toastV3"
            r7.z(r8, r0, r1)
            java.lang.String r0 = "refreshPageV3"
            r1 = 0
            r7.z(r8, r0, r1)
            goto L_0x00e7
        L_0x00e4:
            r7.L(r8, r3)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.et0.F(tb.b8v):void");
    }
}
