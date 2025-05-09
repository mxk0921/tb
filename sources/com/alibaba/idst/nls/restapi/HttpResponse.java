package com.alibaba.idst.nls.restapi;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] audioBody;
    private String errorMessage;
    private int statusCode;

    static {
        t2o.a(199229492);
    }

    public byte[] getAudioBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("43d8ca94", new Object[]{this});
        }
        return this.audioBody;
    }

    public String getErrorMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this});
        }
        return this.errorMessage;
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        return this.statusCode;
    }

    public void setAudioBody(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2d7b64", new Object[]{this, bArr});
        } else {
            this.audioBody = bArr;
        }
    }

    public void setErrorMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d624632", new Object[]{this, str});
        } else {
            this.errorMessage = str;
        }
    }

    public void setStatusCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86008fb", new Object[]{this, new Integer(i)});
        } else {
            this.statusCode = i;
        }
    }
}
