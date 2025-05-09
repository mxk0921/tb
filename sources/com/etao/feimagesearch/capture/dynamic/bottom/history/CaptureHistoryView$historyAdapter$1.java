package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.v53;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureHistoryView$historyAdapter$1 extends Lambda implements g1a<AuctionItemVO, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureHistoryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView$historyAdapter$1(CaptureHistoryView captureHistoryView) {
        super(1);
        this.this$0 = captureHistoryView;
    }

    public static /* synthetic */ Object ipc$super(CaptureHistoryView$historyAdapter$1 captureHistoryView$historyAdapter$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$historyAdapter$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(AuctionItemVO auctionItemVO) {
        invoke2(auctionItemVO);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f434289", new Object[]{this, auctionItemVO});
            return;
        }
        ckf.g(auctionItemVO, AdvanceSetting.NETWORK_TYPE);
        v53 v53Var = (v53) CaptureHistoryView.V(this.this$0);
        if (v53Var != null) {
            v53Var.P(auctionItemVO);
        }
    }
}
