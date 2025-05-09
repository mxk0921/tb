package com.taobao.search.jarvis.rcmd;

import android.text.TextUtils;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import java.util.Map;
import tb.bpw;
import tb.cxw;
import tb.pox;
import tb.q6p;
import tb.r4p;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchXslDatasource extends XslDataSource {
    private static final String STORAGE_KEY_VERSION = "version";

    static {
        t2o.a(815792299);
    }

    public SearchXslDatasource(yko ykoVar) {
        super(ykoVar);
        registerTemplateLoadListener(new bpw());
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.XslDataSource, com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void addTppPageParam(Map<String, String> map) {
        super.addTppPageParam(map);
        if (getTotalSearchResult() != 0) {
            String extMod = ((XslSearchResult) getTotalSearchResult()).getExtMod("jarvisModelName");
            if (!TextUtils.isEmpty(extMod)) {
                String a2 = cxw.a(extMod, "version");
                if (!TextUtils.isEmpty(a2)) {
                    map.put(r4p.KEY_MODEL_NAME, extMod);
                    map.put(r4p.KEY_MODEL_VERSION, a2);
                }
            }
        }
    }

    @Override // com.taobao.android.meta.data.a, tb.gy
    public pox onCreateRequestAdapter() {
        return new q6p(c());
    }
}
