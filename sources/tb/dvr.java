package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.fhb;
import tb.rkd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dvr extends rkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f18097a;
    public final Handler b = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/TBRevisitionSwitch$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (dvr.c(dvr.this) != null) {
                c.a(dvr.c(dvr.this)).a();
                dvr.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fhb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rkd.a f18099a;

        public b(dvr dvrVar, rkd.a aVar) {
            this.f18099a = aVar;
        }

        @Override // tb.vpj
        public void M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
                return;
            }
            this.f18099a.a();
            dvr.d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements fhb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rkd.a f18100a;

        static {
            t2o.a(502267954);
            t2o.a(503316577);
        }

        public c(rkd.a aVar) {
            this.f18100a = aVar;
        }

        public static /* synthetic */ rkd.a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rkd.a) ipChange.ipc$dispatch("1b0a870f", new Object[]{cVar});
            }
            return cVar.f18100a;
        }

        @Override // tb.vpj
        public void M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
                return;
            }
            dvr.b(dvr.this).removeMessages(1);
            dvr.b(dvr.this).sendEmptyMessageDelayed(1, 500L);
        }
    }

    static {
        t2o.a(502267951);
    }

    public static /* synthetic */ Handler b(dvr dvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("69621da2", new Object[]{dvrVar});
        }
        return dvrVar.b;
    }

    public static /* synthetic */ c c(dvr dvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8850a86", new Object[]{dvrVar});
        }
        return dvrVar.f18097a;
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            e();
        }
    }

    public static void e() {
        fhb f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c638fa79", new Object[0]);
            return;
        }
        boolean d = LocationHelper.d(o.J());
        boolean d2 = TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
        if (d && d2 && akt.J1() && (f = od0.D().f()) != null) {
            f.N(1);
        }
    }

    public static /* synthetic */ Object ipc$super(dvr dvrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/adapter/impl/TBRevisitionSwitch");
    }

    @Override // tb.rkd
    public void a(rkd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4188d2", new Object[]{this, aVar});
        } else if (aVar == null) {
            od0.D().f().K(null);
        } else if (akt.I()) {
            this.f18097a = new c(aVar);
            od0.D().f().K(this.f18097a);
        } else {
            od0.D().f().K(new b(this, aVar));
        }
    }
}
