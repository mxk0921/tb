package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.multiprocess.PreStartup;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class gvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f20257a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20258a;

        public a(Context context) {
            this.f20258a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                r9u.b("preStartup");
                PreStartup.startup(this.f20258a);
                r9u.d();
            } catch (Exception e) {
                v7t.d("PrestartUpProxy", "startup failed: " + e.getMessage());
            }
        }
    }

    static {
        t2o.a(989856394);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b59b82", new Object[]{context});
        } else if (context != null && f20257a.compareAndSet(false, true)) {
            mrt.a().execute(new a(context));
        }
    }
}
