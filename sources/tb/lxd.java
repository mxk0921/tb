package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface lxd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909524);
        }

        public static boolean a(lxd lxdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30719441", new Object[]{lxdVar})).booleanValue();
            }
            ckf.g(lxdVar, "this");
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void D(int i);
    }

    void e();

    View getContentView();

    int getHeight();

    boolean i(String str);

    boolean j(int i, TabBarItem tabBarItem);

    void k(int i, int i2);

    boolean m(int i, TabBarItem tabBarItem);

    void o();

    boolean q(int i, String str);

    void r(int i);

    boolean removeTabBarBadge(int i);

    boolean removeTabItem(int i);

    void s(TabBar tabBar);

    void t(b bVar);

    boolean u();
}
