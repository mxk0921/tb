package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.callback.PreloadRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class njq extends atm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final PreloadRequestParams b;
    public final etm c;

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
                njq.c(njq.this).c(njq.this);
            }
        }
    }

    static {
        t2o.a(912262215);
    }

    public njq(etm etmVar, PreloadRequestParams preloadRequestParams) {
        super(etmVar, preloadRequestParams);
        this.b = preloadRequestParams;
        this.c = etmVar;
    }

    public static /* synthetic */ etm c(njq njqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etm) ipChange.ipc$dispatch("9cb4cb0e", new Object[]{njqVar});
        }
        return njqVar.c;
    }

    public static /* synthetic */ Object ipc$super(njq njqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/preload/StaticApiPreloadTask");
    }

    @Override // tb.atm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        msm msmVar = new msm(this.b);
        PreloadRequestCallback preloadRequestCallback = new PreloadRequestCallback(this.b);
        preloadRequestCallback.setTaskCallback(new a());
        msmVar.q(preloadRequestCallback);
        if (this.b.isNavPreload()) {
            PerformanceUtils.p(this.b.getDetailToken(), z1x.PRE_REQUEST, System.currentTimeMillis());
        }
        tgh.b("StaticPreloadTask", "执行预加载请求, isNavPreload=" + this.b.isNavPreload());
        msmVar.c();
    }

    @Override // tb.atm
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401ab552", new Object[]{this, str})).booleanValue();
        }
        return this.b.isContainItem(str);
    }
}
