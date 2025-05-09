package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zjj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3d20fb7", new Object[]{file});
        }
        if (!file.exists()) {
            return null;
        }
        return b(file);
    }

    public static String b(File file) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("635d4b7a", new Object[]{file});
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                    if (!z && readLine.startsWith("logcat:")) {
                        sb.append(bhh.a(300));
                        z = true;
                    }
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th) {
                    }
                }
            }
            if (!z) {
                sb.append(bhh.a(300));
            }
            bufferedReader.close();
        } catch (IOError | IOException e) {
            ehh.d(e);
        }
        return sb.toString();
    }
}
