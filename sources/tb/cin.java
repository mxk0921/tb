package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120533);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context.getApplicationContext(), str, 0).show();
        }
    }
}
