package com.taobao.android.detail.ttdetail.floatview.globalbarrage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.b;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.eo7;
import tb.hl6;
import tb.k7c;
import tb.mr7;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BarrageFloatingView implements k7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BarrageView f6784a;
    public com.taobao.android.detail.ttdetail.floatview.globalbarrage.b b;
    public final ze7 c;
    public DXTemplateItem d;
    public FrameLayout j;
    public RelativeLayout k;
    public int e = 0;
    public String f = "first";
    public boolean g = false;
    public final List<Runnable> h = new ArrayList();
    public boolean i = false;
    public BARRAGE_TYPE l = BARRAGE_TYPE.GLOBAL;
    public final BarrageView.c m = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements BarrageView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<View> f6785a = new WeakReference<>(null);

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.c
        public View a(Context context, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("2108ceec", new Object[]{this, context, obj});
            }
            if (BarrageFloatingView.c(BarrageFloatingView.this) == null || !(obj instanceof JSONObject)) {
                return null;
            }
            return hl6.h(BarrageFloatingView.d(BarrageFloatingView.this).g(), (JSONObject) obj, eo7.t(BarrageFloatingView.c(BarrageFloatingView.this)));
        }

        @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.c
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffb7ec6c", new Object[]{this, view});
                return;
            }
            BarrageFloatingView.e(BarrageFloatingView.this);
            if (this.f6785a.get() != null) {
                BarrageFloatingView.f(BarrageFloatingView.this, this.f6785a.get());
            }
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.f6785a = weakReference;
            BarrageFloatingView.g(BarrageFloatingView.this, weakReference.get());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BarrageFloatingView.h(BarrageFloatingView.this);
            BarrageFloatingView.i(BarrageFloatingView.this).remove(this);
        }
    }

    static {
        t2o.a(912261804);
        t2o.a(912261808);
    }

    public BarrageFloatingView(ze7 ze7Var) {
        this.c = ze7Var;
    }

    public static /* synthetic */ DXTemplateItem c(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("3cabf551", new Object[]{barrageFloatingView});
        }
        return barrageFloatingView.d;
    }

    public static /* synthetic */ ze7 d(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("cc6b876b", new Object[]{barrageFloatingView});
        }
        return barrageFloatingView.c;
    }

    public static /* synthetic */ void e(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2607c9b0", new Object[]{barrageFloatingView});
        } else {
            barrageFloatingView.k();
        }
    }

    public static /* synthetic */ void f(BarrageFloatingView barrageFloatingView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e586e41", new Object[]{barrageFloatingView, view});
        } else {
            barrageFloatingView.t(view);
        }
    }

    public static /* synthetic */ void g(BarrageFloatingView barrageFloatingView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc52b60", new Object[]{barrageFloatingView, view});
        } else {
            barrageFloatingView.s(view);
        }
    }

    public static /* synthetic */ void h(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719cfd73", new Object[]{barrageFloatingView});
        } else {
            barrageFloatingView.p();
        }
    }

    public static /* synthetic */ List i(BarrageFloatingView barrageFloatingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28940513", new Object[]{barrageFloatingView});
        }
        return barrageFloatingView.h;
    }

    @Override // tb.k7c
    public void a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b936922c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = c.LOCATION_SECOND;
        } else {
            str = "first";
        }
        l(str);
    }

    @Override // tb.k7c
    public void b(FrameLayout frameLayout, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b607ba6", new Object[]{this, frameLayout, jSONObject});
            return;
        }
        this.j = frameLayout;
        com.taobao.android.detail.ttdetail.floatview.globalbarrage.b b2 = c.b(jSONObject, this.l);
        frameLayout.setVisibility(0);
        Context d = tq4.d(frameLayout);
        BarrageView barrageView = new BarrageView(d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, mr7.b(d, 72.0f));
        layoutParams.topMargin = mr7.b(d, 126.0f);
        if (this.l == BARRAGE_TYPE.INSIDE) {
            layoutParams.topMargin = frameLayout.getMeasuredHeight() - mr7.b(d, 72.0f);
        }
        layoutParams.leftMargin = mr7.b(d, 8.0f);
        this.k = new RelativeLayout(d);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        this.k.addView(barrageView, layoutParams2);
        frameLayout.addView(this.k, layoutParams);
        barrageView.setMaxCount(b2.b);
        barrageView.setItemSpace(0);
        barrageView.setAnimatorDuration(300L);
        this.f6784a = barrageView;
        this.b = b2;
        this.d = b2.c;
        int o = o(this.e);
        this.e = o;
        JSONArray jSONArray = b2.e;
        if (o != -1) {
            i = o;
        }
        barrageView.initDatas(jSONArray.subList(i, o + 1), this.m);
        if (this.e != -1) {
            k();
        } else {
            j();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d6a863", new Object[]{this});
        } else if (this.b.f) {
            this.i = true;
            this.f6784a.setVisibility(8);
            ((ArrayList) this.h).remove(this);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9580392c", new Object[]{this});
            return;
        }
        int o = o(this.e + 1);
        this.e = o;
        if (o != -1) {
            b bVar = new b();
            ((ArrayList) this.h).add(bVar);
            this.f6784a.postDelayed(bVar, this.b.f6788a * 1000.0f);
            return;
        }
        j();
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4130056", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (this.e == -1 && this.b.f) {
            this.i = false;
            this.f6784a.setVisibility(0);
            k();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f58011", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            this.f6784a.removeCallbacks((Runnable) it.next());
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80c29b4", new Object[]{this, new Integer(i)});
            return;
        }
        ((FrameLayout.LayoutParams) this.k.getLayoutParams()).topMargin = i - this.k.getMeasuredHeight();
        this.k.requestLayout();
    }

    public final int o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f32d0a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= ((ArrayList) this.b.d).size()) {
            i = 0;
        }
        for (int i2 = i; i2 < ((ArrayList) this.b.d).size(); i2++) {
            b.a aVar = (b.a) ((ArrayList) this.b.d).get(i2);
            if (this.f.equals(aVar.f6789a) || "all".equals(aVar.f6789a) || c.LOCATION_INSIDE.equals(aVar.f6789a)) {
                return i2;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            b.a aVar2 = (b.a) ((ArrayList) this.b.d).get(i3);
            if (this.f.equals(aVar2.f6789a) || "all".equals(aVar2.f6789a) || c.LOCATION_INSIDE.equals(aVar2.f6789a)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // tb.k7c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        m();
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.removeView(this.k);
        }
    }

    @Override // tb.k7c
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            r(false);
        }
    }

    @Override // tb.k7c
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            r(true);
        }
    }

    public final void p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a523265f", new Object[]{this});
        } else if (!this.g) {
            if (this.e >= this.b.e.size()) {
                tgh.b("BarrageFloatingView", "mCurBarrageIndex 越界");
                return;
            }
            this.f6784a.addData(this.b.e.get(this.e), true);
            b.a aVar = (b.a) ((ArrayList) this.b.d).get(this.e);
            if (aVar.b != null && !aVar.c) {
                JSONObject c = UtUtils.c(this.c.e());
                c.putAll(aVar.b);
                if (this.l == BARRAGE_TYPE.INSIDE) {
                    str = "living";
                } else {
                    str = "";
                }
                c.put("from", (Object) str);
                UtUtils.f(2201, "Page_Detail-Float_Barrage", c);
                aVar.c = true;
            }
        }
    }

    public void q(BARRAGE_TYPE barrage_type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cc2efd", new Object[]{this, barrage_type});
        } else if (barrage_type == null) {
            tgh.b("BarrageFloatingView", "BARRAGE_TYPE is null");
        } else {
            this.l = barrage_type;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba159a29", new Object[]{this, new Boolean(z)});
        } else if (!this.i) {
            if (!this.g || z) {
                this.g = z;
                return;
            }
            this.g = false;
            m();
            p();
        }
    }

    public final void s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed37f163", new Object[]{this, view});
        } else if (view instanceof DXRootView) {
            this.c.g().y((DXRootView) view);
        }
    }

    public final void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d9b91b", new Object[]{this, view});
        } else if (view instanceof DXRootView) {
            this.c.g().z((DXRootView) view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum BARRAGE_TYPE {
        GLOBAL,
        INSIDE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BARRAGE_TYPE barrage_type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/floatview/globalbarrage/BarrageFloatingView$BARRAGE_TYPE");
        }

        public static BARRAGE_TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BARRAGE_TYPE) ipChange.ipc$dispatch("35877085", new Object[]{str});
            }
            return (BARRAGE_TYPE) Enum.valueOf(BARRAGE_TYPE.class, str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
            if (r7.equals(com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.LOCATION_SECOND) == false) goto L_0x002c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE convert(java.lang.String r7) {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0018
                java.lang.String r4 = "1fcc5a50"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r1] = r6
                r2[r0] = r7
                java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE r7 = (com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE) r7
                return r7
            L_0x0018:
                java.lang.String r3 = "BarrageFloatingView"
                if (r7 != 0) goto L_0x0024
                java.lang.String r7 = "BARRAGE_TYPE isEquals judge type is null"
                tb.tgh.b(r3, r7)
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE r7 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.GLOBAL
                return r7
            L_0x0024:
                r4 = -1
                int r5 = r7.hashCode()
                switch(r5) {
                    case -1183789060: goto L_0x004e;
                    case -906279820: goto L_0x0044;
                    case 96673: goto L_0x0039;
                    case 97440432: goto L_0x002e;
                    default: goto L_0x002c;
                }
            L_0x002c:
                r0 = -1
                goto L_0x0059
            L_0x002e:
                java.lang.String r0 = "first"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0037
                goto L_0x002c
            L_0x0037:
                r0 = 3
                goto L_0x0059
            L_0x0039:
                java.lang.String r0 = "all"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0042
                goto L_0x002c
            L_0x0042:
                r0 = 2
                goto L_0x0059
            L_0x0044:
                java.lang.String r1 = "second"
                boolean r1 = r7.equals(r1)
                if (r1 != 0) goto L_0x0059
                goto L_0x002c
            L_0x004e:
                java.lang.String r0 = "inside"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0058
                goto L_0x002c
            L_0x0058:
                r0 = 0
            L_0x0059:
                switch(r0) {
                    case 0: goto L_0x006c;
                    case 1: goto L_0x0069;
                    case 2: goto L_0x0069;
                    case 3: goto L_0x0069;
                    default: goto L_0x005c;
                }
            L_0x005c:
                java.lang.String r0 = "非法的弹幕类型字符串"
                java.lang.String r7 = r0.concat(r7)
                tb.tgh.b(r3, r7)
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE r7 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.GLOBAL
                return r7
            L_0x0069:
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE r7 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.GLOBAL
                return r7
            L_0x006c:
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE r7 = com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.INSIDE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView.BARRAGE_TYPE.convert(java.lang.String):com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView$BARRAGE_TYPE");
        }
    }
}
