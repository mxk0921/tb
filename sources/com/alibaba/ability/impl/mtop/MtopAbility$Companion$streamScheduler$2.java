package com.alibaba.ability.impl.mtop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.eji;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MtopAbility$Companion$streamScheduler$2 extends Lambda implements d1a<eji> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtopAbility$Companion$streamScheduler$2 INSTANCE = new MtopAbility$Companion$streamScheduler$2();

    public MtopAbility$Companion$streamScheduler$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtopAbility$Companion$streamScheduler$2 mtopAbility$Companion$streamScheduler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/mtop/MtopAbility$Companion$streamScheduler$2");
    }

    @Override // tb.d1a
    public final eji invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eji) ipChange.ipc$dispatch("f31bca94", new Object[]{this}) : new eji("mega-mtop-stream", 1);
    }
}
