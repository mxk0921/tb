package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class boq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boq INSTANCE = new boq();

    static {
        t2o.a(843055106);
    }

    public final void a(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7351717", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "bizId");
        ckf.g(uqVar, "callback");
        TMSLogger.a("StorageMegaAbility", ckf.p("clear: bizId: ", str2));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", str2);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, null, "kvStorage", pg1.ATOM_EXT_clear, jSONObject, uqVar);
    }

    public final void b(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d70416a", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "bizId");
        ckf.g(uqVar, "callback");
        TMSLogger.a("StorageMegaAbility", ckf.p("getCurrentInfoAndKeys: bizId: ", str2));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", str2);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, null, "kvStorage", "getCurrentInfoAndKeys", jSONObject, uqVar);
    }

    public final void c(bbs bbsVar, String str, String str2, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87242d51", new Object[]{this, bbsVar, str, str2, str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "bizId");
        ckf.g(str3, "key");
        ckf.g(uqVar, "callback");
        TMSLogger.a("StorageMegaAbility", "getItem: bizId: " + str2 + ", key: " + str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", str2);
        jSONObject.put((JSONObject) "key", str3);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, null, "kvStorage", "getItem", jSONObject, uqVar);
    }

    public final void d(bbs bbsVar, String str, String str2, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf5fe63", new Object[]{this, bbsVar, str, str2, str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "bizId");
        ckf.g(str3, "key");
        ckf.g(uqVar, "callback");
        TMSLogger.a("StorageMegaAbility", "removeItem: bizId: " + str2 + ", key: " + str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", str2);
        jSONObject.put((JSONObject) "key", str3);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, null, "kvStorage", "removeItem", jSONObject, uqVar);
    }

    public final void e(bbs bbsVar, String str, String str2, String str3, String str4, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc9b83b", new Object[]{this, bbsVar, str, str2, str3, str4, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "bizId");
        ckf.g(str3, "key");
        ckf.g(uqVar, "callback");
        TMSLogger.a("StorageMegaAbility", "setItem: bidId: " + str2 + ", key: " + str3 + ", value: " + ((Object) str4));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", str2);
        jSONObject.put((JSONObject) "key", str3);
        jSONObject.put((JSONObject) "value", str4);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, str, null, "kvStorage", "setItem", jSONObject, uqVar);
    }
}
