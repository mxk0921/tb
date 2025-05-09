package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ymp extends l77 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ ShopDataParser i(ymp ympVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("6bb585eb", new Object[]{ympVar});
        }
        throw null;
    }

    public static /* synthetic */ Object ipc$super(ymp ympVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BottomBarTemplate$createViewCallback$1");
    }
}
