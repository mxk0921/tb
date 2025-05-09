package com.taobao.android.favoritesdk.goods.response;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OriginCheckCollectResponseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<String, String> result;

    static {
        t2o.a(463470625);
        t2o.a(463470652);
    }

    public HashMap<String, String> getFavCheckResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b49e1c4a", new Object[]{this});
        }
        return this.result;
    }
}
