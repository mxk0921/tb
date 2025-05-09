package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final brm f32284a = new brm(arm.b(), arm.a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AwesomeGetRequestParams f32285a;

        public a(AwesomeGetRequestParams awesomeGetRequestParams) {
            this.f32285a = awesomeGetRequestParams;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            yqm.a(yqm.this).b(this.f32285a, str, hashMap);
            yqm.b(yqm.this, str);
            yqm.c(yqm.this, str);
            uqa.b("recmdPrefetch", "PrefetchRequest", "MtopPrefetch.IPrefetchCallback: type=" + str);
        }
    }

    static {
        t2o.a(729809710);
    }

    public static /* synthetic */ brm a(yqm yqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brm) ipChange.ipc$dispatch("555c0a27", new Object[]{yqmVar});
        }
        return yqmVar.f32284a;
    }

    public static /* synthetic */ void b(yqm yqmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971026e", new Object[]{yqmVar, str});
        } else {
            yqmVar.f(str);
        }
    }

    public static /* synthetic */ void c(yqm yqmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615d6fef", new Object[]{yqmVar, str});
        } else {
            yqmVar.d(str);
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dc4823", new Object[]{this, str});
        } else {
            hon.e(str);
        }
    }

    public void e(RemoteBusiness remoteBusiness, es8 es8Var, AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5ce29", new Object[]{this, remoteBusiness, es8Var, awesomeGetRequestParams});
            return;
        }
        try {
            long parseLong = TextUtils.isEmpty(es8Var.d) ? 5000L : Long.parseLong(es8Var.d);
            remoteBusiness.prefetchComparator((MtopPrefetch.IPrefetchComparator) new qls());
            remoteBusiness.prefetch(parseLong, es8Var.e, (MtopPrefetch.IPrefetchCallback) new a(awesomeGetRequestParams)).startRequest();
            this.f32284a.c(awesomeGetRequestParams);
            uqa.b("recmdPrefetch", "PrefetchRequest", "发送预加载请求，当前的时间是：" + System.currentTimeMillis());
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PrefetchRequest", "prefetch request failed, " + e);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbde695", new Object[]{this, str});
        } else if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
            arm.g("success");
        } else {
            arm.g("failed");
        }
    }
}
