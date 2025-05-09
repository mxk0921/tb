package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Closeable closeable) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            closeable.close();
        }
    }

    public static void b(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
            return;
        }
        try {
            a(closeable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
