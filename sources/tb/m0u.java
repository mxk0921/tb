package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23703a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f23703a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yv6.b(this.f23703a)) {
                m0u.b(this.f23703a, this.b, 1);
            }
        }
    }

    static {
        t2o.a(442499278);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a88de1", new Object[]{context, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new a(context, str));
        }
    }

    public static void b(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b6f401", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        try {
            TBToast.makeText(context, charSequence, i).show();
        } catch (Throwable unused) {
            Toast.makeText(context, charSequence, i).show();
        }
    }
}
