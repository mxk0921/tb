package com.taobao.weex.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import java.io.Serializable;
import tb.t2o;
import tb.wv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXInitAdapter implements IWXInitTaskAdapter, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean inited = false;

    static {
        t2o.a(773849115);
        t2o.a(985661520);
    }

    @Override // com.taobao.weex.adapter.IWXInitTaskAdapter
    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        return inited;
    }

    @Override // com.taobao.weex.adapter.IWXInitTaskAdapter
    public void doInit(IWXInitTaskAdapter.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f866f21", new Object[]{this, callback});
            return;
        }
        inited = true;
        TLog.loge("Weex", "Weex", "trigger compensation init in WXInitAdapter");
        wv1.c(null, true, false, true, callback);
    }
}
