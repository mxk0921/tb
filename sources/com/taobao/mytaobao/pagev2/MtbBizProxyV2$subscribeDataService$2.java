package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pagev2.diff.MtbDiffCallback;
import com.taobao.tao.log.TLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.h3j;
import tb.iln;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltb/iln;", "reason", "", "", "moduleNameList", "Ltb/xhv;", "invoke", "(Ltb/iln;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$2 extends Lambda implements u1a<iln, List<? extends String>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbBizProxyV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$2(MtbBizProxyV2 mtbBizProxyV2) {
        super(2);
        this.this$0 = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2$subscribeDataService$2 mtbBizProxyV2$subscribeDataService$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2$subscribeDataService$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, List<? extends String> list) {
        invoke2(ilnVar, (List<String>) list);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a314858f", new Object[]{this, ilnVar, list});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(list, "moduleNameList");
        List<h3j> dataList = MtbBizProxyV2.E(this.this$0).getDataList();
        List<h3j> x = MtbBizProxyV2.H(this.this$0).x(ilnVar, list, MtbBizProxyV2.E(this.this$0).P());
        MtbDiffCallback mtbDiffCallback = new MtbDiffCallback(dataList, x);
        TLog.loge("mtbMainLink", "layoutChange 执行diffUpdateList");
        MtbBizProxyV2.D(this.this$0, x, mtbDiffCallback);
    }
}
