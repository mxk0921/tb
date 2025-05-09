package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f23045a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23046a;
        public final /* synthetic */ CharSequence b;

        public a(Context context, CharSequence charSequence) {
            this.f23046a = context;
            this.b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (l0u.a() == null) {
                l0u.b(Toast.makeText(this.f23046a.getApplicationContext(), this.b, 0));
            } else {
                l0u.a().setText(this.b);
            }
            l0u.a().show();
        }
    }

    static {
        t2o.a(503317437);
    }

    public static /* synthetic */ Toast a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("4776e852", new Object[0]);
        }
        return f23045a;
    }

    public static /* synthetic */ Toast b(Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("b3a5995d", new Object[]{toast});
        }
        f23045a = toast;
        return toast;
    }

    public static void c(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (!TextUtils.isEmpty(charSequence)) {
            nwv.z0(new a(context, charSequence), true);
        }
    }
}
