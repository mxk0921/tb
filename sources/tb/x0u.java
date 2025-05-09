package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f31059a;

    static {
        t2o.a(806356502);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (context != null && !TextUtils.isEmpty(charSequence)) {
            Toast toast = f31059a;
            if (toast == null) {
                f31059a = Toast.makeText(context.getApplicationContext(), charSequence, 1);
            } else {
                toast.setText(charSequence);
            }
            f31059a.setGravity(17, 0, 0);
            f31059a.show();
        }
    }
}
