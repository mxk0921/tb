package com.alibaba.ability.localization;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Localization$mainHandler$2 extends Lambda implements d1a<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Localization$mainHandler$2 INSTANCE = new Localization$mainHandler$2();

    public Localization$mainHandler$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(Localization$mainHandler$2 localization$mainHandler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/localization/Localization$mainHandler$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Handler invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this}) : new Handler(Looper.getMainLooper());
    }
}
