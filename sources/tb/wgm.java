package tb;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999965);
    }

    public static void a(PopRequest popRequest, PopRequest.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65150a0", new Object[]{popRequest, status});
        } else if (popRequest != null && status != null) {
            popRequest.H(status);
            PopRequest.b p = popRequest.p();
            if (p != null) {
                if (status == PopRequest.Status.READY) {
                    p.onReady(popRequest);
                } else if (status == PopRequest.Status.SHOWING) {
                    p.onRecovered(popRequest);
                } else if (status == PopRequest.Status.SUSPENDED) {
                    p.onSuspended(popRequest);
                } else if (status == PopRequest.Status.REMOVED) {
                    if (p instanceof PopRequest.c) {
                        ((PopRequest.c) p).onRemoved(popRequest);
                    }
                } else if (status == PopRequest.Status.ENQUEUED) {
                    if (p instanceof PopRequest.c) {
                        ((PopRequest.c) p).onEnqueue(popRequest);
                    }
                } else if (status == PopRequest.Status.FORCE_REMOVED) {
                    p.onForceRemoved(popRequest);
                }
            }
        }
    }
}
