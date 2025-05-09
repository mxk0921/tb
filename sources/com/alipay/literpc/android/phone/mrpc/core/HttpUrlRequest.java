package com.alipay.literpc.android.phone.mrpc.core;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpUrlRequest extends Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public byte[] c;
    public String d;
    public ArrayList<Header> e;
    public Map<String, String> f;
    public boolean g;

    public HttpUrlRequest(String str) {
        this.b = str;
        this.e = new ArrayList<>();
        this.f = new HashMap();
        this.d = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public static /* synthetic */ Object ipc$super(HttpUrlRequest httpUrlRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/HttpUrlRequest");
    }

    public void addHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e1a26", new Object[]{this, header});
        } else {
            this.e.add(header);
        }
    }

    public void addTags(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6584875", new Object[]{this, str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpUrlRequest httpUrlRequest = (HttpUrlRequest) obj;
        byte[] bArr = this.c;
        if (bArr == null) {
            if (httpUrlRequest.c != null) {
                return false;
            }
        } else if (!bArr.equals(httpUrlRequest.c)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (httpUrlRequest.b != null) {
                return false;
            }
        } else if (!str.equals(httpUrlRequest.b)) {
            return false;
        }
        return true;
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        return this.d;
    }

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        return this.e;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return getUrl() + Integer.toHexString(getReqData().hashCode());
    }

    public byte[] getReqData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfa72344", new Object[]{this});
        }
        return this.c;
    }

    public String getTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca26b54b", new Object[]{this, str});
        }
        Map<String, String> map = this.f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public boolean isResetCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d221114", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setHeaders(ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23bab3f", new Object[]{this, arrayList});
        } else {
            this.e = arrayList;
        }
    }

    public void setReqData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82a05b4", new Object[]{this, bArr});
        } else {
            this.c = bArr;
        }
    }

    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void setTags(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328360a3", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    public String setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b4d97e2", new Object[]{this, str});
        }
        this.b = str;
        return str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("Url : %s,HttpHeader: %s", getUrl(), getHeaders());
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Map<String, String> map = this.f;
        if (map != null && map.containsKey("id")) {
            i2 = this.f.get("id").hashCode() + 31;
        }
        int i3 = i2 * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
    }

    public HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this.b = str;
        this.c = bArr;
        this.e = arrayList;
        this.f = hashMap;
        this.d = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }
}
