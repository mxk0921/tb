package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fhi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIDING = 1001;
    public static final int SHOWING = 1000;
    public static final String TAG = "MediaStatusController";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fhi f19295a;

        public a(fhi fhiVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fhi.a(null, "showLoadingTaskReach");
            if (fhi.b(null) == 1001) {
                fhi.c(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fhi f19296a;

        public b(fhi fhiVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fhi.a(null, "showToastTaskReach");
            if (fhi.d(null) != null && fhi.d(null).n() && fhi.e(null) != null) {
                t0u.c(fhi.e(null), "您的网络环境较差，建议切换网络重试");
                rbu.c0(fhi.f(null), "Show-Toast_Lowtraffic", null);
            }
        }
    }

    static {
        t2o.a(779092926);
    }

    public static /* synthetic */ void a(fhi fhiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd44402", new Object[]{fhiVar, str});
            return;
        }
        throw null;
    }

    public static /* synthetic */ int b(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74539f2c", new Object[]{fhiVar})).intValue();
        }
        throw null;
    }

    public static /* synthetic */ void c(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f863a", new Object[]{fhiVar});
            return;
        }
        throw null;
    }

    public static /* synthetic */ mmh d(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmh) ipChange.ipc$dispatch("43a4f3a0", new Object[]{fhiVar});
        }
        throw null;
    }

    public static /* synthetic */ Context e(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4919bf34", new Object[]{fhiVar});
        }
        throw null;
    }

    public static /* synthetic */ ux9 f(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("60b53761", new Object[]{fhiVar});
        }
        throw null;
    }
}
