package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String _JAVA_VERSION = "";
    public static final String _MAGIC = "BizErrorReporterSDK";
    public static final String _NATIVE_VERSION = "160509105620";
    public static final String _TARGET = "beta";
    public static final String _VERSION = "1.0.0.0";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(sd2 sd2Var, ud2 ud2Var, Context context, String str, long j, String str2) {
            super(sd2Var, ud2Var, context, str, j, str2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ha/bizerrorreporter/BizErrorBuilder$JavaExceptionReportBuilder");
        }

        @Override // tb.sd2.b
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f61bb9ae", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(n());
            sb.append(f());
            sb.append(j());
            try {
                if (!"true".equals(this.c.getSharedPreferences("BizErrorReport", 0).getString("closeStorage", "true"))) {
                    sb.append(k());
                }
            } catch (Exception unused) {
            }
            sb.append(g());
            if (this.f instanceof OutOfMemoryError) {
                sb.append(a());
            }
            sb.append(h());
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Throwable f;
        public final Thread g;
        public final String h;

        public c(sd2 sd2Var, ud2 ud2Var, Context context, String str, long j, String str2) {
            super(sd2Var);
            Throwable th = ud2Var.k;
            this.f = th;
            this.g = ud2Var.l;
            String str3 = ud2Var.j;
            this.h = str3;
            if (this.d == null) {
                this.d = new HashMap();
            }
            String str4 = ud2Var.c;
            if (str4 != null) {
                ((HashMap) this.d).put(td2.exceptionId, str4);
            }
            String str5 = ud2Var.d;
            if (str5 != null) {
                ((HashMap) this.d).put(td2.exceptionCode, str5);
            }
            String str6 = ud2Var.e;
            if (str6 != null) {
                ((HashMap) this.d).put(td2.exceptionVersion, str6);
            }
            String str7 = ud2Var.f;
            if (str7 != null) {
                ((HashMap) this.d).put(td2.exceptionArg1, str7);
            }
            String str8 = ud2Var.g;
            if (str8 != null) {
                ((HashMap) this.d).put(td2.exceptionArg2, str8);
            }
            String str9 = ud2Var.h;
            if (str9 != null) {
                ((HashMap) this.d).put(td2.exceptionArg3, str9);
            }
            if (!(th == null || str3 == null)) {
                ((HashMap) this.d).put(td2.exceptionDetail, str3);
            }
            Map<String, Object> map = ud2Var.i;
            if (map != null && map.size() > 0) {
                ((HashMap) this.d).putAll(map);
            }
            this.c = context;
            this.f27964a = str;
            this.b = j;
            this.e = str2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ha/bizerrorreporter/BizErrorBuilder$SimpleJavaExceptionReportBuilder");
        }

        public String m(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6402490", new Object[]{this, thread});
            }
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("Thread Name: '" + thread.getName() + "'\n");
                sb.append(String.format("\"%s\" prio=%d tid=%d %s\n", thread.getName(), Integer.valueOf(thread.getPriority()), Long.valueOf(thread.getId()), thread.getState()));
                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                    sb.append("\tat " + stackTraceElement.toString() + "\n");
                }
            } catch (Exception e) {
                Log.e(td2.LOGTAG, "dumpThread", e);
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Unknown variable types count: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String n() {
            /*
                Method dump skipped, instructions count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.sd2.c.n():java.lang.String");
        }
    }

    public static String b(String str, String str2, long j, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0747bd0", new Object[]{str, str2, new Long(j), str3, str4});
        }
        String d = d(str2);
        String d2 = d(str3);
        return "BizErrorReporterSDK_1.0.0.0_df_df_df_df_" + str + "_" + d + "_" + String.valueOf(j) + "_" + c(j) + "_" + asq.c(d2, "df") + "_" + str4 + ".log";
    }

    public static String c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2239470", new Object[]{new Long(j)});
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            return simpleDateFormat.format(new Date(j));
        } catch (Exception e) {
            Log.e(td2.LOGTAG, "getGMT8Time", e);
            return "";
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb69e9e1", new Object[]{str});
        }
        if (str != null) {
            return str.replace("_", "&#95;");
        }
        return "";
    }

    public rap a(Context context, ud2 ud2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rap) ipChange.ipc$dispatch("d79f53ec", new Object[]{this, context, ud2Var});
        }
        rap rapVar = new rap();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            rapVar.f27236a = up1.g(eoa.a(new a(this, ud2Var, context, b(zap.b().c, zap.b().d, currentTimeMillis, pg1.ATOM_catch, "BUSINESS"), currentTimeMillis, "BUSINESS").l().getBytes()));
            rapVar.c = String.valueOf(ud2Var.b);
            rapVar.b = ud2Var.f29301a;
            rapVar.d = td2.EVENTID_61005;
            rapVar.e = td2.SEND_FLAG;
            return rapVar;
        } catch (Exception e) {
            Log.e(td2.LOGTAG, "base64 and gzip err", e);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27964a;
        public long b;
        public Context c;
        public Map<String, Object> d;
        public String e;

        public b(sd2 sd2Var) {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a7688cdd", new Object[]{this});
            }
            return "appliction meminfo:\n" + s91.b(this.c) + e();
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("eb1eafff", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
            sb.append(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(this.b), Build.CPU_ABI, Build.HARDWARE));
            sb.append(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
            sb.append(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
            Long l = vd2.a().b;
            long maxMemory = Runtime.getRuntime().maxMemory();
            sb.append("Runtime Information: 'start: " + l + "/maxheap: " + maxMemory + "'\n");
            String str = zap.b().d;
            String str2 = zap.b().d;
            String str3 = Build.ID;
            sb.append("Application Information: 'version: " + str + "/subversion: " + str2 + "/buildseq: " + str3 + "'\n");
            sb.append("BizErrorReporterSDK Information: 'version: 1.0.0.0/nativeseq: 160509105620/javaseq: /target: beta'\n");
            StringBuilder sb2 = new StringBuilder("Report Name: ");
            sb2.append(this.f27964a);
            sb2.append("\n");
            sb.append(sb2.toString());
            sb.append("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
            sb.append("Log Type: " + this.e + "\n");
            sb.append(e());
            return sb.toString();
        }

        public abstract String c();

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dd4fc1e9", new Object[]{this});
            }
            String format = String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", 0L, 0L, 0L, 0L);
            String c = sd2.c(System.currentTimeMillis());
            return format.concat("log end: " + c + "\n");
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de2e4d8c", new Object[]{this});
            }
            return "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n";
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b50db4d9", new Object[]{this});
            }
            return i(null, 100) + i("events", 100);
        }

        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("37d6b6f9", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("meminfo:\n");
                sb.append(asq.c(s91.d(), "") + "\n");
                sb.append(e());
            } catch (Exception e) {
                Log.e(td2.LOGTAG, "write meminfo.", e);
            }
            try {
                sb.append("status:\n");
                sb.append(asq.c(s91.g(), "") + "\n");
                sb.append(e());
            } catch (Exception e2) {
                Log.e(td2.LOGTAG, "adapter write status.", e2);
            }
            try {
                sb.append("virtual machine:\nMaxMemory: " + Runtime.getRuntime().maxMemory() + " TotalMemory: " + Runtime.getRuntime().totalMemory() + " FreeMemory: " + Runtime.getRuntime().freeMemory() + "\n");
            } catch (Exception e3) {
                Log.e(td2.LOGTAG, "adapter write virtual machine info.", e3);
            }
            sb.append(e());
            return sb.toString();
        }

        public String k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e5ca37e", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("storageinfo:\nnull");
            int i = s91.f27881a;
            sb.append(e());
            return sb.toString();
        }

        public String l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3d9a9e3e", new Object[]{this});
            }
            return b() + c() + d();
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4e57ee9", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            Map<String, Object> map = this.d;
            if (map != null && !((HashMap) map).isEmpty()) {
                try {
                    sb.append("extrainfo:\n");
                    for (String str : ((HashMap) this.d).keySet()) {
                        sb.append(String.format("%s: %s\n", str, ((HashMap) this.d).get(str)));
                    }
                } catch (Exception e) {
                    Log.e(td2.LOGTAG, "write extral info", e);
                }
                sb.append(e());
            }
            return sb.toString();
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("72bc3480", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            File[] fileArr = null;
            try {
                fileArr = new File("/proc/self/fd").listFiles();
                if (fileArr != null) {
                    sb.append(String.format("opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), 1024));
                } else {
                    sb.append("[DEBUG] listFiles failed!\n");
                }
            } catch (Exception e) {
                Log.e(td2.LOGTAG, "print file descriptor.", e);
            }
            if (fileArr != null) {
                try {
                    if (fileArr.length >= 1024) {
                        sb.append("opened files:\n");
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            for (File file : fileArr) {
                                sb2.append(file.getName());
                                sb2.append(" -> ");
                                sb2.append(file.getCanonicalPath());
                                sb2.append("\n");
                            }
                        } catch (Exception e2) {
                            Log.e(td2.LOGTAG, "print file descriptor.", e2);
                        }
                        sb.append(sb2.toString());
                    }
                } catch (Exception e3) {
                    Log.e(td2.LOGTAG, "print file descriptor.", e3);
                }
            }
            sb.append(e());
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.io.Closeable, java.io.BufferedReader] */
        /* JADX WARN: Unknown variable types count: 2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String i(java.lang.String r11, int r12) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.sd2.b.i(java.lang.String, int):java.lang.String");
        }
    }
}
