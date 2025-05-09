package com.taobao.themis.kernel.network;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.g1a;
import tb.n8s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IMtopInnerAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Response implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private JSONObject data;
        private String errorCode;
        private String errorMsg;
        private Map<String, ? extends List<String>> headers;
        private byte[] rawData;
        private boolean success;

        static {
            t2o.a(839909852);
        }

        public final JSONObject getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
            }
            return this.data;
        }

        public final String getErrorCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
            }
            return this.errorCode;
        }

        public final String getErrorMsg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
            }
            return this.errorMsg;
        }

        public final Map<String, List<String>> getHeaders() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
            }
            return this.headers;
        }

        public final byte[] getRawData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("25ccfefa", new Object[]{this});
            }
            return this.rawData;
        }

        public final boolean getSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e2b51d8", new Object[]{this})).booleanValue();
            }
            return this.success;
        }

        public final void setData(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            } else {
                this.data = jSONObject;
            }
        }

        public final void setErrorCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
            } else {
                this.errorCode = str;
            }
        }

        public final void setErrorMsg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
            } else {
                this.errorMsg = str;
            }
        }

        public final void setHeaders(Map<String, ? extends List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            } else {
                this.headers = map;
            }
        }

        public final void setRawData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26bfa0be", new Object[]{this, bArr});
            } else {
                this.rawData = bArr;
            }
        }

        public final void setSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
            } else {
                this.success = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909850);
        }

        public static /* synthetic */ void a(IMtopInnerAdapter iMtopInnerAdapter, String str, String str2, Map map, String str3, boolean z, String str4, Map map2, String str5, String str6, g1a g1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95a5af6", new Object[]{iMtopInnerAdapter, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6, g1aVar, new Integer(i), obj});
            } else if (obj == null) {
                iMtopInnerAdapter.requestAsync(str, str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? "GET" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, g1aVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAsync");
            }
        }

        public static /* synthetic */ Response b(IMtopInnerAdapter iMtopInnerAdapter, String str, String str2, Map map, String str3, boolean z, String str4, Map map2, String str5, String str6, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Response) ipChange.ipc$dispatch("a4a0cc72", new Object[]{iMtopInnerAdapter, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6, new Integer(i), obj});
            }
            if (obj == null) {
                return iMtopInnerAdapter.requestSync(str, str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? "GET" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSync");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    void requestAsync(RequestParams requestParams, b bVar);

    void requestAsync(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6, g1a<? super Response, xhv> g1aVar);

    Response requestSync(RequestParams requestParams);

    Response requestSync(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6);
}
