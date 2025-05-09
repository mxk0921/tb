package tb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.utils.TLogMultiProcessReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u5s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANGE_LOG_LEVEL = "com.taobao.tao.log.change.loglevel";
    public static final String ACTION_CHANGE_MODULE_LEVEL = "com.taobao.tao.log.change.modulelevel";
    public static final String ACTION_FLUSH = "com.taobao.tao.log.flush";
    public static final String PARAM_LOG_LEVEL = "tlog_log_level";
    public static final String PARAM_MODULE_LEVEL = "tlog_module_level";
    public static final String PARAM_PID = "tlog_pid";

    /* renamed from: a  reason: collision with root package name */
    public static final TLogMultiProcessReceiver f29167a = new TLogMultiProcessReceiver();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(767557741);
    }

    public static void b(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3bce59", new Object[]{logLevel});
            return;
        }
        Intent intent = new Intent(ACTION_CHANGE_LOG_LEVEL);
        intent.putExtra(PARAM_LOG_LEVEL, logLevel);
        f(intent);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28de1173", new Object[]{str});
            return;
        }
        Intent intent = new Intent(ACTION_CHANGE_MODULE_LEVEL);
        intent.putExtra(PARAM_MODULE_LEVEL, str);
        f(intent);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e0cc2d", new Object[0]);
        } else {
            f(new Intent(ACTION_FLUSH));
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68af7d9", new Object[]{context});
        } else if (a(context)) {
            AtomicBoolean atomicBoolean = b;
            if (!atomicBoolean.get()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(ACTION_FLUSH);
                intentFilter.addAction(ACTION_CHANGE_LOG_LEVEL);
                intentFilter.addAction(ACTION_CHANGE_MODULE_LEVEL);
                if (Build.VERSION.SDK_INT > 33) {
                    context.registerReceiver(f29167a, intentFilter, 4);
                } else {
                    context.registerReceiver(f29167a, intentFilter);
                }
                atomicBoolean.set(true);
            }
        }
    }

    public static void f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0450b5", new Object[]{intent});
            return;
        }
        Context h = j5s.j().h();
        if (h != null && intent != null && a(h)) {
            intent.putExtra(PARAM_PID, Process.myPid());
            intent.setPackage(h.getPackageName());
            h.sendBroadcast(intent);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("888944f8", new Object[]{context})).booleanValue();
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (defaultSharedPreferences.contains("tlog_multi_process_notify")) {
                return defaultSharedPreferences.getBoolean("tlog_multi_process_notify", true);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
