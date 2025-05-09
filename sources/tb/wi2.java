package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wi2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f30710a;
    public final HashMap<String, bvk> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262647);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30711a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ oa4 c;

        public b(String str, Map.Entry entry, JSONObject jSONObject, wi2 wi2Var, oa4 oa4Var) {
            this.f30711a = str;
            this.b = jSONObject;
            this.c = oa4Var;
        }

        @Override // tb.bvk
        public final void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            this.b.put((JSONObject) this.f30711a, (String) obj2);
            this.c.updateComponent();
        }
    }

    static {
        t2o.a(912262646);
    }

    public wi2(Context context, ze7 ze7Var) {
        ckf.h(context, "context");
        ckf.h(ze7Var, "detailContext");
        this.f30710a = ze7Var;
    }

    public final void a(oa4<nb4> oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f763889", new Object[]{this, oa4Var});
            return;
        }
        d();
        c(oa4Var);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            d();
        }
    }

    public final void c(oa4<nb4> oa4Var) {
        nb4 componentData;
        JSONObject f;
        JSONObject jSONObject;
        Object c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e595d08", new Object[]{this, oa4Var});
        } else if (oa4Var != null && (componentData = oa4Var.getComponentData()) != null && (f = componentData.f()) != null && (jSONObject = f.getJSONObject("_dObserveStates")) != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    b bVar = new b(key, entry, jSONObject, this, oa4Var);
                    try {
                        viq i = this.f30710a.i();
                        if (!(i == null || (c = i.c(key)) == null || c.equals(entry.getValue()))) {
                            jSONObject.put((JSONObject) key, (String) c);
                            oa4Var.updateComponent();
                        }
                    } catch (Exception e) {
                        tgh.b("BottomBarComponentUpdater", "update failed with exception: " + e.getMessage());
                    }
                    viq i2 = this.f30710a.i();
                    if (i2 != null) {
                        i2.e(key, bVar);
                    }
                    this.b.put(key, bVar);
                }
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823f3a1", new Object[]{this});
            return;
        }
        for (Map.Entry<String, bvk> entry : this.b.entrySet()) {
            viq i = this.f30710a.i();
            if (i != null) {
                i.g(entry.getKey(), entry.getValue());
            }
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }
}
