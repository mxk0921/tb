package tb;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.passivelocation.business.report_error.MtopLbsReportLocationErrRequest;
import com.taobao.passivelocation.business.report_error.MtopLbsReportLocationErrResponse;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceRequest;
import com.taobao.passivelocation.business.report_location.MtopLbsPosServiceResponse;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2o extends h00 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQ_TYPE_REPORT_ERROR = 3;
    public static final int REQ_TYPE_REPORT_LOCATION = 2;

    static {
        t2o.a(789577754);
    }

    public f2o(Application application) {
        super(application);
    }

    public static /* synthetic */ Object ipc$super(f2o f2oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/report/ReportBusiness");
    }

    public final String a(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("981ae495", new Object[]{this, map, lbsdto});
        }
        HashMap hashMap = new HashMap();
        if (lbsdto == null) {
            return JSON.toJSONString(hashMap);
        }
        String str = "";
        String str2 = map == null ? str : map.get(zah.d);
        if (TextUtils.isEmpty(str2)) {
            str2 = "12";
        }
        hashMap.put("code", str2);
        if (map != null) {
            str = map.get(zah.e);
        }
        hashMap.put("outcode", str);
        hashMap.put("deviceid", UTDevice.getUtdid(Globals.getApplication()));
        hashMap.put("userid", Login.getUserId());
        hashMap.put("ttid", TaoPackageInfo.getTTID());
        hashMap.put("osversion", Build.VERSION.RELEASE);
        hashMap.put(pod.IP, lbsdto.getIp());
        hashMap.put("appkey", "21646297");
        return JSON.toJSONString(hashMap);
    }

    public void b(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db8a787", new Object[]{this, map, lbsdto});
            return;
        }
        try {
            MtopLbsReportLocationErrRequest mtopLbsReportLocationErrRequest = new MtopLbsReportLocationErrRequest();
            mtopLbsReportLocationErrRequest.setErrorInfo(a(map, lbsdto));
            RemoteBusiness.build(this.mApplication, mtopLbsReportLocationErrRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.mRemoteListener).showLoginUI(false).setBizId(75).startRequest(3, MtopLbsReportLocationErrResponse.class);
        } catch (Exception unused) {
        }
    }

    public void reportLbsData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecc2184", new Object[]{this, str});
            return;
        }
        MtopLbsPosServiceRequest mtopLbsPosServiceRequest = new MtopLbsPosServiceRequest();
        try {
            mtopLbsPosServiceRequest.setLoc(cyv.a(Globals.getApplication(), "lbsCollect", str));
            mtopLbsPosServiceRequest.setLocVersion("1.1");
            RemoteBusiness.build(this.mApplication, mtopLbsPosServiceRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.mRemoteListener).showLoginUI(false).setBizId(75).startRequest(2, MtopLbsPosServiceResponse.class);
        } catch (Exception unused) {
        }
    }
}
