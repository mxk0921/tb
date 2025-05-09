package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ResourceResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZCacheInfoHeader = "X-ZCache-Info";
    private final boolean _canFallback;
    private final boolean _isAllFromCache;
    private final int _statusCode;
    private final byte[] data;
    private final Error error;
    private final Map<String, String> header;
    private final String md5;

    static {
        t2o.a(996147220);
    }

    public ResourceResponse(byte[] bArr, String str, Map<String, String> map, Error error, boolean z, int i, boolean z2) {
        this.data = bArr;
        this.md5 = str;
        this.header = map;
        this.error = error;
        this._isAllFromCache = z;
        this._statusCode = i;
        this._canFallback = z2;
    }

    public static ResourceResponse getErrorResponse(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("84429b6f", new Object[]{error});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("X-ZCache-Info", "none," + error.getCode());
        return new ResourceResponse(null, null, hashMap, error, false, 404, true);
    }

    public boolean canFallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("709e865d", new Object[]{this})).booleanValue();
        }
        return this._canFallback;
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
        }
        return this.data;
    }

    public Error getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("6e37ef76", new Object[]{this});
        }
        return this.error;
    }

    public Map<String, String> getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this});
        }
        return this.header;
    }

    public String getMD5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2dded91", new Object[]{this});
        }
        return this.md5;
    }

    @Deprecated
    public boolean is404() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dd7a159", new Object[]{this})).booleanValue();
        }
        return true ^ this._canFallback;
    }

    public boolean isAllFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e20e8bac", new Object[]{this})).booleanValue();
        }
        return this._isAllFromCache;
    }

    public int statusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue();
        }
        return this._statusCode;
    }
}
