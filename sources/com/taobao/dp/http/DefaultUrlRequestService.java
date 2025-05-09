package com.taobao.dp.http;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultUrlRequestService implements IUrlRequestService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(421527557);
        t2o.a(421527559);
    }

    @Override // com.taobao.dp.http.IUrlRequestService
    public void sendRequest(String str, String str2, IResponseReceiver iResponseReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edcc5af", new Object[]{this, str, str2, iResponseReceiver});
        }
    }
}
