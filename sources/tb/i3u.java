package tb;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i3u extends jxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup b;
    public final ViewGroup c;
    public DXRootView d;
    public final Handler e = new Handler();
    public GoodListSearchPopView f;
    public View g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                i3u.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (i3u.g(i3u.this) != null) {
                    i3u.g(i3u.this).setOnClickListener(null);
                    i3u.g(i3u.this).setClickable(false);
                    i3u.g(i3u.this).removeAllViews();
                }
            }
        }

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                i3u.h(i3u.this).post(new a());
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(295699321);
    }

    public i3u(xea xeaVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(xeaVar);
        this.b = viewGroup;
        this.c = viewGroup2;
    }

    public static /* synthetic */ ViewGroup g(i3u i3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("34e29bc0", new Object[]{i3uVar});
        }
        return i3uVar.c;
    }

    public static /* synthetic */ Handler h(i3u i3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3b17abd0", new Object[]{i3uVar});
        }
        return i3uVar.e;
    }

    public static /* synthetic */ Object ipc$super(i3u i3uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/TopBarEventHandler");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        GoodListSearchPopView goodListSearchPopView = this.f;
        if (goodListSearchPopView != null) {
            goodListSearchPopView.destroy();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfffd50", new Object[]{this});
        } else {
            awp.b(this.d, new b());
        }
    }

    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427393d1", new Object[]{this, jSONObject});
        } else if (f() != null && jSONObject != null && jSONObject.containsKey(rg0.JUMP_URL)) {
            Boolean bool = v2s.o().d().a().get("isTBLiveAPP");
            if (bool != null && bool.booleanValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", "a2141.8001249");
                v2s.o().E().updateNextPageProperties(hashMap);
            }
            kkr.i().l().a(f().i(), jSONObject.getString(rg0.JUMP_URL));
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("action_type", "购物车");
            hashMap2.put("feed_id", f().u());
            hashMap2.put(z9u.KEY_ACCOUNT_ID, f().g());
            hashMap2.put("user_id", v2s.o().u().getUserId());
            hashMap2.put("source", "pageone");
            if (kkr.i().o() != null) {
                kkr.i().o().c("gouwuche_button_task_click", hashMap2);
            }
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7b2664", new Object[]{this, jSONObject});
        } else if (f() != null && jSONObject != null && jSONObject.containsKey(rg0.JUMP_URL)) {
            kkr.i().l().a(f().i(), jSONObject.getString(rg0.JUMP_URL));
            if (kkr.i().o() != null) {
                kkr.i().o().c("order_entry", null);
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275a6b28", new Object[]{this});
        } else if (f() != null) {
            GoodListSearchPopView goodListSearchPopView = new GoodListSearchPopView(f(), this.b);
            this.f = goodListSearchPopView;
            goodListSearchPopView.show();
            xha.f(f().u(), f().g());
        }
    }

    public void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb444e2", new Object[]{this, view});
        } else {
            this.g = view;
        }
    }

    public static int j(LiveItemCategoriesResponseData liveItemCategoriesResponseData) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84774327", new Object[]{liveItemCategoriesResponseData})).intValue();
        }
        if (!(liveItemCategoriesResponseData == null || (list = liveItemCategoriesResponseData.topRightEntranceList) == null || list.isEmpty())) {
            for (int i = 0; i < liveItemCategoriesResponseData.topRightEntranceList.size(); i++) {
                JSONObject jSONObject = liveItemCategoriesResponseData.topRightEntranceList.get(i);
                if (jSONObject != null && TextUtils.equals(u3u.ENTRY_TYPE_LIVE_CART, jSONObject.getString("type"))) {
                    return zqq.g(jSONObject.getString("count"), 0);
                }
            }
        }
        return -1;
    }

    public static int p(JSONObject jSONObject, int i, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5c025e", new Object[]{jSONObject, new Integer(i), new Boolean(z)})).intValue();
        }
        if (jSONObject != null && jSONObject.containsKey("topRightEntranceList")) {
            JSONArray jSONArray = jSONObject.getJSONArray("topRightEntranceList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                hha.b("TopBarEventHandler", "replaceLiveCartCount | list empty.");
            } else {
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (TextUtils.equals(u3u.ENTRY_TYPE_LIVE_CART, jSONObject2.getString("type"))) {
                        String string = jSONObject2.getString("count");
                        int g = zqq.g(string, 0);
                        if (g > 0 && g > i && z) {
                            z2 = true;
                        }
                        if (z2) {
                            jSONObject2.put("count", (Object) Integer.toString(i));
                            jSONObject2.put("realCount", (Object) string);
                        }
                        if (z2) {
                            return g;
                        }
                        return -1;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public void m(DXRuntimeContext dXRuntimeContext, xea xeaVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b773500", new Object[]{this, dXRuntimeContext, xeaVar, jSONObject});
            return;
        }
        if (this.d == null) {
            this.d = ikr.f().a(f().i(), "taolive_gl_header_entry_pop");
        }
        if (this.d == null) {
            hha.b("TopBarEventHandler", "onMoreClick | mEntryPopView is empty.");
            return;
        }
        ikr.f().l(this.d, jSONObject, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d.getLayoutParams());
        layoutParams.gravity = 5;
        layoutParams.rightMargin = nw0.c(dXRuntimeContext.r(), f().i(), 7.0f);
        layoutParams.topMargin = nw0.c(dXRuntimeContext.r(), f().i(), 50.0f);
        int[] iArr = new int[2];
        dXRuntimeContext.L().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.c.getLocationOnScreen(iArr2);
        layoutParams.topMargin = (iArr[1] - iArr2[1]) + dXRuntimeContext.L().getHeight();
        ((FrameLayout) this.c).addView(this.d, layoutParams);
        awp.c(this.d, null);
        this.c.setOnClickListener(new a());
        zha.j(jSONObject, true);
    }

    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2977250a", new Object[]{this, jSONObject});
        } else if (f() != null) {
            String string = jSONObject.getString(rg0.JUMP_URL);
            TaoLiveWebBottomFragment.d dVar = new TaoLiveWebBottomFragment.d();
            dVar.x(new nnr((Activity) f().i(), string));
            int f = nw0.f(f().i());
            int g = nw0.g();
            float f2 = (f <= 0 || g <= 0) ? 0.725f : (f * 0.725f) / g;
            int[] iArr = new int[2];
            if (this.g != null && vvs.b("goodlist", "enableLiveCartH", true)) {
                this.g.getLocationInWindow(iArr);
                int height = (f - iArr[1]) - this.g.getHeight();
                if (height > 0 && height < f) {
                    f2 = ((f * 0.725f) + height) / g;
                }
            }
            hha.b("TopBarEventHandler", "onCartLiveHandler | height=" + f2 + "  location[0]=" + iArr[0] + " location[1]=" + iArr[1]);
            dVar.b(f2);
            dVar.d(false);
            dVar.a(f().i());
            dVar.build().show(((FragmentActivity) f().i()).getSupportFragmentManager(), "goods_weex_bottom");
        }
    }
}
