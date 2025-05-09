package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f28395a;

    static {
        t2o.a(779093271);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
            return;
        }
        Toast toast = f28395a;
        if (toast != null) {
            toast.cancel();
            f28395a = null;
        }
    }

    public static void b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334cf5ac", new Object[]{context, new Integer(i)});
        } else if (context != null && i != 0) {
            c(context, context.getResources().getString(i));
        }
    }

    public static void c(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (context != null && !TextUtils.isEmpty(charSequence)) {
            Toast toast = f28395a;
            if (toast == null) {
                f28395a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f28395a.setGravity(17, 0, 0);
            f28395a.show();
        }
    }
}
