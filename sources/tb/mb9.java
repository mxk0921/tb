package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static mb9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mb9) ipChange.ipc$dispatch("d2926957", new Object[0]);
        }
        return new mb9();
    }

    public Map<String, String> b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe607059", new Object[]{this, file});
        }
        HashMap hashMap = new HashMap();
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    ehh.b("File2MapTransfer", readLine);
                    if (!readLine.startsWith("#")) {
                        String[] split = readLine.split("=");
                        if (split.length == 2) {
                            hashMap.put(split[0].trim(), split[1].trim());
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception e) {
                ehh.d(e);
            }
        }
        return hashMap;
    }

    public void c(Map<String, String> map, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0bc54", new Object[]{this, map, file});
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bufferedWriter.append((CharSequence) String.valueOf(entry.getKey())).append((CharSequence) "=").append((CharSequence) entry.getValue()).append((CharSequence) "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            ehh.d(e);
        }
    }
}
