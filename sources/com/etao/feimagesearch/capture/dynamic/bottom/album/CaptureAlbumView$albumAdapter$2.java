package com.etao.feimagesearch.capture.dynamic.bottom.album;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.d43;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumView$albumAdapter$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureAlbumView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView$albumAdapter$2(CaptureAlbumView captureAlbumView) {
        super(0);
        this.this$0 = captureAlbumView;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumView$albumAdapter$2 captureAlbumView$albumAdapter$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$albumAdapter$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        d43 d43Var = (d43) CaptureAlbumView.W(this.this$0);
        if (d43Var != null) {
            d43Var.K(true);
        }
    }
}
