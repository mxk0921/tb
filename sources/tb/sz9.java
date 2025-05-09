package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sz9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FullCacheAutoClear";

    static {
        t2o.a(737148963);
    }

    public static long a(File file, int i, List<String> list) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de40f74", new Object[]{file, new Integer(i), list})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (!p(file2, list)) {
                    if (file2.isDirectory()) {
                        length = a(file2, i + 1, list);
                    } else {
                        length = file2.length();
                    }
                    j += length;
                }
            }
        }
        return j;
    }

    public static boolean b(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e322183", new Object[]{context, new Long(j)})).booleanValue();
        }
        if (System.currentTimeMillis() - m(context) < j * 1000) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2374288", new Object[]{context, new Long(j)})).booleanValue();
        }
        if (System.currentTimeMillis() - k(context) < j * 1000) {
            return true;
        }
        return false;
    }

    public static long d(Context context, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9972f9a7", new Object[]{context, list, list2})).longValue();
        }
        long j = 0;
        for (String str : list) {
            File q = q(context, str);
            if (q != null) {
                j += g(q, 0, list2);
            }
        }
        r(context, System.currentTimeMillis());
        return j;
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("305f36ca", new Object[]{context})).longValue();
        }
        new nk1().c(1, new CacheOverviewInfo());
        s(context, System.currentTimeMillis());
        return 0L;
    }

    public static long f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4577706f", new Object[]{context})).longValue();
        }
        h();
        RuleConfig i = hg4.j().i();
        return d(context, i.getFullCacheClearDir(), i.getExceptFileSuffixes());
    }

    public static long g(File file, int i, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8533ebb9", new Object[]{file, new Integer(i), list})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                if (!file.delete()) {
                    TLog.loge(yr2.MODULE, TAG, "deleteDir: delete failed with " + file.getName());
                }
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (!p(file2, list)) {
                        j += g(file2, i + 1, list);
                    }
                } else if (!p(file2, list)) {
                    long length = file2.length();
                    if (file2.delete()) {
                        j += length;
                    } else {
                        TLog.loge(yr2.MODULE, TAG, "deleteDir: delete failed with " + file.getName());
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(yr2.MODULE, TAG, "deleteDir: delete failed with " + file.getName());
            }
        }
        return j;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b69773", new Object[0]);
        } else {
            new nk1().b(1, new CacheOverviewInfo());
        }
    }

    public static long i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae49c709", new Object[]{context})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return d91.b(context, context.getPackageName());
        }
        ot2 ot2Var = new ot2();
        return ot2Var.d(context.getCacheDir().getParentFile(), vs3.INNER_ROOT_DIR).getSize() + ot2Var.d(context.getExternalCacheDir(), vs3.EXTERNAL_CACHE_ROOT_DIR).getSize() + ot2Var.d(context.getExternalFilesDir(null), vs3.EXTERNAL_FILES_ROOT_DIR).getSize();
    }

    public static long j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5095b9c7", new Object[]{context})).longValue();
        }
        RuleConfig i = hg4.j().i();
        if (!c(context, i.getFullCacheClearSilenceTime())) {
            return n(context, i.getFullCacheClearDir(), i.getExceptFileSuffixes());
        }
        TLog.loge(yr2.MODULE, TAG, "getCleanableSize: in silence time.");
        return 0L;
    }

    public static long k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86d60b91", new Object[]{context})).longValue();
        }
        return context.getSharedPreferences("full_clear_cache_sp", 0).getLong("full_clear_cache_key", -1L);
    }

    public static long l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3539e611", new Object[]{context})).longValue();
        }
        RuleConfig i = hg4.j().i();
        if (!b(context, i.getFullCacheClearSilenceTime())) {
            return n(context, i.getBizWhiteList(), i.getExceptFileSuffixes());
        }
        TLog.loge(yr2.MODULE, TAG, "checkInDataCleanSilenceTime: in silence time.");
        return 0L;
    }

    public static long m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("613fecdb", new Object[]{context})).longValue();
        }
        return context.getSharedPreferences("full_clear_cache_sp", 0).getLong("data_clear_cache_key", -1L);
    }

    public static long n(Context context, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7d57fd5", new Object[]{context, list, list2})).longValue();
        }
        long j = 0;
        for (String str : list) {
            File q = q(context, str);
            if (q != null) {
                j += a(q, 0, list2);
            }
        }
        return j;
    }

    public static long o(List<BizTaskData> list, Map<String, Long> map) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c23f2b24", new Object[]{list, map})).longValue();
        }
        long j = 0;
        if (map == null || map.isEmpty()) {
            TLog.loge(yr2.MODULE, TAG, "getPathFilesSize error mDirMap is null!");
            return 0L;
        }
        for (BizTaskData bizTaskData : list) {
            for (String str : bizTaskData.pathMap.keySet()) {
                if (map.containsKey(str) && (l = map.get(str)) != null) {
                    j += l.longValue();
                }
            }
        }
        return j;
    }

    public static boolean p(File file, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b92236e", new Object[]{file, list})).booleanValue();
        }
        String absolutePath = file.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return false;
        }
        for (String str : list) {
            if (absolutePath.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r3.equals(tb.vs3.EXTERNAL_CACHE_NAME) == false) goto L_0x003a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File q(android.content.Context r8, java.lang.String r9) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.sz9.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "349348c3"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.io.File r8 = (java.io.File) r8
            return r8
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            r4 = 0
            if (r3 == 0) goto L_0x0020
            return r4
        L_0x0020:
            java.lang.String r3 = "/"
            java.lang.String[] r3 = r9.split(r3, r2)
            int r5 = r3.length
            java.lang.String r6 = ""
            if (r5 <= 0) goto L_0x002e
            r3 = r3[r1]
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            r3.hashCode()
            r5 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -676711579: goto L_0x0050;
                case 768684631: goto L_0x0047;
                case 771702092: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r0 = -1
            goto L_0x005a
        L_0x003c:
            java.lang.String r0 = "ExternalFiles"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            r0 = 2
            goto L_0x005a
        L_0x0047:
            java.lang.String r1 = "ExternalCache"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x005a
            goto L_0x003a
        L_0x0050:
            java.lang.String r0 = "InnerStorage"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0059
            goto L_0x003a
        L_0x0059:
            r0 = 0
        L_0x005a:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0064;
                case 2: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            r8 = r4
            goto L_0x0071
        L_0x005f:
            java.io.File r8 = r8.getExternalFilesDir(r4)
            goto L_0x0071
        L_0x0064:
            java.io.File r8 = r8.getExternalCacheDir()
            goto L_0x0071
        L_0x0069:
            java.io.File r8 = r8.getCacheDir()
            java.io.File r8 = r8.getParentFile()
        L_0x0071:
            if (r8 != 0) goto L_0x0074
            return r4
        L_0x0074:
            java.io.File r0 = new java.io.File
            java.lang.String r9 = r9.replace(r3, r6)
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sz9.q(android.content.Context, java.lang.String):java.io.File");
    }

    public static void r(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa449f4", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("full_clear_cache_sp", 0).edit();
        edit.putLong("full_clear_cache_key", j);
        edit.apply();
    }

    public static void s(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3336a", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("full_clear_cache_sp", 0).edit();
        edit.putLong("data_clear_cache_key", j);
        edit.apply();
    }
}
