package com.taobao.themis.kernel.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.ges;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class InstanceStartParams$mUniAppBaseInfo$2 extends Lambda implements d1a<ges.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ InstanceStartParams this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams$mUniAppBaseInfo$2(InstanceStartParams instanceStartParams) {
        super(0);
        this.this$0 = instanceStartParams;
    }

    public static /* synthetic */ Object ipc$super(InstanceStartParams$mUniAppBaseInfo$2 instanceStartParams$mUniAppBaseInfo$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/entity/InstanceStartParams$mUniAppBaseInfo$2");
    }

    @Override // tb.d1a
    public final ges.a invoke() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ges.a) ipChange.ipc$dispatch("58fb58f2", new Object[]{this});
        }
        ges gesVar = ges.INSTANCE;
        str = this.this$0.mUrl;
        if (str != null) {
            return gesVar.o(str);
        }
        ckf.y("mUrl");
        throw null;
    }
}
