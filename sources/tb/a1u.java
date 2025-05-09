package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a1u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f15492a;
    public static long b = 0;
    public static CharSequence c;

    static {
        t2o.a(295699265);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (context != null && !TextUtils.isEmpty(charSequence)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (f15492a == null) {
                f15492a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else if (currentTimeMillis - b >= 2000 || !charSequence.equals(c)) {
                f15492a.setText(charSequence);
            } else {
                return;
            }
            c = charSequence;
            b = currentTimeMillis;
            f15492a.setGravity(17, 0, 0);
            f15492a.show();
        }
    }
}
