package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltMnnBucketManager$Companion$instance$2 extends Lambda implements d1a<PltMnnBucketManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PltMnnBucketManager$Companion$instance$2 INSTANCE = new PltMnnBucketManager$Companion$instance$2();

    public PltMnnBucketManager$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(PltMnnBucketManager$Companion$instance$2 pltMnnBucketManager$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/PltMnnBucketManager$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final PltMnnBucketManager invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PltMnnBucketManager) ipChange.ipc$dispatch("426ccc89", new Object[]{this}) : new PltMnnBucketManager(null);
    }
}
