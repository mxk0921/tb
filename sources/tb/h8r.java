package tb;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837564);
    }

    public static void a(FragmentActivity fragmentActivity) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(fragmentActivity)).screenOrientation = -1;
                declaredField.setAccessible(false);
            } catch (Exception e) {
                fragmentActivity.setTheme(R.style.TBBuyBaseTheme);
                rbb g = ck.g();
                g.f("fixOrientation exception#" + e.getMessage(), ck.b.b().l("TBBuyActivity").a());
            }
        }
    }
}
