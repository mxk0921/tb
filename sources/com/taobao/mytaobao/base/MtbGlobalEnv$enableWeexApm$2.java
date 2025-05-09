package com.taobao.mytaobao.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbGlobalEnv$enableWeexApm$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$enableWeexApm$2 INSTANCE = new MtbGlobalEnv$enableWeexApm$2();

    public MtbGlobalEnv$enableWeexApm$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtbGlobalEnv$enableWeexApm$2 mtbGlobalEnv$enableWeexApm$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/base/MtbGlobalEnv$enableWeexApm$2");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : Math.random() <= 0.9d ? 1 : null;
    }
}
