package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pagev2.diff.MtbDxDownloadDiffCallback;
import com.taobao.tao.log.TLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.h3j;
import tb.uuu;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "dxNameList", "Ltb/xhv;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2$initData$1 extends Lambda implements g1a<List<? extends String>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbBizProxyV2 this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public a(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<h3j> dataList = MtbBizProxyV2.E(MtbBizProxyV2$initData$1.this.this$0).getDataList();
            MtbDxDownloadDiffCallback mtbDxDownloadDiffCallback = new MtbDxDownloadDiffCallback(dataList, this.b);
            TLog.loge("mtbMainLink", "dx download finish 执行diffUpdateList");
            MtbBizProxyV2.D(MtbBizProxyV2$initData$1.this.this$0, dataList, mtbDxDownloadDiffCallback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$initData$1(MtbBizProxyV2 mtbBizProxyV2) {
        super(1);
        this.this$0 = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2$initData$1 mtbBizProxyV2$initData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2$initData$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(List<? extends String> list) {
        invoke2((List<String>) list);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166b7bf0", new Object[]{this, list});
            return;
        }
        ckf.h(list, "dxNameList");
        uuu.a(new a(list));
    }
}
