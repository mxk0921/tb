package com.alibaba.ability.middleware;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.cjf;
import tb.d1a;
import tb.ovc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2 INSTANCE = new ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2();

    public ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2 profileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/middleware/ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        ovc h = cjf.INSTANCE.h();
        if (h != null) {
            h.a("Megability", "AbilityCallbackException", ProfileExtractorMiddleware.f(), ProfileExtractorMiddleware.e(), true);
        }
        return "AbilityCallbackException";
    }
}
