package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f27039a;

    static {
        t2o.a(665845952);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (!TextUtils.isEmpty(charSequence)) {
            Toast toast = f27039a;
            if (toast == null) {
                f27039a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f27039a.show();
        }
    }
}
