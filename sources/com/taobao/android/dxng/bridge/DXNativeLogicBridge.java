package com.taobao.android.dxng.bridge;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import tb.av5;
import tb.ckf;
import tb.dm6;
import tb.h36;
import tb.kdb;
import tb.lb6;
import tb.pg1;
import tb.rb;
import tb.rvb;
import tb.s2d;
import tb.sl6;
import tb.tk6;
import tb.twb;
import tb.uw5;
import tb.xpc;
import tb.xq;
import tb.xv5;
import tb.xwb;
import tb.yl6;
import tb.zq;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b$\u0010#J%\u0010%\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b'\u0010#J'\u0010(\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010!¢\u0006\u0004\b(\u0010&J%\u0010)\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010#J%\u0010*\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b*\u0010&J#\u0010+\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b+\u0010#J#\u0010,\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040!¢\u0006\u0004\b,\u0010#J\u001d\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R,\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.08070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/taobao/android/dxng/bridge/DXNativeLogicBridge;", "Ljava/io/Serializable;", "<init>", "()V", "", "callbackWrapper", "params", "Ltb/xhv;", xpc.RECORD_INVOKE_CALLBACK, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ltb/yl6;", "value", "convert", "(Ltb/yl6;)Ljava/lang/Object;", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeContext", "Lcom/alibaba/ability/hub/AbilityHubAdapter;", "getAbilityHubAdapter", "(Lcom/taobao/android/dinamicx/DXRuntimeContext;)Lcom/alibaba/ability/hub/AbilityHubAdapter;", "", "", "getDXRuntimeCtxFromParams", "(Ljava/util/Map;)Lcom/taobao/android/dinamicx/DXRuntimeContext;", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "getDXEventFromParams", "(Ljava/util/Map;)Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "", "getStateId", "(Ljava/util/Map;)Ljava/lang/Integer;", "Ltb/kdb;", "iAbilityContext", "buildAbilityContext", "(Ltb/kdb;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "", "log", "(Ljava/util/Map;)V", "asyncCallMegaAbility", "evaluateExprWithNameAndArgs", "(Ljava/util/Map;)Ljava/lang/Object;", pg1.ATOM_EXT_setState, rvb.CONST_FUNC_GET_VAR, "onExceptionCaught", "syncCallMegaAbility", "markReactActionEnd", "markReactActionBegin", "key", "Ltb/twb;", "idxStateProtocol", "", "addStateProtocolNode", "(ILtb/twb;)Z", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "node", "doRefresh", "(Lcom/taobao/android/dinamicx/widget/DXWidgetNode;)V", "", "Ljava/lang/ref/WeakReference;", "needRefreshStateProtocolMap", "Ljava/util/Map;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DXNativeLogicBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<Integer, List<WeakReference<twb>>> needRefreshStateProtocolMap = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "executeResult");
            if (this.b != null) {
                DXNativeLogicBridge.access$invokeCallback(DXNativeLogicBridge.this, this.b, new JSONObject(executeResult.toFormattedData()));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ AbilityHubAdapter c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONObject f;
        public final /* synthetic */ JSONObject[] g;
        public final /* synthetic */ CountDownLatch h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "ignored");
                }
            }
        }

        public b(DXRuntimeContext dXRuntimeContext, AbilityHubAdapter abilityHubAdapter, String str, String str2, JSONObject jSONObject, JSONObject[] jSONObjectArr, CountDownLatch countDownLatch) {
            this.b = dXRuntimeContext;
            this.c = abilityHubAdapter;
            this.d = str;
            this.e = str2;
            this.f = jSONObject;
            this.g = jSONObjectArr;
            this.h = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                xq xqVar = new xq();
                DXNativeLogicBridge dXNativeLogicBridge = DXNativeLogicBridge.this;
                DXRuntimeContext dXRuntimeContext = this.b;
                ckf.d(dXRuntimeContext);
                DXNativeLogicBridge.access$buildAbilityContext(dXNativeLogicBridge, xqVar, dXRuntimeContext);
                ExecuteResult z = this.c.z(this.d, this.e, xqVar, this.f, new a());
                if (z != null) {
                    this.g[0] = new JSONObject(z.toFormattedData());
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    this.h.countDown();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else {
                ckf.g(executeResult, "ignored");
            }
        }
    }

    public static final /* synthetic */ void access$buildAbilityContext(DXNativeLogicBridge dXNativeLogicBridge, kdb kdbVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0079828", new Object[]{dXNativeLogicBridge, kdbVar, dXRuntimeContext});
        } else {
            dXNativeLogicBridge.buildAbilityContext(kdbVar, dXRuntimeContext);
        }
    }

    public static final /* synthetic */ void access$invokeCallback(DXNativeLogicBridge dXNativeLogicBridge, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5109e6", new Object[]{dXNativeLogicBridge, obj, obj2});
        } else {
            dXNativeLogicBridge.invokeCallback(obj, obj2);
        }
    }

    private final void buildAbilityContext(kdb kdbVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae6cf32", new Object[]{this, kdbVar, dXRuntimeContext});
        } else if (dXRuntimeContext instanceof DXRuntimeContext) {
            tk6 tk6Var = new tk6();
            tk6Var.i(dXRuntimeContext.h());
            tk6Var.m(dXRuntimeContext.D());
            av5 s = dXRuntimeContext.s();
            ckf.f(s, "runtimeContext.engineContext");
            DinamicXEngine f = s.f();
            ckf.f(f, "runtimeContext.engineContext.engine");
            tk6Var.g(f.v());
            tk6Var.r(dXRuntimeContext.L());
            tk6Var.s(dXRuntimeContext.W());
            kdbVar.c(tk6Var);
            String c2 = dXRuntimeContext.c();
            ckf.f(c2, "runtimeContext.bizType");
            zq zqVar = new zq(c2, "DX");
            zqVar.a(dXRuntimeContext.h());
            kdbVar.j(zqVar);
        }
    }

    private final AbilityHubAdapter getAbilityHubAdapter(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("2208a893", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || (r = dXRuntimeContext.r()) == null) {
            return null;
        }
        return r.w();
    }

    private final DXEvent getDXEventFromParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("912012fa", new Object[]{this, map});
        }
        Map map2 = (Map) map.get("passParams");
        Object obj = null;
        Object obj2 = map2 != null ? map2.get("params") : null;
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        Object obj3 = map3 != null ? map3.get("dx_event") : null;
        if (obj3 instanceof DXEvent) {
            obj = obj3;
        }
        return (DXEvent) obj;
    }

    private final DXRuntimeContext getDXRuntimeCtxFromParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("8f248212", new Object[]{this, map});
        }
        Map map2 = (Map) map.get("passParams");
        Object obj = null;
        Object obj2 = map2 != null ? map2.get("params") : null;
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        Object obj3 = map3 != null ? map3.get(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT) : null;
        if (obj3 instanceof DXRuntimeContext) {
            obj = obj3;
        }
        return (DXRuntimeContext) obj;
    }

    private final Integer getStateId(Map<String, ? extends Object> map) {
        Object obj;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d960002f", new Object[]{this, map});
        }
        try {
            Map map2 = (Map) map.get("passParams");
            Object obj3 = map2 != null ? map2.get("params") : null;
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            Map map3 = (Map) obj3;
            if (map3 == null || (obj = map3.get("state_id")) == null || (obj2 = obj.toString()) == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(obj2));
        } catch (Exception unused) {
            return -1;
        }
    }

    private final void invokeCallback(Object obj, Object obj2) {
        Method method = obj.getClass().getMethod("onCallback", Map.class);
        ckf.f(method, "callbackWrapper.javaClas…llback\", Map::class.java)");
        method.invoke(obj, obj2);
    }

    public final boolean addStateProtocolNode(int i, twb twbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a101371", new Object[]{this, new Integer(i), twbVar})).booleanValue();
        }
        ckf.g(twbVar, "idxStateProtocol");
        if (this.needRefreshStateProtocolMap.get(Integer.valueOf(i)) == null) {
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), new ArrayList());
        }
        List<WeakReference<twb>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
        ckf.d(list);
        List<WeakReference<twb>> list2 = list;
        Iterator<WeakReference<twb>> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (ckf.b(it.next().get(), twbVar)) {
                    break;
                }
            } else {
                list2.add(new WeakReference<>(twbVar));
                break;
            }
        }
        return true;
    }

    public final void asyncCallMegaAbility(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5804260", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
        AbilityHubAdapter abilityHubAdapter = getAbilityHubAdapter(dXRuntimeCtxFromParams);
        if (abilityHubAdapter != null) {
            Object obj = map.get("name");
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = map.get("api");
                if (obj2 != null) {
                    String str2 = (String) obj2;
                    JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map.get("params")));
                    Object obj3 = map.get("callback");
                    try {
                        if (dXRuntimeCtxFromParams != null) {
                            xq xqVar = new xq();
                            buildAbilityContext(xqVar, dXRuntimeCtxFromParams);
                            abilityHubAdapter.j(str, str2, xqVar, parseObject, new a(obj3));
                        } else if (DinamicXEngine.j0()) {
                            throw new RuntimeException(" asyncCallMegaAbility runtimeContext == null ");
                        }
                    } catch (Exception e) {
                        xv5.b(e);
                        if (obj3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put((JSONObject) "type", "result");
                            jSONObject.put((JSONObject) "statusCode", (String) 199);
                            jSONObject.put((JSONObject) "msg", e.getMessage());
                            invokeCallback(obj3, jSONObject);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public final void doRefresh(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c05bfb8", new Object[]{this, dXWidgetNode});
        } else {
            ckf.g(dXWidgetNode, "node");
        }
    }

    public final Object getVariableByName(Map<String, Object> map) {
        Map<String, yl6> variableNameMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79edfae8", new Object[]{this, map});
        }
        yl6 yl6Var = null;
        if (map != null) {
            Object obj = map.get("varName");
            DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
            if (dXRuntimeCtxFromParams != null) {
                DXWidgetNode W = dXRuntimeCtxFromParams.W();
                if (!(W == null || (variableNameMap = W.getVariableNameMap()) == null)) {
                    if (ckf.b("runtimeContext", obj)) {
                        yl6Var = new lb6(dXRuntimeCtxFromParams);
                    } else {
                        yl6Var = variableNameMap.get(obj);
                    }
                }
                return convert(yl6Var);
            } else if (!DinamicXEngine.j0()) {
                return null;
            } else {
                throw new RuntimeException(" getVariableByName runtimeContext == null ");
            }
        } else if (!DinamicXEngine.j0()) {
            return null;
        } else {
            throw new RuntimeException(" DXNativeLogicBridge  getVariableByName params can not be null");
        }
    }

    public final void log(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca465a", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        Object obj = map.get("tag");
        String str = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        Object obj2 = map.get("content");
        if (obj2 instanceof String) {
            str = obj2;
        }
        String str3 = str;
        if (TextUtils.isEmpty(str2)) {
            h36.a(str3);
        } else {
            h36.b(str2, str3);
        }
    }

    public final void markReactActionBegin(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b564287d", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        Integer stateId = getStateId(map);
        this.needRefreshStateProtocolMap.put(Integer.valueOf(stateId != null ? stateId.intValue() : -1), new ArrayList());
    }

    public final void markReactActionEnd(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f525c10b", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        Integer stateId = getStateId(map);
        int intValue = stateId != null ? stateId.intValue() : -1;
        try {
            List<WeakReference<twb>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(intValue));
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(intValue));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    twb twbVar = (twb) ((WeakReference) it.next()).get();
                    if (twbVar != null) {
                        twbVar.c();
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(intValue));
            throw th;
        }
        this.needRefreshStateProtocolMap.remove(Integer.valueOf(intValue));
    }

    public final void onExceptionCaught(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdb4ad2", new Object[]{this, map});
        } else if (DinamicXEngine.j0()) {
            String jSONString = JSON.toJSONString(map);
            h36.g("DXNativeLogicBridge", jSONString);
            throw new RuntimeException(jSONString);
        }
    }

    public final Object evaluateExprWithNameAndArgs(Map<String, Object> map) {
        uw5[] uw5VarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e255de9", new Object[]{this, map});
        }
        ckf.g(map, "params");
        if (map.get("passParams") != null) {
            DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
            if (dXRuntimeCtxFromParams != null) {
                Object obj = map.get("argsObj");
                Object obj2 = map.get("exprName");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (obj instanceof Collection) {
                    Iterable<Object> iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(zz3.q(iterable, 10));
                    for (Object obj3 : iterable) {
                        arrayList.add(uw5.c(obj3));
                    }
                    Object[] array = arrayList.toArray(new uw5[0]);
                    if (array != null) {
                        uw5VarArr = (uw5[]) array;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    uw5VarArr = new uw5[0];
                }
                try {
                    DXEvent dXEventFromParams = getDXEventFromParams(map);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(xwb.EXTRA_PARAMS_EVENT, dXEventFromParams);
                    if (dXRuntimeCtxFromParams.s() != null) {
                        av5 s = dXRuntimeCtxFromParams.s();
                        ckf.f(s, "dxRuntimeContext.engineContext");
                        if (s.f() != null) {
                            av5 s2 = dXRuntimeCtxFromParams.s();
                            ckf.f(s2, "dxRuntimeContext.engineContext");
                            DinamicXEngine f = s2.f();
                            ckf.f(f, "dxRuntimeContext.engineContext.engine");
                            if (f.M() != null) {
                                av5 s3 = dXRuntimeCtxFromParams.s();
                                ckf.f(s3, "dxRuntimeContext.engineContext");
                                DinamicXEngine f2 = s3.f();
                                ckf.f(f2, "dxRuntimeContext.engineContext.engine");
                                uw5 b2 = f2.M().b(dXRuntimeCtxFromParams, str, uw5.V(), uw5VarArr.length, uw5VarArr, linkedHashMap);
                                ckf.f(b2, rb.RESULT_KEY);
                                if (b2.J()) {
                                    return null;
                                }
                                return b2.b0();
                            }
                        }
                    }
                    return null;
                } catch (DXExprFunctionError e) {
                    xv5.b(e);
                }
            } else if (!DinamicXEngine.j0()) {
                return null;
            } else {
                throw new RuntimeException(" evaluateExprWithNameAndArgs runtimeContext == null ");
            }
        }
        return null;
    }

    public final void setState(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ca5a6f", new Object[]{this, map});
            return;
        }
        ckf.g(map, "params");
        Integer stateId = getStateId(map);
        int intValue = stateId != null ? stateId.intValue() : -1;
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
        Object obj = map.get("key");
        Object obj2 = map.get("value");
        if (dXRuntimeCtxFromParams instanceof DXRuntimeContext) {
            DXWidgetNode W = dXRuntimeCtxFromParams.W();
            ckf.f(W, "dxRuntimeContext.widgetNode");
            sl6 dxv4Properties = W.getDxv4Properties();
            if (dxv4Properties != null && dxv4Properties.q() != null) {
                Map<String, twb> q = dxv4Properties.q();
                ckf.f(q, "properties.stateMap");
                twb twbVar = q.get(obj);
                if (twbVar == null) {
                    return;
                }
                if (!this.needRefreshStateProtocolMap.containsKey(Integer.valueOf(intValue))) {
                    twbVar.setState(obj2);
                    return;
                }
                twbVar.a(obj2, false);
                addStateProtocolNode(intValue, twbVar);
            }
        }
    }

    private final Object convert(yl6 yl6Var) {
        short i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bee1917", new Object[]{this, yl6Var});
        }
        if (yl6Var == null || (i = yl6Var.i()) == 0) {
            return null;
        }
        if (i == 1 || i == 2) {
            dm6 h = yl6Var.h();
            ckf.f(h, "value.variableResult");
            return Integer.valueOf(h.e());
        } else if (i == 3) {
            dm6 h2 = yl6Var.h();
            ckf.f(h2, "value.variableResult");
            return Double.valueOf(h2.c());
        } else if (i == 4) {
            dm6 h3 = yl6Var.h();
            ckf.f(h3, "value.variableResult");
            return h3.f().toString();
        } else if (i == 8 || i == 9) {
            dm6 h4 = yl6Var.h();
            ckf.f(h4, "value.variableResult");
            if (h4.f() == null) {
                return null;
            }
            dm6 h5 = yl6Var.h();
            ckf.f(h5, "value.variableResult");
            return h5.f();
        } else if (i == 15) {
            dm6 h6 = yl6Var.h();
            ckf.f(h6, "value.variableResult");
            return Boolean.valueOf(h6.b());
        } else if (!DinamicXEngine.j0()) {
            return null;
        } else {
            throw new RuntimeException(" unknow type: " + ((int) i));
        }
    }

    public final Object syncCallMegaAbility(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e627a53", new Object[]{this, map});
        }
        ckf.g(map, "params");
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
        AbilityHubAdapter abilityHubAdapter = getAbilityHubAdapter(dXRuntimeCtxFromParams);
        if (abilityHubAdapter == null) {
            return null;
        }
        Object obj = map.get("name");
        if (obj != null) {
            String str = (String) obj;
            Object obj2 = map.get("api");
            if (obj2 != null) {
                String str2 = (String) obj2;
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map.get("params")));
                JSONObject[] jSONObjectArr = {new JSONObject()};
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                ckf.f(mainLooper, "Looper.getMainLooper()");
                if (ckf.b(currentThread, mainLooper.getThread())) {
                    try {
                        xq xqVar = new xq();
                        ckf.d(dXRuntimeCtxFromParams);
                        buildAbilityContext(xqVar, dXRuntimeCtxFromParams);
                        ExecuteResult z = abilityHubAdapter.z(str, str2, xqVar, parseObject, new c());
                        if (z != null) {
                            jSONObjectArr[0] = new JSONObject(z.toFormattedData());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    new Handler(Looper.getMainLooper()).post(new b(dXRuntimeCtxFromParams, abilityHubAdapter, str, str2, parseObject, jSONObjectArr, countDownLatch));
                    try {
                        countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return jSONObjectArr[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
