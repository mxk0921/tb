package com.taobao.android.appdevtools.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.appdevtools.core.model.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/io/Serializable;", "T", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/io/Serializable;)V", "com/taobao/android/appdevtools/core/internal/PersistentWrapperKt$createPersistentWrapper$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1 extends Lambda implements g1a<Config, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1 INSTANCE = new DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1();

    public DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1 devToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1");
    }

    public final void invoke(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7febd3", new Object[]{this, config});
        } else {
            ckf.g(config, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Config config) {
        invoke(config);
        return xhv.INSTANCE;
    }
}
