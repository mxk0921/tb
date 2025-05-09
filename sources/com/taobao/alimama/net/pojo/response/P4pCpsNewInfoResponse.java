package com.taobao.alimama.net.pojo.response;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class P4pCpsNewInfoResponse extends BaseOutDo implements IMTOPDataObject {
    private static final long serialVersionUID = -3871455772294398291L;
    private Map<String, String> data;

    static {
        t2o.a(1018167369);
        t2o.a(589299906);
    }

    public void setData(Map<String, String> map) {
        this.data = map;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public Map<String, String> getData() {
        return this.data;
    }
}
