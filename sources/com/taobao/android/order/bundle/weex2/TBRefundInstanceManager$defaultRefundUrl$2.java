package com.taobao.android.order.bundle.weex2;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TBRefundInstanceManager$defaultRefundUrl$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBRefundInstanceManager$defaultRefundUrl$2 INSTANCE = new TBRefundInstanceManager$defaultRefundUrl$2();

    public TBRefundInstanceManager$defaultRefundUrl$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TBRefundInstanceManager$defaultRefundUrl$2 tBRefundInstanceManager$defaultRefundUrl$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/weex2/TBRefundInstanceManager$defaultRefundUrl$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&wx_opaque=0" : "https://meta.wapa.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom&wx_opaque=0";
    }
}
