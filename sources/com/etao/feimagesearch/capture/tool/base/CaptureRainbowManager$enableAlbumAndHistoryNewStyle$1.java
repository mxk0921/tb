package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.lg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1 INSTANCE = new CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1();

    public CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1 captureRainbowManager$enableAlbumAndHistoryNewStyle$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/base/CaptureRainbowManager$enableAlbumAndHistoryNewStyle$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Boolean invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6a963cbc", new Object[]{this}) : Boolean.valueOf(lg4.a());
    }
}
