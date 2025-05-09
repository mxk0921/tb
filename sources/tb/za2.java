package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.AccessibilityWVPlugin;
import com.taobao.tao.topmultitab.service.login.ILoginService;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class za2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6d f32641a;

        public a(z6d z6dVar) {
            this.f32641a = z6dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                za2.a(this.f32641a);
            }
        }
    }

    static {
        t2o.a(729809197);
    }

    public static /* synthetic */ void a(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87698edf", new Object[]{z6dVar});
        } else {
            d(z6dVar);
        }
    }

    public static void c(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933f7232", new Object[]{z6dVar});
            return;
        }
        boolean k = vxl.b().k();
        bqa.d("BinderMethodAsynchronizer", "!enableAsyncBinderMethodByCreateView");
        if (!k) {
            d(z6dVar);
        } else {
            m5a.a().f(new a(z6dVar));
        }
    }

    public static void d(z6d z6dVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9b3ac4", new Object[]{z6dVar});
            return;
        }
        Activity k1 = z6dVar.k1();
        StringBuilder sb = new StringBuilder("binderTransactionMethod pageProvider is null ? ");
        if (k1 == null) {
            z = true;
        }
        sb.append(z);
        bqa.d("BinderMethodAsynchronizer", sb.toString());
        if (k1 != null) {
            phg.m(Constants.Name.ACCESSIBLE);
            b(z6dVar);
            phg.l(Constants.Name.ACCESSIBLE);
            phg.m("asyncRegisterBroadcast");
            z6dVar.q1().a().a();
            phg.l("asyncRegisterBroadcast");
            phg.m("asyncLoginManager");
            ILoginService iLoginService = (ILoginService) c4b.i().h(ILoginService.class);
            if (iLoginService != null) {
                iLoginService.handleInitLogin();
            }
            phg.l("asyncLoginManager");
        }
    }

    public static void b(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b938367c", new Object[]{z6dVar});
            return;
        }
        try {
            if (u60.a(z6dVar.k1())) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x-a-o", "VoiceOverOpen");
                bqa.d("BinderMethodAsynchronizer", "isAccessibilityEnabled true");
            } else {
                UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("x-a-o");
                bqa.d("BinderMethodAsynchronizer", "isAccessibilityEnabled false");
            }
            fsw.h("ScreenReaderOpen", AccessibilityWVPlugin.class);
        } catch (Throwable th) {
            bqa.d("BinderMethodAsynchronizer", "register AccessibilityWVPlugin exception" + th.getMessage());
        }
        try {
            if (u60.d(z6dVar.k1())) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("x-a-t", "TalkBackOpen");
                bqa.d("BinderMethodAsynchronizer", "isTalkBackOpen true");
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("x-a-t");
            bqa.d("BinderMethodAsynchronizer", "isTalkBackOpen false");
        } catch (Throwable th2) {
            bqa.c("BinderMethodAsynchronizer", th2, new String[0]);
        }
    }
}
