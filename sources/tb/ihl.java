package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ihl implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jhl f21314a;

    public ihl(jhl jhlVar) {
        this.f21314a = jhlVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (jhl.a(this.f21314a).f == 3) {
            jhl.b(this.f21314a, "p2ff 播放器没有被使用，销毁");
            if (jhl.c(this.f21314a).getParent() instanceof ViewGroup) {
                ((ViewGroup) jhl.c(this.f21314a).getParent()).removeView(jhl.c(this.f21314a));
            }
            jhl.c(this.f21314a).removeAllViews();
            jhl.d(this.f21314a).i(0L);
        }
    }
}
