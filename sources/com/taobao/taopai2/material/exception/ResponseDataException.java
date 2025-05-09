package com.taobao.taopai2.material.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ResponseDataException extends MaterialException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopResponse response;

    static {
        t2o.a(782237920);
    }

    public ResponseDataException(MtopResponse mtopResponse, String str) {
        super(str);
        this.response = mtopResponse;
    }

    public static /* synthetic */ Object ipc$super(ResponseDataException responseDataException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/exception/ResponseDataException");
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        MtopResponse mtopResponse = this.response;
        if (mtopResponse != null) {
            return mtopResponse.getRetCode();
        }
        return this.errorCode;
    }

    @Override // com.taobao.taopai2.material.exception.MaterialException
    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this});
        }
        MtopResponse mtopResponse = this.response;
        if (mtopResponse == null) {
            return getMessage();
        }
        if (mtopResponse.getMtopStat() != null) {
            return this.response.getMtopStat().toString();
        }
        return this.response.getRetCode() + "|" + this.response.getMappingCode();
    }
}
