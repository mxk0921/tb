package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qk9 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlagShipContentComponentV3 f26795a;

    public qk9(FlagShipContentComponentV3 flagShipContentComponentV3) {
        this.f26795a = flagShipContentComponentV3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        String E = this.f26795a.J().E();
        if (E != null) {
            khu.h(this.f26795a.n(), E);
        }
    }
}
