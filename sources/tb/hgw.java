package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297662);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a53b97a", new Object[]{view});
        } else if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(false);
        }
    }

    public static void b(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService != null) {
            try {
                Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", new Class[0]);
                method.setAccessible(true);
                method.invoke(systemService, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService != null) {
            try {
                Method method = Class.forName("android.app.StatusBarManager").getMethod("expandSettingsPanel", new Class[0]);
                method.setAccessible(true);
                method.invoke(systemService, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static <T> T d(View view, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9dd60535", new Object[]{view, cls});
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2.getClass() == cls) {
                return cls.cast(view2);
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }
}
