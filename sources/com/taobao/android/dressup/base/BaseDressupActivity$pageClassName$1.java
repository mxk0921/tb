package com.taobao.android.dressup.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final /* synthetic */ class BaseDressupActivity$pageClassName$1 extends FunctionReferenceImpl implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaseDressupActivity$pageClassName$1(Class cls) {
        super(0, cls, Class.class, "getSimpleName", "getSimpleName()Ljava/lang/String;", 0);
    }

    public static /* synthetic */ Object ipc$super(BaseDressupActivity$pageClassName$1 baseDressupActivity$pageClassName$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/base/BaseDressupActivity$pageClassName$1");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : ((Class) this.receiver).getSimpleName();
    }
}
