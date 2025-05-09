package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.uhy;
import tb.vq;
import tb.xv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DownloaderAbilityWrapper extends AbsAbilityWrapper<AbsDownloaderAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336861);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloaderAbilityWrapper(AbsDownloaderAbility absDownloaderAbility) {
        super(absDownloaderAbility);
        ckf.g(absDownloaderAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(DownloaderAbilityWrapper downloaderAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/DownloaderAbilityWrapper");
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
        if (hashCode != -1367724422) {
            if (hashCode != 1427818632 || !str.equals("download")) {
                return null;
            }
            try {
                getAbilityImpl().download(kdbVar, new xv7(map), new uhy(vqVar));
                return null;
            } catch (Throwable th) {
                return ErrorResult.a.Companion.g(th.getMessage());
            }
        } else if (!str.equals("cancel")) {
            return null;
        } else {
            getAbilityImpl().cancel(kdbVar, new mx6(vqVar));
            return null;
        }
    }
}
