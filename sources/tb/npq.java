package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.internal.accs.AccsServiceManager;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.stream.internal.StreamNextRpcRequestImpl;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class npq implements lpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, List<npq>> e = new HashMap();
    public static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f24882a;
    public final String b;
    public final Map<String, IStreamMtopRequestCallback> c;
    public final qoq d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements wpq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
            } else {
                npq.b(npq.this, str);
            }
        }
    }

    public npq(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.f24882a = context.getApplicationContext();
        this.b = str;
        synchronized (f) {
            try {
                Map<String, List<npq>> map = e;
                List list = (List) ((HashMap) map).get(str);
                list = list == null ? new ArrayList() : list;
                list.add(this);
                ((HashMap) map).put(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            qoq qoqVar = new qoq(concurrentHashMap);
            this.d = qoqVar;
            AccsServiceManager.b().a(context, str, qoqVar);
        }
        q70.a(context);
    }

    public static /* synthetic */ void b(npq npqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe6329b", new Object[]{npqVar, str});
        } else {
            npqVar.d(str);
        }
    }

    @Override // tb.lpq
    public String a(StreamNextRpcRequest streamNextRpcRequest, ppq ppqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c56fdb", new Object[]{this, streamNextRpcRequest, ppqVar});
        }
        StreamNextRpcRequestImpl streamNextRpcRequestImpl = new StreamNextRpcRequestImpl();
        String request = streamNextRpcRequestImpl.request(streamNextRpcRequest, ppqVar, new a());
        UnifyLog.d("StreamNextRpcRequestClientImpl", "Current reqId = " + request, new Object[0]);
        c(request, streamNextRpcRequestImpl);
        return request;
    }

    public final void c(String str, IStreamMtopRequestCallback iStreamMtopRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d0000a", new Object[]{this, str, iStreamMtopRequestCallback});
        } else {
            ((ConcurrentHashMap) this.c).put(str, iStreamMtopRequestCallback);
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8457467", new Object[]{this, str});
            return;
        }
        Map<String, IStreamMtopRequestCallback> map = this.c;
        if (map != null) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }

    @Override // tb.lpq
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        synchronized (f) {
            try {
                Map<String, List<npq>> map = e;
                List list = (List) ((HashMap) map).get(this.b);
                if (list != null) {
                    list.remove(this);
                    if (list.size() == 0) {
                        ((HashMap) map).remove(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(this.b) && this.d != null) {
            AccsServiceManager.b().d(this.f24882a, this.b, this.d);
        }
        for (String str : ((ConcurrentHashMap) this.c).keySet()) {
            if (str != null) {
                IStreamMtopRequestCallback iStreamMtopRequestCallback = (IStreamMtopRequestCallback) ((ConcurrentHashMap) this.c).get(str);
                if (iStreamMtopRequestCallback instanceof yjc) {
                    ((dtd) iStreamMtopRequestCallback).release();
                }
            }
        }
    }
}
