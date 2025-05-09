package com.taobao.zcache.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ZCacheResourceResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZCACHE_INFO = "X-ZCache-Info";
    public static final String ZCACHE_NO_HEADER = "NO_HEADER";
    public static final String ZCACHE_NO_RESPONSE = "NO_RESPONSE";
    public String encoding;
    public Map<String, String> headers;
    public InputStream inputStream;
    public boolean isSuccess = false;
    public String mimeType;
    public int status;
    public String zcacheInfo;

    static {
        t2o.a(996147274);
    }

    public void insertZCacheInfo(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad5aaae", new Object[]{this, str, new Long(j), str2});
        }
    }
}
