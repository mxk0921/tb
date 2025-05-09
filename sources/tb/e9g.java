package tb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.LoadingDialog;
import com.taobao.android.litecreator.sdk.framework.container.loading.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e9g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f18374a;
        public final /* synthetic */ com.taobao.android.litecreator.sdk.framework.container.loading.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ a.c d;

        /* compiled from: Taobao */
        /* renamed from: tb.e9g$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0912a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0912a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                e9g.a(aVar.f18374a, aVar.b, aVar.c, aVar.d);
            }
        }

        public a(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a aVar, String str, a.c cVar) {
            this.f18374a = fragmentActivity;
            this.b = aVar;
            this.c = str;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dnu.a(new RunnableC0912a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f18376a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                e9g.b(bVar.f18376a, bVar.b);
            }
        }

        public b(FragmentActivity fragmentActivity, String str) {
            this.f18376a = fragmentActivity;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dnu.a(new a());
            }
        }
    }

    static {
        t2o.a(511705607);
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a aVar, String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30566ee5", new Object[]{fragmentActivity, aVar, str, cVar});
        } else {
            g(fragmentActivity, aVar, str, cVar);
        }
    }

    public static /* synthetic */ void b(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6f11ab", new Object[]{fragmentActivity, str});
        } else {
            f(fragmentActivity, str);
        }
    }

    public static void c(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd5732", new Object[]{fragmentActivity});
        } else {
            d(fragmentActivity, "lc_common_loading_fragment");
        }
    }

    public static void d(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d87c", new Object[]{fragmentActivity, str});
        } else {
            trt.c(new b(fragmentActivity, str));
        }
    }

    public static boolean e(FragmentActivity fragmentActivity, String str) {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e72be31", new Object[]{fragmentActivity, str})).booleanValue();
        }
        if (fragmentActivity == null || (findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(str)) == null || !findFragmentByTag.isVisible()) {
            return false;
        }
        return true;
    }

    public static void f(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e785608f", new Object[]{fragmentActivity, str});
            return;
        }
        LoadingDialog loadingDialog = (LoadingDialog) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
        if (loadingDialog != null) {
            loadingDialog.dismissAllowingStateLoss();
        }
    }

    public static void g(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a aVar, String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1a966f", new Object[]{fragmentActivity, aVar, str, cVar});
            return;
        }
        LoadingDialog loadingDialog = (LoadingDialog) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog();
        }
        loadingDialog.s2(aVar);
        loadingDialog.r2(cVar);
        if (!loadingDialog.isAdded() && !fragmentActivity.isFinishing()) {
            loadingDialog.show(fragmentActivity.getSupportFragmentManager(), str);
        }
    }

    public static void h(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e688e86d", new Object[]{fragmentActivity});
        } else {
            j(fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a.g, "lc_common_loading_fragment", null);
        }
    }

    public static void i(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65941e09", new Object[]{fragmentActivity, aVar});
        } else {
            j(fragmentActivity, aVar, "lc_common_loading_fragment", null);
        }
    }

    public static void j(FragmentActivity fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a aVar, String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf60b6b2", new Object[]{fragmentActivity, aVar, str, cVar});
        } else {
            trt.h(new a(fragmentActivity, aVar, str, cVar));
        }
    }

    public static void k(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16fb0f7", new Object[]{fragmentActivity, str});
        } else {
            j(fragmentActivity, com.taobao.android.litecreator.sdk.framework.container.loading.a.g, str, null);
        }
    }
}
