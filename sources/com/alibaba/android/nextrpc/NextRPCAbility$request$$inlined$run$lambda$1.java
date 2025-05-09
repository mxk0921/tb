package com.alibaba.android.nextrpc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import mtopsdk.mtop.domain.MtopRequest;
import tb.a3o;
import tb.d1a;
import tb.dxl;
import tb.t2k;
import tb.v2k;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/a3o;", "invoke", "()Ltb/a3o;", "com/alibaba/android/nextrpc/NextRPCAbility$request$1$1", "getStreamRequest"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class NextRPCAbility$request$$inlined$run$lambda$1 extends Lambda implements d1a<a3o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ v2k $params$inlined;
    public final /* synthetic */ Ref$ObjectRef $performance$inlined;
    public final /* synthetic */ Ref$ObjectRef $request$inlined;
    public final /* synthetic */ NextRPCAbility $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextRPCAbility$request$$inlined$run$lambda$1(NextRPCAbility nextRPCAbility, Ref$ObjectRef ref$ObjectRef, v2k v2kVar, Ref$ObjectRef ref$ObjectRef2) {
        super(0);
        this.$this_run = nextRPCAbility;
        this.$performance$inlined = ref$ObjectRef;
        this.$params$inlined = v2kVar;
        this.$request$inlined = ref$ObjectRef2;
    }

    public static /* synthetic */ Object ipc$super(NextRPCAbility$request$$inlined$run$lambda$1 nextRPCAbility$request$$inlined$run$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/NextRPCAbility$request$$inlined$run$lambda$1");
    }

    @Override // tb.d1a
    public final a3o invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3o) ipChange.ipc$dispatch("471c3fac", new Object[]{this});
        }
        MtopRequest access$getMtopRequest = NextRPCAbility.access$getMtopRequest(this.$this_run, this.$params$inlined);
        a3o a3oVar = new a3o(access$getMtopRequest, NextRPCAbility.access$getMtopBusiness(this.$this_run, access$getMtopRequest, this.$params$inlined), (dxl) this.$performance$inlined.element, 0, null, null, 56, null);
        t2k t2kVar = this.$params$inlined.b;
        if (t2kVar != null) {
            a3oVar.g(t2kVar.g);
        }
        a3oVar.h(Boolean.valueOf(this.$params$inlined.f29745a));
        return a3oVar;
    }
}
