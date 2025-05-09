package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ne0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24672a;
    public final String b;

    static {
        t2o.a(573571093);
    }

    public ne0(BaseMmAdModel baseMmAdModel) {
        this.f24672a = baseMmAdModel.cardSkuId;
        this.b = baseMmAdModel.cardItemId;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AddCartModel{cardSkuId='" + this.f24672a + "', cardItemId='" + this.b + "'}";
    }
}
