package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a1x INSTANCE = new a1x();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(843055133);
    }

    public final void a(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff0fcc", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "traceId");
        ckf.g(str2, "socketId");
        ckf.g(uqVar, "callback");
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, str2, "websocket", "close", new JSONObject(), uqVar);
        k8s j = k8s.j();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "websocket");
        xhv xhvVar = xhv.INSTANCE;
        j.d(bbsVar, TMSCalendarBridge.namespace, str, str2, MUSMonitor.MODULE_DIM_ABILITY, "destroy", jSONObject, a.INSTANCE);
    }

    public final void c(bbs bbsVar, String str, String str2, boolean z, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f3ebfc", new Object[]{this, bbsVar, str, str2, new Boolean(z), str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "traceId");
        ckf.g(str2, "data");
        ckf.g(str3, "socketId");
        ckf.g(uqVar, "callback");
        k8s j = k8s.j();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "isBuffer", (String) Boolean.valueOf(z));
        jSONObject.put((JSONObject) "data", str2);
        xhv xhvVar = xhv.INSTANCE;
        j.d(bbsVar, TMSCalendarBridge.namespace, str, str3, "websocket", "send", jSONObject, uqVar);
    }

    public final void b(bbs bbsVar, String str, String str2, String str3, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e4730", new Object[]{this, bbsVar, str, str2, str3, map, map2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "url");
        ckf.g(str2, "traceId");
        ckf.g(str3, "socketId");
        ckf.g(uqVar, "callback");
        k8s j = k8s.j();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "websocket");
        xhv xhvVar = xhv.INSTANCE;
        j.d(bbsVar, TMSCalendarBridge.namespace, str2, str3, MUSMonitor.MODULE_DIM_ABILITY, "create", jSONObject, b.INSTANCE);
        k8s j2 = k8s.j();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "url", str);
        if (map != null) {
            jSONObject2.put((JSONObject) "headers", (String) map);
        }
        if (map2 != null) {
            jSONObject2.put((JSONObject) "data", (String) map2);
        }
        j2.d(bbsVar, TMSCalendarBridge.namespace, str2, str3, "websocket", "connect", jSONObject2, uqVar);
    }
}
