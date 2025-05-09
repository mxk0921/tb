package com.alibaba.android.ultron.common.page;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.common.page.provider.UltronCommonDataProviderDataSourceType;
import com.alibaba.android.ultron.common.page.provider.impl.UltronCommonClientEngineDataProvider;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import java.util.HashMap;
import java.util.Map;
import tb.b8v;
import tb.fdv;
import tb.g5e;
import tb.gj4;
import tb.h5e;
import tb.hlq;
import tb.kdv;
import tb.pi8;
import tb.r6v;
import tb.rk8;
import tb.s6v;
import tb.t2o;
import tb.t6v;
import tb.tj8;
import tb.u6v;
import tb.w6v;
import tb.yk8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_FINISH = "加载完成";

    /* renamed from: a  reason: collision with root package name */
    public PtrBase f2249a;
    public JSONObject b;
    public final Context c;
    public d d;
    public String f;
    public String g;
    public g5e h;
    public RecyclerView k;
    public LinearLayout l;
    public LinearLayout m;
    public final g5e i = new s6v();
    public final Map<String, Class<? extends g5e>> j = new HashMap();
    public final hlq e = new hlq(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.this.o(1);
            if (b.a(b.this) != null) {
                b.a(b.this).f(1);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.ultron.common.page.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0069b implements g5e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2251a;

        public C0069b(int i) {
            this.f2251a = i;
        }

        @Override // tb.g5e.a
        public void a(String str, String str2, w6v w6vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d29e01d6", new Object[]{this, str, str2, w6vVar});
                return;
            }
            b.b(b.this, null);
            b.a(b.this).a(this.f2251a);
            if (b.c(b.this) != null) {
                b.c(b.this).a(0, 0, 2);
            }
            if (b.a(b.this) != null) {
                b.a(b.this).c(w6vVar);
            }
        }

        @Override // tb.g5e.a
        public void b(r6v r6vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c3533cb", new Object[]{this, r6vVar});
                return;
            }
            b.b(b.this, r6vVar.a());
            b.a(b.this).a(this.f2251a);
            if (b.c(b.this) != null) {
                b.c(b.this).a(0, 0, 0);
            }
            if (b.a(b.this) != null) {
                b.a(b.this).d(r6vVar.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void a(int i, int i2, int i3);
    }

    static {
        t2o.a(153092117);
    }

    public b(Context context) {
        this.c = context;
        p();
    }

    public static /* synthetic */ hlq a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hlq) ipChange.ipc$dispatch("bdd583d", new Object[]{bVar});
        }
        return bVar.e;
    }

    public static /* synthetic */ void b(b bVar, u6v u6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4340621", new Object[]{bVar, u6vVar});
        } else {
            bVar.m(u6vVar);
        }
    }

    public static /* synthetic */ d c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("86adfb0f", new Object[]{bVar});
        }
        return bVar.d;
    }

    public static /* synthetic */ PtrBase d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("5e6dcacf", new Object[]{bVar});
        }
        return bVar.f2249a;
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    public g5e f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5e) ipChange.ipc$dispatch("45477f6e", new Object[]{this});
        }
        return g(this.g);
    }

    public final g5e g(String str) {
        g5e g5eVar = this.h;
        if (g5eVar != null) {
            return g5eVar;
        }
        Class cls = (Class) ((HashMap) this.j).get(str);
        if (cls == null) {
            return this.i;
        }
        try {
            this.h = (g5e) cls.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
        return this.h;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c47bf40a", new Object[]{this});
        }
        return g(this.g).d();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7032815b", new Object[]{this})).booleanValue();
        }
        return g(this.g).a();
    }

    public void j(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab0519f", new Object[]{this, linearLayout, recyclerView, linearLayout2, ptrBase});
            return;
        }
        this.k = recyclerView;
        this.l = linearLayout;
        this.m = linearLayout2;
        String str = this.g;
        if (str != null) {
            g(str).g(linearLayout, recyclerView, linearLayout2);
        }
        tj8.g(new yk8());
        tj8.h(new rk8());
        this.f2249a = ptrBase;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else {
            g(this.g).loadMore();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            g(this.g).onDestroy();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7751f22e", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new a());
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb7c645", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.f(i);
        g(this.g).b(this.c, this.b, null, new C0069b(i));
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e26c3c", new Object[]{this});
            return;
        }
        this.j.put("mtop", t6v.class);
        this.j.put(UltronCommonDataProviderDataSourceType.clientEngine, UltronCommonClientEngineDataProvider.class);
    }

    public void q(JSONObject jSONObject, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e897e0", new Object[]{this, jSONObject, str, map});
            return;
        }
        this.b = jSONObject;
        this.f = str;
        if (jSONObject != null) {
            String str2 = gj4.h;
            if (jSONObject.containsKey(str2)) {
                JSONObject jSONObject2 = this.b.getJSONObject(str2);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString(gj4.i);
                    this.g = string;
                    g5e g = g(string);
                    g.f(this.c, this.b.getString(gj4.v), this.f, jSONObject2, map);
                    g.g(this.l, this.k, this.m);
                    g.e(new c());
                    boolean equals = TextUtils.equals("true", this.b.getString(gj4.c));
                    boolean equals2 = TextUtils.equals("true", this.b.getString(gj4.d));
                    if (equals && equals2) {
                        this.f2249a.setMode(PullBase.Mode.BOTH);
                        return;
                    } else if (equals) {
                        this.f2249a.setMode(PullBase.Mode.PULL_FROM_START);
                        return;
                    } else if (equals2) {
                        this.f2249a.setMode(PullBase.Mode.PULL_FROM_END);
                        return;
                    } else {
                        this.f2249a.setMode(PullBase.Mode.DISABLED);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        try {
            kdv.a(this.f, fdv.F_DATA_PROCESS, "PAGE_CONFIG_EMPTY", "get asset pageconfig error", null, null);
            kdv.b(this.f, fdv.F_DATA_PROCESS, "get_page_config", "PAGE_CONFIG_EMPTY", "get asset pageconfig error", null);
        } catch (Exception unused) {
        }
    }

    public void r(pi8 pi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfe543d", new Object[]{this, pi8Var});
        } else {
            this.e.e(pi8Var);
        }
    }

    public void s(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba84a6fc", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public void t(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad4279", new Object[]{this, jSONArray});
        } else {
            g(this.g).c(jSONArray);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements h5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void b(b8v b8vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("135f40e7", new Object[]{this, b8vVar});
            } else {
                b.this.o(2);
            }
        }

        public void a(JSONObject jSONObject) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429f4bfa", new Object[]{this, jSONObject});
                return;
            }
            b.d(b.this).refreshComplete(b.LOAD_FINISH);
            JSONObject jSONObject2 = null;
            if (jSONObject == null && jSONObject.getJSONObject("data") == null) {
                b.b(b.this, null);
                return;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("data").getJSONObject("global");
            if (jSONObject3 != null) {
                jSONObject2 = jSONObject3.getJSONObject(gj4.m);
            }
            boolean z2 = jSONObject2 != null && TextUtils.equals("true", jSONObject2.getString(gj4.n));
            if (jSONObject2 == null || !TextUtils.equals("true", jSONObject2.getString(gj4.l))) {
                z = false;
            }
            b.b(b.this, new u6v(z2, z));
        }
    }

    public final void m(u6v u6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1c2df0", new Object[]{this, u6vVar});
            return;
        }
        PtrBase ptrBase = this.f2249a;
        if (ptrBase != null) {
            try {
                if (u6vVar != null) {
                    boolean a2 = u6vVar.a();
                    boolean b = u6vVar.b();
                    if (a2 && b) {
                        k();
                    } else if (!a2) {
                        this.f2249a.freezeEnd(true, "");
                    }
                } else {
                    ptrBase.freezeEnd(true, "");
                }
            } catch (Exception e) {
                String message = e.getMessage();
                kdv.a(this.f, fdv.F_DATA_PROCESS, "QUERY_END_EXCEPTION", message, null, null);
                kdv.b(this.f, fdv.F_DATA_PROCESS, "RESPONSE_GLOBAL_PROCESS", "QUERY_END_EXCEPTION", message, null);
            }
            this.f2249a.refreshComplete(LOAD_FINISH);
        }
    }
}
