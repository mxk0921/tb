package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f15603a;
    public q5e b;
    public final wzd c;
    public final tq6 d;
    public final b e;
    public cit f;
    public final com.alibaba.android.ultron.vfw.instance.a g;
    public final boolean h;
    public a i;
    public final qe8 j = new qe8();
    public final String k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f15604a;
        public final List<String> b;
        public final kih c;

        static {
            t2o.a(157286406);
        }

        public a(String str, List<String> list, kih kihVar) {
            this.f15604a = str;
            this.b = list;
            this.c = kihVar;
        }

        public List<String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("91ba76ad", new Object[]{this});
            }
            return this.b;
        }

        public kih b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kih) ipChange.ipc$dispatch("f5fa73bd", new Object[]{this});
            }
            return this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
            }
            return this.f15604a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(UltronError ultronError);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f15605a;
        public final b b;

        static {
            t2o.a(157286408);
            t2o.a(157286407);
        }

        public c(boolean z, b bVar) {
            this.f15605a = z;
            this.b = bVar;
        }

        @Override // tb.a8v.b
        public void a(UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ef52f6e", new Object[]{this, ultronError});
            } else if (!this.f15605a || ultronError == null || (!"F_ULTRON_ENGINE_10002_JSI".equalsIgnoreCase(ultronError.code) && !"F_ULTRON_ENGINE_10004_JSI".equalsIgnoreCase(ultronError.code) && !"F_ULTRON_ENGINE_10005_JSI".equalsIgnoreCase(ultronError.code) && !"F_ULTRON_ENGINE_10006_JSI".equalsIgnoreCase(ultronError.code) && !"F_ULTRON_ENGINE_10007_JSI".equalsIgnoreCase(ultronError.code))) {
                b bVar = this.b;
                if (bVar != null) {
                    bVar.a(ultronError);
                }
            } else {
                a8v.a(a8v.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f15606a;

        static {
            t2o.a(157286409);
        }
    }

    static {
        t2o.a(157286405);
    }

    public a8v(Context context, boolean z, com.alibaba.android.ultron.vfw.instance.a aVar, tq6 tq6Var, String str, b bVar) {
        this.f15603a = context;
        this.g = aVar;
        this.h = z;
        this.e = bVar;
        this.d = tq6Var;
        this.k = str;
        e(context, tq6Var, str);
        this.c = new hjt(aVar, context, str);
        g();
    }

    public static /* synthetic */ void a(a8v a8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1355d7d", new Object[]{a8vVar});
        } else {
            a8vVar.o();
        }
    }

    public void b(String str, String str2, coc cocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdb35f2", new Object[]{this, str, str2, cocVar});
        } else {
            this.j.a(str, str2, cocVar);
        }
    }

    public void c(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3204f127", new Object[]{this, iDMComponent, jSONObject});
        } else {
            ((hjt) this.c).b(iDMComponent, jSONObject);
        }
    }

    public void d(String str, List<String> list, kih kihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2302181", new Object[]{this, str, list, kihVar});
        } else if (this.b != null) {
            this.i = new a(str, list, kihVar);
            this.b.b(str, list, kihVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        q5e q5eVar = this.b;
        if (q5eVar != null) {
            q5eVar.destroy();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        cit i = i(this.d.f());
        if (i != null && i.f17087a) {
            UltronError ultronError = new UltronError("模板引擎init出错:" + i.b.f17088a);
            ultronError.code = String.valueOf(i.b.f17088a);
            ultronError.extraMsg = i.b.b;
        }
        String e = this.d.e();
        String d2 = this.d.d();
        if (!TextUtils.isEmpty(e)) {
            h(e, d2);
        }
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a8c22b", new Object[]{this, str, str2});
            return;
        }
        q5e q5eVar = this.b;
        if (q5eVar != null) {
            q5eVar.a(str, str2);
        }
    }

    public cit i(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("55fed9fd", new Object[]{this, templateInfo});
        }
        cit k = ((hjt) this.c).k(templateInfo);
        this.f = k;
        return k;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e40923", new Object[]{this})).booleanValue();
        }
        return this.b instanceof e9v;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36e97abc", new Object[]{this})).booleanValue();
        }
        return this.b instanceof UltronWebViewJsEngine;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2377240c", new Object[]{this})).booleanValue();
        }
        boolean z = this.b instanceof UltronWebViewJsEngine;
        return false;
    }

    public cit m(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("eb052a3f", new Object[]{this, dVar});
        }
        cit citVar = this.f;
        if (citVar == null || !citVar.f17087a) {
            return ((hjt) this.c).o(dVar);
        }
        return citVar;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46aada4b", new Object[]{this});
        } else {
            ((hjt) this.c).p();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d78408", new Object[]{this});
            return;
        }
        q5e q5eVar = this.b;
        if (!(q5eVar instanceof UltronWebViewJsEngine)) {
            if (q5eVar != null) {
                q5eVar.destroy();
            }
            this.b = new UltronWebViewJsEngine(this.f15603a, this.g, this.k, this.j, this.e);
            h(this.d.e(), this.d.d());
            a aVar = this.i;
            if (aVar != null) {
                d(aVar.c(), this.i.a(), this.i.b());
            }
        }
    }

    public final void e(Context context, tq6 tq6Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b008dd87", new Object[]{this, context, tq6Var, str});
        } else if (tq6.DATA_PARSER_TYPE_SCRIPT.equals(tq6Var.c())) {
            UnifyLog.m(this.k, "UltronEngine", "use jsi engine", new String[0]);
            this.b = new e9v(context, this.g, str, this.j, new c(this.h, this.e));
        }
    }
}
