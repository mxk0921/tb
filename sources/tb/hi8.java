package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.NetworkUtils;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hi8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262785);
    }

    public static boolean b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce60ff0", new Object[]{mtopResponse})).booleanValue();
        }
        if (mtopResponse == null) {
            return false;
        }
        if (499 == mtopResponse.getResponseCode() || mtopResponse.isApiLockedResult() || mtopResponse.is41XResult() || q5j.TRAFFIC_LIMIT_STATUS.equals(mtopResponse.getRetCode())) {
            return true;
        }
        return false;
    }

    public static void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac1abe6", new Object[]{context, mtopResponse});
        } else if (mtopResponse == null) {
            Toast.makeText(context, b5m.H().localizedString(R.string.tt_detail_app_busy_system_tired), 0).show();
            tgh.a("mtopResponse is null.");
        } else {
            if (!mtopResponse.isNetworkError() || NetworkUtils.d(mr7.d())) {
                Toast.makeText(context, b5m.H().localizedString(R.string.tt_detail_app_busy_system_tired), 0).show();
            } else {
                Toast.makeText(context, b5m.H().localizedString(R.string.tt_detail_network_timeout), 0).show();
            }
            tgh.a("请求失败，retCode=" + mtopResponse.getRetCode());
        }
    }
}
