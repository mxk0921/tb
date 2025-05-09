package com.taobao.android.hudong;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.WebStartParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/themis/external/embed/WebStartParams;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class TBHDActivity$webStartParams$2 extends Lambda implements d1a<WebStartParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBHDActivity$webStartParams$2 INSTANCE = new TBHDActivity$webStartParams$2();

    public TBHDActivity$webStartParams$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TBHDActivity$webStartParams$2 tBHDActivity$webStartParams$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/TBHDActivity$webStartParams$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final WebStartParams invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebStartParams) ipChange.ipc$dispatch("bcfd9f18", new Object[]{this}) : new WebStartParams();
    }
}
