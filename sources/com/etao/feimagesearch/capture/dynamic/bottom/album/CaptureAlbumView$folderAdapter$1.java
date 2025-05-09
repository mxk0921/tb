package com.etao.feimagesearch.capture.dynamic.bottom.album;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumView$folderAdapter$1 extends Lambda implements g1a<zs9, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureAlbumView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView$folderAdapter$1(CaptureAlbumView captureAlbumView) {
        super(1);
        this.this$0 = captureAlbumView;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumView$folderAdapter$1 captureAlbumView$folderAdapter$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$folderAdapter$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(zs9 zs9Var) {
        invoke2(zs9Var);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27eba92", new Object[]{this, zs9Var});
            return;
        }
        ckf.g(zs9Var, AdvanceSetting.NETWORK_TYPE);
        CaptureAlbumView.c0(this.this$0, zs9Var);
    }
}
