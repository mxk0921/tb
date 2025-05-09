package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;
import java.util.Map;
import tb.dmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fmf extends dmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TMSEmbed c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSEmbed f19405a;
        public final /* synthetic */ fmf b;

        public a(TMSEmbed tMSEmbed, fmf fmfVar) {
            this.f19405a = tMSEmbed;
            this.b = fmfVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridThemisContainer$loadThemisPage$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            TLogTracker.f("ThemisPageLoad", sxl.LAUNCHER_FINISH_TIME, "");
            this.f19405a.u();
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
            } else {
                TLogTracker.f("ThemisPageLoad", sxl.LAUNCHER_START_TIME, "");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
            } else {
                TLogTracker.f("ThemisPageLoad", sxl.RENDER_START_TIME, "");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            TLogTracker.f("ThemisPageLoad", "onJSException", z9u.ARG_ERROR_CODE + str + ", errorMsg=" + str2);
            dmf.a d = this.b.d();
            if (d != null) {
                d.n(false, -1, str2);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            TLogTracker.f("ThemisPageLoad", sxl.RENDER_SUCCESS_TIME, z9u.ARG_ERROR_CODE + str + ", errorMsg=" + str2);
            dmf.a d = this.b.d();
            if (d != null) {
                d.B(true, -1, str2);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            TLogTracker.f("ThemisPageLoad", sxl.RENDER_SUCCESS_TIME, "");
            if (!this.b.e()) {
                this.b.j(true);
                JSON r = fmf.r(this.b);
                TLogTracker.f("ThemisPageLoad", "showChangeTranslateLangView", r.toJSONString());
                this.f19405a.e("showChangeTranslateLangView", r, pg1.ATOM_EXT_window);
                View h = this.f19405a.h();
                dmf.a d = this.b.d();
                if (d != null) {
                    d.j(true, h);
                }
            }
        }
    }

    static {
        t2o.a(481297227);
    }

    public fmf(dmf.a aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object ipc$super(fmf fmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridThemisContainer");
    }

    public static final /* synthetic */ JSON r(fmf fmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("fa2e3214", new Object[]{fmfVar});
        }
        return fmfVar.s();
    }

    @Override // tb.dmf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a592f586", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.dmf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
        this.c = null;
    }

    @Override // tb.dmf
    public void c(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163350b5", new Object[]{this, str, str2, map});
            return;
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null && str != null && !TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
            if (map == null) {
                tMSEmbed.e(str2, new JSONObject(), str);
                return;
            }
            TLogTracker.f("ThemisPageLoad", "firePageEvent", "target=" + ((Object) str) + ", event=" + ((Object) str2) + ", data=" + ((Object) JSON.toJSONString(map)));
            if (map instanceof JSONObject) {
                tMSEmbed.e(str2, (JSON) map, str);
            } else {
                tMSEmbed.e(str2, new JSONObject(map), str);
            }
        }
    }

    @Override // tb.dmf
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        try {
            TMSEmbed tMSEmbed = this.c;
            if (tMSEmbed != null) {
                tMSEmbed.k();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.dmf
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        try {
            TMSEmbed tMSEmbed = this.c;
            if (tMSEmbed != null) {
                tMSEmbed.m();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.dmf
    public void i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
        }
    }

    @Override // tb.dmf
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334ee134", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15df2128", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f555b1", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.dmf
    public void n(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
        }
    }

    @Override // tb.dmf
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b98fd4e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.dmf
    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5e9c7", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.dmf
    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ec709", new Object[]{this, jSONObject});
        }
    }

    public final JSON s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("2cd5d018", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "自动", "auto");
        jSONObject.put((JSONObject) "initOriginLang", jSONObject2.toJSONString());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "中文", "zh");
        jSONObject.put((JSONObject) "initTargetLang", jSONObject3.toJSONString());
        jSONObject.put((JSONObject) "originLangList", lg4.F3());
        jSONObject.put((JSONObject) "targetLangList", lg4.G3());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "initConfig", (String) jSONObject);
        return jSONObject4;
    }

    public final void t(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7655e4a7", new Object[]{this, activity, str, map});
            return;
        }
        TLogTracker.f("ThemisPageLoad", "beginLoadTemplate", "templates:");
        TMSEmbed tMSEmbed = new TMSEmbed(activity);
        tMSEmbed.r(new a(tMSEmbed, this));
        this.c = tMSEmbed;
        WebStartParams webStartParams = new WebStartParams();
        webStartParams.setUrl(str);
        webStartParams.setBgTransparent(Boolean.TRUE);
        tMSEmbed.i(webStartParams);
    }

    @Override // tb.dmf
    public void f(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61325cd7", new Object[]{this, activity, map});
            return;
        }
        ckf.g(activity, "activity");
        String I3 = lg4.I3();
        TLogTracker.f("ThemisPageLoad", "LoadTemplate", ckf.p("templates:", I3));
        if (I3 == null || I3.length() == 0) {
            dmf.a d = d();
            if (d != null) {
                d.B(false, -1, "模板链接为空");
                return;
            }
            return;
        }
        t(activity, I3, map);
    }
}
