package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class stq extends g12 implements w3c, cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final r3c d;
    public ArrayList<TopAtmosphereMessage> e;
    public final ux9 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(stq stqVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubBrandHotEventController$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1044) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TopAtmosphereMessage f28266a;

        public b(TopAtmosphereMessage topAtmosphereMessage) {
            this.f28266a = topAtmosphereMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (stq.h(stq.this).h(stq.this)) {
                stq.i(stq.this).clear();
                stq.i(stq.this).add(this.f28266a);
            } else if (stq.this.e()) {
                stq.this.g(this.f28266a);
                q0h.b("SubBrandHotEventController", "reset comment msg");
            } else {
                stq.i(stq.this).add(this.f28266a);
                stq.h(stq.this).b();
                q0h.b("SubBrandHotEventController", "start comment msg");
            }
        }
    }

    static {
        t2o.a(295698727);
        t2o.a(295698713);
        t2o.a(806356196);
    }

    public stq(r3c r3cVar, t54 t54Var) {
        this.d = r3cVar;
        this.f = t54Var;
    }

    public static /* synthetic */ r3c h(stq stqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r3c) ipChange.ipc$dispatch("8be87db6", new Object[]{stqVar});
        }
        return stqVar.d;
    }

    public static /* synthetic */ ArrayList i(stq stqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2c6b6497", new Object[]{stqVar});
        }
        return stqVar.e;
    }

    public static /* synthetic */ Object ipc$super(stq stqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubBrandHotEventController");
    }

    @Override // tb.w3c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5d7491", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.w3c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484c1aa1", new Object[]{this});
            return;
        }
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.c();
            return;
        }
        g(this.e.get(0));
        if (!this.e.isEmpty()) {
            this.e.remove(0);
        }
    }

    @Override // tb.w3c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998f87af", new Object[]{this})).booleanValue();
        }
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // tb.w3c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.d.getFrameContext().t().a(this);
    }

    @Override // tb.g12
    public void f(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadea0b9", new Object[]{this, topAtmosphereMessageType});
            return;
        }
        d();
        this.d.c();
    }

    @Override // tb.w3c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 4;
    }

    @Override // tb.w3c
    public void init() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.e = new ArrayList<>();
        this.c = new y2u(new r2u(this.d.getRootView().getContext(), this.d.getRootView(), this.f19671a, this.b, this.f));
        if (this.d.getFrameContext() != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.d.getFrameContext().t() != null) {
            z2 = true;
        }
        if (z2 && z) {
            this.d.getFrameContext().t().l(this, new a(this));
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1044 && (obj instanceof TopAtmosphereMessage)) {
            this.d.getHandler().post(new b((TopAtmosphereMessage) obj));
        }
    }
}
