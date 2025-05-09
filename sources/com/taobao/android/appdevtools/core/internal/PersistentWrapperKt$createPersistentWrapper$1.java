package com.taobao.android.appdevtools.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/Serializable;", "T", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/io/Serializable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PersistentWrapperKt$createPersistentWrapper$1 extends Lambda implements g1a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PersistentWrapperKt$createPersistentWrapper$1 INSTANCE = new PersistentWrapperKt$createPersistentWrapper$1();

    public PersistentWrapperKt$createPersistentWrapper$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(PersistentWrapperKt$createPersistentWrapper$1 persistentWrapperKt$createPersistentWrapper$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/PersistentWrapperKt$createPersistentWrapper$1");
    }

    public final void invoke(Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7febd3", new Object[]{this, serializable});
        } else {
            ckf.g(serializable, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Serializable) obj);
        return xhv.INSTANCE;
    }
}
