package com.taobao.taopai2.material.business.musiclist;

import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.request.Response;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicListResponseModel implements Serializable {
    public Paging paging;
    public List<MusicItemBean> result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MusicListResponse extends Response<MusicListResponseModel> {
        static {
            t2o.a(782237876);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Paging implements Serializable {
        public int page;
        public int pageSize;
        public int totalCnt;
        public int totalPage;

        static {
            t2o.a(782237877);
        }
    }

    static {
        t2o.a(782237875);
    }
}
