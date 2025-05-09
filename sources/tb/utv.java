package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class utv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, v22> f29610a = new HashMap<>();
    public final v22 b;
    public Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v22 f29611a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ x3w c;

        public a(v22 v22Var, Map map, x3w x3wVar) {
            this.f29611a = v22Var;
            this.b = map;
            this.c = x3wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29611a.k(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f29612a;
        public final /* synthetic */ x3w b;

        public b(Map map, x3w x3wVar) {
            this.f29612a = map;
            this.b = x3wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                utv.a(utv.this).k(this.f29612a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v22 f29613a;

        public c(v22 v22Var) {
            this.f29613a = v22Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29613a.l();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                utv.a(utv.this).l();
            }
        }
    }

    static {
        t2o.a(352321898);
    }

    public utv(cxj cxjVar, dh7 dh7Var) {
        this.b = new v22(cxjVar, dh7Var, "Page_NewDetail");
    }

    public static /* synthetic */ v22 a(utv utvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v22) ipChange.ipc$dispatch("80094366", new Object[]{utvVar});
        }
        return utvVar.b;
    }

    public Map<String, String> b(String str, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("26ea3418", new Object[]{this, str, map, x3wVar});
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var == null) {
            return this.b.d(map, x3wVar);
        }
        try {
            return v22Var.d(map, x3wVar);
        } catch (Exception e) {
            e.printStackTrace();
            if (map == null) {
                return new HashMap();
            }
            return map;
        }
    }

    public void c(String str, v22 v22Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529b319b", new Object[]{this, str, v22Var});
        } else {
            this.f29610a.put(str, v22Var);
        }
    }

    public void d(String str, String str2, String str3, String str4, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a1ecd2", new Object[]{this, str, str2, str3, str4, map, x3wVar});
        } else {
            e(str, str2, str3, str4, map, x3wVar, false);
        }
    }

    public void e(String str, String str2, String str3, String str4, Map<String, String> map, x3w x3wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9c6042", new Object[]{this, str, str2, str3, str4, map, x3wVar, new Boolean(z)});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.i(str2, str3, str4, map, x3wVar, z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.i(str2, str3, str4, map, x3wVar, z);
        }
    }

    public void f(String str, String str2, String str3, String str4, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce9c07", new Object[]{this, str, str2, str3, str4, map, x3wVar});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.j(str2, str3, str4, map, x3wVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.j(str2, str3, str4, map, x3wVar);
        }
    }

    public void g(String str, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b80ea6", new Object[]{this, str, map, x3wVar});
            return;
        }
        if (x3wVar != null) {
            x3wVar.B = true;
            if (x3wVar.g) {
                HashMap hashMap = new HashMap();
                hashMap.put("effectItemShowIndex", String.valueOf(x3wVar.f31127a));
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_TRACK_PAGE, hashMap);
            }
        }
        if (r19.v0()) {
            h(str, map, x3wVar);
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.k(map, x3wVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.k(map, x3wVar);
        }
    }

    public void h(String str, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73217004", new Object[]{this, str, map, x3wVar});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                Coordinator.execute(new a(v22Var, map, x3wVar), 28);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Coordinator.execute(new b(map, x3wVar), 28);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fbd03a", new Object[]{this, str});
        } else if (r19.v0()) {
            j(str);
        } else {
            v22 v22Var = this.f29610a.get(str);
            if (v22Var != null) {
                try {
                    v22Var.l();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                this.b.l();
            }
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5166be4", new Object[]{this, str});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                Coordinator.execute(new c(v22Var), 28);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Coordinator.execute(new d(), 28);
        }
    }

    public void k(String str, Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617d9913", new Object[]{this, str, map, x3wVar});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.m(map, x3wVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.m(map, x3wVar);
        }
    }

    public void l(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a71969", new Object[]{this, str, map});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.n(map);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.n(map);
        }
    }

    public void m(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28915e2", new Object[]{this, str, jSONObject});
            return;
        }
        v22 v22Var = this.f29610a.get(str);
        if (v22Var != null) {
            try {
                v22Var.o(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.o(jSONObject);
        }
    }
}
