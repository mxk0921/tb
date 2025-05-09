package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.lg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureRainbowManager$getCapturePageNewStyleConfig$1 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CaptureRainbowManager$getCapturePageNewStyleConfig$1 INSTANCE = new CaptureRainbowManager$getCapturePageNewStyleConfig$1();

    public CaptureRainbowManager$getCapturePageNewStyleConfig$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(CaptureRainbowManager$getCapturePageNewStyleConfig$1 captureRainbowManager$getCapturePageNewStyleConfig$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/base/CaptureRainbowManager$getCapturePageNewStyleConfig$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("14feca66", new Object[]{this}) : Integer.valueOf(lg4.R1());
    }
}
