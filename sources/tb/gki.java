package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f20056a = Process.myPid();
    public static final String[] b = {"FDSize", "VmPeak", "VmSize", "VmHWM", "VmRSS", "VmData", "VmStk", "VmExe", "VmLib", "VmSwap", "Threads"};

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4b0be4", new Object[]{str})).booleanValue();
        }
        for (String str2 : b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cbdf41f", new Object[0]);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + f20056a + "/status")));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                } else if (a(readLine)) {
                    String replace = readLine.replace("\t", "").replace(" ", "");
                    sb.append(" ,");
                    sb.append(replace);
                    if (replace.startsWith("Threads")) {
                        String[] split = replace.split(":");
                        if (split.length > 1 && Integer.parseInt(split[1]) > 1000) {
                            sb.append(hqt.d());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ehh.d(th);
            return null;
        }
    }
}
