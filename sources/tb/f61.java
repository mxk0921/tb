package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f61 implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f19040a;
    public int b;
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    public f61(x0s x0sVar, a aVar) {
        this.f19040a = aVar;
        this.c = o1r.a(x0sVar.g()).b("shortDump", true);
    }

    public final void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c236384", new Object[]{this, activity, str, str2});
            return;
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        String simpleName = activity.getClass().getSimpleName();
        String format = simpleDateFormat.format(date);
        b bVar = new b(simpleName + "_" + str + ", data:" + str2 + ", " + format, this.f19040a, this.c);
        if (this.c) {
            bVar.run();
        } else {
            suo.c(bVar).d(suo.sScheduler).b();
        }
    }

    public final String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a174c149", new Object[]{this, intent});
        }
        String dataString = intent != null ? intent.getDataString() : null;
        return dataString != null ? dataString : "null";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String f = "track";
        private static final int g = 64;
        private static int h;
        private static int i;

        /* renamed from: a  reason: collision with root package name */
        private int f19041a;
        private int b;
        private final String c;
        private final a d;
        private final boolean e;

        public b(String str, a aVar, boolean z) {
            this.c = str;
            this.d = aVar;
            this.e = z;
            int i2 = h;
            h = i2 + 1;
            this.f19041a = i2 & 63;
            int i3 = i;
            i = i3 + 1;
            this.b = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.e) {
                    String str = "track_" + this.f19041a;
                    ((r0s) this.d).a(str, this.b + ":" + this.c);
                } else {
                    String str2 = this.c + " " + gki.b();
                    String str3 = "track_" + this.f19041a;
                    ((r0s) this.d).a(str3, this.b + ":" + str2);
                    m4s.b("AppLife", str2);
                }
            } catch (Throwable th) {
                ehh.d(th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            ehh.a("onActivityCreated：".concat(activity.getClass().getName()), new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            ehh.a("onActivityDestroyed：".concat(activity.getClass().getName()), new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            ehh.a("onActivityPaused：".concat(activity.getClass().getName()), new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            ehh.a("onActivityResumed：".concat(activity.getClass().getName()), new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        } else {
            ehh.a("onActivitySaveInstanceState：".concat(activity.getClass().getName()), new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        ehh.a("onActivityStarted：".concat(activity.getClass().getName()), new Object[0]);
        this.b++;
        String b2 = b(activity.getIntent());
        if (this.b == 1) {
            ehh.a("nativeSetForeground foreground", new Object[0]);
            ((r0s) this.f19040a).a("_foreground", String.valueOf(true));
            a(activity, "onForeground", b2);
        } else {
            a(activity, "onStart", b2);
        }
        ((r0s) this.f19040a).a("_controller", activity.getClass().getName());
        ((r0s) this.f19040a).a("last_page_url", b2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        ehh.a("onActivityStopped：".concat(activity.getClass().getName()), new Object[0]);
        this.b--;
        Intent intent = activity.getIntent();
        String dataString = intent != null ? intent.getDataString() : null;
        if (dataString == null) {
            dataString = "null";
        }
        if (this.b == 0) {
            ehh.a("nativeSetForeground background", new Object[0]);
            ((r0s) this.f19040a).a("_foreground", String.valueOf(false));
            a(activity, "onBackground", dataString);
            return;
        }
        a(activity, "onStop", dataString);
    }
}
