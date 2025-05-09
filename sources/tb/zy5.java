package tb;

import android.view.View;
import android.view.animation.AnimationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zy5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f33094a;
    public final /* synthetic */ AnimationSet b;
    public final /* synthetic */ az5 c;

    public zy5(az5 az5Var, View view, AnimationSet animationSet) {
        this.f33094a = view;
        this.b = animationSet;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f33094a.startAnimation(this.b);
        }
    }
}
