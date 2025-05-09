package tb;

import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class dt implements ubb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740470);
        t2o.a(80740471);
    }

    public static void c(boolean z, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ad2600", new Object[]{new Boolean(z), runnable, runnable2});
        } else if (z) {
            ck.g().e("切换到主线程", ck.b.b().i("AURA/performance").a());
            dn.g(runnable, runnable2);
        } else {
            try {
                runnable.run();
            } catch (Throwable th) {
                ck.g().e(AURATraceUtil.c(th), ck.b.b().i("AURA/error").a());
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }
    }

    public static List<kk> d(List<dh1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0ab349e", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (dh1 dh1Var : list) {
            if (th.c()) {
                rbb g = ck.g();
                g.e("接收到异步数据：" + dh1Var.b(), ck.b.b().i("AURA/ability").a());
            }
            kk kkVar = new kk();
            kkVar.w(dh1Var.f());
            kkVar.n(dh1Var.b());
            kkVar.p(dh1Var.c());
            kkVar.m(dh1Var);
            arrayList.add(kkVar);
        }
        return arrayList;
    }

    public static List<kk> e(List<AttachedResponse> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43fab5d4", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (AttachedResponse attachedResponse : list) {
            if (th.c()) {
                rbb g = ck.g();
                g.e("接收到异步数据：" + attachedResponse.getBody(), ck.b.b().i("AURA/ability").a());
            }
            if (attachedResponse != null && str.equalsIgnoreCase(attachedResponse.getReqId())) {
                kk kkVar = new kk();
                kkVar.u(attachedResponse.getErrorCode());
                kkVar.v(attachedResponse.getErrorMsg());
                kkVar.w(attachedResponse.isSucceed().booleanValue());
                kkVar.n(tj.a(attachedResponse.getBody()));
                kkVar.o(attachedResponse.getHeaders());
                kkVar.l(attachedResponse);
                arrayList.add(kkVar);
            }
        }
        return arrayList;
    }
}
