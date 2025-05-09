package com.taobao.favorites.favoritesdk.category.response;

import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryQueryShareListResponseData implements IMTOPDataObject {
    public boolean hasMore;
    public ArrayList<ShareListItem> resultList;
    public String userId;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ShareListItem implements IMTOPDataObject {
        public String alreadyLike;
        public int collectCount;
        public String coverImgUrl;
        public String cursor;
        public String desc;
        public String headPic;
        public boolean isSelected;
        public boolean isShowTypeName;
        public boolean isSync;
        public String likeCount;
        public long listId;
        public long moduleId;
        public int shareType;
        public long source;
        public String title;
        public int totalCount;
        public long type;
        public String userId;

        static {
            t2o.a(707788851);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(707788850);
        t2o.a(589299906);
    }
}
