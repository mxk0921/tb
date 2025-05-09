package com.alibaba.ability.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AbilityOrangeConfig$sysPropClzz$2 extends Lambda implements d1a<Class<?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AbilityOrangeConfig$sysPropClzz$2 INSTANCE = new AbilityOrangeConfig$sysPropClzz$2();

    public AbilityOrangeConfig$sysPropClzz$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(AbilityOrangeConfig$sysPropClzz$2 abilityOrangeConfig$sysPropClzz$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/utils/AbilityOrangeConfig$sysPropClzz$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Class<?> invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("acea7fac", new Object[]{this});
        }
        try {
            return Class.forName("android.os.SystemProperties");
        } catch (Throwable unused) {
            return null;
        }
    }
}
