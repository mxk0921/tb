package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f32542a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ CharSequence c;

        public a(boolean z, Context context, CharSequence charSequence) {
            this.f32542a = z;
            this.b = context;
            this.c = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!this.f32542a) {
                Context context = this.b;
                if (context instanceof Activity) {
                    try {
                        TBToast.makeText((Activity) context, this.c, 3000L).show();
                        return;
                    } catch (Throwable unused) {
                        Toast.makeText(this.b, this.c, 0).show();
                        return;
                    }
                }
            }
            Toast.makeText(this.b, this.c, 0).show();
        }
    }

    static {
        t2o.a(157286970);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else {
            qcv.e(new a(sh4.m(), context, charSequence));
        }
    }
}
