package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l9m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon.PmUtils";

    static {
        t2o.a(284164126);
    }

    public static ActivityInfo a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityInfo) ipChange.ipc$dispatch("89d01eb0", new Object[]{context, str});
        }
        return Intent.makeMainActivity(new ComponentName(context, str)).resolveActivityInfo(context.getPackageManager(), 640);
    }

    public static String b(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc763fd2", new Object[]{context, appIconComponentName});
        }
        try {
            ActivityInfo a2 = a(context, appIconComponentName.clzPath);
            int i = appIconComponentName.iconResId;
            if (i <= 0) {
                i = a2.getIconResource();
            }
            Drawable drawable = context.getResources().getDrawable(i);
            if (drawable == null) {
                drawable = a2.loadIcon(context.getPackageManager());
            }
            Bitmap b = dq1.b(drawable);
            if (b != null) {
                return dq1.a(b);
            }
            return null;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "getAppIconBase64Str error", th);
            return null;
        }
    }

    public static void c(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a901a0fa", new Object[]{context, appIconComponentName});
        } else {
            appIconComponentName.state = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, appIconComponentName.clzPath));
        }
    }
}
