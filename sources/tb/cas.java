package tb;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.tll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cas implements swd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f16946a;
    public final ViewGroup b;
    public ITMSPage c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ bcs b;

        public a(bcs bcsVar) {
            this.b = bcsVar;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return cas.h(cas.this).I();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            return null;
        }

        @Override // tb.tll
        public x5d getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.tll
        public y0e getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
            }
            return tll.a.a(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ bas b;

        public b(bas basVar) {
            this.b = basVar;
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return cas.h(cas.this).I();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            return null;
        }

        @Override // tb.tll
        public x5d getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.tll
        public y0e getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
            }
            return tll.a.a(this);
        }
    }

    static {
        t2o.a(835715147);
        t2o.a(839909871);
    }

    public cas(bbs bbsVar, ViewGroup viewGroup) {
        ckf.g(bbsVar, "mInstance");
        this.f16946a = bbsVar;
        this.b = viewGroup;
    }

    public static final /* synthetic */ bbs h(cas casVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("f6ac6095", new Object[]{casVar});
        }
        return casVar.f16946a;
    }

    @Override // tb.swd
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e21e34", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.swd
    public int c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48de2872", new Object[]{this, iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "page");
        return -1;
    }

    @Override // tb.swd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.destroy();
        }
    }

    @Override // tb.swd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b26459", new Object[]{this});
        }
    }

    @Override // tb.swd
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f16b1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        yad yadVar = (yad) this.f16946a.getExtension(yad.class);
        if (yadVar == null) {
            return false;
        }
        yadVar.E();
        return true;
    }

    @Override // tb.swd
    public int getAlivePageCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26f55263", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.swd
    public ITMSPage getPageByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a28d109b", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    @Override // tb.swd
    public ITMSPage getTopPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("5a383c0c", new Object[]{this});
        }
        return this.c;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b976f5", new Object[]{this});
            return;
        }
        this.d = true;
        ITMSPage iTMSPage = this.c;
        if (iTMSPage != null) {
            iTMSPage.s();
        }
    }

    @Override // tb.swd
    public boolean d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a56d860", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }

    @Override // tb.swd
    public boolean g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bed53ea", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }

    @Override // tb.swd
    public boolean a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e400fe7f", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        this.c = iTMSPage;
        StartParams startParams = (StartParams) iTMSPage.getInstance().g(StartParams.class);
        TMSEmbedPresentModeType tMSEmbedPresentModeType = null;
        if (startParams == null) {
            startParams = null;
        }
        if (startParams != null) {
            tMSEmbedPresentModeType = startParams.getEmbedType();
        }
        if (tMSEmbedPresentModeType == null) {
            tMSEmbedPresentModeType = TMSEmbedPresentModeType.CARD;
        }
        pgd pgdVar = (pgd) iTMSPage.getExtension(pgd.class);
        if (pgdVar != null) {
            pgdVar.J(tMSEmbedPresentModeType);
        }
        if (this.f16946a.a0() == TMSSolutionType.UNIAPP) {
            Activity I = this.f16946a.I();
            ckf.f(I, "mInstance.activity");
            bcs bcsVar = new bcs(I, iTMSPage);
            iTMSPage.B(new a(bcsVar));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.addView(bcsVar.getView(), 0);
            }
        } else if (!q9s.e2() || this.f16946a.a0() == TMSSolutionType.WIDGET) {
            ViewGroup viewGroup2 = this.b;
            if (viewGroup2 != null) {
                viewGroup2.addView(iTMSPage.getView(), 0);
            }
        } else {
            Activity I2 = this.f16946a.I();
            ckf.f(I2, "mInstance.activity");
            bas basVar = new bas(I2, iTMSPage);
            iTMSPage.B(new b(basVar));
            ViewGroup viewGroup3 = this.b;
            if (viewGroup3 != null) {
                viewGroup3.addView(basVar.getView(), 0);
            }
        }
        pgd pgdVar2 = (pgd) iTMSPage.getExtension(pgd.class);
        if (pgdVar2 != null) {
            pgdVar2.w(tMSEmbedPresentModeType);
        }
        if (this.d) {
            iTMSPage.s();
        }
        return true;
    }
}
