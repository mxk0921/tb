package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.linkback.LinkBackUrlExecutor;
import com.taobao.browser.PreInitWebviewTask;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.welcome.Welcome;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static aht d;

    /* renamed from: a  reason: collision with root package name */
    public String f15749a;
    public cht b;
    public final Application.ActivityLifecycleCallbacks c = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15750a;
        public final /* synthetic */ Context b;

        public a(String str, Context context) {
            this.f15750a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vp9.a("linkx", "TbNavCenter === nav: 开始预渲染");
            vmm.a().triggerRender(PreInitWebviewTask.LAUNCHER_WEB, this.f15750a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            if (!TextUtils.equals(Welcome.class.getSimpleName(), simpleName) && TbFcLinkInit.instance().isAfcLink) {
                vp9.a("linkx", "TbNavCenter === onActivityResumed:" + simpleName + " === 页面不相同，关闭海关中转页面");
                if (TextUtils.isEmpty(aht.a(aht.this)) || !qqg.a(Uri.parse(aht.a(aht.this)))) {
                    bht.b();
                }
                TbFcLinkInit.instance().mApplication.unregisterActivityLifecycleCallbacks(aht.b(aht.this));
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

    static {
        t2o.a(744488998);
    }

    public static /* synthetic */ String a(aht ahtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67542158", new Object[]{ahtVar});
        }
        return ahtVar.f15749a;
    }

    public static /* synthetic */ Application.ActivityLifecycleCallbacks b(aht ahtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("95e5f127", new Object[]{ahtVar});
        }
        return ahtVar.c;
    }

    public static aht c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aht) ipChange.ipc$dispatch("8ebd9d5e", new Object[0]);
        }
        if (d == null) {
            d = new aht();
        }
        return d;
    }

    public void f(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f68647", new Object[]{this, str, map});
            return;
        }
        qg0 qg0Var = AfcCustomSdk.h().f;
        g(qg0Var);
        ovv.g().i(str);
        try {
            String str2 = qg0Var.x;
            if (!TextUtils.isEmpty(str2)) {
                LinkBackUrlExecutor.c().d(str2);
            }
        } catch (Exception e) {
            vp9.b("linkx", "TbNavCenter === navToPage: afcBackUrl处理异常：" + e);
        }
        if (TextUtils.isEmpty(str)) {
            TFCCommonUtils.u(TbFcLinkInit.instance().mApplication);
            vp9.a("linkx", "TbNavCenter === navToPage: landingUrl为空，跳到首页");
            return;
        }
        this.f15749a = str;
        this.b = cht.a();
        e(TbFcLinkInit.instance().mApplication, qg0Var, str, map);
    }

    public final void g(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761580bb", new Object[]{this, qg0Var});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("autoLoginParam", qg0Var.B.getString("autoLoginParam"));
            hashMap.put("autoLoginExecuteStatus", qg0Var.B.getString("autoLoginExecuteStatus"));
            hashMap.put("startLoginStatus", qg0Var.B.getString("startLoginStatus"));
            hashMap.put("autoLoginAbBucketId", qg0Var.B.getString("autoLoginAbBucketId"));
            hashMap.put("beforeNavlLoginStatus", TFCCommonUtils.j());
            ah0.d("afc_autologin_result", "", "", hashMap);
        } catch (Throwable unused) {
            vp9.b("linkx", "TbNavCenter === trackAutoLogin === 异常");
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755e8df6", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            LinkBackUrlExecutor.c().a();
        } else {
            LinkBackUrlExecutor.c().d(str);
            vp9.a("linkx", "TbNavCenter === updateLinkBackUrl");
        }
    }

    public final boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575e30b", new Object[]{this, context})).booleanValue();
        }
        try {
            String b2 = vg0.c().b("isSendLandingDataAvailable", "true");
            if (TextUtils.isEmpty(b2)) {
                b2 = cmp.b(context).c("flow_customs_in_local").get("isSendLandingDataAvailable");
            }
            return TextUtils.equals("true", b2);
        } catch (Exception e) {
            vp9.b("linkx", "TbNavCenter === isSendLandingDataAvailable === 异常" + e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.content.Context r11, tb.qg0 r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aht.e(android.content.Context, tb.qg0, java.lang.String, java.util.Map):void");
    }
}
