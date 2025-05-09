package mtopsdk.mtop.deviceid.domain;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopSysNewDeviceIdResponse extends BaseOutDo {
    private MtopSysNewDeviceIdResponseData data;

    static {
        t2o.a(589299900);
    }

    public void setData(MtopSysNewDeviceIdResponseData mtopSysNewDeviceIdResponseData) {
        this.data = mtopSysNewDeviceIdResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopSysNewDeviceIdResponseData getData() {
        return this.data;
    }
}
