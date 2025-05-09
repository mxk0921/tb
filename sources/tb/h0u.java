package tb;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CharSequence f20352a;
        public final /* synthetic */ Context b;

        public a(CharSequence charSequence, Context context) {
            this.f20352a = charSequence;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!h0u.a(this.f20352a)) {
                    z4v.a(this.b, this.f20352a);
                }
            } catch (Throwable unused) {
                z4v.a(this.b, this.f20352a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                hav.d("UToast", "megaToast show error");
            }
        }
    }

    static {
        t2o.a(713031929);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad6cb71f", new Object[]{charSequence})).booleanValue();
        }
        return b(charSequence);
    }

    public static void c(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (charSequence == null || charSequence.length() == 0) {
            hav.d("ToastUtil", "toast content is EMPTY!");
        } else if (uel.l("useMegaUnifyToast", true)) {
            qcv.e(new a(charSequence, context));
        } else {
            z4v.a(context, charSequence);
        }
    }

    public static boolean b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f76e5f", new Object[]{charSequence})).booleanValue();
        }
        if (!(charSequence instanceof String)) {
            return false;
        }
        String str = (String) charSequence;
        hji a2 = hji.a();
        if (a2 == null) {
            hav.d("UToast", "megaToast instance is null");
            return false;
        }
        g0u a3 = g0u.Companion.a(str);
        if (a3 == null) {
            hav.d("UToast", "toastShowParams is null");
            return false;
        }
        a3.b = 3000.0d;
        a2.c(a3, new b());
        return true;
    }
}
