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
public class nb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(970981417);
        t2o.a(970981418);
    }

    public static nb9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb9) ipChange.ipc$dispatch("23042b6c", new Object[0]);
        }
        return new nb9();
    }

    public Map<String, String> b(File file) {
        Throwable th;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe607059", new Object[]{this, file});
        }
        HashMap hashMap = new HashMap();
        BufferedReader bufferedReader = null;
        try {
            try {
                if (file.exists()) {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            ghh.a("File2MapTransfer", readLine);
                            if (!readLine.startsWith("#")) {
                                String[] split = readLine.split("=");
                                if (split.length == 2) {
                                    hashMap.put(split[0].trim(), split[1].trim());
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            ghh.c(e);
                            mw3.a(bufferedReader);
                            return hashMap;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            mw3.a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
        mw3.a(bufferedReader);
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
            ghh.c(e);
        }
    }
}
