package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.ges;
import tb.yoc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dth implements yoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f18055a;

    static {
        t2o.a(848298030);
        t2o.a(848298028);
    }

    public dth(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f18055a = iTMSPage;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        xoc xocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        yoc.a.b(this, iTMSPage);
        String g = iTMSPage.getPageParams().e().g();
        if (g != null) {
            ges gesVar = ges.INSTANCE;
            String e0 = iTMSPage.getInstance().e0();
            ckf.f(e0, "page.getInstance().url");
            ges.a o = gesVar.o(e0);
            if (o != null && !ckf.b(o.e(), g) && (xocVar = (xoc) iTMSPage.getInstance().getExtension(xoc.class)) != null) {
                xocVar.v(iTMSPage);
            }
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            yoc.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            yoc.a.a(this);
        }
    }
}
