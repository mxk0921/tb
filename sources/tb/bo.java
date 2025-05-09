package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Handler> f16500a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16501a;
        public final /* synthetic */ CharSequence b;
        public final /* synthetic */ int c;

        public a(Context context, CharSequence charSequence, int i) {
            this.f16501a = context;
            this.b = charSequence;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f16501a, this.b, this.c).show();
            }
        }
    }

    static {
        t2o.a(79691969);
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("23d6933e", new Object[0]);
        }
        WeakReference<Handler> weakReference = f16500a;
        if (weakReference == null) {
            return b();
        }
        Handler handler = weakReference.get();
        if (handler == null) {
            return b();
        }
        return handler;
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ccadbd57", new Object[0]);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        f16500a = new WeakReference<>(handler);
        return handler;
    }

    public static void c(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e7a88", new Object[]{context, charSequence, new Integer(i)});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Toast.makeText(context, charSequence, i).show();
        } else {
            a().post(new a(context, charSequence, i));
        }
    }
}
