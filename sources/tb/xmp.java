package tb;

import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xmp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Shop2023BottomBarNativeComponent f31476a;

    public xmp(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        this.f31476a = shop2023BottomBarNativeComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f31476a.y(fps.Companion.a());
        }
    }
}
