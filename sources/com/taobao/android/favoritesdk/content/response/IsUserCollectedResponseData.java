package com.taobao.android.favoritesdk.content.response;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IsUserCollectedResponseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean result;

    static {
        t2o.a(463470602);
        t2o.a(463470652);
    }

    public boolean getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc18ae1e", new Object[]{this})).booleanValue();
        }
        return this.result;
    }

    public void setResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d633b6e", new Object[]{this, new Boolean(z)});
        } else {
            this.result = z;
        }
    }
}
