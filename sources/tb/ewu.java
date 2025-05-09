package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ewu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(335544327);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5932f038", new Object[]{view});
        } else if (view != null) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5544d3", new Object[]{view, str});
        } else if (view != null) {
            a(view);
            if (TextUtils.isEmpty(str)) {
                str = "图片识别失败";
            }
            view.setContentDescription(str);
        }
    }

    public static void c(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63d0291", new Object[]{view, str});
        } else if (view != null) {
            a(view);
            if (TextUtils.isEmpty(str)) {
                str = "图片识别中";
            }
            view.setContentDescription(str);
        }
    }

    public static void d(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76df896", new Object[]{view, str});
        } else if (view != null) {
            a(view);
            view.setContentDescription(str);
        }
    }
}
