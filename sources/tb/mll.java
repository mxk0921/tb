package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810098);
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        z6d c = h2b.a().c();
        if (c != null) {
            return c.k1();
        }
        sfh.d("PageCallback", "pageProvider == null");
        return null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac588af", new Object[]{this})).booleanValue();
        }
        Activity a2 = a();
        if (a2 == null) {
            fve.e("PageCallback", "activity is null");
            return false;
        }
        try {
            if (TBMainHost.fromActivity(a2) != null) {
                return TBMainHost.b().getCurrentFragment() instanceof HomepageFragment;
            }
            fve.e("PageCallback", "tbMain is null");
            return false;
        } catch (Exception e) {
            fve.e("PageCallback", "出现异常： " + e);
            return true;
        }
    }
}
