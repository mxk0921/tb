package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.family.FamilyMtopClient;
import com.taobao.family.globalbubble.GlobalBlackOrWhiteList;
import com.taobao.family.globalbubble.GlobalBubbleModule;
import com.taobao.family.globalbubble.GlobalWindowFactory;
import com.taobao.family.globalbubble.RectBean;
import com.taobao.family.globalbubble.affection.DetailAffectionBean;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAMILY_TAG = "FamilyBubble";
    public static final String ORANGE_GROUP_BUBBLE = "im_global_bubble";
    public static final String ORANGE_KEY_BUBBLE_GUIDE = "guideText";
    public GlobalBlackOrWhiteList b;
    public String c;
    public WeakReference<Activity> e;
    public vba h;
    public JSONObject l;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, dac> f31982a = new ConcurrentHashMap<>();
    public String d = "com.taobao.tao.homepage.MainActivity3";
    public List<RectBean> f = null;
    public boolean g = true;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Nav.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(yca ycaVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (str.equals(yca.ORANGE_GROUP_BUBBLE)) {
                yca.a(yca.this, OrangeConfig.getInstance().getConfig(yca.ORANGE_GROUP_BUBBLE, "showGlobalBubble", "").equals("1"));
                yca ycaVar = yca.this;
                OrangeConfig.getInstance().getConfig(yca.ORANGE_GROUP_BUBBLE, "globalBubbleWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/global_bubble.html?wh_ttid=native");
                ycaVar.getClass();
                yca.b(yca.this, (GlobalBlackOrWhiteList) JSON.parseObject(OrangeConfig.getInstance().getConfig(yca.ORANGE_GROUP_BUBBLE, "globalBubbleBlackJson", ""), GlobalBlackOrWhiteList.class));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends vba {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble/GlobalWindowManager$3");
        }

        @Override // tb.vba
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c111299f", new Object[]{this, new Integer(i)});
                return;
            }
            yca ycaVar = yca.this;
            if (yca.d(ycaVar, ycaVar.d, yca.c(ycaVar))) {
                yca.f(yca.this);
            }
        }

        @Override // tb.vba
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265bdffa", new Object[]{this, new Integer(i)});
                return;
            }
            yca ycaVar = yca.this;
            if (yca.d(ycaVar, ycaVar.d, yca.c(ycaVar))) {
                yca.e(yca.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.h6j
        public void a(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                yca.this.l = JSON.parseObject(jSONObject.toString());
                dac dacVar = (dac) yca.g(yca.this).get(GlobalWindowFactory.WINDOW_SHAREBACK);
                if (dacVar != null) {
                    dacVar.a(GlobalWindowFactory.EVENT_SHARE_BACK_POP, yca.this.l);
                }
            }
        }

        @Override // tb.h6j
        public void b(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fe84e", new Object[]{this, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yca f31985a = new yca();

        public static /* synthetic */ yca a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yca) ipChange.ipc$dispatch("859297bc", new Object[0]);
            }
            return f31985a;
        }
    }

    public static /* synthetic */ boolean a(yca ycaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97e70f41", new Object[]{ycaVar, new Boolean(z)})).booleanValue();
        }
        ycaVar.j = z;
        return z;
    }

    public static /* synthetic */ GlobalBlackOrWhiteList b(yca ycaVar, GlobalBlackOrWhiteList globalBlackOrWhiteList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalBlackOrWhiteList) ipChange.ipc$dispatch("d5a5789a", new Object[]{ycaVar, globalBlackOrWhiteList});
        }
        ycaVar.b = globalBlackOrWhiteList;
        return globalBlackOrWhiteList;
    }

    public static /* synthetic */ String c(yca ycaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5e0c789", new Object[]{ycaVar});
        }
        return ycaVar.c;
    }

    public static /* synthetic */ boolean d(yca ycaVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12697fd0", new Object[]{ycaVar, str, str2})).booleanValue();
        }
        return ycaVar.j(str, str2);
    }

    public static /* synthetic */ void e(yca ycaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961c0e7b", new Object[]{ycaVar, new Boolean(z)});
        } else {
            ycaVar.q(z);
        }
    }

    public static /* synthetic */ void f(yca ycaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37ce03a", new Object[]{ycaVar});
        } else {
            ycaVar.C();
        }
    }

    public static /* synthetic */ ConcurrentHashMap g(yca ycaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("285cee8b", new Object[]{ycaVar});
        }
        return ycaVar.f31982a;
    }

    public static yca p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yca) ipChange.ipc$dispatch("333e1e41", new Object[0]);
        }
        return e.a();
    }

    public synchronized void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de942c4", new Object[]{this, str});
            return;
        }
        if (!this.i) {
            this.i = true;
            s();
        }
        if (this.f31982a.get(str) == null) {
            dac a2 = GlobalWindowFactory.a(str, j(this.d, this.c), 1);
            if (a2 != null) {
                this.f31982a.put(str, a2);
            }
            Log.e("FamilyBubble", "bubbleCreated:" + str);
        }
    }

    public final void B(dac dacVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c20bce", new Object[]{this, dacVar, new Boolean(z)});
        } else if (dacVar instanceof ch0) {
            ((dv1) dacVar).D(false);
        } else if (dacVar instanceof zhp) {
            ((dv1) dacVar).D(z);
        }
    }

    public final synchronized void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584240fb", new Object[]{this});
        } else if (!this.k) {
            for (dac dacVar : this.f31982a.values()) {
                dacVar.c();
                dacVar.d(true);
            }
        }
    }

    public void h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc249fb", new Object[]{this, intent});
        } else if (!this.g && intent != null && intent.getData() != null && Localization.p()) {
            String uri = intent.getData().toString();
            this.c = uri;
            if (l(uri)) {
                C();
            } else {
                q(true);
            }
        }
    }

    public final void i(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2766f85", new Object[]{this, str, str2});
        } else if (str == null) {
        } else {
            if (!str.equals("com.taobao.tao.detail.activity.DetailActivity") && !str.equals("com.taobao.android.detail.wrapper.activity.DetailActivity")) {
                return;
            }
            if (str2 == null || str2.contains("tbSocialPopKey")) {
                try {
                    str3 = Uri.parse(str2).getQueryParameter("tbSocialPopKey");
                } catch (Throwable unused) {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3) && Login.checkSessionValid()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tbSocialPopKey", str3);
                    hashMap.put("tbSocialPopParam", str2);
                    FamilyMtopClient.f10509a.a(FamilyMtopClient.API_NAME_SHARE_POP_CHECK, hashMap, new d());
                }
            }
        }
    }

    public final boolean j(String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11737df3", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null) {
            return this.j;
        }
        if (str.equals("com.taobao.weex.WXActivity") || str.equals("com.taobao.browser.BrowserActivity")) {
            this.g = false;
            z = l(str2);
        } else {
            this.g = true;
            z = k(str);
        }
        if (!Localization.p()) {
            return false;
        }
        if (!z || !bwr.h().i() || !b09.c.b) {
            return z;
        }
        return false;
    }

    public final boolean k(String str) {
        GlobalBlackOrWhiteList globalBlackOrWhiteList;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306505c3", new Object[]{this, str})).booleanValue();
        }
        if (!(str == null || (globalBlackOrWhiteList = this.b) == null || (list = globalBlackOrWhiteList.activity) == null || list.size() <= 0)) {
            "checkValidPageName:".concat(str);
            for (String str2 : this.b.activity) {
                if (str.contains(str2)) {
                    for (dac dacVar : this.f31982a.values()) {
                        dacVar.f(false);
                    }
                    return false;
                }
            }
        }
        return this.j;
    }

    public final boolean l(String str) {
        GlobalBlackOrWhiteList globalBlackOrWhiteList;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf545d8d", new Object[]{this, str})).booleanValue();
        }
        try {
            if (str != null) {
                try {
                    try {
                        str = URLDecoder.decode(str, "UTF-8");
                    } catch (IllegalArgumentException e2) {
                        y7t.a("FamilyBubble", e2.toString());
                    }
                } catch (IllegalArgumentException unused) {
                    str = URLDecoder.decode(str.replaceAll(f7l.MOD, "%25"), "UTF-8");
                }
            }
        } catch (UnsupportedEncodingException e3) {
            y7t.a("FamilyBubble", e3.toString());
        }
        if (!(str == null || (globalBlackOrWhiteList = this.b) == null || (list = globalBlackOrWhiteList.url) == null || list.size() <= 0)) {
            new StringBuilder("checkValidUri:").append(this.c);
            for (String str2 : this.b.url) {
                if (str.contains(str2)) {
                    for (dac dacVar : this.f31982a.values()) {
                        dacVar.f(false);
                    }
                    return false;
                }
            }
        }
        return this.j;
    }

    public synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        q(true);
        this.k = true;
    }

    public WeakReference<Activity> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("980dc296", new Object[]{this});
        }
        return this.e;
    }

    public final synchronized void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9b6be", new Object[]{this, new Boolean(z)});
        } else if (!this.k) {
            for (dac dacVar : this.f31982a.values()) {
                B(dacVar, z);
                dacVar.d(false);
            }
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72bdce3", new Object[]{this, str});
        } else {
            B(this.f31982a.get(str), true);
        }
    }

    public boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("724a6cc8", new Object[]{this, str})).booleanValue();
        }
        dac dacVar = this.f31982a.get(str);
        if (dacVar != null) {
            return dacVar.isShowing();
        }
        return false;
    }

    public void u(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1988e8b4", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            this.e = new WeakReference<>(activity);
            this.d = activity.getComponentName().getShortClassName();
            if (!(activity.getIntent() == null || activity.getIntent().getData() == null)) {
                this.c = activity.getIntent().getData().toString();
            }
            vba vbaVar = this.h;
            if (vbaVar != null) {
                vbaVar.f();
                if (j(this.d, this.c)) {
                    this.h.d(this.e.get());
                }
            }
        }
        for (dac dacVar : this.f31982a.values()) {
            if (dacVar.getType() == 1) {
                B(dacVar, true);
            }
            dacVar.b(activity);
        }
        if (j(this.d, this.c)) {
            i(this.d, this.c);
            C();
            return;
        }
        q(true);
    }

    public void v(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef20bc9", new Object[]{this, activity});
            return;
        }
        String str = this.c;
        if (str != null && str.startsWith(zhp.QUICK_CHAT_URL)) {
            dac dacVar = this.f31982a.get(GlobalWindowFactory.WINDOW_SHAREBACK);
            if (dacVar instanceof dv1) {
                ((dv1) dacVar).E(zhp.GB_IMQUICK_CHAT_DISMISSED, new HashMap<>());
            }
        }
    }

    public void w(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac7e64a", new Object[]{this, activity});
            return;
        }
        dac dacVar = this.f31982a.get(GlobalWindowFactory.WINDOW_SHAREBACK);
        if (dacVar != null) {
            dacVar.e("foreground");
        }
        if (activity != null) {
            this.e = new WeakReference<>(activity);
            for (dac dacVar2 : this.f31982a.values()) {
                dacVar2.b(activity);
            }
        }
        if (j(this.d, this.c)) {
            C();
        }
    }

    public void y(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f035c69", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        for (dac dacVar : this.f31982a.values()) {
            HashMap hashMap = new HashMap();
            hashMap.put("userId", Long.valueOf(j));
            hashMap.put("msgCount", Integer.valueOf(i));
            dacVar.a(GlobalWindowFactory.EVENT_AMP_CONVERSATION, hashMap);
        }
    }

    public synchronized void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d975d1", new Object[]{this});
        } else {
            this.k = false;
        }
    }

    public HashMap<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("126650d2", new Object[]{this});
        }
        String str = this.d;
        if (str != null && (str.equals("com.taobao.tao.detail.activity.DetailActivity") || this.d.equals("com.taobao.android.detail.wrapper.activity.DetailActivity"))) {
            String string = this.e.get().getSharedPreferences("TB_Detail", 0).getString(wj4.SP_KEY_AFFECTION_DETAIL, "");
            if (!TextUtils.isEmpty(string)) {
                DetailAffectionBean detailAffectionBean = (DetailAffectionBean) JSON.parseObject(string, DetailAffectionBean.class);
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("title", detailAffectionBean.title);
                hashMap.put("shop", detailAffectionBean.shop);
                hashMap.put("price", detailAffectionBean.price);
                hashMap.put("pic", detailAffectionBean.pic);
                hashMap.put("itemid", detailAffectionBean.itemid);
                hashMap.put("url", detailAffectionBean.url);
                return hashMap;
            }
        }
        return null;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Nav.registerPreprocessor(new a(this));
        this.j = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "showGlobalBubble", "0").equals("1");
        OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "globalBubbleWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/global_bubble.html?wh_ttid=native");
        this.b = (GlobalBlackOrWhiteList) JSON.parseObject(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_BUBBLE, "globalBubbleBlackJson", ""), GlobalBlackOrWhiteList.class);
        j8l.C(new String[]{ORANGE_GROUP_BUBBLE}, new b());
        try {
            WXSDKEngine.registerModule("global-bubble", GlobalBubbleModule.class, false);
        } catch (WXException e2) {
            e2.printStackTrace();
        }
        this.h = new c();
    }

    public void x(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783dd46c", new Object[]{this, activity});
            return;
        }
        dac dacVar = this.f31982a.get(GlobalWindowFactory.WINDOW_SHAREBACK);
        if (dacVar != null) {
            dacVar.e("background");
        }
        q(true);
    }
}
