package com.taobao.mytaobao.basement;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.ultron.MTBPresenter;
import com.taobao.orange.OrangeConfig;
import tb.evd;
import tb.ih4;
import tb.r32;
import tb.t2o;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_BASEMENT_WEEX2 = 3;
    public static final int STATE_SECOND_SCREEN = 0;
    public static final int STATE_TAO_YOU_DEGRADE = 1;
    public static int c;
    public static String d;
    public static int e = -1;
    public static boolean f = false;
    public static boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    public evd f11183a;
    public boolean b = false;

    static {
        t2o.a(745537569);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c573d5a", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("secScreenFragment");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[0]);
        }
        return d;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34aebb4", new Object[0])).booleanValue();
        }
        if (c == 3) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c89d96d", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 3) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("462149b8", new Object[0])).booleanValue();
        }
        if (g) {
            return false;
        }
        return f || "1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "isDowngradePrestrainTaoFriend", null));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("217a3b01", new Object[0])).booleanValue();
        }
        if (c == 0) {
            return true;
        }
        return false;
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490ee669", new Object[0]);
        } else {
            e = 3;
        }
    }

    public void c(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228d428f", new Object[]{this, mTBPresenter, jSONObject});
            return;
        }
        k(mTBPresenter, a(jSONObject));
        z6t.W("解析我淘主接口缓存数据：type=" + c + ",weexUrl=" + d);
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5d45f72", new Object[]{this})).booleanValue();
        }
        if (!e(e) || c != 1) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b3e49f9", new Object[]{this})).booleanValue();
        }
        if ((e(e) || e == 1) && c == 0) {
            return true;
        }
        return false;
    }

    public final void l(JSONObject jSONObject) {
        boolean booleanValue;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7629aae7", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            booleanValue = false;
        } else {
            try {
                booleanValue = jSONObject.getBoolean("disableDowngradePrestrain").booleanValue();
            } catch (Throwable unused) {
                g = false;
            }
        }
        g = booleanValue;
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.getJSONObject("bizParams");
        }
        if (jSONObject2 == null) {
            f = false;
        }
        try {
            f = jSONObject2.getBooleanValue("isDowngradePrestrain");
        } catch (Throwable unused2) {
            f = false;
        }
    }

    public void n(evd evdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a214971a", new Object[]{this, evdVar});
        } else {
            this.f11183a = evdVar;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fdc5d", new Object[]{this});
        } else {
            e = -1;
        }
    }

    public void j(MTBPresenter mTBPresenter, JSONObject jSONObject, String str) {
        BasementViewController basementViewController;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c4656", new Object[]{this, mTBPresenter, jSONObject, str});
            return;
        }
        k(mTBPresenter, a(jSONObject));
        z6t.W("解析我淘主接口mTop数据：type=" + c + ",weexUrl=" + d);
        if (!MtbGlobalEnv.j || !TextUtils.equals(str, "action_cache_expired")) {
            z = false;
        }
        if (d() && ((TextUtils.equals(str, "action_pull_refresh") || z) && (basementViewController = mTBPresenter.k) != null)) {
            basementViewController.G().k(r32.b, null);
        }
        m();
    }

    public final void m() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ceab1f", new Object[]{this});
            return;
        }
        evd evdVar = this.f11183a;
        if (evdVar != null) {
            int i2 = e;
            if (i2 == -1 || (i = c) == 1) {
                int i3 = c;
                e = i3;
                ((BasementViewController) evdVar).D(i3);
            } else if (i2 != i || this.b) {
                if (this.b) {
                    this.b = false;
                }
                if (i == 3) {
                    if (TextUtils.isEmpty(d)) {
                        z6t.W("【错误】mTop加载weex，weexUrl=null");
                    }
                    ((BasementViewController) this.f11183a).K(d);
                } else if (f()) {
                    ((BasementViewController) this.f11183a).N();
                } else if (h()) {
                    ((BasementViewController) this.f11183a).O();
                }
                e = c;
            }
        }
    }

    public final void k(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a3ac65", new Object[]{this, mTBPresenter, jSONObject});
        } else if (mTBPresenter == null || jSONObject == null) {
            c = 0;
        } else {
            l(jSONObject);
            IDMComponent G = mTBPresenter.G("basementTip");
            if (G == null) {
                c = 0;
                return;
            }
            JSONObject fields = G.getFields();
            if (fields == null || fields.size() == 0) {
                c = 1;
                return;
            }
            JSONObject jSONObject2 = fields.getJSONObject("basementTip");
            if (jSONObject2 == null || jSONObject2.size() == 0) {
                c = 1;
            } else if (!"true".equals(jSONObject2.getString("newBasementContainer"))) {
                c = 1;
            } else if (TextUtils.equals(jSONObject2.getString("pageType"), "weex")) {
                String str2 = d;
                int i = c;
                String string = jSONObject2.getString("fragmentWeexUrl");
                d = string;
                int i2 = TextUtils.isEmpty(string) ? 0 : 3;
                c = i2;
                if (i2 == 3 && i == 3 && (str = d) != null && str2 != null && !TextUtils.equals(str, str2) && ih4.a("weexUrlChangeImmediately", false)) {
                    this.b = true;
                }
            }
        }
    }
}
