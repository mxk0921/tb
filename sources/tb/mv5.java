package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mv5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_EVENTCHAIN = -812009131795779670L;
    public static final AtomicInteger b = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final b f24327a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f24328a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f24328a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mv5.this.e(this.f24328a, this.b, this.c, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(rv5 rv5Var);
    }

    static {
        t2o.a(444596676);
    }

    public mv5(b bVar) {
        this.f24327a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r7, tb.iv5 r8, java.lang.String r9, com.taobao.android.dinamicx.expression.event.DXEvent r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mv5.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "7780e30b"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r8
            r7 = 2
            r2[r7] = r9
            r7 = 3
            r2[r7] = r10
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            boolean r0 = com.taobao.android.dinamicx.DinamicXEngine.j0()
            if (r0 == 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicInteger r0 = tb.mv5.b
            int r2 = r0.incrementAndGet()
            if (r8 == 0) goto L_0x0038
            r8.w()
            com.taobao.android.dinamicx.DXRuntimeContext r0 = r8.l()
            if (r0 == 0) goto L_0x0038
            com.taobao.android.dinamicx.template.download.DXTemplateItem r0 = r0.p()
        L_0x0036:
            r4 = r0
            goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x0036
        L_0x003a:
            tb.vj8 r0 = new tb.vj8
            r1 = r0
            r3 = r7
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x0048
            r8.C(r0)
        L_0x0048:
            tb.hjo r7 = tb.hjo.c()
            r7.e(r0)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mv5.d(java.lang.String, tb.iv5, java.lang.String, com.taobao.android.dinamicx.expression.event.DXEvent):void");
    }

    public static /* synthetic */ Object ipc$super(mv5 mv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/DXEventChainEventHandler");
    }

    public void a(String str, rv5 rv5Var, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e145a157", new Object[]{this, str, rv5Var, iv5Var});
        }
    }

    public void b(String str, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2475e680", new Object[]{this, str, iv5Var});
        }
    }

    public tk6 c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tk6) ipChange.ipc$dispatch("a4f29cfb", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        }
        return new tk6();
    }

    @Override // tb.ob5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxEventHandler";
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!zg5.l2()) {
            e(dXEvent, objArr, dXRuntimeContext, null);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            e(dXEvent, objArr, dXRuntimeContext, null);
        } else {
            jb6.n(new a(dXEvent, objArr, dXRuntimeContext));
        }
    }

    public mv5() {
    }

    public void e(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode) {
        Object obj;
        iv5 iv5Var;
        Throwable th;
        long nanoTime;
        tk6 c;
        String obj2;
        Object obj3;
        qv5 H;
        iv5 iv5Var2;
        Map<String, mw5> args;
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e634a88", new Object[]{this, dXEvent, objArr, dXRuntimeContext, dXWidgetNode});
        } else if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null && !TextUtils.isEmpty(obj.toString())) {
            if (dXRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.s().f() == null || dXRuntimeContext.s().f().H() == null) {
                h36.g("DXEventChainEventHandler", "dx evnetchain handle error : Missing the necessary parameters(eventChainManage)");
                return;
            }
            try {
                nanoTime = System.nanoTime();
                c = c(dXEvent, objArr, dXRuntimeContext);
                c.i(dXRuntimeContext.h());
                c.m(dXRuntimeContext.D());
                obj2 = objArr[0].toString();
                obj3 = objArr.length > 1 ? objArr[1] : null;
                DXTraceUtil.a(2, "DX-EventChain-Start", " : ", obj2);
                H = dXRuntimeContext.s().f().H();
                iv5Var2 = new iv5();
            } catch (Throwable th2) {
                th = th2;
                iv5Var = null;
            }
            try {
                iv5Var2.J(dXRuntimeContext.D());
                iv5Var2.B(dXRuntimeContext);
                iv5Var2.x(c);
                iv5Var2.A(H);
                if (zg5.u5() && (dXWidgetNode instanceof DXWidgetNode)) {
                    iv5Var2.D(dXWidgetNode.getDxEventChains());
                    iv5Var2.H(true);
                } else if (zg5.u5() && dXRuntimeContext.W() == null && (queryRootWidgetNode = dXRuntimeContext.W().queryRootWidgetNode()) != null) {
                    iv5Var2.D(queryRootWidgetNode.getDxEventChains());
                }
                c.g(H.p());
                c.r(dXRuntimeContext.L());
                c.s(dXRuntimeContext.W());
                H.q(iv5Var2);
                JSONObject jSONObject = new JSONObject();
                if (!(dXEvent == null || (args = dXEvent.getArgs()) == null)) {
                    for (Map.Entry<String, mw5> entry : args.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue().s());
                    }
                }
                ov5 ov5Var = new ov5();
                ov5Var.g(c);
                ov5Var.j(obj3);
                ov5Var.k(jSONObject);
                ov5Var.i(dXEvent);
                dXRuntimeContext.k0(ov5Var);
                iv5Var2.F(ov5Var);
                if (DinamicXEngine.j0()) {
                    d(obj2, iv5Var2, dXRuntimeContext.W() != null ? dXRuntimeContext.W().getClass().getName() : null, dXEvent);
                }
                iv5Var2.E(obj2);
                b(obj2, iv5Var2);
                iv5Var2.K(objArr.length > 3 ? "true".equals(objArr[2]) : false);
                if (eb5.u()) {
                    h36.n(" 开始执行事件链 ", obj2);
                }
                rv5 l = H.l("$(main)", obj2, iv5Var2);
                if (eb5.u()) {
                    h36.n(" 结束执行事件链 ", obj2, " ret ", JSON.toJSONString(l));
                }
                b bVar = this.f24327a;
                if (bVar != null) {
                    bVar.a(l);
                }
                a(obj2, l, iv5Var2);
                long nanoTime2 = System.nanoTime();
                if (eb5.s()) {
                    h36.m("执行事件链 " + obj2 + " 耗时为 " + ((nanoTime2 - nanoTime) / 1000000.0d) + " ms");
                }
                DXTraceUtil.d(2);
            } catch (Throwable th3) {
                th = th3;
                iv5Var = iv5Var2;
                f.a aVar = new f.a("DX_EventChain", "DX_EventChain_Crash", f.EVENTCHAIN_EXECUTE_CRASH);
                aVar.e = xv5.a(th);
                ((ArrayList) dXRuntimeContext.m().c).add(aVar);
                if (DinamicXEngine.j0()) {
                    qv5.j(iv5Var != null ? iv5Var.s() : -1, rv5.a(-1, th.getMessage()), iv5Var);
                }
                xv5.b(th);
            }
        }
    }
}
