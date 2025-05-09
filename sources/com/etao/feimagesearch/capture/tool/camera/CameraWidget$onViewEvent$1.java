package com.etao.feimagesearch.capture.tool.camera;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.clb;
import tb.mzu;
import tb.p73;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CameraWidget$onViewEvent$1 extends Lambda implements w1a<Bitmap, Boolean, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Object $data;
    public final /* synthetic */ CameraWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraWidget$onViewEvent$1(CameraWidget cameraWidget, Object obj) {
        super(3);
        this.this$0 = cameraWidget;
        this.$data = obj;
    }

    public static /* synthetic */ Object ipc$super(CameraWidget$onViewEvent$1 cameraWidget$onViewEvent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/CameraWidget$onViewEvent$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(Bitmap bitmap, Boolean bool, Boolean bool2) {
        invoke(bitmap, bool.booleanValue(), bool2.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2600accf", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        mzu.n(p73.f25916a, "onPictureTake", 19999, new String[0]);
        if (!this.this$0.E().isFinishing() && bitmap != null) {
            ((clb) this.$data).i(bitmap, z, z2);
        }
    }
}
