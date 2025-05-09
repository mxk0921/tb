package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f25801a;

    static {
        t2o.a(664797286);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (!TextUtils.isEmpty(charSequence)) {
            Toast toast = f25801a;
            if (toast == null) {
                f25801a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f25801a.show();
        }
    }
}
