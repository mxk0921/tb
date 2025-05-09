package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.n1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static File b(x0s x0sVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("36631794", new Object[]{x0sVar, str, str2});
        }
        return a(x0sVar, new File(str), str2);
    }

    public static File a(x0s x0sVar, File file, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4fe047c7", new Object[]{x0sVar, file, str});
        }
        if ("anr".equals(str)) {
            str2 = n1s.a.a(x0sVar, str, "scan");
        } else {
            str2 = file.getName().replace("jni.log", "scan_native.log");
        }
        File file2 = new File(new rgt(x0sVar.g(), x0sVar.h()).e(), str2);
        if (file.renameTo(file2)) {
            return file2;
        }
        ehh.b("Uc2TbUtils", "move file failed", file, str2);
        return null;
    }
}
