package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(734003253);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b911068", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(str, z);
    }
}
