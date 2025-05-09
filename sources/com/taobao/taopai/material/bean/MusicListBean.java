package com.taobao.taopai.material.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicListBean implements IMTOPDataObject {
    @JSONField(name = "paging")
    public PageInfo mPageInfo;
    @JSONField(name = "result")
    public ArrayList<MusicItemBean> module;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PageInfo implements IMTOPDataObject {
        @JSONField(name = "page")
        public int currentPage;
        public int pageSize;
        public int totalCnt;
        public int totalPage;

        static {
            t2o.a(782237743);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(782237742);
        t2o.a(589299906);
    }
}
