package com.taobao.themis.pub_kit.teenager_protect;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bii;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/bii;", "invoke", "()Ltb/bii;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTeenagerProtectionGuide$alertInstance$2 extends Lambda implements d1a<bii> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PubTeenagerProtectionGuide$alertInstance$2 INSTANCE = new PubTeenagerProtectionGuide$alertInstance$2();

    public PubTeenagerProtectionGuide$alertInstance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(PubTeenagerProtectionGuide$alertInstance$2 pubTeenagerProtectionGuide$alertInstance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/teenager_protect/PubTeenagerProtectionGuide$alertInstance$2");
    }

    @Override // tb.d1a
    public final bii invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bii) ipChange.ipc$dispatch("9fb24de9", new Object[]{this}) : bii.Companion.b();
    }
}
