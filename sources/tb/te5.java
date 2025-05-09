package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import java.util.Map;
import tb.oc5;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class te5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CDRESSCARDJUMP = -2215712269441067640L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f28656a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552727);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552726);
    }

    public te5(qpu qpuVar) {
        this.f28656a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(te5 te5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCDressCardJumpEventHandler");
    }

    public final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc58cdba", new Object[]{this, context, str});
        } else if (context == null) {
            tpu.Companion.a("DXCDressCardJumpEventHandler", "BannerJump:Error:跳转失败:context is null.", null);
        } else if (str == null) {
            tpu.Companion.a("DXCDressCardJumpEventHandler", "BannerJump:Error:跳转失败:moduleJumpUrl is null.", null);
        } else {
            Nav.from(context).toUri(str);
        }
    }

    public final void b(Map<String, ? extends Object> map, int i, Map<String, ? extends Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958d5cf4", new Object[]{this, map, new Integer(i), map2});
            return;
        }
        qpu qpuVar = this.f28656a;
        if (qpuVar == null) {
            tpu.Companion.a("DXCDressCardJumpEventHandler", "BannerJump:Error:埋点失败:mTurboEngineContext null.", null);
            return;
        }
        d2e d2eVar = (d2e) qpuVar.getService(d2e.class);
        HashMap hashMap = new HashMap();
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("index", Integer.valueOf(i));
        d2eVar.q("Button-homeBanner", hashMap, null);
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        Object obj = !(objArr.length == 0) ? objArr[0] : null;
        Object obj2 = objArr.length >= 2 ? objArr[1] : null;
        int P = dXRuntimeContext.P();
        Integer valueOf = Integer.valueOf(P);
        oc5.a aVar = oc5.Companion;
        Map<String, Object> c = aVar.c(dXRuntimeContext.O());
        Context h = dXRuntimeContext.h();
        String d = obj != null ? aVar.d(obj) : null;
        Map<String, Object> c2 = obj2 != null ? aVar.c(obj2) : null;
        tpu.a aVar2 = tpu.Companion;
        aVar2.a("DXCDressCardJumpEventHandler", "Debug:BannerJump: bannerIndex:" + valueOf + " moduleJumpUrl:" + d + " extraArgs:" + c2 + " moduleData:" + c, null);
        b(c2, P, c);
        a(h, d);
    }
}
