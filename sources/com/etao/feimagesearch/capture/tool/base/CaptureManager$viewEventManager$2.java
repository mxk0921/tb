package com.etao.feimagesearch.capture.tool.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.r73;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureManager$viewEventManager$2 extends Lambda implements d1a<r73> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CaptureManager$viewEventManager$2 INSTANCE = new CaptureManager$viewEventManager$2();

    public CaptureManager$viewEventManager$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(CaptureManager$viewEventManager$2 captureManager$viewEventManager$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/base/CaptureManager$viewEventManager$2");
    }

    @Override // tb.d1a
    public final r73 invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r73) ipChange.ipc$dispatch("413efd07", new Object[]{this}) : new r73();
    }
}
