package tb;

import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fbc5", new Object[]{this, hardWareInfo})).intValue();
        }
        float f = 5.0f;
        float f2 = 7.0f;
        try {
            File file = new File("/sdcard/Android/");
            if (file.exists()) {
                long abs = Math.abs(System.currentTimeMillis() - file.lastModified()) / pqw.DEFAULT_MAX_AGE;
                f2 = abs > 100 ? 5.0f : abs > 50 ? 0.0f : Math.round(10.0f - (((float) abs) * 0.2f));
            }
        } catch (Throwable unused) {
        }
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (int) f;
    }
}
