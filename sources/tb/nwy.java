package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262854);
    }

    public static mwy a(ze7 ze7Var) {
        d1i d1iVar;
        eos t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwy) ipChange.ipc$dispatch("55267dd0", new Object[]{ze7Var});
        }
        if (!(ze7Var == null || (d1iVar = (d1i) ze7Var.e().e(hzh.PARSER_ID)) == null || d1iVar.t() == null || d1iVar.t().t() == null || (t = d1iVar.t().t()) == null || t.m() == null)) {
            for (int i = 0; i < t.m().size(); i++) {
                z4k z4kVar = (z4k) t.m().get(i);
                if (z4kVar != null) {
                    oa4 f = z4kVar.f(ze7Var.d());
                    if (f instanceof mwy) {
                        return (mwy) f;
                    }
                }
            }
        }
        return null;
    }
}
