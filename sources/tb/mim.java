package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24064a = new CopyOnWriteArrayList();
    public final IPopViewService b;
    public IPopViewService.c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IPopViewService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b05175a", new Object[]{this, str});
            } else {
                mim.a(mim.this).add(str);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0d9b87a", new Object[]{this, str});
            } else {
                mim.a(mim.this).remove(str);
            }
        }
    }

    static {
        t2o.a(491782611);
    }

    public mim(cfc cfcVar) {
        this.b = (IPopViewService) cfcVar.a(IPopViewService.class);
        d();
    }

    public static /* synthetic */ List a(mim mimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("412734c4", new Object[]{mimVar});
        }
        return mimVar.f24064a;
    }

    public final IPopViewService.c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopViewService.c) ipChange.ipc$dispatch("43bc821e", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            f();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88a2547", new Object[]{this});
        } else if (this.b != null) {
            IPopViewService.c b = b();
            this.c = b;
            this.b.addPopViewUpdateListener(b);
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff156ac", new Object[]{this, str})).booleanValue();
        }
        if (((CopyOnWriteArrayList) this.f24064a).isEmpty()) {
            return false;
        }
        return ((CopyOnWriteArrayList) this.f24064a).contains(str);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f490de", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.b;
        if (iPopViewService != null) {
            iPopViewService.removePopViewUpdateListener(this.c);
        }
    }
}
