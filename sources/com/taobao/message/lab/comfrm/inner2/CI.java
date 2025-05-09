package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CI<CONFIG, INSTANCE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CONFIG config;
    private final INSTANCE instance;

    static {
        t2o.a(537919574);
    }

    public CI(CONFIG config, INSTANCE instance) {
        this.config = config;
        this.instance = instance;
    }

    public CONFIG getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONFIG) ipChange.ipc$dispatch("6363e53", new Object[]{this});
        }
        return this.config;
    }

    public INSTANCE getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INSTANCE) ipChange.ipc$dispatch("186dc460", new Object[]{this});
        }
        return this.instance;
    }
}
