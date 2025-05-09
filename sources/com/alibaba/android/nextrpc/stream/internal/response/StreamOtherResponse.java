package com.alibaba.android.nextrpc.stream.internal.response;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.p4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StreamOtherResponse extends AbsStreamResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] byteData;
    private String mappingCode;
    private p4j mtopBaseStreamEvent;
    private int responseCode;
    private String[] ret;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public StreamOtherResponse(tb.p4j r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r2.f25875a
            goto L_0x0006
        L_0x0005:
            r0 = 0
        L_0x0006:
            r1.<init>(r0, r5, r6)
            r1.mtopBaseStreamEvent = r2
            r1.api = r3
            r1.version = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse.<init>(tb.p4j, java.lang.String, java.lang.String, int, java.lang.Object):void");
    }

    public static /* synthetic */ Object ipc$super(StreamOtherResponse streamOtherResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/stream/internal/response/StreamOtherResponse");
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse
    public MtopResponse createMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6994c98f", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setApi(this.api);
        mtopResponse.setRetCode(this.mtopBaseStreamEvent.b);
        mtopResponse.setRetMsg(this.mtopBaseStreamEvent.c);
        mtopResponse.setV(this.version);
        mtopResponse.setHeaderFields(this.mtopBaseStreamEvent.f25875a);
        mtopResponse.setResponseCode(this.responseCode);
        mtopResponse.mappingCode = this.mappingCode;
        mtopResponse.setRet(this.ret);
        mtopResponse.setBytedata(this.byteData);
        return mtopResponse;
    }

    public String getMappingCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this});
        }
        return this.mappingCode;
    }

    public p4j getMtopBaseStreamEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p4j) ipChange.ipc$dispatch("1d4a7bf1", new Object[]{this});
        }
        return this.mtopBaseStreamEvent;
    }

    public int getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        return this.responseCode;
    }

    public void setByteData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aec3e2", new Object[]{this, bArr});
        } else {
            this.byteData = bArr;
        }
    }

    public void setMappingCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb8fea", new Object[]{this, str});
        } else {
            this.mappingCode = str;
        }
    }

    public void setResponseCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75df560c", new Object[]{this, new Integer(i)});
        } else {
            this.responseCode = i;
        }
    }

    public void setRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923179", new Object[]{this, strArr});
        } else {
            this.ret = strArr;
        }
    }
}
