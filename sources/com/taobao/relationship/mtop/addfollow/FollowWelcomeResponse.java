package com.taobao.relationship.mtop.addfollow;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowWelcomeResponse extends BaseOutDo implements Serializable {
    public FollowWelcomeData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class FollowWelcomeData implements Serializable {
        private static final long serialVersionUID = -511206989537194788L;
        public String content;
        public String nick;
        public String richContent;
        public int tabIconType;

        static {
            t2o.a(759169054);
        }
    }

    static {
        t2o.a(759169053);
    }

    public void setData(FollowWelcomeData followWelcomeData) {
        this.data = followWelcomeData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public FollowWelcomeData getData() {
        return this.data;
    }
}
