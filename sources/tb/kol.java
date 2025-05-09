package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.tao.log.TLog;
import com.taobao.tao.welcome.Welcome;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22803a;
    public String b;
    public long c;
    public long d;
    public final gu e;
    public String f;
    public boolean g = false;
    public int h = 0;

    static {
        t2o.a(736100445);
    }

    public kol(gu guVar) {
        this.e = guVar;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5871259", new Object[]{this})).booleanValue();
        }
        tm1.a("PageStateService", "PageStateService isFromWelcome frontActivityName：" + this.f);
        String str = this.f;
        if (str == null || (TextUtils.equals(str, Welcome.class.getSimpleName()) && !this.g)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e06915", new Object[]{this})).booleanValue();
        }
        long g = di2.g();
        this.d = g;
        if (g <= this.c + oh2.e().d()) {
            return false;
        }
        this.c = g;
        return true;
    }

    public final boolean h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5891e7bc", new Object[]{this, activity})).booleanValue();
        }
        return TextUtils.equals(activity.getLocalClassName(), this.b);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9ed6d8", new Object[]{this, str});
            return;
        }
        this.f = str;
        tm1.a("PageStateService", "PageStateService isFromWelcome frontActivityName：" + this.f);
    }

    public static boolean g(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb861226", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        try {
            tm1.a("PageStateService", "isOutLink uri = " + data.toString());
            return "1".equals(data.getQueryParameter("_afc_link"));
        } catch (Throwable th) {
            tm1.a("PageStateService", "isOutLink throwable = " + th.toString());
            return false;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean a(Intent intent) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1302316f", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        try {
            str = data.getQueryParameter("bootImage");
            tm1.a("PageStateService", "onActivityResumed, return, checkSkip == true");
        } catch (UnsupportedOperationException unused) {
            tm1.a("PageStateService", "onActivityResumed, return, checkSkip == true");
            str = "";
        } catch (Throwable th) {
            tm1.a("PageStateService", "onActivityResumed, return, checkSkip == true");
            throw th;
        }
        return "0".equalsIgnoreCase(str);
    }

    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722b9d7d", new Object[]{this, activity});
            return;
        }
        try {
            tm1.a("PageStateService", "PageStateService enableOnStop activity：".concat(activity.getClass().getSimpleName()));
            i(activity.getClass().getSimpleName());
            if (!lol.b()) {
                tm1.a("PageStateService", "enableOnStop not isInBackground ");
                return;
            }
            this.f22803a = true;
            this.b = activity.getLocalClassName();
            tm1.a("PageStateService", "enableOnStop lastLeaveActivityName：" + this.b);
            if (e()) {
                tm1.a("PageStateService", "enableOnStop isFromWelcome");
                return;
            }
            if (f()) {
                tm1.a("PageStateService", "enableOnStop updateBootImageData");
                BootImageDataMgr.g().k();
            }
            this.e.c(activity);
        } catch (Throwable th) {
            tm1.b("PageStateService", "onActivityStop", th);
            this.e.d("onStop", th);
        }
    }

    public final boolean d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebcc2e6a", new Object[]{this})).booleanValue();
        }
        long g = di2.g() - this.d;
        long b = oh2.e().b();
        if (g < b) {
            tm1.a(oh2.TAG, "show failed: backTime=" + g + ", configTime=" + b);
            z = true;
        }
        if (z) {
            tm1.a("PageStateService", "onActivityResumed, return, isBackTooFast == true");
        }
        return z;
    }

    public void b(Activity activity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a4dd68", new Object[]{this, activity});
            return;
        }
        try {
            tm1.a("PageStateService", "PageStateService enableOnResume activity：".concat(activity.getClass().getSimpleName()));
        } catch (Throwable th) {
            try {
                tm1.b("PageStateService", "onActivityResumed", th);
                this.e.d("onResume", th);
            } finally {
                this.f22803a = false;
                this.b = null;
            }
        }
        if (lol.c(activity)) {
            tm1.a("PageStateService", "onActivityResumed, pageInErrorState return, isWelcome == true" + activity);
        } else if (a(activity.getIntent())) {
            tm1.a("PageStateService", "onActivityResumed, pageInErrorState SKIP_FROM_URI");
        } else {
            boolean g = g(activity.getIntent());
            tm1.a("PageStateService", "onActivityResumed, isOutLink = " + g);
            boolean e = e();
            boolean a2 = lol.a(activity);
            wzi e2 = usg.d().e();
            tm1.a("PageStateService", "onActivityResumed, isFromWelcome  = " + e + ",isHomepage = " + a2 + ", welcomeEnterCount = " + this.h);
            if (!e || !a2 || (i = this.h) >= 1) {
                tm1.a("PageStateService", "onActivityResumed, enter, !fromWelcome || !isHomePage " + activity);
                if (this.f22803a && h(activity)) {
                    if (d()) {
                        tm1.a("PageStateService", "onActivityResumed, pageInErrorState isBackTooFast");
                        e2.c(wzi.LAUNCHER, "BackTooFast", "", "", "", "");
                        return;
                    } else if (activity.getIntent() == null || activity.getIntent().getData() == null || !activity.getIntent().getData().toString().equals("http://m.taobao.com/index.htm") || !activity.getClass().getSimpleName().equals("Welcome")) {
                        TLog.logi(oh2.TAG, "scene: hotstart1");
                        tm1.a("PageStateService", "onActivityResumed, hotStart isOutLink=" + g);
                        e2.c(wzi.LAUNCHER, "TotalHotStart", "", "", "", "");
                        this.e.b(activity, g);
                        return;
                    } else {
                        tm1.a("PageStateService", "onActivityResumed, pageInErrorState return hotStart isFirstHomePage");
                        return;
                    }
                }
                tm1.a("PageStateService", "onActivityResumed, return, , fromBackground = " + this.f22803a + ", activity.getLocalClassName = " + activity.getLocalClassName() + ", lastLeaveActivityName = " + this.b);
                tm1.a("PageStateService", "onActivityResumed, pageInErrorState notSameActivity || notFromBackground");
                return;
            }
            this.h = i + 1;
            tm1.a("PageStateService", "onActivityResumed, enter, fromWelcome && isHomePage " + activity);
            tm1.a("PageStateService", "开始冷启闪屏 coldStart");
            this.g = true;
            e2.c(wzi.LAUNCHER, "TotalColdStart", "", "", "", "");
            this.e.a(activity, g);
        }
    }
}
