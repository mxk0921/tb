package tb;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.kernel.RVEvents;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class igj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MYTAOBAO_TAB_INDEX = 4;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else if (i != 4 || com.taobao.tao.navigation.a.o() == null || com.taobao.tao.navigation.a.o().getCurrentFragment() == null) {
                MtbGlobalEnv.i = "tab" + i;
            } else {
                Fragment currentFragment = com.taobao.tao.navigation.a.o().getCurrentFragment();
                if (!(currentFragment instanceof TBBaseFragment)) {
                    b q = com.taobao.tao.navigation.a.q(4);
                    q.I("com.taobao.mytaobao.homepage.MyTaobaoFragment");
                    q.H(null);
                    com.taobao.tao.navigation.a.o0(4, q);
                    TBMainHost.b();
                    ror a2 = TBMainHost.a(currentFragment.getActivity());
                    if (a2 != null) {
                        a2.restoreTabHost();
                    }
                } else if (currentFragment instanceof MyTaobaoFragment) {
                    uv6.d(RVEvents.TAB_CLICK);
                    ((MyTaobaoFragment) currentFragment).u2((Activity) com.taobao.tao.navigation.a.o().getContext());
                    uv6.f();
                }
            }
        }
    }

    static {
        t2o.a(745537742);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bd849d", new Object[0]);
        } else {
            com.taobao.tao.navigation.a.h(new a());
        }
    }

    public static void b(ypj ypjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7d9236", new Object[]{ypjVar});
        } else if (ypjVar != null) {
            com.taobao.tao.navigation.a.T(4, ypjVar);
        }
    }
}
