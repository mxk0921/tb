package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AutoDetectExtraInfoCache$Companion$instance$2 extends Lambda implements d1a<AutoDetectExtraInfoCache> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AutoDetectExtraInfoCache$Companion$instance$2 INSTANCE = new AutoDetectExtraInfoCache$Companion$instance$2();

    public AutoDetectExtraInfoCache$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(AutoDetectExtraInfoCache$Companion$instance$2 autoDetectExtraInfoCache$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/AutoDetectExtraInfoCache$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final AutoDetectExtraInfoCache invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AutoDetectExtraInfoCache) ipChange.ipc$dispatch("957dcc49", new Object[]{this}) : new AutoDetectExtraInfoCache(null);
    }
}
