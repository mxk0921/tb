package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_worker.v8worker.GetShopPluginResourcePoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.n7o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopPluginResourcePoint implements GetShopPluginResourcePoint, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509305);
    }

    public String getPluginIndexJs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("635f9a9d", new Object[]{this, str});
        }
        return n7o.d(str, "index.js");
    }

    public String getPluginWorkerIndexJs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97502fb", new Object[]{this, str});
        }
        return n7o.d(str, "index.worker.js");
    }

    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }
}
