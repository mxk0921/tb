package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponse;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y2h implements zlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = y2h.class.getSimpleName();
    public static final HashMap<String, String> e;

    /* renamed from: a  reason: collision with root package name */
    public Context f31801a;
    public ux9 b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ inr f31802a;

        public a(y2h y2hVar, inr inrVar) {
            this.f31802a = inrVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.f31802a.a();
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            LiveDetailMessinfoResponseData.ActivityInfo activityInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (!(netBaseOutDo instanceof LiveDetailMessinfoResponse) || (activityInfo = ((LiveDetailMessinfoResponse) netBaseOutDo).getData().activity) == null) {
                this.f31802a.a();
            } else {
                this.f31802a.d(activityInfo.bizData);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.f31802a.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31803a;

        public b(String str) {
            this.f31803a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            kiv.c(v2s.o().f().getApplication(), ((st9) jkdVar).f28260a);
            sjr.g().c(uyg.EVENT_ACTION_FOLLOW, this.f31803a, y2h.this.c);
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = v2s.o().f().getApplication().getString(R.string.taolive_user_account_follow_fail);
            }
            kiv.c(v2s.o().f().getApplication(), str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31804a;

        public c(String str) {
            this.f31804a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            kiv.c(y2h.W(y2h.this), ((wfv) jkdVar).f30670a);
            sjr.g().c(uyg.EVENT_ACTION_UNFOLLOW, this.f31804a, y2h.this.c);
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else {
                kiv.c(y2h.W(y2h.this), "取消关注失败，请重试");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ inr f31805a;

        public d(y2h y2hVar, inr inrVar) {
            this.f31805a = inrVar;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) Boolean.valueOf(((hnf) jkdVar).f20761a));
            this.f31805a.d(jSONObject.toJSONString());
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else {
                this.f31805a.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ inr f31806a;

        public e(inr inrVar) {
            this.f31806a = inrVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            y2h.this.getClass();
            jSONObject.put("errorCode", (Object) netResponse.getRetCode());
            y2h.this.getClass();
            jSONObject.put("errorMsg", (Object) netResponse.getRetMsg());
            this.f31806a.b(jSONObject.toJSONString());
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                this.f31806a.d(new String(netResponse.getBytedata()));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            y2h.this.getClass();
            jSONObject.put("errorCode", (Object) netResponse.getRetCode());
            y2h.this.getClass();
            jSONObject.put("errorMsg", (Object) netResponse.getRetMsg());
            this.f31806a.b(jSONObject.toJSONString());
        }
    }

    public y2h(Context context, ux9 ux9Var) {
        this.b = ux9Var;
        this.f31801a = context;
        if (ux9Var != null) {
            this.c = ux9Var.C();
        }
    }

    public static /* synthetic */ Context W(y2h y2hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4d58479f", new Object[]{y2hVar});
        }
        return y2hVar.f31801a;
    }

    @Override // tb.zlc
    public boolean A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1961e0a0", new Object[]{this, map})).booleanValue();
        }
        sjr.g().c("com.taolive.taolive.room.mediaplatform_show_sharepanel", map, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4179a921", new Object[]{this})).booleanValue();
        }
        sjr.g().c("com.taobao.taolive.goods.force_goods_timeout", null, this.c);
        return true;
    }

    @Override // tb.zlc
    public void K(IWVWebView iWVWebView) {
        IInteractiveProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98f2938", new Object[]{this, iWVWebView});
            return;
        }
        if (roa.a(iWVWebView) instanceof IInteractiveProxy.b) {
            bVar = (IInteractiveProxy.b) roa.a(iWVWebView);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // tb.zlc
    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cda800c", new Object[]{this});
        }
        ux9 ux9Var = this.b;
        if (ux9Var != null) {
            return up6.O(ux9Var);
        }
        return null;
    }

    @Override // tb.zlc
    public boolean N(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccfd8377", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("accountId");
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = str;
        qt9Var.o = map.get("followSource");
        ux9 ux9Var = this.b;
        if (ux9Var != null) {
            qt9Var.c = ux9Var.i;
        }
        v2s.o().k().h(qt9Var, new c(str));
        return true;
    }

    @Override // tb.zlc
    public org.json.JSONObject O(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("9985f22f", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        return j5m.c(context, this.b);
    }

    @Override // tb.zlc
    public void P(inr inrVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfc8a75", new Object[]{this, inrVar, map});
        } else if (map == null) {
            inrVar.a();
        } else {
            String str = map.get("accountId");
            if (TextUtils.isEmpty(str)) {
                inrVar.a();
                return;
            }
            qt9 qt9Var = new qt9();
            qt9Var.f26917a = str;
            v2s.o().k().d(qt9Var, new d(this, inrVar));
        }
    }

    @Override // tb.zlc
    public boolean R(IInteractiveProxy.h hVar, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e508bd", new Object[]{this, hVar, iWVWebView})).booleanValue();
        }
        if (roa.a(iWVWebView) == null || hVar == null) {
            return false;
        }
        return hVar.n();
    }

    @Override // tb.zlc
    public boolean T(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68f4687c", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        if (yqq.h(map.get("enable"))) {
            sjr.g().c(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, null, this.c);
        } else {
            sjr.g().c(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, null, this.c);
        }
        return true;
    }

    public ViewGroup X(Context context) {
        ATaoLiveOpenEntity A;
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9040c0b3", new Object[]{this, context});
        }
        ux9 ux9Var = this.b;
        if (!(ux9Var == null || ((air) ux9Var).A() == null || (A = ((air) this.b).A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
            View m = ((rbt) A.uiCompontent).b().m();
            if (m instanceof ViewGroup) {
                return (ViewGroup) m;
            }
        }
        return iba.c(context, vx9.f(this.b));
    }

    @Override // tb.zlc
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7d35e0c", new Object[]{this, map})).booleanValue();
        }
        sjr.g().c("com.taobao.taolive.room.update_position", map, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean b(IInteractiveProxy.h hVar, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8577f87", new Object[]{this, hVar, iWVWebView})).booleanValue();
        }
        if (roa.a(iWVWebView) == null || hVar == null) {
            return false;
        }
        return hVar.n();
    }

    @Override // tb.zlc
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81a547c", new Object[]{this});
        }
        if (up6.Q(vx9.c()) != null) {
            return up6.Q(vx9.c());
        }
        return "";
    }

    @Override // tb.zlc
    public boolean d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("566f1dd9", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.b;
        if (ux9Var != null) {
            str = ux9Var.C();
        } else {
            str = null;
        }
        sjr.g().c("com.taobao.taolive.room.mediaplatform_resume_video", null, str);
        return true;
    }

    @Override // tb.zlc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f31801a = null;
        this.b = null;
    }

    @Override // tb.zlc
    public long getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        ux9 ux9Var = this.b;
        if (ux9Var == null || ux9Var.x() == null) {
            return 0L;
        }
        return this.b.x().getCurrentPosition();
    }

    @Override // tb.zlc
    public boolean h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8ba649", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        sjr.g().c("com.taobao.taolive.room.mediaplatform_start_video", map, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aea2bed", new Object[]{this})).booleanValue();
        }
        sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, this.c);
        return true;
    }

    @Override // tb.zlc
    public String k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21f44443", new Object[]{this});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (gq0.i().checkSessionValid()) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put("isLogin", str);
            if (!gq0.i().checkSessionValid()) {
                return null;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("userId", gq0.i().getUserId());
            jSONObject2.put("nick", gq0.i().getNick());
            jSONObject.put("info", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // tb.zlc
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d434028", new Object[]{this})).booleanValue();
        }
        sjr.g().c("com.taolive.taolive.room.mediaplatform_addfavor", null, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("364e9b8", new Object[]{this})).booleanValue();
        }
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, null, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c13dcb90", new Object[]{this})).booleanValue();
        }
        sjr.g().c(uyg.EVENT_INPUT_HIDE, null, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf673230", new Object[]{this})).booleanValue();
        }
        sjr.g().c("com.taobao.taolive.room.mediaplatform_pause_video", null, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b289d99e", new Object[]{this})).booleanValue();
        }
        return up6.C(this.b);
    }

    @Override // tb.zlc
    public boolean t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbb9982b", new Object[]{this, map})).booleanValue();
        }
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, map, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4037e9fe", new Object[]{this})).booleanValue();
        }
        eba.a();
        return true;
    }

    @Override // tb.zlc
    public boolean v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a5effd", new Object[]{this, map})).booleanValue();
        }
        sjr.g().c(uyg.EVENT_INPUT_SHOW, map, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5bff4d1", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("accountId");
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = str;
        qt9Var.b = map.get("accountType");
        qt9Var.o = map.get("followSource");
        ux9 ux9Var = this.b;
        if (ux9Var != null) {
            qt9Var.c = ux9Var.i;
        }
        v2s.o().k().f(rbu.m(ux9Var, qt9Var), new b(str));
        rbu.R(this.b, this.f31801a, str);
        return true;
    }

    @Override // tb.zlc
    public void y(inr inrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de78e72d", new Object[]{this, inrVar});
            return;
        }
        a aVar = new a(this, inrVar);
        ux9 ux9Var = this.b;
        if (ux9Var != null && ux9Var.q() != null) {
            this.b.q().d(aVar);
        }
    }

    @Override // tb.zlc
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20231da4", new Object[]{this});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isOpenWatermarkHeight", true);
            jSONObject.put("watermarkHeight", (int) (((up6.h0(this.b) * 1.0f) / hw0.h()) * 750.0f));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // tb.zlc
    public boolean H(IInteractiveProxy.h hVar, IWVWebView iWVWebView, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f286059e", new Object[]{this, hVar, iWVWebView, map})).booleanValue();
        }
        if (roa.a(iWVWebView) == null || hVar == null) {
            return false;
        }
        return hVar.f(X(this.f31801a), map.get("url"), map);
    }

    @Override // tb.zlc
    public boolean M(IInteractiveProxy.h hVar, IWVWebView iWVWebView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76773f0b", new Object[]{this, hVar, iWVWebView, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("url");
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, String.valueOf(jSONObject.get(str)));
        }
        hVar.b(iba.c(this.f31801a, vx9.f(vx9.d())), string, hashMap);
        return true;
    }

    @Override // tb.zlc
    public boolean C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836a6eec", new Object[]{this, map})).booleanValue();
        }
        if (map == null || !map.containsKey("itemId") || !map.containsKey("itemPic") || !map.containsKey("itemPrice")) {
            return false;
        }
        sjr.g().c(uyg.EVENT_INPUT_SHOW, map, this.c);
        sjr.g().c("com.taobao.taolive.room.hide_goods_list", null, this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean F(IInteractiveProxy.h hVar, IWVWebView iWVWebView, Map<String, String> map, inr inrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("789c1336", new Object[]{this, hVar, iWVWebView, map, inrVar})).booleanValue();
        }
        IInteractiveProxy.b bVar = roa.a(iWVWebView) instanceof IInteractiveProxy.b ? (IInteractiveProxy.b) roa.a(iWVWebView) : null;
        if (bVar == null || map == null) {
            inrVar.a();
            return false;
        }
        View view = bVar.getView();
        if (view == null || !(view instanceof IInteractiveProxy.c)) {
            inrVar.a();
            return false;
        }
        String str = map.get("componentName");
        IInteractiveProxy.c cVar = (IInteractiveProxy.c) view;
        if (!map.containsKey("isShowComponent")) {
            cVar.setPenetrateAlpha((int) (yqq.j(map.get("alpha")) * 255.0f));
        } else {
            boolean h = yqq.h(map.get("isShowComponent"));
            boolean i = yqq.i(map.get("isNeedShowCloseBtn"), true);
            float j = yqq.j(map.get("closeBtnSize"));
            String str2 = map.get("closeBtnImg");
            float j2 = yqq.j(map.get("offsetRight"));
            float j3 = yqq.j(map.get("offsetTop"));
            if (!(TextUtils.isEmpty(str) || hVar == null || hVar.d() == null)) {
                cwd A = v2s.o().A();
                String str3 = d;
                A.c(str3, "setPenetrateAlpha componentName " + str + " isShowComponent " + h + " " + i + " " + str2 + " " + j + " " + j2 + " " + j3);
                boolean d2 = hVar.d().d(str, h, i, str2, j, j2, j3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isAddShowComponentList", (Object) Boolean.valueOf(d2));
                inrVar.d(jSONObject.toJSONString());
                return true;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isAddShowComponentList", (Object) Boolean.FALSE);
        inrVar.d(jSONObject2.toJSONString());
        return true;
    }

    @Override // tb.zlc
    public boolean G(IInteractiveProxy.h hVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cdee78e", new Object[]{this, hVar, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("liveId");
        if (TextUtils.isEmpty(str)) {
            str = map.get("id");
        }
        eba.d(this.f31801a, str, map.get(yj4.PARAM_TIME_PLAY_URL), map.get("liveSource"), map.get("videoGood"), null, true);
        return true;
    }

    @Override // tb.zlc
    public boolean I(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59243f00", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        sjr.g().c("com.taobao.taolive.room.mediaplatform_mute_video", Boolean.valueOf(yqq.h(map.get("muted"))), this.c);
        return true;
    }

    @Override // tb.zlc
    public boolean J(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7512c62f", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        if (map.containsKey(yj4.PARAM_SJSD_ITEM_ID)) {
            return true;
        }
        String str = map.get("position");
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            sjr.g().c("com.taobao.taolive.room.seekto_replay", Integer.valueOf(Integer.parseInt(str) * 1000), this.c);
            return true;
        } else if (TextUtils.isEmpty(str) || !str.contains(".")) {
            return false;
        } else {
            sjr.g().c("com.taobao.taolive.room.seekto_replay", Integer.valueOf(((int) Float.parseFloat(str)) * 1000), this.c);
            return true;
        }
    }

    @Override // tb.zlc
    public boolean Q(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51db8321", new Object[]{this, map})).booleanValue();
        }
        if (!(this.f31801a == null || map == null)) {
            if (TextUtils.isEmpty(map.get("itemID"))) {
                map.get("itemId");
            }
            map.get("accountId");
            map.get("bizType");
            map.get("isCpc");
            LiveItem liveItem = (LiveItem) fkx.f(map.get("detail"), LiveItem.class);
            try {
                if (this.f31801a instanceof Activity) {
                    HashMap hashMap = new HashMap();
                    if (liveItem != null && !TextUtils.isEmpty(liveItem.native_channel)) {
                        hashMap.put("channel", liveItem.native_channel);
                    }
                    if (pvs.c3()) {
                        str = "dx";
                    } else {
                        str = "weex";
                    }
                    hashMap.put("itemlistType", str);
                    u90.a((Activity) this.f31801a, 10000, liveItem, hashMap);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // tb.zlc
    public boolean S(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b7b4f2", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(m09.TASK_TYPE_LEVEL);
        if (!TextUtils.isEmpty(str)) {
            m09.e().g(str);
        }
        String str2 = map.get("scopeId");
        if (!TextUtils.isEmpty(str2)) {
            m09.e().h(str2);
        }
        String str3 = map.get("subScopeId");
        if (!TextUtils.isEmpty(str3)) {
            m09.e().i(str3);
        }
        return true;
    }

    @Override // tb.zlc
    public boolean U(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6947b80e", new Object[]{this, map})).booleanValue();
        }
        Context context = this.f31801a;
        if (context == null || map == null || !(context instanceof Activity)) {
            return false;
        }
        map.get("itemId");
        map.get("itemUrl");
        map.get("itemH5TaokeUrl");
        map.get("isCpc");
        map.get("liveId");
        map.get("adgrid");
        map.get(yj4.REF_PID);
        map.get("isBulk");
        LiveItem liveItem = (LiveItem) fkx.f(map.get("detail"), LiveItem.class);
        HashMap hashMap = new HashMap();
        if (liveItem != null && !TextUtils.isEmpty(liveItem.native_channel)) {
            hashMap.put("channel", liveItem.native_channel);
        }
        u90.i((Activity) this.f31801a, liveItem, "detail", hashMap);
        return true;
    }

    @Override // tb.zlc
    public boolean V(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ee13489", new Object[]{this, map})).booleanValue();
        }
        if (!(this.f31801a == null || map == null)) {
            String str = map.get(mop.KEY_APM_SHOP_URL);
            if (!TextUtils.isEmpty(str)) {
                u90.k(this.f31801a, str);
                return true;
            }
        }
        return false;
    }

    @Override // tb.zlc
    public boolean e(Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bd69af1", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("url");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean h = yqq.h(map.get("disableSmallWindow"));
        boolean h2 = yqq.h(map.get("closeRoom"));
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        if ((h || h2) && (("h5.m.taobao.com".equals(host) || "wapp.m.taobao.com".equals(host) || "huodong.m.taobao.com".equals(host)) && ("/act/talent/live.html".equals(path) || q6f.PATH_TAOLIVE.equals(path)))) {
            h = false;
        } else {
            z = h2;
        }
        if (z) {
            eba.a();
        }
        eba.b(this.f31801a, str, h);
        return true;
    }

    @Override // tb.zlc
    public boolean f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c210193", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        eba.c(this.f31801a, map.get("liveId"), map.get(yj4.PARAM_TIME_PLAY_URL), map.get("liveSource"), map.get("videoGood"), null);
        return true;
    }

    @Override // tb.zlc
    public boolean g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a08f0e", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = d;
        o3s.b(str, "enableUpDownSwitch " + map.get("enable") + " name " + map.get("__namespace"));
        if (yqq.h(map.get("enable"))) {
            sjr.g().c("com.taobao.taolive.room.enable_updown_switch", "liveApi", this.c);
        } else if (d4s.e("enableH5DisableUpDownSwitch", true)) {
            sjr.g().c("com.taobao.taolive.room.disable_updown_switch", "liveApi", this.c);
        }
        return true;
    }

    @Override // tb.zlc
    public boolean j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9472c03c", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME);
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = e;
            if (hashMap.get(str) != null) {
                sjr.g().c(uyg.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, hashMap.get(str), this.c);
                return true;
            }
        }
        return false;
    }

    @Override // tb.zlc
    public boolean m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d4c2fc", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        sjr.g().e(uyg.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE, map.get("url"));
        return true;
    }

    @Override // tb.zlc
    public boolean p(IInteractiveProxy.h hVar, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aedb5ca3", new Object[]{this, hVar, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str2 = map.get("liveId");
        ux9 ux9Var = this.b;
        if (!(ux9Var instanceof cdr) || (str = ux9Var.i) == null || !str.equals(str2)) {
            return false;
        }
        if (this.b.x() != null) {
            this.b.x().y(this.f31801a);
        }
        return true;
    }

    @Override // tb.zlc
    public boolean r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1725f808", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("eventName");
        String str2 = map.get("subType");
        if (!TextUtils.isEmpty(str)) {
            sjr.g().c(str, map.get("data"), this.c);
        } else if (!TextUtils.isEmpty(str2)) {
            sjr.g().c(str2, map, this.c);
        }
        return true;
    }

    @Override // tb.zlc
    public boolean s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d41ae1", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME);
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = e;
            if (hashMap.get(str) != null) {
                sjr.g().c(uyg.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, hashMap.get(str), this.c);
                return true;
            }
        }
        return false;
    }

    @Override // tb.zlc
    public String x() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a03b7", new Object[]{this});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (up6.d0(this.b) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                z = true;
            }
            jSONObject.put("isPlaybackTimeMove", z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // tb.zlc
    public void z(inr inrVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48707d79", new Object[]{this, inrVar, map});
            return;
        }
        NetRequest netRequest = new NetRequest();
        netRequest.setApiName(String.valueOf(map.get("api")));
        netRequest.setVersion(String.valueOf(map.get("v")));
        Object obj = map.get("data");
        if (obj != null) {
            netRequest.setData(String.valueOf(obj));
        }
        int i = map.get(SessionConstants.ECODE);
        if (i == null) {
            i = 0;
        }
        netRequest.setNeedEcode(!"0".equalsIgnoreCase(String.valueOf(i)));
        netRequest.setPost("POST".equalsIgnoreCase(String.valueOf(map.get("type"))));
        if (map.containsKey("sessionOption")) {
            netRequest.setSessionOption(String.valueOf(map.get("sessionOption")));
        } else {
            netRequest.setSessionOption("AutoLoginAndManualLogin");
        }
        new nt1(new q(new e(inrVar), this.f31801a)).G(1, netRequest, null);
    }

    static {
        t2o.a(779093251);
        t2o.a(806356589);
        HashMap<String, String> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put("topBar", "TopBarFrame3");
        hashMap.put(to8.COMMENT, "tl-chat");
        hashMap.put("favorAni", "tl-favor-anim");
        hashMap.put(to8.FAVOR, "tl-bottom-favor");
        hashMap.put("bottomBar", "tl-bottom-bar-native");
        hashMap.put("follow", "FollowFrame");
        hashMap.put("enterInfo", "enterInfo");
        hashMap.put("goods", "goods");
        hashMap.put("more", "more");
        hashMap.put("gift", "gift");
        hashMap.put("roomNum", "roomNum");
        hashMap.put("commentInput", "commentInput");
        hashMap.put("fullScreenOverlay", "fullScreenOverlay");
        hashMap.put("backToLiveWidget", "backToLiveWidget");
        hashMap.put("close", "close");
        hashMap.put("useLevelPoints", "useLevelPoints");
    }

    @Override // tb.zlc
    public Map E(Uri uri) {
        String str;
        jbt jbtVar;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c54e24a", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        ux9 ux9Var = this.b;
        boolean z = (ux9Var == null || ((air) ux9Var).A() == null || ((air) this.b).A() == null) ? false : true;
        HashMap hashMap = new HashMap();
        String uri2 = uri.toString();
        if (z) {
            ux9 ux9Var2 = this.b;
            if ((ux9Var2 instanceof cdr) && ux9Var2.D() != null) {
                hashMap.putAll(this.b.D());
                uri2 = this.b.D().get(yj4.PARAM_INTENT_URL);
            }
        } else {
            for (String str2 : uri.getQueryParameterNames()) {
                hashMap.put(str2, uri.getQueryParameter(str2));
            }
            if (pvs.j()) {
                hashMap.put("spmUrl", up6.U(this.b));
            }
        }
        JSONObject jSONObject = new JSONObject();
        List<String> J2 = pvs.J2();
        if (J2 != null) {
            for (int i = 0; i < J2.size(); i++) {
                if (J2.get(i) != null) {
                    String[] split = J2.get(i).split("_");
                    if (split.length == 3) {
                        String B = hjr.B(split[0], split[1], split[2]);
                        if (!TextUtils.isEmpty(B)) {
                            jSONObject.put(J2.get(i), (Object) B);
                        }
                    }
                }
            }
        }
        String str3 = d;
        o3s.b(str3, "getLiveRoomInfo interactiveExperimentListRet " + jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("evoSwitch", jSONObject.toString());
        hashMap2.put("queryParams", fkx.i(hashMap));
        if (!pvs.N0()) {
            uri2 = uri.toString();
        }
        hashMap2.put("originURL", uri2);
        hashMap2.put("updownSwitchModel", up6.b0(this.b));
        hashMap2.put("entryLiveSourceGlobals", up6.r(this.b));
        hashMap2.put("liveSourceGlobals", iba.B(vx9.f(this.b)));
        hashMap2.put(yj4.PARAM_IS_FIRST_ENTER, String.valueOf(sj9.u()));
        hashMap2.put("switchIndex", String.valueOf(up6.W(this.b)));
        if (this.b.H()) {
            str = "TaoBaoHighLight";
        } else {
            str = "";
        }
        hashMap2.put("channel", str);
        ux9 ux9Var3 = this.b;
        if (!(ux9Var3 == null || ((air) ux9Var3).A() == null)) {
            hashMap2.put("openLiveRoomBizCode", ((air) this.b).A().bizCode);
        }
        ux9 ux9Var4 = this.b;
        if (ux9Var4 instanceof air) {
            if (!(((air) ux9Var4).A() == null || (jbtVar = ((air) this.b).A().taoliveOpenContext) == null || (map = jbtVar.f) == null || (obj = map.get("aliveChanel")) == null)) {
                hashMap2.put("aliveChannel", String.valueOf(obj));
            }
            if (pvs.v()) {
                if (this.b.j() instanceof cba) {
                    hashMap2.put(smh.entryQuery, JSON.toJSONString(((cba) this.b.j()).Q));
                }
            } else if (iba.C(this.b.j()) != null) {
                Uri parse = Uri.parse(iba.C(this.b.j()));
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                HashMap hashMap3 = new HashMap();
                for (String str4 : queryParameterNames) {
                    hashMap3.put(str4, parse.getQueryParameter(str4));
                }
                hashMap2.put(smh.entryQuery, JSON.toJSONString(hashMap3));
            }
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("params", fkx.i(hashMap2));
        return hashMap4;
    }
}
