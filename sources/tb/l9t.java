package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l9t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23199a = false;

    static {
        t2o.a(491782146);
    }

    public static void a(dve.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d342642", new Object[]{bVar});
        } else if (!f23199a) {
            f23199a = true;
            if (bVar.w() == null) {
                bVar.K(new igt());
            }
            if (bVar.y() == null) {
                bVar.N(new kgt());
            }
            if (bVar.A() == null) {
                bVar.P(new lgt());
            }
            if (bVar.z() == null) {
                bVar.O(new bbr());
            }
            if (bVar.t() == null) {
                bVar.G(new fgt());
            }
            if (bVar.x() == null) {
                bVar.L(new jgt());
            }
            if (bVar.r() == null) {
                bVar.C(new dgt());
            }
            if (bVar.s() == null) {
                bVar.F(new egt());
            }
            if (bVar.u() == null) {
                bVar.H(new ggt());
            }
            if (bVar.v() == null) {
                bVar.J(new hgt());
            }
            xue.e(bVar.q());
        }
    }
}
