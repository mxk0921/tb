package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.etao.feimagesearch.mnn.featureextract.ImgFeatureExtractUnit;
import com.etao.feimagesearch.nn.MNNManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IRP_FEATURE_EXTRACT_FLAG = 261;
    public static final String TAG = "ImgFeatureExtract";
    public static utm c;
    public static final hre INSTANCE = new hre();

    /* renamed from: a  reason: collision with root package name */
    public static final LimitLinkedHashMap<Integer, z39> f20837a = new LimitLinkedHashMap<>(8);
    public static final Map<Integer, Long> b = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements wuc<z39> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20838a;

        public a(int i) {
            this.f20838a = i;
        }

        /* renamed from: a */
        public void onResult(z39 z39Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3adca1f3", new Object[]{this, z39Var});
                return;
            }
            ckf.g(z39Var, "output");
            Long l = (Long) hre.c().remove(Integer.valueOf(this.f20838a));
            if (l != null) {
                z39Var.i(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
            }
            hre.b().put(Integer.valueOf(this.f20838a), z39Var);
            String f = z39Var.f();
            Long a2 = z39Var.a();
            long j = 0;
            Long valueOf = Long.valueOf(a2 == null ? 0L : a2.longValue());
            Long b = z39Var.b();
            if (b != null) {
                j = b.longValue();
            }
            vwi.a(f, valueOf, Long.valueOf(j));
        }

        @Override // tb.wuc
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            ckf.g(th, "throwable");
            z39 a2 = z39.Companion.a(ImgFeatureExtractUnit.TASK_NAME, "", "unit run error", 0L, -2);
            int i = this.f20838a;
            Long l = (Long) hre.c().remove(Integer.valueOf(i));
            if (l != null) {
                a2.i(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
            }
            hre.b().put(Integer.valueOf(i), a2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20839a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements utm {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.utm
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                    return;
                }
                agh.r("PltCamera", hre.TAG, "feature extract prepare failed errorCode=" + i + ", errorMsg=" + ((Object) str));
            }

            @Override // tb.utm
            public void onPrepareSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                    return;
                }
                agh.r("PltCamera", hre.TAG, "feature extract prepare success");
                utm a2 = hre.a();
                if (a2 != null) {
                    a2.onPrepareSuccess();
                }
            }
        }

        public b(String str) {
            this.f20839a = str;
        }

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
            } else {
                ImgFeatureExtractUnit.Companion.a().c(new a(), this.f20839a);
            }
        }
    }

    static {
        t2o.a(481297051);
    }

    public static final /* synthetic */ utm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utm) ipChange.ipc$dispatch("cdc59e1c", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ LimitLinkedHashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitLinkedHashMap) ipChange.ipc$dispatch("97ed6b0d", new Object[0]);
        }
        return f20837a;
    }

    public static final /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bebc8c7c", new Object[0]);
        }
        return b;
    }

    @JvmStatic
    public static final boolean e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88be9c6", new Object[]{num})).booleanValue();
        }
        if (num != null && (num.intValue() & 261) > 0) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        ImgFeatureExtractUnit.Companion.a().a(str);
        c = null;
        f20837a.clear();
        ((LinkedHashMap) b).clear();
    }

    public final void f(y39 y39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315f9dad", new Object[]{this, y39Var});
            return;
        }
        ckf.g(y39Var, "featureExtractInput");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int b2 = y39Var.b();
        ImgFeatureExtractUnit.a aVar = ImgFeatureExtractUnit.Companion;
        if (!aVar.a().x()) {
            f20837a.put(Integer.valueOf(b2), z39.Companion.a(ImgFeatureExtractUnit.TASK_NAME, "", "unit prepare error", 0L, -1));
            return;
        }
        b.put(Integer.valueOf(b2), Long.valueOf(elapsedRealtime));
        aVar.a().b(y39Var, null, new a(b2));
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2784b858", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        MNNManager.Companion.a().j(ImgFeatureExtractUnit.TASK_NAME, new b(str));
    }

    public final z39 h(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z39) ipChange.ipc$dispatch("f66662ac", new Object[]{this, num});
        }
        if (num == null) {
            return null;
        }
        LimitLinkedHashMap<Integer, z39> limitLinkedHashMap = f20837a;
        if (limitLinkedHashMap.containsKey(num)) {
            return limitLinkedHashMap.get(num);
        }
        return z39.Companion.a(ImgFeatureExtractUnit.TASK_NAME, "", "", 0L, -5);
    }

    public final void i(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0d9d67", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "callback");
        if (ImgFeatureExtractUnit.Companion.a().x()) {
            utmVar.onPrepareSuccess();
        } else {
            c = utmVar;
        }
    }

    public final void j(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e176e", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "callback");
        if (ckf.b(utmVar, c)) {
            c = null;
        }
    }
}
