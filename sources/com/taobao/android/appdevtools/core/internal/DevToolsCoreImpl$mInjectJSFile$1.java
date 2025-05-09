package com.taobao.android.appdevtools.core.internal;

import android.taobao.windvane.extra.devtools.DevTools;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.appdevtools.core.model.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/android/appdevtools/core/model/Resource;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Lcom/taobao/android/appdevtools/core/model/Resource;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreImpl$mInjectJSFile$1 extends Lambda implements g1a<Resource, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsCoreImpl$mInjectJSFile$1 INSTANCE = new DevToolsCoreImpl$mInjectJSFile$1();

    public DevToolsCoreImpl$mInjectJSFile$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(DevToolsCoreImpl$mInjectJSFile$1 devToolsCoreImpl$mInjectJSFile$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/DevToolsCoreImpl$mInjectJSFile$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Resource resource) {
        invoke2(resource);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource resource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f864285", new Object[]{this, resource});
            return;
        }
        ckf.g(resource, AdvanceSetting.NETWORK_TYPE);
        DevTools.INJECTED_JS = resource.getContent();
    }
}
