package tb;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j75 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean u = false;
    public static volatile String v;
    public static volatile float w;
    public static volatile String x;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f21809a;
    public g b;
    public g c;
    public g d;
    public g e;
    public g f;
    public g g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean t;
    public final List<ltb> n = new ArrayList();
    public final List<ltb> o = new ArrayList();
    public final List<ltb> p = new ArrayList();
    public final List<ltb> s = new ArrayList();
    public final List<ltb> q = new ArrayList();
    public final List<ltb> r = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.c(j75.this, false);
                int size = j75.r(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.r(j75.this).get(i)).onError(dWResponse);
                }
                j75.r(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.c(j75.this, false);
                j75.q(j75.this, new g());
                j75.o(j75.this).b = true;
                j75.o(j75.this).f21816a = dWResponse;
                int size = j75.r(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.r(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.r(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.s(j75.this, false);
                int size = j75.v(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.v(j75.this).get(i)).onError(dWResponse);
                }
                j75.v(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.s(j75.this, false);
                j75.u(j75.this, new g());
                j75.t(j75.this).b = true;
                j75.t(j75.this).f21816a = dWResponse;
                int size = j75.v(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.v(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.v(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.w(j75.this, false);
                int size = j75.z(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.z(j75.this).get(i)).onError(dWResponse);
                }
                j75.z(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.w(j75.this, false);
                j75.y(j75.this, new g());
                j75.x(j75.this).b = true;
                j75.x(j75.this).f21816a = dWResponse;
                int size = j75.z(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.z(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.z(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.d(j75.this, false);
                int size = j75.g(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.g(j75.this).get(i)).onError(dWResponse);
                }
                j75.g(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.d(j75.this, false);
                j75.f(j75.this, new g());
                j75.e(j75.this).b = true;
                j75.e(j75.this).f21816a = dWResponse;
                int size = j75.g(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.g(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.g(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.l(j75.this, false);
                int size = j75.k(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.k(j75.this).get(i)).onError(dWResponse);
                }
                j75.k(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.h(j75.this, false);
                j75.j(j75.this, new g());
                j75.i(j75.this).b = true;
                j75.i(j75.this).f21816a = dWResponse;
                int size = j75.k(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.k(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.k(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.h(j75.this, false);
                int size = j75.p(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.p(j75.this).get(i)).onError(dWResponse);
                }
                j75.p(j75.this).clear();
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            } else if (!j75.a(j75.this)) {
                j75.h(j75.this, false);
                j75.n(j75.this, new g());
                j75.m(j75.this).b = true;
                j75.m(j75.this).f21816a = dWResponse;
                int size = j75.p(j75.this).size();
                for (int i = 0; i < size; i++) {
                    ((ltb) j75.p(j75.this).get(i)).onSuccess(dWResponse);
                }
                j75.p(j75.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public DWResponse f21816a;
        public boolean b;

        static {
            t2o.a(452984846);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984847);
        }

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWDataManager$QueryVideoConfigDataTask");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            j75.this.C();
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
            } else {
                j75.b(j75.this);
            }
        }

        public /* synthetic */ h(j75 j75Var, a aVar) {
            this();
        }
    }

    static {
        t2o.a(452984839);
    }

    public j75(DWContext dWContext) {
        this.f21809a = dWContext;
    }

    public static /* synthetic */ boolean a(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de6a164", new Object[]{j75Var})).booleanValue();
        }
        return j75Var.t;
    }

    public static /* synthetic */ void b(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1dedd1", new Object[]{j75Var});
        } else {
            j75Var.J();
        }
    }

    public static /* synthetic */ boolean c(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d70023b", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.k = z;
        return z;
    }

    public static /* synthetic */ boolean d(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b2ab", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.i = z;
        return z;
    }

    public static /* synthetic */ g e(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ff1be8e5", new Object[]{j75Var});
        }
        return j75Var.f;
    }

    public static /* synthetic */ g f(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("32f1e14a", new Object[]{j75Var, gVar});
        }
        j75Var.f = gVar;
        return gVar;
    }

    public static /* synthetic */ List g(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90968c5a", new Object[]{j75Var});
        }
        return j75Var.q;
    }

    public static /* synthetic */ boolean h(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc27feee", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.m = z;
        return z;
    }

    public static /* synthetic */ g i(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("26e13168", new Object[]{j75Var});
        }
        return j75Var.b;
    }

    public static /* synthetic */ g j(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("de2eb14d", new Object[]{j75Var, gVar});
        }
        j75Var.b = gVar;
        return gVar;
    }

    public static /* synthetic */ List k(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("152a75d", new Object[]{j75Var});
        }
        return j75Var.p;
    }

    public static /* synthetic */ boolean l(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bec4b31", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.j = z;
        return z;
    }

    public static /* synthetic */ g m(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4ea679eb", new Object[]{j75Var});
        }
        return j75Var.e;
    }

    public static /* synthetic */ g n(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("896b8150", new Object[]{j75Var, gVar});
        }
        j75Var.e = gVar;
        return gVar;
    }

    public static /* synthetic */ g o(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a723c475", new Object[]{j75Var});
        }
        return j75Var.c;
    }

    public static /* synthetic */ List p(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87337f75", new Object[]{j75Var});
        }
        return j75Var.s;
    }

    public static /* synthetic */ g q(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ad4aa4da", new Object[]{j75Var, gVar});
        }
        j75Var.c = gVar;
        return gVar;
    }

    public static /* synthetic */ List r(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9dd85fea", new Object[]{j75Var});
        }
        return j75Var.n;
    }

    public static /* synthetic */ boolean s(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d344e7e", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.l = z;
        return z;
    }

    public static /* synthetic */ g t(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("cee90cf8", new Object[]{j75Var});
        }
        return j75Var.d;
    }

    public static /* synthetic */ g u(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("588774dd", new Object[]{j75Var, gVar});
        }
        j75Var.d = gVar;
        return gVar;
    }

    public static /* synthetic */ List v(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e947aed", new Object[]{j75Var});
        }
        return j75Var.o;
    }

    public static /* synthetic */ boolean w(j75 j75Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcf89ac1", new Object[]{j75Var, new Boolean(z)})).booleanValue();
        }
        j75Var.h = z;
        return z;
    }

    public static /* synthetic */ g x(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f6ae557b", new Object[]{j75Var});
        }
        return j75Var.g;
    }

    public static /* synthetic */ g y(j75 j75Var, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3c444e0", new Object[]{j75Var, gVar});
        }
        j75Var.g = gVar;
        return gVar;
    }

    public static /* synthetic */ List z(j75 j75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f5095f0", new Object[]{j75Var});
        }
        return j75Var.r;
    }

    public void A(DWRequest dWRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f1b2cc", new Object[]{this, dWRequest});
            return;
        }
        dWRequest.paramMap.put("userId", Long.toString(this.f21809a.mUserId));
        dWRequest.paramMap.put("sdkVersion", k75.f22443a);
        dWRequest.paramMap.put("videoId", this.f21809a.getVideoId());
        dWRequest.paramMap.put(MergeUtil.KEY_RID, this.f21809a.getRID());
        if (!TextUtils.isEmpty(this.f21809a.mFrom)) {
            dWRequest.paramMap.put("from", this.f21809a.mFrom);
        }
        Map<String, String> uTParams = this.f21809a.getUTParams();
        if (uTParams != null) {
            String str = uTParams.get("product_type");
            if (!TextUtils.isEmpty(str)) {
                dWRequest.paramMap.put("videoChannel", str);
            }
        }
        dWRequest.paramMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        dWRequest.paramMap.put("cpuModel", v);
        Map<String, String> map = dWRequest.paramMap;
        map.put("cpuHz", "" + w);
        dWRequest.paramMap.put("deviceMemory", x);
        Map<String, String> map2 = dWRequest.paramMap;
        map2.put("aliHARuntimeEvaluationLevel", "" + lp0.d().f().f23479a);
        Map<String, String> map3 = dWRequest.paramMap;
        map3.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        dWRequest.paramMap.put("useServerPriority", "1");
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.t = true;
        ((ArrayList) this.n).clear();
        ((ArrayList) this.o).clear();
        ((ArrayList) this.p).clear();
        ((ArrayList) this.s).clear();
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f2788", new Object[]{this});
        } else if (!u) {
            v = ew0.e();
            w = 0.0f;
            int b2 = dx4.b();
            for (int i = 0; i < b2; i++) {
                try {
                    float c2 = l95.c(dx4.a(i)) / 1000000.0f;
                    if (c2 > w) {
                        w = c2;
                    }
                } catch (Exception e2) {
                    AVSDKLog.e("DWDataManager", "Get MaxCpuFreq Error " + e2);
                }
            }
            x = String.format("%.2f", Double.valueOf((lp0.d().e().f23478a / 1000.0d) / 1000.0d));
            u = true;
        }
    }

    public final void K(DWRequest dWRequest, ltb ltbVar) {
        ktb ktbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a930e88c", new Object[]{this, dWRequest, ltbVar});
        } else if (dWRequest == null || (ktbVar = this.f21809a.mNetworkAdapter) == null) {
            ltbVar.onError(null);
        } else {
            ktbVar.sendRequest(ltbVar, dWRequest);
        }
    }

    public void L(Map<String, String> map, ltb ltbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2519779a", new Object[]{this, map, ltbVar});
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() && !this.t) {
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = k75.TAOKE_ITEM_CHECK;
            dWRequest.apiVersion = "1.0";
            HashMap hashMap = new HashMap();
            dWRequest.paramMap = hashMap;
            hashMap.putAll(map);
            K(dWRequest, ltbVar);
        } else if (!MediaSystemUtils.isApkDebuggable()) {
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            ltbVar.onError(dWResponse);
        } else {
            throw new RuntimeException("queryConfigData error");
        }
    }

    public void D(ltb ltbVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec225073", new Object[]{this, ltbVar, map, new Boolean(z)});
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() && !this.t) {
            g gVar = this.e;
            if (gVar == null || z) {
                ((ArrayList) this.s).add(ltbVar);
                if (!this.m) {
                    DWRequest dWRequest = new DWRequest();
                    dWRequest.responseClass = null;
                    dWRequest.apiName = k75.BACKCOVER_API_NAME;
                    dWRequest.apiVersion = "1.0";
                    HashMap hashMap = new HashMap();
                    dWRequest.paramMap = hashMap;
                    hashMap.put("userId", Long.toString(this.f21809a.mUserId));
                    dWRequest.paramMap.put("sdkVersion", k75.f22443a);
                    dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.f21809a.mInteractiveId));
                    dWRequest.paramMap.put("videoId", this.f21809a.mVideoId);
                    dWRequest.paramMap.put("videoSource", this.f21809a.mVideoSource);
                    dWRequest.paramMap.put("contentId", this.f21809a.mContentId);
                    if (map != null) {
                        dWRequest.paramMap.putAll(map);
                    }
                    if (!TextUtils.isEmpty(this.f21809a.mFrom)) {
                        dWRequest.paramMap.put("from", this.f21809a.mFrom);
                    }
                    this.m = true;
                    K(dWRequest, new f());
                }
            } else if (gVar.b) {
                ltbVar.onSuccess(gVar.f21816a);
            } else {
                ltbVar.onError(gVar.f21816a);
            }
        } else if (!MediaSystemUtils.isApkDebuggable()) {
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            ltbVar.onError(dWResponse);
        } else {
            throw new RuntimeException("queryBackCoverData error");
        }
    }

    public void E(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9d57d2", new Object[]{this, ltbVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() && !this.t) {
            g gVar = this.b;
            if (gVar == null || z) {
                ((ArrayList) this.p).add(ltbVar);
                if (!this.j) {
                    DWRequest dWRequest = new DWRequest();
                    dWRequest.responseClass = null;
                    dWRequest.apiName = k75.FRONTCOVER_API_NAME;
                    dWRequest.apiVersion = "1.0";
                    HashMap hashMap = new HashMap();
                    dWRequest.paramMap = hashMap;
                    hashMap.put("userId", Long.toString(this.f21809a.mUserId));
                    dWRequest.paramMap.put("sdkVersion", k75.f22443a);
                    dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.f21809a.mInteractiveId));
                    dWRequest.paramMap.put("includeAd", "1");
                    dWRequest.paramMap.put("includeVideoSize", "1");
                    dWRequest.paramMap.put("sysOS", TimeCalculator.PLATFORM_ANDROID);
                    dWRequest.paramMap.put("videoId", this.f21809a.getVideoId());
                    if (!TextUtils.isEmpty(this.f21809a.mFrom)) {
                        dWRequest.paramMap.put("from", this.f21809a.mFrom);
                    }
                    this.j = true;
                    K(dWRequest, new e());
                }
            } else if (gVar.b) {
                ltbVar.onSuccess(gVar.f21816a);
            } else {
                ltbVar.onError(gVar.f21816a);
            }
        } else if (!MediaSystemUtils.isApkDebuggable()) {
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            ltbVar.onError(dWResponse);
        } else {
            throw new RuntimeException("queryConfigData error");
        }
    }

    public void F(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592266a2", new Object[]{this, ltbVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() && !this.t && this.f21809a.mInteractiveId != -1) {
            g gVar = this.c;
            if (gVar == null || z) {
                ((ArrayList) this.n).add(ltbVar);
                if (!this.k) {
                    DWRequest dWRequest = new DWRequest();
                    dWRequest.responseClass = null;
                    if ("detailmain".equalsIgnoreCase(this.f21809a.mFrom)) {
                        dWRequest.apiName = k75.INTERACTIVE_API_NAME_FOR_DETAIL;
                        dWRequest.apiVersion = "1.0";
                    } else {
                        dWRequest.apiName = k75.INTERACTIVE_API_NAME;
                        dWRequest.apiVersion = k75.INTERACTIVE_API_VERSION;
                    }
                    HashMap hashMap = new HashMap();
                    dWRequest.paramMap = hashMap;
                    hashMap.put("userId", Long.toString(this.f21809a.mUserId));
                    dWRequest.paramMap.put("sdkVersion", k75.f22443a);
                    dWRequest.paramMap.put("interactiveVideoId", Long.toString(this.f21809a.mInteractiveId));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("scene", this.f21809a.mScene);
                    if ("taowa".equals(this.f21809a.mScene)) {
                        hashMap2.put("interactiveType", "taowa");
                    }
                    Map<String, String> map = this.f21809a.mInteractiveParms;
                    if (map != null && map.size() > 0) {
                        hashMap2.putAll(this.f21809a.mInteractiveParms);
                    }
                    if (!TextUtils.isEmpty(this.f21809a.getSourcePageName())) {
                        hashMap2.put("sourcePageName", this.f21809a.getSourcePageName());
                    }
                    dWRequest.paramMap.put("extendParamsStr", JSON.toJSONString(hashMap2));
                    if (!TextUtils.isEmpty(this.f21809a.mFrom)) {
                        dWRequest.paramMap.put("from", this.f21809a.mFrom);
                    }
                    this.k = true;
                    K(dWRequest, new a());
                }
            } else if (gVar.b) {
                ltbVar.onSuccess(gVar.f21816a);
            } else {
                ltbVar.onError(gVar.f21816a);
            }
        } else if (!MediaSystemUtils.isApkDebuggable() || this.f21809a.mInteractiveId == -1) {
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            ltbVar.onError(dWResponse);
        } else {
            throw new RuntimeException("queryInteractiveData error");
        }
    }

    public void G(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2605ba85", new Object[]{this, ltbVar, new Boolean(z)});
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() && !this.t && !TextUtils.isEmpty(this.f21809a.mCid)) {
            g gVar = this.d;
            if (gVar == null || z) {
                ((ArrayList) this.o).add(ltbVar);
                if (!this.l) {
                    DWRequest dWRequest = new DWRequest();
                    dWRequest.responseClass = null;
                    dWRequest.apiName = k75.HIV_INTERACTIVE_API_NAME;
                    dWRequest.apiVersion = "1.0";
                    HashMap hashMap = new HashMap();
                    dWRequest.paramMap = hashMap;
                    hashMap.put("contentId", this.f21809a.mCid);
                    dWRequest.paramMap.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, this.f21809a.mFrom);
                    this.l = true;
                    K(dWRequest, new b());
                }
            } else if (gVar.b) {
                ltbVar.onSuccess(gVar.f21816a);
            } else {
                ltbVar.onError(gVar.f21816a);
            }
        } else if (!MediaSystemUtils.isApkDebuggable() || !TextUtils.isEmpty(this.f21809a.mCid)) {
            DWResponse dWResponse = new DWResponse();
            dWResponse.errorMsg = "error";
            ltbVar.onError(dWResponse);
        } else {
            throw new RuntimeException("queryInteractiveData error");
        }
    }

    public void H(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37a265d", new Object[]{this, ltbVar, new Boolean(z)});
        } else if (!this.t) {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                g gVar = this.f;
                if (gVar == null || z) {
                    ((ArrayList) this.q).add(ltbVar);
                    if (!this.i) {
                        DWRequest dWRequest = new DWRequest();
                        dWRequest.responseClass = null;
                        dWRequest.apiName = k75.VIDEOCONFIG_API_NAME;
                        dWRequest.apiVersion = "2.0";
                        dWRequest.paramMap = new HashMap();
                        A(dWRequest);
                        dWRequest.paramMap.put("netSpeed", "0");
                        this.i = true;
                        K(dWRequest, new d());
                    }
                } else if (gVar.b) {
                    ltbVar.onSuccess(gVar.f21816a);
                } else {
                    ltbVar.onError(gVar.f21816a);
                }
            } else if (!MediaSystemUtils.isApkDebuggable()) {
                DWResponse dWResponse = new DWResponse();
                dWResponse.errorMsg = "error";
                ltbVar.onError(dWResponse);
            } else {
                throw new RuntimeException("queryVideoConfigData error");
            }
        }
    }

    public void I(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d86671", new Object[]{this, ltbVar, new Boolean(z)});
        } else if (!this.t) {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                g gVar = this.g;
                if (gVar == null || z) {
                    ((ArrayList) this.r).add(ltbVar);
                    if (!this.h) {
                        if (!u) {
                            new h(this, null).execute(new Void[0]);
                        } else {
                            J();
                        }
                    }
                } else if (gVar.b) {
                    ltbVar.onSuccess(gVar.f21816a);
                } else {
                    ltbVar.onError(gVar.f21816a);
                }
            } else if (!MediaSystemUtils.isApkDebuggable()) {
                DWResponse dWResponse = new DWResponse();
                dWResponse.errorMsg = "error";
                ltbVar.onError(dWResponse);
            } else {
                throw new RuntimeException("queryVideoConfigData2 error");
            }
        }
    }

    public final void J() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4601bc0a", new Object[]{this});
        } else if (!this.t) {
            DWRequest dWRequest = new DWRequest();
            dWRequest.responseClass = null;
            dWRequest.apiName = k75.VIDEOCONFIG_API_NAME;
            dWRequest.apiVersion = k75.VIDEOCONFIG_API_VERSION_3;
            dWRequest.paramMap = new HashMap();
            A(dWRequest);
            dWRequest.paramMap.put("playScenes", this.f21809a.mPlayScenes);
            Map<String, String> map = dWRequest.paramMap;
            if (this.f21809a.mPlayContext.isH265()) {
                str = "h265";
            } else {
                str = "h264";
            }
            map.put("expectedCodec", str);
            dWRequest.paramMap.put("expectedDefPriority", this.f21809a.mPlayContext.getRateAdaptePriority());
            dWRequest.paramMap.put("netSpeed", String.valueOf(this.f21809a.mPlayContext.getNetSpeed()));
            if (!TextUtils.isEmpty(this.f21809a.getPanoTyeStr())) {
                dWRequest.paramMap.put(com.taobao.android.weex_uikit.widget.video.c.ATTR_PANO_TYPE, this.f21809a.getPanoTyeStr());
            }
            this.h = true;
            K(dWRequest, new c());
        }
    }
}
