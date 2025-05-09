package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class db {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224be487", new Object[]{file, str});
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.append((CharSequence) "\n");
            bufferedWriter.append((CharSequence) str);
            bufferedWriter.close();
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    public static String b(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a86abea", new Object[]{file, new Boolean(z)});
        }
        if (!file.exists()) {
            return null;
        }
        return c(file, z);
    }

    public static String c(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8a48b2", new Object[]{file, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (z && readLine.startsWith("Report Name:")) {
                    readLine = readLine.replace("_anr.log", "_ignore_anr.log");
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
        } catch (IOError | IOException e) {
            ehh.d(e);
        }
        return sb.toString();
    }
}
