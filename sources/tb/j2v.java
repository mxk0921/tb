package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j2v implements f2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity b;
    public final long f;
    public long c = 0;
    public long d = 0;
    public boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21729a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements rc4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rc4
        public void onCreate(WXComponent wXComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
            }
        }

        @Override // tb.rc4
        public void onPreDestory(WXComponent wXComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
            }
        }

        @Override // tb.rc4
        public void onViewCreated(WXComponent wXComponent, View view) {
            up8 exposureViewHandler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
            } else if (j2v.this.c() && (exposureViewHandler = g3v.getInstance().getExposureViewHandler(j2v.a(j2v.this))) != null && exposureViewHandler.isExposureView(c2v.getInstance().getPageUrl(j2v.a(j2v.this)), view)) {
                g3v.getInstance().setExposureTagForWeex(view);
            }
        }
    }

    static {
        t2o.a(85983272);
        t2o.a(85983267);
    }

    public j2v(Activity activity) {
        this.f = 500L;
        this.b = activity;
        npb b = kr0.e().b();
        if (b != null) {
            try {
                this.f = Long.parseLong(b.getConfig("android_weex_common_config", "skipFast2001Time", "500"));
            } catch (NumberFormatException e) {
                WXLogUtils.e("UTPresenter", e);
                this.f = 500L;
            }
        }
    }

    public static /* synthetic */ Activity a(j2v j2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("4621874f", new Object[]{j2vVar});
        }
        return j2vVar.d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f21729a = true;
        this.b = null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return this.f21729a;
    }

    public final Activity d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c4d85b", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.d = currentTimeMillis;
        if ((currentTimeMillis - this.c > this.f || !this.e) && d() != null && c()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(d());
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479465cb", new Object[]{this, str});
        } else if (d() != null && c()) {
            f();
            UTAnalytics.getInstance().getDefaultTracker().skipPage(d());
            e(str);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7766235", new Object[]{this});
        } else if (c()) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(d());
        }
    }

    public void i(WXSDKInstance wXSDKInstance) {
        WXComponent rootComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d83ec0", new Object[]{this, wXSDKInstance});
        } else if (c() && (rootComponent = wXSDKInstance.getRootComponent()) != null) {
            String str = (String) rootComponent.getAttrs().get("spmId");
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-cnt", str + ".0.0");
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(d(), hashMap);
            }
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
        } else if (c() && d() != null && !TextUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(d(), Uri.parse(str).buildUpon().clearQuery().build().toString());
        }
    }

    public void k(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4458678c", new Object[]{this, wXSDKInstance});
        } else {
            wXSDKInstance.b1(new a());
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f839495", new Object[]{this, str});
            return;
        }
        npb b = kr0.e().b();
        if (b != null) {
            if (TextUtils.equals("false", b.getConfig("android_weex_common_config", "enableSkipFast2001", "true"))) {
                this.e = false;
            }
            if (TextUtils.isEmpty(str)) {
                this.e = false;
            }
            Uri parse = Uri.parse(str);
            if (parse == null || !parse.getPath().contains("app/tb-shop/mini-shop")) {
                this.e = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.c = currentTimeMillis;
            if ((currentTimeMillis - this.d > this.f || !this.e) && d() != null && c()) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(d());
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(d());
                if (!TextUtils.isEmpty(str) && parse != null) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(d(), parse);
                    if (parse.isHierarchical() && parse.getQueryParameter("scm") != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("scm", parse.getQueryParameter("scm"));
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(d(), hashMap);
                    }
                }
            }
        }
    }
}
