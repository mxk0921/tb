package com.taobao.themis.pub_kit.teenager_protect;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.q9s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTimeLock$DELAY_DURATION$2 extends Lambda implements d1a<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PubTimeLock$DELAY_DURATION$2 INSTANCE = new PubTimeLock$DELAY_DURATION$2();

    public PubTimeLock$DELAY_DURATION$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(PubTimeLock$DELAY_DURATION$2 pubTimeLock$DELAY_DURATION$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/teenager_protect/PubTimeLock$DELAY_DURATION$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Long invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("b37fae36", new Object[]{this}) : Long.valueOf(q9s.F3());
    }
}
