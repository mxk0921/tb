package tb;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.utils.Global;
import com.ut.share.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ue7 extends x3w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VALUE_NINE_SIXTEEN_RATIO = "9:16";
    public CardInnerCommonNode o0;
    public g9e p0;
    public final List<CardInnerCommonNode> q0 = new ArrayList();
    public String r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public p0i w0;
    public b x0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements m8e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.m8e
        public x3w a(cxj cxjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x3w) ipChange.ipc$dispatch("76eeebcf", new Object[]{this, cxjVar});
            }
            return new ue7(cxjVar.j());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f29320a;
        public String b;
        public boolean c;
        public boolean d;
        public int e;
        public float f;

        static {
            t2o.a(352321549);
        }
    }

    static {
        t2o.a(352321547);
    }

    public ue7(com.taobao.android.detail2.core.framework.data.global.a aVar) {
        super(aVar);
        this.i0 = "a2141.22412911";
    }

    public static /* synthetic */ Object ipc$super(ue7 ue7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/biz/detailcard/model/DetailCardItemNode");
    }

    public static m8e y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8e) ipChange.ipc$dispatch("f3346ea", new Object[0]);
        }
        return new a();
    }

    public g9e A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9e) ipChange.ipc$dispatch("8dd01fd4", new Object[]{this});
        }
        p0i p0iVar = this.w0;
        if (p0iVar != null) {
            return p0iVar.a();
        }
        g9e g9eVar = this.p0;
        if (g9eVar != null) {
            return g9eVar;
        }
        return null;
    }

    public String B0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("item")) == null) {
            return null;
        }
        return jSONObject.getString("itemid");
    }

    public JSONObject C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("39677352", new Object[]{this});
        }
        JSONObject jSONObject = this.K;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("item");
    }

    public o0i D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o0i) ipChange.ipc$dispatch("27cf3ee8", new Object[]{this});
        }
        p0i p0iVar = this.w0;
        if (p0iVar != null) {
            return p0iVar.f25796a;
        }
        return null;
    }

    public String E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e7a3d09", new Object[]{this});
        }
        return this.r0;
    }

    public String F0() {
        z4x z4xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84e298cc", new Object[]{this});
        }
        CardInnerCommonNode cardInnerCommonNode = this.o0;
        if (cardInnerCommonNode == null || (z4xVar = cardInnerCommonNode.containerInfo) == null) {
            return null;
        }
        return z4xVar.c();
    }

    public long G0() {
        z4x z4xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6910f12e", new Object[]{this})).longValue();
        }
        CardInnerCommonNode cardInnerCommonNode = this.o0;
        if (cardInnerCommonNode == null || (z4xVar = cardInnerCommonNode.containerInfo) == null) {
            return -1L;
        }
        z4xVar.getClass();
        return -1L;
    }

    public JSONObject H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d8197d45", new Object[]{this});
        }
        JSONObject jSONObject = this.K;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("params");
    }

    public JSONObject I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98a1955c", new Object[]{this});
        }
        JSONObject jSONObject = this.K;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("price");
    }

    public String J0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be83543c", new Object[]{this});
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(DnsPreference.KEY_TRADE)) == null) {
            return "";
        }
        return jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY);
    }

    public String K0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dff25cbe", new Object[]{this});
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("seller")) == null) {
            return "";
        }
        return jSONObject.getString("userId");
    }

    public JSONObject L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this});
        }
        JSONObject H0 = H0();
        if (H0 == null) {
            return new JSONObject();
        }
        return H0.getJSONObject(JTrackParams.TRACK_PARAMS);
    }

    public JSONObject M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c971ae1", new Object[]{this});
        }
        JSONObject H0 = H0();
        if (H0 == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = H0.getJSONObject("umbParams");
        if (jSONObject == null) {
            return new JSONObject();
        }
        jSONObject.put("bizIdentifyParams", (Object) jSONObject.getString("aliBizCode"));
        return jSONObject;
    }

    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e4fbfb2", new Object[]{this})).booleanValue();
        }
        return this.v0;
    }

    public boolean Q0() {
        o0i o0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66dbe780", new Object[]{this})).booleanValue();
        }
        p0i p0iVar = this.w0;
        if (p0iVar == null || (o0iVar = p0iVar.f25796a) == null) {
            return false;
        }
        return o0iVar.n;
    }

    public final void R0() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809885d4", new Object[]{this});
            return;
        }
        JSONObject jSONObject4 = this.O;
        if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject("newMainPicData")) != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null && (jSONArray = jSONObject2.getJSONArray("mainPicList")) != null && (jSONObject3 = jSONArray.getJSONObject(0)) != null) {
            this.r0 = jSONObject3.getString("dimension");
        }
    }

    public final void S0(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c864ef", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            o2r.a("processItemNode");
            T0();
            V0();
            U0();
            W0(jSONObject);
            o2r.b();
        }
    }

    public final void T0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ac9bbd", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.O;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("newMainPicData")) != null) {
            "9:16".equals(jSONObject.getString(ItemCardViewHolder.KEY_CONTAINER_DIMENSION));
        }
    }

    public final boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bd33f2d", new Object[]{this})).booleanValue();
        }
        JSONArray jSONArray = this.P;
        if (jSONArray == null || jSONArray.size() <= 0) {
            return false;
        }
        ((ArrayList) this.q0).clear();
        boolean z = false;
        for (int i = 0; i < this.P.size(); i++) {
            if (Y0(i, this.P.getJSONObject(i))) {
                z = true;
            }
        }
        R0();
        return z;
    }

    @Override // tb.x3w
    public void W(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53601daf", new Object[]{this, jSONObject});
        } else {
            S0(jSONObject, true);
        }
    }

    public final void W0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64df0090", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject3 = this.M;
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("mainPicNative")) != null) {
            p0i p0iVar = this.w0;
            p0i p0iVar2 = new p0i(jSONObject2, B(), C());
            this.w0 = p0iVar2;
            p0iVar2.g = this.g;
            b1(p0iVar2);
            c1(p0iVar, this.w0);
            txj.e(txj.TAG_RENDER, "processMainPicNative生成节点成功" + this);
        }
    }

    @Override // tb.x3w
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9dcbc8", new Object[]{this});
        } else {
            this.o0 = null;
        }
    }

    public final boolean X0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c38b4ac8", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.x3w
    public void Y(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51851c9", new Object[]{this, cardInnerCommonNode});
            return;
        }
        d1(cardInnerCommonNode);
        this.o0 = cardInnerCommonNode;
    }

    @Override // tb.x3w
    public CardInnerCommonNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardInnerCommonNode) ipChange.ipc$dispatch("bdb01eaf", new Object[]{this});
        }
        return this.o0;
    }

    public final void c1(p0i p0iVar, p0i p0iVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b66540e", new Object[]{this, p0iVar, p0iVar2});
        } else if (p0iVar != null && p0iVar2 != null && p0iVar.d != p0iVar2.d) {
            q0j.p(q0j.SCENE_MEDIA_PLAYER, q0j.ERROR_CODE_MAIN_PIC_NATIVE_INCONSISTENT, "瞬开与主接口mainPicNative数据不一致，oldHasPic: " + p0iVar.d + ", newHasPic: " + p0iVar2.d + ", nid: " + this.h + ", channel: " + C().R().x + ", newType: " + C().R().t + ", traceId: " + this.Y + ", subtype: " + this.c, new HashMap());
        }
    }

    public final void d1(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cede36", new Object[]{this, cardInnerCommonNode});
        }
    }

    public boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f28d2fc", new Object[]{this})).booleanValue();
        }
        p0i p0iVar = this.w0;
        if (p0iVar != null) {
            return p0iVar.f25796a.f;
        }
        return true ^ "false".equals(B().getString("enableBlurImage"));
    }

    public boolean P0() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79aeef09", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.K;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("seller")) == null) {
            return false;
        }
        return "B".equals(jSONObject.getString("sellerType"));
    }

    public void a1(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf6a3e6", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        this.K = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.K.put("feature", (Object) jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("mainPicContainer", (Object) jSONObject2);
        jSONObject2.put("bottomAreaBasic", (Object) jSONObject.getString("bottomAreaBasic"));
        jSONObject2.put("enableBlurImage", (Object) jSONObject.getString("enableBlurImage"));
        b bVar = new b();
        this.x0 = bVar;
        bVar.f29320a = str2;
        bVar.b = str3;
        jSONObject.getString("bottomAreaBasic");
        this.x0.c = !"false".equals(jSONObject.getString("enableBlurImage"));
        this.x0.d = "true".equals(jSONObject.getString("enableBlurMask"));
        String string = jSONObject.getString("blurMaskColor");
        String string2 = jSONObject.getString("blurMaskAlpha");
        if (string != null) {
            try {
                this.x0.e = Color.parseColor(string);
            } catch (Exception e) {
                txj.f(txj.TAG_RENDER, "透传数据blurMask解析异常", e);
                return;
            }
        }
        if (string2 != null) {
            this.x0.f = Float.parseFloat(string2);
        }
    }

    public final void b1(p0i p0iVar) {
        String str;
        u0i u0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa88fc25", new Object[]{this, p0iVar});
        } else if (this.w && p0iVar != null && C().G0()) {
            List<u0i> list = p0iVar.b;
            if (list == null || ((ArrayList) list).size() <= 0 || (u0iVar = (u0i) ((ArrayList) p0iVar.b).get(0)) == null) {
                str = "";
            } else {
                str = u0iVar.d();
            }
            if (!TextUtils.equals(str, C().e0())) {
                q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_DELIVER_DATA_PIC_INCONSISTENT, "透传数据与瞬开数据不一致，openImmedPic: " + str + ", deliverPic: " + C().e0() + ", nid: " + this.h + ", channel: " + C().R().x + ", newType: " + C().R().t + ", traceId: " + this.Y + ", subtype: " + this.c, new HashMap());
            }
        }
    }

    public final boolean N0(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("640bb3b3", new Object[]{this, cardInnerCommonNode})).booleanValue();
        }
        if (cardInnerCommonNode != null) {
            return !X0(cardInnerCommonNode.containerName);
        }
        q0j.f(this, "main", "10013", "生成DetailCardInnerNode失败", false);
        return false;
    }

    public final void U0() {
        boolean z = false;
        z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4671a83", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.M;
        if (jSONObject != null) {
            if (jSONObject.getJSONObject("mainMedia") != null) {
                this.p0 = new g5g(this.M.getJSONObject("mainMedia"), C());
            }
            if (this.p0 != null) {
                z = true;
            }
        }
        b("useNativeMedia", Boolean.valueOf(z));
    }

    public final boolean Y0(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5602aef", new Object[]{this, new Integer(i), jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("position");
        String string2 = jSONObject.getString("containerName");
        if ("fixed".equals(string) && i == 0) {
            Z0(jSONObject);
            return false;
        } else if (!"float".equals(string)) {
            return false;
        } else {
            CardInnerCommonNode s = s(jSONObject, te7.a(string2));
            if (N0(s)) {
                ((ArrayList) this.q0).add(s);
            }
            return true;
        }
    }

    public final void Z0(JSONObject jSONObject) {
        z4x z4xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fbd950", new Object[]{this, jSONObject});
            return;
        }
        CardInnerCommonNode r = r(jSONObject);
        if (r == null || !r.isUrlValid()) {
            this.v0 = true;
            com.taobao.android.detail2.core.framework.data.global.a aVar = this.J;
            if (aVar != null) {
                r = t(r, aVar.E(this.b));
            }
            d1(r);
        } else {
            this.v0 = false;
        }
        if (r != null && r.isUrlValid()) {
            this.o0 = r;
        }
        if (r19.z0()) {
            String c = this.o0.containerInfo.c();
            if (!c.contains(uyv.WX_TPL)) {
                c = c.concat("&_wx_tpl=https://dev.g.alicdn.com/newdetail/newflow/0.0.74/weex/home.v20.wlm");
            }
            if (!r19.C0()) {
                txj.e(txj.TAG_TIP, "contentNewWeexUrl = " + c);
                if (r19.Q0()) {
                    c = c + "&weex_cache_disabled=true";
                }
            }
            this.o0.containerInfo.d(c);
        } else if (vv6.a() && this.o0 != null) {
            String s = xmo.s(Global.getApplication(), this.o0.containerName);
            if (zgj.g == 1 && !TextUtils.isEmpty(s) && (z4xVar = this.o0.containerInfo) != null) {
                Uri.Builder buildUpon = Uri.parse(z4xVar.c()).buildUpon();
                buildUpon.appendQueryParameter(uyv.WX_TPL, s);
                buildUpon.appendQueryParameter("weex_cache_disabled", "true");
                this.o0.containerInfo.d(buildUpon.toString());
            }
        }
    }
}
