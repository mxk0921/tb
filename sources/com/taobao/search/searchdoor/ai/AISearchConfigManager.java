package com.taobao.search.searchdoor.ai;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.searchdoor.ai.AISearchConfigManager;
import com.taobao.taobao.R;
import java.util.Map;
import tb.ckf;
import tb.h9o;
import tb.o4p;
import tb.obk;
import tb.q3;
import tb.t2o;
import tb.v4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AISearchConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AISearchConfigManager INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11632a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static final q3 g = new q3(true, false, true, true, true, true, true, h9o.d(R.string.tbsearch_ai_input_hint, new Object[0]));
    public static q3 h;
    public static boolean i;

    public static final void o(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d991d56c", new Object[]{str, map});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.bz1
                @Override // java.lang.Runnable
                public final void run() {
                    AISearchConfigManager.u();
                }
            });
        }
    }

    public static final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9804bdaa", new Object[0]);
        } else {
            i = true;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebfbf65e", new Object[]{this})).booleanValue();
        }
        return h.b();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("944a286c", new Object[]{this})).booleanValue();
        }
        return h.a();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("438e7050", new Object[]{this})).booleanValue();
        }
        return f11632a;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("638686c5", new Object[]{this})).booleanValue();
        }
        return c;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de94b977", new Object[]{this})).booleanValue();
        }
        return d;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5348e091", new Object[]{this})).booleanValue();
        }
        return h.e();
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1f37fde", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2cfd0", new Object[]{this, new Boolean(z)});
            return;
        }
        f11632a = z;
        v4p.h("deepThinkSwitch", String.valueOf(z));
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f02802", new Object[]{this, new Boolean(z)});
            return;
        }
        b = z;
        v4p.h("ragSwitch", String.valueOf(z));
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffafb700", new Object[]{this, new Boolean(z)});
            return;
        }
        String userId = Login.getUserId();
        if (!TextUtils.isEmpty(userId)) {
            v4p.h(userId + "entranceSwitch", String.valueOf(z));
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e5551b", new Object[]{this})).booleanValue();
        }
        return h.f();
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28ff42bc", new Object[]{this});
        }
        return h.h();
    }

    public final q3 r() {
        boolean d2;
        boolean e2;
        boolean c2;
        boolean g2;
        boolean a2;
        boolean b2;
        boolean f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3) ipChange.ipc$dispatch("b5f3f048", new Object[]{this});
        }
        String f3 = o4p.f();
        if (TextUtils.isEmpty(f3)) {
            return g;
        }
        try {
            JSONObject parseObject = JSON.parseObject(f3);
            Boolean bool = parseObject.getBoolean("hideThink");
            if (bool != null) {
                d2 = bool.booleanValue();
            } else {
                d2 = g.d();
            }
            Boolean bool2 = parseObject.getBoolean("hideVoice");
            if (bool2 != null) {
                e2 = bool2.booleanValue();
            } else {
                e2 = g.e();
            }
            Boolean bool3 = parseObject.getBoolean("hideRag");
            if (bool3 != null) {
                c2 = bool3.booleanValue();
            } else {
                c2 = g.c();
            }
            Boolean bool4 = parseObject.getBoolean("hideUserInfo");
            if (bool4 != null) {
                g2 = bool4.booleanValue();
            } else {
                g2 = g.g();
            }
            Boolean bool5 = parseObject.getBoolean("defaultRagEnable");
            if (bool5 != null) {
                a2 = bool5.booleanValue();
            } else {
                a2 = g.a();
            }
            Boolean bool6 = parseObject.getBoolean("defaultThinkEnable");
            if (bool6 != null) {
                b2 = bool6.booleanValue();
            } else {
                b2 = g.b();
            }
            Boolean bool7 = parseObject.getBoolean("defaultUserInfoEnable");
            if (bool7 != null) {
                f2 = bool7.booleanValue();
            } else {
                f2 = g.f();
            }
            String string = parseObject.getString("placeholder");
            if (string == null) {
                string = g.h();
            }
            return new q3(d2, e2, c2, g2, a2, b2, f2, string);
        } catch (Exception unused) {
            return g;
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("630c52d0", new Object[]{this})).booleanValue();
        }
        return f;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f02d4e9", new Object[]{this})).booleanValue();
        }
        return e;
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8225dc7", new Object[]{this, new Boolean(z)});
            return;
        }
        e = z;
        v4p.h("userInfoSwitch", String.valueOf(z));
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b00ebbd2", new Object[]{this})).booleanValue();
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return false;
        }
        return ckf.b(v4p.e(userId + "entranceSwitch", ""), "true");
    }

    public final void l() {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        if (i) {
            i = false;
            h = r();
        }
        c = h.d();
        d = h.c();
        f = h.g();
        String e2 = v4p.e("deepThinkSwitch", "");
        if (TextUtils.isEmpty(e2)) {
            z = h.b();
        } else {
            z = ckf.b(e2, "true");
        }
        f11632a = z;
        String e3 = v4p.e("ragSwitch", "");
        if (TextUtils.isEmpty(e3)) {
            z2 = h.a();
        } else {
            z2 = ckf.b(e3, "true");
        }
        b = z2;
        String e4 = v4p.e("userInfoSwitch", "");
        if (TextUtils.isEmpty(e4)) {
            z3 = h.f();
        } else {
            z3 = ckf.b(e4, "true");
        }
        e = z3;
    }

    static {
        t2o.a(815793041);
        AISearchConfigManager aISearchConfigManager = new AISearchConfigManager();
        INSTANCE = aISearchConfigManager;
        h = aISearchConfigManager.r();
        OrangeConfig.getInstance().registerListener(new String[]{"taowise"}, new obk() { // from class: tb.mj0
            @Override // tb.obk
            public final void onConfigUpdate(String str, Map map) {
                AISearchConfigManager.o(str, map);
            }
        }, true);
    }
}
