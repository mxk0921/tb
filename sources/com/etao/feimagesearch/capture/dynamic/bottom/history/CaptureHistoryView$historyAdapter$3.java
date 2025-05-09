package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.cxc;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureHistoryView$historyAdapter$3 extends Lambda implements g1a<cxc, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureHistoryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView$historyAdapter$3(CaptureHistoryView captureHistoryView) {
        super(1);
        this.this$0 = captureHistoryView;
    }

    public static /* synthetic */ Object ipc$super(CaptureHistoryView$historyAdapter$3 captureHistoryView$historyAdapter$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$historyAdapter$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(cxc cxcVar) {
        invoke2(cxcVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(cxc cxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddddada", new Object[]{this, cxcVar});
            return;
        }
        ckf.g(cxcVar, AdvanceSetting.NETWORK_TYPE);
        CaptureHistoryView.R(this.this$0).add(cxcVar);
    }
}
