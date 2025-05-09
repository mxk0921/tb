package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public long[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("b22d5df5", new Object[]{this});
        }
        long[] b = b();
        long j = b[0];
        return new long[]{j, j - ((b[1] + b[2]) + b[3])};
    }

    public final long[] b() {
        long[] jArr = new long[4];
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            long[] jArr2 = {30, -30};
            Object[] objArr = {"/proc/meminfo", new String[]{"MemTotal:", "MemFree:", "Buffers:", "Cached:"}, jArr2};
            if (method != null) {
                method.invoke(null, objArr);
                for (int i = 0; i < 4; i++) {
                    jArr[i] = jArr2[i];
                }
            }
            return jArr;
        } catch (Exception e) {
            e.printStackTrace();
            return jArr;
        }
    }
}
