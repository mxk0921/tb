package tb;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;
import tb.oit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o7b implements oit.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.oit.f
    public byte[] loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a53a13a3", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
        Response syncSend = new DegradableNetwork(null).syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            return syncSend.getBytedata();
        }
        AliMonitorInterface c = nq0.c();
        if (c != null) {
            c.b(tl7.TAG, "DownloadTemplateError", "templateUrl=" + str + ",errorCode=" + syncSend.getStatusCode(), 1.0d);
        }
        return null;
    }
}
