package com.taobao.android.cachecleaner.autoclear;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.data.MatchBasedData;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.s71;
import tb.t2o;
import tb.yr2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MatchBasedAutoClear {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface MatchStrategyType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737148966);
            t2o.a(737148968);
        }

        public b() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.d
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7943b05e", new Object[]{this, file, matchBasedData})).booleanValue();
            }
            String name = file.getName();
            if ((matchBasedData.fileNameLen == 0 || name.length() == matchBasedData.fileNameLen) && file.length() >= (matchBasedData.sizeThreshold << 10) && System.currentTimeMillis() - file.lastModified() >= matchBasedData.lmfThreshold * 86400000 && System.currentTimeMillis() - file.lastModified() >= matchBasedData.lmfThresholdSec * 1000 && ((TextUtils.isEmpty(matchBasedData.suffix) || name.endsWith(matchBasedData.suffix)) && (TextUtils.isEmpty(matchBasedData.prefix) || name.startsWith(matchBasedData.prefix)))) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6495a;
        public String b;
        public final List<String> c;
        public long d;

        static {
            t2o.a(737148967);
        }

        public c(int i) {
            this(i, "");
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a4943cb", new Object[]{cVar})).intValue();
            }
            return cVar.f6495a;
        }

        public static /* synthetic */ int b(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb34bba0", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.f6495a = i;
            return i;
        }

        public static /* synthetic */ long c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("196fd32b", new Object[]{cVar})).longValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ long d(c cVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a0e01be3", new Object[]{cVar, new Long(j)})).longValue();
            }
            cVar.d = j;
            return j;
        }

        public static /* synthetic */ List e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2b9730f1", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("967a8b4b", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ String g(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa0eb03", new Object[]{cVar, str});
            }
            cVar.b = str;
            return str;
        }

        public List<String> h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("32dc494f", new Object[]{this});
            }
            return this.c;
        }

        public long i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3c8b5b3", new Object[]{this})).longValue();
            }
            return this.d;
        }

        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
            }
            return this.b;
        }

        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("87b5a672", new Object[]{this})).intValue();
            }
            return this.f6495a;
        }

        public c(int i, String str) {
            this.c = new ArrayList();
            this.d = 0L;
            this.f6495a = i;
            this.b = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        boolean a(File file, MatchBasedData matchBasedData);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737148970);
            t2o.a(737148968);
        }

        public e() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.d
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7943b05e", new Object[]{this, file, matchBasedData})).booleanValue();
            }
            if (!TextUtils.equals(file.getName(), matchBasedData.fileName) || System.currentTimeMillis() - file.lastModified() < matchBasedData.lmfThreshold * 86400000 || System.currentTimeMillis() - file.lastModified() < matchBasedData.lmfThresholdSec * 1000) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(737148971);
            t2o.a(737148968);
        }

        public f() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.d
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7943b05e", new Object[]{this, file, matchBasedData})).booleanValue();
            }
            return Pattern.matches(matchBasedData.pattern, file.getName());
        }
    }

    static {
        t2o.a(737148964);
    }

    public static long b(File file, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240472d7", new Object[]{file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                if (!file.delete()) {
                    TLog.loge(yr2.MODULE, "MatchAutoClear", "deleteDir: delete failed with " + file.getName());
                }
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    j += b(file2, i + 1);
                } else {
                    long length = file2.length();
                    if (file2.delete()) {
                        j += length;
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(yr2.MODULE, "MatchAutoClear", "deleteDir: delete failed with " + file.getName());
            }
        }
        return j;
    }

    public static c c(Context context, MatchBasedData matchBasedData, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("efd79f34", new Object[]{context, matchBasedData, dVar});
        }
        File d2 = d(context, matchBasedData.pDir);
        if (d2 == null) {
            return new c(1, "error: witch empty parent directory!");
        }
        File[] listFiles = d2.listFiles();
        if (listFiles == null) {
            return new c(0);
        }
        c cVar = new c(0);
        try {
            for (File file : listFiles) {
                if (file != null && dVar.a(file, matchBasedData)) {
                    if (file.isFile()) {
                        long length = file.length() >> 20;
                        if (file.delete()) {
                            c.d(cVar, c.c(cVar) + length);
                            c.e(cVar).add(file.getName());
                        }
                    } else if (file.isDirectory()) {
                        c.d(cVar, c.c(cVar) + (b(file, 0) >> 20));
                        c.e(cVar).add(file.getName());
                    }
                }
            }
            c.b(cVar, 0);
        } catch (Exception e2) {
            c.b(cVar, 1);
            c.g(cVar, "error: execute with exception " + e2);
            TLog.loge(yr2.MODULE, "MatchAutoClear", c.f(cVar));
        }
        return cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r3.equals(tb.vs3.EXTERNAL_CACHE_NAME) == false) goto L_0x0039;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File d(android.content.Context r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "349348c3"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.io.File r7 = (java.io.File) r7
            return r7
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            if (r3 == 0) goto L_0x0020
            return r4
        L_0x0020:
            java.lang.String r3 = "/"
            java.lang.String[] r3 = r8.split(r3, r2)
            int r5 = r3.length
            if (r5 <= 0) goto L_0x002c
            r3 = r3[r1]
            goto L_0x002e
        L_0x002c:
            java.lang.String r3 = ""
        L_0x002e:
            r3.hashCode()
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -676711579: goto L_0x004f;
                case 768684631: goto L_0x0046;
                case 771702092: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r0 = -1
            goto L_0x0059
        L_0x003b:
            java.lang.String r0 = "ExternalFiles"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r0 = 2
            goto L_0x0059
        L_0x0046:
            java.lang.String r1 = "ExternalCache"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0059
            goto L_0x0039
        L_0x004f:
            java.lang.String r0 = "InnerStorage"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0039
        L_0x0058:
            r0 = 0
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0063;
                case 2: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            r7 = r4
            goto L_0x0070
        L_0x005e:
            java.io.File r7 = r7.getExternalFilesDir(r4)
            goto L_0x0070
        L_0x0063:
            java.io.File r7 = r7.getExternalCacheDir()
            goto L_0x0070
        L_0x0068:
            java.io.File r7 = r7.getCacheDir()
            java.io.File r7 = r7.getParentFile()
        L_0x0070:
            if (r7 != 0) goto L_0x0073
            return r4
        L_0x0073:
            java.io.File r0 = new java.io.File
            int r1 = r3.length()
            java.lang.String r8 = r8.substring(r1)
            r0.<init>(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.d(android.content.Context, java.lang.String):java.io.File");
    }

    public static long a(Context context, List<MatchBasedData> list) {
        c cVar;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46f059f9", new Object[]{context, list})).longValue();
        }
        if (context == null || list == null) {
            TLog.loge(yr2.MODULE, "MatchAutoClear", "clearMatchBasedFile: with empty params.");
            return -1L;
        }
        long j = 0;
        for (MatchBasedData matchBasedData : list) {
            TLog.logd(yr2.MODULE, "MatchAutoClear", "clearMatchBasedFile: start match clear task " + matchBasedData.id + ", with strategy " + matchBasedData.strategy + ".");
            long currentTimeMillis = System.currentTimeMillis();
            String str = matchBasedData.strategy;
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -318750117:
                    if (str.equals("precise")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 108392519:
                    if (str.equals("regex")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    cVar = c(context, matchBasedData, new b());
                    break;
                case 1:
                    cVar = c(context, matchBasedData, new e());
                    break;
                case 2:
                    cVar = c(context, matchBasedData, new f());
                    break;
                default:
                    cVar = new c(i, "error: cannot find match strategy!");
                    break;
            }
            s71.f(cVar);
            if (c.a(cVar) == 0) {
                j += c.c(cVar);
                TLog.loge(yr2.MODULE, "MatchAutoClear", "clearMatchBasedFile: task " + matchBasedData.id + " clear success, consume time " + ((System.currentTimeMillis() - currentTimeMillis) + "") + ", clear files " + JSON.toJSONString(c.e(cVar)) + ", clear size " + (c.c(cVar) + "") + " KB.");
            } else {
                TLog.loge(yr2.MODULE, "MatchAutoClear", "clearMatchBasedFile: task " + matchBasedData.id + " clear failed, with msg " + c.f(cVar) + ".");
            }
            i = 1;
        }
        return j;
    }
}
