package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.msoa.MSOAWVService;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ne5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CADDCART = 1703500485186616574L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f24676a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552720);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            } else {
                tpu.a.b(tpu.Companion, "DXCAddCartEventHandler", "call orderGood success", null, 4, null);
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else {
                tpu.a.b(tpu.Companion, "DXCAddCartEventHandler", "call orderGood success", null, 4, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public final void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DXCAddCartEventHandler", "call orderGood failed " + str, null, 4, null);
        }
    }

    static {
        t2o.a(918552719);
    }

    public ne5(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.f24676a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(ne5 ne5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCAddCartEventHandler");
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
        a(dXRuntimeContext.i(), mqu.Companion.h(objArr[0], null));
    }

    public final void a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d11e12", new Object[]{this, map, map2});
            return;
        }
        Object obj = null;
        Object obj2 = map2 != null ? map2.get("item") : null;
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        Object obj3 = map3 != null ? map3.get("itemId") : null;
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str = (String) obj3;
        if (str != null) {
            Object obj4 = map != null ? map.get("content") : null;
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            Map map4 = (Map) obj4;
            Object obj5 = map4 != null ? map4.get("id") : null;
            if (obj5 instanceof String) {
                obj = obj5;
            }
            String str2 = (String) obj;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            if (str2.length() > 0) {
                str3 = "contId";
            }
            String concat = str3.concat(",contScn");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("itemId", str);
            linkedHashMap.put("sourceType", "4");
            linkedHashMap.put("bizName", "minidetail");
            linkedHashMap.put("exParams", kotlin.collections.a.j(jpu.a("bizName", "minidetail"), jpu.a("bottomMode", "ADDCART_AND_BUYNOW"), jpu.a("contId", str2), jpu.a("contScn", "1"), jpu.a(r4p.KEY_MSOA_TRANS_KEY, concat)));
            ((kee) this.f24676a.getService(kee.class)).Q0(MSOAWVService.PLUGIN_NAME, "requestService", kotlin.collections.a.j(jpu.a("serviceId", "msoa.taobao.detail.showsku"), jpu.a("version", "2.0"), jpu.a("bizName", "minidetail"), jpu.a("sceneName", "minidetail"), jpu.a("params", linkedHashMap)), new b(), c.INSTANCE);
            wn2.Companion.a(this.f24676a, map, map2, to8.ADD_CART);
        }
    }
}
