package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pw5 implements rvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, uw5> f26350a = new HashMap(150);

    static {
        t2o.a(444597773);
        t2o.a(444598019);
        b(new hg5());
        b(new lh5());
        b(new fv5());
        b(new dy5());
        b(new ey5());
        b(new l16());
        b(new n16());
        b(new rc6());
        b(new bj6());
        b(new od6());
        b(new zi6());
        b(new aj6());
        b(new bj6());
        b(new fj6());
        b(new ta6());
        b(new gj6());
        b(new fc6());
        b(new dp5());
        b(new hn5());
        b(new rg5());
        b(new zu5());
        b(new m16());
        b(new m36());
        b(new ab6());
        b(new cb6());
        b(new zc6());
        b(new dd6());
        b(new pj6());
        b(new el6());
        b(new lb5());
        b(new rc5());
        b(new o16());
        b(new yi6());
        b(new mh5());
        b(new nh5());
        b(new v86());
        b(new w86());
        b(new b56());
        b(new mb6());
        b(new ld6());
        b(new vh5());
        b(new vb5());
        b(new wb5());
        b(new kh5());
        b(new z06());
        b(new o26());
        b(new sa6());
        b(new nd6());
        b(new a56());
        b(new qb5());
        b(new bg5());
        b(new qh5());
        b(new nx5());
        b(new g36());
        b(new f36());
        b(new j36());
        b(new b46());
        b(new i46());
        b(new i86());
        b(new ib6());
        b(new qc6());
        b(new cd6());
        b(new of6());
        b(new qj6());
        b(new hb6());
        b(new fb5());
        b(new xc5());
        b(new hu5());
        b(new ev5());
        b(new c76());
        b(new ob6());
        b(new l66());
        b(new cj6());
        b(new ej6());
        b(new dj6());
        b(new qk6());
        b(new za6());
        b(new b16());
        b(new ad6());
        b(new sh5());
        b(new vt5());
        b(new fy5());
        b(new kj5());
        b(new wn5());
        b(new xk5());
        b(new gb6());
        b(new xp5());
        b(new fl5());
        b(new wp5());
        b(new bk5());
        b(new ql5());
        b(new ps5());
        b(new pd6());
        b(new eo5());
        b(new zh5());
        b(new gq5());
        b(new hp5());
        b(new en5());
        b(new jt5());
        b(new dk5());
    }

    public static void b(xwb xwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919dff45", new Object[]{xwbVar});
        } else {
            rvb.BUILD_IN_FUNC_MAP.put(xwbVar.getDxFunctionName(), uw5.R(xwbVar));
        }
    }

    public uw5 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("fd4c7fab", new Object[]{this, str});
        }
        uw5 uw5Var = rvb.BUILD_IN_FUNC_MAP.get(str);
        if (uw5Var != null) {
            return uw5Var;
        }
        return (uw5) ((HashMap) this.f26350a).get(str);
    }

    public void c(xwb xwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89c6c58", new Object[]{this, xwbVar});
        } else {
            ((HashMap) this.f26350a).put(xwbVar.getDxFunctionName(), uw5.R(xwbVar));
        }
    }
}
