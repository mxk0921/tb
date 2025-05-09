package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v29 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BANNER = "fav_banner";
    public static final int EVENT_AVAILABLE = 4;
    public static final String JSON_SHAREDPREFERENCES = "json_sharedpreferences";
    public static final String TLOG_TAG = "favLog";

    static {
        t2o.a(707788895);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38c6520", new Object[0]);
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.FavoriteConstantsUtil", "public static void showDetailToast()", "20180112");
        View inflate = LayoutInflater.from(Globals.getApplication()).inflate(R.layout.common_toast_layout_for_detail, (ViewGroup) null);
        Toast makeText = Toast.makeText(Globals.getApplication(), "", 0);
        makeText.setView(inflate);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42438872", new Object[]{new Integer(i)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.FavoriteConstantsUtil", "public static final void showToast(int resId)", "20180112");
        d(Globals.getApplication().getString(i));
    }

    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.FavoriteConstantsUtil", "public static final void showToast(String toastString)", "20180112");
        c(null, str);
    }

    public static final void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.FavoriteConstantsUtil", "public static final void showToast(Context context, String toastString)", "20180112");
        try {
            Toast makeText = Toast.makeText(Globals.getApplication(), "", 0);
            makeText.setText(str);
            makeText.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
