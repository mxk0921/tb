package tb;

import android.app.Activity;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.framework.view.manager.PageHorizontalScrollManager;
import com.taobao.android.tbsku.container.TBXSkuContainer;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.oxj;
import tb.pnm;
import tb.pt1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dh7 implements rl8<hew> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final j5g B;
    public f C;
    public final ro7 D;
    public boolean E;
    public final AudioManager F;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f17812a;
    public View b;
    public PageHorizontalScrollManager c;
    public ListViewManager d;
    public NavBarViewManager e;
    public RelativeLayout f;
    public ImageView g;
    public TextView h;
    public FrameLayout i;
    public oxj.g j;
    public com.taobao.android.detail2.core.framework.base.weex.b l;
    public final cxj m;
    public utv n;
    public View o;
    public boolean p;
    public TBXSkuContainer q;
    public int v;
    public int w;
    public ryj y;
    public j7c z;
    public final List<pyj> k = new ArrayList();
    public final h r = new h(this, null);
    public final List<l> s = new ArrayList();
    public final g t = new g(this, null);
    public final List<k> u = new ArrayList();
    public final List<i> A = new ArrayList();
    public final vkb G = new a();
    public final NavBarViewManager.k H = new c();
    public final com.taobao.android.detail2.core.framework.view.feeds.a I = new d();
    public NewDetailScreenConfig.ScreenType x = H().K().a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements vkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vkb
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            x3w B = dh7.this.B();
            if (B != null) {
                jSONObject2.put("nid", (Object) B.h);
            }
            dh7.this.M0("onSkuOperation", jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements VolumeChangeManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84dfb85c", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("newVolume", (Object) Integer.valueOf(i));
            jSONObject.put("oldVolume", (Object) Integer.valueOf(i2));
            dh7.this.M0("volumeChanged", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements NavBarViewManager.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.k
        public void a(NavBarViewManager.NavOperation navOperation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ef8a679", new Object[]{this, navOperation});
            } else if (e.$SwitchMap$com$taobao$android$detail2$core$framework$view$manager$NavBarViewManager$NavOperation[navOperation.ordinal()] == 1 && !dh7.this.w()) {
                dh7.i(dh7.this).h().finishNewDetailContainer();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends com.taobao.android.detail2.core.framework.view.feeds.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/DetailViewEngine$5");
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9a222b", new Object[]{this, new Float(f)});
                return;
            }
            f(f);
            if (dh7.j(dh7.this).E0()) {
                dh7.i(dh7.this).h().finishNewDetailContainer();
            }
        }

        public final void f(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caba7991", new Object[]{this, new Float(f)});
            } else if (f > 160.0f) {
                HashMap hashMap = new HashMap();
                x3w B = dh7.this.B();
                if (B != null) {
                    hashMap.put("spm", muv.a(B, B.z()) + ".slide");
                    dh7.k(dh7.this).d("", "SlideUp_PartialScreen", "", "", hashMap, B);
                }
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void onTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
                return;
            }
            for (i iVar : dh7.l(dh7.this)) {
                if (iVar != null) {
                    iVar.onTouch(motionEvent);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$NavBarViewManager$NavOperation;

        static {
            int[] iArr = new int[NavBarViewManager.NavOperation.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$view$manager$NavBarViewManager$NavOperation = iArr;
            try {
                iArr[NavBarViewManager.NavOperation.OPERATION_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public String f17817a;
        public String b;
        public String c;

        static {
            t2o.a(352321924);
        }

        public f(dh7 dh7Var) {
        }

        public /* synthetic */ f(dh7 dh7Var, a aVar) {
            this(dh7Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321925);
        }

        public g() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else if (dh7.m(dh7.this) != null) {
                dh7.n(dh7.this).l();
                dh7.n(dh7.this).k(dh7.m(dh7.this).getHeight());
                for (l lVar : dh7.o(dh7.this)) {
                    if (lVar != null) {
                        lVar.a(dh7.m(dh7.this).getWidth(), dh7.m(dh7.this).getHeight(), true);
                    }
                }
                txj.e(txj.TAG_RENDER, "onScreenChanged, width: " + dh7.m(dh7.this).getWidth() + ", height: " + dh7.m(dh7.this).getHeight() + ", changeType: " + i);
                dh7 dh7Var = dh7.this;
                dh7.b(dh7Var, dh7.m(dh7Var).getHeight());
                dh7 dh7Var2 = dh7.this;
                dh7.d(dh7Var2, dh7.m(dh7Var2).getWidth());
            }
        }

        public /* synthetic */ g(dh7 dh7Var, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321926);
        }

        public h() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (!(i9 == dh7.c(dh7.this) && i10 == dh7.a(dh7.this))) {
                dh7.n(dh7.this).k(i10);
                dh7.n(dh7.this).l();
                dh7.e(dh7.this);
                for (l lVar : dh7.o(dh7.this)) {
                    if (lVar != null) {
                        if (dh7.f(dh7.this) != dh7.n(dh7.this).a()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        lVar.a(i9, i10, z);
                    }
                }
                txj.e(txj.TAG_RENDER, "RootView宽高发生变化, width: " + i9 + ", height: " + i10);
            }
            dh7.b(dh7.this, i10);
            dh7.d(dh7.this, i9);
            dh7 dh7Var = dh7.this;
            dh7.g(dh7Var, dh7.n(dh7Var).a());
        }

        public /* synthetic */ h(dh7 dh7Var, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
        void onTouch(MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public float f17820a;
        public float b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            t2o.a(352321928);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
        void a(j jVar);

        void b(String str, j jVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
        void a(int i, int i2, boolean z);
    }

    static {
        t2o.a(352321915);
        t2o.a(723517460);
    }

    public dh7(cxj cxjVar, FrameLayout frameLayout, VolumeChangeManager volumeChangeManager) {
        o2r.a("new_DetailViewEngine");
        this.m = cxjVar;
        this.B = new j5g(cxjVar, this);
        q0j.a(cxjVar.h(), "isKirinVideo", "true");
        this.f17812a = frameLayout;
        o2r.a(sc.initView);
        m0();
        o2r.b();
        j0();
        l0();
        q(volumeChangeManager);
        if (cxjVar.j().v0()) {
            xmo.y(y9a.b(), cxjVar.j().J().b() + 1);
        }
        this.D = new ro7();
        this.y = new ryj(cxjVar.i(), this);
        AudioManager audioManager = (AudioManager) cxjVar.i().getSystemService("audio");
        this.F = audioManager;
        if (audioManager != null) {
            this.E = audioManager.isMusicActive();
            txj.e(txj.TAG_RENDER, "create isMusicActive: " + this.E);
        }
        o2r.b();
    }

    public static /* synthetic */ int a(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a63a3ec", new Object[]{dh7Var})).intValue();
        }
        return dh7Var.v;
    }

    public static /* synthetic */ int b(dh7 dh7Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7868b49f", new Object[]{dh7Var, new Integer(i2)})).intValue();
        }
        dh7Var.v = i2;
        return i2;
    }

    public static /* synthetic */ int c(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cae58cb", new Object[]{dh7Var})).intValue();
        }
        return dh7Var.w;
    }

    public static /* synthetic */ int d(dh7 dh7Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f749ba0", new Object[]{dh7Var, new Integer(i2)})).intValue();
        }
        dh7Var.w = i2;
        return i2;
    }

    public static /* synthetic */ void e(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef90db7", new Object[]{dh7Var});
        } else {
            dh7Var.k0();
        }
    }

    public static /* synthetic */ NewDetailScreenConfig.ScreenType f(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("315ab47d", new Object[]{dh7Var});
        }
        return dh7Var.x;
    }

    public static /* synthetic */ NewDetailScreenConfig.ScreenType g(dh7 dh7Var, NewDetailScreenConfig.ScreenType screenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("1faa262", new Object[]{dh7Var, screenType});
        }
        dh7Var.x = screenType;
        return screenType;
    }

    public static /* synthetic */ cxj i(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("5aa904e1", new Object[]{dh7Var});
        }
        return dh7Var.m;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.global.a j(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("ccb5a173", new Object[]{dh7Var});
        }
        return dh7Var.H();
    }

    public static /* synthetic */ utv k(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utv) ipChange.ipc$dispatch("ccd18528", new Object[]{dh7Var});
        }
        return dh7Var.n;
    }

    public static /* synthetic */ List l(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7923c44", new Object[]{dh7Var});
        }
        return dh7Var.A;
    }

    public static /* synthetic */ View m(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c6024763", new Object[]{dh7Var});
        }
        return dh7Var.b;
    }

    public static /* synthetic */ NewDetailScreenConfig n(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig) ipChange.ipc$dispatch("75602859", new Object[]{dh7Var});
        }
        return dh7Var.S();
    }

    public static /* synthetic */ List o(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("91ae8148", new Object[]{dh7Var});
        }
        return dh7Var.s;
    }

    public final DetailVerticalRecyclerView.ScrollSpeed A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailVerticalRecyclerView.ScrollSpeed) ipChange.ipc$dispatch("986e042", new Object[]{this, str});
        }
        try {
            return DetailVerticalRecyclerView.ScrollSpeed.valueOf(str.toUpperCase());
        } catch (Exception e2) {
            txj.f("new_detail异常", "生成scrollSpeed失败，speed：" + str, e2);
            return null;
        }
    }

    public void A0(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79fbad3", new Object[]{this, list});
        } else {
            this.d.g0(list);
        }
    }

    public x3w B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("dc90f7a3", new Object[]{this});
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return null;
        }
        return listViewManager.z();
    }

    public void B0(boolean z, String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384bc28a", new Object[]{this, new Boolean(z), str, x3wVar});
        } else {
            this.d.h0(z, str, x3wVar);
        }
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a76604c2", new Object[]{this})).intValue();
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return -1;
        }
        return listViewManager.A();
    }

    public DetailRecyclerViewAdapter.c C0(List<? extends x3w> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailRecyclerViewAdapter.c) ipChange.ipc$dispatch("c0bede2e", new Object[]{this, list, new Integer(i2)});
        }
        return this.d.i0(list, i2);
    }

    public VerticalAbsViewHolder D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("8cc28625", new Object[]{this});
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return null;
        }
        return listViewManager.B();
    }

    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351b4318", new Object[]{this});
        } else {
            this.d.j0(0);
        }
    }

    public j7c E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7c) ipChange.ipc$dispatch("550147e", new Object[]{this});
        }
        return this.z;
    }

    public void E0(ListViewManager.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29078759", new Object[]{this, hVar});
        } else {
            this.d.k0(hVar);
        }
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9103f5ad", new Object[]{this});
        }
        PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
        if (pageHorizontalScrollManager != null) {
            return pageHorizontalScrollManager.c();
        }
        return "NewDetail";
    }

    public void F0(oxj.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b428d0fb", new Object[]{this, gVar});
        } else {
            this.j = gVar;
        }
    }

    public ro7 G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro7) ipChange.ipc$dispatch("9417eeca", new Object[]{this});
        }
        return this.D;
    }

    public void G0(PageHorizontalScrollManager.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6272acc", new Object[]{this, bVar});
            return;
        }
        PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
        if (pageHorizontalScrollManager != null) {
            pageHorizontalScrollManager.g(bVar);
        }
    }

    public final com.taobao.android.detail2.core.framework.data.global.a H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.m.j();
    }

    public void H0(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148bf9b8", new Object[]{this, lVar});
        } else {
            ((ArrayList) this.s).remove(lVar);
        }
    }

    public j5g I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5g) ipChange.ipc$dispatch("833cb353", new Object[]{this});
        }
        return this.B;
    }

    public void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348366d4", new Object[]{this});
        } else {
            this.e.K();
        }
    }

    public x3w J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ad8059f0", new Object[]{this});
        }
        if (this.d == null || K() == null || K().isEmpty()) {
            return null;
        }
        return K().get(K().size() - 1);
    }

    public void J0(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906288d0", new Object[]{this, list});
            return;
        }
        this.d.m0(0);
        this.d.u0(true);
        this.d.g0(list);
        this.d.q0(0);
    }

    public List<x3w> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ceeea342", new Object[]{this});
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return null;
        }
        return listViewManager.E();
    }

    public void K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81daf2fe", new Object[]{this, str});
            return;
        }
        this.m.v();
        AudioManager audioManager = this.F;
        if (audioManager != null) {
            this.E = audioManager.isMusicActive();
            txj.e(txj.TAG_RENDER, "resume isMusicActive: " + this.E);
        }
        if (str.equals(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE)) {
            PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
            if (pageHorizontalScrollManager != null) {
                pageHorizontalScrollManager.h();
            }
        } else if (str.equals("NewDetail")) {
            ListViewManager listViewManager = this.d;
            if (listViewManager != null) {
                listViewManager.n0();
            }
            ryj ryjVar = this.y;
            if (ryjVar != null) {
                ryjVar.n();
            }
        }
    }

    public int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa465ccb", new Object[]{this})).intValue();
        }
        return this.d.E().size();
    }

    public void L0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89cb4562", new Object[]{this, str, jSONObject});
        } else {
            this.e.L(str, jSONObject);
        }
    }

    public ListViewManager M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListViewManager) ipChange.ipc$dispatch("3b5694cc", new Object[]{this});
        }
        return this.d;
    }

    public void M0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3cc4ec8", new Object[]{this, str, jSONObject});
            return;
        }
        VerticalAbsViewHolder B = this.d.B();
        if (B != null) {
            B.E1(str, jSONObject);
        }
    }

    public x3w N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("3e5b4398", new Object[]{this});
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return null;
        }
        return listViewManager.G();
    }

    public void N0(j7c j7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8332a0", new Object[]{this, j7cVar});
        } else {
            this.z = j7cVar;
        }
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e453c74", new Object[]{this})).intValue();
        }
        NavBarViewManager navBarViewManager = this.e;
        if (navBarViewManager == null) {
            return 0;
        }
        return navBarViewManager.A();
    }

    public void O0(ListViewManager.ListStatus listStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de0c0fd", new Object[]{this, listStatus});
        } else {
            this.d.r0(listStatus);
        }
    }

    public cxj P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("e58a946c", new Object[]{this});
        }
        return this.m;
    }

    public boolean P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f594a6bf", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return Q0(z, null);
    }

    public oxj.g Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxj.g) ipChange.ipc$dispatch("93017322", new Object[]{this});
        }
        return this.j;
    }

    public boolean Q0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7231b7c9", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        return this.d.t0(z, str);
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3a7ef", new Object[]{this, new Boolean(z)});
            return;
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager != null) {
            listViewManager.u0(z);
        }
    }

    public final NewDetailScreenConfig S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig) ipChange.ipc$dispatch("660f67e9", new Object[]{this});
        }
        return this.m.j().K();
    }

    public void S0(String str) {
        ListViewManager listViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        if (str.equals(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE)) {
            PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
            if (pageHorizontalScrollManager != null) {
                pageHorizontalScrollManager.i();
            }
        } else if (str.equals("NewDetail") && (listViewManager = this.d) != null) {
            listViewManager.v0();
        }
        this.C = null;
    }

    public ryj T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryj) ipChange.ipc$dispatch("6ee9a16f", new Object[]{this});
        }
        return this.y;
    }

    public void T0(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd7ccb9", new Object[]{this, animation});
            return;
        }
        NavBarViewManager navBarViewManager = this.e;
        if (navBarViewManager != null && animation != null) {
            navBarViewManager.P(animation);
        }
    }

    public com.taobao.android.detail2.core.framework.base.weex.b U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.base.weex.b) ipChange.ipc$dispatch("c6a396c2", new Object[]{this});
        }
        return this.l;
    }

    public void U0(String str) {
        ListViewManager listViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        if (str.equals(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE)) {
            PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
            if (pageHorizontalScrollManager != null) {
                pageHorizontalScrollManager.j();
            }
        } else if (str.equals("NewDetail") && (listViewManager = this.d) != null) {
            listViewManager.w0();
        }
        f fVar = this.C;
        if (fVar != null) {
            q0(fVar.b, fVar.c, A(fVar.f17817a));
        }
    }

    public int V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bba3543", new Object[]{this, str})).intValue();
        }
        return this.d.I(str);
    }

    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afc8ab4", new Object[]{this, new Boolean(z)});
        } else {
            this.e.R(z);
        }
    }

    public int W(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe522eeb", new Object[]{this, str, new Integer(i2)})).intValue();
        }
        return this.d.J(str, i2);
    }

    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdf7f4c", new Object[]{this});
            return;
        }
        NavBarViewManager navBarViewManager = this.e;
        if (navBarViewManager != null) {
            navBarViewManager.S();
        }
    }

    public View X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.b;
    }

    public int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        return this.m.h().getNewDetailContainerStatusBarHeight();
    }

    public List<x3w> Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bc31491", new Object[]{this});
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return null;
        }
        return listViewManager.L();
    }

    public utv a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utv) ipChange.ipc$dispatch("5269a198", new Object[]{this});
        }
        return this.n;
    }

    public List<pyj> b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5bf6ceb", new Object[]{this});
        }
        return this.k;
    }

    public int[] c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4eeeccef", new Object[]{this});
        }
        return this.d.O();
    }

    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338169d3", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            this.i.setVisibility(8);
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed26c18", new Object[]{this});
        } else {
            this.b = LayoutInflater.from(this.m.i()).inflate(R.layout.detail_instance_layout, (ViewGroup) this.f17812a, true);
        }
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f0c675", new Object[]{this});
            return;
        }
        this.o = this.b.findViewById(R.id.instance_bottom_stub);
        if (H().r0()) {
            this.o.setVisibility(0);
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecd2396", new Object[]{this});
        } else if (this.m.i() != null && SuperItemViewHolder.VIEWHOLDER_KEY.equals(H().s())) {
            this.f.setBackgroundColor(gxq.b(this.m));
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
        } else {
            el8.b(this.m.h(), H().B(), kk8.a(hew.class, ""), this);
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6581ba", new Object[]{this});
        } else if (s0()) {
            y0();
            this.d.t();
            this.p = true;
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53515e85", new Object[]{this});
            return;
        }
        utv utvVar = new utv(this.m, this);
        this.n = utvVar;
        utvVar.c("item", new yg7(this.m, this, "Page_NewDetail"));
        this.n.c(SuperItemViewHolder.VIEWHOLDER_KEY, new yg7(this.m, this, "Page_NewDetail"));
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.l = new com.taobao.android.detail2.core.framework.base.weex.b();
        pnm.c c2 = pnm.a().c();
        if (c2 == null || c2.b() == null || !H().M().c(H().R().x)) {
            g0();
        } else {
            synchronized (c2.b()) {
                try {
                    if (c2.a() == null) {
                        c2.b().wait(1000L);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    txj.e(txj.TAG_RENDER, "主线程被中断");
                }
            }
            if (c2.a() != null) {
                c2.c(this.m.i());
                this.b = c2.a();
                this.f17812a.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
            } else {
                g0();
            }
        }
        if (this.m.l() != null && this.m.l().e() && this.m.j().N().i()) {
            View findViewById = this.b.findViewById(R.id.half_screen_second_card_default_text);
            findViewById.setVisibility(8);
            this.m.l().b(new eh7(this, findViewById));
        }
        this.b.addOnLayoutChangeListener(this.r);
        TBAutoSizeConfig.x().d0(this.t);
        this.c = new PageHorizontalScrollManager(this.m, this.b);
        o2r.a("init_ListViewManager");
        this.d = new ListViewManager(this.m, this);
        o2r.b();
        this.d.l0(this.I);
        o2r.a("NavBarViewManager");
        this.e = new NavBarViewManager(this.m, this);
        o2r.b();
        this.e.I(this.H);
        this.f = (RelativeLayout) this.b.findViewById(R.id.instance_default_layout);
        this.i = (FrameLayout) this.b.findViewById(R.id.half_screen_second_card_default_fl);
        this.g = (ImageView) this.b.findViewById(R.id.half_screen_second_card_default_img);
        this.h = (TextView) this.b.findViewById(R.id.half_screen_second_card_default_text);
        i0();
        h0();
    }

    public void n0(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcb522b", new Object[]{this, list});
        } else {
            this.d.S(list);
        }
    }

    public boolean o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("378151fe", new Object[]{this, str})).booleanValue();
        }
        if (V(str) == this.d.E().size() - 1) {
            return true;
        }
        return false;
    }

    public void p(DetailVerticalRecyclerView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b94b23", new Object[]{this, cVar});
        } else {
            this.d.o(cVar);
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager == null) {
            return false;
        }
        return listViewManager.T();
    }

    public final void q(VolumeChangeManager volumeChangeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bab3f2d", new Object[]{this, volumeChangeManager});
        } else if (volumeChangeManager != null) {
            volumeChangeManager.b(new b());
        }
    }

    public ListViewManager.i q0(String str, String str2, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListViewManager.i) ipChange.ipc$dispatch("fe746f0b", new Object[]{this, str, str2, scrollSpeed});
        }
        return this.d.U(str, str2, scrollSpeed);
    }

    public void r(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6063a3", new Object[]{this, iVar});
        } else {
            this.A.add(iVar);
        }
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb173c91", new Object[]{this})).booleanValue();
        }
        if (this.C != null) {
            return true;
        }
        return false;
    }

    public void s(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff27e515", new Object[]{this, kVar});
        } else {
            this.u.add(kVar);
        }
    }

    public final boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcdc935e", new Object[]{this})).booleanValue();
        }
        if (!H().C0() || ((!H().D0() && !H().G0()) || this.p)) {
            return false;
        }
        return true;
    }

    public void t(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fd4395", new Object[]{this, lVar});
        } else {
            this.s.add(lVar);
        }
    }

    public final boolean t0(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f1a594f", new Object[]{this, verticalAbsViewHolder})).booleanValue();
        }
        if (verticalAbsViewHolder == null || !verticalAbsViewHolder.c1() || !H().i()) {
            return false;
        }
        return true;
    }

    public void u(pyj pyjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7accfd79", new Object[]{this, pyjVar});
        } else {
            this.k.add(pyjVar);
        }
    }

    public void u0(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33c0237", new Object[]{this, x3wVar});
            return;
        }
        NavBarViewManager navBarViewManager = this.e;
        if (navBarViewManager != null) {
            navBarViewManager.Q(x3wVar);
        }
    }

    public void v(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e25f5c", new Object[]{this, list});
        } else {
            this.d.p(list);
        }
    }

    public void v0(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1fd1f", new Object[]{this, jVar});
        } else if (jVar != null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "notifyPopPositionChanged, height: " + jVar.e + ", x: " + jVar.c + ", y: " + jVar.d);
            Iterator it = ((ArrayList) this.u).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar != null) {
                    kVar.a(jVar);
                }
            }
        }
    }

    public void w0(String str, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a871bad", new Object[]{this, str, jVar});
        } else if (jVar != null) {
            txj.e(txj.TAG_VIDEO_ZOOM, "notifyPopStateChanged, state: " + str + ", startY: " + jVar.f17820a + "endY: " + jVar.b + ", height: " + jVar.e + ", width: " + jVar.f + ", x: " + jVar.c + ", y: " + jVar.d);
            Iterator it = ((ArrayList) this.u).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar != null) {
                    kVar.b(str, jVar);
                }
            }
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c22c0c6", new Object[]{this, str});
        } else {
            this.d.q(str);
        }
    }

    public void x0(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf058c7", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (str.equals(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE)) {
            PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
            if (pageHorizontalScrollManager != null) {
                pageHorizontalScrollManager.f();
            }
        } else if (str.equals("NewDetail")) {
            ryj ryjVar = this.y;
            if (ryjVar != null) {
                ryjVar.m(z, z2);
            }
            ListViewManager listViewManager = this.d;
            if (listViewManager != null) {
                listViewManager.e0(z);
            }
        }
        this.m.s();
    }

    public void y() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
        if (pageHorizontalScrollManager != null) {
            pageHorizontalScrollManager.b();
        }
        ListViewManager listViewManager = this.d;
        if (listViewManager != null) {
            listViewManager.s();
        }
        this.b.removeOnLayoutChangeListener(this.r);
        ((ArrayList) this.k).clear();
        this.j = null;
        ryj ryjVar = this.y;
        if (ryjVar != null) {
            ryjVar.k();
        }
        this.y = null;
        TBXSkuContainer tBXSkuContainer = this.q;
        if (tBXSkuContainer != null) {
            tBXSkuContainer.v();
        }
        TBAutoSizeConfig.x().h0(this.t);
        j5g j5gVar = this.B;
        if (j5gVar != null) {
            str = j5gVar.b();
        } else {
            str = "";
        }
        n5g.a(str).c();
    }

    public x3w z(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("a688924b", new Object[]{this, new Integer(i2)});
        }
        return this.d.y(i2);
    }

    public final void z0(pt1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd8cac6", new Object[]{this, aVar});
        } else if (this.m.i() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActive", (Object) String.valueOf(this.E));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("audioStatus", (Object) jSONObject);
            if (aVar != null) {
                aVar.a(jSONObject2);
            }
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c106fec3", new Object[]{this});
            return;
        }
        this.i.setVisibility(0);
        Activity i2 = this.m.i();
        if (i2 != null) {
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            layoutParams.height = (int) s5k.a(this.m);
            this.g.setLayoutParams(layoutParams);
            int b2 = s5k.b(this.m);
            if (b2 == -1) {
                this.i.setVisibility(8);
                return;
            }
            this.g.setImageDrawable(i2.getResources().getDrawable(b2));
            if (!H().D0()) {
                this.h.setText("加载中.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r7 != false) goto L_0x005a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r7 != false) goto L_0x004e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        r7 = java.lang.Math.max(0, r4);
        r8 = java.lang.Math.max(java.lang.Math.min(r6.d.E().size() - 1, r8), 0);
        r4 = new com.alibaba.fastjson.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r7 > r8) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        r4.add(r6.d.E().get(r7).W);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r4.size() >= r3) goto L_0x00ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        r3 = r3 - r4.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r7 >= r3) goto L_0x00ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r2 == false) goto L_0x00a4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        r4.add(0, new com.alibaba.fastjson.JSONObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        r4.add(new com.alibaba.fastjson.JSONObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONArray d0(com.alibaba.fastjson.JSONObject r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.dh7.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r6
            r8[r1] = r7
            r7 = 2
            r8[r7] = r3
            java.lang.String r7 = "f5c8ae98"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r8)
            com.alibaba.fastjson.JSONArray r7 = (com.alibaba.fastjson.JSONArray) r7
            return r7
        L_0x0020:
            r2 = 0
            if (r7 != 0) goto L_0x0024
            return r2
        L_0x0024:
            java.lang.String r3 = "num"
            int r3 = r7.getIntValue(r3)
            r4 = 50
            if (r3 <= r4) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.String r2 = "type"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r4 = "currentInclude"
            boolean r7 = r7.getBooleanValue(r4)
            java.lang.String r4 = "pre"
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 == 0) goto L_0x0050
            int r4 = r8 - r3
            if (r7 == 0) goto L_0x004b
            int r4 = r4 + r1
        L_0x004b:
            if (r7 == 0) goto L_0x004e
            goto L_0x005a
        L_0x004e:
            int r8 = r8 - r1
            goto L_0x005a
        L_0x0050:
            if (r7 == 0) goto L_0x0054
            r4 = r8
            goto L_0x0056
        L_0x0054:
            int r4 = r8 + 1
        L_0x0056:
            int r8 = r8 + r3
            if (r7 == 0) goto L_0x005a
            goto L_0x004e
        L_0x005a:
            int r7 = java.lang.Math.max(r0, r4)
            com.taobao.android.detail2.core.framework.view.manager.ListViewManager r4 = r6.d
            java.util.List r4 = r4.E()
            int r4 = r4.size()
            int r4 = r4 - r1
            int r8 = java.lang.Math.min(r4, r8)
            int r8 = java.lang.Math.max(r8, r0)
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            r4.<init>()
        L_0x0076:
            if (r7 > r8) goto L_0x008b
            com.taobao.android.detail2.core.framework.view.manager.ListViewManager r5 = r6.d
            java.util.List r5 = r5.E()
            java.lang.Object r5 = r5.get(r7)
            tb.x3w r5 = (tb.x3w) r5
            com.alibaba.fastjson.JSONObject r5 = r5.W
            r4.add(r5)
            int r7 = r7 + r1
            goto L_0x0076
        L_0x008b:
            int r7 = r4.size()
            if (r7 >= r3) goto L_0x00ae
            int r7 = r4.size()
            int r3 = r3 - r7
            r7 = 0
        L_0x0097:
            if (r7 >= r3) goto L_0x00ae
            if (r2 == 0) goto L_0x00a4
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            r4.add(r0, r8)
            goto L_0x00ac
        L_0x00a4:
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            r4.add(r8)
        L_0x00ac:
            int r7 = r7 + r1
            goto L_0x0097
        L_0x00ae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dh7.d0(com.alibaba.fastjson.JSONObject, int):com.alibaba.fastjson.JSONArray");
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c0fe27", new Object[]{this})).booleanValue();
        }
        PageHorizontalScrollManager pageHorizontalScrollManager = this.c;
        if (pageHorizontalScrollManager == null || !pageHorizontalScrollManager.c().equals(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE)) {
            VerticalAbsViewHolder B = this.d.B();
            if (t0(B)) {
                B.r1();
                txj.e(txj.TAG_RENDER, "被preventback拦截，未关闭newdetail instance");
                return true;
            }
            txj.e(txj.TAG_RENDER, "未拦截back行为");
            return false;
        }
        this.c.a();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r3.equals(tb.hew.OPERATE_OPEN_SKU_WITH_REQUEST) == false) goto L_0x0030;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.gl8 h(tb.hew r10) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dh7.h(tb.hew):tb.gl8");
    }
}
