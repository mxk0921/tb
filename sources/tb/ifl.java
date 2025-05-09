package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.l4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ifl implements l4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f21292a;
    public final Window.Orientation b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909663);
            int[] iArr = new int[Window.Orientation.values().length];
            iArr[Window.Orientation.PORTRAIT.ordinal()] = 1;
            iArr[Window.Orientation.LANDSCAPE.ordinal()] = 2;
            iArr[Window.Orientation.UNSPECIFIED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(839909662);
        t2o.a(839909628);
    }

    public ifl(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f21292a = iTMSPage;
        this.b = qml.o(iTMSPage);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            l4d.a.b(this, iTMSPage);
        }
    }

    @Override // tb.l4d
    public void J0(Window.Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39236ee6", new Object[]{this, orientation});
        } else if (orientation == null) {
            Window m = this.f21292a.getPageParams().e().m();
            if (m != null) {
                m.w(this.b);
            }
            a(this.b);
        } else {
            Window m2 = this.f21292a.getPageParams().e().m();
            if (m2 != null) {
                m2.w(orientation);
            }
            a(orientation);
        }
    }

    public final void a(Window.Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff407cc", new Object[]{this, orientation});
            return;
        }
        int i = a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            this.f21292a.getInstance().I().setRequestedOrientation(1);
        } else if (i == 2) {
            this.f21292a.getInstance().I().setRequestedOrientation(0);
        } else if (i == 3) {
            this.f21292a.getInstance().I().setRequestedOrientation(-1);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            l4d.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            l4d.a.a(this);
        }
    }
}
