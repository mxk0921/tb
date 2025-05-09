package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface p9z {
    void bindMeasureLayoutScope(waz wazVar);

    waz getLayoutNode();

    void setLayoutNode(waz wazVar);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736917);
        }

        public static void a(p9z p9zVar, waz wazVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2f10e2", new Object[]{p9zVar, wazVar});
                return;
            }
            ckf.g(p9zVar, "this");
            ckf.g(wazVar, "layoutNode");
            p9zVar.setLayoutNode(wazVar);
        }

        public static void b(p9z p9zVar, View view, boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0d705b3", new Object[]{p9zVar, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            ckf.g(p9zVar, "this");
            ckf.g(view, "view");
            if (!p9zVar.getLayoutNode().x()) {
                for (waz wazVar : p9zVar.getLayoutNode().c()) {
                    e(p9zVar, wazVar);
                }
                return;
            }
            p9zVar.getLayoutNode().m().v();
        }

        public static boolean d(p9z p9zVar, waz wazVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b2494014", new Object[]{p9zVar, wazVar})).booleanValue();
            }
            if (wazVar.z()) {
                while (true) {
                    boolean z = false;
                    for (waz wazVar2 : wazVar.c()) {
                        if (z || d(p9zVar, wazVar2)) {
                            z = true;
                        }
                    }
                    return z;
                }
            }
            if (wazVar.c().isEmpty()) {
                wazVar.A();
            }
            p9zVar.getLayoutNode().l().onRequestForceMeasureTheSubtree(wazVar);
            long b = wazVar.q().x().a().b();
            wazVar.D(null);
            return !haz.d(wazVar.q().x().a().b(), b);
        }

        public static void e(p9z p9zVar, waz wazVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f53b7f59", new Object[]{p9zVar, wazVar});
            } else if (wazVar.z()) {
                for (waz wazVar2 : wazVar.c()) {
                    e(p9zVar, wazVar2);
                }
            } else {
                wazVar.F();
            }
        }

        public static void c(p9z p9zVar, View view, int i, int i2, g1a<? super haz, xhv> g1aVar) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("130c6091", new Object[]{p9zVar, view, new Integer(i), new Integer(i2), g1aVar});
                return;
            }
            ckf.g(p9zVar, "this");
            ckf.g(view, "view");
            ckf.g(g1aVar, "setMeasuredDimension");
            if (p9zVar.getLayoutNode().y() || zaz.e(p9zVar.getLayoutNode().k(), zaz.Companion.c())) {
                p9zVar.getLayoutNode().h().I(p9zVar.getLayoutNode().n().a(p9zVar.getLayoutNode().h(), p9zVar.getLayoutNode().b(), u2z.Companion.d(i, i2)));
                g1aVar.invoke(haz.a(p9zVar.getLayoutNode().j().a().b()));
                return;
            }
            loop0: while (true) {
                z = false;
                for (waz wazVar : p9zVar.getLayoutNode().c()) {
                    if (z || d(p9zVar, wazVar)) {
                        z = true;
                    }
                }
            }
            if (z) {
                p9zVar.getLayoutNode().A();
            }
            g1aVar.invoke(haz.a(p9zVar.getLayoutNode().j().a().b()));
        }
    }
}
