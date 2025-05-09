package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dia implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GoodsLiveStateMutitabView f17841a;
    public final /* synthetic */ GoodsView b;

    public dia(GoodsView goodsView, GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        this.b = goodsView;
        this.f17841a = goodsLiveStateMutitabView;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f17841a != null) {
            this.b.f22944a.T.d();
            mug.c(GoodsView.j(this.b));
            hha.c("GoodsView", "realShow | showPackage.");
            this.f17841a.showPackage();
        }
    }
}
