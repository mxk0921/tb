package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.sku.utils.ToastView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n3q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CUSTOM = 4;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_FAILED = 3;
    public static final int TYPE_SUCCESS = 2;

    static {
        t2o.a(442499276);
    }

    public static void a(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdbc4c0", new Object[]{context, new Integer(i), str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (!SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.MANUFACTURER) || Build.VERSION.SDK_INT >= 29 || NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                ToastView toastView = new ToastView(context);
                Toast toast = new Toast(context);
                toast.setGravity(16, 0, 0);
                toast.setDuration(1);
                toast.setView(toastView);
                if (i == 1) {
                    toastView.showDefault(str);
                } else if (i == 2) {
                    toastView.showSuccess(str);
                } else if (i == 3) {
                    toastView.showFailed(str);
                } else if (i == 4) {
                    toastView.showWithIcon(str, str2);
                }
                toast.show();
                return;
            }
            z4v.a(context, str);
        }
    }
}
