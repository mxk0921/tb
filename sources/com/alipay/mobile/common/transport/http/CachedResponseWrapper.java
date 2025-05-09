package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.apache.http.Header;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CachedResponseWrapper implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4073a;
    private byte[] b;
    private String c;
    private String d;

    public String getEtag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d2d124e", new Object[]{this});
        }
        return this.f4073a;
    }

    public Header getTypeHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("f900aa83", new Object[]{this});
        }
        String str = this.c + ": " + this.d;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return new BufferedHeader(charArrayBuffer);
    }

    public byte[] getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6535725b", new Object[]{this});
        }
        return this.b;
    }

    public void setEtag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf477e8", new Object[]{this, str});
        } else {
            this.f4073a = str;
        }
    }

    public void setTypeHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76781981", new Object[]{this, header});
        } else if (header != null) {
            this.c = header.getName();
            this.d = header.getValue();
        }
    }

    public void setValue(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4a67d", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }
}
