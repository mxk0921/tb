package com.alibaba.ability.impl.kvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsKVStorageAbility;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys;
import java.util.List;
import tb.ckf;
import tb.j1g;
import tb.k1g;
import tb.kdb;
import tb.l1g;
import tb.n1g;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class KVStorageAbility extends AbsKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1g f1959a = new j1g(false);

    static {
        t2o.a(111149058);
    }

    public static /* synthetic */ Object ipc$super(KVStorageAbility kVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/kvstorage/KVStorageAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<Object, ErrorResult> clear(kdb kdbVar, k1g k1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("187e9eb2", new Object[]{this, kdbVar, k1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(k1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = k1gVar.f22342a;
        ckf.f(str, "params.bizID");
        return j1gVar.c(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar, k1g k1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d5d39564", new Object[]{this, kdbVar, k1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(k1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = k1gVar.f22342a;
        ckf.f(str, "params.bizID");
        return j1gVar.d(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<KVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar, k1g k1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("aaa39cf6", new Object[]{this, kdbVar, k1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(k1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = k1gVar.f22342a;
        ckf.f(str, "params.bizID");
        return j1gVar.e(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<KVStorageCurrentInfoAndKeys, ErrorResult> getCurrentInfoAndKeys(kdb kdbVar, k1g k1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("eddb5dff", new Object[]{this, kdbVar, k1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(k1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = k1gVar.f22342a;
        ckf.f(str, "params.bizID");
        return j1gVar.f(kdbVar, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<String, ErrorResult> getItem(kdb kdbVar, l1g l1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("4a31f781", new Object[]{this, kdbVar, l1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(l1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = l1gVar.f23052a;
        ckf.f(str, "params.bizID");
        String str2 = l1gVar.b;
        ckf.f(str2, "params.key");
        return j1gVar.h(kdbVar, str, str2);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f1959a.j();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<Object, ErrorResult> removeItem(kdb kdbVar, l1g l1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("88ea4913", new Object[]{this, kdbVar, l1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(l1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = l1gVar.f23052a;
        ckf.f(str, "params.bizID");
        String str2 = l1gVar.b;
        ckf.f(str2, "params.key");
        return j1gVar.k(kdbVar, str, str2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsKVStorageAbility
    public tao<Object, ErrorResult> setItem(kdb kdbVar, n1g n1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ad012dc6", new Object[]{this, kdbVar, n1gVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(n1gVar, "params");
        j1g j1gVar = this.f1959a;
        String str = n1gVar.f24441a;
        ckf.f(str, "params.bizID");
        String str2 = n1gVar.b;
        ckf.f(str2, "params.key");
        String str3 = n1gVar.c;
        ckf.f(str3, "params.value");
        return j1gVar.l(kdbVar, str, str2, str3);
    }
}
