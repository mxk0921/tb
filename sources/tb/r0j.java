package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.log.TLog;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130585);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a4bec68", new Object[]{new Integer(i)});
        }
        LocationErrorCode locationErrorCode = LocationErrorCode.FAIL;
        if (locationErrorCode.getCode() == i) {
            return locationErrorCode.getDesc();
        }
        LocationErrorCode locationErrorCode2 = LocationErrorCode.FAIL_ALL;
        if (locationErrorCode2.getCode() == i) {
            return locationErrorCode2.getDesc();
        }
        LocationErrorCode locationErrorCode3 = LocationErrorCode.FAIL_LOCATION_TIMEOUT;
        if (locationErrorCode3.getCode() == i) {
            return locationErrorCode3.getDesc();
        }
        LocationErrorCode locationErrorCode4 = LocationErrorCode.FAIL_INVALID_OPTION;
        if (locationErrorCode4.getCode() == i) {
            return locationErrorCode4.getDesc();
        }
        LocationErrorCode locationErrorCode5 = LocationErrorCode.FAIL_INVALID_LOOPER;
        if (locationErrorCode5.getCode() == i) {
            return locationErrorCode5.getDesc();
        }
        LocationErrorCode locationErrorCode6 = LocationErrorCode.FAIL_UNAVALIABLE_SERVICE;
        if (locationErrorCode6.getCode() == i) {
            return locationErrorCode6.getDesc();
        }
        return "";
    }

    public static void b(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b3fc21", new Object[]{tBLocationDTO});
            return;
        }
        if (tBLocationDTO.getErrorCode() == null) {
            tBLocationDTO.setErrorCode(Integer.valueOf(LocationErrorCode.FAIL.getCode()));
        }
        TLog.loge("EditionSwitcher", "locateFailed " + a(tBLocationDTO.getErrorCode().intValue()));
        AppMonitor.Alarm.commitFail("Page_EditionSwitcher", "LocateFailed", String.valueOf(tBLocationDTO.getErrorCode()), a(tBLocationDTO.getErrorCode().intValue()));
    }

    public static void c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e64df", new Object[]{mtopResponse});
            return;
        }
        TLog.loge("EditionSwitcher", "reqeust fail " + mtopResponse.getRetMsg());
        AppMonitor.Alarm.commitFail("Page_EditionSwitcher", "RequestFailed", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
    }
}
