package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a326b1", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return context.getApplicationInfo().nativeLibraryDir.contains("lib/arm64");
        }
        is64Bit = Process.is64Bit();
        return is64Bit;
    }
}
