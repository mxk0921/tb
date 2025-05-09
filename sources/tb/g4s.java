package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f19726a;

    static {
        t2o.a(806356523);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
            return;
        }
        Toast toast = f19726a;
        if (toast != null) {
            toast.cancel();
            f19726a = null;
        }
    }

    public static void b(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else {
            c(context, charSequence, 0);
        }
    }

    public static void c(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e7a88", new Object[]{context, charSequence, new Integer(i)});
        } else if (context != null && !TextUtils.isEmpty(charSequence)) {
            Toast toast = f19726a;
            if (toast == null) {
                f19726a = Toast.makeText(context.getApplicationContext(), charSequence, i);
            } else {
                toast.setText(charSequence);
            }
            f19726a.setGravity(17, 0, 0);
            f19726a.show();
        }
    }

    public static void d(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a927bf", new Object[]{context, charSequence});
        } else {
            c(context, charSequence, 1);
        }
    }
}
