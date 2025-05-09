package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcConfigBean;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ijc f26073a;
    public xyc b;
    public moc c;
    public syd d;
    public kjc e;
    public com.taobao.flowcustoms.afc.xbs.a f;
    public x0e g;
    public dsd h;
    public ald i;
    public tg0 j;
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final pg0 f26074a = new pg0();

        static {
            t2o.a(467664934);
        }
    }

    static {
        t2o.a(467664932);
    }

    public static pg0 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pg0) ipChange.ipc$dispatch("82ca3d18", new Object[0]);
        }
        return b.f26074a;
    }

    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9956d1e", new Object[]{this, str, str2});
            return;
        }
        syd sydVar = this.d;
        if (sydVar != null) {
            ((s8t) sydVar).b(str, str2);
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894b713a", new Object[]{this, str});
            return;
        }
        xyc xycVar = this.b;
        if (xycVar != null) {
            ((not) xycVar).b(str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf1945", new Object[]{this, str, str2});
            return;
        }
        syd sydVar = this.d;
        if (sydVar != null) {
            ((s8t) sydVar).a(str, str2);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68837384", new Object[]{this});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).a();
        }
        return "";
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        return vg0.c().b(str, str2);
    }

    public AfcConfigBean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AfcConfigBean) ipChange.ipc$dispatch("2d446ac1", new Object[]{this, str});
        }
        return (AfcConfigBean) vg0.c().a(str, AfcConfigBean.class);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea92bb37", new Object[]{this});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).b();
        }
        return "";
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c959a1e1", new Object[]{this});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).c();
        }
        return "";
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d886fbdb", new Object[]{this});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).d();
        }
        return "";
    }

    public int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("609e64b7", new Object[]{this, new Integer(i)})).intValue();
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).e();
        }
        return i;
    }

    public boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd696f83", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).i();
        }
        return z;
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ebde34c", new Object[]{this, str});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).f();
        }
        return str;
    }

    public String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d2f8dec", new Object[]{this, str});
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).g();
        }
        return str;
    }

    public long m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199160bb", new Object[]{this, new Long(j)})).longValue();
        }
        ijc ijcVar = this.f26073a;
        if (ijcVar != null) {
            return ((lot) ijcVar).h();
        }
        return j;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        moc mocVar = this.c;
        if (mocVar == null) {
            return "";
        }
        return ((mot) mocVar).a();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        moc mocVar = this.c;
        if (mocVar == null) {
            return false;
        }
        return ((mot) mocVar).b();
    }

    public void p(Context context, qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66bf3e5", new Object[]{this, context, qg0Var});
            return;
        }
        x0e x0eVar = this.g;
        if (x0eVar == null) {
            x77.b(context, qg0Var);
        } else {
            ((rnx) x0eVar).d(context, qg0Var);
        }
    }

    public void q(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f68647", new Object[]{this, str, map});
            return;
        }
        xyc xycVar = this.b;
        if (xycVar != null) {
            ((not) xycVar).a(str, map);
        }
    }

    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a665c27", new Object[]{this, str, str2});
            return;
        }
        dsd dsdVar = this.h;
        if (dsdVar != null) {
            ((pot) dsdVar).a(str, str2);
        }
    }

    public void s(qg0 qg0Var, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e4463e", new Object[]{this, qg0Var, str, hashMap});
            return;
        }
        dsd dsdVar = this.h;
        if (dsdVar != null) {
            ((pot) dsdVar).b(qg0Var, str, hashMap);
        }
    }

    public void t(String str, String str2, HashMap<String, String> hashMap, sjd sjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44061038", new Object[]{this, str, str2, hashMap, sjdVar});
            return;
        }
        vp9.b("linkx", "AfcAdapterManager === requestData === API：" + str + " 参数Map == " + hashMap.toString());
        if (this.j == null) {
            this.j = new tg0();
        }
        this.j.a(str, str2, true, hashMap, sjdVar);
    }

    public boolean u(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef58e79", new Object[]{this, qg0Var})).booleanValue();
        }
        ald aldVar = this.i;
        if (aldVar == null) {
            return false;
        }
        return ((dho) aldVar).a(qg0Var);
    }

    public boolean v(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c337b8bf", new Object[]{this, qg0Var})).booleanValue();
        }
        ald aldVar = this.i;
        if (aldVar == null) {
            return false;
        }
        return ((dho) aldVar).b(qg0Var);
    }

    public boolean w(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc128b8a", new Object[]{this, qg0Var})).booleanValue();
        }
        ald aldVar = this.i;
        if (aldVar == null) {
            return false;
        }
        return ((dho) aldVar).c(qg0Var);
    }

    public boolean x(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a848eb2", new Object[]{this, qg0Var})).booleanValue();
        }
        ald aldVar = this.i;
        if (aldVar == null) {
            return false;
        }
        return ((dho) aldVar).d(qg0Var);
    }

    public boolean y(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73d9bb9", new Object[]{this, qg0Var})).booleanValue();
        }
        ald aldVar = this.i;
        if (aldVar == null) {
            return false;
        }
        return ((dho) aldVar).e(qg0Var);
    }

    public void z(qg0 qg0Var, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a5de69", new Object[]{this, qg0Var, afcXbsData});
            return;
        }
        x0e x0eVar = this.g;
        if (x0eVar == null) {
            if (this.f == null) {
                this.f = new com.taobao.flowcustoms.afc.xbs.a();
            }
            this.f.e(qg0Var, afcXbsData);
            return;
        }
        ((rnx) x0eVar).e(qg0Var, afcXbsData);
    }

    public pg0() {
        this.n = false;
        this.o = false;
    }
}
