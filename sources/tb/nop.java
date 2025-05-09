package tb;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nop extends inp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean R;
    public final boolean S;

    static {
        t2o.a(766510395);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nop(Context context, ShopDataParser shopDataParser, boolean z, boolean z2, int i) {
        super(context, shopDataParser, i);
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.R = z;
        this.S = z2;
    }

    public static /* synthetic */ Object ipc$super(nop nopVar, String str, Object... objArr) {
        if (str.hashCode() == 882114001) {
            return new Boolean(super.F());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopFarmHeaderInfoNativeComponent");
    }

    @Override // tb.inp
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3493fdd1", new Object[]{this})).booleanValue();
        }
        if ((!this.S || (!this.R && !v())) && !super.F()) {
            return false;
        }
        return true;
    }

    @Override // tb.inp
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15712091", new Object[]{this})).booleanValue();
        }
        if (!this.S || (!this.R && !v())) {
            return true;
        }
        return false;
    }
}
