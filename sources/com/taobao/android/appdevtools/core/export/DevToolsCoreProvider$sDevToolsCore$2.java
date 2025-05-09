package com.taobao.android.appdevtools.core.export;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.appdevtools.core.internal.DevToolsCoreImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/android/appdevtools/core/internal/DevToolsCoreImpl;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreProvider$sDevToolsCore$2 extends Lambda implements d1a<DevToolsCoreImpl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsCoreProvider$sDevToolsCore$2 INSTANCE = new DevToolsCoreProvider$sDevToolsCore$2();

    public DevToolsCoreProvider$sDevToolsCore$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DevToolsCoreProvider$sDevToolsCore$2 devToolsCoreProvider$sDevToolsCore$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/export/DevToolsCoreProvider$sDevToolsCore$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final DevToolsCoreImpl invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DevToolsCoreImpl) ipChange.ipc$dispatch("65ba628e", new Object[]{this}) : new DevToolsCoreImpl();
    }
}
