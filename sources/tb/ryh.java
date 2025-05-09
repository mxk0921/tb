package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.request.preload.MainPreloadTaskCallback;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ryh extends atm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MainRequestParams b;
    public final etm c;
    public final w0i d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements izd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.izd
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                ryh.c(ryh.this).c(ryh.this);
            }
        }
    }

    static {
        t2o.a(912262194);
    }

    public ryh(etm etmVar, w0i w0iVar) {
        super(etmVar, w0iVar.b());
        this.b = w0iVar.b();
        this.c = etmVar;
        this.d = w0iVar;
    }

    public static /* synthetic */ etm c(ryh ryhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etm) ipChange.ipc$dispatch("41b87319", new Object[]{ryhVar});
        }
        return ryhVar.c;
    }

    public static /* synthetic */ Object ipc$super(ryh ryhVar, String str, Object... objArr) {
        if (str.hashCode() == 1075492178) {
            return new Boolean(super.b((String) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/preload/MainApiPreloadTask");
    }

    @Override // tb.atm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        y0i y0iVar = new y0i(this.b);
        MainPreloadTaskCallback mainPreloadTaskCallback = new MainPreloadTaskCallback(this.d, null);
        mainPreloadTaskCallback.setTaskCallback(new a());
        y0iVar.q(mainPreloadTaskCallback);
        if (this.d.c()) {
            PerformanceUtils.p(this.b.getDetailToken(), z1x.PRE_REQUEST, System.currentTimeMillis());
        }
        tgh.b("MainPreloadTask", "执行预加载请求, isNavPreload=" + this.d.c());
        y0iVar.c();
    }

    @Override // tb.atm
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401ab552", new Object[]{this, str})).booleanValue();
        }
        return super.b(str);
    }
}
