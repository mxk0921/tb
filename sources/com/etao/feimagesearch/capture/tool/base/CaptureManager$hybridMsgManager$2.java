package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.n9b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureManager$hybridMsgManager$2 extends Lambda implements d1a<n9b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CaptureManager$hybridMsgManager$2 INSTANCE = new CaptureManager$hybridMsgManager$2();

    public CaptureManager$hybridMsgManager$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(CaptureManager$hybridMsgManager$2 captureManager$hybridMsgManager$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/base/CaptureManager$hybridMsgManager$2");
    }

    @Override // tb.d1a
    public final n9b invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n9b) ipChange.ipc$dispatch("92b6d109", new Object[]{this}) : new n9b();
    }
}
