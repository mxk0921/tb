package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vmm extends BasePreInitManager<BrowserHybridWebView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PreInit";

    /* renamed from: a  reason: collision with root package name */
    public static vmm f30105a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30106a;

        public a(Context context) {
            this.f30106a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                vmm.a().setPreWeb(new BrowserHybridWebView(new MutableContextWrapper(this.f30106a)));
                v7t.d(vmm.TAG, "idle setPreWeb use time = " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(619708470);
    }

    public static vmm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmm) ipChange.ipc$dispatch("4018940f", new Object[0]);
        }
        if (f30105a == null) {
            synchronized (vmm.class) {
                try {
                    if (f30105a == null) {
                        f30105a = new vmm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30105a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f3f8bb", new Object[]{context});
        } else if (t.a(context, "enablePreinit")) {
            km2.a().c(new a(context));
        }
    }

    public static /* synthetic */ Object ipc$super(vmm vmmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/PreInitManager");
    }
}
