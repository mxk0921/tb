package com.alibaba.ability.hub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AbilityHubAdapter$customCache$2 extends Lambda implements d1a<ConcurrentHashMap<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AbilityHubAdapter$customCache$2 INSTANCE = new AbilityHubAdapter$customCache$2();

    public AbilityHubAdapter$customCache$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(AbilityHubAdapter$customCache$2 abilityHubAdapter$customCache$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/hub/AbilityHubAdapter$customCache$2");
    }

    @Override // tb.d1a
    public final ConcurrentHashMap<String, Object> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("da029207", new Object[]{this}) : new ConcurrentHashMap<>();
    }
}
