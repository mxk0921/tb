package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(913309705);
    }

    public static void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a6bb2", new Object[]{str, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.emas.mpop.tcb.upload");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        mtopRequest.setData(str);
        Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
        if (instance != null) {
            MtopBusiness build = MtopBusiness.build(instance, mtopRequest);
            build.reqMethod(MethodEnum.POST);
            build.registerListener((IRemoteListener) iRemoteBaseListener).startRequest();
            String b = uov.INSTANCE.b();
            TLog.loge(b, "TuCaoBa data upload", "feedbackContent: " + str);
        }
    }
}
