package tb;

import android.content.Context;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescDynamicClient;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescDynamicParams;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescMtopStaticRequestClient;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescMtopStaticRequestParams;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.MtopRequestClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ad7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cd7 f15676a;
    public final bd7 b;
    public final hf7 c;
    public gf7 d;
    public l6j<gf7> e;
    public l6j<gf7> f;
    public MtopRequestClient g;
    public final HashMap<Integer, DescDynamicClient> h = new HashMap<>();
    public final Context i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements l6j<gf7> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: d */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
                return;
            }
            ((DescNativeController.b) ad7.this.b).b(new c(mtopResponse));
            new HashMap().put("requestParams", ad7.this.f15676a);
        }

        /* renamed from: e */
        public void onSuccess(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda5cda7", new Object[]{this, gf7Var});
                return;
            }
            ad7.this.d = gf7Var;
            if (gf7Var != null && gf7Var.a()) {
                ad7.a(ad7.this, gf7Var.b);
            }
            ((DescNativeController.b) ad7.this.b).c(gf7Var);
            new HashMap().put("requestParams", ad7.this.f15676a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements vc7<gf7> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vc7
        public void c(int i, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1a69716", new Object[]{this, new Integer(i), mtopResponse});
            } else {
                ad7.b(ad7.this).remove(Integer.valueOf(i));
            }
        }

        /* renamed from: d */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
            }
        }

        /* renamed from: e */
        public void b(int i, gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c03b8fb4", new Object[]{this, new Integer(i), gf7Var});
                return;
            }
            ad7.b(ad7.this).remove(Integer.valueOf(i));
            ((DescNativeController.b) ad7.this.b).a(gf7Var);
        }

        /* renamed from: f */
        public void onSuccess(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda5cda7", new Object[]{this, gf7Var});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MtopResponse f15679a;

        static {
            t2o.a(912262446);
            t2o.a(607125977);
        }

        public c(MtopResponse mtopResponse) {
            this.f15679a = mtopResponse;
        }

        @Override // anetwork.channel.Response
        public byte[] getBytedata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this});
            }
            return this.f15679a.getBytedata();
        }

        @Override // anetwork.channel.Response
        public Map<String, List<String>> getConnHeadFields() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3de6d7b7", new Object[]{this});
            }
            return this.f15679a.getHeaderFields();
        }

        @Override // anetwork.channel.Response
        public String getDesc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
            }
            return this.f15679a.getRetMsg();
        }

        @Override // anetwork.channel.Response
        public Throwable getError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("4db6723e", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public StatisticData getStatisticData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatisticData) ipChange.ipc$dispatch("396a8f27", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public int getStatusCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
            }
            return this.f15679a.getResponseCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f15679a.toString();
        }
    }

    static {
        t2o.a(912262443);
    }

    public ad7(Context context, cd7 cd7Var, bd7 bd7Var) {
        this.f15676a = cd7Var;
        this.b = bd7Var;
        this.i = context;
        this.c = new hf7(context);
    }

    public static /* synthetic */ void a(ad7 ad7Var, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca7d494", new Object[]{ad7Var, hashMap});
        } else {
            ad7Var.e(hashMap);
        }
    }

    public static /* synthetic */ HashMap b(ad7 ad7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fdb3cce3", new Object[]{ad7Var});
        }
        return ad7Var.h;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        MtopRequestClient mtopRequestClient = this.g;
        if (mtopRequestClient != null) {
            mtopRequestClient.cancel();
        }
        HashMap<Integer, DescDynamicClient> hashMap = this.h;
        if (!(hashMap == null || hashMap.isEmpty())) {
            for (Map.Entry<Integer, DescDynamicClient> entry : this.h.entrySet()) {
                entry.getValue().cancel();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            g();
        }
    }

    public final void e(HashMap<String, zc7> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85133d1c", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            f(hashMap.get(str));
        }
    }

    public final void f(zc7 zc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999a0548", new Object[]{this, zc7Var});
            return;
        }
        this.f = new b();
        DescDynamicClient descDynamicClient = new DescDynamicClient(new DescDynamicParams(zc7Var.b), SDKConfig.getInstance().getGlobalTtid(), this.f, this.c);
        this.h.put(Integer.valueOf(descDynamicClient.hashCode()), descDynamicClient);
        descDynamicClient.execute();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a25944c", new Object[]{this});
            return;
        }
        this.e = new a();
        DescMtopStaticRequestClient descMtopStaticRequestClient = new DescMtopStaticRequestClient(new DescMtopStaticRequestParams(this.f15676a), SDKConfig.getInstance().getGlobalTtid(), this.e, this.c);
        this.g = descMtopStaticRequestClient;
        descMtopStaticRequestClient.setContext(this.i);
        MtopRequestClient mtopRequestClient = this.g;
        if (mtopRequestClient != null) {
            mtopRequestClient.execute();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c73e43", new Object[]{this});
            return;
        }
        gf7 gf7Var = this.d;
        if (gf7Var != null && gf7Var.a() && this.h.isEmpty()) {
            e(this.d.b);
        }
    }
}
