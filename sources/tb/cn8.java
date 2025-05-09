package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, q35<String, Void> q35Var, fn8 fn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef11418b", new Object[]{context, q35Var, fn8Var});
        } else if (mhg.b()) {
            l35.f(context, q35Var, fn8Var);
        }
    }
}
