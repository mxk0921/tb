package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.WebSocket;
import tb.oho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class p12<REQUEST extends oho> implements mho<REQUEST> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001619);
        t2o.a(993001620);
    }

    @Override // tb.mho
    public void a(REQUEST request, WebSocket webSocket, tix tixVar, tho<REQUEST> thoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e5fe8", new Object[]{this, request, webSocket, tixVar, thoVar});
            return;
        }
        try {
            ((nwf) thoVar).n(request, b(request), webSocket);
        } catch (Throwable th) {
            ((nwf) thoVar).k(request, th, webSocket);
        }
    }

    public abstract Object b(REQUEST request);
}
