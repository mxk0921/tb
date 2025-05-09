package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpUrlResponse extends Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f4562a;
    public final String b;
    public long c;
    public long d;
    public String e;
    public HttpUrlHeader f;

    public HttpUrlResponse(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f = httpUrlHeader;
        this.f4562a = i;
        this.b = str;
        this.mResData = bArr;
    }

    public static /* synthetic */ Object ipc$super(HttpUrlResponse httpUrlResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/HttpUrlResponse");
    }

    public String getCharset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca2bba3", new Object[]{this});
        }
        return this.e;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.f4562a;
    }

    public long getCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public HttpUrlHeader getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("eb15da6", new Object[]{this});
        }
        return this.f;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.b;
    }

    public long getPeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("516e9b2", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public void setCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb8419b", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e2e12", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void setHeader(HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0599296", new Object[]{this, httpUrlHeader});
        } else {
            this.f = httpUrlHeader;
        }
    }

    public void setPeriod(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c383a", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }
}
