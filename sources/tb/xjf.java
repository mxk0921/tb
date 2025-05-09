package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.intimacy.MtopTaobaoGiuliaIntimacyQueryLiveResponse;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.tbliveinteractive.view.systemcomponent.IntimacyParams;
import java.util.HashMap;
import tb.fgv;

/* compiled from: Taobao */
@MemCheck(field = "mContext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xjf implements s3c, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public wjf b;
    public ViewGroup c;
    public DXRootView d;
    public JSONObject e;
    public final String f;
    public final Context g;
    public final ukr h;
    public final sgf i;
    public boolean j;
    public String k;
    public khf n;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31422a = false;
    public final Runnable l = new a();
    public final Runnable m = new b();

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
                return;
            }
            xjf xjfVar = xjf.this;
            xjf.b(xjfVar, xjf.a(xjfVar), "statusChange");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xjf.c(xjf.this, 3, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements fgv.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
            JSONObject a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            } else if (unImportantLiveInfoResponseData != null && (a2 = zrl.a(unImportantLiveInfoResponseData.intimacyData)) != null) {
                xjf.d(xjf.this, a2);
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    static {
        t2o.a(295699999);
        t2o.a(806355016);
        t2o.a(806355932);
    }

    public xjf(String str, Context context, ukr ukrVar, sgf sgfVar, khf khfVar) {
        this.f = str;
        this.g = context;
        this.h = ukrVar;
        this.i = sgfVar;
        this.n = khfVar;
    }

    public static /* synthetic */ Runnable a(xjf xjfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f362c96a", new Object[]{xjfVar});
        }
        return xjfVar.l;
    }

    public static /* synthetic */ void b(xjf xjfVar, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c8b5b3", new Object[]{xjfVar, runnable, str});
        } else {
            xjfVar.l(runnable, str);
        }
    }

    public static /* synthetic */ void c(xjf xjfVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdca7fcc", new Object[]{xjfVar, new Integer(i), new Integer(i2)});
        } else {
            xjfVar.j(i, i2);
        }
    }

    public static /* synthetic */ void d(xjf xjfVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfdcce3", new Object[]{xjfVar, jSONObject});
        } else {
            xjfVar.h(jSONObject);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return ukr.EVENTCENTER_BIZCODE;
    }

    public void e() {
        Runnable runnable;
        Runnable runnable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f31422a = true;
        sjr.g().b(this);
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            jSONObject.clear();
            this.e = null;
        }
        ViewGroup viewGroup = this.c;
        if (!(viewGroup == null || (runnable2 = this.l) == null)) {
            viewGroup.removeCallbacks(runnable2);
        }
        ViewGroup viewGroup2 = this.c;
        if (!(viewGroup2 == null || (runnable = this.m) == null)) {
            viewGroup2.removeCallbacks(runnable);
            this.c.setVisibility(8);
            this.c.removeAllViews();
            if (this.d != null && w9l.a()) {
                this.h.R().j().j().c(new xm6(this.d));
                this.c.removeView(this.d);
            }
        }
        wjf wjfVar = this.b;
        if (wjfVar != null) {
            wjfVar.destroy();
            this.b = null;
        }
        this.n = null;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70150ab4", new Object[]{this});
        } else if (this.h.getActionAdapter().r() instanceof IntimacyParams) {
            wjf wjfVar = new wjf(this);
            this.b = wjfVar;
            wjfVar.K((IntimacyParams) this.h.getActionAdapter().r(), "");
        }
    }

    public final void g(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66afb65c", new Object[]{this, ux9Var});
        } else if (ux9Var instanceof clo) {
            clo cloVar = (clo) ux9Var;
            if (cloVar.t0() != null) {
                cloVar.t0().i(new c());
            }
        }
    }

    public ViewGroup i(ViewStub viewStub, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("503438dd", new Object[]{this, viewStub, viewGroup, new Boolean(z)});
        }
        this.j = z;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component_flexalocal);
            try {
                FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
                this.c = frameLayout;
                frameLayout.setVisibility(8);
            } catch (Exception unused) {
            }
        } else if (viewGroup == null) {
            return null;
        } else {
            this.c = viewGroup;
            viewGroup.setVisibility(8);
        }
        if (ggv.a()) {
            ukr ukrVar = this.h;
            if (ukrVar != null) {
                g(ukrVar.R());
            }
        } else {
            f();
        }
        return this.c;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49a42b5", new Object[]{this});
        } else if (this.h.getActionAdapter().r() instanceof IntimacyParams) {
            m(((IntimacyParams) this.h.getActionAdapter().r()).follow);
        }
    }

    public final void l(Runnable runnable, String str) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7143bd", new Object[]{this, runnable, str});
        } else if (this.e != null && (viewGroup = this.c) != null) {
            viewGroup.removeCallbacks(runnable);
            this.e.remove(str);
            k();
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103026e", new Object[]{this, str});
            return;
        }
        JSONObject d = fkx.d(str);
        if (d != null) {
            JSONObject jSONObject = d.getJSONObject("intimacyCoin");
            if (jSONObject != null) {
                JSONObject jSONObject2 = this.e.getJSONObject("intimacyCoin");
                jSONObject2.put("point", (Object) jSONObject.getString("point"));
                jSONObject2.put("pointDesc", (Object) jSONObject.getString("pointDesc"));
                jSONObject2.put(rf2.KEY_ADDITION, (Object) jSONObject.getString(rf2.KEY_ADDITION));
            }
            k();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21fc9dd", new Object[]{this, str});
            return;
        }
        JSONObject d = fkx.d(str);
        if (d != null) {
            String string = d.getString("currentLevel");
            if (!TextUtils.isEmpty(string)) {
                this.h.getActionAdapter().y(string);
            }
            JSONObject jSONObject = this.e;
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("intimacyCoin");
                d.put("showCoinTopEntrance", (Object) this.e.getString("showCoinTopEntrance"));
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = d.getJSONObject("intimacyCoin");
                    jSONObject3.put("point", (Object) jSONObject2.getString("point"));
                    jSONObject3.put("pointDesc", (Object) jSONObject2.getString("pointDesc"));
                    jSONObject3.put(rf2.KEY_ADDITION, (Object) jSONObject2.getString(rf2.KEY_ADDITION));
                }
            }
            this.e = d;
            k();
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, uyg.EVENT_ACTION_FOLLOW, uyg.EVENT_GET_FOLLOW_STATUS, "com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.component.intimacy.update", "com.taobao.taolive.room.interactive_component_load_complete"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof MtopTaobaoGiuliaIntimacyQueryLiveResponse) {
            h(((MtopTaobaoGiuliaIntimacyQueryLiveResponse) netBaseOutDo).getData());
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public final void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d2839", new Object[]{this, jSONObject});
        } else if (!this.f31422a || !tws.p()) {
            this.e = new JSONObject(jSONObject);
            xm6 a2 = this.h.R().j().j().a(2047436955);
            if (a2 == null || !w9l.a()) {
                this.d = ll6.b(this.h, this.g, "taolive_intimacy_coin");
            } else {
                this.d = a2.a();
            }
            DXRootView dXRootView = this.d;
            if (dXRootView != null) {
                this.c.addView(dXRootView);
                int b2 = hw0.b(this.g, 3.0f);
                this.c.setPadding(b2, 0, b2, 0);
            }
            if (this.h.getActionAdapter().r() instanceof IntimacyParams) {
                this.k = ((IntimacyParams) this.h.getActionAdapter().r()).accountId;
            }
            k();
            sjr.g().a(this);
        }
    }

    public final void m(boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaec6bf", new Object[]{this, new Boolean(z)});
        } else if (this.d != null && (jSONObject = this.e) != null) {
            Boolean bool = Boolean.TRUE;
            jSONObject.put("noFollow", (Object) bool);
            this.e.put("follow", (Object) Boolean.valueOf(z));
            this.e.put("enableNewMixLiveTopUI", (Object) bool);
            this.e.put("nativeParams", NewStyleUtils.a(this.g, NewStyleUtils.NewStyleType.SMALL));
            ll6.e(this.h, this.d, new JSONObject(this.e), this.f);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("dataIntimacyCoin", this.e.toJSONString());
            hashMap.put("name", "intimacyCoinNative");
            jbu.g(this.h, "Show-intimate-bean", hashMap);
            JSONObject jSONObject2 = this.e.getJSONObject("intimacyCoin");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("point");
                if (!TextUtils.isEmpty(string) && Integer.parseInt(string) > 0 && "true".equals(this.e.getString("showCoinTopEntrance"))) {
                    jbu.g(this.h, "Show-dotefans-bean", hashMap);
                }
            }
            khf khfVar = this.n;
            if (khfVar != null) {
                khfVar.a(null, hashMap);
            }
        }
    }

    public final void j(int i, int i2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329c7fe5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.e);
        hashMap.put("isLandscape", Boolean.valueOf(this.j));
        hashMap.put("status", Integer.valueOf(i));
        sgf sgfVar = this.i;
        if (sgfVar == null) {
            return;
        }
        if (i2 == 1) {
            if (i == 2) {
                sgfVar.a(tws.M(), hashMap);
            } else if (i == 3 && (jSONObject = this.e) != null && !jSONObject.isEmpty()) {
                this.i.H(tws.N(), hashMap);
            }
        } else if (i2 == 2) {
            sgfVar.H(tws.L(), hashMap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r7.equals("com.taobao.taolive.room.dxmanager.event") == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xjf.onEvent(java.lang.String, java.lang.Object):void");
    }
}
