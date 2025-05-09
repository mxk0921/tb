package tb;

import android.app.Activity;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509062);
        }

        public abstract void a(boolean z);
    }

    static {
        t2o.a(766509061);
    }

    public static void a(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610434df", new Object[]{activity, str, aVar});
        } else if (activity != null) {
            try {
                ShopMoreUtils.INSTANCE.e(activity, str, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void b(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7eae65", new Object[]{activity, str, aVar});
            return;
        }
        try {
            ShopMoreUtils.INSTANCE.f(activity, str, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7e76bb", new Object[]{activity, str, aVar});
        } else if (activity != null) {
            try {
                ShopMoreUtils.INSTANCE.m(activity, str, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
