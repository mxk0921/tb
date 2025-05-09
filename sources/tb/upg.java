package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.linkback.LinkBackUrlExecutor;
import com.taobao.android.linkback.MtopRequestExecutor;
import com.taobao.android.nav.Nav;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class upg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29544a;
    public final Context b;
    public final hsg c;
    public final AtomicBoolean d;
    public final t11 e;
    public final WVPageTracker.PageStatusCallback f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements t11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                upg.a(upg.this, activity.getIntent().getDataString());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements WVPageTracker.PageStatusCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
        public void onPageFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f0cb712", new Object[]{this, str});
            } else {
                upg.a(upg.this, str);
            }
        }

        @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
        public void onRedirect(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5c125f6", new Object[]{this, str, str2});
            }
        }
    }

    public upg(Uri uri, Context context) {
        this(uri, context, new isg());
    }

    public static /* synthetic */ void a(upg upgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716d8d54", new Object[]{upgVar, str});
        } else {
            upgVar.c(str);
        }
    }

    public final Uri b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("861a7fb3", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f29544a.toString()) && !this.f29544a.toString().contains("_afc_link=1")) {
            return null;
        }
        String b2 = LinkBackUrlExecutor.c().b();
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(b2).buildUpon();
        Uri build = buildUpon != null ? buildUpon.appendQueryParameter("isNeedHomeNew", "0").build() : null;
        if (build == null || (build.isHierarchical() && URLUtil.isValidUrl(build.toString()))) {
            return build;
        }
        TLog.loge(wpg.MODULE_NAME, (String) null, "targetUrl is not hierarchical or not valid url: " + build.toString());
        ah0.c(1013, "afc_back_url_exception", build.toString(), this.f29544a.toString(), null);
        return null;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163680f7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && str.contains("isNeedHomeNew") && this.d.compareAndSet(true, false)) {
            TLog.loge(wpg.MODULE_NAME, (String) null, "handleBackArrive, url: ".concat(str));
            ah0.c(1013, "afc_back_url_arrive", str, this.f29544a.toString(), null);
            i();
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6120cb45", new Object[]{this})).booleanValue();
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.b, "link_back_arrive_tracker_off");
            StringBuilder sb = new StringBuilder("isArriveTrackerEnable: ");
            sb.append(!isFeatureOpened);
            TLog.loge(wpg.MODULE_NAME, (String) null, sb.toString());
            return !isFeatureOpened;
        } catch (Throwable th) {
            TLog.loge(wpg.MODULE_NAME, (String) null, "isArriveTrackerEnable error: " + th.toString());
            return false;
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab681fb", new Object[]{this})).booleanValue();
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.b, "link_back_opt_off");
            StringBuilder sb = new StringBuilder("isOptimizeOpened: ");
            sb.append(!isFeatureOpened);
            TLog.loge(wpg.MODULE_NAME, (String) null, sb.toString());
            return !isFeatureOpened;
        } catch (Throwable th) {
            TLog.loge(wpg.MODULE_NAME, (String) null, "isOptimizeOpened error: " + th.toString());
            return false;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49235e3f", new Object[]{this})).booleanValue();
        }
        try {
            Uri uri = this.f29544a;
            if (uri != null && "0".equals(uri.getQueryParameter("isNeedHomeNew"))) {
                if (c21.g().getInt("aliveActivityCount", -1) == 1) {
                    return true;
                }
            }
        } catch (Exception e) {
            TLog.loge(wpg.MODULE_NAME, "Back to Home failed for some reason : ", e);
        }
        return false;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b492f42d", new Object[]{this});
        } else if (this.d.compareAndSet(false, true)) {
            WVPageTracker.registerH5LifeCallback(this.f);
            c21.a(this.e, true);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9bdc0e", new Object[]{this});
            return;
        }
        WVPageTracker.removeH5LifeCallback(this.f);
        c21.j(this.e);
    }

    public final void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752c4450", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("afcBackUrl", str);
        hashMap.put(ActivityJumpUtil.LANDING_URL, str2);
        MtopRequestExecutor.a(this.b, MtopRequestExecutor.REPORT_API, hashMap, new Handler(nsg.b.f24924a.getLooper()), 5000);
    }

    public upg(Uri uri, Context context, hsg hsgVar) {
        this.d = new AtomicBoolean(false);
        this.e = new a();
        this.f = new b();
        this.f29544a = uri;
        this.b = context;
        this.c = hsgVar;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b5b1b9", new Object[]{this})).booleanValue();
        }
        if (!e()) {
            if (!this.f29544a.isHierarchical() || !URLUtil.isValidUrl(this.f29544a.toString())) {
                TLog.loge(wpg.MODULE_NAME, (String) null, "mUrl is not hierarchical or not valid url: " + this.f29544a.toString());
                ah0.c(1013, "afc_original_url_exception", this.f29544a.toString(), null, null);
                return false;
            }
        } else if (!this.f29544a.isHierarchical()) {
            TLog.loge(wpg.MODULE_NAME, (String) null, "mUrl is not hierarchical: " + this.f29544a.toString());
            ah0.c(1013, "afc_original_url_exception", this.f29544a.toString(), null, null);
            return false;
        }
        if (!((isg) this.c).a(this.b.getClass().getName())) {
            Uri b2 = b();
            String queryParameter = this.f29544a.getQueryParameter("launchType");
            if (b2 != null) {
                if (d()) {
                    h();
                }
                boolean uri = Nav.from(this.b).toUri(b2);
                HashMap hashMap = new HashMap();
                hashMap.put(rb.RESULT_KEY, String.valueOf(uri));
                ah0.c(1013, "afc_need_home", b2.toString(), queryParameter, hashMap);
                LinkBackUrlExecutor.c().a();
                j(b2.toString(), this.f29544a.toString());
                if (uri) {
                    TLog.loge(wpg.MODULE_NAME, (String) null, "jump success to uri: " + b2);
                    return true;
                }
            }
            if (g()) {
                boolean uri2 = Nav.from(this.b).toUri("http://m.taobao.com/index.htm");
                HashMap hashMap2 = new HashMap();
                hashMap2.put(rb.RESULT_KEY, String.valueOf(uri2));
                ah0.c(1013, "afc_need_home", "http://m.taobao.com/index.htm", queryParameter, hashMap2);
                return uri2;
            }
            TLog.loge(wpg.MODULE_NAME, (String) null, "jump failed to uri: " + b2);
        }
        return false;
    }
}
