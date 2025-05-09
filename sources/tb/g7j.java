package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.RequestTask;
import com.taobao.tao.recommend3.gateway.request.StreamRequestTask;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809811);
    }

    public static void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64e0e79", new Object[]{str, awesomeGetRequestParams, awesomeGetData});
        } else if (awesomeGetRequestParams != null && awesomeGetData != null && awesomeGetData.getExt() != null) {
            boolean booleanValue = awesomeGetData.getExt().getBooleanValue("newUserDisableMtopSignFree");
            d(booleanValue);
            if (TextUtils.equals(str, "coldStart") && booleanValue) {
                if (TextUtils.equals(awesomeGetRequestParams.API_NAME, RequestTask.HOME_SIGN_FREE_API_NAME) || TextUtils.equals(awesomeGetRequestParams.API_NAME, StreamRequestTask.HOME_STREAM_SIGN_FREE_API_NAME)) {
                    c();
                }
            }
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4795223a", new Object[0])).booleanValue();
        }
        return qy8.b.b("homepage_switch", "newUserDisableMtopSignFree", false);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80ee9a6", new Object[0]);
        } else {
            yyj.e().M();
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1282b1", new Object[]{new Boolean(z)});
        } else {
            qy8.b.g("homepage_switch", "newUserDisableMtopSignFree", z);
        }
    }
}
