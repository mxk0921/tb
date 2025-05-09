package com.alibaba.ability;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.cu;
import tb.kdb;
import tb.odb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsAbilityWrapper<T extends odb> extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f1873a;

    static {
        t2o.a(144703489);
    }

    public AbsAbilityWrapper(T t) {
        ckf.g(t, "abilityImpl");
        this.f1873a = t;
    }

    public static /* synthetic */ Object ipc$super(AbsAbilityWrapper absAbilityWrapper, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/AbsAbilityWrapper");
    }

    @Override // tb.hdb
    public abstract /* synthetic */ ExecuteResult execute(String str, kdb kdbVar, Map map, vq vqVar);

    public final T getAbilityImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((odb) ipChange.ipc$dispatch("a2f87318", new Object[]{this}));
        }
        return this.f1873a;
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f1873a.onDestroy();
    }
}
