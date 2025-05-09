package com.taobao.android.appdevtools.core.export;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/appdevtools/core/export/DevToolsCoreProvider;", "", "<init>", "()V", "Lcom/taobao/android/appdevtools/core/export/IDevToolsCore;", "get", "()Lcom/taobao/android/appdevtools/core/export/IDevToolsCore;", "sDevToolsCore$delegate", "Ltb/njg;", "getSDevToolsCore", "sDevToolsCore", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsCoreProvider INSTANCE = new DevToolsCoreProvider();
    private static final njg sDevToolsCore$delegate = a.b(DevToolsCoreProvider$sDevToolsCore$2.INSTANCE);

    static {
        t2o.a(998244355);
    }

    private DevToolsCoreProvider() {
    }

    @JvmStatic
    public static final IDevToolsCore get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDevToolsCore) ipChange.ipc$dispatch("59d2ff00", new Object[0]);
        }
        return INSTANCE.getSDevToolsCore();
    }

    private final IDevToolsCore getSDevToolsCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDevToolsCore) ipChange.ipc$dispatch("3dcdb1f4", new Object[]{this});
        }
        return (IDevToolsCore) sDevToolsCore$delegate.getValue();
    }
}
