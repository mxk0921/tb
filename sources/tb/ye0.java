package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ye0 implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f32009a;
    public final int b;

    static {
        t2o.a(993002001);
        t2o.a(993002013);
    }

    public ye0(ViewGroup viewGroup, int i) {
        this.f32009a = viewGroup;
        this.b = i;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            return;
        }
        int i = this.b;
        if (i < 0) {
            this.f32009a.addView(view);
        } else {
            this.f32009a.addView(view, i);
        }
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        } else {
            this.f32009a.removeView(view);
        }
    }

    public ye0(ViewGroup viewGroup) {
        this.f32009a = viewGroup;
        this.b = -1;
    }
}
