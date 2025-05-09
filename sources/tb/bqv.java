package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IHomePageLifecycleService f16557a;
    public IPageLifeCycle b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(bqv bqvVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/performance/basic/UserActionStorage$1");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            qy8.b.i(ModuleName.PRELOAD_ABILITY, "userActionBXFeature", en1.a());
        }
    }

    static {
        t2o.a(729810251);
    }

    public bqv(wcc wccVar) {
        this.f16557a = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        c();
    }

    public final IPageLifeCycle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("da6084ef", new Object[]{this});
        }
        return new a(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            d();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26969449", new Object[]{this});
        } else if (this.f16557a != null) {
            this.b = a();
            this.f16557a.getPageLifeCycleRegister().a(this.b);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb44782", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.f16557a;
        if (iHomePageLifecycleService != null && this.b != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.b);
        }
    }
}
