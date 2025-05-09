package tb;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.popview.BasePopView;
import tb.xs1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ztq extends xs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ztq(BasePopContainer basePopContainer, pfw pfwVar, e3b e3bVar) {
        super(basePopContainer, pfwVar, e3bVar);
        this.f = new xtq(e3bVar);
    }

    public static /* synthetic */ void A(ztq ztqVar, xs1.d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fd57c2", new Object[]{ztqVar, dVar, new Boolean(z), str});
        } else {
            ztqVar.q(dVar, z, str);
        }
    }

    public static /* synthetic */ void B(ztq ztqVar, thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f76df9f", new Object[]{ztqVar, thmVar});
        } else {
            ztqVar.w(thmVar);
        }
    }

    public static /* synthetic */ xq1 C(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq1) ipChange.ipc$dispatch("4289d6de", new Object[]{ztqVar});
        }
        return ztqVar.f;
    }

    public static /* synthetic */ xq1 D(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq1) ipChange.ipc$dispatch("d6a8e6fd", new Object[]{ztqVar});
        }
        return ztqVar.f;
    }

    public static /* synthetic */ BasePopContainer E(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("8117fbc7", new Object[]{ztqVar});
        }
        return ztqVar.d;
    }

    public static /* synthetic */ void F(ztq ztqVar, xs1.d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d393258", new Object[]{ztqVar, dVar, new Boolean(z), str});
        } else {
            ztqVar.q(dVar, z, str);
        }
    }

    public static /* synthetic */ void G(ztq ztqVar, thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95067e35", new Object[]{ztqVar, thmVar});
        } else {
            ztqVar.w(thmVar);
        }
    }

    public static /* synthetic */ void H(ztq ztqVar, xs1.d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca8975a", new Object[]{ztqVar, dVar, new Boolean(z), str});
        } else {
            ztqVar.q(dVar, z, str);
        }
    }

    public static /* synthetic */ xq1 I(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq1) ipChange.ipc$dispatch("bb443798", new Object[]{ztqVar});
        }
        return ztqVar.f;
    }

    public static /* synthetic */ Handler J(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("12962ee8", new Object[]{ztqVar});
        }
        return ztqVar.f31573a;
    }

    public static /* synthetic */ Object ipc$super(ztq ztqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/container/sub/SubContainerPopTrigger");
    }

    public static /* synthetic */ void y(ztq ztqVar, xs1.d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea2b5d3", new Object[]{ztqVar, dVar, new Boolean(z), str});
        } else {
            ztqVar.q(dVar, z, str);
        }
    }

    public static /* synthetic */ xq1 z(ztq ztqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq1) ipChange.ipc$dispatch("ae6ac6bf", new Object[]{ztqVar});
        }
        return ztqVar.f;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f33010a = 0;
        public final /* synthetic */ IPopData b;
        public final /* synthetic */ xs1.d c;
        public final /* synthetic */ thm d;
        public final /* synthetic */ dbd e;
        public final /* synthetic */ IPopConfig f;

        public a(IPopData iPopData, xs1.d dVar, thm thmVar, dbd dbdVar, IPopConfig iPopConfig) {
            this.b = iPopData;
            this.c = dVar;
            this.d = thmVar;
            this.e = dbdVar;
            this.f = iPopConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b.isAllowShow()) {
                ztq.y(ztq.this, this.c, false, esu.ERROR_MSG_SHOW_COUNT_INVALID);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                View a2 = ztq.z(ztq.this).a(this.d);
                IPopAnchorViewInfo c = ztq.C(ztq.this).c(a2, 0);
                if (a(c)) {
                    bgm.b("PopTargetCardValid", this.b);
                    BasePopView createPopView = ztq.E(ztq.this).createPopView(this.b, this.e, a2, c, ztq.D(ztq.this), this.d);
                    if (createPopView == null) {
                        if (this.f.getPopContentType() == 1) {
                            str = esu.ERROR_DX_RENDER_FAILED;
                        } else {
                            str = esu.ERROR_WEEX_RENDER_FAILED;
                        }
                        ztq.F(ztq.this, this.c, false, str);
                        ztq.G(ztq.this, this.d);
                        vfm.f("SubContainerPopTrigger ", "create popView error, saveToPending, bizId=" + this.b);
                        return;
                    }
                    ztq.H(ztq.this, this.c, true, "0");
                    vfm.f("SubContainerPopTrigger ", "create new pop success, popView=" + createPopView.hashCode() + ", businessId=" + this.b.getBusinessID() + ", useTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
        }

        private boolean a(IPopAnchorViewInfo iPopAnchorViewInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce9a2b00", new Object[]{this, iPopAnchorViewInfo})).booleanValue();
            }
            if (iPopAnchorViewInfo == null) {
                vfm.f("SubContainerPopTrigger ", "IPopAnchorViewInfo is null");
            } else if (iPopAnchorViewInfo.getScreenX() < 0) {
                vfm.f("SubContainerPopTrigger ", "getScreenX < 0, rePost, info=" + iPopAnchorViewInfo);
            } else if (ztq.I(ztq.this).b(this.b, iPopAnchorViewInfo, null) >= 0) {
                return true;
            }
            int i = this.f33010a + 1;
            this.f33010a = i;
            if (i < 5) {
                vfm.f("SubContainerPopTrigger ", "rePost," + this.b.getBusinessID() + ", count=" + this.f33010a);
                ztq.J(ztq.this).postDelayed(this, 50L);
            } else {
                ztq.A(ztq.this, this.c, false, "9");
                ztq.B(ztq.this, this.d);
            }
            return false;
        }
    }

    @Override // tb.xs1
    public void i(thm thmVar, xs1.d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123b04", new Object[]{this, thmVar, dVar});
        } else if (!thmVar.a().isAllowShow()) {
            q(dVar, false, esu.ERROR_MSG_SHOW_COUNT_INVALID);
        } else {
            IPopData a2 = thmVar.a();
            IPopConfig popConfig = a2.getPopConfig();
            dbd a3 = this.e.a(popConfig.getPopContentType());
            if (a3 == null) {
                if (popConfig.getPopContentType() == 1) {
                    str = esu.ERROR_DX_RENDER_FAILED;
                } else {
                    str = esu.ERROR_WEEX_RENDER_FAILED;
                }
                q(dVar, false, str);
                vfm.f("SubContainerPopTrigger ", "no viewProvider by contentType=" + popConfig.getPopContentType());
                return;
            }
            new a(a2, dVar, thmVar, a3, popConfig).run();
        }
    }
}
