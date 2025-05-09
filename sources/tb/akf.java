package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class akf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f15788a;

    static {
        t2o.a(729809845);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
            return;
        }
        sfh.f("IntlNotifyLifecycle", "editionChanged");
        if (c()) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                zgl.a();
                sfh.d("IntlNotifyLifecycle", "editionChanged use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th) {
                sfh.d("IntlNotifyLifecycle", "editionChanged error : " + th.getMessage());
                ddv.h("IntlNotify", "2.0", "editionChanged exception", th.getMessage(), null, null);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800981b5", new Object[]{this});
            return;
        }
        sfh.f("IntlNotifyLifecycle", "homePageOnCreate");
        if (c()) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                zgl.b();
                sfh.d("IntlNotifyLifecycle", "launchTmgBundleBeforeRender use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th) {
                sfh.d("IntlNotifyLifecycle", "launchTmgBundleBeforeRender error : " + th.getMessage());
                ddv.h("IntlNotify", "2.0", "launchTmgBundleBeforeRender exception", th.getMessage(), null, null);
            }
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16678f3", new Object[]{this})).booleanValue();
        }
        if (!e() || !d()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("566b4681", new Object[]{this})).booleanValue();
        }
        if (this.f15788a == null) {
            this.f15788a = Boolean.valueOf(f4b.b("enablePassLifecycleToIntl", true));
        }
        return this.f15788a.booleanValue();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[]{this})).booleanValue();
        }
        return kbq.e(Globals.getApplication());
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f591da", new Object[]{this});
            return;
        }
        sfh.f("IntlNotifyLifecycle", "renderFirstFrame");
        if (c()) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                zgl.c();
                sfh.d("IntlNotifyLifecycle", "launchTmgBundleRendered use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th) {
                sfh.d("IntlNotifyLifecycle", "launchTmgBundleRendered error : " + th.getMessage());
                ddv.h("IntlNotify", "2.0", "launchTmgBundleRendered exception", th.getMessage(), null, null);
            }
        }
    }
}
