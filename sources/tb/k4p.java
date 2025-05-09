package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k4p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j4p f22398a;

    public k4p(j4p j4pVar) {
        this.f22398a = j4pVar;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
        } else {
            ((ViewGroup) this.f22398a.getActivity().getWindow().getDecorView()).addView(view);
        }
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        } else {
            igw.a(view);
        }
    }
}
