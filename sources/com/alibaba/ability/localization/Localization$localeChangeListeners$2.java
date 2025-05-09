package com.alibaba.ability.localization;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Localization$localeChangeListeners$2 extends Lambda implements d1a<ConcurrentLinkedQueue<Localization.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Localization$localeChangeListeners$2 INSTANCE = new Localization$localeChangeListeners$2();

    public Localization$localeChangeListeners$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(Localization$localeChangeListeners$2 localization$localeChangeListeners$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/localization/Localization$localeChangeListeners$2");
    }

    @Override // tb.d1a
    public final ConcurrentLinkedQueue<Localization.a> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentLinkedQueue) ipChange.ipc$dispatch("fa60253d", new Object[]{this}) : new ConcurrentLinkedQueue<>();
    }
}
