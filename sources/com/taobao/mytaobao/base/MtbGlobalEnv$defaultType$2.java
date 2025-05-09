package com.taobao.mytaobao.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbGlobalEnv$defaultType$2 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$defaultType$2 INSTANCE = new MtbGlobalEnv$defaultType$2();

    public MtbGlobalEnv$defaultType$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MtbGlobalEnv$defaultType$2 mtbGlobalEnv$defaultType$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/base/MtbGlobalEnv$defaultType$2");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.Integer] */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis() % 100;
        if (currentTimeMillis == 1 || currentTimeMillis == 2) {
            return -1;
        }
        return (currentTimeMillis == 3 || currentTimeMillis == 4) ? 1 : null;
    }
}
