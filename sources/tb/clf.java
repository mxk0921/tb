package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class clf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(374341767);
    }

    public static void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e767cd", new Object[]{file});
        } else if (file == null) {
            throw new IllegalStateException("Failed to get external storage files directory");
        } else if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalStateException(file.getAbsolutePath() + " already exists and is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Couldn't create directory " + file.getPath());
        }
    }
}
