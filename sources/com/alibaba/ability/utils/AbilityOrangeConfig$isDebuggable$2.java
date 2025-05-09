package com.alibaba.ability.utils;

import android.content.Context;
import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AbilityOrangeConfig$isDebuggable$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AbilityOrangeConfig$isDebuggable$2 INSTANCE = new AbilityOrangeConfig$isDebuggable$2();

    public AbilityOrangeConfig$isDebuggable$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(AbilityOrangeConfig$isDebuggable$2 abilityOrangeConfig$isDebuggable$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/utils/AbilityOrangeConfig$isDebuggable$2");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        Context f = MegaUtils.f();
        return (f == null || (f.getApplicationInfo().flags & 2) == 0) ? null : 1;
    }
}
