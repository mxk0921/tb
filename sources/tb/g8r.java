package tb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.LightBuyFragment;
import com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837534);
    }

    public static void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b924b30b", new Object[]{fragmentActivity});
            return;
        }
        try {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(supportFragmentManager.findFragmentByTag("fragment_light_buy_container").getId(), new TBBuyHalfScreenFragment(), "fragment_general_purchase_container");
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            eog.c("EXCEPTION_FRAGMENT_REPLACE", th.toString());
        }
    }

    public static void b(FragmentActivity fragmentActivity, Map<String, String> map, npc npcVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8b435e", new Object[]{fragmentActivity, map, npcVar});
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putString(str, map.get(str));
            }
        }
        LightBuyFragment lightBuyFragment = new LightBuyFragment();
        lightBuyFragment.z2(npcVar);
        lightBuyFragment.setArguments(bundle);
        try {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("fragment_general_purchase_container");
            if (findFragmentByTag == null) {
                List<Fragment> fragments = supportFragmentManager.getFragments();
                StringBuilder sb = new StringBuilder();
                sb.append("当前fragment size：");
                if (fragments != null) {
                    obj = Integer.valueOf(fragments.size());
                } else {
                    obj = "0";
                }
                sb.append(obj);
                eog.c("EXCEPTION_FRAGMENT_EMPTY", sb.toString());
                if (fragments != null && fragments.size() > 0) {
                    findFragmentByTag = fragments.get(0);
                }
            }
            beginTransaction.replace(findFragmentByTag.getId(), lightBuyFragment, "fragment_light_buy_container");
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            eog.c("EXCEPTION_FRAGMENT_REPLACE", th.toString());
        }
    }
}
