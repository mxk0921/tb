package com.taobao.favorites.favoritesdk.goods.response;

import com.alibaba.mtl.appmonitor.AppMonitor;
import java.util.HashMap;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryCheckCollectResponseData implements IMTOPDataObject {
    public HashMap<String, String> result;

    static {
        t2o.a(707788866);
        t2o.a(589299906);
    }

    public HashMap<String, String> getFavCheckResult() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryCheckCollectResponseData", "public HashMap<String, String> getFavCheckResult()", "20180112");
        return this.result;
    }
}
