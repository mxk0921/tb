package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MNNManager$Companion$instance$2 extends Lambda implements d1a<MNNManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MNNManager$Companion$instance$2 INSTANCE = new MNNManager$Companion$instance$2();

    public MNNManager$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MNNManager$Companion$instance$2 mNNManager$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNManager$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final MNNManager invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MNNManager) ipChange.ipc$dispatch("c9aae9e6", new Object[]{this}) : new MNNManager(null);
    }
}
