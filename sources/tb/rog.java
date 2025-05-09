package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class rog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rog INSTANCE = new rog();

    /* renamed from: a  reason: collision with root package name */
    public static final String f27499a = "LightVaneSDK";
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static boolean c;

    static {
        t2o.a(507510786);
    }

    public final void a(Context context, udg udgVar) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf0f836", new Object[]{this, context, udgVar});
            return;
        }
        ckf.g(context, "context");
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get()) {
            Application application = null;
            if (!(context instanceof Application)) {
                context2 = null;
            } else {
                context2 = context;
            }
            Context context3 = (Application) context2;
            if (context3 == null) {
                context3 = context.getApplicationContext();
            }
            if (context3 instanceof Application) {
                application = context3;
            }
            Application application2 = application;
            if (application2 != null) {
                b(context);
                atomicBoolean.set(geg.a(application2, udgVar));
                return;
            }
            throw new IllegalArgumentException("init error, context should be Application or its subclass");
        }
    }

    public final void b(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ff4e82", new Object[]{this, context});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                ckf.f(processName, "Application.getProcessName()");
                if (!TextUtils.isEmpty(processName)) {
                    WebView.setDataDirectorySuffix(processName);
                    c = true;
                }
            }
        } catch (Throwable unused) {
            if (!c) {
                Log.e(f27499a, "WebView Android P Support Error");
            }
        }
    }
}
