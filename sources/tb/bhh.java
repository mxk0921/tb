package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f16392a;

    static {
        HashSet hashSet = new HashSet();
        f16392a = hashSet;
        hashSet.add("main");
        hashSet.add("radio");
        hashSet.add("system");
        hashSet.add("events");
        hashSet.add("crash");
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e74af128", new Object[]{new Integer(i)});
        }
        return c(null, i);
    }

    public static List<String> d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e521532", new Object[]{str, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogCategory.CATEGORY_LOGCAT);
        arrayList.add("-d");
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        arrayList.add(String.valueOf(i));
        return arrayList;
    }

    public static Process e(String str, int i) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Process) ipChange.ipc$dispatch("918412a7", new Object[]{str, new Integer(i)});
        }
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            if (TextUtils.isEmpty(str)) {
                list = f(i);
            } else {
                list = d(str, i);
            }
            return processBuilder.command(list).redirectErrorStream(true).start();
        } catch (Throwable th) {
            ehh.d(th);
            return null;
        }
    }

    public static List<String> f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7e34a4b", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogCategory.CATEGORY_LOGCAT);
        arrayList.add("-t");
        arrayList.add(String.valueOf(i));
        return arrayList;
    }

    public static String a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6587be5", new Object[]{new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT <= 23) {
            sb.append("logcat  : \n");
            str = null;
        } else {
            sb.append("logcat -b  crash: \n");
            str = "crash";
        }
        if (i < 0) {
            sb.append("[DEBUG] custom java logcat lines count is 0!\n");
            return sb.toString();
        }
        Process e = e(str, i);
        if (e == null) {
            sb.append("[DEBUG] exec logcat failed!\n");
            return sb.toString();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e.getInputStream()));
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                i2++;
                if (i2 < i) {
                    sb.append(readLine);
                    sb.append("\n");
                }
            }
            bufferedReader.close();
        } catch (Exception e2) {
            ehh.b("print log.", e2);
        }
        return sb.toString();
    }

    public static String c(String str, int i) {
        int i2;
        Exception e;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5edf27b2", new Object[]{str, new Integer(i)});
        }
        if (!TextUtils.isEmpty(str) && !((HashSet) f16392a).contains(str)) {
            str = "main";
        }
        StringBuilder sb = new StringBuilder("logcat ");
        sb.append(str);
        sb.append(": \n");
        if (i < 0) {
            sb.append("[DEBUG] custom java logcat lines count is 0!\n");
            return sb.toString();
        }
        Process e2 = e(str, i);
        if (e2 == null) {
            sb.append("[DEBUG] exec logcat failed!\n");
            return sb.toString();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e2.getInputStream()));
            i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        i2++;
                        if (i2 < i) {
                            try {
                                sb.append(readLine);
                                sb.append("\n");
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    try {
                                        bufferedReader.close();
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception e3) {
                            e = e3;
                            ehh.b("print log.", e);
                            sb.append(String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i2), Integer.valueOf(Math.min(i, i2))));
                            return sb.toString();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            bufferedReader.close();
        } catch (Exception e4) {
            e = e4;
            i2 = 0;
        }
        sb.append(String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i2), Integer.valueOf(Math.min(i, i2))));
        return sb.toString();
    }
}
