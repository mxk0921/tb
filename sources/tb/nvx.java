package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nvx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f24985a = "";
    public static String b = "";
    public static String c = "";

    public static synchronized void a(String str) {
        synchronized (nvx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void b(String str, String str2, String str3) {
        synchronized (nvx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
                return;
            }
            f24985a = str;
            b = str2;
            c = str3;
        }
    }

    public static synchronized void c(Throwable th) {
        String str;
        synchronized (nvx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void d(List<String> list) {
        FileWriter fileWriter;
        synchronized (nvx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{list});
                return;
            }
            if (!vux.c(b) && !vux.c(c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c);
                for (String str : list) {
                    stringBuffer.append(", ".concat(String.valueOf(str)));
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f24985a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f24985a, b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    if (stringBuffer.length() + file2.length() <= 51200) {
                        fileWriter = new FileWriter(file2, true);
                    } else {
                        fileWriter = new FileWriter(file2);
                    }
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}
