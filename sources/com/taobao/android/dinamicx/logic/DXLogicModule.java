package com.taobao.android.dinamicx.logic;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.h36;
import tb.jxh;
import tb.kdb;
import tb.pvh;
import tb.s2d;
import tb.sl6;
import tb.tk6;
import tb.twb;
import tb.xq;
import tb.xv5;
import tb.yl6;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXLogicModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AbilityHubAdapter mAdapter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7320a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ JSONObject[] d;
        public final /* synthetic */ CountDownLatch e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        }

        public b(String str, String str2, JSONObject jSONObject, JSONObject[] jSONObjectArr, CountDownLatch countDownLatch) {
            this.f7320a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = jSONObjectArr;
            this.e = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                xq xqVar = new xq();
                DXLogicModule.access$000(DXLogicModule.this, xqVar);
                ExecuteResult z = DXLogicModule.access$100(DXLogicModule.this).z(this.f7320a, this.b, xqVar, this.c, new a(this));
                if (z != null) {
                    this.d[0] = new JSONObject(z.toFormattedData());
                }
            } catch (Throwable th) {
                this.d[0] = DXLogicModule.access$200(DXLogicModule.this, th.getMessage());
            }
            this.e.countDown();
        }
    }

    public DXLogicModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        String str2;
        if (TextUtils.isEmpty(mUSDKInstance.getOriginURLString())) {
            str2 = mUSDKInstance.getOriginURLString();
        } else {
            str2 = "default";
        }
        zq zqVar = new zq(str2, "DX");
        this.mAdapter = new AbilityHubAdapter(zqVar);
        zqVar.a(mUSDKInstance.getContext().a());
    }

    public static /* synthetic */ void access$000(DXLogicModule dXLogicModule, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fffc7223", new Object[]{dXLogicModule, kdbVar});
        } else {
            dXLogicModule.buildAbilityContext(kdbVar);
        }
    }

    public static /* synthetic */ AbilityHubAdapter access$100(DXLogicModule dXLogicModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("74344ca4", new Object[]{dXLogicModule});
        }
        return dXLogicModule.mAdapter;
    }

    public static /* synthetic */ JSONObject access$200(DXLogicModule dXLogicModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("624bb480", new Object[]{dXLogicModule, str});
        }
        return dXLogicModule.createExceptionObject(str);
    }

    private void buildAbilityContext(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b6981", new Object[]{this, kdbVar});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext instanceof DXRuntimeContext) {
            tk6 tk6Var = new tk6();
            tk6Var.i(dXRuntimeContext.h());
            tk6Var.m(dXRuntimeContext.D());
            tk6Var.g(dXRuntimeContext.s().f().v());
            tk6Var.r(dXRuntimeContext.L());
            tk6Var.s(dXRuntimeContext.W());
            kdbVar.c(tk6Var);
            zq zqVar = new zq(dXRuntimeContext.c(), "DX");
            zqVar.a(dXRuntimeContext.h());
            kdbVar.j(zqVar);
        }
    }

    private static MUSValue convert(yl6 yl6Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("d0349a28", new Object[]{yl6Var});
        }
        if (yl6Var == null) {
            return MUSValue.ofNill();
        }
        short i = yl6Var.i();
        if (i == 0) {
            return MUSValue.ofNill();
        }
        if (i == 1 || i == 2) {
            return MUSValue.ofInt(yl6Var.h().e());
        }
        if (i == 3) {
            return MUSValue.ofFloat(yl6Var.h().c());
        }
        if (i == 4) {
            return MUSValue.ofString(yl6Var.h().f().toString());
        }
        if (i == 8 || i == 9) {
            if (yl6Var.h().f() == null) {
                obj = null;
            } else {
                obj = yl6Var.h().f();
            }
            return MUSValue.ofJSON(obj);
        } else if (i != 15) {
            return MUSValue.ofNill();
        } else {
            return MUSValue.ofBool(yl6Var.h().b());
        }
    }

    private JSONObject createExceptionObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("46c33803", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "result");
        jSONObject.put("statusCode", (Object) 199);
        jSONObject.put("msg", (Object) str);
        return jSONObject;
    }

    private DXRuntimeContext getDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this});
        }
        Object executeContext = getInstance().getExecuteContext();
        if (!(executeContext instanceof Map)) {
            return null;
        }
        Object obj = ((Map) executeContext).get("runtimeContext");
        if (obj instanceof DXRuntimeContext) {
            return (DXRuntimeContext) obj;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DXLogicModule dXLogicModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/logic/DXLogicModule");
    }

    private void setState(String str, Object obj) {
        sl6 dxv4Properties;
        twb twbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c480d27c", new Object[]{this, str, obj});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if ((dXRuntimeContext instanceof DXRuntimeContext) && (dxv4Properties = dXRuntimeContext.W().getDxv4Properties()) != null && dxv4Properties.q() != null && (twbVar = dxv4Properties.q().get(str)) != null) {
            twbVar.setState(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[LOOP:0: B:18:0x0040->B:19:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: DXExprFunctionError -> 0x0070, TryCatch #0 {DXExprFunctionError -> 0x0070, blocks: (B:20:0x004e, B:22:0x006b, B:26:0x0072), top: B:31:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: DXExprFunctionError -> 0x0070, TRY_LEAVE, TryCatch #0 {DXExprFunctionError -> 0x0070, blocks: (B:20:0x004e, B:22:0x006b, B:26:0x0072), top: B:31:0x004e }] */
    @com.taobao.android.weex_framework.ui.MUSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex_framework.MUSValue evaluateExprWithNameAndArgs(java.lang.String r8, java.lang.Object r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.logic.DXLogicModule.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "f60b2281"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r8 = 2
            r4[r8] = r9
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            com.taobao.android.weex_framework.MUSValue r8 = (com.taobao.android.weex_framework.MUSValue) r8
            return r8
        L_0x001b:
            com.taobao.android.dinamicx.DXRuntimeContext r2 = r7.getDXRuntimeContext()
            boolean r3 = r2 instanceof com.taobao.android.dinamicx.DXRuntimeContext
            if (r3 == 0) goto L_0x007e
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x0034
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0034
            com.alibaba.fastjson.JSONArray r9 = com.alibaba.fastjson.JSON.parseArray(r9)
            goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            if (r9 != 0) goto L_0x0039
            r4 = 0
            goto L_0x003e
        L_0x0039:
            int r3 = r9.size()
            r4 = r3
        L_0x003e:
            tb.uw5[] r5 = new tb.uw5[r4]
        L_0x0040:
            if (r1 >= r4) goto L_0x004e
            java.lang.Object r3 = r9.get(r1)
            tb.uw5 r3 = tb.uw5.c(r3)
            r5[r1] = r3
            int r1 = r1 + r0
            goto L_0x0040
        L_0x004e:
            tb.av5 r9 = r2.s()     // Catch: DXExprFunctionError -> 0x0070
            com.taobao.android.dinamicx.DinamicXEngine r9 = r9.f()     // Catch: DXExprFunctionError -> 0x0070
            tb.qvb r0 = r9.M()     // Catch: DXExprFunctionError -> 0x0070
            tb.uw5 r3 = tb.uw5.V()     // Catch: DXExprFunctionError -> 0x0070
            r6 = 0
            r1 = r2
            r2 = r8
            tb.uw5 r8 = r0.b(r1, r2, r3, r4, r5, r6)     // Catch: DXExprFunctionError -> 0x0070
            boolean r9 = r8.J()     // Catch: DXExprFunctionError -> 0x0070
            if (r9 == 0) goto L_0x0072
            com.taobao.android.weex_framework.MUSValue r8 = com.taobao.android.weex_framework.MUSValue.ofNill()     // Catch: DXExprFunctionError -> 0x0070
            return r8
        L_0x0070:
            r8 = move-exception
            goto L_0x007b
        L_0x0072:
            java.lang.Object r8 = r8.b0()     // Catch: DXExprFunctionError -> 0x0070
            com.taobao.android.weex_framework.MUSValue r8 = tb.jxh.a(r8)     // Catch: DXExprFunctionError -> 0x0070
            return r8
        L_0x007b:
            tb.xv5.b(r8)
        L_0x007e:
            com.taobao.android.weex_framework.MUSValue r8 = com.taobao.android.weex_framework.MUSValue.ofNill()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.logic.DXLogicModule.evaluateExprWithNameAndArgs(java.lang.String, java.lang.Object):com.taobao.android.weex_framework.MUSValue");
    }

    @MUSMethod(uiThread = false)
    public MUSValue getVariableByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("fe8bdbe", new Object[]{this, str});
        }
        try {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext instanceof DXRuntimeContext) {
                if (!Objects.equals(str, "runtimeContext")) {
                    return convert(g.s().e().a(dXRuntimeContext, str));
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", (Object) dXRuntimeContext.i());
                return jxh.a(jSONObject);
            }
        } catch (Exception e) {
            xv5.b(e);
        }
        return MUSValue.ofNill();
    }

    @MUSMethod(uiThread = false)
    public void logNative(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba4796", new Object[]{this, str, str2});
        } else {
            h36.g(str, str2);
        }
    }

    @MUSMethod(uiThread = false)
    public void setStateFromNativeAsync(String str, Object obj, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39532822", new Object[]{this, str, obj, pvhVar});
        } else {
            setState(str, obj);
        }
    }

    @MUSMethod(uiThread = true)
    public void setStateFromNativeSync(String str, Object obj, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89c0061", new Object[]{this, str, obj, pvhVar});
        } else {
            setState(str, obj);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject syncCall(String str, String str2, MUSValue mUSValue, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("776d712a", new Object[]{this, str, str2, mUSValue, pvhVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (mUSValue != null) {
            try {
                if (mUSValue.getType() == 8) {
                    jSONObject = JSON.parseObject(mUSValue.getJSONStringValue());
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
        JSONObject[] jSONObjectArr = {new JSONObject()};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new b(str, str2, jSONObject, jSONObjectArr, countDownLatch));
        try {
            countDownLatch.await(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            createExceptionObject(e2.getMessage());
        }
        return jSONObjectArr[0];
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f7319a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(DXLogicModule dXLogicModule, pvh pvhVar, String str, String str2) {
            this.f7319a = pvhVar;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (this.f7319a != null) {
                JSONObject jSONObject = new JSONObject(executeResult.toFormattedData());
                if (DinamicXEngine.j0()) {
                    h36.g("mega", this.b + ":" + this.c + " callback " + jSONObject.toJSONString());
                }
                this.f7319a.a(jSONObject);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void asyncCall(String str, String str2, MUSValue mUSValue, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d485682b", new Object[]{this, str, str2, mUSValue, pvhVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (mUSValue != null) {
            try {
                if (mUSValue.getType() == 8) {
                    jSONObject = JSON.parseObject(mUSValue.getJSONStringValue());
                }
            } catch (Exception e) {
                xv5.b(e);
                if (pvhVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", (Object) "result");
                    jSONObject2.put("statusCode", (Object) 199);
                    jSONObject2.put("msg", (Object) e.getMessage());
                    pvhVar.a(jSONObject2);
                    return;
                }
                return;
            }
        }
        xq xqVar = new xq();
        buildAbilityContext(xqVar);
        this.mAdapter.j(str, str2, xqVar, jSONObject, new a(this, pvhVar, str, str2));
    }
}
