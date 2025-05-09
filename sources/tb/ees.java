package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ees extends b9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d0ee080", new Object[]{this, iTMSPage});
            } else {
                ckf.g(iTMSPage, "page");
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e2d820", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            gaf gafVar = (gaf) iTMSPage.getExtension(gaf.class);
            if (gafVar != null) {
                gafVar.requestFocus();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.b(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            gaf gafVar = (gaf) iTMSPage.getExtension(gaf.class);
            if (gafVar != null) {
                gafVar.j1();
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.e(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.f(this, iTMSPage);
            }
        }
    }

    static {
        t2o.a(848298006);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ees(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(ees eesVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1964350479) {
            super.f((ITMSPage) objArr[0]);
            return null;
        } else if (hashCode == -719026912) {
            super.e((ITMSPage) objArr[0]);
            return null;
        } else if (hashCode == -20063730) {
            super.g((ITMSPage) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/uniapp/solution/TMSUniAppPageFactory");
        }
    }

    @Override // tb.b9s
    public void e(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5248520", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (!iTMSPage.getPageParams().j()) {
            if (iTMSPage.getExtension(dyd.class) != null) {
                iTMSPage.C(new hfl());
            } else if (iTMSPage.getExtension(ztd.class) != null) {
                iTMSPage.C(new hfl());
                iTMSPage.C(new kxt());
            } else {
                super.e(iTMSPage);
            }
        }
    }

    @Override // tb.b9s
    public void f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea63f1", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.f(iTMSPage);
        if (iTMSPage.getPageParams().e().c()) {
            iTMSPage.v(new a());
            iTMSPage.C(new b());
        }
    }

    @Override // tb.b9s
    public void g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecdda0e", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        iTMSPage.x(new pzh());
        if (iTMSPage.getPageParams().n()) {
            iTMSPage.x(new crs(iTMSPage));
            iTMSPage.x(new ifl(iTMSPage));
        } else if (iTMSPage.getPageParams().e().o()) {
            iTMSPage.x(new e17(iTMSPage));
            iTMSPage.x(new yzq(iTMSPage));
        } else {
            super.g(iTMSPage);
            iTMSPage.x(new dth(iTMSPage));
        }
    }

    @Override // tb.b9s, tb.rwd
    public ITMSPage a(String str, Window window, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("75015e30", new Object[]{this, str, window, jSONObject, str2});
        }
        ckf.g(str, "url");
        Window n = TMSInstanceExtKt.n(d(), null, window);
        return c(d(), unl.b(new unl(null, str, null, str2, false, n, null, false, null, null, null, null, false, 8149, null), null, str, null, null, false, n, null, false, null, null, null, null, false, 8157, null), jSONObject == null ? new JSONObject() : jSONObject);
    }
}
