package mtopsdk.instanceconfigs;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopExternalInstanceConfigsGetResponse extends BaseOutDo {
    private MtopExternalInstanceConfigsData data;

    static {
        t2o.a(589299851);
    }

    public void setData(MtopExternalInstanceConfigsData mtopExternalInstanceConfigsData) {
        this.data = mtopExternalInstanceConfigsData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopExternalInstanceConfigsData getData() {
        return this.data;
    }
}
