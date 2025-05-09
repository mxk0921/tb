package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.gvk;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "sessionId", "Ltb/xhv;", "onSuccess", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BundleSplitUtil$checkMsgBundleReady$task$1<TResult> implements gvk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BundleSplitUtil$checkMsgBundleReady$task$1 INSTANCE = new BundleSplitUtil$checkMsgBundleReady$task$1();

    public final void onSuccess(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
        }
    }
}
