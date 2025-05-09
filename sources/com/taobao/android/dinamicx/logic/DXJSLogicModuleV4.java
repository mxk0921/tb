package com.taobao.android.dinamicx.logic;

import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.h36;
import tb.jb6;
import tb.jxh;
import tb.kdb;
import tb.la6;
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
public class DXJSLogicModuleV4 extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AbilityHubAdapter mAdapter;
    private Map<Integer, List<WeakReference<twb>>> needRefreshStateProtocolMap = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f7318a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ JSONObject[] e;
        public final /* synthetic */ CountDownLatch f;

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

        public b(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2, JSONObject[] jSONObjectArr, CountDownLatch countDownLatch) {
            this.f7318a = jSONObject;
            this.b = str;
            this.c = str2;
            this.d = jSONObject2;
            this.e = jSONObjectArr;
            this.f = countDownLatch;
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
                DXJSLogicModuleV4 dXJSLogicModuleV4 = DXJSLogicModuleV4.this;
                DXJSLogicModuleV4.access$100(dXJSLogicModuleV4, xqVar, DXJSLogicModuleV4.access$000(dXJSLogicModuleV4, this.f7318a));
                ExecuteResult z = DXJSLogicModuleV4.access$200(DXJSLogicModuleV4.this).z(this.b, this.c, xqVar, this.d, new a(this));
                if (z != null) {
                    this.e[0] = new JSONObject(z.toFormattedData());
                }
            } catch (Throwable th) {
                this.e[0] = DXJSLogicModuleV4.access$300(DXJSLogicModuleV4.this, th.getMessage());
            }
            this.f.countDown();
        }
    }

    public DXJSLogicModuleV4(String str, MUSDKInstance mUSDKInstance) {
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

    public static /* synthetic */ DXRuntimeContext access$000(DXJSLogicModuleV4 dXJSLogicModuleV4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("e969381a", new Object[]{dXJSLogicModuleV4, jSONObject});
        }
        return dXJSLogicModuleV4.getDXRuntimeContextFromEnvArgs(jSONObject);
    }

    public static /* synthetic */ void access$100(DXJSLogicModuleV4 dXJSLogicModuleV4, kdb kdbVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4951504a", new Object[]{dXJSLogicModuleV4, kdbVar, dXRuntimeContext});
        } else {
            dXJSLogicModuleV4.buildAbilityContext(kdbVar, dXRuntimeContext);
        }
    }

    public static /* synthetic */ AbilityHubAdapter access$200(DXJSLogicModuleV4 dXJSLogicModuleV4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("fade516e", new Object[]{dXJSLogicModuleV4});
        }
        return dXJSLogicModuleV4.mAdapter;
    }

    public static /* synthetic */ JSONObject access$300(DXJSLogicModuleV4 dXJSLogicModuleV4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81bfa7ca", new Object[]{dXJSLogicModuleV4, str});
        }
        return dXJSLogicModuleV4.createExceptionObject(str);
    }

    private void addStateProtocolNode(int i, twb twbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a10136d", new Object[]{this, new Integer(i), twbVar});
            return;
        }
        List<WeakReference<twb>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), list);
        }
        for (WeakReference<twb> weakReference : list) {
            if (weakReference.get() == twbVar) {
                return;
            }
        }
        list.add(new WeakReference<>(twbVar));
    }

    private void buildAbilityContext(kdb kdbVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae6cf32", new Object[]{this, kdbVar, dXRuntimeContext});
            return;
        }
        if (dXRuntimeContext == null) {
            dXRuntimeContext = (DXRuntimeContext) getInstance().getExecuteContext();
        }
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

    private DXEvent getDXEventFormEnvArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("c11b9685", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (DXEvent) ((WeakReference) ((Map) getInstance().getExecuteContext()).get(jSONObject.getJSONObject("params").getJSONObject("dx_event").getString("identifier"))).get();
        } catch (Exception unused) {
            la6.b(" getDXEventFormEnvArgs return null");
            return null;
        }
    }

    private DXRuntimeContext getDXRuntimeContextFromEnvArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("173224fd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (DXRuntimeContext) ((WeakReference) ((Map) getInstance().getExecuteContext()).get(jSONObject.getJSONObject("params").getJSONObject(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT).getString("identifier"))).get();
        } catch (Exception unused) {
            la6.b(" getDXRuntimeContextFromEnvArgs return null");
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(DXJSLogicModuleV4 dXJSLogicModuleV4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/logic/DXJSLogicModuleV4");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[LOOP:0: B:18:0x0043->B:19:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[Catch: DXExprFunctionError -> 0x0080, TryCatch #0 {DXExprFunctionError -> 0x0080, blocks: (B:20:0x0051, B:22:0x007b, B:26:0x0082), top: B:31:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: DXExprFunctionError -> 0x0080, TRY_LEAVE, TryCatch #0 {DXExprFunctionError -> 0x0080, blocks: (B:20:0x0051, B:22:0x007b, B:26:0x0082), top: B:31:0x0051 }] */
    @com.taobao.android.weex_framework.ui.MUSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex_framework.MUSValue evaluateExprWithNameAndArgs(java.lang.String r8, java.lang.Object r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = "5f7c1d55"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r8 = 2
            r4[r8] = r9
            r8 = 3
            r4[r8] = r10
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            com.taobao.android.weex_framework.MUSValue r8 = (com.taobao.android.weex_framework.MUSValue) r8
            return r8
        L_0x001e:
            com.taobao.android.dinamicx.DXRuntimeContext r2 = r7.getDXRuntimeContextFromEnvArgs(r10)
            boolean r3 = r2 instanceof com.taobao.android.dinamicx.DXRuntimeContext
            if (r3 == 0) goto L_0x008e
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x0037
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0037
            com.alibaba.fastjson.JSONArray r9 = com.alibaba.fastjson.JSON.parseArray(r9)
            goto L_0x0038
        L_0x0037:
            r9 = 0
        L_0x0038:
            if (r9 != 0) goto L_0x003c
            r4 = 0
            goto L_0x0041
        L_0x003c:
            int r3 = r9.size()
            r4 = r3
        L_0x0041:
            tb.uw5[] r5 = new tb.uw5[r4]
        L_0x0043:
            if (r1 >= r4) goto L_0x0051
            java.lang.Object r3 = r9.get(r1)
            tb.uw5 r3 = tb.uw5.c(r3)
            r5[r1] = r3
            int r1 = r1 + r0
            goto L_0x0043
        L_0x0051:
            com.taobao.android.dinamicx.expression.event.DXEvent r9 = r7.getDXEventFormEnvArgs(r10)     // Catch: DXExprFunctionError -> 0x0080
            java.util.HashMap r6 = new java.util.HashMap     // Catch: DXExprFunctionError -> 0x0080
            r6.<init>()     // Catch: DXExprFunctionError -> 0x0080
            java.lang.String r10 = "extra_params_event"
            r6.put(r10, r9)     // Catch: DXExprFunctionError -> 0x0080
            tb.av5 r9 = r2.s()     // Catch: DXExprFunctionError -> 0x0080
            com.taobao.android.dinamicx.DinamicXEngine r9 = r9.f()     // Catch: DXExprFunctionError -> 0x0080
            tb.qvb r0 = r9.M()     // Catch: DXExprFunctionError -> 0x0080
            tb.uw5 r3 = tb.uw5.V()     // Catch: DXExprFunctionError -> 0x0080
            r1 = r2
            r2 = r8
            tb.uw5 r8 = r0.b(r1, r2, r3, r4, r5, r6)     // Catch: DXExprFunctionError -> 0x0080
            boolean r9 = r8.J()     // Catch: DXExprFunctionError -> 0x0080
            if (r9 == 0) goto L_0x0082
            com.taobao.android.weex_framework.MUSValue r8 = com.taobao.android.weex_framework.MUSValue.ofNill()     // Catch: DXExprFunctionError -> 0x0080
            return r8
        L_0x0080:
            r8 = move-exception
            goto L_0x008b
        L_0x0082:
            java.lang.Object r8 = r8.b0()     // Catch: DXExprFunctionError -> 0x0080
            com.taobao.android.weex_framework.MUSValue r8 = tb.jxh.a(r8)     // Catch: DXExprFunctionError -> 0x0080
            return r8
        L_0x008b:
            tb.xv5.b(r8)
        L_0x008e:
            com.taobao.android.weex_framework.MUSValue r8 = com.taobao.android.weex_framework.MUSValue.ofNill()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.evaluateExprWithNameAndArgs(java.lang.String, java.lang.Object, com.alibaba.fastjson.JSONObject):com.taobao.android.weex_framework.MUSValue");
    }

    @MUSMethod(uiThread = false)
    public MUSValue getVariableByName(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("818f9db8", new Object[]{this, str, jSONObject});
        }
        try {
            DXRuntimeContext dXRuntimeContextFromEnvArgs = getDXRuntimeContextFromEnvArgs(jSONObject);
            if (dXRuntimeContextFromEnvArgs instanceof DXRuntimeContext) {
                if (!Objects.equals(str, "runtimeContext")) {
                    return convert(g.s().e().a(dXRuntimeContextFromEnvArgs, str));
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", (Object) dXRuntimeContextFromEnvArgs.i());
                return jxh.a(jSONObject2);
            }
        } catch (Exception e) {
            xv5.b(e);
        }
        return MUSValue.ofNill();
    }

    @MUSMethod(uiThread = false)
    public void log(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
        } else {
            h36.g(str, str2);
        }
    }

    @MUSMethod(uiThread = true)
    public void markReactActionBegin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca051fb", new Object[]{this, new Integer(i)});
        } else {
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), new ArrayList());
        }
    }

    @MUSMethod(uiThread = true)
    public void markReactActionEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b45db09", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            List<WeakReference<twb>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(i));
            if (list != null) {
                for (WeakReference<twb> weakReference : list) {
                    twb twbVar = weakReference.get();
                    if (twbVar != null) {
                        twbVar.c();
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(i));
            throw th;
        }
        this.needRefreshStateProtocolMap.remove(Integer.valueOf(i));
    }

    @MUSMethod(uiThread = false)
    public void onExceptionCaught(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29950fd", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String jSONString = jSONObject.toJSONString();
            if (DinamicXEngine.j0()) {
                h36.c(jSONString);
                throw new RuntimeException(jSONString);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void setState(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e472a7f4", new Object[]{this, str, obj, jSONObject});
            return;
        }
        try {
            if (obj instanceof String) {
                obj = JSON.parse((String) obj);
            }
        } catch (JSONException e) {
            xv5.b(e);
        }
        _setState(str, obj, jSONObject);
    }

    @MUSMethod(uiThread = false)
    public Object syncCall(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e6fdbfe", new Object[]{this, str, str2, jSONObject, jSONObject2});
        }
        JSONObject[] jSONObjectArr = {new JSONObject()};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jb6.n(new b(jSONObject2, str, str2, jSONObject, jSONObjectArr, countDownLatch));
        try {
            countDownLatch.await(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            createExceptionObject(e.getMessage());
        }
        return jSONObjectArr[0];
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f7317a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(DXJSLogicModuleV4 dXJSLogicModuleV4, pvh pvhVar, String str, String str2) {
            this.f7317a = pvhVar;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (this.f7317a != null) {
                JSONObject jSONObject = new JSONObject(executeResult.toFormattedData());
                if (DinamicXEngine.j0()) {
                    h36.g("mega", this.b + ":" + this.c + " callback " + jSONObject.toJSONString());
                }
                this.f7317a.a(jSONObject);
            }
        }
    }

    private void _setState(String str, Object obj, JSONObject jSONObject) {
        sl6 dxv4Properties;
        twb twbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38490975", new Object[]{this, str, obj, jSONObject});
            return;
        }
        DXRuntimeContext dXRuntimeContextFromEnvArgs = getDXRuntimeContextFromEnvArgs(jSONObject);
        if ((dXRuntimeContextFromEnvArgs instanceof DXRuntimeContext) && (dxv4Properties = dXRuntimeContextFromEnvArgs.W().getDxv4Properties()) != null && dxv4Properties.q() != null && (twbVar = dxv4Properties.q().get(str)) != null) {
            try {
                int intValue = jSONObject.getJSONObject("params").getJSONObject(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT).getIntValue("state_id");
                if (!this.needRefreshStateProtocolMap.containsKey(Integer.valueOf(intValue))) {
                    twbVar.setState(obj);
                } else {
                    addStateProtocolNode(intValue, twbVar);
                    twbVar.a(obj, false);
                }
            } catch (Exception unused) {
                twbVar.setState(obj);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void asyncCall(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e658517e", new Object[]{this, str, str2, jSONObject, jSONObject2, pvhVar});
            return;
        }
        try {
            xq xqVar = new xq();
            buildAbilityContext(xqVar, getDXRuntimeContextFromEnvArgs(jSONObject2));
            this.mAdapter.j(str, str2, xqVar, jSONObject, new a(this, pvhVar, str, str2));
        } catch (Exception e) {
            xv5.b(e);
            if (pvhVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", (Object) "result");
                jSONObject3.put("statusCode", (Object) 199);
                jSONObject3.put("msg", (Object) e.getMessage());
                pvhVar.a(jSONObject3);
            }
        }
    }
}
