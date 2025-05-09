package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImgChannelDetectManager$Companion$instance$2 extends Lambda implements d1a<ImgChannelDetectManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImgChannelDetectManager$Companion$instance$2 INSTANCE = new ImgChannelDetectManager$Companion$instance$2();

    public ImgChannelDetectManager$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ImgChannelDetectManager$Companion$instance$2 imgChannelDetectManager$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/irp/ImgChannelDetectManager$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ImgChannelDetectManager invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImgChannelDetectManager) ipChange.ipc$dispatch("99eec088", new Object[]{this}) : new ImgChannelDetectManager(null);
    }
}
