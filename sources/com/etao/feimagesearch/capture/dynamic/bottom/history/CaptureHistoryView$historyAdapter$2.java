package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.scancode.history.object.ScanDo;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.v53;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureHistoryView$historyAdapter$2 extends Lambda implements g1a<ScanDo, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureHistoryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView$historyAdapter$2(CaptureHistoryView captureHistoryView) {
        super(1);
        this.this$0 = captureHistoryView;
    }

    public static /* synthetic */ Object ipc$super(CaptureHistoryView$historyAdapter$2 captureHistoryView$historyAdapter$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryView$historyAdapter$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ScanDo scanDo) {
        invoke2(scanDo);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6702988", new Object[]{this, scanDo});
            return;
        }
        ckf.g(scanDo, AdvanceSetting.NETWORK_TYPE);
        v53 v53Var = (v53) CaptureHistoryView.V(this.this$0);
        if (v53Var != null) {
            v53Var.O(scanDo);
        }
    }
}
