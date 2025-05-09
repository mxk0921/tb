package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.egq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<cfq>> f17051a = new HashMap();
    public final Lock b = new ReentrantLock();

    public cgq() {
        s5o.b(new dgq());
    }

    public void a(Mtop mtop, cfq cfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55bc0c0", new Object[]{this, mtop, cfqVar});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop);
            List list = (List) ((HashMap) this.f17051a).get(c);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(cfqVar);
            ((HashMap) this.f17051a).put(c, list);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(c);
                sb.append(" [addToRequestPool] add ssrBusiness to RequestPool.");
                TBSdkLog.e("ssr.SsrRequestPool", cfqVar.r(), sb.toString());
            }
            ((ReentrantLock) this.b).unlock();
        } catch (Throwable th) {
            ((ReentrantLock) this.b).unlock();
            throw th;
        }
    }

    public void b(Mtop mtop, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9273d4a0", new Object[]{this, mtop, str, str2});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop);
            List<cfq> list = (List) ((HashMap) this.f17051a).remove(c);
            if (list != null && !list.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(c);
                    sb.append(" [failAllRequest]fail all request,current size=");
                    sb.append(list.size());
                    TBSdkLog.e("ssr.SsrRequestPool", sb.toString());
                }
                for (cfq cfqVar : list) {
                    egq a2 = new egq.b().b(200).e(str).d(str2).a();
                    ofq a3 = nfq.a(null, cfqVar);
                    a3.c = a2;
                    nfq.d().obtainMessage(2, a3).sendToTarget();
                }
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }

    public final String c(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e7d34b6", new Object[]{this, mtop});
        }
        return StringUtils.concatStr(mtop.getInstanceId(), "DEFAULT");
    }

    public void d(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dac996", new Object[]{this, mtop});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop);
            List<cfq> list = (List) ((HashMap) this.f17051a).remove(c);
            if (list != null && !list.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(c);
                    sb.append(" [retryAllRequest] retry all request,current size=");
                    sb.append(list.size());
                    TBSdkLog.e("ssr.SsrRequestPool", sb.toString());
                }
                for (cfq cfqVar : list) {
                    if (!cfqVar.u()) {
                        cfqVar.w();
                    }
                }
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }
}
