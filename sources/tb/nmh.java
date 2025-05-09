package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.lowprice.LowPriceRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nmh extends f6j<LowPriceRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261809);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmh(LowPriceRequestParams lowPriceRequestParams) {
        super(lowPriceRequestParams);
        ckf.h(lowPriceRequestParams, "lowPriceRequestParams");
    }

    public static /* synthetic */ Object ipc$super(nmh nmhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoApiRequestClient");
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return ((LowPriceRequestParams) this.f19050a).getMApiName();
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return ((LowPriceRequestParams) this.f19050a).getMApiVersion();
    }
}
