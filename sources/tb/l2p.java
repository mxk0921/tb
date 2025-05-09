package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l2p implements vfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f23071a;
    public final /* synthetic */ o2p b;

    public l2p(o2p o2pVar, ViewGroup viewGroup) {
        this.b = o2pVar;
        this.f23071a = viewGroup;
    }

    @Override // tb.vfw
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            return;
        }
        this.f23071a.addView(view);
        if (o2p.A2(this.b)) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
    }

    @Override // tb.vfw
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
        }
    }
}
