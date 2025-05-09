package com.etao.feimagesearch.capture.controller;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.caa;
import tb.ckf;
import tb.l53;
import tb.mno;
import tb.mxo;
import tb.p3e;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureV2Controller$updateScreenshotSearchFloatBarState$1 extends Lambda implements u1a<Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ p3e $uiHolder;
    public final /* synthetic */ CaptureV2Controller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureV2Controller$updateScreenshotSearchFloatBarState$1(p3e p3eVar, CaptureV2Controller captureV2Controller) {
        super(2);
        this.$uiHolder = p3eVar;
        this.this$0 = captureV2Controller;
    }

    public static /* synthetic */ Object ipc$super(CaptureV2Controller$updateScreenshotSearchFloatBarState$1 captureV2Controller$updateScreenshotSearchFloatBarState$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/controller/CaptureV2Controller$updateScreenshotSearchFloatBarState$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 1) {
            this.$uiHolder.t(new mxo(true));
        } else if (i == 2) {
            this.$uiHolder.t(new mxo(false));
        } else if (i == 3) {
            this.$uiHolder.t(new mxo(false));
        } else if (i == 4) {
            this.$uiHolder.t(new mxo(i2 == 1));
            if (i2 != 1 && CaptureV2Controller.d(this.this$0)) {
                CaptureV2Controller.f(this.this$0, false);
                if (ckf.b("true", mno.c(caa.c(), l53.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT))) {
                    CaptureV2Controller.a(this.this$0);
                }
            }
        }
    }
}
