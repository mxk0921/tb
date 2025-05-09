package com.alipay.android.msp.network.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResData<R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final R mData;
    public List<Header> mHeaders;
    public ReqData mReqData;
    public int mStatusCode;

    public ResData(R r) {
        this.mData = r;
    }

    public String getHeader(String str) {
        Header header;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17d5ab4c", new Object[]{this, str});
        }
        List<Header> list = this.mHeaders;
        if (list == null) {
            return null;
        }
        Header[] headerArr = (Header[]) list.toArray(new Header[0]);
        if (headerArr != null && headerArr.length > 0 && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            int length = headerArr.length;
            for (int i = 0; i < length; i++) {
                header = headerArr[i];
                String name = header.getName();
                if (!TextUtils.isEmpty(name) && TextUtils.equals(name.toLowerCase(), lowerCase)) {
                    break;
                }
            }
        }
        header = null;
        if (header != null) {
            return header.getValue();
        }
        return null;
    }

    public long getLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33609457", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            R r = this.mData;
            if (r instanceof Map) {
                for (Map.Entry<String, String> entry : toMapData().entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        j += value.length();
                    }
                }
                return j;
            } else if (r instanceof byte[]) {
                return toBytesData().length;
            } else {
                return 0L;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 0L;
        }
    }

    public long getReqDataSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7be674e", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            R r = this.mData;
            if (r instanceof Map) {
                if (toMapData().containsKey("reqDataSize")) {
                    j = Long.parseLong(toMapData().get("reqDataSize"));
                }
            } else if (r instanceof byte[]) {
                j = toBytesData().length;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return j;
    }

    public long getResDataSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4c47450", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            R r = this.mData;
            if (r instanceof Map) {
                if (toMapData().containsKey("resDataSize")) {
                    j = Long.parseLong(toMapData().get("resDataSize"));
                }
            } else if (r instanceof byte[]) {
                j = toBytesData().length;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return j;
    }

    public long getServerCost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df5bf321", new Object[]{this})).longValue();
        }
        try {
            if (!(this.mData instanceof Map) || !toMapData().containsKey("time")) {
                return 0L;
            }
            return Long.parseLong(toMapData().get("time"));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 0L;
        }
    }

    public byte[] toBytesData() throws ClassCastException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7a0266fc", new Object[]{this});
        }
        return (byte[]) this.mData;
    }

    public JSONObject toJsonData() throws ClassCastException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3b05574", new Object[]{this});
        }
        Map map = (Map) this.mData;
        if (map != null) {
            return JsonUtil.map2Json(map);
        }
        return null;
    }

    @Deprecated
    public Map<String, String> toMapData() throws ClassCastException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91ac5de7", new Object[]{this});
        }
        return (Map) this.mData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("<ResData of ReqData %s>", this.mReqData);
    }
}
