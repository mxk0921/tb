package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p15 implements n7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f25807a;

    static {
        t2o.a(416284693);
        t2o.a(85983284);
    }

    @Override // tb.n7x
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e8959d9", new Object[]{this, context});
        }
        ProgressBar progressBar = new ProgressBar(context);
        this.f25807a = progressBar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    @Override // tb.n7x
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cf0564", new Object[]{this, new Boolean(z)});
        } else {
            this.f25807a.setVisibility(8);
        }
    }
}
