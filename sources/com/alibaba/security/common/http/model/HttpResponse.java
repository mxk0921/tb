package com.alibaba.security.common.http.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class HttpResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String retCode;
    public String retMsg;

    public abstract boolean isSuccessful();
}
