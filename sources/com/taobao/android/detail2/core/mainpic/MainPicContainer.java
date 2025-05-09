package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicVideoViewHolder;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.g9w;
import tb.gbx;
import tb.hsm;
import tb.nd2;
import tb.o0i;
import tb.ome;
import tb.p0i;
import tb.s0i;
import tb.s0m;
import tb.s2m;
import tb.so7;
import tb.t2o;
import tb.txj;
import tb.u0i;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_REFRESH = "MainPicRefresh";
    public static final String ACTIVE_SCROLL = "MainPicScroll";
    public static final String ACTIVE_SUPPLEMENT = "MainPicSupplement";
    public static final String DIS_ACTIVE_SCROLL = "MainPicScroll";
    public static final String WILL_ACTIVE_CONTAINER = "MainPicContainer";
    public static final String WILL_ACTIVE_SCROLL = "MainPicScroll";
    public static final String WILL_DIS_ACTIVE_CONTAINER = "MainPicContainer";
    public static final String WILL_DIS_ACTIVE_SCROLL = "MainPicScroll";

    /* renamed from: a  reason: collision with root package name */
    public final MainPicHorizontalRecyclerView f7204a;
    public MainPicHorizontalAdapter b;
    public final a.b c;
    public final Context d;
    public final PullBase f;
    public final TextView g;
    public final TextView h;
    public o0i i;
    public final s2m j;
    public final MainPicHorizontalRecyclerView.b m;
    public final MainPicHorizontalRecyclerView.a n;
    public boolean e = true;
    public boolean k = false;
    public final MainPicAbsViewHolder.a l = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements PullBase.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.ptr.PullBase.f
        public void a(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42e8cf81", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            } else if (MainPicContainer.this.n().b) {
                if (i < MainPicContainer.this.n().c) {
                    MainPicContainer.a(MainPicContainer.this).setText(MainPicContainer.this.n().d);
                } else {
                    MainPicContainer.a(MainPicContainer.this).setText(MainPicContainer.this.n().e);
                }
                MainPicContainer.b(MainPicContainer.this).setVisibility(0);
            } else {
                MainPicContainer.a(MainPicContainer.this).setText("");
                MainPicContainer.b(MainPicContainer.this).setVisibility(8);
            }
        }

        @Override // com.taobao.ptr.PullBase.f
        public void b(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa9e8d15", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            }
        }

        @Override // com.taobao.ptr.PullBase.f
        public void c(PullBase pullBase, PullBase.Mode mode, float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ae3699d", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
            } else if (i >= MainPicContainer.this.n().c && MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("direction", (Object) "right");
                MainPicContainer.c(MainPicContainer.this).f("onMainPicScrollToEnd", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MainPicAbsViewHolder.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder.a
        public void a(gbx.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac767aff", new Object[]{this, dVar});
            } else if (dVar != null && MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(dVar.f19883a));
                jSONObject.put("clickArea", (Object) dVar.b);
                jSONObject.put("coordinateX", (Object) dVar.c);
                jSONObject.put("coordinateY", (Object) dVar.d);
                jSONObject.put("state", (Object) dVar.f);
                MainPicContainer.c(MainPicContainer.this).f("onMainPicLongClick", jSONObject);
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder.a
        public void b(gbx.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e8ddbe3", new Object[]{this, dVar});
            } else if (dVar != null && MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(dVar.f19883a));
                jSONObject.put("clickArea", (Object) dVar.b);
                jSONObject.put("coordinateX", (Object) dVar.c);
                jSONObject.put("coordinateY", (Object) dVar.d);
                MainPicContainer.c(MainPicContainer.this).f("onMainPicClick", jSONObject);
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder.a
        public void c(gbx.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1597aa14", new Object[]{this, dVar});
            } else if (dVar != null && MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(dVar.f19883a));
                jSONObject.put("clickArea", (Object) dVar.b);
                jSONObject.put("coordinateX", (Object) dVar.c);
                jSONObject.put("coordinateY", (Object) dVar.d);
                MainPicContainer.c(MainPicContainer.this).f("onMainPicDoubleClick", jSONObject);
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder.a
        public void d(gbx.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d148de1", new Object[]{this, dVar});
            } else if (dVar != null && MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(dVar.f19883a));
                jSONObject.put("clickArea", (Object) dVar.b);
                jSONObject.put("status", (Object) dVar.e);
                MainPicContainer.c(MainPicContainer.this).f("onMainPicScaleGesture", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements MainPicHorizontalRecyclerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7208a = false;

        public c() {
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.b
        public void onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7b587fa", new Object[]{this, motionEvent});
            } else if (motionEvent.getActionMasked() == 0) {
                this.f7208a = true;
                MainPicContainer.e(MainPicContainer.this, true);
                motionEvent.getX();
                motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 1) {
                this.f7208a = false;
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.b
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.b
        public void onTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
            } else if (MainPicContainer.c(MainPicContainer.this).getNewDetailContext().l() != null && MainPicContainer.c(MainPicContainer.this).getNewDetailContext().l().c()) {
            } else {
                if (motionEvent == null || motionEvent.getActionMasked() != 3) {
                    MainPicContainer.this.j();
                }
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.b
        public void a(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b2f49e4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (Math.abs(i) > 0 && this.f7208a) {
                this.f7208a = false;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "dragStart");
                txj.e(txj.TAG_RENDER, "onMainPicScrollStateChange: dragStart");
                if (MainPicContainer.c(MainPicContainer.this) != null) {
                    MainPicContainer.c(MainPicContainer.this).f("onMainPicScrollStateChange", jSONObject);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements MainPicHorizontalRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c35ac4d", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            MainPicAbsViewHolder p = MainPicContainer.this.p(i);
            MainPicAbsViewHolder p2 = MainPicContainer.this.p(i2);
            if (MainPicContainer.c(MainPicContainer.this) != null) {
                JSONObject jSONObject = new JSONObject();
                if (p != null) {
                    jSONObject.put("fromPosition", (Object) Integer.valueOf(p.g0()));
                }
                if (p2 != null) {
                    jSONObject.put("targetPosition", (Object) Integer.valueOf(p2.g0()));
                }
                jSONObject.put("isAuto", (Object) Boolean.valueOf(MainPicContainer.f(MainPicContainer.this)));
                MainPicContainer.c(MainPicContainer.this).f("onMainPicFrameChange", jSONObject);
            }
            if (p != null) {
                p.f0("MainPicScroll");
            }
            if (p2 != null) {
                p2.b0("MainPicScroll");
            }
            if (i2 >= MainPicContainer.g(MainPicContainer.this).T() && p2 != null) {
                MainPicContainer.h(MainPicContainer.this).scrollToPosition(p2.g0());
                txj.e(txj.TAG_MAIN_PIC, "无限滚动超过真实数据大小调整 scrollTo: " + p2.g0());
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.a
        public void b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("321f054d", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            MainPicAbsViewHolder p = MainPicContainer.this.p(i2);
            if (MainPicContainer.c(MainPicContainer.this) != null && !MainPicContainer.d(MainPicContainer.this)) {
                JSONObject jSONObject = new JSONObject();
                if (p != null) {
                    jSONObject.put("fromPosition", (Object) Integer.valueOf(p.g0()));
                    jSONObject.put("targetPosition", (Object) Integer.valueOf(p.g0()));
                }
                jSONObject.put("isAuto", (Object) Boolean.valueOf(MainPicContainer.f(MainPicContainer.this)));
                MainPicContainer.c(MainPicContainer.this).f("onMainPicFrameChange", jSONObject);
            }
            if (p != null && !MainPicContainer.d(MainPicContainer.this)) {
                p.b0("MainPicScroll");
            }
            if (i2 >= MainPicContainer.g(MainPicContainer.this).T() && p != null) {
                MainPicContainer.h(MainPicContainer.this).scrollToPosition(p.g0());
                txj.e(txj.TAG_MAIN_PIC, "无限滚动超过真实数据大小调整 scrollTo: " + p.g0());
            }
            if (MainPicContainer.d(MainPicContainer.this)) {
                MainPicContainer.e(MainPicContainer.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            MainPicContainer.h(MainPicContainer.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainPicAbsViewHolder m = MainPicContainer.this.m();
            if (m != null) {
                m.b0(MainPicContainer.ACTIVE_REFRESH);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            MainPicContainer.h(MainPicContainer.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainPicAbsViewHolder m = MainPicContainer.this.m();
            if (m != null) {
                m.b0(MainPicContainer.ACTIVE_SUPPLEMENT);
            }
        }
    }

    static {
        t2o.a(352322118);
    }

    public MainPicContainer(View view, a.b bVar) {
        c cVar = new c();
        d dVar = new d();
        Context context = view.getContext();
        this.d = context;
        this.i = new o0i(context);
        MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView = (MainPicHorizontalRecyclerView) view.findViewById(R.id.mainpic_layout);
        this.f7204a = mainPicHorizontalRecyclerView;
        mainPicHorizontalRecyclerView.addOnPageChangedListener(dVar);
        this.c = bVar;
        mainPicHorizontalRecyclerView.addOnScrollStatusListener(cVar);
        mainPicHorizontalRecyclerView.setScrollSpeedPerPixel(this.i.f25065a / bVar.getNewDetailContext().j().K().b());
        PullBase pullBase = (PullBase) view.findViewById(R.id.mainpic_feeds_pullbase);
        this.f = pullBase;
        this.g = (TextView) view.findViewById(R.id.image_content_feeds_pull_end_text);
        this.h = (TextView) view.findViewById(R.id.image_content_feeds_pull_end_icon);
        pullBase.addOnPullListener(new a());
        this.j = new s2m(bVar.e(), bVar.getNewDetailContext());
    }

    public static /* synthetic */ TextView a(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("4c97ab5d", new Object[]{mainPicContainer});
        }
        return mainPicContainer.g;
    }

    public static /* synthetic */ TextView b(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("359f705e", new Object[]{mainPicContainer});
        }
        return mainPicContainer.h;
    }

    public static /* synthetic */ a.b c(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("76e290e2", new Object[]{mainPicContainer});
        }
        return mainPicContainer.c;
    }

    public static /* synthetic */ boolean d(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328e55f0", new Object[]{mainPicContainer})).booleanValue();
        }
        return mainPicContainer.k;
    }

    public static /* synthetic */ boolean e(MainPicContainer mainPicContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bff222a", new Object[]{mainPicContainer, new Boolean(z)})).booleanValue();
        }
        mainPicContainer.k = z;
        return z;
    }

    public static /* synthetic */ boolean f(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("804dcdf1", new Object[]{mainPicContainer})).booleanValue();
        }
        return mainPicContainer.e;
    }

    public static /* synthetic */ MainPicHorizontalAdapter g(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicHorizontalAdapter) ipChange.ipc$dispatch("dc6a0810", new Object[]{mainPicContainer});
        }
        return mainPicContainer.b;
    }

    public static /* synthetic */ MainPicHorizontalRecyclerView h(MainPicContainer mainPicContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicHorizontalRecyclerView) ipChange.ipc$dispatch("1210adb4", new Object[]{mainPicContainer});
        }
        return mainPicContainer.f7204a;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa32fdb4", new Object[]{this});
        } else if (!this.c.getNewDetailContext().j().N().p0()) {
            this.f7204a.getViewTreeObserver().addOnGlobalLayoutListener(new f());
        }
    }

    public void D(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68639a", new Object[]{this, jSONObject});
            return;
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("extra")) == null)) {
            String string = jSONObject2.getString("position");
            if (TextUtils.equals("all", string)) {
                for (Map.Entry<Integer, RecyclerView.ViewHolder> entry : this.f7204a.getAllHolders().entrySet()) {
                    if (entry != null) {
                        RecyclerView.ViewHolder value = entry.getValue();
                        if (value instanceof MainPicAbsViewHolder) {
                            ((MainPicAbsViewHolder) value).s0(jSONObject);
                        }
                    }
                }
                return;
            } else if (!TextUtils.isEmpty(string)) {
                MainPicAbsViewHolder p = p(Integer.parseInt(string));
                if (p != null) {
                    p.s0(jSONObject);
                    return;
                }
                return;
            }
        }
        MainPicAbsViewHolder m = m();
        if (m != null) {
            m.s0(jSONObject);
        }
    }

    public void E() {
        MainPicAbsViewHolder m;
        MainPicHorizontalAdapter mainPicHorizontalAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73246479", new Object[]{this});
        } else if (this.e && (m = m()) != null && (mainPicHorizontalAdapter = this.b) != null && mainPicHorizontalAdapter.T() > 0) {
            this.c.getNewDetailContext();
            this.f7204a.smoothScrollToPosition(m.getPosition() + 1);
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView = this.f7204a;
        if (mainPicHorizontalRecyclerView != null) {
            mainPicHorizontalRecyclerView.setVisibility(i);
        }
        PullBase pullBase = this.f;
        if (pullBase != null) {
            pullBase.setVisibility(i);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8210a55", new Object[]{this});
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : this.f7204a.getAllHolders().values()) {
            if (viewHolder instanceof MainPicVideoViewHolder) {
                ((MainPicVideoViewHolder) viewHolder).v0();
            }
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        MainPicAbsViewHolder m = m();
        if (m != null) {
            m.w0("MainPicContainer");
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        MainPicAbsViewHolder m = m();
        if (m != null) {
            m.x0("MainPicContainer");
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
            return;
        }
        MainPicHorizontalAdapter mainPicHorizontalAdapter = this.b;
        if (mainPicHorizontalAdapter != null) {
            mainPicHorizontalAdapter.M();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        MainPicHorizontalAdapter mainPicHorizontalAdapter = this.b;
        if (mainPicHorizontalAdapter != null) {
            mainPicHorizontalAdapter.O();
        }
        this.e = false;
    }

    public MainPicAbsViewHolder m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicAbsViewHolder) ipChange.ipc$dispatch("700d4ec5", new Object[]{this});
        }
        RecyclerView.ViewHolder holder = this.f7204a.getHolder(this.f7204a.getCurrentDisplayPosition());
        if (holder instanceof MainPicAbsViewHolder) {
            return (MainPicAbsViewHolder) holder;
        }
        return null;
    }

    public o0i n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o0i) ipChange.ipc$dispatch("720a0858", new Object[]{this});
        }
        return this.i;
    }

    public s2m o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2m) ipChange.ipc$dispatch("51260300", new Object[]{this});
        }
        return this.j;
    }

    public MainPicAbsViewHolder p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicAbsViewHolder) ipChange.ipc$dispatch("7170a07f", new Object[]{this, new Integer(i)});
        }
        RecyclerView.ViewHolder holder = this.f7204a.getHolder(i);
        if (holder instanceof MainPicAbsViewHolder) {
            return (MainPicAbsViewHolder) holder;
        }
        return null;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("465e80f4", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    @Deprecated
    public final void r(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6a4373", new Object[]{this, p0iVar});
            return;
        }
        this.b.Q(p0iVar.b, p0iVar.e);
        this.b.Z(p0iVar.b, p0iVar.e);
        this.b.notifyDataSetChanged();
        txj.e(txj.TAG_MAIN_PIC, "横图刷新:所有卡已全量刷新。");
    }

    public final void s(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91d5db7", new Object[]{this, p0iVar});
            return;
        }
        u(p0iVar, new ArrayList(p0iVar.b), this.b.S());
        txj.e(txj.TAG_MAIN_PIC, "横图刷新:所有卡已 Diff 刷新。");
    }

    public final void t(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2581ab", new Object[]{this, p0iVar});
        } else if (p0iVar.g) {
            this.b.Z(p0iVar.b, p0iVar.e);
            this.b.notifyDataSetChanged();
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:实时插卡，走全量更新逻辑。");
        } else {
            v(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:普通卡，走老刷新逻辑。");
        }
    }

    public final void u(p0i p0iVar, final List<u0i> list, final List<u0i> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90b2d8", new Object[]{this, p0iVar, list, list2});
            return;
        }
        try {
            DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback(this) { // from class: com.taobao.android.detail2.core.mainpic.MainPicContainer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/MainPicContainer$5");
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                    }
                    u0i u0iVar = (u0i) list2.get(i);
                    u0i u0iVar2 = (u0i) list.get(i2);
                    if (u0iVar == null || u0iVar2 == null || !u0iVar.a(u0iVar2)) {
                        return false;
                    }
                    return true;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                    }
                    u0i u0iVar = (u0i) list2.get(i);
                    u0i u0iVar2 = (u0i) list.get(i2);
                    if (u0iVar == null || u0iVar2 == null || !u0iVar.b(u0iVar2)) {
                        return false;
                    }
                    return true;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
                    }
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
                    }
                    return list2.size();
                }
            });
            this.b.Z(p0iVar.b, p0iVar.e);
            calculateDiff.dispatchUpdatesTo(this.b);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:UI刷新:局部刷新成功。");
        } catch (Throwable th) {
            this.b.Z(p0iVar.b, p0iVar.e);
            this.b.notifyDataSetChanged();
            txj.f(txj.TAG_MAIN_PIC, "横图刷新:UI刷新:局部刷新失败，自动降级为全部刷新。且刷新成功。", th);
        }
    }

    @Deprecated
    public final void v(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f356bed4", new Object[]{this, p0iVar});
            return;
        }
        int Q = this.b.Q(p0iVar.b, p0iVar.e);
        int Z = this.b.Z(p0iVar.b, p0iVar.e);
        txj.e(txj.TAG_RENDER, "oldNotifyDataChangedMethod20240819, oldSize: " + Z + ", newSize: " + Q);
        if (Z > Q) {
            this.b.notifyItemRangeChanged(0, Q, p0iVar);
            this.b.notifyItemRangeRemoved(Q, Z - Q);
        } else if (Z < Q) {
            this.b.notifyItemRangeChanged(0, Z, p0iVar);
            this.b.notifyItemRangeInserted(Z, Q - Z);
        } else {
            this.b.notifyItemRangeChanged(0, Q, p0iVar);
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976827e5", new Object[]{this, str});
            return;
        }
        this.e = true;
        MainPicAbsViewHolder m = m();
        if (m != null) {
            m.b0(str);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f587369f", new Object[]{this});
        } else if (this.c.b() && this.c.getNewDetailContext().j().N().p0()) {
            this.f7204a.getViewTreeObserver().addOnGlobalLayoutListener(new e());
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506c035", new Object[]{this, str});
            return;
        }
        MainPicAbsViewHolder m = m();
        if (m != null) {
            m.f0(str);
        }
        for (Map.Entry<Integer, RecyclerView.ViewHolder> entry : this.f7204a.getAllHolders().entrySet()) {
            RecyclerView.ViewHolder value = entry.getValue();
            if (value != m && (value instanceof MainPicAbsViewHolder)) {
                ((MainPicAbsViewHolder) value).e0(str);
            }
        }
        if (!this.i.l || !"background".equals(str)) {
            this.f7204a.scrollToPosition(0);
        }
        if (!"background".equals(str)) {
            this.f7204a.clearHolders();
        }
        this.e = false;
    }

    public void z(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9743ba", new Object[]{this, motionEvent});
        } else if (this.c.getNewDetailContext().l() != null && this.c.getNewDetailContext().l().c()) {
        } else {
            if (motionEvent == null || motionEvent.getActionMasked() != 3) {
                j();
            }
        }
    }

    public void j() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbce2c2", new Object[]{this});
        } else if (this.e) {
            MainPicAbsViewHolder m = m();
            if (m == null || !MainPicVideoViewHolder.i.equals(m.h0())) {
                this.e = false;
                JSONObject jSONObject = new JSONObject();
                if (m != null) {
                    i = m.g0();
                }
                jSONObject.put("position", (Object) String.valueOf(i));
                this.c.f("onMainPicInteractive", jSONObject);
            }
        }
    }

    public final void C(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77605f08", new Object[]{this, p0iVar});
            return;
        }
        a.b bVar = this.c;
        int I = (bVar == null || bVar.getNewDetailContext() == null) ? 2 : this.c.getNewDetailContext().m().I();
        if (I == 1) {
            v(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:mainPicChangeType 刷新1 oldChanged");
        } else if (I == 2) {
            t(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:mainPicChangeType 刷新2 OnlyRealtimeCard");
        } else if (I == 3) {
            s(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:mainPicChangeType 刷新3 DiffUtil");
        } else if (I != 4) {
            v(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "mainPicChangeType 刷新-UnSet oldChanged");
        } else {
            r(p0iVar);
            txj.e(txj.TAG_MAIN_PIC, "横图刷新:mainPicChangeType 刷新4 changeAll");
        }
    }

    public boolean i(p0i p0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2ca9f74", new Object[]{this, p0iVar})).booleanValue();
        }
        if (p0iVar == null || p0iVar.b == null) {
            k();
            return false;
        }
        this.i = p0iVar.f25796a;
        B(p0iVar);
        if (this.b == null) {
            this.b = new MainPicHorizontalAdapter(this, this.c, this.l);
            this.f7204a.setMainPicScrollDeviceHelper(new s0i(this.c.getNewDetailContext(), this.c.e()));
            this.b.Z(p0iVar.b, p0iVar.e);
            this.f7204a.setAdapter(this.b);
            if (p0iVar.g) {
                txj.e(txj.TAG_MAIN_PIC, "横图刷新:实时插卡，走新增逻辑。");
            } else {
                txj.e(txj.TAG_MAIN_PIC, "横图刷新:普通卡，走新增逻辑。");
            }
        } else {
            C(p0iVar);
        }
        this.j.x(this.c.d());
        x();
        return true;
    }

    public final void B(p0i p0iVar) {
        u0i u0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8974e10f", new Object[]{this, p0iVar});
        } else if (((ArrayList) p0iVar.b).size() > 1 && (u0iVar = (u0i) ((ArrayList) p0iVar.b).get(1)) != null) {
            String e2 = u0iVar.e();
            boolean Q0 = this.c.d() != null ? this.c.d().Q0() : false;
            if (!MainPicImageViewHolder.l.equals(e2) || !(u0iVar instanceof ome)) {
                if (u0iVar instanceof g9w) {
                    g9w g9wVar = (g9w) u0iVar;
                    if (g9wVar.i() != null && g9wVar.i().isDataValid()) {
                        String d2 = hsm.d(this.d, g9wVar.i().e(), Q0);
                        if (!TextUtils.isEmpty(d2)) {
                            s0m.B().T(d2).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(Q0).fetch();
                            if (this.i.f) {
                                s0m.B().T(hsm.j(this.d, g9wVar.i().e())).bitmapProcessors(true, new yf2(this.d, this.c.getNewDetailContext().m().x(), 2)).fetch();
                            }
                            txj.e(txj.TAG_RENDER, "发起视频第二张图片预加载: " + d2);
                            return;
                        }
                        return;
                    }
                }
                if (u0iVar instanceof so7) {
                    so7 so7Var = (so7) u0iVar;
                    if (TextUtils.isEmpty(so7Var.f)) {
                        String j = hsm.j(this.d, so7Var.f);
                        if (!TextUtils.isEmpty(j)) {
                            s0m.B().T(j).bitmapProcessors(true, new yf2(this.d, this.c.getNewDetailContext().m().x(), 2)).fetch();
                            txj.e(txj.TAG_RENDER, "发起DX第二张图片预加载: " + j);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ome omeVar = (ome) u0iVar;
            String d3 = hsm.d(this.d, omeVar.e, Q0);
            if (!TextUtils.isEmpty(d3)) {
                s0m.B().T(d3).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(Q0).fetch();
                if (this.i.f) {
                    s0m.B().T(hsm.j(this.d, omeVar.e)).bitmapProcessors(true, new yf2(this.d, this.c.getNewDetailContext().m().x(), 2)).fetch();
                }
                txj.e(txj.TAG_RENDER, "发起第二张图片预加载: " + d3);
            }
        }
    }
}
