package com.alibaba.ability.impl.userkvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.UserKVStorageCurrentInfo;
import java.util.List;
import tb.ckf;
import tb.j1g;
import tb.kdb;
import tb.t2o;
import tb.tao;
import tb.vrv;
import tb.wrv;
import tb.xhv;
import tb.xrv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UserKVStorageAbility extends AbsUserKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1g f2061a = new j1g(true);

    static {
        t2o.a(139460610);
    }

    public static /* synthetic */ Object ipc$super(UserKVStorageAbility userKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/userkvstorage/UserKVStorageAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<Object, ErrorResult> clear(kdb kdbVar, vrv vrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("88145a5d", new Object[]{this, kdbVar, vrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = vrvVar.f30211a;
        ckf.f(str, "params.bizID");
        return j1gVar.c(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar, vrv vrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("fcaa80f", new Object[]{this, kdbVar, vrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = vrvVar.f30211a;
        ckf.f(str, "params.bizID");
        return j1gVar.d(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<String, ErrorResult> getItem(kdb kdbVar, wrv wrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d346ef36", new Object[]{this, kdbVar, wrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(wrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = wrvVar.f30881a;
        ckf.f(str, "params.bizID");
        String str2 = wrvVar.b;
        ckf.f(str2, "params.key");
        return j1gVar.h(kdbVar, str, str2);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f2061a.j();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<Object, ErrorResult> removeItem(kdb kdbVar, wrv wrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("737827c8", new Object[]{this, kdbVar, wrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(wrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = wrvVar.f30881a;
        ckf.f(str, "params.bizID");
        String str2 = wrvVar.b;
        ckf.f(str2, "params.key");
        return j1gVar.k(kdbVar, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<Object, ErrorResult> setItem(kdb kdbVar, xrv xrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("2a2046b1", new Object[]{this, kdbVar, xrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(xrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = xrvVar.f31560a;
        ckf.f(str, "params.bizID");
        String str2 = xrvVar.b;
        ckf.f(str2, "params.key");
        String str3 = xrvVar.c;
        ckf.f(str3, "params.value");
        return j1gVar.l(kdbVar, str, str2, str3);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserKVStorageAbility
    public tao<UserKVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar, vrv vrvVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("674896a1", new Object[]{this, kdbVar, vrvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vrvVar, "params");
        j1g j1gVar = this.f2061a;
        String str = vrvVar.f30211a;
        ckf.f(str, "params.bizID");
        tao<KVStorageCurrentInfo, ErrorResult> e = j1gVar.e(kdbVar, str);
        UserKVStorageCurrentInfo userKVStorageCurrentInfo = new UserKVStorageCurrentInfo();
        KVStorageCurrentInfo c = e.c();
        userKVStorageCurrentInfo.freeSize = c != null ? c.freeSize : 0;
        KVStorageCurrentInfo c2 = e.c();
        if (c2 != null) {
            i = c2.totalSize;
        }
        userKVStorageCurrentInfo.totalSize = i;
        xhv xhvVar = xhv.INSTANCE;
        return new tao<>(userKVStorageCurrentInfo, e.d());
    }
}
