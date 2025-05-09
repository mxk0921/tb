package com.taobao.android.detail.ttdetail.container;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.widget.recycler.SlideItemAnimator;
import com.taobao.taobao.R;
import java.util.List;
import tb.d1i;
import tb.ftn;
import tb.hzh;
import tb.nb4;
import tb.oa4;
import tb.t2o;
import tb.tgh;
import tb.tua;
import tb.vbl;
import tb.wua;
import tb.yc4;
import tb.yns;
import tb.z4k;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainScreenCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANIMATOR_CHANGE_TAB = "animator_change_tab";
    public static final int LEFT_2_RIGHT_ANIMATOR = 2;
    public static final int NONE_ANIMATOR = 0;
    public static final int RIGHT_2_LEFT_ANIMATOR = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6731a;
    public final ze7 b;
    public View c;
    public RecyclerView d;
    public final MainRecyclerAdapter e;
    public oa4 f;
    public d1i g;
    public tua h;
    public c i;
    public volatile boolean j;
    public volatile int k;
    public HeaderPauseResumeListener m;
    public String n;
    public final boolean o = vbl.o1();
    public final String[] l = {"BybtEvaluation", "TeMaiEvaluation", "DetailCommentDefault", "commentSectionV3", "detail3Comment"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class HeaderPauseResumeListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final tua c;

        /* renamed from: a  reason: collision with root package name */
        public int f6733a = 0;
        public int b = 0;
        public volatile boolean d = true;

        static {
            t2o.a(912261512);
        }

        public HeaderPauseResumeListener(tua tuaVar) {
            this.c = tuaVar;
        }

        public static /* synthetic */ Object ipc$super(HeaderPauseResumeListener headerPauseResumeListener, String str, Object... objArr) {
            if (str.hashCode() == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/MainScreenCore$HeaderPauseResumeListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            MainScreenCore mainScreenCore = MainScreenCore.this;
            MainScreenCore.b(mainScreenCore, MainScreenCore.a(mainScreenCore) + i2);
            if (MainScreenCore.a(MainScreenCore.this) > 100 && !MainScreenCore.c(MainScreenCore.this)) {
                MainScreenCore.d(MainScreenCore.this);
            }
            if (MainScreenCore.e(MainScreenCore.this) != null) {
                int childCount = recyclerView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = recyclerView.getChildAt(i3);
                    if (MainScreenCore.g(MainScreenCore.this, MainScreenCore.f(MainScreenCore.this).N(recyclerView.getChildAdapterPosition(childAt)))) {
                        MainScreenCore.e(MainScreenCore.this).j(childAt.getTop());
                        break;
                    }
                    i3++;
                }
            }
            if (MainScreenCore.h(MainScreenCore.this) != null) {
                int childCount2 = recyclerView.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount2) {
                        break;
                    }
                    View childAt2 = recyclerView.getChildAt(i4);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt2);
                    MainScreenCore mainScreenCore2 = MainScreenCore.this;
                    String i5 = MainScreenCore.i(mainScreenCore2, MainScreenCore.f(mainScreenCore2).N(childAdapterPosition));
                    if (!TextUtils.isEmpty(i5)) {
                        MainScreenCore.h(MainScreenCore.this).a(i5, childAt2.getTop());
                        break;
                    }
                    i4++;
                }
            }
            tua tuaVar = this.c;
            if (tuaVar != null) {
                View componentView = tuaVar.getComponentView(null);
                if (MainScreenCore.j(MainScreenCore.this) != null) {
                    int i6 = this.b;
                    int i7 = this.f6733a;
                    View findContainingItemView = recyclerView.findContainingItemView(componentView);
                    if (findContainingItemView != null) {
                        this.b = findContainingItemView.getMeasuredHeight();
                        this.f6733a = findContainingItemView.getTop();
                    } else if (ftn.a(recyclerView) > 0) {
                        this.f6733a = -this.b;
                    }
                    if (!(i6 == this.b && i7 == this.f6733a)) {
                        MainScreenCore.j(MainScreenCore.this).e(this.b, this.f6733a);
                    }
                }
                if (componentView.getWindowToken() == null) {
                    if (this.d) {
                        this.c.F(false);
                        this.d = false;
                    }
                } else if (!this.d) {
                    this.c.G(false);
                    this.d = true;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(String str, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void j(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void e(int i, int i2);
    }

    static {
        t2o.a(912261510);
    }

    public MainScreenCore(Context context, ze7 ze7Var) {
        this.f6731a = context;
        this.b = ze7Var;
        B(context, ze7Var);
        this.e = new MainRecyclerAdapter(context, ze7Var);
    }

    public static /* synthetic */ int a(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ead60eb8", new Object[]{mainScreenCore})).intValue();
        }
        return mainScreenCore.k;
    }

    public static /* synthetic */ int b(MainScreenCore mainScreenCore, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276f3453", new Object[]{mainScreenCore, new Integer(i)})).intValue();
        }
        mainScreenCore.k = i;
        return i;
    }

    public static /* synthetic */ boolean c(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87440b28", new Object[]{mainScreenCore})).booleanValue();
        }
        return mainScreenCore.j;
    }

    public static /* synthetic */ void d(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b20783", new Object[]{mainScreenCore});
        } else {
            mainScreenCore.A();
        }
    }

    public static /* synthetic */ b e(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bb9ccd06", new Object[]{mainScreenCore});
        }
        mainScreenCore.getClass();
        return null;
    }

    public static /* synthetic */ MainRecyclerAdapter f(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainRecyclerAdapter) ipChange.ipc$dispatch("21d1346e", new Object[]{mainScreenCore});
        }
        return mainScreenCore.e;
    }

    public static /* synthetic */ boolean g(MainScreenCore mainScreenCore, oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66056e6", new Object[]{mainScreenCore, oa4Var})).booleanValue();
        }
        return mainScreenCore.E(oa4Var);
    }

    public static /* synthetic */ a h(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d4281cb6", new Object[]{mainScreenCore});
        }
        mainScreenCore.getClass();
        return null;
    }

    public static /* synthetic */ String i(MainScreenCore mainScreenCore, oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79d3cabc", new Object[]{mainScreenCore, oa4Var});
        }
        return mainScreenCore.s(oa4Var);
    }

    public static /* synthetic */ c j(MainScreenCore mainScreenCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("296f7684", new Object[]{mainScreenCore});
        }
        return mainScreenCore.i;
    }

    public static /* synthetic */ boolean k(MainScreenCore mainScreenCore, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebca486b", new Object[]{mainScreenCore, new Integer(i)})).booleanValue();
        }
        return mainScreenCore.D(i);
    }

    public final void A() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcad3043", new Object[]{this});
            return;
        }
        Context context = this.f6731a;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) != null) {
            findViewById.setVisibility(8);
            this.j = true;
        }
    }

    public final void B(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd5c975", new Object[]{this, context, ze7Var});
            return;
        }
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            this.c = g.j(context, R.layout.tt_detail_main_screen_container, null, true);
        } else {
            this.c = LayoutInflater.from(context).inflate(R.layout.tt_detail_main_screen_container, (ViewGroup) null);
        }
        RecyclerView recyclerView = (RecyclerView) this.c.findViewById(R.id.rv_main_screen_container);
        this.d = recyclerView;
        recyclerView.setHasFixedSize(true);
        Feature feature = (Feature) this.b.e().f(Feature.class);
        if (!this.o || !DataUtils.i0(feature)) {
            m(this.d, false);
        } else {
            m(this.d, true);
        }
    }

    public final boolean E(oa4 oa4Var) {
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1efffa4c", new Object[]{this, oa4Var})).booleanValue();
        }
        if (!(oa4Var == null || (h = oa4Var.getComponentData().h()) == null)) {
            for (String str : this.l) {
                if (h.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void F() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
            return;
        }
        Feature feature = (Feature) this.b.e().f(Feature.class);
        Resource resource = (Resource) this.b.e().f(Resource.class);
        if (resource != null) {
            str = resource.getPageKey();
        } else {
            str = null;
        }
        if (!this.o || !DataUtils.i0(feature) || (str2 = this.n) == null || TextUtils.equals(str2, str)) {
            m(this.d, false);
            this.e.c(0);
        } else {
            m(this.d, true);
            Object k = this.b.e().k(ANIMATOR_CHANGE_TAB);
            if (k != null && (k instanceof Integer)) {
                this.e.c(((Integer) k).intValue());
            }
        }
        this.n = str;
        d1i d1iVar = (d1i) this.b.e().e(hzh.PARSER_ID);
        if (this.g != d1iVar) {
            this.g = d1iVar;
            if (d1iVar != null) {
                this.f = DataUtils.e(d1iVar.t(), this.b.d());
                List<oa4> i = DataUtils.i(this.g.t(), this.b.d());
                if (i == null || i.isEmpty()) {
                    tgh.b("MainScreenCore", "onDataUpdate DataUtils.extractMainScreenData() return empty");
                    return;
                }
                z4k<wua> p = d1iVar.t().p();
                if (p != null) {
                    tua tuaVar = (tua) p.f(this.b.d());
                    this.h = tuaVar;
                    if (tuaVar != null) {
                        if (this.m == null) {
                            HeaderPauseResumeListener headerPauseResumeListener = new HeaderPauseResumeListener(this.h);
                            this.m = headerPauseResumeListener;
                            this.d.addOnScrollListener(headerPauseResumeListener);
                        }
                        ViewGroup w = w();
                        this.h.B(w);
                        this.h.A(w);
                    }
                }
                I();
                this.e.Z(i);
                if (vbl.e()) {
                    l();
                }
                if (this.d.getAdapter() == null) {
                    this.d.setLayoutManager(new OffsetLinearLayoutManager(this.f6731a));
                    this.d.setAdapter(this.e);
                }
                this.e.b();
            }
        }
    }

    public void G(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b4f73d", new Object[]{this, str, new Integer(i)});
            return;
        }
        int itemCount = this.e.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, s(this.e.N(i2)))) {
                RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, i);
                    return;
                }
            }
        }
    }

    public void H(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d372caea", new Object[]{this, cVar});
        } else {
            this.i = cVar;
        }
    }

    public final void I() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166e028d", new Object[]{this});
            return;
        }
        Context context = this.f6731a;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.tt_detail_top_container)) != null) {
            Feature feature = (Feature) this.b.e().f(Feature.class);
            if (feature != null && feature.isIndustryDynamicLayout()) {
                findViewById.setBackgroundColor(-986896);
            } else if (feature == null || !feature.isDetail3()) {
                findViewById.setBackgroundColor(-986896);
            } else {
                findViewById.setBackgroundColor(-1);
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f89f9fe", new Object[]{this});
        } else if (!C()) {
            this.d.setChildDrawingOrderCallback(null);
        } else {
            this.d.setChildDrawingOrderCallback(new RecyclerView.ChildDrawingOrderCallback() { // from class: com.taobao.android.detail.ttdetail.container.MainScreenCore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
                public int onGetChildDrawingOrder(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("4afc142f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
                    }
                    int i3 = i2 + 1;
                    if (i3 >= i) {
                        return i2;
                    }
                    try {
                        if (MainScreenCore.k(MainScreenCore.this, i2)) {
                            return i3;
                        }
                        int i4 = i2 - 1;
                        if (i4 < 0) {
                            return i2;
                        }
                        if (MainScreenCore.k(MainScreenCore.this, i4)) {
                            return i4;
                        }
                        return i2;
                    } catch (Exception e) {
                        tgh.c("MainScreenCore", "adjustRecyclerViewDrawOrder error", e);
                        return i2;
                    }
                }
            });
        }
    }

    public final void m(RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbea214", new Object[]{this, recyclerView, new Boolean(z)});
            return;
        }
        try {
            if (!z) {
                recyclerView.setItemAnimator(null);
            } else if (!(recyclerView.getItemAnimator() instanceof SlideItemAnimator)) {
                recyclerView.setItemAnimator(new SlideItemAnimator());
                recyclerView.getItemAnimator().setAddDuration(240L);
                recyclerView.getItemAnimator().setChangeDuration(240L);
                recyclerView.getItemAnimator().setRemoveDuration(240L);
                recyclerView.getItemAnimator().setMoveDuration(240L);
                ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.e.destroy();
        yc4.a(-1, this.e.O());
    }

    public oa4 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("4f508995", new Object[]{this});
        }
        try {
            return this.e.O().remove(0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public <C extends oa4> C p(String str) {
        yns t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        d1i d1iVar = this.g;
        if (d1iVar == null || (t = d1iVar.t()) == null) {
            return null;
        }
        return (C) t.b(str);
    }

    public <C extends oa4> C q(String str) {
        yns t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        d1i d1iVar = this.g;
        if (d1iVar == null || (t = d1iVar.t()) == null) {
            return null;
        }
        return (C) t.a(str, this.b.d());
    }

    public oa4 r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("ea25806b", new Object[]{this});
        }
        return this.f;
    }

    public final String s(oa4 oa4Var) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d07841ec", new Object[]{this, oa4Var});
        }
        if (oa4Var == null || (f = oa4Var.getComponentData().f()) == null) {
            return null;
        }
        return f.getString("bizId");
    }

    public List<oa4> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.e.O();
    }

    public int u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be913385", new Object[]{this, str})).intValue();
        }
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            oa4 N = this.e.N(this.d.getChildAdapterPosition(childAt));
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, s(N))) {
                return childAt.getTop();
            }
        }
        return -1;
    }

    public int[] v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("be603220", new Object[]{this});
        }
        tua tuaVar = this.h;
        if (tuaVar != null) {
            return tuaVar.D();
        }
        return null;
    }

    public final ViewGroup w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9bd95a7c", new Object[]{this});
        }
        Context context = this.f6731a;
        if (context instanceof Activity) {
            return (ViewGroup) ((Activity) context).findViewById(R.id.fl_tt_detail_mini_video_container);
        }
        return null;
    }

    public String x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856294ce", new Object[]{this, new Integer(i)});
        }
        tua tuaVar = this.h;
        if (tuaVar != null) {
            return tuaVar.E(i);
        }
        return null;
    }

    public RecyclerView y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.d;
    }

    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public final boolean C() {
        JSONObject f;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71595af6", new Object[]{this})).booleanValue();
        }
        List<oa4> O = this.e.O();
        if (O == null) {
            return false;
        }
        for (int i = 0; i < O.size(); i++) {
            nb4 componentData = O.get(i).getComponentData();
            if (!(componentData == null || (f = componentData.f()) == null || (string = f.getString("_dMarginBottom")) == null)) {
                try {
                    if (Integer.parseInt(string) < 0) {
                        return true;
                    }
                } catch (Exception e) {
                    tgh.c("MainScreenCore", "解析组件margin数据失败", e);
                }
            }
        }
        return false;
    }

    public final boolean D(int i) {
        RecyclerView.ViewHolder childViewHolder;
        oa4 b0;
        nb4 componentData;
        JSONObject f;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13dce6da", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View childAt = this.d.getChildAt(i);
        if (childAt == null || (childViewHolder = this.d.getChildViewHolder(childAt)) == null || !(childViewHolder instanceof MainRecyclerAdapter.MainViewHolder) || (b0 = ((MainRecyclerAdapter.MainViewHolder) childViewHolder).b0()) == null || (componentData = b0.getComponentData()) == null || (f = componentData.f()) == null || (string = f.getString("_dMarginBottom")) == null) {
            return false;
        }
        try {
            return Integer.parseInt(string) < 0;
        } catch (Exception e) {
            tgh.c("MainScreenCore", "解析组件margin数据失败", e);
            return false;
        }
    }
}
