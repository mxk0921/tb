package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pm2 implements i7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<String, Boolean> f26177a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final pm2 f26178a = new pm2();

        static {
            t2o.a(744488995);
        }

        public static /* synthetic */ pm2 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pm2) ipChange.ipc$dispatch("fb640f37", new Object[0]);
            }
            return f26178a;
        }
    }

    static {
        t2o.a(744488994);
        t2o.a(619708613);
    }

    public static pm2 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pm2) ipChange.ipc$dispatch("b7c380dc", new Object[0]);
        }
        return a.a();
    }

    @Override // tb.i7d
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12721ab9", new Object[]{this, str, str2, str3});
            return;
        }
        vp9.a("linkx", "BrowserPageTouchListener.onRedirectUrl.activityCode=" + str + " === originUrl=" + str2 + " === targetUrl=" + str3);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (str3.startsWith(h1p.HTTP_PREFIX) || str3.startsWith(h1p.HTTPS_PREFIX)) {
            ((ConcurrentHashMap) this.f26177a).put(str, Boolean.FALSE);
        }
    }

    @Override // tb.i7d
    public void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f2f453", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        vp9.a("linkx", "BrowserPageTouchListener.onDestroy.activityCode=" + str + " === url=" + str2 + " === isFinishing=" + z);
        if (z && !TextUtils.isEmpty(str)) {
            Iterator it = ((ConcurrentHashMap) this.f26177a).entrySet().iterator();
            while (it.hasNext()) {
                String str3 = (String) ((Map.Entry) it.next()).getKey();
                if (!TextUtils.isEmpty(str3) && str3.equals(str)) {
                    it.remove();
                }
            }
        }
    }

    @Override // tb.i7d
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb535bb", new Object[]{this, str, str2});
            return;
        }
        vp9.a("linkx", "BrowserPageTouchListener.onPageFinished.activityCode=" + str + " === url=" + str2);
    }

    @Override // tb.i7d
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b4c26a", new Object[]{this, str, str2});
            return;
        }
        vp9.a("linkx", "BrowserPageTouchListener.onTouchPage.activityCode=" + str + " === url=" + str2);
        ((ConcurrentHashMap) this.f26177a).put(str, Boolean.TRUE);
    }

    @Override // tb.i7d
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38c2ae", new Object[]{this, str, str2});
            return;
        }
        vp9.a("linkx", "BrowserPageTouchListener.onPageStarted.activityCode=" + str + " === url=" + str2);
        ((ConcurrentHashMap) this.f26177a).put(str, Boolean.FALSE);
    }

    public final String f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("747c30ba", new Object[]{this, activity});
        }
        return Integer.toHexString(activity.hashCode());
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0a0c06f", new Object[]{this})).booleanValue();
        }
        Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        String f = f(currentActivity);
        Boolean bool = (Boolean) ((ConcurrentHashMap) this.f26177a).get(f);
        vp9.a("linkx", String.format("BrowserPageTouchListener.isCurrentBrowserNotTouched.mOpenedUrlNotTouched=%s.webViewActivityHashCode=%s.touched=%s.", this.f26177a, f, bool));
        return bool != null && !bool.booleanValue();
    }
}
