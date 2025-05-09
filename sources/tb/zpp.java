package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zpp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopNewLiveLoftView f32936a;

    public zpp(ShopNewLiveLoftView shopNewLiveLoftView) {
        this.f32936a = shopNewLiveLoftView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ShopNewLiveLoftView.d(this.f32936a);
        this.f32936a.play();
    }
}
