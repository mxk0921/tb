package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zxl extends xu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ub3.a("Check", null);
            }
        }
    }

    static {
        t2o.a(479199293);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxl(zxb zxbVar) {
        super(zxbVar);
        ckf.g(zxbVar, "dataManager");
    }

    public static /* synthetic */ Object ipc$super(zxl zxlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1201338168) {
            super.d((RequestConfig) objArr[0], (MtopResponse) objArr[1], (fsb) objArr[2]);
            return null;
        } else if (hashCode == 157339494) {
            super.a((RequestConfig) objArr[0]);
            return null;
        } else if (hashCode == 1150427091) {
            super.c((RequestConfig) objArr[0], (MtopResponse) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/data/chain/impl/PerformanceTracerProcessor");
        }
    }

    @Override // tb.xu
    public void f(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca381e", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        ckf.g(fsbVar, "idmContext");
        ckf.g(requestConfig, "requestConfig");
    }

    @Override // tb.xu
    public void a(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960cf66", new Object[]{this, requestConfig});
            return;
        }
        ckf.g(requestConfig, "requestConfig");
        super.a(requestConfig);
        ub3.m("Check", "网络请求前", true, 0.05f, null);
        ub3.n("Check", "网络请求", null);
    }

    @Override // tb.xu
    public void c(RequestConfig requestConfig, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44921fd3", new Object[]{this, requestConfig, mtopResponse});
            return;
        }
        ckf.g(requestConfig, "requestConfig");
        ckf.g(mtopResponse, "response");
        super.c(requestConfig, mtopResponse);
        ub3.m("Check", "网络请求", false, 0.05f, null);
        ub3.m("Check", "总耗时", false, 0.05f, null);
    }

    @Override // tb.xu
    public void d(RequestConfig requestConfig, MtopResponse mtopResponse, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86508c8", new Object[]{this, requestConfig, mtopResponse, fsbVar});
            return;
        }
        ckf.g(requestConfig, "requestConfig");
        super.d(requestConfig, mtopResponse, fsbVar);
        ub3.m("Check", "网络请求", true, 0.05f, null);
        ub3.n("Check", "网络请求后", null);
    }

    @Override // tb.xu
    public void e(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc977bbd", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        ckf.g(fsbVar, "idmContext");
        ckf.g(requestConfig, "requestConfig");
        ub3.m("Check", "网络请求后", true, 0.05f, null);
        pav.i(a.INSTANCE, 0L);
    }
}
