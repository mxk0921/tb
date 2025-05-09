package tb;

import android.view.View;
import com.alibaba.triver.triver_shop.shop2023.FlagShipV25;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wiy implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlagShipV25 f30726a;

    public wiy(FlagShipV25 flagShipV25) {
        this.f30726a = flagShipV25;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (FlagShipV25.d1(this.f30726a)) {
            FlagShipV25.i1(this.f30726a).finish();
        }
    }
}
