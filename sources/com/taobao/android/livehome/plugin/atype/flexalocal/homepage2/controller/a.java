package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.live.home.dinamic.widget.DXTBLNativeTextView;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b0h;
import tb.fkx;
import tb.lrq;
import tb.lws;
import tb.nvs;
import tb.p9m;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.t2o;
import tb.xak;
import tb.xkq;
import tb.xut;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b0h f8812a;
    public final ImageView b;
    public final XTabLayout d;
    public final int e;
    public final int f;
    public final int g;
    public final Context h;
    public final List<TabManager.TabUp> i;
    public boolean k;
    public View l;
    public View m;
    public View n;
    public int o;
    public boolean p;
    public final Handler q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean c = true;
    public int j = 0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class View$OnClickListenerC0456a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0456a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            qyg.c().d("com.taobao.taolive.mix.follow.action");
            if (a.a(a.this) == null || TextUtils.isEmpty(a.a(a.this).i)) {
                str = null;
            } else {
                str = a.a(a.this).i + ".topbar.followicon";
            }
            p9m.c("FollowIcon", a.b(a.this, str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8814a;

        public b(View view) {
            this.f8814a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f8814a != null) {
                a.c(a.this, false);
                this.f8814a.setVisibility(8);
            }
        }
    }

    static {
        t2o.a(310378631);
    }

    public a(View view, Context context, XTabLayout xTabLayout, List<TabManager.TabUp> list, b0h b0hVar) {
        this.f8812a = b0hVar;
        this.b = (ImageView) view.findViewById(R.id.homepage2_back);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.homepage_new_search_bar);
        this.h = context;
        this.i = list;
        this.d = xTabLayout;
        if (context != null) {
            this.g = context.getResources().getColor(R.color.homepage2024_tab_text_color);
            this.e = context.getResources().getColor(R.color.homepage2024_tab_text_color_b_unselected);
            this.f = context.getResources().getColor(R.color.homepage2024_tab_text_color_b_selected);
        }
        this.q = new Handler(this);
    }

    public static /* synthetic */ b0h a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("2cc4930e", new Object[]{aVar});
        }
        return aVar.f8812a;
    }

    public static /* synthetic */ Map b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2368cc07", new Object[]{aVar, str});
        }
        return aVar.k(str);
    }

    public static /* synthetic */ boolean c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a600553", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.p = z;
        return z;
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8eccf9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        z(z);
    }

    public void B(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8c31aa", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.m != null && this.n != null) {
            int i3 = (int) (i2 * 1.0d);
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) >= i) {
                return;
            }
            if (this.m.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i3;
                }
                this.m.setLayoutParams(marginLayoutParams);
                this.m.requestLayout();
            } else if (this.n.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = i3;
                }
                this.n.setLayoutParams(marginLayoutParams2);
                this.n.requestLayout();
            }
        }
    }

    public void C(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff5d22b", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.l != null && this.n != null && this.m != null) {
            int i3 = (int) (i2 * 1.0d);
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) <= i) {
                if (this.m.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = -i3;
                    }
                    this.m.setLayoutParams(marginLayoutParams);
                    this.m.requestLayout();
                } else if (this.n.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = -i3;
                    }
                    this.n.setLayoutParams(marginLayoutParams2);
                    this.n.requestLayout();
                }
                if ((z || nvs.P()) && this.o != i3) {
                    this.o = i3;
                    float f = i3 / 100.0f;
                    if (f <= 0.0f && this.l.getAlpha() != 0.0f) {
                        this.l.setAlpha(0.0f);
                        if (this.r) {
                            A(false);
                        }
                    }
                    if (f >= 1.0f && this.l.getAlpha() != 1.0f) {
                        this.l.setAlpha(1.0f);
                        A(true);
                    }
                    if (f > 0.0f && f < 1.0f) {
                        this.l.setAlpha(f);
                    }
                    this.l.invalidate();
                }
            }
        }
    }

    public final void d(boolean z) {
        List<TabManager.TabUp> list;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6571c97a", new Object[]{this, new Boolean(z)});
        } else if (this.d != null && (list = this.i) != null && list.size() > 0) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                XTabLayout.g tabAt = this.d.getTabAt(i2);
                if (!(tabAt == null || tabAt.r() == null)) {
                    if (tabAt.s()) {
                        if (z) {
                            i = this.f;
                        } else {
                            i = this.g;
                        }
                    } else if (z) {
                        i = this.e;
                    } else {
                        i = this.g;
                    }
                    View customView = tabAt.r().getCustomView();
                    if (customView != null) {
                        TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
                        DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
                        if (textView != null && textView.getVisibility() == 0) {
                            textView.setTextColor(i);
                            textView.invalidate();
                        }
                        if (dXTBLNativeTextView != null && dXTBLNativeTextView.getVisibility() == 0) {
                            dXTBLNativeTextView.setTextColor(i);
                            dXTBLNativeTextView.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c26d9ee", new Object[]{this, str});
            return;
        }
        Map<String, String> k = k("a2141.8001240.topbar.FollowTabCorner");
        if (k == null) {
            k = new HashMap<>();
        }
        k.put("x_recReason", str);
        p9m.c("FollowTabCorner", k("a2141.8001240.topbar.FollowTabCorner"));
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2213ceb9", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("888e31c4", new Object[]{this});
        }
        return this.l;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    public int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc67eb2c", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.i.size(); i++) {
            TabManager.TabUp tabUp = this.i.get(i);
            if (!lrq.a(tabUp.channelType) && tabUp.channelType.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408409a1", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final Map<String, String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43de2332", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        b0h b0hVar = this.f8812a;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.f8812a.g);
        }
        return hashMap;
    }

    public void l(XTabLayout.g gVar) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a523b6", new Object[]{this, gVar});
        } else if (gVar != null && gVar.r() != null) {
            View customView = gVar.r().getCustomView();
            if (!(customView == null || (findViewById = customView.findViewById(R.id.badge_view)) == null)) {
                findViewById.setVisibility(8);
            }
            this.p = false;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11627f84", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152f6d8", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void p(XTabLayout.g gVar) {
        List<TabManager.TabUp> list;
        TabManager.TabUp tabUp;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb34465e", new Object[]{this, gVar});
        } else if (gVar != null && gVar.r() != null && gVar.r().getCustomView() != null && (list = this.i) != null && list.size() > 0 && gVar.o() < this.i.size() && (tabUp = this.i.get(gVar.o())) != null && "singleLiveTab".equals(tabUp.channelType)) {
            qyg.c().d("com.taobao.taolive.mix.present.avatarpage.action");
            b0h b0hVar = this.f8812a;
            if (b0hVar == null || TextUtils.isEmpty(b0hVar.i)) {
                str = null;
            } else {
                str = this.f8812a.i + ".topbar.liveavatar";
            }
            p9m.c("Liveavatar", k(str));
        }
    }

    public final void s(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e2b919", new Object[]{this, view, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.k = z;
        if (view == null) {
            return;
        }
        if (z || !z2) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c365b8", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da0d9ae", new Object[]{this, view});
        } else if (view != null) {
            this.m = view.findViewById(R.id.live_top_atmosphere_layout);
            this.n = view.findViewById(R.id.live_top_background);
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b17ee4d", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void w(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc84c13", new Object[]{this, tUrlImageView});
        } else {
            this.l = tUrlImageView;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8909e1b7", new Object[]{this, str});
            return;
        }
        Map<String, String> k = k("a2141.8001240.topbar.FollowTabCorner");
        if (k == null) {
            k = new HashMap<>();
        }
        k.put("x_recReason", str);
        p9m.g("Page_Taobaolive_Show-FollowTabCorner", k("a2141.8001240.topbar.FollowTabCorner"));
    }

    public View f(int i) {
        List<TabManager.TabUp> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("77898572", new Object[]{this, new Integer(i)});
        }
        if (this.h == null || (list = this.i) == null || list.size() == 0 || i < 0 || i >= this.i.size()) {
            return null;
        }
        View inflate = LayoutInflater.from(this.h).inflate(R.layout.xtab_extend_layout_flexalocal, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tabitem_text);
        DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) inflate.findViewById(R.id.tabitem_longtext);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tabitem_left);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tabitem_right);
        TabManager.TabUp tabUp = this.i.get(i);
        if (tabUp != null) {
            String str = this.i.get(i).name;
            String str2 = tabUp.channelType;
            str2.hashCode();
            if (!str2.equals("singleLiveTab")) {
                textView.setText(str);
                textView.setVisibility(0);
                tUrlImageView.setVisibility(8);
                textView2.setVisibility(8);
                dXTBLNativeTextView.setVisibility(8);
                if (!TextUtils.isEmpty(str)) {
                    Paint paint = new Paint();
                    paint.setTextSize(qw0.d(this.h, 18.0f));
                    paint.setTypeface(Typeface.DEFAULT_BOLD);
                    this.j += Math.round(paint.measureText(str) + qw0.d(this.h, 18.0f));
                }
            } else {
                textView2.setOnClickListener(new View$OnClickListenerC0456a());
                JSONObject jSONObject = tabUp.tabMiddle;
                if (jSONObject != null) {
                    String string = jSONObject.getString("title");
                    String string2 = tabUp.tabMiddle.getString("iconUrl");
                    if (TextUtils.isEmpty(string)) {
                        string = "直播间";
                    }
                    dXTBLNativeTextView.setText(string);
                    dXTBLNativeTextView.setTextGradient(true);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = "https://gw.alicdn.com/imgextra/i1/O1CN01LdOw4E25qJtLv2hbK_!!6000000007577-2-tps-84-84.png";
                    }
                    tUrlImageView.setImageUrl(string2);
                }
                tUrlImageView.setVisibility(0);
                textView2.setVisibility(8);
                textView.setVisibility(8);
                dXTBLNativeTextView.setVisibility(0);
            }
        }
        return inflate;
    }

    public void q(XTabLayout.g gVar) {
        View customView;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2476ef4b", new Object[]{this, gVar});
        } else if (gVar != null && gVar.r() != null && (customView = gVar.r().getCustomView()) != null) {
            TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
            DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (TabManager.q().i() != null && TabManager.q().i().size() > 0 && TabManager.q().i().get(0) != null && TabManager.q().i().get(0).topTab != null && TabManager.q().i().get(0).topTab.size() > 0) {
                TabManager.TabUp tabUp = TabManager.q().i().get(0).topTab.get(gVar.o());
                if (tabUp != null && "singleLiveTab".equals(tabUp.channelType)) {
                    if (dXTBLNativeTextView != null) {
                        dXTBLNativeTextView.setTypeface(Typeface.defaultFromStyle(1));
                        dXTBLNativeTextView.setAutoMarquee(true);
                        dXTBLNativeTextView.startLongTextMarquee();
                        dXTBLNativeTextView.setTextGradient(false);
                        dXTBLNativeTextView.setMarqueeRepeatLimit(1);
                    }
                    s((TextView) customView.findViewById(R.id.tabitem_right), this.k, true);
                } else if (tabUp != null && "followTab".equals(tabUp.channelType) && this.p && (jSONObject = tabUp.sjsdParam) != null) {
                    if (!"followLiveNum".equals(jSONObject.getString("recReason"))) {
                        String a2 = lws.a("taoliveFollowIconSjsdParam");
                        JSONArray b2 = !TextUtils.isEmpty(a2) ? fkx.b(a2) : null;
                        if (b2 == null) {
                            b2 = new JSONArray();
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < b2.size(); i++) {
                            JSONObject jSONObject2 = b2.getJSONObject(i);
                            if (xut.b(jSONObject2.getLongValue("cacheTime"))) {
                                jSONArray.add(jSONObject2);
                            }
                        }
                        tabUp.sjsdParam.put("cacheTime", (Object) Long.valueOf(System.currentTimeMillis()));
                        jSONArray.add(tabUp.sjsdParam);
                        lws.c("taoliveFollowIconSjsdParam", jSONArray.toJSONString());
                    }
                    if (this.p) {
                        e(tabUp.sjsdParam.getString("recReason"));
                    }
                }
            }
        }
    }

    public void r(XTabLayout.g gVar) {
        View customView;
        TabManager.TabUp tabUp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a3db44", new Object[]{this, gVar});
        } else if (gVar != null && gVar.r() != null && (customView = gVar.r().getCustomView()) != null) {
            TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
            DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            List<TabManager.TabUp> list = this.i;
            if (list != null && list.size() > 0 && (tabUp = this.i.get(gVar.o())) != null && "singleLiveTab".equals(tabUp.channelType)) {
                if (dXTBLNativeTextView != null) {
                    dXTBLNativeTextView.setTypeface(Typeface.defaultFromStyle(0));
                    dXTBLNativeTextView.setTextGradient(true);
                    dXTBLNativeTextView.cancelLongTextMarquee();
                }
                TextView textView2 = (TextView) customView.findViewById(R.id.tabitem_right);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852d7fe", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            this.t = z;
            if (z) {
                d(true);
                xkq.d((Activity) this.h, z, R.color.homepage_transparent);
                ImageView imageView = this.b;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.live_back_b_flexalocal);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.b;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.live_back_flexalocal);
            }
            d(false);
            xkq.e((Activity) this.h);
        } catch (Throwable th) {
            r0h.c("SelectedTopColorCtrl", "switch color exp.", th);
        }
    }

    public void y(TabManager.TabUp tabUp) {
        XTabLayout.g tabAt;
        View customView;
        View findViewById;
        TextView textView;
        long j;
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d47799", new Object[]{this, tabUp});
        } else if (this.d != null) {
            String str = tabUp.channelType;
            JSONObject jSONObject = tabUp.subscript;
            if (!lrq.a(str) && jSONObject != null && jSONObject.getBoolean("isOpen").booleanValue() && i("followTab") >= 0 && (tabAt = this.d.getTabAt(0)) != null && tabAt.r() != null && tabAt.r().getCustomView() != null && (findViewById = (customView = tabAt.r().getCustomView()).findViewById(R.id.badge_view)) != null) {
                TUrlImageView tUrlImageView = (TUrlImageView) customView.findViewById(R.id.badge_img);
                TextView textView2 = (TextView) customView.findViewById(R.id.badge_text);
                TextView textView3 = (TextView) customView.findViewById(R.id.badge_point);
                boolean booleanValue = jSONObject.getBoolean(UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT).booleanValue();
                boolean booleanValue2 = jSONObject.getBoolean("animation").booleanValue();
                String string = jSONObject.getString("backgroundPicUrl");
                String string2 = jSONObject.getString("title");
                long b2 = xak.b(jSONObject.getString("disappearTime"));
                boolean equals = "followLiveNum".equals(jSONObject.getString("recReason"));
                float a2 = xak.a(jSONObject.getString("timeInterval"));
                if (a2 > 0.0f) {
                    textView = textView3;
                    j = a2 * 60.0f * 60.0f * 1000.0f;
                } else {
                    textView = textView3;
                    j = 0;
                }
                long b3 = xak.b(lws.a("taoliveFollowIconSjsdShowTime"));
                if (b3 <= 0 || j <= 0 || System.currentTimeMillis() > b3 + j) {
                    if (!lrq.a(string)) {
                        findViewById.setVisibility(0);
                        tUrlImageView.setVisibility(0);
                        textView2.setVisibility(8);
                        textView.setVisibility(8);
                        tUrlImageView.setImageUrl(string);
                        if (booleanValue2) {
                            tUrlImageView.setSkipAutoSize(true);
                        }
                    } else if (booleanValue) {
                        findViewById.setVisibility(0);
                        textView.setVisibility(0);
                        tUrlImageView.setVisibility(8);
                        textView2.setVisibility(8);
                    } else if (!lrq.a(string2)) {
                        if (equals && TextUtils.isDigitsOnly(string2)) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.rightMargin += qw0.d(this.h, 11.0f);
                            }
                            textView2.setLayoutParams(layoutParams);
                        }
                        findViewById.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        tUrlImageView.setVisibility(8);
                        textView2.setText(string2);
                    }
                    if (b2 > 0 && (handler = this.q) != null) {
                        handler.postDelayed(new b(findViewById), b2 * 1000);
                    }
                    lws.c("taoliveFollowIconSjsdShowTime", System.currentTimeMillis() + "");
                    this.p = true;
                    x(jSONObject.getString("recReason"));
                }
            }
        }
    }
}
