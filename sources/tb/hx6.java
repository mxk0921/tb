package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hx6 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Default2023Shop f20939a;

    public hx6(Default2023Shop default2023Shop) {
        this.f20939a = default2023Shop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.f20939a.c()) {
            Default2023Shop.o1(this.f20939a).finish();
        }
    }
}
