package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.pojo.request.SendCpcInfoRequest;
import com.taobao.alimama.net.pojo.response.P4pCpcInfoResponse;
import com.taobao.business.mtop.MunionRemoteBusiness;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lhl extends MunionRemoteBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int REQ_TYPE_SEND_P4P_INFO = 0;

    static {
        t2o.a(1021313046);
    }

    public lhl(Application application) {
        super(application);
    }

    public static /* synthetic */ Object ipc$super(lhl lhlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/business/p4p/P4pCpcBusiness");
    }

    public void a(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4a7513", new Object[]{this, obj, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        SendCpcInfoRequest sendCpcInfoRequest = new SendCpcInfoRequest();
        sendCpcInfoRequest.setCna(str);
        sendCpcInfoRequest.setUtdid(str2);
        sendCpcInfoRequest.setE(str3);
        sendCpcInfoRequest.setExt(str4);
        sendCpcInfoRequest.setReferer(str5);
        sendCpcInfoRequest.setAccept(str6);
        sendCpcInfoRequest.setUtkey(str7);
        sendCpcInfoRequest.setUtsid(str8);
        sendCpcInfoRequest.setHost(str9);
        startRequest(0, sendCpcInfoRequest, P4pCpcInfoResponse.class);
    }
}
