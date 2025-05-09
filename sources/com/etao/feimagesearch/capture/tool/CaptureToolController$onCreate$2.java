package com.etao.feimagesearch.capture.tool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolController$onCreate$2 extends Lambda implements g1a<CaptureToolRootWidget, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureToolController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureToolController$onCreate$2(CaptureToolController captureToolController) {
        super(1);
        this.this$0 = captureToolController;
    }

    public static /* synthetic */ Object ipc$super(CaptureToolController$onCreate$2 captureToolController$onCreate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/CaptureToolController$onCreate$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(CaptureToolRootWidget captureToolRootWidget) {
        invoke2(captureToolRootWidget);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CaptureToolRootWidget captureToolRootWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4689e89d", new Object[]{this, captureToolRootWidget});
            return;
        }
        ckf.g(captureToolRootWidget, AdvanceSetting.NETWORK_TYPE);
        CaptureToolController.c(this.this$0, captureToolRootWidget);
        int b = CaptureToolController.b(this.this$0);
        if (b == 2) {
            captureToolRootWidget.M();
        } else if (b == 3) {
            captureToolRootWidget.L();
        } else if (b == 4) {
            captureToolRootWidget.O();
        } else if (b == 5) {
            captureToolRootWidget.K();
        }
    }
}
