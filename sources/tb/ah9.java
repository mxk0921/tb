package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ah9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed50240", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    a(listFiles[i]);
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }
}
