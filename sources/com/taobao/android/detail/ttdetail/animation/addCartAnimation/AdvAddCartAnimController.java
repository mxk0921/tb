package com.taobao.android.detail.ttdetail.animation.addCartAnimation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.b1i;
import tb.b5m;
import tb.ckf;
import tb.h8n;
import tb.he0;
import tb.jos;
import tb.mpe;
import tb.mr7;
import tb.nb4;
import tb.nj7;
import tb.oa4;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/animation/addCartAnimation/AdvAddCartAnimController;", "Landroid/content/BroadcastReceiver;", "Companion", "a", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AdvAddCartAnimController extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "AdvAddCartAnim";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6672a;
    public final String b;
    public final FrameLayout c;
    public final jos d;
    public final b1i e;
    public final DinamicXComponent f;
    public final he0 g;
    public final boolean h;
    public final int[] i;
    public String j;
    public String k;
    public boolean l;
    public FrameLayout m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261231);
        }

        public a() {
        }

        public final <T extends nb4> AdvAddCartAnimController a(Context context, h8n h8nVar, jos josVar, oa4<T> oa4Var, View view, b1i b1iVar) {
            String c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AdvAddCartAnimController) ipChange.ipc$dispatch("c3866892", new Object[]{this, context, h8nVar, josVar, oa4Var, view, b1iVar});
            }
            ckf.h(context, "context");
            ckf.h(h8nVar, "queryParams");
            if (!vbl.f() || nj7.h() || !h8nVar.i() || b1iVar == null || josVar == null || !(oa4Var instanceof DinamicXComponent) || !(view instanceof FrameLayout) || (c = h8nVar.c()) == null) {
                return null;
            }
            return new AdvAddCartAnimController(context, c, (FrameLayout) view, josVar, b1iVar, (DinamicXComponent) oa4Var, null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261230);
    }

    public /* synthetic */ AdvAddCartAnimController(Context context, String str, FrameLayout frameLayout, jos josVar, b1i b1iVar, DinamicXComponent dinamicXComponent, a07 a07Var) {
        this(context, str, frameLayout, josVar, b1iVar, dinamicXComponent);
    }

    public static final /* synthetic */ int[] a(AdvAddCartAnimController advAddCartAnimController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9f5016bf", new Object[]{advAddCartAnimController});
        }
        return advAddCartAnimController.i;
    }

    public static final /* synthetic */ void b(AdvAddCartAnimController advAddCartAnimController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2100e3", new Object[]{advAddCartAnimController, view});
        } else {
            advAddCartAnimController.p(view);
        }
    }

    public static /* synthetic */ void f(AdvAddCartAnimController advAddCartAnimController, View view, View view2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209bac1a", new Object[]{advAddCartAnimController, view, view2, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            view2 = null;
        }
        advAddCartAnimController.e(view, view2);
    }

    public static /* synthetic */ Object ipc$super(AdvAddCartAnimController advAddCartAnimController, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/addCartAnimation/AdvAddCartAnimController");
    }

    public final boolean c() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17afa593", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f6672a.getSharedPreferences("mmAdBiz", 0);
        if (sharedPreferences == null || (string = sharedPreferences.getString(this.b, null)) == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.remove(this.b);
            edit.apply();
        }
        if (string.length() > 0) {
            k(string);
            tgh.b(TAG, "cartId: " + this.j + ", exParams: " + this.k);
            l();
        }
        return true;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.l) {
            LocalBroadcastManager.getInstance(this.f6672a).unregisterReceiver(this);
        }
        this.g.e();
    }

    public final void e(View view, View view2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fd0922", new Object[]{this, view, view2});
            return;
        }
        ckf.h(view, "animView");
        this.c.removeView(view);
        if (view2 != null && (frameLayout = this.m) != null) {
            frameLayout.removeView(view2);
        }
    }

    public final int[] g(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("22dc79ad", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int[] iArr = new int[2];
        if (this.h) {
            int[] B = this.e.B();
            if (B != null) {
                iArr[0] = (B[0] - i) / 2;
                iArr[1] = (B[1] - i2) / 2;
            }
        } else {
            iArr[0] = (this.c.getWidth() - i) / 2;
            int height = this.c.getHeight();
            DXRootView X = this.f.X();
            if (X != null) {
                i3 = X.getHeight();
            }
            iArr[1] = ((height - i3) - i2) / 2;
        }
        return iArr;
    }

    public final View h() {
        DXWidgetNode expandWidgetNode;
        View nativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9da9ba24", new Object[]{this});
        }
        if (this.h) {
            return this.d.z();
        }
        DXRootView X = this.f.X();
        if (X == null || (expandWidgetNode = X.getExpandWidgetNode()) == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId("icon-cart");
        if (queryWidgetNodeByUserId != null && (nativeView = queryWidgetNodeByUserId.getNativeView()) != null) {
            return nativeView;
        }
        DXWidgetNode queryWidgetNodeByUserId2 = expandWidgetNode.queryWidgetNodeByUserId("image-cart");
        if (queryWidgetNodeByUserId2 != null) {
            return queryWidgetNodeByUserId2.getNativeView();
        }
        return null;
    }

    public final CardView i(String str, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardView) ipChange.ipc$dispatch("d8ad3e8", new Object[]{this, str, new Integer(i), new Integer(i2), iArr});
        }
        CardView cardView = new CardView(this.f6672a);
        cardView.setX(iArr[0]);
        cardView.setY(iArr[1]);
        cardView.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        cardView.setVisibility(4);
        cardView.setRadius(mr7.a(1.0f));
        TTImageUrlView tTImageUrlView = new TTImageUrlView(this.f6672a);
        tTImageUrlView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tTImageUrlView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mpe.m(tTImageUrlView, str);
        cardView.addView(tTImageUrlView);
        return cardView;
    }

    public final CardView j(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardView) ipChange.ipc$dispatch("9ecc1135", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        CardView cardView = new CardView(this.f6672a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        cardView.setLayoutParams(layoutParams);
        cardView.setVisibility(4);
        cardView.setRadius(mr7.a(1.0f));
        TTImageUrlView tTImageUrlView = new TTImageUrlView(this.f6672a);
        tTImageUrlView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tTImageUrlView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mpe.m(tTImageUrlView, str);
        cardView.addView(tTImageUrlView);
        return cardView;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d392ab05", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.f6672a).registerReceiver(this, new IntentFilter("AdvAddToCartDetailNewAnim"));
        this.l = true;
    }

    public final void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95fdaef", new Object[]{this, view});
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        tgh.b(TAG, "time: " + System.currentTimeMillis() + " 接收到购物车加购广播");
        c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.b.getLocationOnScreen(AdvAddCartAnimController.a(AdvAddCartAnimController.this));
            if (AdvAddCartAnimController.a(AdvAddCartAnimController.this)[0] == 0 || AdvAddCartAnimController.a(AdvAddCartAnimController.this)[1] == 0) {
                tgh.b(AdvAddCartAnimController.TAG, "获取购物车坐标失败");
            } else {
                AdvAddCartAnimController.b(AdvAddCartAnimController.this, this.b);
            }
        }
    }

    public AdvAddCartAnimController(Context context, String str, FrameLayout frameLayout, jos josVar, b1i b1iVar, DinamicXComponent dinamicXComponent) {
        this.f6672a = context;
        this.b = "AdvAddToCartNewAnimation-" + str;
        this.c = frameLayout;
        this.d = josVar;
        this.e = b1iVar;
        this.f = dinamicXComponent;
        this.g = new he0();
        this.h = josVar.z() != null;
        this.i = new int[2];
        if (!c()) {
            m();
            tgh.b(TAG, "time: " + System.currentTimeMillis() + " 注册广播");
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        View h = h();
        if (h != null) {
            h.getLocationOnScreen(this.i);
            int[] iArr = this.i;
            if (iArr[0] == 0 || iArr[1] == 0) {
                n(h);
            } else {
                p(h);
            }
        } else {
            tgh.b(TAG, "获取购物车视图失败");
        }
    }

    public final void p(View view) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2e49", new Object[]{this, view});
            return;
        }
        String C = this.e.C(0);
        if (C != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            CardView i = i(C, width, height, g(width, height));
            this.c.addView(i);
            Object obj = null;
            if (this.h) {
                Object parent = view.getParent();
                if (parent != null) {
                    if (parent instanceof FrameLayout) {
                        obj = parent;
                    }
                    if (obj != null) {
                        this.m = (FrameLayout) obj;
                        CardView j = j(C, width / 2, height / 2);
                        FrameLayout frameLayout = this.m;
                        if (frameLayout != null) {
                            frameLayout.addView(j);
                        }
                        o(view);
                        this.g.g(i, j, view, this.i, this);
                        obj = xhv.INSTANCE;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                nb4 componentData = this.f.getComponentData();
                if (!(componentData == null || (f = componentData.f()) == null)) {
                    o(view);
                    this.g.f(i, this.f, f, C, this.i, this);
                    obj = xhv.INSTANCE;
                }
            }
            if (obj != null) {
                return;
            }
        }
        tgh.b(TAG, "获取主图第一张图片失败");
        xhv xhvVar = xhv.INSTANCE;
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
            return;
        }
        try {
            for (String str2 : wsq.z0(str, new String[]{";"}, false, 0, 6, null)) {
                List z0 = wsq.z0(str2, new String[]{"="}, false, 0, 6, null);
                if (z0.size() != 2) {
                    return;
                }
                if (!ckf.b((String) z0.get(1), "null")) {
                    if (ckf.b((String) z0.get(0), "cartId")) {
                        this.j = (String) z0.get(1);
                    } else if (ckf.b((String) z0.get(0), "addToGroupExParams")) {
                        this.k = (String) z0.get(1);
                    }
                }
            }
        } catch (Exception e) {
            tgh.c(TAG, "解析sharedPreference失败", e);
        }
    }

    public final void o(View view) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f372b9b", new Object[]{this, view});
            return;
        }
        if (this.h) {
            str = "up";
        } else {
            str = "down";
        }
        b5m.e C = b5m.C();
        if (C != null) {
            Context context = this.f6672a;
            if (context != null) {
                Activity activity = (Activity) context;
                Float valueOf = Float.valueOf(0.9f);
                String str2 = this.j;
                String str3 = this.k;
                Point point = new Point();
                point.x = mr7.j((view.getWidth() / 2) + this.i[0]);
                if (this.h) {
                    i = mr7.j(view.getHeight() + this.i[1]);
                } else {
                    i = mr7.j(this.i[1]);
                }
                point.y = i;
                C.a(activity, valueOf, str2, str3, str, point);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
