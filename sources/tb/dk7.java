package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855816);
        t2o.a(989855818);
    }

    public static ProcessBuilder a(File file, File file2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessBuilder) ipChange.ipc$dispatch("179c9324", new Object[]{file, file2, str});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.add("--runtime-arg");
            arrayList.add("-classpath");
            arrayList.add("--runtime-arg");
            arrayList.add("&");
        }
        arrayList.add("--dex-file=" + file.getAbsolutePath());
        arrayList.add("--oat-file=" + file2.getAbsolutePath());
        arrayList.add("--instruction-set=" + str);
        arrayList.add("--compiler-filter=speed-profile");
        return new ProcessBuilder(arrayList);
    }

    public void b(Context context, File file, bk7 bk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569b9e09", new Object[]{this, context, file, bk7Var});
            return;
        }
        File b = fk7.b(file);
        String a2 = fk7.a();
        if (b == null || a2 == null) {
            bk7Var.onFailed(file, "optimizedDexFile or isa is null");
            return;
        }
        try {
            int waitFor = a(file, b, a2).start().waitFor();
            if (waitFor != 0) {
                bk7Var.onFailed(file, "dex2oat works unsuccessfully, exit code: " + waitFor);
            }
            bk7Var.onSuccess(file, null);
        } catch (Exception e) {
            bk7Var.onFailed(file, "cmd exe failed: " + e.getMessage());
        }
    }
}
