package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.al4;
import tb.ckf;
import tb.kdb;
import tb.t2o;
import tb.tgy;
import tb.ugy;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ContactsAbilityWrapper extends AbsAbilityWrapper<AbsContactsAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336778);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsAbilityWrapper(AbsContactsAbility absContactsAbility) {
        super(absContactsAbility);
        ckf.g(absContactsAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ContactsAbilityWrapper contactsAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContactsAbilityWrapper");
    }

    @Override // com.alibaba.ability.AbsAbilityWrapper, tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        int hashCode = str.hashCode();
        if (hashCode != -1361218025) {
            if (hashCode != 107944136 || !str.equals("query")) {
                return null;
            }
            try {
                getAbilityImpl().query(kdbVar, new al4(map), new ugy(vqVar));
                return null;
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        } else if (!str.equals("choose")) {
            return null;
        } else {
            getAbilityImpl().choose(kdbVar, new tgy(vqVar));
            return null;
        }
    }
}
