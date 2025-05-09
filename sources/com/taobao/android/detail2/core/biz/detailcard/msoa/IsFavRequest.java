package com.taobao.android.detail2.core.biz.detailcard.msoa;

import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import java.util.Map;
import tb.t2o;
import tb.vrh;

/* compiled from: Taobao */
@MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.isFavoriteItem", version = "1.0")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IsFavRequest extends vrh {
    static {
        t2o.a(352321552);
    }

    public IsFavRequest(String str, Map<String, Object> map) {
        super(str, map);
    }
}
