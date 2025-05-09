package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.taobao.TBActionBar;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder;
import com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b5m;
import tb.fh3;
import tb.h1p;
import tb.hnn;
import tb.ir;
import tb.jos;
import tb.jov;
import tb.mpe;
import tb.mr7;
import tb.nsk;
import tb.owo;
import tb.p3w;
import tb.q84;
import tb.qc7;
import tb.r4p;
import tb.rc7;
import tb.s0m;
import tb.s8d;
import tb.sqj;
import tb.t2o;
import tb.tgh;
import tb.u3p;
import tb.vbl;
import tb.xq0;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NavBarHolderV3 implements SearchInfoController.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int B = 0;
    public static int C = 0;
    public static Map E = null;
    public static final int VIEW_TYPE_DEFAULT = 0;
    public static final int VIEW_TYPE_END = 2;
    public static final int VIEW_TYPE_SEARCH = 3;
    public static final int VIEW_TYPE_SEARCH_ICON = 4;
    public static final int VIEW_TYPE_SHARE = 5;
    public static final int VIEW_TYPE_START = 1;
    public boolean A;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public TaoDetailActionBarV3 f6923a;
    public jos.e b;
    public u3p c;
    public View d;
    public TIconFontTextView e;
    public View.OnClickListener f;
    public String i;
    public String j;
    public l k;
    public List<String> l;
    public final CartBarViewHolder n;
    public final CollectBarViewHolder o;
    public final String p;
    public final Context q;
    public List<jos.d> r;
    public ITBPublicMenu s;
    public TextView t;
    public SpannableString u;
    public SpannableString v;
    public SpannableString w;
    public SpannableStringBuilder x;
    public String y;
    public boolean z;
    public boolean g = false;
    public boolean h = false;
    public int m = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jos.e.a b;

        public a(jos.e.a aVar) {
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NavBarHolderV3.d(NavBarHolderV3.this, this.b.g, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jos.e.a f6926a;

        public b(jos.e.a aVar) {
            this.f6926a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NavBarHolderV3.d(NavBarHolderV3.this, this.f6926a.g, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) "Back");
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("NavBarHolderV3", "back track error", e);
            }
            q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new nsk());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(NavBarHolderV3 navBarHolderV3) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate() || (drawable = succPhenixEvent.getDrawable()) == null || NavBarHolderV3.a(NavBarHolderV3.this) == null)) {
                NavBarHolderV3.a(NavBarHolderV3.this).setActionBarBackgroundDrawable(drawable);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == 9000004) {
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("share", new JSONObject(), new RuntimeAbilityParam[0]));
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) "Button-");
                jSONObject.put("args", (Object) "Share");
                arrayList.add(new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
                qc7.a(NavBarHolderV3.b(NavBarHolderV3.this), arrayList);
                UserBehaviorTracker.l(NavBarHolderV3.b(NavBarHolderV3.this), UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_MORE, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!TextUtils.isEmpty(NavBarHolderV3.i(NavBarHolderV3.this))) {
                try {
                    JSONObject parseObject = JSON.parseObject(JSON.toJSONString(NavBarHolderV3.j(NavBarHolderV3.this)));
                    JSONObject jSONObject = new JSONObject();
                    if (NavBarHolderV3.k(NavBarHolderV3.this) != null) {
                        parseObject.put("itemid", (Object) NavBarHolderV3.g(NavBarHolderV3.this));
                        parseObject.put(h1p.KEY_SUGGEST_RN, (Object) NavBarHolderV3.k(NavBarHolderV3.this));
                    }
                    jSONObject.put("arg1", (Object) z9u.SEARCH_ENTRANCE_CLICK);
                    jSONObject.put("args", (Object) parseObject);
                    q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    tgh.c("NavBarHolderV3", "ctrlClicked mergeExposure", e);
                }
                if (r4p.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK.equalsIgnoreCase(NavBarHolderV3.l(NavBarHolderV3.this))) {
                    xq0.c().a(NavBarHolderV3.b(NavBarHolderV3.this)).e(268435456).c(NavBarHolderV3.i(NavBarHolderV3.this));
                } else {
                    xq0.c().a(NavBarHolderV3.b(NavBarHolderV3.this)).c(NavBarHolderV3.i(NavBarHolderV3.this));
                }
                UserBehaviorTracker.l(NavBarHolderV3.b(NavBarHolderV3.this), UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_SEARCH, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public i(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(NavBarHolderV3.m(NavBarHolderV3.this)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) "ShoppingCart");
                jSONObject.put("args", (Object) parseObject);
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("NavBarHolderV3", "ctrlClicked mergeCartExposure", e);
            }
            jov.k(NavBarHolderV3.b(NavBarHolderV3.this), this.b);
            int q = NavBarHolderV3.n(NavBarHolderV3.this).q();
            Map j = NavBarHolderV3.j(NavBarHolderV3.this);
            j.put(CartBarViewHolder.UT_KEY_CART_BADGE, CartBarViewHolder.UT_VALUE_CART_BADGE);
            if (q > 99) {
                str = "99+";
            } else {
                str = String.valueOf(q);
            }
            j.put("text", str);
            try {
                JSONObject parseObject2 = JSON.parseObject(JSON.toJSONString(j));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("arg1", (Object) "Page_Detail_Button-ShoppingCart_Badge");
                jSONObject2.put("args", (Object) parseObject2);
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
            } catch (Exception e2) {
                tgh.c("NavBarHolderV3", "ctrlClicked mergeExposure", e2);
            }
            UserBehaviorTracker.l(NavBarHolderV3.b(NavBarHolderV3.this), UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_CART, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6930a;

        public j(String str) {
            this.f6930a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ((TTDetailBaseActivity) NavBarHolderV3.b(NavBarHolderV3.this)).q3().b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3$8$1
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3$8$1.1
                        {
                            put("url", (Object) NavBarHolderV3.j.this.f6930a);
                        }
                    });
                }
            }), new RuntimeAbilityParam[0]);
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(NavBarHolderV3.j(NavBarHolderV3.this)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) "Navigation-MyFavorite");
                jSONObject.put("args", (Object) parseObject);
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("NavBarHolderV3", "MyFavorite ctrlClicked mergeExposure", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NavBarHolderV3.c(NavBarHolderV3.this).i();
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(NavBarHolderV3.j(NavBarHolderV3.this)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) "NavbarCollect");
                jSONObject.put("args", (Object) parseObject);
                q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("NavBarHolderV3", "queryCollect ctrlClicked mergeExposure", e);
            }
            UserBehaviorTracker.l(NavBarHolderV3.b(NavBarHolderV3.this), UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_COLLECT, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        public final String f6931a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        static {
            t2o.a(912262607);
        }

        public m(NavBarHolderV3 navBarHolderV3, JSONObject jSONObject) {
            boolean z = false;
            this.e = false;
            if (jSONObject != null) {
                boolean booleanValue = jSONObject.getBooleanValue("isReviewPageShow");
                String string = jSONObject.getString("rateText");
                this.f6931a = string;
                this.d = jSONObject.getString("pageTitle");
                if (NavBarHolderV3.f(navBarHolderV3)) {
                    this.b = jSONObject.getString("leftBlackPic");
                    this.c = jSONObject.getString("rightBlackPic");
                } else {
                    this.b = jSONObject.getString("leftPic");
                    this.c = jSONObject.getString("rightPic");
                }
                if (!(!booleanValue || string == null || this.b == null || this.c == null)) {
                    z = true;
                }
                this.e = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class n implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n(NavBarHolderV3 navBarHolderV3) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class o implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6932a;

        public o(boolean z) {
            this.f6932a = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                NavBarHolderV3.e(NavBarHolderV3.this, succPhenixEvent.getDrawable(), this.f6932a);
            }
            return true;
        }
    }

    static {
        t2o.a(912262588);
        t2o.a(912262586);
        t2o.a(912262619);
    }

    public NavBarHolderV3(Context context, String str) {
        this.q = context;
        this.n = new CartBarViewHolder(context);
        this.p = str;
        this.o = new CollectBarViewHolder(context, str);
    }

    public static /* synthetic */ TaoDetailActionBarV3 a(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoDetailActionBarV3) ipChange.ipc$dispatch("46f722db", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.f6923a;
    }

    public static /* synthetic */ Context b(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("953c9038", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.q;
    }

    public static /* synthetic */ CollectBarViewHolder c(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectBarViewHolder) ipChange.ipc$dispatch("3282b559", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.o;
    }

    public static /* synthetic */ void d(NavBarHolderV3 navBarHolderV3, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390020f9", new Object[]{navBarHolderV3, str, new Boolean(z)});
        } else {
            navBarHolderV3.A(str, z);
        }
    }

    public static /* synthetic */ void e(NavBarHolderV3 navBarHolderV3, BitmapDrawable bitmapDrawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118759af", new Object[]{navBarHolderV3, bitmapDrawable, new Boolean(z)});
        } else {
            navBarHolderV3.a0(bitmapDrawable, z);
        }
    }

    public static /* synthetic */ boolean f(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc32bf3", new Object[]{navBarHolderV3})).booleanValue();
        }
        return navBarHolderV3.D();
    }

    public static /* synthetic */ String g(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dfd3421", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.p;
    }

    public static /* synthetic */ boolean h(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9281e382", new Object[]{navBarHolderV3})).booleanValue();
        }
        return navBarHolderV3.g;
    }

    public static /* synthetic */ String i(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca5245a3", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.j;
    }

    public static /* synthetic */ Map j(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a05f2ef1", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.S();
    }

    public static /* synthetic */ String k(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56a75725", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.y;
    }

    public static /* synthetic */ String l(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cd1dfe6", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.i;
    }

    public static /* synthetic */ Map m(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c770738e", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.Q();
    }

    public static /* synthetic */ CartBarViewHolder n(NavBarHolderV3 navBarHolderV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartBarViewHolder) ipChange.ipc$dispatch("5b618df9", new Object[]{navBarHolderV3});
        }
        return navBarHolderV3.n;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1f971", new Object[]{this});
        } else if (this.f6923a != null && vbl.y0() && b5m.O().b()) {
            String a2 = b5m.O().a("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_IMG);
            X(b5m.O().c("global", GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, -1), b5m.O().c("global", "actionbarTextSelColor", -192), b5m.O().c("global", GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, -197380), b5m.O().c("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG, -65386));
            if (b5m.O().b()) {
                this.f6923a.setFestivalAtmosphere(true);
            }
            H(a2);
        }
    }

    public final void C(String str, String str2) {
        String str3;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168cceb8", new Object[]{this, str, str2});
            return;
        }
        try {
            Uri parse = Uri.parse(str2);
            String queryParameter = parse.getQueryParameter(r4p.KEY_SEARCHDOOR_LAUNCH_MODE);
            u3p u3pVar = this.c;
            if (u3pVar != null) {
                str3 = u3pVar.f29123a;
            } else {
                str3 = parse.toString();
            }
            u3p u3pVar2 = this.c;
            if (u3pVar2 != null) {
                list = u3pVar2.b;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(parse.getQueryParameter("showText"));
                list = arrayList;
            }
            h hVar = new h();
            this.f = hVar;
            ViewProxy.setOnClickListener(this.d, hVar);
            i0(str, list, str3, queryParameter);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("422877b4", new Object[]{this})).booleanValue();
        }
        if (this.e.getCurrentTextColor() == -1) {
            return true;
        }
        return false;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5bb38", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81236e66", new Object[]{this})).booleanValue();
        }
        if (this.u == null || this.v == null) {
            return false;
        }
        return true;
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de993ed", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            s0m.B().T(str).succListener(new e()).failListener(new d(this)).fetch();
        }
    }

    public View I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("87d9e5c3", new Object[]{this});
        }
        TIconFontTextView r = r();
        r.setText("ꁽ");
        r.setContentDescription("返回，按钮");
        r.setOnClickListener(new c());
        return r;
    }

    public View J(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cfa52d4b", new Object[]{this, aVar});
        }
        View L = L(aVar);
        if (!this.A) {
            this.A = true;
            G(aVar);
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.d)) {
            String str = aVar.d;
            if (!TextUtils.isEmpty(str) && L != null) {
                ViewProxy.setOnClickListener(L, new i(str));
            }
        }
        return L;
    }

    public View K(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f6c565d", new Object[]{this, aVar});
        }
        View L = L(aVar);
        this.o.l((TIconFontTextView) L);
        this.o.o(this.f6923a);
        this.o.j();
        ViewProxy.setOnClickListener(L, new k());
        return L;
    }

    public View L(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("96a40cf8", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        TIconFontTextView r = r();
        r.setText(aVar.c);
        r.setContentDescription(l0(aVar));
        return r;
    }

    public View M(jos.e.b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("72a50d3a", new Object[]{this, bVar});
        }
        PreRenderManager g = PreRenderManager.g(this.q);
        if (g != null) {
            view = g.j(this.q, R.layout.tt_detail_action_bar_search_v3, null, true);
        } else {
            view = LayoutInflater.from(this.q).inflate(R.layout.tt_detail_action_bar_search_v3, (ViewGroup) null);
        }
        this.d = view;
        C(bVar.f22130a, this.j);
        return view;
    }

    public final TIconFontTextView N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("40b42cdb", new Object[]{this});
        }
        TIconFontTextView r = r();
        r.setText("끺");
        r.setContentDescription("搜索,按钮");
        r.setOnClickListener(this.f);
        return r;
    }

    public final TTImageUrlView O(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTImageUrlView) ipChange.ipc$dispatch("ecb735a7", new Object[]{this, aVar});
        }
        if (aVar == null || TextUtils.isEmpty(aVar.g)) {
            return null;
        }
        TTImageUrlView s = s(aVar.g);
        s.setId(R.id.tt_detail_nav_bar_share_image);
        s.setOnClickListener(new b(aVar));
        return s;
    }

    public final View P(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fa5dce88", new Object[]{this, aVar});
        }
        View L = L(aVar);
        if (!this.z) {
            this.z = true;
            G(aVar);
        }
        L.setId(R.id.tt_detail_nav_bar_share_icon);
        ViewProxy.setOnClickListener(L, new a(aVar));
        return L;
    }

    public final Map<String, String> Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("169df55b", new Object[]{this});
        }
        Map<String, String> S = S();
        S.put("trackName", "ShoppingCart");
        S.put("trackNamePre", "Button-");
        return S;
    }

    public final Map<String, Object> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("893185c4", new Object[]{this});
        }
        return new HashMap();
    }

    public final Map<String, String> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2118721b", new Object[]{this});
        }
        return x();
    }

    public final Map<String, String> T(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b98ad90", new Object[]{this, str, str2});
        }
        Map<String, String> S = S();
        S.put("slideBefore", str);
        S.put("slideAfter", str2);
        return S;
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        CartBarViewHolder cartBarViewHolder = this.n;
        if (cartBarViewHolder != null) {
            cartBarViewHolder.s();
        }
    }

    public void V(u3p u3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ae58ae", new Object[]{this, u3pVar});
        } else if (u3pVar != null) {
            this.c = u3pVar;
            if (!TextUtils.isEmpty(u3pVar.f29123a)) {
                this.j = u3pVar.f29123a;
                this.y = u3pVar.c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("itemid", (Object) this.p);
                jSONObject.put(h1p.KEY_SUGGEST_RN, (Object) this.y);
                this.f6923a.setSearchLabParams(jSONObject);
                i0(null, u3pVar.b, u3pVar.f29123a, null);
            }
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215e4200", new Object[]{this});
        } else {
            this.f6923a.setNaviBarState(false);
        }
    }

    public final void X(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6523022f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        this.f6923a.setItemColor(i2);
        this.f6923a.setTabSelectedColor(i3);
        this.f6923a.setTabUnSelectedColor(i4);
        this.f6923a.setActionBarBackgroundColor(i5);
    }

    public void Y(List<jos.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34009270", new Object[]{this, list});
        } else {
            this.r = list;
        }
    }

    public void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df985e9", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void a0(BitmapDrawable bitmapDrawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e861dc0", new Object[]{this, bitmapDrawable, new Boolean(z)});
            return;
        }
        SpannableString spannableString = new SpannableString(" ");
        bitmapDrawable.setBounds(0, 0, mr7.a(10.0f), mr7.a(14.0f));
        spannableString.setSpan(new fh3(bitmapDrawable, 2), 0, 1, 33);
        if (z) {
            this.u = spannableString;
        } else {
            this.v = spannableString;
        }
        if (F()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            this.x = spannableStringBuilder;
            spannableStringBuilder.append((CharSequence) this.u).append((CharSequence) this.w).append((CharSequence) this.v);
            this.t.setText(this.x);
            this.t.setMaxLines(1);
            this.t.setHorizontallyScrolling(true);
            this.t.setFocusable(true);
            this.t.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
    }

    public void c0(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522793a3", new Object[]{this, lVar});
        } else {
            this.k = lVar;
        }
    }

    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72d134", new Object[]{this, str});
            return;
        }
        CollectBarViewHolder collectBarViewHolder = this.o;
        if (collectBarViewHolder != null) {
            collectBarViewHolder.m(str);
        }
    }

    public void e0(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c9a053", new Object[]{this, iTBPublicMenu});
        } else {
            this.s = iTBPublicMenu;
        }
    }

    public final void f0(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85751496", new Object[]{this, mVar});
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.x;
        if (spannableStringBuilder == null) {
            t(mVar);
        } else {
            this.t.setText(spannableStringBuilder);
            this.t.setMaxLines(1);
            this.t.setHorizontallyScrolling(true);
            this.t.setFocusable(true);
            this.t.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        this.f6923a.setRateTitleView(this.t, true);
    }

    public final void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9242b2c", new Object[]{this, str});
            return;
        }
        this.t.setText(str);
        this.t.setTextSize(1, 18.0f);
        this.t.setTextColor(this.e.getCurrentTextColor());
        this.f6923a.setRateTitleView(this.t, false);
    }

    public void h0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea5599a", new Object[]{this, map});
            return;
        }
        CollectBarViewHolder collectBarViewHolder = this.o;
        if (collectBarViewHolder != null) {
            collectBarViewHolder.n(map);
        }
    }

    public void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec590936", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void k0(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e66ccb", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        m mVar = new m(this, jSONObject);
        if (this.t == null) {
            this.t = new TextView(this.q);
        }
        if (!z || !mVar.e) {
            g0(mVar.d);
        } else {
            f0(mVar);
        }
        this.f6923a.setNaviBarState(true);
    }

    public final String l0(jos.e.a aVar) {
        CartBarViewHolder cartBarViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e54f0810", new Object[]{this, aVar});
        }
        String str = aVar.b;
        String str2 = "";
        if ("cart".equals(aVar.f22129a) && (cartBarViewHolder = this.n) != null) {
            int q = cartBarViewHolder.q();
            if (q > 99) {
                str2 = "99+";
            } else if (q > 0) {
                str2 = String.valueOf(q);
            }
        }
        return str + str2 + sqj.BUTTON_DESC;
    }

    public void m0(int i2, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732c090d", new Object[]{this, new Integer(i2), new Float(f2)});
            return;
        }
        if (i2 == 0 || f2 != 0.0f) {
            f3 = f2;
        } else {
            f3 = 1.0f;
        }
        if (f2 >= 0.3f) {
            i2++;
        }
        b0(Math.min(i2, 1));
        this.f6923a.setTransparencyLR(f3);
    }

    public void n0() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b913c7b", new Object[]{this});
        } else if (vbl.k1() && (publicMenu = this.s.getPublicMenu()) != null) {
            if (E == null) {
                E = new HashMap();
            }
            int hashCode = publicMenu.hashCode();
            if (((HashMap) E).get(Integer.valueOf(hashCode)) == null) {
                ((HashMap) E).put(Integer.valueOf(hashCode), 1);
                TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                builder.setId(9000005).setMessageMode(TBPublicMenuItem.MessageMode.TEXT).setMessage(this.q.getString(R.string.tt_detail_menu_taogold_alert)).setTitle(this.q.getString(R.string.tt_detail_menu_taogold_text)).setName(this.q.getString(R.string.tt_detail_menu_taogold_name));
                ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
                arrayList.add(builder.build());
                publicMenu.addExternalMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        } else if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == 9000005) {
                            q84.f(NavBarHolderV3.b(NavBarHolderV3.this), new rc7("openUrl", new JSONObject("https://pages-fast.m.taobao.com/wow/z/tmtjb/town/home?x-ssr=true&disableNav=YES&x-sec=wua&asac=2A21B017LSI0KGN210C6D7&forceThemis=true&status_bar_transparent=true&largescreenstyle=fullscreen&topIds=" + NavBarHolderV3.g(NavBarHolderV3.this) + "&hd_from=detailGlobalGuidance") { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3.4.1
                                public final /* synthetic */ String val$url;

                                {
                                    this.val$url = r2;
                                    put("url", (Object) r2);
                                }
                            }, new RuntimeAbilityParam[0]));
                        }
                    }
                });
            }
        }
    }

    public final void o(TaoDetailActionBarV3 taoDetailActionBarV3, jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffe0482", new Object[]{this, taoDetailActionBarV3, aVar});
        } else if (vbl.n()) {
            taoDetailActionBarV3.setComponentId4Fatigue(aVar.h);
            TTImageUrlView O = O(aVar);
            if (O != null) {
                O.setVisibility(8);
                View findViewWithTag = taoDetailActionBarV3.findViewWithTag(String.valueOf(5));
                if (findViewWithTag instanceof FrameLayout) {
                    ((FrameLayout) findViewWithTag).addView(O);
                }
            }
        }
    }

    public final View o0(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("50466f4c", new Object[]{this, aVar});
        }
        View L = L(aVar);
        if (!this.D) {
            this.D = true;
            G(aVar);
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.d)) {
            String str = aVar.d;
            if (!TextUtils.isEmpty(str) && L != null) {
                ViewProxy.setOnClickListener(L, new j(str));
            }
        }
        return L;
    }

    public final void p(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf59447", new Object[]{this, tBActionView});
            return;
        }
        TBPublicMenu publicMenu = this.s.getPublicMenu();
        if (publicMenu != null) {
            if (b5m.H().isI18nEdition()) {
                publicMenu.showMenuItem(R.id.uik_menu_report);
                publicMenu.setShareContentCallBack(null, false);
            }
            publicMenu.setCustomOverflow(tBActionView);
            if (publicMenu.getCustomMenu(9000004) == null) {
                TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                builder.setId(9000004).setTitle(this.q.getString(R.string.tt_detail_menu_share_text)).setUTControlName(this.q.getString(R.string.tt_detail_menu_share));
                ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
                arrayList.add(builder.build());
                publicMenu.addCustomMenus(arrayList, new f());
            }
        }
    }

    public void q(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ea4d23", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (this.f6923a != null && viewGroup != null) {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(this.f6923a, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    public final TIconFontTextView r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("e3e97a0", new Object[]{this});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.q);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(-16777216);
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.f6923a;
        if (taoDetailActionBarV3 != null) {
            taoDetailActionBarV3.getNavHeadHeight();
            tIconFontTextView.setTextSize(1, 21.0f);
        } else {
            tIconFontTextView.setTextSize(1, 18.0f);
        }
        return tIconFontTextView;
    }

    public final TTImageUrlView s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTImageUrlView) ipChange.ipc$dispatch("e7e639bf", new Object[]{this, str});
        }
        TTImageUrlView tTImageUrlView = new TTImageUrlView(this.q);
        mpe.m(tTImageUrlView, str);
        return tTImageUrlView;
    }

    public final void t(m mVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179453f6", new Object[]{this, mVar});
            return;
        }
        if (D()) {
            i2 = -1;
        } else {
            i2 = b0.DEFAULT_COLOR;
        }
        int length = mVar.f6931a.length();
        this.w = new SpannableString(mVar.f6931a);
        this.w.setSpan(new p3w(12, i2), 0, length, 33);
        y(mVar.b, true);
        y(mVar.c, false);
    }

    public void u(jos.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f0d796", new Object[]{this, eVar, jSONObject});
        } else if (eVar != null && !eVar.equals(this.b)) {
            this.b = eVar;
            B();
            TaoDetailActionBarV3 taoDetailActionBarV3 = this.f6923a;
            if (taoDetailActionBarV3 != null) {
                taoDetailActionBarV3.setTopAtmosphereBackground(jSONObject);
                this.f6923a.setIsNewNav(E());
            }
            v(this.f6923a, eVar, false);
        }
    }

    public View w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9da9ba24", new Object[]{this});
        }
        return this.f6923a.findViewById(R.id.tt_detail_cart_item);
    }

    public final HashMap<String, String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e74756a3", new Object[]{this});
        }
        return new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3.5
            {
                String str;
                if (NavBarHolderV3.h(NavBarHolderV3.this)) {
                    str = "3-4";
                } else {
                    str = "1-1";
                }
                put(hnn.KEY_VIDEO_TYPE, str);
            }
        };
    }

    public final void y(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b578af8f", new Object[]{this, str, new Boolean(z)});
        } else {
            s0m.B().T(str).succListener(new o(z)).failListener(new n(this)).fetch();
        }
    }

    public final void A(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3bc345", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(S()));
            if (z) {
                parseObject.put("style", (Object) "1");
            } else if (!TextUtils.isEmpty(str)) {
                parseObject.put("style", (Object) "0");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("arg1", (Object) "Navigation-Share");
            jSONObject.put("args", (Object) parseObject);
            q84.f(this.q, new rc7("user_track", jSONObject, new RuntimeAbilityParam[0]));
        } catch (Exception e2) {
            tgh.c("NavBarHolderV3", "queryCollect ctrlClicked mergeExposure", e2);
        }
        q84.f(this.q, new rc7("share", new JSONObject(), new RuntimeAbilityParam[0]));
        UserBehaviorTracker.l(this.q, UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR, UserBehaviorUtils.ACTION_NAVI_BAR_SHARE, null);
    }

    public final void G(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1361b7e2", new Object[]{this, aVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", (Object) "Page_Detail");
            jSONObject.put("eventId", (Object) 2201);
            JSONObject jSONObject2 = new JSONObject();
            if ("share".equals(aVar.f22129a)) {
                if (!TextUtils.isEmpty(aVar.g)) {
                    jSONObject2.put("style", (Object) "0");
                }
                jSONObject.put("arg1", (Object) "Page_Detail_Show-Navigation-Share");
            } else if ("cart".equals(aVar.f22129a)) {
                jSONObject.put("arg1", (Object) "Page_Detail_Show-ShoppingCart");
            } else if ("myFavorite".equals(aVar.f22129a)) {
                jSONObject.put("arg1", (Object) "Page_Detail_Show-Navigation-MyFavorite");
            }
            jSONObject.put("args", (Object) jSONObject2);
            q84.f(this.q, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
        } catch (Exception e2) {
            tgh.c("NavBarHolderV3", "Page_Detail_Show_Navigation error:" + aVar.f22129a, e2);
        }
    }

    public void b0(int i2) {
        List<String> list;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8121cc", new Object[]{this, new Integer(i2)});
            return;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.f6923a;
        if (taoDetailActionBarV3 != null) {
            taoDetailActionBarV3.onPageSelected(i2);
        }
        if (this.m != i2 && (list = this.l) != null && i2 < ((ArrayList) list).size()) {
            try {
                String str2 = (String) ((ArrayList) this.l).get(this.m);
                String str3 = (String) ((ArrayList) this.l).get(i2);
                if (i2 > this.m) {
                    str = "Page_Detail_Button_SlideLeft";
                } else {
                    str = "Page_Detail_Button_SlideRight";
                }
                this.m = i2;
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(T(str2, str3)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("arg1", (Object) str);
                jSONObject.put("args", (Object) parseObject);
                q84.f(this.q, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e2) {
                tgh.c("NavBarHolderV3", "mergeSlideExposure", e2);
            }
        }
    }

    public View z(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("33cac727", new Object[]{this, context, viewGroup});
        }
        if (context == null) {
            context = this.q;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = new TaoDetailActionBarV3(context);
        this.f6923a = taoDetailActionBarV3;
        taoDetailActionBarV3.setFullTransparentMode(this.g);
        this.f6923a.init();
        if (!this.h) {
            this.h = true;
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(S()));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", (Object) "Page_Detail");
                jSONObject.put("eventId", (Object) 2201);
                jSONObject.put("arg1", (Object) "Page_Detail_Show_Navigation");
                jSONObject.put("args", (Object) parseObject);
                q84.f(this.q, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e2) {
                tgh.c("NavBarHolderV3", "Page_Detail_Show_Navigation error", e2);
            }
        }
        return this.f6923a;
    }

    public final void i0(String str, List<String> list, String str2, String str3) {
        int i2;
        TextView textView;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad95a42d", new Object[]{this, str, list, str2, str3});
        } else if (this.d != null && E()) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.if_action_bar_search_text);
            if (!TextUtils.isEmpty(str) && (textView = (TextView) this.d.findViewById(R.id.if_action_bar_search_icon)) != null) {
                textView.setText(str);
                B = textView.getWidth();
                C = textView.getRight();
            }
            if (textView2 != null) {
                if (list != null) {
                    String str4 = " | ";
                    SpannableString spannableString = new SpannableString(str4);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    float width = (((this.d.getWidth() - B) - this.d.getPaddingLeft()) - this.d.getPaddingLeft()) - (textView2.getLeft() - C);
                    Paint paint = new Paint();
                    paint.setTextSize(textView2.getTextSize());
                    float measureText = paint.measureText("测试");
                    int i4 = 0;
                    while (i4 < list.size()) {
                        String str5 = list.get(i4);
                        spannableStringBuilder.append((CharSequence) str5);
                        float measureText2 = paint.measureText(str5 + str4);
                        if (measureText2 + measureText > width) {
                            break;
                        }
                        width -= measureText2;
                        if (i4 == list.size() - i3) {
                            str4 = str4;
                            i2 = 1;
                        } else {
                            str4 = str4;
                            spannableString.setSpan(new ForegroundColorSpan(855638016), 0, 3, 33);
                            spannableStringBuilder.append((CharSequence) spannableString);
                            i2 = 1;
                        }
                        i4 += i2;
                        i3 = 1;
                    }
                    textView2.setText(spannableStringBuilder);
                    textView2.setContentDescription(list.get(0) + "搜索文本栏");
                } else {
                    textView2.setContentDescription("搜索文本栏");
                }
            }
            this.j = str2;
            this.i = str3;
        }
    }

    public void v(TaoDetailActionBarV3 taoDetailActionBarV3, jos.e eVar, boolean z) {
        int i2;
        int i3 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4a4600", new Object[]{this, taoDetailActionBarV3, eVar, new Boolean(z)});
        } else if (taoDetailActionBarV3 != null && eVar != null) {
            taoDetailActionBarV3.addItemView(I(), 1);
            taoDetailActionBarV3.addNavTabsBar();
            if (eVar.f22128a != null && !z) {
                this.l = new ArrayList();
                jos.e.d dVar = eVar.f22128a;
                String str = dVar.f22132a;
                String str2 = dVar.b;
                if (!TextUtils.isEmpty(str2)) {
                    taoDetailActionBarV3.setExtraDetailTitleColor(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    ((ArrayList) this.l).add(str);
                    try {
                        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(S()));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("page", (Object) "Page_Detail");
                        jSONObject.put("eventId", (Object) 2201);
                        jSONObject.put("arg1", (Object) VesselViewHolder.UT_SHOW_ARG1);
                        jSONObject.put("args", (Object) parseObject);
                        q84.f(this.q, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
                    } catch (Exception e2) {
                        tgh.c("NavBarHolderV3", "mergeExposure error", e2);
                    }
                }
                String str3 = eVar.f22128a.c;
                if (!TextUtils.isEmpty(str3)) {
                    ((ArrayList) this.l).add(str3);
                    try {
                        JSONObject parseObject2 = JSON.parseObject(JSON.toJSONString(R()));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("page", (Object) "Page_Detail");
                        jSONObject2.put("eventId", (Object) 2201);
                        jSONObject2.put("arg1", (Object) "Page_Detail_Show_Content");
                        jSONObject2.put("args", (Object) parseObject2);
                        q84.f(this.q, new rc7("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
                    } catch (Exception e3) {
                        tgh.c("NavBarHolderV3", "mergeContentExposure error", e3);
                    }
                }
                Iterator it = ((ArrayList) this.l).iterator();
                while (it.hasNext()) {
                    taoDetailActionBarV3.addTabWithText((String) it.next(), this.k);
                }
                jos.e.d dVar2 = eVar.f22128a;
                String str4 = dVar2.d;
                String str5 = dVar2.e;
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                    taoDetailActionBarV3.addShopTab(str4, str5);
                }
                taoDetailActionBarV3.setTabNum(((ArrayList) this.l).size());
                taoDetailActionBarV3.setAnchorPoints(this.l);
            }
            taoDetailActionBarV3.addItemView(M(eVar.b), 3);
            TIconFontTextView N = N();
            this.e = N;
            taoDetailActionBarV3.addItemView(N, 4);
            taoDetailActionBarV3.setSearchIconContainerVisibility();
            Iterator<jos.e.a> it2 = eVar.c.iterator();
            while (it2.hasNext()) {
                jos.e.a next = it2.next();
                if (eVar.c.size() - 1 == eVar.c.indexOf(next)) {
                    i3 = 2;
                }
                if ("share".equals(next.f22129a)) {
                    taoDetailActionBarV3.addItemView(P(next), 5);
                    o(taoDetailActionBarV3, next);
                } else {
                    if ("cart".equals(next.f22129a)) {
                        View J = J(next);
                        J.setId(R.id.tt_detail_cart_item);
                        CartBarViewHolder cartBarViewHolder = this.n;
                        if (cartBarViewHolder != null) {
                            cartBarViewHolder.u(next);
                        }
                        if (!this.n.k(J, taoDetailActionBarV3, false, 0)) {
                            taoDetailActionBarV3.addItemView(J, 0);
                        }
                    } else if ("collect".equals(next.f22129a)) {
                        taoDetailActionBarV3.addItemView(K(next), 0);
                    } else if ("myFavorite".equals(next.f22129a)) {
                        taoDetailActionBarV3.addItemView(o0(next), 0);
                    }
                    i3 = 0;
                }
            }
            TBActionView tBActionView = (TBActionView) LayoutInflater.from(this.q).inflate(R.layout.tt_detail_action_bar_more_v3, (ViewGroup) null);
            tBActionView.setTitle(this.q.getString(R.string.tt_detail_menu_more_text));
            tBActionView.setMessageBackgroundColor(Color.parseColor("#ff5000"));
            tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
            taoDetailActionBarV3.addItemView(tBActionView, i3);
            p(tBActionView);
            n0();
            List<jos.d> list = this.r;
            if (list != null && !list.isEmpty()) {
                taoDetailActionBarV3.initElevatorView();
                if (b5m.H().isI18nEdition()) {
                    String str6 = "";
                    for (int i4 = 0; i4 < this.r.size(); i4++) {
                        jos.d dVar3 = this.r.get(i4);
                        if (dVar3 != null && !TextUtils.isEmpty(dVar3.b)) {
                            str6 = str6 + dVar3.b + ",";
                        }
                    }
                    TextView textView = new TextView(this.q);
                    textView.setTextSize(1, 14.0f);
                    textView.setText(str6);
                    textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i2 = ((owo.g(this.q) - textView.getMeasuredWidth()) / 2) / (this.r.size() + 1);
                    taoDetailActionBarV3.addElevatorPadding(i2);
                } else {
                    i2 = 0;
                }
                for (int i5 = 0; i5 < this.r.size(); i5++) {
                    jos.d dVar4 = this.r.get(i5);
                    if (dVar4 != null) {
                        String str7 = dVar4.b;
                        String str8 = dVar4.f22127a;
                        if (!TextUtils.isEmpty(str7)) {
                            taoDetailActionBarV3.addElevatorItem(str8, str7, i2);
                        }
                    }
                }
            }
            taoDetailActionBarV3.initialize();
        }
    }
}
