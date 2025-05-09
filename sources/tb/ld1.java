package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ld1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(692060161);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            Log.e("AssistantApplication", "init");
        }
    }
}
