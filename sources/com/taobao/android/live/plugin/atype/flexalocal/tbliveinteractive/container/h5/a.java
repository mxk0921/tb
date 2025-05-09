package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolivecontainer.TBLiveH5Container;
import java.util.HashMap;
import java.util.Map;
import tb.brq;
import tb.f9f;
import tb.giv;
import tb.hij;
import tb.hw0;
import tb.jbu;
import tb.nkr;
import tb.qoa;
import tb.sjr;
import tb.t2o;
import tb.tws;
import tb.ukr;
import tb.uyg;
import tb.v2s;
import tb.xkc;
import tb.y7t;
import tb.zmr;
import tb.zvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a implements xkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zvg f8681a;
    public final nkr b;
    public final Context c;
    public Map<String, String> d;
    public String e;
    public ukr f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public Boolean k = null;

    static {
        t2o.a(295699880);
        t2o.a(295699868);
    }

    public a(Context context, Map<String, String> map, ukr ukrVar) {
        this.c = context;
        this.f = ukrVar;
        this.d = map;
        this.b = new nkr(context, "LiveRoomHalf", new qoa.k(ukrVar), new qoa.j(), new String[]{f9f.a()});
    }

    @Override // tb.xkc
    public zvg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvg) ipChange.ipc$dispatch("e3711b3e", new Object[]{this});
        }
        return this.f8681a;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains("TBLiveWeex")) {
            str = str.replace("TBLiveWeex", IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN);
        }
        if (this.b.f() != null) {
            WVStandardEventCenter.postNotificationToJS(this.b.f(), str, str2);
        }
        if (this.b.g() != null) {
            this.b.g().g(str, str2);
        }
        jbu.a("H5ContainerV2", "onMessageReceived:" + str + " eventData:" + str2);
    }

    public final FragmentManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("97410a9", new Object[]{this});
        }
        Context context = this.c;
        if (context instanceof FragmentActivity) {
            return ((FragmentActivity) context).getSupportFragmentManager();
        }
        return null;
    }

    public Uri e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("85d444ca", new Object[]{this});
        }
        String str = this.j;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11f51bae", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3affcbea", new Object[]{this, str});
            return;
        }
        String m = m(str);
        Boolean bool = this.k;
        if (bool == null || !bool.booleanValue()) {
            this.b.n(m);
        } else {
            this.b.w(m);
        }
        this.j = m;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1609a5ca", new Object[]{this, str});
            return;
        }
        this.e = m(str);
        Boolean bool = this.k;
        if (bool == null || !bool.booleanValue()) {
            this.b.k(str);
        } else {
            this.b.l(str);
        }
    }

    public void j(zvg zvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded8233e", new Object[]{this, zvgVar});
            return;
        }
        this.f8681a = zvgVar;
        nkr nkrVar = this.b;
        if (nkrVar != null) {
            nkrVar.u(this);
        }
    }

    public void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378ec129", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public final String m(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb19730f", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        if (parse != null && !parse.isOpaque()) {
            boolean c = brq.c(parse.getQueryParameter("tl-x-enablethemis"));
            if (tws.Z()) {
                z = c;
            } else if (c) {
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter(tws.a0(), tws.b0());
                str = buildUpon.build().toString();
            }
        }
        if (this.k == null) {
            this.k = Boolean.valueOf(z);
        }
        return str;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.h = false;
        this.g = true;
        this.j = null;
        nkr nkrVar = this.b;
        if (!(nkrVar == null || nkrVar.f() == null)) {
            TBLiveH5Container f = this.b.f();
            if (!f.isDestroied()) {
                f.destroy();
            }
            this.b.a();
        }
        nkr nkrVar2 = this.b;
        if (!(nkrVar2 == null || nkrVar2.g() == null)) {
            zmr g = this.b.g();
            if (!g.isDestroied()) {
                g.destroy();
            }
            this.b.a();
        }
        ukr ukrVar = this.f;
        if (ukrVar != null) {
            ukrVar.M(this);
            this.f = null;
        }
        if (giv.c().b()) {
            sjr.g().e(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.FALSE);
        } else {
            sjr.g().e(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, "H5ContainerV2");
            HashMap hashMap = new HashMap();
            hashMap.put("isMoveUp", "false");
            hashMap.put("scene", "H5ContainerV2");
            sjr.g().e(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
        }
        sjr.g().d(uyg.EVENT_H5_CONTAINER_DESTROY);
    }

    public void l() {
        int indexOf;
        Object orDefault;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        TaoLiveWebBottomFragment.d h = new TaoLiveWebBottomFragment.d().a(this.c).n(this.f.R()).c(this.b).h(this);
        if (this.d.containsKey("showLoading")) {
            try {
                h.t(Boolean.parseBoolean(this.d.get("showLoading")));
            } catch (Throwable unused) {
                v2s.o().A().c("H5ContainerV2", "tlHalfContainerShowLoading解析失败");
            }
        }
        if (this.d.containsKey("maxHeight")) {
            try {
                h.b(Float.parseFloat(this.d.get("maxHeight")));
            } catch (Throwable unused2) {
                y7t.a("H5ContainerV2", "parse height error, default height: 0.725f");
            }
        }
        if (this.d.containsKey("supportUpScrollPage")) {
            try {
                h.u(Boolean.parseBoolean(this.d.get("supportUpScrollPage")));
            } catch (Throwable unused3) {
                y7t.a("H5ContainerV2", "parse scroll page fail");
            }
        }
        if (this.d.containsKey("contentBackColor")) {
            h.j(this.d.get("contentBackColor"));
        }
        if (this.d.containsKey("backgroundColor")) {
            h.g(this.d.get("backgroundColor"));
        }
        if (this.d.containsKey("panEnable")) {
            try {
                boolean parseBoolean = Boolean.parseBoolean(this.d.get("panEnable"));
                h.d(parseBoolean);
                if (parseBoolean) {
                    orDefault = this.d.getOrDefault("panOffsetToClose", null);
                    String str = (String) orDefault;
                    if (str != null) {
                        h.r(Float.parseFloat(str));
                    }
                }
            } catch (Throwable unused4) {
                y7t.a("H5ContainerV2", "parse pan fail, default pan enable: true, pan offset to close: 0.2f");
            }
        }
        if (this.d.containsKey(hij.KEY_CORNER_RADIUS)) {
            try {
                h.l(Float.parseFloat(this.d.get(hij.KEY_CORNER_RADIUS)));
            } catch (Throwable unused5) {
                y7t.a("H5ContainerV2", "parse corner radius fail, default corner radius: 27f(dp)");
            }
        }
        if (this.d.containsKey("expandHeightPercent")) {
            try {
                h.m(Float.parseFloat(this.d.get("expandHeightPercent")));
            } catch (Throwable unused6) {
                y7t.a("H5ContainerV2", "parse expand height percent fail, default expand height percent: 0.9f");
            }
        }
        if (this.d.containsKey("hideScrollGuide")) {
            try {
                h.q(Boolean.parseBoolean(this.d.get("hideScrollGuide")));
            } catch (Throwable unused7) {
                y7t.a("H5ContainerV2", "parse hide scroll guide fail");
            }
        }
        if (this.d.containsKey("hideLiveCloseBtn")) {
            try {
                h.p(Boolean.parseBoolean(this.d.get("hideLiveCloseBtn")));
            } catch (Throwable unused8) {
                y7t.a("H5ContainerV2", "parse hide live close btn fail");
            }
        }
        if (this.d.containsKey("transparentTopMargin")) {
            try {
                h.v(Integer.parseInt(this.d.get("transparentTopMargin")));
            } catch (Throwable unused9) {
                y7t.a("H5ContainerV2", "parse transparent top margin fail");
            }
        }
        if (this.d.containsKey("usePlaceholderLoading")) {
            try {
                h.w(Boolean.parseBoolean(this.d.get("usePlaceholderLoading")));
            } catch (Throwable unused10) {
                y7t.a("H5ContainerV2", "parse use placeholder loading fail");
            }
        }
        TaoLiveWebBottomFragment e = h.build();
        this.h = true;
        FragmentManager d = d();
        if (d != null) {
            e.show(d, TaoLiveWebBottomFragment.u3());
        }
        if (giv.c().b()) {
            sjr.g().e(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.TRUE);
            return;
        }
        sjr.g().e(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE, "H5ContainerV2");
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "H5ContainerV2");
        hashMap.put("isMoveUp", "true");
        hashMap.put("containerHeight", String.valueOf((int) (h.f() * hw0.f())));
        String str2 = this.e;
        if (!(str2 == null || (indexOf = str2.indexOf(63)) == -1)) {
            hashMap.put("h5Url", this.e.substring(0, indexOf));
        }
        sjr.g().e(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
    }
}
