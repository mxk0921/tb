package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class un2 implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299816);
        t2o.a(589299812);
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        ResponseSource responseSource;
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        MtopResponse mtopResponse2 = w4jVar.c;
        if (304 == mtopResponse2.getResponseCode() && (responseSource = w4jVar.j) != null && (mtopResponse = responseSource.cacheResponse) != null) {
            w4jVar.c = mtopResponse;
            ui9.b(w4jVar);
            return FilterManager.STOP;
        } else if (mtopResponse2.getBytedata() == null) {
            mtopResponse2.setRetCode(ErrorConstant.ERRCODE_JSONDATA_BLANK);
            mtopResponse2.setRetMsg(ErrorConstant.ERRMSG_JSONDATA_BLANK);
            ui9.b(w4jVar);
            return FilterManager.STOP;
        } else {
            ui9.c(mtopResponse2);
            return "CONTINUE";
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.BusinessErrorAfterFilter";
    }
}
