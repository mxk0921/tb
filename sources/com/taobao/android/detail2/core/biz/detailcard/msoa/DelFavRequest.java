package com.taobao.android.detail2.core.biz.detailcard.msoa;

import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import java.util.Map;
import tb.t2o;
import tb.vrh;

/* compiled from: Taobao */
@MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.deleteFavoriteItem", version = "1.0")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DelFavRequest extends vrh {
    static {
        t2o.a(352321551);
    }

    public DelFavRequest(String str, Map<String, Object> map) {
        super(str, map);
    }
}
