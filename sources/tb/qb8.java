package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.lqb;
import tb.w5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qb8 implements lqb, w5d, pnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f26649a;
    public wgv b;
    public boolean c;
    public lqb.a d;

    static {
        t2o.a(839909538);
        t2o.a(839909539);
        t2o.a(839909630);
        t2o.a(839909613);
    }

    public qb8(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f26649a = iTMSPage;
    }

    @Override // tb.w5d
    public void A(w5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7365216f", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "interceptor");
        if (cVar instanceof wgv) {
            this.b = (wgv) cVar;
            this.c = true;
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            w5d.b.b(this, iTMSPage);
        }
    }

    @Override // tb.lqb
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c663192", new Object[]{this});
            return;
        }
        wgv wgvVar = this.b;
        if (wgvVar != null) {
            wgvVar.a(this.f26649a, TMSBackPressedType.ON_KEY_DOWN);
        }
    }

    @Override // tb.pnb
    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806e9910", new Object[]{this});
            return;
        }
        lqb.a aVar = this.d;
        if (aVar != null) {
            aVar.onClose();
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            w5d.b.c(this);
        }
    }

    @Override // tb.w5d
    public void c0(w5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1b412", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "interceptor");
        if (ckf.b(cVar, this.b)) {
            this.b = null;
            this.c = false;
        }
    }

    @Override // tb.lqb
    public boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5223d8a5", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.lqb
    public String getBusinessId() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        zsc zscVar = (zsc) this.f26649a.getExtension(zsc.class);
        if (zscVar == null) {
            str = null;
        } else {
            str = zscVar.getBusinessId();
        }
        if (str == null) {
            return qml.a(this.f26649a);
        }
        return str;
    }

    @Override // tb.lqb
    public void n1(lqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4326b094", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "onClose");
        this.d = aVar;
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            w5d.b.a(this);
        }
    }

    @Override // tb.w5d
    public boolean C0(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("818a23eb", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        ckf.g(tMSBackPressedType, "type");
        return false;
    }
}
