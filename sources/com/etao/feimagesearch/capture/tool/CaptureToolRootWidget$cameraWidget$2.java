package com.etao.feimagesearch.capture.tool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.c2a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class CaptureToolRootWidget$cameraWidget$2 extends FunctionReferenceImpl implements c2a<byte[], Integer, Integer, Integer, Boolean, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CaptureToolRootWidget$cameraWidget$2(Object obj) {
        super(6, obj, CaptureToolRootWidget.class, "onFrameUpdate", "onFrameUpdate([BIIIZI)V", 0);
    }

    public static /* synthetic */ Object ipc$super(CaptureToolRootWidget$cameraWidget$2 captureToolRootWidget$cameraWidget$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/CaptureToolRootWidget$cameraWidget$2");
    }

    @Override // tb.c2a
    public /* bridge */ /* synthetic */ xhv invoke(byte[] bArr, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4) {
        invoke(bArr, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), num4.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15daf24c", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else {
            CaptureToolRootWidget.j0((CaptureToolRootWidget) this.receiver, bArr, i, i2, i3, z, i4);
        }
    }
}
