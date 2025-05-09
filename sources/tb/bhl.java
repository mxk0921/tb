package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.component.OverseaShop;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bhl implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TUrlImageView f16393a;
    public final /* synthetic */ OverseaShop b;

    public bhl(TUrlImageView tUrlImageView, OverseaShop overseaShop) {
        this.f16393a = tUrlImageView;
        this.b = overseaShop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        Context context = this.f16393a.getContext();
        ckf.f(context, "context");
        khu.h(context, this.b.J().y1());
    }
}
