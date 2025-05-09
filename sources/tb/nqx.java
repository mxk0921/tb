package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.mkj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(677380288);
    }

    public static void a(ZipFile zipFile, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a79533", new Object[]{zipFile, aVar});
            return;
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (!zipEntry.getName().startsWith("../") && aVar != null) {
                ((mkj.a) aVar).a(zipEntry);
            }
        }
    }
}
