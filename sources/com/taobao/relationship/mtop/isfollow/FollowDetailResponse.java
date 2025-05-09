package com.taobao.relationship.mtop.isfollow;

import com.taobao.relationship.mtop.BasicResponse;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowDetailResponse extends BasicResponse {
    public FollowDetail data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class FollowDetail implements Serializable {
        public long accountId;
        public boolean dynamic;
        public boolean follow;
        public String followExtra = "";
        public boolean quiet;

        static {
            t2o.a(759169058);
        }
    }

    static {
        t2o.a(759169057);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    public FollowDetail getData() {
        return this.data;
    }
}
