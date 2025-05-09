package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.lcx;
import tb.lyy;
import tb.mcx;
import tb.ocx;
import tb.scx;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class WidgetServiceAbilityWrapper extends AbsAbilityWrapper<AbsWidgetServiceAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337666);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetServiceAbilityWrapper(AbsWidgetServiceAbility absWidgetServiceAbility) {
        super(absWidgetServiceAbility);
        ckf.g(absWidgetServiceAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(WidgetServiceAbilityWrapper widgetServiceAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/WidgetServiceAbilityWrapper");
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
            case 104792645:
                if (!str.equals("addWidget")) {
                    return null;
                }
                try {
                    return getAbilityImpl().addWidget(kdbVar, new lcx(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 1158616740:
                if (!str.equals("isSupported")) {
                    return null;
                }
                try {
                    return getAbilityImpl().isSupported(kdbVar, new scx(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1207466352:
                if (!str.equals("isInstalled")) {
                    return null;
                }
                try {
                    getAbilityImpl().isInstalled(kdbVar, new ocx(map), new lyy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 2043643118:
                if (!str.equals("editWidget")) {
                    return null;
                }
                try {
                    getAbilityImpl().editWidget(kdbVar, new mcx(map), new lyy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            default:
                return null;
        }
    }
}
