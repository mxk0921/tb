package com.taobao.relationship.mtop.removefollow;

import com.taobao.relationship.mtop.BasicOperationResponse;
import com.taobao.relationship.mtop.BasicResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RemoveFollowResponse extends BasicResponse {
    public RemoveFollowData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RemoveFollowData extends BasicOperationResponse {
        public String toastMsg = "";
        public String followExtra = "";

        static {
            t2o.a(759169062);
        }
    }

    static {
        t2o.a(759169061);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    public RemoveFollowData getData() {
        return this.data;
    }
}
