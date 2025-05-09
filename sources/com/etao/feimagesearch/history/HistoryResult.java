package com.etao.feimagesearch.history;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HistoryResult implements IMTOPDataObject, Serializable {
    public Map<Long, AuctionItemVO> resultData;

    static {
        t2o.a(481296949);
        t2o.a(589299906);
    }

    public void clear() {
        this.resultData.clear();
    }

    public HistoryResult deepClone() {
        HistoryResult historyResult = new HistoryResult();
        historyResult.resultData = new HashMap();
        Map<Long, AuctionItemVO> map = this.resultData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, AuctionItemVO> entry : this.resultData.entrySet()) {
                Long key = entry.getKey();
                AuctionItemVO value = entry.getValue();
                if (!(key == null || value == null)) {
                    historyResult.resultData.put(key, value.deepClone());
                }
            }
        }
        return historyResult;
    }
}
