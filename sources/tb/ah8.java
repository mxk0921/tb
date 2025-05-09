package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ah8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe6f3204", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier("build_id", "string", context.getApplicationContext().getPackageName());
        if (identifier > 0) {
            return context.getResources().getString(identifier);
        }
        Log.e("EnvironmentUtil", "can not find valid build_id");
        return null;
    }
}
