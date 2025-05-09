package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Set;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xs6 f32950a;
        public final /* synthetic */ Set b;

        public a(xs6 xs6Var, Set set) {
            this.f32950a = xs6Var;
            this.b = set;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            zqm.a(zqm.this, this.f32950a, this.b, str, hashMap);
            i65.c("PrefetchRequest", "MtopPrefetch.IPrefetchCallback: type=" + str);
        }
    }

    static {
        t2o.a(487587895);
    }

    public static /* synthetic */ void a(zqm zqmVar, xs6 xs6Var, Set set, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58434bc1", new Object[]{zqmVar, xs6Var, set, str, hashMap});
        } else {
            zqmVar.b(xs6Var, set, str, hashMap);
        }
    }

    public final void b(xs6 xs6Var, Set<String> set, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9499d27f", new Object[]{this, xs6Var, set, str, hashMap});
            return;
        }
        if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
            i65.c("PrefetchRequest", "命中预请求");
        } else {
            i65.c("PrefetchRequest", "未命中预请求");
        }
        if (xs6Var == null || set == null || set.isEmpty()) {
            i65.c("PrefetchRequest", "预请求结果回调异常");
            return;
        }
        for (String str2 : set) {
            MtopPrefetch.IPrefetchCallback h = xs6Var.h(str2);
            if (h != null) {
                i65.c("PrefetchRequest", "通知：" + str2 + " 预请求命中结果 : " + str);
                h.onPrefetch(str, hashMap);
            }
        }
    }

    public void c(RemoteBusiness remoteBusiness, fs8 fs8Var, xs6 xs6Var, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae8126a", new Object[]{this, remoteBusiness, fs8Var, xs6Var, set});
            return;
        }
        try {
            long parseLong = TextUtils.isEmpty(fs8Var.d) ? 5000L : Long.parseLong(fs8Var.d);
            remoteBusiness.prefetchComparator((MtopPrefetch.IPrefetchComparator) new qls());
            remoteBusiness.prefetch(parseLong, fs8Var.e, (MtopPrefetch.IPrefetchCallback) new a(xs6Var, set)).startRequest();
            i65.c("PrefetchRequest", "发送预加载请求，当前的时间是：" + System.currentTimeMillis());
        } catch (Exception e) {
            i65.c("PrefetchRequest", "prefetch request failed, " + e);
        }
    }
}
