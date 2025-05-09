package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.qun;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$5 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbBizProxyV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$5(MtbBizProxyV2 mtbBizProxyV2) {
        super(1);
        this.this$0 = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2$subscribeDataService$5 mtbBizProxyV2$subscribeDataService$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2$subscribeDataService$5");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        TBSwipeRefreshLayout a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        qun I = MtbBizProxyV2.I(this.this$0);
        if (I != null && (a2 = I.a()) != null) {
            a2.setRefreshing(false);
        }
    }
}
