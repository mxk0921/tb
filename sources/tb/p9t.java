package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.threads.BackgroundExecutor;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p9t implements yyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBLocationDTO f25967a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                p9t.c(p9t.this, TBLocationClient.d());
            }
        }
    }

    static {
        t2o.a(1018167397);
        t2o.a(1018167381);
    }

    public p9t() {
        e();
    }

    public static /* synthetic */ TBLocationDTO c(p9t p9tVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("e0992406", new Object[]{p9tVar, tBLocationDTO});
        }
        p9tVar.f25967a = tBLocationDTO;
        return tBLocationDTO;
    }

    @Override // tb.yyd
    public TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("738c00aa", new Object[]{this});
        }
        if (this.f25967a == null) {
            e();
        }
        return this.f25967a;
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1300238f", new Object[]{this});
        }
        return IBaseService.Names.SERVICE_TAOBAO_LOCATION.name();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc1d8ef", new Object[]{this});
        } else {
            BackgroundExecutor.execute(new a());
        }
    }
}
