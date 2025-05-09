package com.taobao.android.nanocompose.runtime.context;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCBusinessContext$megaEngine$2 extends Lambda implements d1a<AbilityHubAdapter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NCBusinessContext$megaEngine$2 INSTANCE = new NCBusinessContext$megaEngine$2();

    public NCBusinessContext$megaEngine$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(NCBusinessContext$megaEngine$2 nCBusinessContext$megaEngine$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/context/NCBusinessContext$megaEngine$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final AbilityHubAdapter invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbilityHubAdapter) ipChange.ipc$dispatch("ec8d396c", new Object[]{this}) : new AbilityHubAdapter(new zq("bizId", "dx"), false);
    }
}
