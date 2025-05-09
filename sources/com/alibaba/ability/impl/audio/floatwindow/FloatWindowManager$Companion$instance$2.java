package com.alibaba.ability.impl.audio.floatwindow;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FloatWindowManager$Companion$instance$2 extends Lambda implements d1a<FloatWindowManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FloatWindowManager$Companion$instance$2 INSTANCE = new FloatWindowManager$Companion$instance$2();

    public FloatWindowManager$Companion$instance$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(FloatWindowManager$Companion$instance$2 floatWindowManager$Companion$instance$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/FloatWindowManager$Companion$instance$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FloatWindowManager invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindowManager) ipChange.ipc$dispatch("5c3568a", new Object[]{this}) : new FloatWindowManager(null);
    }
}
