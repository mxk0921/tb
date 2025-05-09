package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792189);
    }

    public static q3p a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3p) ipChange.ipc$dispatch("688eb2a2", new Object[]{str, str2});
        }
        q3p q3pVar = new q3p();
        if (TextUtils.isEmpty(str)) {
            return q3pVar;
        }
        yko ykoVar = yak.f31939a;
        if (ykoVar != null) {
            str = ykoVar.c().e(str, str2);
        }
        try {
            b4p.g("SearchRequestUtil", "request url：" + str);
            HttpNetwork httpNetwork = new HttpNetwork(Globals.getApplication());
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setBizId(89);
            requestImpl.setConnectTimeout(20000);
            requestImpl.setReadTimeout(20000);
            requestImpl.setRetryTime(0);
            Response syncSend = httpNetwork.syncSend(requestImpl, null);
            int statusCode = syncSend.getStatusCode();
            b4p.g("SearchRequestUtil", "status code：" + statusCode);
            if (statusCode > 0) {
                q3pVar.f23773a = true;
                q3pVar.b = syncSend.getBytedata();
                b4p.g("SearchRequestUtil", "success：" + str);
                yko ykoVar2 = yak.f31939a;
                if (ykoVar2 != null) {
                    ykoVar2.c().f(str, q3pVar.b, str2, false);
                }
            } else {
                b4p.k("SearchRequestUtil", "failure：" + str);
            }
        } catch (Exception e) {
            b4p.l("SearchRequestUtil", "fail to request with the url", e);
        }
        return q3pVar;
    }
}
