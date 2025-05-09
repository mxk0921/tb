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
import tb.one;
import tb.qne;
import tb.sne;
import tb.t2o;
import tb.vq;
import tb.zky;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ImagePreviewAbilityWrapper extends AbsAbilityWrapper<AbsImagePreviewAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337205);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePreviewAbilityWrapper(AbsImagePreviewAbility absImagePreviewAbility) {
        super(absImagePreviewAbility);
        ckf.g(absImagePreviewAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ImagePreviewAbilityWrapper imagePreviewAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ImagePreviewAbilityWrapper");
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
        if (hashCode != -1183792455) {
            if (hashCode != -934610812) {
                if (hashCode != 3529469 || !str.equals("show")) {
                    return null;
                }
                try {
                    getAbilityImpl().show(kdbVar, new sne(map), new zky(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals("remove")) {
                return null;
            } else {
                try {
                    getAbilityImpl().remove(kdbVar, new qne(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("insert")) {
            return null;
        } else {
            try {
                getAbilityImpl().insert(kdbVar, new one(map), new mx6(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
