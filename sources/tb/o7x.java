package tb;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.weex.WeexInstance;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.weex.runtime.TMSWeexRender;
import java.util.Map;
import tb.bbs;
import tb.fnd;
import tb.q6x;
import tb.xce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o7x implements xce, zsc, fnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f25194a;
    public final WeexInstance b;
    public final TMSWeexRender c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(851443735);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements q6x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fnd.b f25195a;

        public b(fnd.b bVar) {
            this.f25195a = bVar;
        }

        @Override // tb.q6x.b
        public void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6d3284", new Object[]{this, bitmap, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
            } else {
                this.f25195a.a(bitmap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements bbs.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f25196a;
        public final /* synthetic */ o7x b;

        public c(ITMSPage iTMSPage, o7x o7xVar) {
            this.f25196a = iTMSPage;
            this.b = o7xVar;
        }

        @Override // tb.bbs.f
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // tb.bbs.f
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // tb.bbs.f
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (this.f25196a.D() == ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR) {
                TMSLogger.f("WeexPageExtension", "WeexInstance onActivityStart");
                this.b.a().onStart();
            }
        }

        @Override // tb.bbs.f
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else if (this.f25196a.D() == ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR) {
                TMSLogger.f("WeexPageExtension", "WeexInstance onActivityStop");
                this.b.a().onStop();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oce f25197a;

        public d(oce oceVar) {
            this.f25197a = oceVar;
        }

        @Override // tb.pce
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else {
                this.f25197a.a(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cde f25198a;

        public e(cde cdeVar) {
            this.f25198a = cdeVar;
        }

        @Override // tb.dde
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else {
                this.f25198a.a(map);
            }
        }
    }

    static {
        t2o.a(851443734);
        t2o.a(851443732);
        t2o.a(839909622);
        t2o.a(839909644);
    }

    public o7x(ITMSPage iTMSPage, WeexInstance weexInstance, TMSWeexRender tMSWeexRender) {
        ckf.g(iTMSPage, "page");
        ckf.g(weexInstance, "instance");
        ckf.g(tMSWeexRender, SkuLogUtils.P_WEEX_RENDER);
        this.f25194a = iTMSPage;
        this.b = weexInstance;
        this.c = tMSWeexRender;
    }

    @Override // tb.fnd
    public void E(fnd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa76c511", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (!q9s.p2()) {
            bVar.a(null);
        } else {
            ((q6x) this.b.getExtend(q6x.class)).i("#body", null, new b(bVar));
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        xce.a.b(this, iTMSPage);
        iTMSPage.getInstance().F(new c(iTMSPage, this));
    }

    @Override // tb.nce
    public void P0(cde cdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4518aa57", new Object[]{this, cdeVar});
            return;
        }
        ckf.g(cdeVar, DataReceiveMonitor.CB_LISTENER);
        ((q6x) this.b.getExtend(q6x.class)).setWeexScrollListener(new e(cdeVar));
    }

    @Override // tb.nce
    public View W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fa3c5338", new Object[]{this});
        }
        return ((q6x) this.b.getExtend(q6x.class)).getRenderView();
    }

    public final TMSWeexRender a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWeexRender) ipChange.ipc$dispatch("c3075e2f", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            xce.a.c(this);
        }
    }

    @Override // tb.nce
    public void g0(oce oceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3625650", new Object[]{this, oceVar});
            return;
        }
        ckf.g(oceVar, DataReceiveMonitor.CB_LISTENER);
        ((q6x) this.b.getExtend(q6x.class)).setGestureEventListener(new d(oceVar));
    }

    @Override // tb.zsc
    public String getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        return this.b.getBusinessId();
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            xce.a.a(this);
        }
    }
}
