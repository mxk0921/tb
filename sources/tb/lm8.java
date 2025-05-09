package tb;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lm8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Instrumentation f23408a;

    public lm8(Instrumentation instrumentation) {
        this.f23408a = instrumentation;
    }

    public static String d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67e25a17", new Object[]{th});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        try {
            th.printStackTrace(printStream);
            printStream.close();
            return byteArrayOutputStream.toString();
        } finally {
            try {
                throw th;
            } catch (Throwable th2) {
            }
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8947f4c", new Object[]{str, str2});
            return;
        }
        TLog.loge(erj.MODULE, str, str2);
        String c = fxp.c(fxp.j());
        AppMonitor.Counter.commit(erj.MODULE, "ExceptionRecovery", "type=" + str + ", startupComponent=" + c + ", " + str2, 1.0d);
    }

    public void a(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b66e33", new Object[]{this, activity, bundle});
        } else if (!(activity instanceof FragmentActivity)) {
            this.f23408a.callActivityOnCreate(activity, bundle);
        } else {
            boolean b = qg0.b(activity.getIntent());
            h(activity, bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (!b) {
                this.f23408a.callActivityOnCreate(activity, bundle);
            } else if (bundle == null) {
                this.f23408a.callActivityOnCreate(activity, null);
            } else {
                Parcelable parcelable = bundle.getParcelable("androidx:fragments");
                Parcelable parcelable2 = bundle.getParcelable("android:support:fragments");
                if (parcelable == null || parcelable2 == null) {
                    this.f23408a.callActivityOnCreate(activity, bundle);
                    return;
                }
                g("BadFragmentState", "activityName=".concat(activity.getClass().getName()));
                bundle.clear();
                this.f23408a.callActivityOnCreate(activity, bundle);
            }
        }
    }

    public void b(Activity activity, Bundle bundle) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81918861", new Object[]{this, activity, bundle});
                return;
            }
            try {
                this.f23408a.callActivityOnRestoreInstanceState(activity, bundle);
                sb = new StringBuilder("callActivityOnRestoreInstanceState for activity: ");
            } catch (BadParcelableException e) {
                c(e, activity.getClass().getName());
                if (!t.a(activity, "exceptionRecoveryOff")) {
                    if (bundle != null) {
                        bundle.clear();
                    }
                    sb = new StringBuilder("callActivityOnRestoreInstanceState for activity: ");
                } else {
                    throw e;
                }
            }
            sb.append(activity.getComponentName());
            TLog.loge(erj.MODULE, "ExceptionRecovery", sb.toString());
        } catch (Throwable th) {
            TLog.loge(erj.MODULE, "ExceptionRecovery", "callActivityOnRestoreInstanceState for activity: " + activity.getComponentName());
            throw th;
        }
    }

    public final void c(BadParcelableException badParcelableException, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bee41b", new Object[]{this, badParcelableException, str});
            return;
        }
        String message = badParcelableException.getMessage();
        if (!TextUtils.isEmpty(message) && message.startsWith("ClassNotFoundException when unmarshalling:")) {
            String substring = message.substring(43);
            g("BadParcelable", "className=" + substring + ", activityName=" + str);
        }
    }

    public Application e(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a20c09ba", new Object[]{this, classLoader, str, context});
        }
        IllegalStateException illegalStateException = new IllegalStateException("WARNING, the application maybe created before");
        whh.b("ExceptionRecovery", "newApplication with className: " + str, illegalStateException);
        g("CreateApplication", "className=" + str + ",stack=" + d(illegalStateException));
        return this.f23408a.newApplication(classLoader, str, context);
    }

    public final void h(Activity activity, Bundle bundle, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2624ada4", new Object[]{this, activity, bundle, str});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && i < 30 && bundle != null) {
            try {
                Bundle bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    bundle2.setClassLoader(activity.getClassLoader());
                    Bundle bundle3 = bundle2.getBundle("android:support:fragments");
                    if (bundle3 != null) {
                        bundle3.setClassLoader(activity.getClassLoader());
                        z = bundle3.isEmpty();
                    }
                    whh.a("ExceptionRecovery", "unmarshallSafely successfully for activity: " + activity.getClass().getName() + "stateEmpty: " + z);
                }
            } catch (BadParcelableException e) {
                c(e, activity.getClass().getName());
                bundle.clear();
            }
        }
    }

    public boolean f(Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d775c06", new Object[]{this, obj, th})).booleanValue();
        }
        Log.wtf("ExceptionRecovery", th);
        Throwable th2 = th;
        for (Throwable cause = th.getCause(); cause != null && th2 != cause; cause = cause.getCause()) {
            th2 = cause;
        }
        String d = d(th);
        TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("ExceptionRecovery", d);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if ((obj instanceof Service) && km8.a(th2)) {
                g("serviceException", "service=".concat(obj.getClass().getName()));
                return true;
            }
        } else if ((obj instanceof Service) && (th instanceof RuntimeException)) {
            g("serviceException", "service=".concat(obj.getClass().getName()));
            return true;
        }
        if (obj != null) {
            g("UncaughtException", "obj=" + obj.getClass().getName() + ":" + message);
        } else {
            g("UncaughtException", "exception :" + d);
        }
        return false;
    }
}
