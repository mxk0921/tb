package com.alibaba.security.client.smart.core.model.client;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ClientInfo implements Serializable {
    public AppInfo appInfo;
    public DeviceInfo deviceInfo;
    public long ts = System.currentTimeMillis();
    public String sdkType = "internal";
}
