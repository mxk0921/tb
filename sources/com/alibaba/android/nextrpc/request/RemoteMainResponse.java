package com.alibaba.android.nextrpc.request;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.beu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteMainResponse extends AbsResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE = "mtop-nextrpc-has-attached-response";
    public static final String MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE_UPPER_CASE = "MTOP-nextrpc-has-attached-response";
    public static final String MAIN_RESPONSE_HEADER_REQ_ID = "mtop-nextrpc-req-id";
    public static final String MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE = "MTOP-nextrpc-req-id";
    public static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT = "mtop-nextrpc-attached-responses-stat";
    public static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE = "MTOP-nextrpc-attached-responses-stat";
    private String attachedResponseStat;
    private final BaseOutDo mtopBaseOutDo;
    private final Object mtopRequestContext;
    private final int mtopRequestType;
    private final MtopResponse mtopResponse;

    public static /* synthetic */ Object ipc$super(RemoteMainResponse remoteMainResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/request/RemoteMainResponse");
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this});
        }
        return this.mtopBaseOutDo;
    }

    public Object getMtopRequestContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7c97b24d", new Object[]{this});
        }
        return this.mtopRequestContext;
    }

    public int getMtopRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbd03c45", new Object[]{this})).intValue();
        }
        return this.mtopRequestType;
    }

    public MtopResponse getMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this});
        }
        return this.mtopResponse;
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

    public String getAttachedResponseStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11311bea", new Object[]{this});
        }
        if (this.attachedResponseStat == null) {
            List<String> list = getHeaders().get(RESPONSE_HEADER_ATTACHED_RESPONSE_STAT);
            if (list == null || list.isEmpty()) {
                list = getHeaders().get(RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE);
            }
            String str = (list == null || list.isEmpty()) ? null : list.get(0);
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

    @Override // com.alibaba.android.nextrpc.request.AbsResponse
    public String getReqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        Map<String, List<String>> headerFields = this.mtopResponse.getHeaderFields();
        if (headerFields == null) {
            return null;
        }
        List<String> list = headerFields.get(MAIN_RESPONSE_HEADER_REQ_ID);
        if (list == null) {
            list = headerFields.get(MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE);
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public boolean hasAttachedResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd0881ca", new Object[]{this})).booleanValue();
        }
        Map<String, List<String>> headerFields = this.mtopResponse.getHeaderFields();
        if (headerFields == null) {
            return false;
        }
        List<String> list = headerFields.get(MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE);
        if (list == null) {
            list = headerFields.get(MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE_UPPER_CASE);
        }
        if (list == null || list.size() == 0) {
            return false;
        }
        return Boolean.parseBoolean(list.get(0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RemoteMainResponse(java.lang.String r5, int r6, mtopsdk.mtop.domain.MtopResponse r7, mtopsdk.mtop.domain.BaseOutDo r8, java.lang.Object r9) {
        /*
            r4 = this;
            if (r7 == 0) goto L_0x0007
            java.util.Map r0 = r7.getHeaderFields()
            goto L_0x000c
        L_0x0007:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x000c:
            r4.<init>(r5, r0)
            java.lang.String r5 = ""
            if (r7 != 0) goto L_0x0017
            r4.setBody(r5)
            goto L_0x004e
        L_0x0017:
            java.lang.String r0 = "start parse body"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "purchase-nextrpc"
            com.alibaba.android.nextrpc.internal.utils.UnifyLog.c(r3, r0, r2)
            com.alibaba.fastjson.JSONObject r0 = r7.getOriginFastJsonObject()
            if (r0 == 0) goto L_0x0035
            java.lang.String r5 = "parse body,mtop流式解析JSON"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.alibaba.android.nextrpc.internal.utils.UnifyLog.c(r3, r5, r2)
            r4.setOriginBody(r0)
            goto L_0x0047
        L_0x0035:
            byte[] r0 = r7.getBytedata()
            if (r0 == 0) goto L_0x0044
            java.lang.String r5 = new java.lang.String
            byte[] r0 = r7.getBytedata()
            r5.<init>(r0)
        L_0x0044:
            r4.setBody(r5)
        L_0x0047:
            java.lang.String r5 = "end parse body"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.alibaba.android.nextrpc.internal.utils.UnifyLog.c(r3, r5, r0)
        L_0x004e:
            r4.mtopRequestType = r6
            r4.mtopResponse = r7
            r4.mtopBaseOutDo = r8
            r4.mtopRequestContext = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.request.RemoteMainResponse.<init>(java.lang.String, int, mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
    }
}
