package tb;

import android.view.View;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderOutput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.cij;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qxu extends gz<UMFRenderIO, UMFRenderOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements x3e<f4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFRenderIO f26991a;
        public final /* synthetic */ txu b;
        public final /* synthetic */ hz c;

        /* compiled from: Taobao */
        /* renamed from: tb.qxu$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C1043a implements x3e<d4e> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f4e f26992a;

            public C1043a(f4e f4eVar) {
                this.f26992a = f4eVar;
            }

            /* renamed from: b */
            public void a(d4e d4eVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("63aa7d74", new Object[]{this, d4eVar});
                    return;
                }
                d4eVar.d(a.this.b, this.f26992a);
                this.f26992a.x(d4eVar);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements x3e<u3e> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f4e f26993a;

            public b(a aVar, f4e f4eVar) {
                this.f26993a = f4eVar;
            }

            /* renamed from: b */
            public void a(u3e u3eVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b461449d", new Object[]{this, u3eVar});
                } else {
                    this.f26993a.N(u3eVar);
                }
            }
        }

        public a(UMFRenderIO uMFRenderIO, txu txuVar, hz hzVar) {
            this.f26991a = uMFRenderIO;
            this.b = txuVar;
            this.c = hzVar;
        }

        /* renamed from: b */
        public void a(f4e f4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4caae38e", new Object[]{this, f4eVar});
                return;
            }
            f4eVar.M(this.f26991a, this.b);
            Map<String, View> r = f4eVar.r();
            if (r == null || r.isEmpty()) {
                ((cij.a) this.c).a(new axu(UMFConstants$ErrorCode.RENDER_SERVICE_EXCEPTION, "数据错误，无法创建view"));
                return;
            }
            List<d4e> list = (List) qxu.e(qxu.this, d4e.class, new C1043a(f4eVar)).a();
            if (list == null || list.isEmpty()) {
                dxu.a().e("UMFRenderService", "execute#there is no IUMFRenderComponentCreatorAbility, make sure you have register property");
            } else {
                for (d4e d4eVar : list) {
                    if (d4eVar instanceof ez) {
                        ((ez) d4eVar).e(list);
                    }
                }
            }
            qxu.f(qxu.this, u3e.class, new b(this, f4eVar));
            f4eVar.B();
            UMFRenderOutput uMFRenderOutput = new UMFRenderOutput();
            uMFRenderOutput.setViews(r);
            ((cij.a) this.c).b(uMFRenderOutput);
        }
    }

    static {
        t2o.a(80740733);
    }

    public static /* synthetic */ dz e(qxu qxuVar, Class cls, x3e x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dz) ipChange.ipc$dispatch("21728a0a", new Object[]{qxuVar, cls, x3eVar});
        }
        return qxuVar.a(cls, x3eVar);
    }

    public static /* synthetic */ dz f(qxu qxuVar, Class cls, x3e x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dz) ipChange.ipc$dispatch("511b140b", new Object[]{qxuVar, cls, x3eVar});
        }
        return qxuVar.a(cls, x3eVar);
    }

    public static /* synthetic */ Object ipc$super(qxu qxuVar, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/UMFRenderService");
    }

    @Override // tb.gz, com.alibaba.android.umf.node.service.IUMFService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    /* renamed from: g */
    public void onExecute(UMFRenderIO uMFRenderIO, txu txuVar, hz<UMFRenderOutput> hzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b3e727", new Object[]{this, uMFRenderIO, txuVar, hzVar});
            return;
        }
        List list = (List) a(f4e.class, new a(uMFRenderIO, txuVar, hzVar)).a();
        if (list == null || list.isEmpty()) {
            ((cij.a) hzVar).a(new axu(UMFConstants$ErrorCode.RENDER_SERVICE_EXCEPTION, "there is no container ability for UMFRenderService"));
        } else if (list.size() > 1) {
            ((cij.a) hzVar).a(new axu(UMFConstants$ErrorCode.RENDER_SERVICE_EXCEPTION, "there is more than one container ability for UMFRenderService"));
        }
    }
}
