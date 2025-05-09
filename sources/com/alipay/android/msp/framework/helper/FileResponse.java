package com.alipay.android.msp.framework.helper;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FileResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3619a;
    public int b;
    public Map<String, String> c;

    public byte[] getRespBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7ef8532e", new Object[]{this});
        }
        return this.f3619a;
    }

    public int getRespCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f742f64d", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public Map<String, String> getRespHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9dc14edc", new Object[]{this});
        }
        return this.c;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (this.b == 200) {
            return true;
        }
        return false;
    }

    public void setRespBody(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281ed4a2", new Object[]{this, bArr});
        } else {
            this.f3619a = bArr;
        }
    }

    public void setRespCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f2ae5d", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void setRespHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84703ca", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }
}
