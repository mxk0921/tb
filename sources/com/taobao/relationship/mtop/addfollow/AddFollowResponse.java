package com.taobao.relationship.mtop.addfollow;

import com.taobao.relationship.mtop.BasicOperationResponse;
import com.taobao.relationship.mtop.BasicResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AddFollowResponse extends BasicResponse {
    public AddFollowData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class AddFollowData extends BasicOperationResponse {
        public boolean followAccount;
        public boolean subscribe;
        public String accountName = "";
        public String toastMsg = "";
        public String followExtra = "";

        static {
            t2o.a(759169051);
        }
    }

    static {
        t2o.a(759169050);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    public AddFollowData getData() {
        return this.data;
    }
}
