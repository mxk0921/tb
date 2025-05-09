package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(tpm<String> tpmVar) {
        BufferedReader bufferedReader;
        String readLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7776afa5", new Object[]{tpmVar})).booleanValue();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/maps")));
        } catch (Throwable th) {
            rbn.g("filterProcMaps.error", th);
        }
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return false;
            }
        } while (!tpmVar.test(readLine));
        bufferedReader.close();
        return true;
    }
}
