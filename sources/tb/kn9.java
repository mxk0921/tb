package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.ShopFloatContainer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kn9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopFloatContainer f22777a;
    public final /* synthetic */ View b;

    public kn9(ShopFloatContainer shopFloatContainer, View view) {
        this.f22777a = shopFloatContainer;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f22777a.setTranslationX(((ViewGroup) this.b).getWidth() - this.f22777a.getWidth());
        }
    }
}
