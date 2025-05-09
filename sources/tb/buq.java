package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class buq extends g12 implements w3c, cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final r3c d;
    public ArrayList<TopAtmosphereMessage> e;
    public lo3 f;
    public final t54 g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(buq buqVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubEveryBodySaysEventController$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1043) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(295698738);
        t2o.a(295698713);
        t2o.a(806356196);
    }

    public buq(r3c r3cVar, t54 t54Var) {
        this.d = r3cVar;
        this.g = t54Var;
    }

    public static /* synthetic */ Object ipc$super(buq buqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubEveryBodySaysEventController");
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
        this.d.getFrameContext().t().a(this);
        this.f.a();
        ArrayList<TopAtmosphereMessage> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
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
        q0h.b("SubEveryBodySaysEventController", "playOnAnimationEnd");
    }

    @Override // tb.w3c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 0;
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
        lo3 lo3Var = new lo3(this.g, this.d.getRootView().getContext());
        this.f = lo3Var;
        lo3Var.b();
        this.c = new y2u(new u2u(this.d.getRootView().getContext(), this.d.getRootView(), this.f19671a, this.b, this.f, this.g));
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
        }
    }

    @Override // tb.w3c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484c1aa1", new Object[]{this});
            return;
        }
        q0h.b("SubEveryBodySaysEventController", "resumeMessage:" + this.e.size());
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
}
