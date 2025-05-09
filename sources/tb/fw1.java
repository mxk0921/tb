package tb;

import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fw1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19567a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ jw1 c;

    public fw1(jw1 jw1Var, int i, TextView textView) {
        this.c = jw1Var;
        this.f19567a = i;
        this.b = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int measuredWidth = this.f19567a + this.b.getMeasuredWidth();
        this.b.animate().translationX(-measuredWidth).translationY(-((int) (Math.tan(3.0d) * measuredWidth))).setStartDelay(1300L).setDuration(150L).start();
    }
}
