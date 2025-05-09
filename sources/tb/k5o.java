package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k5o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.RequestPool";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<MtopBusiness>> f22419a = new HashMap();
    public final Lock b = new ReentrantLock();

    static {
        t2o.a(589299730);
    }

    public void a(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed65b7", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop, str);
            List list = (List) ((HashMap) this.f22419a).get(c);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(mtopBusiness);
            ((HashMap) this.f22419a).put(c, list);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(c);
                sb.append(" [addToRequestPool] add mtopBuilder to RequestPool.");
                if (mtopBusiness.getMtopContext() != null) {
                    str2 = mtopBusiness.getMtopContext().h;
                } else {
                    str2 = null;
                }
                TBSdkLog.e(TAG, str2, sb.toString());
            }
            ((ReentrantLock) this.b).unlock();
        } catch (Throwable th) {
            ((ReentrantLock) this.b).unlock();
            throw th;
        }
    }

    public void b(Mtop mtop, String str, String str2, String str3) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e9166a", new Object[]{this, mtop, str, str2, str3});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop, str);
            List<MtopBusiness> list = (List) ((HashMap) this.f22419a).remove(c);
            if (list != null && !list.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(c);
                    sb.append(" [failAllRequest]fail all request,current size=");
                    sb.append(list.size());
                    TBSdkLog.e(TAG, sb.toString());
                }
                for (MtopBusiness mtopBusiness : list) {
                    if (mtopBusiness.request != null) {
                        mtopResponse = new MtopResponse(mtopBusiness.request.getApiName(), mtopBusiness.request.getVersion(), str2, str3);
                    } else {
                        mtopResponse = new MtopResponse(str2, str3);
                    }
                    w4j mtopContext = mtopBusiness.getMtopContext();
                    if (mtopContext == null) {
                        mtopContext = mtopBusiness.createMtopContext(mtopBusiness.listener);
                    }
                    mtopContext.c = mtopResponse;
                    try {
                        ui9.prefetchDuplexFilter.c(mtopContext);
                        ui9.errorCodeMappingAfterFilter.c(mtopContext);
                    } catch (Exception e) {
                        TBSdkLog.e(TAG, "[failAllRequest] do ErrorCode Mapping error.apiKey=" + mtopResponse.getFullKey(), e);
                    }
                    HandlerParam a2 = osa.a(null, null, mtopBusiness);
                    a2.mtopResponse = mtopResponse;
                    MtopNetworkProp mtopNetworkProp = mtopBusiness.mtopProp;
                    if (mtopNetworkProp == null || !mtopNetworkProp.streamMode) {
                        osa.b().obtainMessage(3, a2).sendToTarget();
                    } else {
                        if (mtopResponse.getStreamModeData() == null) {
                            jpq jpqVar = new jpq();
                            jpqVar.b = 0;
                            jpqVar.h = 0;
                            a2.mtopResponse.setStreamModeData(jpqVar);
                        }
                        osa.b().obtainMessage(11, a2).sendToTarget();
                    }
                }
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }

    public final String c(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70fffeac", new Object[]{this, mtop, str});
        }
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return StringUtils.concatStr(mtop.getInstanceId(), str);
    }

    public void d(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc851573", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop, str);
            List list = (List) ((HashMap) this.f22419a).get(c);
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(c);
                sb.append(" [removeRequest] remove single request.");
                if (mtopBusiness.getMtopContext() != null) {
                    str2 = mtopBusiness.getMtopContext().h;
                } else {
                    str2 = null;
                }
                TBSdkLog.e(TAG, str2, sb.toString());
                list.remove(mtopBusiness);
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }

    public void e(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb4f9e0", new Object[]{this, mtop, str});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop, str);
            List<MtopBusiness> list = (List) ((HashMap) this.f22419a).remove(c);
            if (list != null && !list.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(c);
                    sb.append(" [retryAllRequest] retry all request,current size=");
                    sb.append(list.size());
                    TBSdkLog.e(TAG, sb.toString());
                }
                for (MtopBusiness mtopBusiness : list) {
                    MtopListener mtopListener = mtopBusiness.listener;
                    if (mtopListener instanceof IInteractingListener) {
                        ((IInteractingListener) mtopListener).onInteract("interact_finish");
                    }
                    if (!mtopBusiness.isTaskCanceled()) {
                        mtopBusiness.retryRequest();
                    }
                }
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }

    public void f(Mtop mtop, String str, MtopBusiness mtopBusiness) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdddfcf", new Object[]{this, mtop, str, mtopBusiness});
            return;
        }
        ((ReentrantLock) this.b).lock();
        try {
            String c = c(mtop, str);
            List list = (List) ((HashMap) this.f22419a).get(c);
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(c);
                sb.append(" [retrySingleRequest] retry single request.");
                if (mtopBusiness.getMtopContext() != null) {
                    str2 = mtopBusiness.getMtopContext().h;
                } else {
                    str2 = null;
                }
                TBSdkLog.e(TAG, str2, sb.toString());
                if (!mtopBusiness.isTaskCanceled() && list.contains(mtopBusiness)) {
                    mtopBusiness.retryRequest();
                    list.remove(mtopBusiness);
                }
                ((ReentrantLock) this.b).unlock();
            }
        } finally {
            ((ReentrantLock) this.b).unlock();
        }
    }
}
