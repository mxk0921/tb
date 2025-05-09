package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pagev2.diff.MtbDiffCallback;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.h3j;
import tb.iln;
import tb.q3j;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltb/iln;", "reason", "", "", "Ltb/h3j;", "changeMap", "Ltb/xhv;", "invoke", "(Ltb/iln;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$4 extends Lambda implements u1a<iln, Map<String, ? extends h3j>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbBizProxyV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$4(MtbBizProxyV2 mtbBizProxyV2) {
        super(2);
        this.this$0 = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2$subscribeDataService$4 mtbBizProxyV2$subscribeDataService$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2$subscribeDataService$4");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, Map<String, ? extends h3j> map) {
        invoke2(ilnVar, (Map<String, h3j>) map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, Map<String, h3j> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615b5727", new Object[]{this, ilnVar, map});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(map, "changeMap");
        List<h3j> dataList = MtbBizProxyV2.E(this.this$0).getDataList();
        List<h3j> v = MtbBizProxyV2.H(this.this$0).v(map, MtbBizProxyV2.E(this.this$0).getDataList());
        MtbDiffCallback mtbDiffCallback = new MtbDiffCallback(dataList, v);
        TLog.loge("mtbMainLink", "dataChange 执行diffUpdateList");
        MtbBizProxyV2.D(this.this$0, v, mtbDiffCallback);
        q3j.INSTANCE.u(ilnVar);
    }
}
