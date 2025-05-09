package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile CacheOverviewInfo f22881a;

    static {
        t2o.a(737149048);
    }

    public static CacheOverviewInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("d902e78d", new Object[]{context});
        }
        if (f22881a != null) {
            return f22881a;
        }
        f22881a = b(context);
        return f22881a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.StringBuilder d(java.io.File r9, java.lang.String r10) {
        /*
            java.lang.String r0 = ", with exception "
            java.lang.String r1 = "read: read file failed, file name: "
            java.lang.String r2 = "CacheInfoHelper"
            java.lang.String r3 = "CacheCleaner"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.ks2.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0021
            java.lang.String r0 = "1b8a00b9"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r9 = 1
            r1[r9] = r10
            java.lang.Object r9 = r4.ipc$dispatch(r0, r1)
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            return r9
        L_0x0021:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            java.io.File r6 = new java.io.File     // Catch: all -> 0x0067, Exception -> 0x0069
            r6.<init>(r9, r10)     // Catch: all -> 0x0067, Exception -> 0x0069
            boolean r9 = r6.exists()     // Catch: all -> 0x0067, Exception -> 0x0069
            if (r9 != 0) goto L_0x0033
            return r4
        L_0x0033:
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: all -> 0x0067, Exception -> 0x0069
            java.io.FileReader r7 = new java.io.FileReader     // Catch: all -> 0x0067, Exception -> 0x0069
            r7.<init>(r6)     // Catch: all -> 0x0067, Exception -> 0x0069
            r9.<init>(r7)     // Catch: all -> 0x0067, Exception -> 0x0069
        L_0x003d:
            java.lang.String r5 = r9.readLine()     // Catch: all -> 0x0047, Exception -> 0x004a
            if (r5 == 0) goto L_0x004c
            r4.append(r5)     // Catch: all -> 0x0047, Exception -> 0x004a
            goto L_0x003d
        L_0x0047:
            r4 = move-exception
            r5 = r9
            goto L_0x0093
        L_0x004a:
            r5 = move-exception
            goto L_0x006d
        L_0x004c:
            r9.close()     // Catch: IOException -> 0x0050
            goto L_0x0092
        L_0x0050:
            r9 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
        L_0x0056:
            r5.append(r10)
            r5.append(r0)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            com.taobao.tao.log.TLog.loge(r3, r2, r9)
            goto L_0x0092
        L_0x0067:
            r4 = move-exception
            goto L_0x0093
        L_0x0069:
            r9 = move-exception
            r8 = r5
            r5 = r9
            r9 = r8
        L_0x006d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0047
            r6.<init>()     // Catch: all -> 0x0047
            r6.append(r1)     // Catch: all -> 0x0047
            r6.append(r10)     // Catch: all -> 0x0047
            r6.append(r0)     // Catch: all -> 0x0047
            r6.append(r5)     // Catch: all -> 0x0047
            java.lang.String r5 = r6.toString()     // Catch: all -> 0x0047
            com.taobao.tao.log.TLog.loge(r3, r2, r5)     // Catch: all -> 0x0047
            if (r9 == 0) goto L_0x0092
            r9.close()     // Catch: IOException -> 0x008b
            goto L_0x0092
        L_0x008b:
            r9 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            goto L_0x0056
        L_0x0092:
            return r4
        L_0x0093:
            if (r5 == 0) goto L_0x00af
            r5.close()     // Catch: IOException -> 0x0099
            goto L_0x00af
        L_0x0099:
            r9 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r10)
            r5.append(r0)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            com.taobao.tao.log.TLog.loge(r3, r2, r9)
        L_0x00af:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ks2.d(java.io.File, java.lang.String):java.lang.StringBuilder");
    }

    public static void g(File file, String str, String str2) {
        Throwable th;
        Exception e;
        StringBuilder sb;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c59e71", new Object[]{file, str, str2});
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                bufferedWriter = new BufferedWriter(new FileWriter(file2));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder("write: write file failed, file name: ");
                sb.append(str);
                sb.append(", with exception ");
                sb.append(e);
                TLog.loge(yr2.MODULE, "CacheInfoHelper", sb.toString());
            }
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            TLog.loge(yr2.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e);
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e5) {
                    e = e5;
                    sb = new StringBuilder("write: write file failed, file name: ");
                    sb.append(str);
                    sb.append(", with exception ");
                    sb.append(e);
                    TLog.loge(yr2.MODULE, "CacheInfoHelper", sb.toString());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e6) {
                    TLog.loge(yr2.MODULE, "CacheInfoHelper", "write: write file failed, file name: " + str + ", with exception " + e6);
                }
            }
            throw th;
        }
    }

    public static CacheOverviewInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("b4e0cdf6", new Object[]{context});
        }
        try {
            String sb = d(context.getDir("cache_info", 0), "basic_info").toString();
            if (TextUtils.isEmpty(sb)) {
                return null;
            }
            return (CacheOverviewInfo) JSON.parseObject(sb, CacheOverviewInfo.class);
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "CacheInfoHelper", "quireBasicInfo: quire basic cache info failed, with exception " + th);
            return null;
        }
    }

    public static yve c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yve) ipChange.ipc$dispatch("f81deea", new Object[]{context, str});
        }
        File dir = context.getDir("cache_info", 0);
        try {
            return tt2.a(null, d(dir, str + "_cache_tree_info_v1").toString());
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "CacheInfoHelper", "quireBasicInfo: quire " + str + " cache info failed, with exception " + th);
            return null;
        }
    }

    public static void e(Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7933c430", new Object[]{context, cacheOverviewInfo});
            return;
        }
        try {
            try {
                g(context.getDir("cache_info", 0), "basic_info", JSON.toJSON(cacheOverviewInfo).toString());
            } finally {
                f22881a = cacheOverviewInfo;
            }
        } catch (Throwable unused) {
            TLog.loge(yr2.MODULE, "CacheInfoHelper", "restoreBasicInfo: restore basic cache info failed!");
        }
    }

    public static void f(Context context, yve yveVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54797714", new Object[]{context, yveVar, str});
            return;
        }
        File dir = context.getDir("cache_info", 0);
        try {
            String c = tt2.c(yveVar);
            g(dir, str + "_cache_tree_info_v1", c);
        } catch (Throwable unused) {
            TLog.loge(yr2.MODULE, "CacheInfoHelper", "restoreCacheTreeInfo: restore " + str + " cache info failed.");
        }
    }
}
