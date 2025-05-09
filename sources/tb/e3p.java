package tb;

import android.view.animation.ScaleAnimation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e3p implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o5n f18246a;
    public final /* synthetic */ c3p b;

    public e3p(c3p c3pVar, o5n o5nVar) {
        this.b = c3pVar;
        this.f18246a = o5nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.f18246a.s && c3p.C2(this.b).getVisibility() != 8) {
            c3p.D2(this.b).setVisibility(0);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
            scaleAnimation.setDuration(150L);
            c3p.D2(this.b).startAnimation(scaleAnimation);
        }
    }
}
