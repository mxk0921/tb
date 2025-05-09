package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.tab.TabSwitchSource;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface dyd extends lae {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909692);
        }

        public static /* synthetic */ boolean a(dyd dydVar, int i, TabSwitchSource tabSwitchSource, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d918b043", new Object[]{dydVar, new Integer(i), tabSwitchSource, new Integer(i2), obj})).booleanValue();
            }
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    tabSwitchSource = null;
                }
                return dydVar.N0(i, tabSwitchSource);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchTo");
        }
    }

    void C(u1a<? super Integer, ? super String, xhv> u1aVar);

    boolean N0(int i, TabSwitchSource tabSwitchSource);

    int O0(ITMSPage iTMSPage);

    void Q0();

    ITMSPage b1(int i);

    int d();

    void e();

    lxd getTabBar();

    View h1();

    boolean i(String str);

    boolean j(int i, TabBarItem tabBarItem);

    boolean k(int i, int i2);

    boolean m(int i, TabBarItem tabBarItem);

    void m0(xqs xqsVar);

    void o();

    boolean q(int i, String str);

    boolean removeTabBarBadge(int i);

    boolean removeTabItem(int i);

    boolean v0(TabBar tabBar);
}
