package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f29719a;

    static {
        t2o.a(806356026);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
            return;
        }
        Toast toast = f29719a;
        if (toast != null) {
            toast.cancel();
            f29719a = null;
        }
    }

    public static void b(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
            return;
        }
        Toast toast = f29719a;
        if (toast != null) {
            toast.cancel();
            f29719a = null;
        }
        if (context != null && !TextUtils.isEmpty(charSequence)) {
            Toast makeText = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            f29719a = makeText;
            makeText.show();
        }
    }
}
