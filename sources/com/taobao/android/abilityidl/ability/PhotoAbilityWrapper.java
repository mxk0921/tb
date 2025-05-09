package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a2m;
import tb.c2m;
import tb.ckf;
import tb.f2m;
import tb.gty;
import tb.hty;
import tb.ity;
import tb.jty;
import tb.kdb;
import tb.t2o;
import tb.vq;
import tb.z1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PhotoAbilityWrapper extends AbsAbilityWrapper<AbsPhotoAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337384);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoAbilityWrapper(AbsPhotoAbility absPhotoAbility) {
        super(absPhotoAbility);
        ckf.g(absPhotoAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(PhotoAbilityWrapper photoAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PhotoAbilityWrapper");
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
        switch (str.hashCode()) {
            case -2072491622:
                if (!str.equals("takeFromPhotoLibrary")) {
                    return null;
                }
                try {
                    getAbilityImpl().takeFromPhotoLibrary(kdbVar, new z1m(map), new gty(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -2001325226:
                if (!str.equals("takeFromCamera")) {
                    return null;
                }
                try {
                    getAbilityImpl().takeFromCamera(kdbVar, new z1m(map), new gty(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1541263203:
                if (!str.equals("takeFromScreen")) {
                    return null;
                }
                try {
                    getAbilityImpl().takeFromScreen(kdbVar, new f2m(map), new jty(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -491916169:
                if (!str.equals("saveToAlbum")) {
                    return null;
                }
                try {
                    getAbilityImpl().saveToAlbum(kdbVar, new c2m(map), new ity(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 1527731789:
                if (!str.equals("saveMediaToAlbum")) {
                    return null;
                }
                try {
                    getAbilityImpl().saveMediaToAlbum(kdbVar, new a2m(map), new hty(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
