package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27459a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    static {
        t2o.a(573571097);
    }

    public rln(BaseMmAdModel baseMmAdModel) {
        this.f27459a = baseMmAdModel.benefitType;
        this.b = baseMmAdModel.benefitId;
        this.c = baseMmAdModel.benefitQuerySource;
        this.d = baseMmAdModel.benefitSource;
        this.e = baseMmAdModel.benefitSupplier;
        this.f = baseMmAdModel.benefitStrategyCode;
        this.g = baseMmAdModel.benefitSafeCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ReceiveCouponModel{benefitType='" + this.f27459a + "', benefitId='" + this.b + "', benefitQuerySource='" + this.c + "', benefitSource='" + this.d + "', benefitSupplier='" + this.e + "', benefitStrategyCode='" + this.f + "', asac='" + this.g + "'}";
    }
}
