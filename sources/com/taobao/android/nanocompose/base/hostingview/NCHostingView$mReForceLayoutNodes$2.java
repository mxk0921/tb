package com.taobao.android.nanocompose.base.hostingview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.waz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCHostingView$mReForceLayoutNodes$2 extends Lambda implements d1a<Set<waz>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NCHostingView$mReForceLayoutNodes$2 INSTANCE = new NCHostingView$mReForceLayoutNodes$2();

    public NCHostingView$mReForceLayoutNodes$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(NCHostingView$mReForceLayoutNodes$2 nCHostingView$mReForceLayoutNodes$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/base/hostingview/NCHostingView$mReForceLayoutNodes$2");
    }

    @Override // tb.d1a
    public final Set<waz> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("5d4f7eae", new Object[]{this}) : new LinkedHashSet();
    }
}
