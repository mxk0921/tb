package com.taobao.alimama.common.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import com.taobao.alimama.api.plugin.IPlugin;
import com.taobao.alimama.sdk.common.CommonService;
import java.util.HashMap;
import java.util.Map;
import tb.e74;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Plugin implements IPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118781);
        t2o.a(1018167310);
    }

    @Override // com.taobao.alimama.api.plugin.IPlugin
    public Map<Class<?>, Class<? extends AbsServiceImpl>> services() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ec26935a", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(CommonService.class, e74.class);
        return hashMap;
    }
}
