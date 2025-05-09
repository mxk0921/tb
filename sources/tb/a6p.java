package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15570a = a6p.class.getSimpleName();

    static {
        t2o.a(815792251);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33f534a", new Object[]{context});
            return;
        }
        Toast makeText = Toast.makeText(context, Localization.q(R.string.app_network_crash), 0);
        makeText.setGravity(48, 0, Constants.screen_height / 4);
        makeText.show();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfa744d", new Object[]{str});
        } else {
            c(str, null, 0);
        }
    }

    public static void c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7377090c", new Object[]{str, str2, new Integer(i)});
            return;
        }
        TBToast makeText = TBToast.makeText(Globals.getApplication(), str);
        if (i != 0) {
            try {
                makeText.setToastIcon(i);
                makeText.setToastIconColor(Globals.getApplication().getResources().getColor(R.color.tbsearch_toast_icon));
            } catch (Exception unused) {
                Log.e(f15570a, "set icon error");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            makeText.setText2(str2);
        }
        makeText.setGravity(GravityCompat.START, 0, -500);
        makeText.show();
    }
}
