package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements OnFileCreatedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22981a;

        /* compiled from: Taobao */
        /* renamed from: tb.kx4$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0974a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0974a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.f22981a.getSharedPreferences("rso_crash_monitor", 0).edit().putLong("native_crash_timestamp", uos.b()).apply();
                }
            }
        }

        public a(Context context) {
            this.f22981a = context;
        }

        @Override // com.taobao.android.tcrash.OnFileCreatedListener
        public void onFileCreated(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
                return;
            }
            RSoLog.d("crash-> crash file created path=" + str);
            rbn.i("Crash.register", new RunnableC0974a());
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
            return;
        }
        try {
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new a(context.getApplicationContext()));
        } catch (Throwable th) {
            rbn.g("CrashReporterUtils,register,error:", th);
        }
    }

    public static boolean a(Context context, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("439c38df", new Object[]{context, new Integer(i)})).booleanValue();
        }
        if (d1r.a(".forceCrashRisk")) {
            RSoLog.d("crash-> isInCrashRisk=true, local config .forceCrashRisk ");
            return true;
        }
        long j = context.getApplicationContext().getSharedPreferences("rso_crash_monitor", 0).getLong("native_crash_timestamp", 0L);
        if (TimeUnit.MILLISECONDS.toSeconds(uos.b() - j) >= i) {
            z = false;
        }
        RSoLog.d("crash-> isInCrashRisk=" + z + ", current=" + uos.b() + ", nativeCrashTimestamp=" + j + ", riskIntervalInSeconds=" + i);
        return z;
    }
}
