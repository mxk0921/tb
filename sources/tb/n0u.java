package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f24433a;

    public static synchronized void a() {
        synchronized (n0u.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f2249d4", new Object[0]);
                return;
            }
            Toast toast = f24433a;
            if (toast != null) {
                toast.cancel();
                f24433a = null;
            }
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42438872", new Object[]{new Integer(i)});
        } else {
            d(Globals.getApplication().getResources().getString(i));
        }
    }

    @Deprecated
    public static synchronized void c(Context context, CharSequence charSequence) {
        synchronized (n0u.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
            } else if (!TextUtils.isEmpty(charSequence)) {
                Toast toast = f24433a;
                if (toast == null) {
                    f24433a = Toast.makeText(context, charSequence, 0);
                } else {
                    toast.setText(charSequence);
                }
                f24433a.show();
            }
        }
    }

    public static void d(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ca2255", new Object[]{charSequence});
        } else {
            c(Globals.getApplication(), charSequence);
        }
    }
}
