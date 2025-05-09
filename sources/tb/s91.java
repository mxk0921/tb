package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s91 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f27881a = 0;

    static {
        t2o.a(813695033);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                lgh.c("close.", e);
            }
        }
    }

    public static String b(Context context) {
        Integer num;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                num = Integer.valueOf((int) (memoryInfo.threshold >> 10));
            } else {
                num = null;
            }
            StringBuilder sb = new StringBuilder("JavaTotal:");
            sb.append(Runtime.getRuntime().totalMemory());
            sb.append(" JavaFree:");
            sb.append(Runtime.getRuntime().freeMemory());
            sb.append(" NativeHeap:");
            sb.append(Debug.getNativeHeapSize());
            sb.append(" NativeAllocated:");
            sb.append(Debug.getNativeHeapAllocatedSize());
            sb.append(" NativeFree:");
            sb.append(Debug.getNativeHeapFreeSize());
            sb.append(" threshold:");
            if (num != null) {
                str = num + " KB";
            } else {
                str = "not valid";
            }
            sb.append(str);
            return sb.toString();
        } catch (Exception e) {
            lgh.c("dumpMeminfo", e);
            return "";
        }
    }

    public static String c(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            return simpleDateFormat.format(new Date(j));
        } catch (Exception e) {
            lgh.c("getGMT8Time", e);
            return "";
        }
    }

    public static String d() {
        return h(new File("/proc/meminfo")).trim();
    }

    public static String e(Context context) {
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f() {
        try {
            return j("/proc/self/cmdline").trim();
        } catch (Exception e) {
            lgh.c("get my process name by cmd line failure .", e);
            return null;
        }
    }

    public static String g() {
        return h(new File("/proc/self/status")).trim();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(java.io.File r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: all -> 0x0033, Exception -> 0x0036
            r2.<init>(r6)     // Catch: all -> 0x0033, Exception -> 0x0036
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: all -> 0x002c, Exception -> 0x002e
            r6.<init>(r2)     // Catch: all -> 0x002c, Exception -> 0x002e
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r1]     // Catch: all -> 0x0020, Exception -> 0x0023
        L_0x0014:
            int r3 = r6.read(r1)     // Catch: all -> 0x0020, Exception -> 0x0023
            r4 = -1
            if (r4 == r3) goto L_0x0025
            r4 = 0
            r0.append(r1, r4, r3)     // Catch: all -> 0x0020, Exception -> 0x0023
            goto L_0x0014
        L_0x0020:
            r0 = move-exception
            r1 = r6
            goto L_0x0046
        L_0x0023:
            r1 = move-exception
            goto L_0x003a
        L_0x0025:
            a(r6)
            a(r2)
            goto L_0x0041
        L_0x002c:
            r0 = move-exception
            goto L_0x0046
        L_0x002e:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x003a
        L_0x0033:
            r0 = move-exception
            r2 = r1
            goto L_0x0046
        L_0x0036:
            r6 = move-exception
            r2 = r1
            r1 = r6
            r6 = r2
        L_0x003a:
            java.lang.String r3 = "readFully."
            tb.lgh.c(r3, r1)     // Catch: all -> 0x0020
            goto L_0x0025
        L_0x0041:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x0046:
            a(r1)
            a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s91.h(java.io.File):java.lang.String");
    }

    public static String i(File file) {
        ArrayList arrayList = (ArrayList) k(file, 1);
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return "";
    }

    public static String j(String str) {
        return i(new File(str));
    }

    public static List<String> k(File file, int i) {
        Throwable th;
        IOException e;
        String readLine;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                int i2 = 0;
                while (true) {
                    try {
                        readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2++;
                        arrayList.add(readLine);
                        if (i > 0 && i2 >= i) {
                            break;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        lgh.c("readLine", e);
                        a(bufferedReader);
                        bufferedReader = bufferedReader;
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        a(bufferedReader);
                        throw th;
                    }
                }
                a(bufferedReader2);
                bufferedReader = readLine;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
        }
        return arrayList;
    }
}
