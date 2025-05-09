package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String START_PAUSE_TRIGGER_TYPE_NAVIGATION = "navigation";
    public static final String START_PAUSE_TRIGGER_TYPE_OTHER = "other";
    public static final String START_PAUSE_TRIGGER_TYPE_TAB = "tab";

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f28012a;
    public final List<r7> b = new ArrayList();
    public final List<t7> c = new ArrayList();
    public final jmi d;
    public final vv1 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963014);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963013);
    }

    public sff(Context context, jmi jmiVar, vv1 vv1Var) {
        ckf.g(context, "context");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        this.d = jmiVar;
        this.e = vv1Var;
        this.f28012a = new FrameLayout(context);
    }

    public final void a(r7 r7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db62b175", new Object[]{this, r7Var});
            return;
        }
        ckf.g(r7Var, "interactComponent");
        if (r7Var.E0()) {
            ((ArrayList) this.b).add(r7Var);
        }
    }

    public final void b(t7 t7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a875a021", new Object[]{this, t7Var});
            return;
        }
        ckf.g(t7Var, "interactLayer");
        ((ArrayList) this.c).add(t7Var);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            this.d.c((r7) it.next());
        }
        Iterator it2 = ((ArrayList) this.c).iterator();
        while (it2.hasNext()) {
            this.d.c((t7) it2.next());
        }
        s();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            this.d.f((r7) it.next());
        }
        Iterator it2 = ((ArrayList) this.c).iterator();
        while (it2.hasNext()) {
            this.d.f((t7) it2.next());
        }
    }

    public final FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        return this.f28012a;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
            return;
        }
        vgh.c(this, "InteractContainer", "页面创建的时机");
        if (this.e.j(PageBaseInfo.State.CREATE)) {
            c();
            p("create", null);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        vgh.c(this, "InteractContainer", "页面销毁的时机");
        if (this.e.j(PageBaseInfo.State.DESTROY)) {
            p("destroy", null);
            d();
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "triggerType");
        vgh.c(this, "InteractContainer", "页面开启的时机");
        if (this.e.j(PageBaseInfo.State.START)) {
            p("start", str);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7efda30", new Object[]{this, str});
            return;
        }
        ckf.g(str, "triggerType");
        vgh.c(this, "InteractContainer", "页面暂停的时机");
        if (this.e.j(PageBaseInfo.State.STOP)) {
            p("stop", str);
        }
    }

    public final void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        vgh.c(this, "InteractContainer", "页面URL参数发生改变的时机，pageURLQuery=" + map);
        this.e.k(map);
        q(map);
    }

    public final void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        vgh.c(this, "InteractContainer", "Tab创建的时机，tabId=" + str + "，tabType=" + str2);
        if (this.e.l(str, str2, TabBaseInfo.State.CREATE)) {
            r(str, str2, "create", null);
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "InteractContainer", "Tab销毁的时机");
        if (this.e.l(str, null, TabBaseInfo.State.DESTROY)) {
            r(str, null, "destroy", null);
        }
    }

    public final void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "triggerType");
        vgh.c(this, "InteractContainer", "Tab开启的时机，tabId=" + str + "，triggerType=" + str2);
        if (this.e.l(str, null, TabBaseInfo.State.START)) {
            r(str, null, "start", str2);
        }
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "triggerType");
        vgh.c(this, "InteractContainer", "Tab暂停的时机，tabId=" + str + "，triggerType=" + str2);
        if (this.e.l(str, null, TabBaseInfo.State.STOP)) {
            r(str, null, "stop", str2);
        }
    }

    public final void o(jmi jmiVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9533be", new Object[]{this, jmiVar, str, jSONObject});
            return;
        }
        tx1 b = tx1.Companion.b(str, jSONObject, System.currentTimeMillis(), null);
        if (b != null) {
            jmiVar.e(b);
        }
    }

    public final void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1164fcd8", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "state", str);
        if (ckf.b(str2, "navigation")) {
            jSONObject.put((JSONObject) "changeType", "navigation");
        } else if (ckf.b(str2, "other")) {
            jSONObject.put((JSONObject) "changeType", "other");
        }
        o(this.d, tx1.PAGE_STATE_CHANGE_NAME, jSONObject);
    }

    public final void q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ece4097", new Object[]{this, map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "urlQuery", (String) map);
        o(this.d, tx1.PAGE_URL_QUERY_CHANGE_NAME, jSONObject);
    }

    public final void r(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c29c22", new Object[]{this, str, str2, str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "id", str);
        jSONObject.put((JSONObject) "type", str2);
        jSONObject.put((JSONObject) "state", str3);
        if (str4 != null) {
            int hashCode = str4.hashCode();
            if (hashCode != 114581) {
                if (hashCode != 106069776) {
                    if (hashCode == 1862666772 && str4.equals("navigation")) {
                        jSONObject.put((JSONObject) "changeType", "navigation");
                    }
                } else if (str4.equals("other")) {
                    jSONObject.put((JSONObject) "changeType", "other");
                }
            } else if (str4.equals("tab")) {
                jSONObject.put((JSONObject) "changeType", "tab");
            }
        }
        o(this.d, tx1.TAB_STATE_CHANGE_NAME, jSONObject);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab5796b", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("localEnable", "true");
        hashMap.put("testEnable", "true");
        hashMap.put("result", "true");
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        cbu.c("Page_VideoCash_EnableTab2GlobalInteract", hashMap);
    }
}
