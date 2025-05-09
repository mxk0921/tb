package com.alibaba.ability.impl.memkvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.soh;
import tb.t2o;
import tb.tao;
import tb.toh;
import tb.uoh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MEMKVStorageAbility extends AbsMEMKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(117440514);
    }

    public static /* synthetic */ Object ipc$super(MEMKVStorageAbility mEMKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/memkvstorage/MEMKVStorageAbility");
    }

    public final boolean a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cac44c5f", new Object[]{this, new Long(j), str})).booleanValue();
        }
        MemStorage memStorage = MemStorage.INSTANCE;
        if (!memStorage.j(j) || memStorage.d(str) <= 1048576) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void removeItem(kdb kdbVar, soh sohVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265f8da4", new Object[]{this, kdbVar, sohVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "p0");
        ckf.g(sohVar, p1.d);
        ckf.g(jdbVar, "p2");
        MemStorage memStorage = MemStorage.INSTANCE;
        String str = sohVar.f28171a;
        ckf.f(str, "p1.key");
        memStorage.k(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public tao<Long, ErrorResult> getItemTTL(kdb kdbVar, soh sohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("fc5fcdd6", new Object[]{this, kdbVar, sohVar});
        }
        ckf.g(kdbVar, "p0");
        ckf.g(sohVar, p1.d);
        MemStorage memStorage = MemStorage.INSTANCE;
        String str = sohVar.f28171a;
        ckf.f(str, "p1.key");
        return new tao<>(Long.valueOf(memStorage.g(str)), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void setItemTTL(kdb kdbVar, uoh uohVar, jdb jdbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe73ad", new Object[]{this, kdbVar, uohVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "p0");
        ckf.g(uohVar, p1.d);
        ckf.g(jdbVar, "p2");
        long j = uohVar.f29535a;
        MemStorage memStorage = MemStorage.INSTANCE;
        String str2 = uohVar.b;
        ckf.f(str2, "p1.key");
        Object e = memStorage.e(str2, true);
        if (e == null || (str = e.toString()) == null) {
            str = "";
        }
        if (a(j, str)) {
            jdbVar.O(new ErrorResult("LRU_OVERSIZE", "单条数据不能超过 1M", (Map) null, 4, (a07) null));
            return;
        }
        String str3 = uohVar.b;
        ckf.f(str3, "p1.key");
        if (!memStorage.m(str3, uohVar.f29535a)) {
            jdbVar.O(new ErrorResult("INVALIDATED_TTL", "TTL 须大于 0", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public tao<String, ErrorResult> getItem(kdb kdbVar, soh sohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f656debc", new Object[]{this, kdbVar, sohVar});
        }
        ckf.g(kdbVar, "p0");
        ckf.g(sohVar, p1.d);
        MemStorage memStorage = MemStorage.INSTANCE;
        String str = sohVar.f28171a;
        ckf.f(str, "p1.key");
        Object f = MemStorage.f(memStorage, str, false, 2, null);
        if (f == null) {
            return new tao<>(null, new ErrorResult("DATA_EXPIRED_OR_NOT_EXIST", "设置失效，数据已过期或不存在", (Map) null, 4, (a07) null));
        }
        return new tao<>(f.toString(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility
    public void setItem(kdb kdbVar, toh tohVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc5611b", new Object[]{this, kdbVar, tohVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "p0");
        ckf.g(tohVar, p1.d);
        ckf.g(jdbVar, "p2");
        long j = tohVar.f28843a;
        String str = tohVar.c;
        ckf.f(str, "p1.value");
        if (a(j, str)) {
            jdbVar.O(new ErrorResult("LRU_OVERSIZE", "单条数据不能超过 1M", (Map) null, 4, (a07) null));
            return;
        }
        MemStorage memStorage = MemStorage.INSTANCE;
        String str2 = tohVar.b;
        ckf.f(str2, "p1.key");
        String str3 = tohVar.c;
        ckf.f(str3, "p1.value");
        if (!memStorage.l(str2, str3, tohVar.f28843a, tohVar.d)) {
            jdbVar.O(new ErrorResult("INVALIDATED_TTL", "TTL 须大于 0", (Map) null, 4, (a07) null));
        }
    }
}
