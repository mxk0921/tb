package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendTouchView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i4b extends jw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXRootView n;
    public ItemInfo o;
    public Handler p = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0) {
                i4b.this.b.I(true, true);
                i4b i4bVar = i4b.this;
                i4bVar.b.W(i4bVar.m(), i4b.E(i4b.this));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21089a;

        public b(int i) {
            this.f21089a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i4b.F(i4b.this, this.f21089a, false);
            }
        }
    }

    static {
        t2o.a(295699662);
    }

    public i4b(Context context, amr amrVar, String str) {
        super(context, amrVar, str);
    }

    public static /* synthetic */ ItemInfo E(i4b i4bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("aa7ea93e", new Object[]{i4bVar});
        }
        return i4bVar.o;
    }

    public static /* synthetic */ void F(i4b i4bVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5939a8c", new Object[]{i4bVar, new Integer(i), new Boolean(z)});
        } else {
            i4bVar.J(i, z);
        }
    }

    public static /* synthetic */ void G(i4b i4bVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2331f5", new Object[]{i4bVar, str, new Integer(i), new Boolean(z)});
        } else {
            i4bVar.I(str, i, z);
        }
    }

    public static /* synthetic */ Object ipc$super(i4b i4bVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.j();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/HomeTabPopView");
    }

    @Override // tb.jw1
    public void D(boolean z) {
        JSONObject jSONObject;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f583c0", new Object[]{this, new Boolean(z)});
        } else if (this.n != null && (jSONObject = this.d) != null) {
            if (this.b.u() == null) {
                z2 = false;
            }
            jSONObject.put("isSupport0yg", (Object) Boolean.valueOf(z2));
            this.d.put("isNeedShowAnimal", (Object) Boolean.valueOf(z));
            this.d.put("futureTime", (Object) Long.valueOf(System.currentTimeMillis() + m.CONFIG_TRACK_1022_INTERVAL_TIME));
            ll6.d(this.b.v(), this.n, new JSONObject(this.d), this.b.F());
        }
    }

    public final void I(String str, int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ec3720", new Object[]{this, str, new Integer(i), new Boolean(z)});
            return;
        }
        BaseFrame baseFrame = this.b.l;
        if (baseFrame != null) {
            View viewByName = baseFrame.getViewByName(str);
            if (viewByName != null) {
                viewByName.setVisibility(i);
                if (i == 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                viewByName.setAlpha(f);
                String str2 = amr.TAG;
                o3s.b(str2, viewByName + " setVisibilityRoomFrame " + str + " " + i + " " + z);
            } else if (z && this.p != null && this.b.y() != null && this.b.y().i() != null) {
                this.p.postDelayed(new l4b(this, str, i), this.b.y().i().b(str));
            }
        }
    }

    @Override // tb.jw1
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.j();
        this.n = null;
        this.o = null;
        J(0, true);
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
    }

    @Override // tb.jw1
    public ItemInfo n(uv5 uv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("45ddda38", new Object[]{this, uv5Var});
        }
        return this.o;
    }

    @Override // tb.jw1
    public View p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.jw1
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9b29a2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jw1
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4387938c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.jw1
    public void y(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e111022", new Object[]{this, str, obj});
        } else {
            this.d.put(str, obj);
        }
    }

    @Override // tb.jw1
    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31bc6a8", new Object[]{this, new Integer(i)});
            return;
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.post(new b(i));
        }
    }

    public final void J(int i, boolean z) {
        ItemInfo itemInfo;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8ab27a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z || (nh4.m1() && (itemInfo = this.o) != null && (jSONObject = itemInfo.displayStyleExtend) != null && zqq.c(jSONObject.getString("isNeedHideALive")))) {
            I("dynamic_h5_sdk", i, true);
        }
        I("tl-showcase-common", i, true);
        I("tl-chat", i, true);
        I("tl-top-select_comment", i, true);
        I("tl-important-event", i, true);
    }

    @Override // tb.jw1
    public void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
            return;
        }
        this.o = (ItemInfo) fkx.j(this.d, ItemInfo.class);
        ub5 v = this.b.v();
        Context context = this.f22251a;
        if (TextUtils.isEmpty(this.g)) {
            str = "taolive_boom_panel";
        } else {
            str = this.g;
        }
        DXRootView a2 = ll6.a(v, context, str);
        this.n = a2;
        if (a2 != null) {
            RecommendTouchView recommendTouchView = new RecommendTouchView(this.f22251a);
            recommendTouchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            recommendTouchView.setPadding(0, 0, 0, k());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            recommendTouchView.addView(this.n, layoutParams);
            this.c.addView(recommendTouchView);
            recommendTouchView.setRecommendTouchListener(new a());
            D(true);
            this.b.Z(r(), this.o);
            z(8);
        }
    }
}
