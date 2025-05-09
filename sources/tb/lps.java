package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Integer f23504a;

    static {
        t2o.a(729810316);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86915324", new Object[0]);
            return;
        }
        TBFragmentTabHost fragmentTabHost = TBMainHost.b().getFragmentTabHost();
        if (fragmentTabHost == null) {
            uqa.b("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost tbFragmentTabHost == null");
            return;
        }
        fragmentTabHost.setVisibility(8);
        View findViewById = TBMainHost.b().findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            uqa.b("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost tabBarContent == null");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        f23504a = Integer.valueOf(marginLayoutParams.bottomMargin);
        marginLayoutParams.bottomMargin = 0;
        findViewById.setLayoutParams(marginLayoutParams);
        uqa.b("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2bc849", new Object[0]);
            return;
        }
        TBFragmentTabHost fragmentTabHost = TBMainHost.b().getFragmentTabHost();
        if (fragmentTabHost == null || f23504a == null) {
            uqa.b("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost tbFragmentTabHost == null");
            return;
        }
        fragmentTabHost.setVisibility(0);
        View findViewById = TBMainHost.b().findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            uqa.b("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost tabBarContent == null");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.bottomMargin = f23504a.intValue();
        findViewById.setLayoutParams(marginLayoutParams);
        uqa.b("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost");
    }
}
