package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback;

import com.alibaba.fastjson.JSONObject;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedbackResponse extends BaseOutDo {
    private FeedbackData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class FeedbackData implements IMTOPDataObject {
        public List<JSONObject> cardList;

        static {
            t2o.a(310378769);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(310378768);
    }

    public void setData(FeedbackData feedbackData) {
        this.data = feedbackData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public FeedbackData getData() {
        return this.data;
    }
}
