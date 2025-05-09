package com.taobao.android.diagnose.snapshot;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi;
import com.alipay.mobile.common.logging.util.avail.ExceptionData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.DiagnoseType;
import com.taobao.android.diagnose.snapshot.ExceptionManager;
import com.taobao.android.diagnose.snapshot.a;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.logger.EventLogger;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.al7;
import tb.b8q;
import tb.cl7;
import tb.em8;
import tb.fm8;
import tb.idh;
import tb.mk7;
import tb.n04;
import tb.p01;
import tb.pg1;
import tb.qk7;
import tb.t2o;
import tb.tx8;
import tb.uk7;
import tb.xk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExceptionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7251a;
    public final qk7 b;
    public b8q c;
    public com.taobao.android.diagnose.snapshot.a d;
    public com.taobao.android.diagnose.scene.a e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.diagnose.snapshot.ExceptionManager$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/snapshot/ExceptionManager$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                al7.b().a(new Runnable() { // from class: tb.jm8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExceptionManager.AnonymousClass1.this.b(intent);
                    }
                });
            }
        }

        public final /* synthetic */ void b(Intent intent) {
            Exception e;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b8183c4", new Object[]{this, intent});
                return;
            }
            try {
                str = b8q.f();
                try {
                    idh.a("ExceptionManager", "User Feedback. snapshotID: " + str);
                    DiagnoseType diagnoseType = DiagnoseType.Feedback;
                    xk7.a(str, diagnoseType.getIndex(), 1);
                    String stringExtra = intent.getStringExtra("feedbackID");
                    String stringExtra2 = intent.getStringExtra("title");
                    HashMap hashMap = new HashMap();
                    hashMap.put("feedbackID", stringExtra);
                    hashMap.put("title", stringExtra2);
                    ExceptionManager.c(ExceptionManager.this).l(str, diagnoseType, ExceptionManager.b(ExceptionManager.this), hashMap);
                    EventLogger.builder(5).setData("type", String.valueOf(diagnoseType.getIndex())).setData("snapshotID", str).setData("feedbackID", stringExtra).setData("title", stringExtra2).log();
                    if (com.taobao.android.diagnose.scene.a.i("scene_feedback") && ExceptionManager.d(ExceptionManager.this) != null) {
                        tx8 tx8Var = new tx8();
                        tx8Var.e("fact_feedback_id", stringExtra);
                        tx8Var.e("fact_feedback_title", stringExtra2);
                        ExceptionManager.d(ExceptionManager.this).n("scene_feedback", tx8Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    String str2 = e.getClass().getName() + "-" + e.getMessage();
                    xk7.b(str, DiagnoseType.Feedback.getIndex(), str2);
                    idh.b("ExceptionManager", "Handle user feedback exception: ".concat(str2));
                }
            } catch (Exception e3) {
                e = e3;
                str = "";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements a.AbstractC0396a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            String str;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e495810d", new Object[]{this});
                return;
            }
            try {
                str = b8q.f();
            } catch (Exception e2) {
                e = e2;
                str = "";
            }
            try {
                idh.a("ExceptionManager", "ANR happend!! snapshotID: " + str);
                DiagnoseType diagnoseType = DiagnoseType.ANR;
                xk7.a(str, diagnoseType.getIndex(), 1);
                ExceptionManager.c(ExceptionManager.this).l(str, diagnoseType, ExceptionManager.b(ExceptionManager.this), null);
                EventLogger.builder(5).setData("type", String.valueOf(diagnoseType.getIndex())).setData("snapshotID", str).log();
                ExceptionManager.e(ExceptionManager.this, "scene_anr", str, null);
            } catch (Exception e3) {
                e = e3;
                String str2 = e.getClass().getName() + "-" + e.getMessage();
                xk7.b(str, DiagnoseType.ANR.getIndex(), str2);
                TLog.loge("Diagnose", "ExceptionManager", "Handle anr exception: ".concat(str2));
            }
        }

        public void b() {
            String str;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc91f357", new Object[]{this});
                return;
            }
            try {
                str = b8q.f();
            } catch (Exception e2) {
                e = e2;
                str = "";
            }
            try {
                idh.a("ExceptionManager", "Native Crashed!! snapshotID: " + str);
                ExceptionManager.e(ExceptionManager.this, "scene_native_crash", str, null);
                DiagnoseType diagnoseType = DiagnoseType.NativeCrash;
                xk7.a(str, diagnoseType.getIndex(), 1);
                ExceptionManager.c(ExceptionManager.this).l(str, diagnoseType, ExceptionManager.b(ExceptionManager.this), null);
                EventLogger.builder(5).setData("type", String.valueOf(diagnoseType.getIndex())).setData("snapshotID", str).log();
            } catch (Exception e3) {
                e = e3;
                String str2 = e.getClass().getName() + "-" + e.getMessage();
                xk7.b(str, DiagnoseType.NativeCrash.getIndex(), str2);
                TLog.loge("Diagnose", "ExceptionManager", "Handle native exception: ".concat(str2));
            }
        }
    }

    static {
        t2o.a(615514217);
    }

    public ExceptionManager(Context context, qk7 qk7Var) {
        this.f7251a = context;
        this.b = qk7Var;
    }

    public static /* synthetic */ qk7 b(ExceptionManager exceptionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qk7) ipChange.ipc$dispatch("6686d036", new Object[]{exceptionManager});
        }
        return exceptionManager.b;
    }

    public static /* synthetic */ b8q c(ExceptionManager exceptionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8q) ipChange.ipc$dispatch("985187ab", new Object[]{exceptionManager});
        }
        return exceptionManager.c;
    }

    public static /* synthetic */ com.taobao.android.diagnose.scene.a d(ExceptionManager exceptionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.diagnose.scene.a) ipChange.ipc$dispatch("b0d4b606", new Object[]{exceptionManager});
        }
        return exceptionManager.e;
    }

    public static /* synthetic */ void e(ExceptionManager exceptionManager, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f22a31a", new Object[]{exceptionManager, str, str2, str3});
        } else {
            exceptionManager.p(str, str2, str3);
        }
    }

    public static /* synthetic */ String f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7f28986", new Object[]{th});
        }
        return g(th);
    }

    public static String g(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65865e41", new Object[]{th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int min = Math.min(stackTrace.length, 5);
        for (int i = 0; i < min; i++) {
            sb.append(stackTrace[i]);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public static String o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("381c6ce1", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return TakePhotoApi.LOW_MEMORY;
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return ExceptionData.TYPE_ANR;
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case 11:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case 13:
                return "OTHER KILLS BY SYSTEM";
            default:
                return "UNKNOWN";
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        idh.a("ExceptionManager", "init");
        try {
            if (!mk7.o()) {
                idh.b("ExceptionManager", "ExceptionManager is disable!");
                return;
            }
            this.c = new b8q(this.f7251a);
            j();
            al7.b().d(new Runnable() { // from class: tb.im8
                @Override // java.lang.Runnable
                public final void run() {
                    ExceptionManager.this.k();
                }
            }, 15L, TimeUnit.SECONDS);
        } catch (Exception e) {
            idh.c("ExceptionManager", "ExceptionManager init exception: ", e);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[]{this});
            return;
        }
        m();
        n();
        l();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a690006", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.f7251a).registerReceiver(new AnonymousClass1(), new IntentFilter("com.taobao.android.diagnose.action.feedback"));
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08ed72", new Object[]{this});
        } else {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new b());
        }
    }

    public final void p(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e41975", new Object[]{this, str, str2, str3});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\u001f");
        sb.append(str2);
        sb.append("\u001f");
        sb.append(System.currentTimeMillis());
        sb.append("\u001f");
        if (str3 != null) {
            sb.append(str3);
        }
        idh.a("ExceptionManager", "saveCrashSceneInfo for " + str);
        mk7.r(this.f7251a, sb.toString());
    }

    public void q(com.taobao.android.diagnose.scene.a aVar, n04 n04Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4681a6", new Object[]{this, aVar, n04Var});
            return;
        }
        this.e = aVar;
        b8q b8qVar = this.c;
        if (b8qVar != null) {
            b8qVar.c = n04Var;
        }
    }

    public static String h(Context context, String str) {
        ActivityManager activityManager;
        List<Object> historicalProcessExitReasons;
        String applicationExitInfo;
        String processName;
        long timestamp;
        String format;
        int pid;
        int reason;
        int status;
        String description;
        long pss;
        long rss;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11f7c56d", new Object[]{context, str});
        }
        if (Build.VERSION.SDK_INT < 30) {
            return "Unsupported";
        }
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Exception e) {
            idh.c("ExceptionManager", TLogTracker.SCENE_EXCEPTION, e);
        }
        if (activityManager == null) {
            return "Unknown";
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
        for (Object obj : historicalProcessExitReasons) {
            ApplicationExitInfo a2 = p01.a(obj);
            applicationExitInfo = a2.toString();
            idh.a("ExceptionManager", applicationExitInfo);
            processName = a2.getProcessName();
            if (processName.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("time=");
                fm8.a();
                SimpleDateFormat a3 = em8.a("yyyy-MM-dd HH:mm:ss");
                timestamp = a2.getTimestamp();
                format = a3.format(new Date(timestamp));
                sb.append(format);
                sb.append(";pid=");
                pid = a2.getPid();
                sb.append(pid);
                sb.append(";reason=");
                reason = a2.getReason();
                sb.append(o(reason));
                sb.append(";status=");
                status = a2.getStatus();
                sb.append(status);
                sb.append(";desc=");
                description = a2.getDescription();
                sb.append(description);
                sb.append(";pss=");
                pss = a2.getPss();
                sb.append(cl7.j(pss << 10));
                sb.append(";rss=");
                rss = a2.getRss();
                sb.append(cl7.j(rss << 10));
                return sb.toString();
            }
        }
        return "Unknown";
    }

    public final /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509dea60", new Object[]{this});
            return;
        }
        try {
            String[] r = r();
            if (this.c.j(r)) {
                idh.a("ExceptionManager", "Need re-generate the snapshot file");
                this.c.l(r[1], DiagnoseType.NativeCrash, this.b, null);
            }
            this.c.p();
        } catch (Exception e) {
            idh.c("ExceptionManager", "init in runnable", e);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3761119d", new Object[]{this});
            return;
        }
        com.taobao.android.diagnose.snapshot.a aVar = new com.taobao.android.diagnose.snapshot.a(new File(new File(this.f7251a.getDir("tombstone", 0), uk7.i().g().c().process), "crashsdk/logs").getAbsolutePath(), new a());
        this.d = aVar;
        aVar.startWatching();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            String str;
            String str2;
            Exception e;
            DiagnoseType diagnoseType;
            String name;
            String name2;
            String message;
            String f;
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("diagnoseSDK", "taobao_diagnose_1.0.0.2");
            hashMap2.put("os", ExceptionManager.b(ExceptionManager.this).c().os);
            hashMap2.put("osDisplay", Build.DISPLAY);
            try {
                str2 = b8q.f();
                try {
                    idh.a("ExceptionManager", "Java Crashed!! snapshotID：" + str2);
                    diagnoseType = DiagnoseType.JavaCrash;
                    xk7.a(str2, diagnoseType.getIndex(), 1);
                    name = thread.getName();
                    name2 = th.getClass().getName();
                    message = th.getMessage();
                    f = ExceptionManager.f(th);
                    hashMap = new HashMap();
                    hashMap.put("thread", name);
                    hashMap.put("cause", name2);
                    hashMap.put("msg", message);
                    hashMap.put(pg1.ATOM_stack, f);
                    str = "ExceptionManager";
                } catch (Exception e2) {
                    e = e2;
                    str = "ExceptionManager";
                }
                try {
                    ExceptionManager.c(ExceptionManager.this).l(str2, diagnoseType, ExceptionManager.b(ExceptionManager.this), hashMap);
                    ExceptionManager.e(ExceptionManager.this, "scene_java_crash", str2, name2 + "\u001f" + message + "\u001f" + f);
                    hashMap2.put("snapshotID", str2);
                    EventLogger.builder(5).setData("type", String.valueOf(diagnoseType.getIndex())).setData("snapshotID", str2).setData("thread", name).setData("msg", message).setData("cause", name2).setData(pg1.ATOM_stack, f).log();
                } catch (Exception e3) {
                    e = e3;
                    String str3 = e.getClass().getName() + "-" + e.getMessage();
                    xk7.b(str2, DiagnoseType.JavaCrash.getIndex(), str3);
                    TLog.loge("Diagnose", str, "Handle java crash exception: ".concat(str3));
                    return hashMap2;
                }
            } catch (Exception e4) {
                e = e4;
                str = "ExceptionManager";
                str2 = "";
            }
            return hashMap2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:7:0x001a, B:10:0x0023, B:12:0x002d, B:19:0x0072, B:22:0x007d, B:25:0x0088, B:35:0x009f, B:37:0x00bc, B:39:0x00c6, B:40:0x00c9, B:42:0x00cd), top: B:49:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:7:0x001a, B:10:0x0023, B:12:0x002d, B:19:0x0072, B:22:0x007d, B:25:0x0088, B:35:0x009f, B:37:0x00bc, B:39:0x00c6, B:40:0x00c9, B:42:0x00cd), top: B:49:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] r() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.snapshot.ExceptionManager.r():java.lang.String[]");
    }
}
