package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q2p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f26467a;
    public final /* synthetic */ o2p b;

    public q2p(o2p o2pVar, ViewGroup viewGroup) {
        this.b = o2pVar;
        this.f26467a = viewGroup;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            return;
        }
        this.f26467a.addView(view, 0);
        this.b.l3();
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        }
    }
}
