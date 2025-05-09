package com.alibaba.aliweex.adapter.module.prefetch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXPrefetchModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(85983253);
    }

    public static /* synthetic */ Object ipc$super(WXPrefetchModule wXPrefetchModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/adapter/module/prefetch/WXPrefetchModule");
    }

    public void addTask(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdeeac8", new Object[]{this, str, list});
        }
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }
}
