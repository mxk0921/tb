package com.taobao.android.ovs;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility;
import tb.kdb;
import tb.sq2;
import tb.tao;
import tb.tq2;
import tb.uq2;
import tb.vq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CLDRFormatAbility extends AbsCLDRFormatAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CLDRFormatAbility cLDRFormatAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ovs/CLDRFormatAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility
    public tao<String, ErrorResult> getFormatCustomDateTime(kdb kdbVar, tq2 tq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("96368525", new Object[]{this, kdbVar, tq2Var});
        }
        return new tao<>(sq2.b(Long.valueOf(tq2Var.f28879a), tq2Var.b));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility
    public tao<String, ErrorResult> getFormatDate(kdb kdbVar, uq2 uq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("adeae354", new Object[]{this, kdbVar, uq2Var});
        }
        return new tao<>(sq2.c(Long.valueOf(uq2Var.f29554a), uq2Var.b));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility
    public tao<String, ErrorResult> getFormatDateTime(kdb kdbVar, uq2 uq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("39d44bc7", new Object[]{this, kdbVar, uq2Var});
        }
        return new tao<>(sq2.d(Long.valueOf(uq2Var.f29554a), uq2Var.b));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility
    public tao<String, ErrorResult> getFormatNumber(kdb kdbVar, vq2 vq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("7b53ee5e", new Object[]{this, kdbVar, vq2Var});
        }
        return new tao<>(sq2.f(vq2Var.f30169a));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCLDRFormatAbility
    public tao<String, ErrorResult> getFormatTime(kdb kdbVar, uq2 uq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("190196d5", new Object[]{this, kdbVar, uq2Var});
        }
        return new tao<>(sq2.g(Long.valueOf(uq2Var.f29554a), uq2Var.b));
    }
}
