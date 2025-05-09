package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.jsbridge.TBLiveBasePlugin;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zmr implements xud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_LIVE_THEMIS_CONTAINER = "TBLiveThemisContainer";
    public static final String h = zmr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public nkr f32874a;
    public final Activity b;
    public TMSEmbed c;
    public final WebStartParams d;
    public long e;
    public Object f;
    public String g;

    static {
        t2o.a(1027604487);
        t2o.a(1027604482);
        t2o.a(1027604483);
        fsw.i("TBLiveBasePlugin", TBLiveBasePlugin.class, true);
    }

    public zmr(Activity activity) {
        this.b = activity;
        this.c = new TMSEmbed(activity);
        WebStartParams webStartParams = new WebStartParams();
        this.d = webStartParams;
        webStartParams.setBgTransparent(Boolean.TRUE);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4faf9523", new Object[]{this});
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            return tMSEmbed.h();
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.g;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77335f75", new Object[]{this});
        }
        return this.f;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        this.g = str;
        WebStartParams webStartParams = this.d;
        if (webStartParams != null && this.c != null) {
            webStartParams.setUrl(str);
            this.c.i(this.d);
            this.c.u();
            rrb rrbVar = (rrb) this.c.g(rrb.class);
            if (rrbVar != null) {
                rrbVar.h0(TB_LIVE_THEMIS_CONTAINER, this);
            }
        }
    }

    @Override // tb.xud
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nkr nkrVar = this.f32874a;
        if (nkrVar != null) {
            nkrVar.v(h, "destroy");
        }
        this.f32874a = null;
        if (this.c != null) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeAllViews();
            }
            this.c.d();
            this.c = null;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        g("TBLiveBasePlugin.event.pageDisappear", "{}");
        nkr nkrVar = this.f32874a;
        if (nkrVar != null) {
            nkrVar.v(h, "pageDisAppear onPause");
        }
    }

    public void f(TMSEmbed.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df770afb", new Object[]{this, aVar});
            return;
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.r(aVar);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a7100d", new Object[]{this, str, str2});
            return;
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.e(str, JSON.parseObject(str2), null);
        }
    }

    @Override // tb.xud
    public nkr getBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkr) ipChange.ipc$dispatch("7b6af6f", new Object[]{this});
        }
        return this.f32874a;
    }

    @Override // tb.xud
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        return a();
    }

    @Override // tb.xud
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            return tMSEmbed.h().getContext();
        }
        Activity activity = this.b;
        if (activity != null) {
            return activity.getBaseContext();
        }
        return null;
    }

    @Override // tb.xud
    public ViewParent getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("29bb769f", new Object[]{this});
        }
        if (a() != null) {
            return a().getParent();
        }
        return null;
    }

    @Override // tb.xud
    public Object getTag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8ecb08ba", new Object[]{this, new Integer(i)});
        }
        if (a() != null) {
            return a().getTag(i);
        }
        return null;
    }

    public void h(nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e382225", new Object[]{this, nkrVar});
        } else {
            this.f32874a = nkrVar;
        }
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5f238e", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    @Override // tb.xud
    public boolean isAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78c5b964", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return a().isAttachedToWindow();
        }
        return false;
    }

    @Override // tb.xud
    public boolean isDestroied() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf02090a", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return false;
        }
        return true;
    }

    public void j(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808c74d0", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (a() != null) {
            a().setTag(i, Boolean.valueOf(z));
        }
    }

    public void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ee9a05", new Object[]{this, obj});
        } else {
            this.f = obj;
        }
    }

    public TMSEmbed l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("c2eea80a", new Object[]{this});
        }
        return this.c;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96b47b", new Object[]{this});
            return;
        }
        g("TBLiveBasePlugin.event.pageDisappear", "{}");
        nkr nkrVar = this.f32874a;
        if (nkrVar != null) {
            nkrVar.v(h, "pageDisAppear");
        }
    }

    @Override // tb.xud
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        g("TBLiveBasePlugin.event.pageAppear", "{}");
        nkr nkrVar = this.f32874a;
        if (nkrVar != null) {
            nkrVar.v(h, "pageAppear onResume");
        }
    }

    @Override // tb.xud
    public void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        g("TBLiveBasePlugin.event.pageAppear", "{}");
        nkr nkrVar = this.f32874a;
        if (nkrVar != null) {
            nkrVar.v(h, a1v.PAGE_APPEAR);
        }
    }

    @Override // tb.xud
    public void renderSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76c5dc", new Object[]{this, jSONObject});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!(this.f32874a == null || jSONObject == null)) {
            currentTimeMillis = this.f32874a.t("tlh5_h5_render_success", brq.b(jSONObject));
        }
        if (ch8.j(this.b)) {
            Activity activity = this.b;
            Toast.makeText(activity, "TBLiveH5Container_time:" + (currentTimeMillis - this.e), 0).show();
        }
    }
}
