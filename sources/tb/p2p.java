package tb;

import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p2p implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o2p f25842a;

    public p2p(o2p o2pVar) {
        this.f25842a = o2pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (o2p.A2(this.f25842a)) {
            o2p.D2(this.f25842a).setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        } else {
            ViewCompat.setBackground(o2p.D2(this.f25842a), null);
        }
    }
}
