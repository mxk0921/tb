package tb;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class si2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509567);
    }

    public static final /* synthetic */ int a(si2 si2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cde537c", new Object[]{si2Var})).intValue();
        }
        throw null;
    }

    public static final /* synthetic */ ShopDataParser b(si2 si2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("1c955795", new Object[]{si2Var});
        }
        throw null;
    }

    public static final /* synthetic */ u1a c(si2 si2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("3d3b29f5", new Object[]{si2Var});
        }
        throw null;
    }

    public static final /* synthetic */ void d(si2 si2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90192b58", new Object[]{si2Var, new Integer(i)});
            return;
        }
        throw null;
    }
}
