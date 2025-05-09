package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.patronus._Patrons;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.reflect.Proxy;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23728a;

    public m1x(Context context) {
        this.f23728a = context;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            if (_Patrons.deleteWebViewReservation() > 0) {
                boolean equals = Objects.equals(m7l.a(this.f23728a, "MemKeeper", 0).getString("shouldUseNewCookieManager", "true"), "true");
                lt4.k(this.f23728a);
                a(equals, ayv.a(this.f23728a));
                Log.e("WebViewFactoryCommand", "succ");
            } else {
                Log.e("WebViewFactoryCommand", "failed");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(boolean z, boolean z2) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff51f187", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        adk i = adk.i(Class.forName("android.webkit.WebViewFactory"));
        Object h = i.b("sProviderInstance").h();
        if (h != null) {
            crashCaughtHeader.addHeaderInfo("WebViewFactoryCommand", "sProviderInstance already loaded");
        }
        i.f("sProviderInstance", Proxy.newProxyInstance(m1x.class.getClassLoader(), new Class[]{Class.forName("android.webkit.WebViewFactoryProvider")}, new z1n(h, z, z2)));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            adk.i(Class.forName("android.webkit.WebViewLibraryLoader")).e("nativeLoadWithRelroFile", new Class[]{String.class, String.class, ClassLoader.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "/dev/null", m1x.class.getClassLoader()});
        } else if (i2 >= 24) {
            i.e("nativeLoadWithRelroFile", new Class[]{String.class, String.class, String.class, String.class, ClassLoader.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "~~~ForReleaseWebViewReservation~", "/dev/null", "/dev/null", m1x.class.getClassLoader()});
        } else {
            i.e("nativeLoadWithRelroFile", new Class[]{String.class, String.class, String.class, String.class}, new Object[]{"~~~ForReleaseWebViewReservation~", "~~~ForReleaseWebViewReservation~", "/dev/null", "/dev/null"});
        }
        crashCaughtHeader.addHeaderInfo("WebViewFactoryCommand", "disable system webview succ");
    }
}
