package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.Response;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow;
import com.taobao.android.detail.ttdetail.widget.listview.DetailListView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ad7;
import tb.bd7;
import tb.bw7;
import tb.cd7;
import tb.ff7;
import tb.gf7;
import tb.hd7;
import tb.j9w;
import tb.jf7;
import tb.k9w;
import tb.kd7;
import tb.l9w;
import tb.lcd;
import tb.lns;
import tb.lvp;
import tb.m2m;
import tb.m2q;
import tb.md7;
import tb.mr7;
import tb.nj7;
import tb.ntc;
import tb.nvl;
import tb.ozc;
import tb.pos;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.ux1;
import tb.vbl;
import tb.vyb;
import tb.wc7;
import tb.yc7;
import tb.ze7;
import tb.zq3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DescNativeController implements TTDetailErrorView.a, ntc<ux1>, ozc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DescNativeController";
    public boolean A;
    public String D;
    public String E;
    public long F;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6881a;
    public ze7 b;
    public FrameLayout c;
    public View f;
    public final ff7 g;
    public ad7 j;
    public yc7 m;
    public vyb p;
    public hd7 t;
    public GalleryPopupWindow u;
    public lcd v;
    public int x;
    public DetailListView d = null;
    public TTDetailErrorView e = null;
    public DetailDescViewAdapter h = null;
    public gf7 i = null;
    public DESCState k = null;
    public lns.b l = null;
    public final List<ux1> n = new ArrayList();
    public final List<ux1> o = new ArrayList();
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean w = true;
    public final float y = vbl.N0();
    public final boolean z = vbl.Z();
    public boolean B = true;
    public boolean C = false;
    public final DetailListView.a G = new a();
    public final bd7 I = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum DESCState {
        STATIC_FAIL,
        INITIALIZED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DESCState dESCState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/DescNativeController$DESCState");
        }

        public static DESCState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DESCState) ipChange.ipc$dispatch("fca85f28", new Object[]{str});
            }
            return (DESCState) Enum.valueOf(DESCState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ShrinkDescUTRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ff7 f6882a;
        private int b;
        private float c;
        private float d;

        static {
            t2o.a(912262271);
        }

        public ShrinkDescUTRunnable(Context context, ff7 ff7Var, int i) {
            this.c = jf7.INSTANCE.a(context, ff7Var);
            this.d = mr7.e(context);
            this.b = i;
            this.f6882a = ff7Var;
        }

        public static /* synthetic */ int a(ShrinkDescUTRunnable shrinkDescUTRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e8f47d12", new Object[]{shrinkDescUTRunnable})).intValue();
            }
            return shrinkDescUTRunnable.b;
        }

        public static /* synthetic */ float b(ShrinkDescUTRunnable shrinkDescUTRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("291f63d0", new Object[]{shrinkDescUTRunnable})).floatValue();
            }
            return shrinkDescUTRunnable.d;
        }

        private void c(ff7 ff7Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b64093b", new Object[]{this, ff7Var, str});
            } else if (ff7Var != null) {
                UtUtils.g(19999, str, String.valueOf(ff7Var.c), String.valueOf(ff7Var.b), new JSONObject(ff7Var) { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.ShrinkDescUTRunnable.1
                    public final /* synthetic */ ff7 val$detailDescModel;

                    {
                        String str2;
                        this.val$detailDescModel = ff7Var;
                        if (TextUtils.isEmpty(ff7Var.c)) {
                            str2 = "";
                        } else {
                            str2 = ff7Var.c;
                        }
                        put("itemId", (Object) str2);
                        put("shopId", (Object) String.valueOf(ff7Var.b));
                        put("userId", (Object) String.valueOf(ff7Var.f19249a));
                        put("shrinkDescHeightRatio", (Object) String.valueOf(ff7Var.h));
                        put("measureHeight", (Object) String.valueOf(ShrinkDescUTRunnable.a(ShrinkDescUTRunnable.this)));
                        put("screenHeight", (Object) String.valueOf(ShrinkDescUTRunnable.b(ShrinkDescUTRunnable.this)));
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                int i = this.b;
                if (i <= this.c) {
                    c(this.f6882a, "Page_Detail_Shrink_Desc_Out_Of_Range");
                } else if (i <= this.d) {
                    c(this.f6882a, "Page_Detail_Shrink_Desc_In_One_Screen");
                } else {
                    c(this.f6882a, "Page_Detail_Shrink_Desc_In_Range");
                }
            } catch (Exception e) {
                tgh.c(DescNativeController.TAG, "sendShrinkDescUTEvent error: ", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class UTEventRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f6883a;
        private String b;
        private m2m.a c;

        static {
            t2o.a(912262273);
        }

        public UTEventRunnable(String str, String str2, m2m.a aVar) {
            this.f6883a = str;
            this.b = str2;
            this.c = aVar;
        }

        public static /* synthetic */ m2m.a a(UTEventRunnable uTEventRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m2m.a) ipChange.ipc$dispatch("3345990f", new Object[]{uTEventRunnable});
            }
            return uTEventRunnable.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.UTEventRunnable.1
                    {
                        String str;
                        if (TextUtils.isEmpty(UTEventRunnable.a(UTEventRunnable.this).f23740a)) {
                            str = "";
                        } else {
                            str = UTEventRunnable.a(UTEventRunnable.this).f23740a;
                        }
                        put("imageUrl", (Object) str);
                        put("realRatio", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).b));
                        put("realWidth", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).c));
                        put("realHeight", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).d));
                        put("styleRatio", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).e));
                        put("styleWidth", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).f));
                        put("styleHeight", (Object) String.valueOf(UTEventRunnable.a(UTEventRunnable.this).g));
                    }
                };
                String str = "Page_Detail_Desc_Image_Need_Resize";
                if (Double.compare(this.c.d, 10.0d) <= 0) {
                    str = "Page_Detail_Desc_Short_Image";
                }
                String str2 = "";
                String str3 = TextUtils.isEmpty(this.f6883a) ? str2 : this.f6883a;
                if (!TextUtils.isEmpty(this.b)) {
                    str2 = this.b;
                }
                UtUtils.g(19999, str, str3, str2, jSONObject);
            } catch (Exception e) {
                tgh.c(DescNativeController.TAG, "sendUtEvent error: ", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DetailListView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, boolean z) {
            kd7 h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("328454f3", new Object[]{this, new Integer(i), new Boolean(z)});
            } else if (DescNativeController.c(DescNativeController.this) != null && (h = DescNativeController.c(DescNativeController.this).h(i)) != null) {
                h.s(true, z);
                if (DescNativeController.e(DescNativeController.this) != null) {
                    DescNativeController.e(DescNativeController.this).g(i, z, h);
                }
            }
        }

        public void b(int i) {
            kd7 h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bb7fd4", new Object[]{this, new Integer(i)});
            } else if (DescNativeController.c(DescNativeController.this) != null && (h = DescNativeController.c(DescNativeController.this).h(i)) != null) {
                h.b();
            }
        }

        public void c(int i) {
            kd7 h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca03f6f", new Object[]{this, new Integer(i)});
            } else if (DescNativeController.c(DescNativeController.this) != null && (h = DescNativeController.c(DescNativeController.this).h(i)) != null) {
                h.d();
            }
        }

        public void d(int i) {
            kd7 h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("916084dc", new Object[]{this, new Integer(i)});
            } else if (DescNativeController.c(DescNativeController.this) != null && (h = DescNativeController.c(DescNativeController.this).h(i)) != null) {
                h.t();
                if (DescNativeController.e(DescNativeController.this) != null) {
                    DescNativeController.e(DescNativeController.this).h(i, h);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends ux1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String b;

        static {
            t2o.a(912262270);
        }

        public c(String str) {
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/DescNativeController$LoadFinishMessage");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(912262263);
        t2o.a(912262965);
        t2o.a(912261362);
        t2o.a(912261426);
    }

    public DescNativeController(Context context, ff7 ff7Var) {
        this.f6881a = context;
        this.g = ff7Var;
        U();
    }

    public static /* synthetic */ void A(DescNativeController descNativeController, Context context, ff7 ff7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206a99d4", new Object[]{descNativeController, context, ff7Var, new Integer(i)});
        } else {
            descNativeController.c0(context, ff7Var, i);
        }
    }

    public static /* synthetic */ long B(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39cc05c3", new Object[]{descNativeController})).longValue();
        }
        return descNativeController.F;
    }

    public static /* synthetic */ boolean C(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de15532c", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.q = z;
        return z;
    }

    public static /* synthetic */ int D(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5354c314", new Object[]{descNativeController})).intValue();
        }
        return descNativeController.x;
    }

    public static /* synthetic */ int E(DescNativeController descNativeController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("871ceef7", new Object[]{descNativeController, new Integer(i)})).intValue();
        }
        descNativeController.x = i;
        return i;
    }

    public static /* synthetic */ boolean F(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f605c4", new Object[]{descNativeController})).booleanValue();
        }
        return descNativeController.z;
    }

    public static /* synthetic */ boolean G(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de974863", new Object[]{descNativeController})).booleanValue();
        }
        return descNativeController.A;
    }

    public static /* synthetic */ boolean H(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24388b02", new Object[]{descNativeController})).booleanValue();
        }
        return descNativeController.B;
    }

    public static /* synthetic */ boolean I(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69d9cda1", new Object[]{descNativeController})).booleanValue();
        }
        return descNativeController.w;
    }

    public static /* synthetic */ boolean J(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("413973dd", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.w = z;
        return z;
    }

    public static /* synthetic */ float K(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af7b102c", new Object[]{descNativeController})).floatValue();
        }
        return descNativeController.y;
    }

    public static /* synthetic */ lcd L(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcd) ipChange.ipc$dispatch("3f9b8047", new Object[]{descNativeController});
        }
        return descNativeController.v;
    }

    public static /* synthetic */ yc7 c(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yc7) ipChange.ipc$dispatch("dcc5a8ff", new Object[]{descNativeController});
        }
        return descNativeController.m;
    }

    public static /* synthetic */ yc7 d(DescNativeController descNativeController, yc7 yc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yc7) ipChange.ipc$dispatch("d8374d74", new Object[]{descNativeController, yc7Var});
        }
        descNativeController.m = yc7Var;
        return yc7Var;
    }

    public static /* synthetic */ hd7 e(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd7) ipChange.ipc$dispatch("29f97727", new Object[]{descNativeController});
        }
        return descNativeController.t;
    }

    public static /* synthetic */ boolean f(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("781b245", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.r = z;
        return z;
    }

    public static /* synthetic */ boolean g(DescNativeController descNativeController, gf7 gf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd532bd4", new Object[]{descNativeController, gf7Var})).booleanValue();
        }
        return descNativeController.O(gf7Var);
    }

    public static /* synthetic */ lns.b h(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lns.b) ipChange.ipc$dispatch("227d417e", new Object[]{descNativeController});
        }
        return descNativeController.l;
    }

    public static /* synthetic */ void i(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bfea12", new Object[]{descNativeController});
        } else {
            descNativeController.X();
        }
    }

    public static /* synthetic */ DESCState j(DescNativeController descNativeController, DESCState dESCState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCState) ipChange.ipc$dispatch("c769a15f", new Object[]{descNativeController, dESCState});
        }
        descNativeController.k = dESCState;
        return dESCState;
    }

    public static /* synthetic */ gf7 l(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("9208dac2", new Object[]{descNativeController});
        }
        return descNativeController.i;
    }

    public static /* synthetic */ gf7 m(DescNativeController descNativeController, gf7 gf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("88bb3c8", new Object[]{descNativeController, gf7Var});
        }
        descNativeController.i = gf7Var;
        return gf7Var;
    }

    public static /* synthetic */ void n(DescNativeController descNativeController, TTDetailErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ad9708", new Object[]{descNativeController, aVar});
        } else {
            descNativeController.j0(aVar);
        }
    }

    public static /* synthetic */ List o(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b236ff9", new Object[]{descNativeController});
        }
        return descNativeController.n;
    }

    public static /* synthetic */ List p(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("842ebb7a", new Object[]{descNativeController});
        }
        return descNativeController.o;
    }

    public static /* synthetic */ Context q(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fc7634c4", new Object[]{descNativeController});
        }
        return descNativeController.f6881a;
    }

    public static /* synthetic */ void s(DescNativeController descNativeController, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee3c862", new Object[]{descNativeController, new Integer(i), new Integer(i2)});
        } else {
            descNativeController.T(i, i2);
        }
    }

    public static /* synthetic */ int u(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52633369", new Object[]{descNativeController})).intValue();
        }
        return descNativeController.R();
    }

    public static /* synthetic */ DetailDescViewAdapter v(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailDescViewAdapter) ipChange.ipc$dispatch("a61e012a", new Object[]{descNativeController});
        }
        return descNativeController.h;
    }

    public static /* synthetic */ DetailListView w(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailListView) ipChange.ipc$dispatch("4b713a1d", new Object[]{descNativeController});
        }
        return descNativeController.d;
    }

    public static /* synthetic */ void x(DescNativeController descNativeController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b605e9f", new Object[]{descNativeController, view});
        } else {
            descNativeController.N(view);
        }
    }

    public static /* synthetic */ vyb y(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vyb) ipChange.ipc$dispatch("9ea5ffc1", new Object[]{descNativeController});
        }
        return descNativeController.p;
    }

    public static /* synthetic */ ff7 z(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ff7) ipChange.ipc$dispatch("5329bc1c", new Object[]{descNativeController});
        }
        return descNativeController.g;
    }

    public final void M(m2m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f265e8", new Object[]{this, aVar});
        } else if (aVar != null) {
            pos.a(new UTEventRunnable(this.D, this.E, aVar));
        }
    }

    public final void N(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9b62d6", new Object[]{this, view});
            return;
        }
        int childCount = this.c.getChildCount();
        if (childCount > 0) {
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt == view) {
                    if (childAt.getVisibility() == 8) {
                        childAt.setVisibility(0);
                    }
                    z = true;
                } else if (childAt.getVisibility() == 0) {
                    childAt.setVisibility(8);
                }
            }
            if (!z) {
                this.c.addView(view);
                return;
            }
            return;
        }
        this.c.addView(view);
    }

    public final boolean O(gf7 gf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2f2055", new Object[]{this, gf7Var})).booleanValue();
        }
        if (gf7Var == null) {
            tgh.b("DescNativeDegradeH5", "DescNativeController DetailDescStructure response is null.");
            return true;
        }
        List<T> list = gf7Var.f30000a;
        if (list == 0) {
            tgh.b("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is null.");
            return true;
        } else if (!list.isEmpty()) {
            return false;
        } else {
            tgh.b("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is empty.");
            return true;
        }
    }

    public final boolean P(ff7 ff7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c244d71f", new Object[]{this, ff7Var})).booleanValue();
        }
        if (ff7Var == null) {
            tgh.b("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel is null.");
            return true;
        }
        Map<String, String> map = ff7Var.d;
        if (map == null) {
            tgh.b("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is null.");
            return true;
        } else if (map.size() != 0) {
            return false;
        } else {
            tgh.b("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is empty.");
            return true;
        }
    }

    public final ad7 Q(ff7 ff7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad7) ipChange.ipc$dispatch("91a3273", new Object[]{this, ff7Var});
        }
        cd7 cd7Var = new cd7(ff7Var.c, ff7Var.f19249a, null);
        cd7Var.b = ff7Var.d;
        cd7Var.f16989a = new HashMap<String, String>(ff7Var) { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.3
            public final /* synthetic */ ff7 val$detailDescViewModel;

            {
                this.val$detailDescViewModel = ff7Var;
                put("shopId", ff7Var.b);
                put("hidPriceDesc", String.valueOf(ff7Var.g));
            }
        };
        return new ad7(this.f6881a, cd7Var, this.I);
    }

    public final int R() {
        DetailClientData detailClientData;
        JSONObject jSONObject;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87392c63", new Object[]{this})).intValue();
        }
        if (this.b == null || !vbl.y() || (detailClientData = (DetailClientData) this.b.e().f(DetailClientData.class)) == null || (jSONObject = detailClientData.detailClientOpt) == null) {
            return 0;
        }
        try {
            i = jSONObject.getIntValue("descNativePrefetchImageOpt");
        } catch (Exception e) {
            tgh.c(TAG, "descNativePrefetchImageOpt", e);
            i = 0;
        }
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public final void T(int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73533a29", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ff7 ff7Var = this.g;
        if (ff7Var != null) {
            z = ff7Var.f;
        }
        if (z && !V() && this.p != null && Float.compare(this.g.h, 0.0f) > 0) {
            if (Float.compare(this.g.h, 1.0f) <= 0) {
                this.p.a();
                return;
            }
            int e = mr7.e(this.f6881a);
            int a2 = jf7.INSTANCE.a(this.f6881a, this.g);
            int i3 = this.x;
            if (a2 >= i3 && i3 > 0) {
                return;
            }
            if ((Math.abs(i) + e) - a2 >= 0) {
                this.p.d();
            } else {
                this.p.c();
            }
        }
    }

    public final void U() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.t = new hd7(this.f6881a);
        this.c = new FrameLayout(this.f6881a);
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        DetailListView detailListView = new DetailListView(this.f6881a);
        this.d = detailListView;
        detailListView.setLayoutParams(layoutParams);
        this.d.setOverScrollMode(2);
        this.d.setCacheColorHint(0);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setDividerHeight(0);
        this.d.setFocusable(false);
        this.d.setDescendantFocusability(393216);
        try {
            i = nj7.b();
        } catch (Exception unused) {
        }
        this.d.setCoverOffset(i);
        this.d.setOnItemStateListener(this.G);
        this.d.setOnScrollYDistanceChangeListener(new wc7(this, mr7.e(this.f6881a)));
        this.h = new DetailDescViewAdapter();
        a0(this.f6881a);
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8234f43", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public final boolean W() {
        DetailClientData detailClientData;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d96e082", new Object[]{this})).booleanValue();
        }
        ze7 ze7Var = this.b;
        if (ze7Var == null || (detailClientData = (DetailClientData) ze7Var.e().f(DetailClientData.class)) == null || (jSONObject = detailClientData.detailClientOpt) == null) {
            return false;
        }
        return jSONObject.getBooleanValue("descAndroidPlayer");
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2e2d20", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.g.c);
        bw7.b(hashMap, -900003, "Native图文详情降级");
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else {
            this.d.onScroll(i);
        }
    }

    /* renamed from: Z */
    public boolean y1(ux1 ux1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b5282b4", new Object[]{this, ux1Var})).booleanValue();
        }
        boolean z = ux1Var instanceof lvp;
        if (z) {
            lvp lvpVar = (lvp) ux1Var;
            GalleryPopupWindow galleryPopupWindow = this.u;
            if (galleryPopupWindow != null) {
                galleryPopupWindow.showGalleryDialog(lvpVar.a());
                return true;
            }
            try {
                GalleryPopupWindow galleryPopupWindow2 = new GalleryPopupWindow((RelativeLayout) LayoutInflater.from(this.f6881a).inflate(R.layout.tt_detail_main_gallarybig, (ViewGroup) null), -1, -1, this.f6881a);
                this.u = galleryPopupWindow2;
                galleryPopupWindow2.showGalleryDialog(lvpVar.a());
                return true;
            } catch (Throwable th) {
                tgh.c(TAG, "Create pic gallery popup window error: ", th);
            }
        }
        if ((ux1Var instanceof j9w) || (ux1Var instanceof k9w) || (ux1Var instanceof l9w)) {
            return true;
        }
        boolean z2 = ux1Var instanceof nvl;
        if (z) {
            return true;
        }
        if (ux1Var instanceof zq3) {
            q84.f(this.f6881a, new m2q());
        }
        if (ux1Var instanceof m2m) {
            M(((m2m) ux1Var).a());
        }
        return false;
    }

    @Override // tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (!this.q && !this.r && this.g != null) {
            b0();
        }
    }

    public final void a0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
            return;
        }
        q84.i(context, lvp.class, this);
        q84.i(context, zq3.class, this);
        q84.i(context, m2m.class, this);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
    public void b(View view) {
        ad7 ad7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8acbb51", new Object[]{this, view});
        } else if (this.k != DESCState.STATIC_FAIL || this.g == null) {
            gf7 gf7Var = this.i;
            if (gf7Var != null && gf7Var.a() && (ad7Var = this.j) != null) {
                ad7Var.h();
                TTDetailErrorView tTDetailErrorView = this.e;
                if (tTDetailErrorView != null && tTDetailErrorView.isShown()) {
                    j0(this);
                }
            }
        } else {
            a();
        }
    }

    public final void c0(Context context, ff7 ff7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b731c4", new Object[]{this, context, ff7Var, new Integer(i)});
        } else if (ff7Var != null && !tq4.e(context)) {
            pos.a(new ShrinkDescUTRunnable(context, ff7Var, i));
        }
    }

    public void d0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce338aad", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    @Override // tb.ozc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ad7 ad7Var = this.j;
        if (ad7Var != null) {
            ad7Var.c();
        }
        yc7 yc7Var = this.m;
        if (yc7Var != null) {
            Iterator<kd7> it = yc7Var.i().iterator();
            while (it.hasNext()) {
                it.next().p();
            }
        }
        hd7 hd7Var = this.t;
        if (hd7Var != null) {
            hd7Var.f();
            this.t = null;
        }
        l0();
        UserBehaviorTracker.m(this.f6881a, "detail_desc_max_scroll", String.valueOf(this.d.getMaxScrollY()));
        UserBehaviorTracker.m(this.f6881a, "detail_desc_measure_height", String.valueOf(this.x));
    }

    @Override // tb.ozc
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        if (this.F == 0) {
            this.F = SystemClock.elapsedRealtime();
        }
        if (!this.q) {
            a();
        }
        List<ux1> list = this.n;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.n).iterator();
            while (it.hasNext()) {
                q84.f(this.f6881a, (ux1) it.next());
            }
        }
        if (this.m != null) {
            int lastVisibleItem = this.d.getLastVisibleItem();
            for (int firstVisibleItem = this.d.getFirstVisibleItem(); firstVisibleItem <= lastVisibleItem; firstVisibleItem++) {
                kd7 h = this.m.h(firstVisibleItem);
                if (h != null) {
                    h.t();
                }
            }
        }
        hd7 hd7Var = this.t;
        if (hd7Var != null) {
            hd7Var.j();
        }
        this.s = true;
        tgh.b(TAG, "commitUserMotionForDesc:appear");
    }

    public void e0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8428d0e", new Object[]{this, frameLayout});
        }
    }

    public void f0(lns.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54886555", new Object[]{this, bVar});
        } else {
            this.l = bVar;
        }
    }

    public void g0(ze7 ze7Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da58e47", new Object[]{this, ze7Var});
            return;
        }
        this.b = ze7Var;
        this.A = DataUtils.T(ze7Var);
        if (!nj7.h() || vbl.f0()) {
            z = false;
        }
        this.B = z;
        this.D = DataUtils.w((Item) ze7Var.e().f(Item.class), "");
        this.E = DataUtils.E((Seller) ze7Var.e().f(Seller.class), "");
        DetailDescViewAdapter detailDescViewAdapter = this.h;
        if (detailDescViewAdapter != null) {
            detailDescViewAdapter.setDetailPlayerOpt(W());
        }
    }

    @Override // tb.ozc
    public View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view});
        }
        return this.c;
    }

    public void h0(vyb vybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b655b5f", new Object[]{this, vybVar});
        } else {
            this.p = vybVar;
        }
    }

    public void i0(lcd lcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37f6", new Object[]{this, lcdVar});
        } else {
            this.v = lcdVar;
        }
    }

    public final void j0(TTDetailErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55de8d45", new Object[]{this, aVar});
        } else if (this.f6881a != null) {
            if (this.e == null) {
                TTDetailErrorView tTDetailErrorView = new TTDetailErrorView(this.f6881a);
                this.e = tTDetailErrorView;
                this.c.addView(tTDetailErrorView);
            }
            this.e.setOnReloadButtonClickListener(aVar);
            N(this.e);
            vyb vybVar = this.p;
            if (vybVar != null) {
                vybVar.error();
            }
        }
    }

    @Override // tb.ozc
    public void k(int i) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        ff7 ff7Var = this.g;
        if (ff7Var == null) {
            z = false;
        } else {
            z = ff7Var.f;
        }
        if (Float.compare(ff7Var.h, 1.0f) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !z2 && !V() && i == Integer.MAX_VALUE) {
            int e = mr7.e(this.f6881a);
            int a2 = jf7.INSTANCE.a(this.f6881a, this.g);
            int i2 = a2 - e;
            if (a2 < this.x) {
                if (!this.H && i2 > 0) {
                    int i3 = i2 / 100;
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.d.scrollListBy(100);
                    }
                    int i5 = i2 % 100;
                    if (i5 != 0) {
                        this.d.scrollListBy(i5);
                    }
                    this.H = true;
                }
                if (this.H) {
                    this.p.d();
                    return;
                }
                return;
            }
        }
        if (this.d.getCount() > 0) {
            int count = this.d.getCount() - 1;
            if (i == Integer.MAX_VALUE && this.d.getSelectedItemPosition() != count) {
                this.d.setSelection(count);
            } else if (this.d.getSelectedItemPosition() != i) {
                this.d.setSelection(i);
            }
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea4712", new Object[]{this});
            return;
        }
        q84.l(this.f6881a, lvp.class);
        q84.l(this.f6881a, zq3.class);
        q84.j(this.f6881a, m2m.class);
    }

    @Override // tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.ozc
    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9588d6ca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        List<ux1> list = this.o;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.o).iterator();
            while (it.hasNext()) {
                q84.f(this.f6881a, (ux1) it.next());
            }
        }
        yc7 yc7Var = this.m;
        if (yc7Var != null) {
            Iterator<kd7> it2 = yc7Var.i().iterator();
            while (it2.hasNext()) {
                it2.next().s(z, z2);
            }
        }
        hd7 hd7Var = this.t;
        if (hd7Var != null) {
            hd7Var.i();
        }
        if (this.s) {
            this.s = false;
            tgh.b(TAG, "commitUserMotionForDesc:disappear");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements bd7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6886a;

            public a(int i) {
                this.f6886a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                float f;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (DescNativeController.y(DescNativeController.this) != null) {
                    DescNativeController.w(DescNativeController.this).onScroll(0);
                    if (this.f6886a > 0) {
                        DescNativeController descNativeController = DescNativeController.this;
                        DescNativeController.E(descNativeController, descNativeController.S());
                    } else {
                        DescNativeController descNativeController2 = DescNativeController.this;
                        DescNativeController.E(descNativeController2, DescNativeController.w(descNativeController2).getTotalHeight());
                    }
                    if (DescNativeController.z(DescNativeController.this) == null) {
                        f = 0.0f;
                    } else {
                        f = DescNativeController.z(DescNativeController.this).h;
                    }
                    if (vbl.c() && !DescNativeController.y(DescNativeController.this).b(DescNativeController.D(DescNativeController.this)) && Float.compare(f, 1.0f) <= 0 && Float.compare(f, 0.0f) > 0) {
                        DescNativeController.y(DescNativeController.this).a();
                    }
                    if (DescNativeController.z(DescNativeController.this) != null && DescNativeController.z(DescNativeController.this).f) {
                        DescNativeController descNativeController3 = DescNativeController.this;
                        DescNativeController.A(descNativeController3, DescNativeController.q(descNativeController3), DescNativeController.z(DescNativeController.this), DescNativeController.D(DescNativeController.this));
                    }
                }
                long j2 = 0;
                if (DescNativeController.B(DescNativeController.this) == 0) {
                    j = 0;
                } else {
                    j = SystemClock.elapsedRealtime() - DescNativeController.B(DescNativeController.this);
                }
                Context q = DescNativeController.q(DescNativeController.this);
                if (j > 0) {
                    j2 = j;
                }
                PerformanceUtils.l(q, "descNativeLoadTime", j2);
                tgh.b(DescNativeController.TAG, "nativeDesc cost:" + j);
            }
        }

        public b() {
        }

        public void a(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8229b077", new Object[]{this, gf7Var});
                return;
            }
            tgh.b(DescNativeController.TAG, "nativeDesc onDynamicRequestSuccess");
            if (DescNativeController.q(DescNativeController.this) != null && DescNativeController.v(DescNativeController.this) != null && DescNativeController.w(DescNativeController.this) != null && gf7Var != null && gf7Var.f30000a != null) {
                DescNativeController.m(DescNativeController.this, gf7Var);
                DescNativeController.c(DescNativeController.this).m(DescNativeController.l(DescNativeController.this).f30000a);
                DescNativeController.v(DescNativeController.this).setDescRecyleEngine(DescNativeController.c(DescNativeController.this));
                if (DescNativeController.c(DescNativeController.this).k()) {
                    DescNativeController.v(DescNativeController.this).notifyDataSetChanged();
                } else {
                    DescNativeController.w(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.v(DescNativeController.this));
                }
                DescNativeController descNativeController = DescNativeController.this;
                DescNativeController.x(descNativeController, DescNativeController.w(descNativeController));
            }
        }

        public void b(Response response) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2f558a3", new Object[]{this, response});
                return;
            }
            DescNativeController.f(DescNativeController.this, false);
            tgh.b(DescNativeController.TAG, "nativeDesc onStaticRequestFailure");
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", DescNativeController.z(DescNativeController.this).c);
            bw7.b(hashMap, -900001, "Native图文详情请求回调失败");
            DescNativeController descNativeController = DescNativeController.this;
            DescNativeController.n(descNativeController, descNativeController);
            if (!NetworkStatusHelper.isConnected()) {
                DescNativeController.j(DescNativeController.this, DESCState.STATIC_FAIL);
                DescNativeController.m(DescNativeController.this, null);
            } else if (DescNativeController.h(DescNativeController.this) != null) {
                tgh.b("DescNativeDegradeH5", "DescNativeController requestDesc failed.");
                DescNativeController.h(DescNativeController.this).a(-1);
                DescNativeController.i(DescNativeController.this);
            }
        }

        public final void d(List<ux1> list, List<ux1> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a0e38b9", new Object[]{this, list, list2});
            } else if (list != null && list2 != null && !list2.isEmpty()) {
                for (ux1 ux1Var : list2) {
                    if (ux1Var instanceof rc7) {
                        list.add(new rc7("disappear", ((rc7) ux1Var).c(), new RuntimeAbilityParam[0]));
                    }
                }
            }
        }

        public void c(gf7 gf7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d9ffc04", new Object[]{this, gf7Var});
                return;
            }
            tgh.b(DescNativeController.TAG, "nativeDesc onStaticRequestSuccess");
            DescNativeController.f(DescNativeController.this, false);
            try {
                if (!DescNativeController.g(DescNativeController.this, gf7Var)) {
                    DescNativeController.o(DescNativeController.this).clear();
                    DescNativeController.p(DescNativeController.this).clear();
                    ArrayList<ux1> arrayList = gf7Var.c;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        Iterator<ux1> it = gf7Var.c.iterator();
                        while (it.hasNext()) {
                            ux1 next = it.next();
                            if (next != null && (next instanceof rc7)) {
                                if ("ut_exposure".equals(((rc7) next).m1123b())) {
                                    DescNativeController.o(DescNativeController.this).add(next);
                                } else {
                                    q84.f(DescNativeController.q(DescNativeController.this), next);
                                }
                            }
                        }
                        d(DescNativeController.p(DescNativeController.this), DescNativeController.o(DescNativeController.this));
                    }
                    if (!gf7Var.a()) {
                        DescNativeController.j(DescNativeController.this, DESCState.INITIALIZED);
                    }
                    DescNativeController.m(DescNativeController.this, gf7Var);
                    DescNativeController.d(DescNativeController.this, new yc7(DescNativeController.q(DescNativeController.this), DescNativeController.l(DescNativeController.this).f30000a));
                    int u = DescNativeController.u(DescNativeController.this);
                    DescNativeController.c(DescNativeController.this).p(u);
                    DescNativeController.v(DescNativeController.this).setDescRecyleEngine(DescNativeController.c(DescNativeController.this));
                    DescNativeController.w(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.v(DescNativeController.this));
                    DescNativeController descNativeController = DescNativeController.this;
                    DescNativeController.x(descNativeController, DescNativeController.w(descNativeController));
                    DescNativeController.w(DescNativeController.this).post(new a(u));
                    q84.f(DescNativeController.q(DescNativeController.this), new c("native"));
                    DescNativeController.C(DescNativeController.this, true);
                    DescNativeController.c(DescNativeController.this).n(SystemClock.uptimeMillis());
                } else if (DescNativeController.h(DescNativeController.this) == null || !DescNativeController.h(DescNativeController.this).a(-1)) {
                    DescNativeController.j(DescNativeController.this, DESCState.STATIC_FAIL);
                    DescNativeController.m(DescNativeController.this, null);
                    DescNativeController descNativeController2 = DescNativeController.this;
                    DescNativeController.n(descNativeController2, descNativeController2);
                } else {
                    DescNativeController.i(DescNativeController.this);
                }
            } catch (Exception e) {
                DescNativeController descNativeController3 = DescNativeController.this;
                DescNativeController.n(descNativeController3, descNativeController3);
                tgh.c(DescNativeController.TAG, "onStaticRequestSuccess", e);
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", DescNativeController.z(DescNativeController.this).c);
                hashMap.put("exception", e.getMessage());
                bw7.b(hashMap, -900002, "Native图文详情数据解析异常");
            }
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e22a47", new Object[]{this});
            return;
        }
        SystemClock.uptimeMillis();
        tgh.b(TAG, "requestDesc");
        if (this.j == null) {
            if (P(this.g)) {
                lns.b bVar = this.l;
                if (bVar != null) {
                    bVar.a(-1);
                    X();
                    return;
                }
                return;
            }
            this.j = Q(this.g);
        }
        this.j.d();
        this.r = true;
        k0();
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        if (this.f == null) {
            try {
                PreRenderManager g = PreRenderManager.g(this.f6881a);
                if (g != null) {
                    this.f = (RelativeLayout) g.j(this.f6881a, R.layout.tt_taodetail_loading_mask, null, true);
                } else {
                    this.f = (RelativeLayout) LayoutInflater.from(this.f6881a).inflate(R.layout.tt_taodetail_loading_mask, (ViewGroup) null);
                }
            } catch (Throwable th) {
                tgh.c(TAG, "showLoading inflate x_taodetail_loading_mask", th);
                this.f = new View(this.f6881a);
            }
        }
        N(this.f);
    }

    public int S() {
        int i;
        int i2;
        ComponentModel componentModel;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61f0a8c6", new Object[]{this})).intValue();
        }
        yc7 yc7Var = this.m;
        if (yc7Var == null || yc7Var.c() == null || this.h == null || this.d == null) {
            return 0;
        }
        int f = mr7.f(this.f6881a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f, Integer.MIN_VALUE);
        List<md7> c2 = this.m.c();
        int i3 = 0;
        for (int i4 = 0; i4 < c2.size(); i4++) {
            md7 md7Var = c2.get(i4);
            if (md7Var == null || (componentModel = md7Var.i) == null || (jSONObject = componentModel.mapping) == null || (jSONObject2 = jSONObject.getJSONObject("size")) == null) {
                i2 = 0;
                i = 0;
            } else {
                i = jSONObject2.getIntValue("height");
                i2 = jSONObject2.getIntValue("width");
            }
            if (i <= 0 || i2 <= 0) {
                View view = this.h.getView(i4, null, this.d);
                view.measure(makeMeasureSpec, 0);
                i3 += view.getMeasuredHeight();
            } else {
                i3 += (int) Math.round(((f * 1.0d) * i) / i2);
            }
        }
        return i3;
    }
}
