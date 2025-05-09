package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y4v implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f31852a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ CharSequence c;

    public y4v(boolean z, Context context, CharSequence charSequence) {
        this.f31852a = z;
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
        if (!this.f31852a) {
            Context context = this.b;
            if (context instanceof Activity) {
                try {
                    TBToast.makeText((Activity) context, this.c, 3000L).show();
                    shv.c("UToast", "use TBToast");
                    return;
                } catch (Throwable th) {
                    shv.c("UToast", "TBActivityToast has exception: " + th.getMessage());
                    Toast.makeText(this.b, this.c, 0).show();
                    return;
                }
            }
        }
        Toast.makeText(this.b, this.c, 0).show();
    }
}
