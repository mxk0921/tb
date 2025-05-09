package com.alibaba.security.realidentity.biz.uploadresult;

import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UploadResultHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Result result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Result implements Serializable {
        public String uploadId;
        public UploadStatus uploadStatus;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class UploadStatus implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String code;
        public String name;

        public boolean isSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
            }
            return TextUtils.equals("UPLOAD_STATUS_SUCCESS", this.name);
        }
    }

    public static /* synthetic */ Object ipc$super(UploadResultHttpResponse uploadResultHttpResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/uploadresult/UploadResultHttpResponse");
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        UploadStatus uploadStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        Result result = this.result;
        if (result == null || (uploadStatus = result.uploadStatus) == null || !uploadStatus.isSuccess()) {
            return false;
        }
        return true;
    }
}
