package tb;

import android.net.Uri;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.nav.Nav;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cf5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_COPENCOMMENT = 5983653456303764948L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f17024a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552735);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552734);
    }

    public cf5(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.f17024a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(cf5 cf5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXCOpenCommentEventHandler");
    }

    public final void a(int i, String str, Map<String, ? extends Object> map) {
        Map<? extends String, ? extends Object> map2;
        Pair pair;
        String str2;
        Pair pair2;
        Pair pair3;
        String str3;
        Pair pair4;
        String str4;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216cf7ae", new Object[]{this, new Integer(i), str, map});
            return;
        }
        Object s = ((byb) this.f17024a.getService(byb.class)).s();
        String str5 = null;
        if (!(s instanceof PageModel)) {
            s = null;
        }
        PageModel pageModel = (PageModel) s;
        JSONObject originData = pageModel != null ? pageModel.getOriginData() : null;
        d2e d2eVar = (d2e) this.f17024a.getService(d2e.class);
        JSONObject jSONObject = originData != null ? originData.getJSONObject("content") : null;
        JSONObject jSONObject2 = originData != null ? originData.getJSONObject(LoginConstant.ACCOUNT) : null;
        String string = (jSONObject == null || (jSONArray = jSONObject.getJSONArray("items")) == null || jSONArray.size() != 1) ? "" : jSONObject.getJSONArray("items").getJSONObject(0).getString("itemId");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "spm-url", this.f17024a.a().o("spm"));
        jSONObject3.put((JSONObject) "spm-cnt", d2eVar.b());
        jSONObject3.put((JSONObject) "content_id", jSONObject != null ? jSONObject.getString("id") : null);
        jSONObject3.put((JSONObject) "pvid-url", this.f17024a.a().o(yj4.PARAM_PVID));
        if (originData == null || (map2 = originData.getJSONObject("utParams")) == null) {
            map2 = kotlin.collections.a.h();
        }
        jSONObject3.putAll(map2);
        Pair a2 = jpu.a("nid", string);
        Pair a3 = jpu.a("contentId", jSONObject != null ? jSONObject.getString("id") : null);
        Pair a4 = jpu.a("itemIds", string);
        Pair a5 = jpu.a("isShowCommentDescription", Boolean.FALSE);
        Pair a6 = jpu.a("zeroComment", -1);
        Pair a7 = jpu.a("commentSource", Integer.valueOf(i));
        Pair a8 = jpu.a("summary", kotlin.collections.a.j(jpu.a("summary", jSONObject != null ? jSONObject.getString("title") : null), jpu.a("contentIdForItem", jSONObject != null ? jSONObject.getString("id") : null)));
        Pair a9 = jpu.a("accountId", jSONObject2 != null ? jSONObject2.getString("cryptoId") : null);
        Pair a10 = jpu.a("accountName", jSONObject2 != null ? jSONObject2.getString("accountNick") : null);
        Pair a11 = jpu.a("avatarUrl", jSONObject2 != null ? jSONObject2.getString("avatarUrl") : null);
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("targetUrl");
            pair = a6;
        } else {
            pair = a6;
            str2 = null;
        }
        Pair a12 = jpu.a("linkUrl", str2);
        if (jSONObject2 != null) {
            str3 = jSONObject2.getString("userRole");
            pair2 = a4;
            pair3 = a5;
        } else {
            pair3 = a5;
            pair2 = a4;
            str3 = null;
        }
        Pair a13 = jpu.a("subType", str3);
        if (jSONObject2 != null) {
            str4 = jSONObject2.getString("userRole");
            pair4 = a3;
        } else {
            pair4 = a3;
            str4 = null;
        }
        Pair a14 = jpu.a("linkType", str4);
        if (jSONObject2 != null) {
            str5 = jSONObject2.getString("userRole");
        }
        Map k = kotlin.collections.a.k(a2, pair4, pair2, pair3, pair, a7, jpu.a("commentDescription", v3i.f(jpu.a("data", kotlin.collections.a.j(a8, jpu.a(LoginConstant.ACCOUNT, kotlin.collections.a.j(a9, a10, a11, a12, a13, a14, jpu.a("type", str5))))))), jpu.a("rcmdExtraData", kotlin.collections.a.j(jpu.a("nid", string), jpu.a("nextPageProperties", v3i.f(jpu.a("x_object_id", string))))), jpu.a("pageName", d2eVar.getPageName()), jpu.a("utCommonParams", jSONObject3), jpu.a("clickTiming", Long.valueOf(new Date().getTime())));
        if (i == 3) {
            k.put("clickIcon", str);
        }
        if (map != null) {
            k.put(vo.KEY_MESSAGE_DATA, kotlin.collections.a.j(jpu.a("messageAnchorId", map.get("commentId")), jpu.a("anchorTopFeedType", map.get(z9u.KEY_FEED_TYPE))));
        }
        Uri b = mnv.Companion.b(Uri.parse("https://infinite.m.taobao.com/app/ucommunity/nd-comment/comment?wh_weex=true&weex_mode=dom&wx_use_layoutng=true"), kotlin.collections.a.j(jpu.a(nbf.STDPOP_NAV_MODE, nbf.STDPOP_MODE_VALUE), jpu.a("stdpop_type", "regular"), jpu.a(nbf.STDPOP_POP_ID, "NewDetailWeex2PopDetail"), jpu.a(nbf.STDPOP_MODE, "modal"), jpu.a(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen"), jpu.a(CXCommonActivity.NAV_HIDDEN, "true"), jpu.a(CXCommonActivity.NAV_OVERLAY, "true"), jpu.a("wx_use_layoutng", "true"), jpu.a("wx_statusbar_hidden", "true"), jpu.a("is_loading", "0"), jpu.a("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE)));
        Nav.from(this.f17024a.getContext()).toUri(String.valueOf(b) + "&payload=" + Uri.encode(JSON.toJSONString(k)));
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r9.equals(r1) != false) goto L_0x007b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r9.equals("icon") != false) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (r9.equals(r1) != false) goto L_0x007b;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.cf5.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "f9db7b67"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            r4.ipc$dispatch(r5, r6)
            return
        L_0x001b:
            java.lang.String r4 = "event"
            tb.ckf.g(r8, r4)
            java.lang.String r8 = "args"
            tb.ckf.g(r9, r8)
            java.lang.String r8 = "runtimeContext"
            tb.ckf.g(r10, r8)
            r8 = r9[r3]
            boolean r9 = r8 instanceof java.util.Map
            r10 = 0
            if (r9 != 0) goto L_0x0033
            r8 = r10
        L_0x0033:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x003f
            java.lang.String r9 = "type"
            java.lang.Object r9 = r8.get(r9)
            goto L_0x0040
        L_0x003f:
            r9 = r10
        L_0x0040:
            boolean r4 = r9 instanceof java.lang.String
            if (r4 != 0) goto L_0x0045
            r9 = r10
        L_0x0045:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = ""
            if (r9 != 0) goto L_0x004c
            goto L_0x0091
        L_0x004c:
            int r5 = r9.hashCode()
            java.lang.String r6 = "comment"
            switch(r5) {
                case -577741570: goto L_0x0087;
                case 3226745: goto L_0x007d;
                case 96632902: goto L_0x0073;
                case 100358090: goto L_0x0068;
                case 950398559: goto L_0x0060;
                case 951530617: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x0091
        L_0x0056:
            java.lang.String r0 = "content"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0091
            r0 = 1
            goto L_0x0092
        L_0x0060:
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0091
            r0 = 2
            goto L_0x0092
        L_0x0068:
            java.lang.String r1 = "input"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0091
            r4 = r6
            goto L_0x0092
        L_0x0073:
            java.lang.String r1 = "emoji"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0091
        L_0x007b:
            r4 = r1
            goto L_0x0092
        L_0x007d:
            java.lang.String r1 = "icon"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0087:
            java.lang.String r1 = "picture"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0091
            goto L_0x007b
        L_0x0091:
            r0 = 0
        L_0x0092:
            tb.mqu$a r9 = tb.mqu.Companion
            if (r8 == 0) goto L_0x009e
            java.lang.String r1 = "targetComment"
            java.lang.Object r8 = r8.get(r1)
            goto L_0x009f
        L_0x009e:
            r8 = r10
        L_0x009f:
            java.util.Map r8 = r9.h(r8, r10)
            r7.a(r0, r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cf5.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
