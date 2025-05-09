package com.taobao.android.dxv4common.model.node.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import java.util.HashMap;
import tb.bi6;
import tb.h36;
import tb.la6;
import tb.t2o;
import tb.wv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeLogicEventProperty extends wv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String className;
    public String methodName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXNativeLogicLoadTask.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f7599a;
        public final /* synthetic */ DXEvent b;
        public final /* synthetic */ DXRuntimeContext c;
        public final /* synthetic */ long d;

        public a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, DXRuntimeContext dXRuntimeContext2, long j) {
            this.f7599a = dXRuntimeContext;
            this.b = dXEvent;
            this.c = dXRuntimeContext2;
            this.d = j;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            la6.b(" 构建engine失败，无法执行事件" + str);
            if (DinamicXEngine.j0()) {
                throw new RuntimeException(str);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, this.f7599a);
            hashMap.put("dx_event", this.b);
            DXNativeLogicEngine f = this.c.W().getDxv4Properties().f();
            if (f != null) {
                f.callNativeLogicFunc(this.f7599a, this.b, DXNativeLogicEventProperty.this.methodName, hashMap);
            } else {
                h36.g("DXNativeLogicBridge", " dxNativeLogicEngine  是 null ");
            }
            long nanoTime = System.nanoTime();
            h36.g("DXNativeLogicBridge", "syncLoadData流程 消耗时间为" + ((nanoTime - this.d) / 1000000.0d) + "ms");
        }
    }

    static {
        t2o.a(444597973);
    }

    public DXNativeLogicEventProperty(String str, String str2) {
        this.className = str;
        this.methodName = str2;
        this.eventType = (byte) 4;
    }

    private DXRuntimeContext findRootRuntimeContext(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("9b3c0e51", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if (!(queryRootWidgetNode.getParentWidget() instanceof bi6) || ((bi6) queryRootWidgetNode.getParentWidget()).H() != 1) {
            return queryRootWidgetNode.getDXRuntimeContext();
        }
        return findRootRuntimeContext(queryRootWidgetNode.getParentWidget());
    }

    public static /* synthetic */ Object ipc$super(DXNativeLogicEventProperty dXNativeLogicEventProperty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/node/event/DXNativeLogicEventProperty");
    }

    public int getEventArgsExprIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d2b776", new Object[]{this})).intValue();
        }
        return -1;
    }

    public long getEventNameExprIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2c6b889", new Object[]{this})).longValue();
        }
        return -1L;
    }

    public String getMethodName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c689e537", new Object[]{this});
        }
        return this.methodName;
    }

    @Override // tb.nvb
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        DXRuntimeContext findRootRuntimeContext = findRootRuntimeContext(dXRuntimeContext.W());
        if (findRootRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.s().f() == null || findRootRuntimeContext.W() == null) {
            h36.g("DXNativeLogicBridge", "call logic 失败 rootRuntimeContext == null");
            return false;
        } else if (dXRuntimeContext.p() == null) {
            h36.g("DXNativeLogicBridge", "call logic 失败 runtimeContext.getDxTemplateItem() == null");
            return false;
        } else {
            DXNativeLogicEngine f = findRootRuntimeContext.W().getDxv4Properties().f();
            if (f == null) {
                DXNativeLogicLoadTask.syncLoadData(findRootRuntimeContext.W(), new a(dXRuntimeContext, dXEvent, findRootRuntimeContext, nanoTime));
                return true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, dXRuntimeContext);
            hashMap.put("dx_event", dXEvent);
            f.callNativeLogicFunc(dXRuntimeContext, dXEvent, this.methodName, hashMap);
            long nanoTime2 = System.nanoTime();
            h36.g("DXNativeLogicBridge", "消耗时间为" + ((nanoTime2 - nanoTime) / 1000000.0d) + "ms");
            return true;
        }
    }
}
