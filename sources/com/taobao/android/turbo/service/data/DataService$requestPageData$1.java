package com.taobao.android.turbo.service.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.lrs;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/location/common/TBLocationDTO;", "location", "Ltb/xhv;", "invoke", "(Lcom/taobao/location/common/TBLocationDTO;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DataService$requestPageData$1 extends Lambda implements g1a<TBLocationDTO, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ lrs $tabParams;
    public final /* synthetic */ DataService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataService$requestPageData$1(DataService dataService, lrs lrsVar) {
        super(1);
        this.this$0 = dataService;
        this.$tabParams = lrsVar;
    }

    public static /* synthetic */ Object ipc$super(DataService$requestPageData$1 dataService$requestPageData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/data/DataService$requestPageData$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(TBLocationDTO tBLocationDTO) {
        invoke2(tBLocationDTO);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58eb7d8f", new Object[]{this, tBLocationDTO});
        } else {
            DataService.L1(this.this$0, this.$tabParams, tBLocationDTO);
        }
    }
}
