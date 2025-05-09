package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.apache.http.Header;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4568a;
    public List<Header> b;
    public boolean c;

    public String getGwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be62e1f0", new Object[]{this});
        }
        return this.f4568a;
    }

    public List<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19344190", new Object[]{this});
        }
        return this.b;
    }

    public boolean isGzip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void setGwUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1f1ee", new Object[]{this, str});
        } else {
            this.f4568a = str;
        }
    }

    public void setGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c20fd1", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void setHeaders(List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f026123c", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }
}
