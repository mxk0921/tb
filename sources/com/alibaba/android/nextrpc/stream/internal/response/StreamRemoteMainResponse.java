package com.alibaba.android.nextrpc.stream.internal.response;

import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.beu;
import tb.m7j;
import tb.vpq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StreamRemoteMainResponse extends AbsStreamResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MAIN_RESPONSE_HEADER_REQ_ID = "mtop-nextrpc-req-id";
    private static final String MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE = "MTOP-nextrpc-req-id";
    private static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT = "mtop-nextrpc-attached-responses-stat";
    private static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE = "MTOP-nextrpc-attached-responses-stat";
    private String attachedResponseStat;
    private boolean isBizSuccess;
    private final vpq mStatistics;
    private final BaseOutDo mtopBaseOutDo;
    private final m7j mtopStreamResponse;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public StreamRemoteMainResponse(int r2, tb.m7j r3, mtopsdk.mtop.domain.BaseOutDo r4, java.lang.Object r5) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r3.g
            goto L_0x000a
        L_0x0005:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x000a:
            r1.<init>(r0, r2, r5)
            tb.vpq r2 = new tb.vpq
            r2.<init>()
            r1.mStatistics = r2
            r1.mtopStreamResponse = r3
            r1.mtopBaseOutDo = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse.<init>(int, tb.m7j, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
    }

    private JSONObject getMeta() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec4670a2", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(StreamRemoteMainResponse streamRemoteMainResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/stream/internal/response/StreamRemoteMainResponse");
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse
    public MtopResponse createMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6994c98f", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setApi(this.mtopStreamResponse.c);
        mtopResponse.setBytedata(this.mtopStreamResponse.e);
        mtopResponse.setRetCode(this.mtopStreamResponse.f23820a);
        mtopResponse.setRetMsg(this.mtopStreamResponse.b);
        mtopResponse.setV(this.mtopStreamResponse.d);
        mtopResponse.setHeaderFields(this.mtopStreamResponse.g);
        return mtopResponse;
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this});
        }
        return this.mtopBaseOutDo;
    }

    public m7j getMtopStreamResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7j) ipChange.ipc$dispatch("d4050ea7", new Object[]{this});
        }
        return this.mtopStreamResponse;
    }

    public vpq getStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpq) ipChange.ipc$dispatch("b4a4ff20", new Object[]{this});
        }
        return this.mStatistics;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        if (getHeaders() == null) {
            return "";
        }
        return beu.a(getHeaders().get(HttpConstant.EAGLE_EYE_ID_2));
    }

    public boolean isBizSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b7e3c5", new Object[]{this})).booleanValue();
        }
        return this.isBizSuccess;
    }

    public boolean isRetSuccess(String[] strArr) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b72ed0", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            if (StringUtils.isNotBlank(str) && (split = str.split("::")) != null && split.length > 1) {
                String str2 = split[0];
                this.retCode = str2;
                this.retMsg = split[1];
                return "SUCCESS".equals(str2);
            }
        }
        return false;
    }

    public void parseBizSuccess(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0ea755", new Object[]{this, strArr});
        } else {
            this.isBizSuccess = isRetSuccess(strArr);
        }
    }

    public String getReqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        Map<String, List<String>> map = this.mtopStreamResponse.g;
        if (map == null) {
            return null;
        }
        List<String> list = map.get("mtop-nextrpc-req-id");
        if (list == null) {
            list = map.get("MTOP-nextrpc-req-id");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public String getAttachedResponseStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11311bea", new Object[]{this});
        }
        if (this.attachedResponseStat == null) {
            JSONObject meta = getMeta();
            if (meta != null) {
                return meta.getString("attached-responses-stat");
            }
            String str = null;
            if (getMainNum() != 1) {
                return null;
            }
            List<String> list = getHeaders().get("mtop-nextrpc-attached-responses-stat");
            if (list == null || list.isEmpty()) {
                list = getHeaders().get("MTOP-nextrpc-attached-responses-stat");
            }
            if (list != null && !list.isEmpty()) {
                str = list.get(0);
            }
            if (str != null) {
                try {
                    str = URLDecoder.decode(str, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            this.attachedResponseStat = str;
        }
        return this.attachedResponseStat;
    }
}
