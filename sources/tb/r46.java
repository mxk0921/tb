package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mytaobao.ability.MtbMtopAbility;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537954);
    }

    public static /* synthetic */ Object ipc$super(r46 r46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/eventhandler/DXMtbTapEventHandler");
    }

    public final void a(String str, o3j o3jVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad29e72a", new Object[]{this, str, o3jVar});
            return;
        }
        JSONObject g = o3jVar.g().g();
        if (g != null && (jSONObject = g.getJSONObject("events")) != null && (jSONObject2 = jSONObject.getJSONObject("clickEvents")) != null && (jSONObject3 = jSONObject2.getJSONObject(str)) != null && (jSONObject4 = jSONObject3.getJSONObject("mtop")) != null) {
            MtbMtopAbility.INSTANCE.a(jSONObject4, null, null);
        }
    }

    public final String b(DXRuntimeContext dXRuntimeContext, Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcb208d", new Object[]{this, dXRuntimeContext, uri});
        }
        String queryParameter = uri.getQueryParameter(jql.IN_PARAM_ORDER_LIST_TYPE);
        if (ckf.b(queryParameter, "wait_to_pay")) {
            str = d(dXRuntimeContext.L(), "order2PayCount");
        } else if (ckf.b(queryParameter, "wait_to_shipments")) {
            str = d(dXRuntimeContext.L(), "order2DeliverCount");
        } else if (ckf.b(queryParameter, "wait_to_confirm")) {
            str = d(dXRuntimeContext.L(), "order2ReceiveCount");
        } else {
            str = ckf.b(queryParameter, "reFund") ? d(dXRuntimeContext.L(), "order2RefundCount") : null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (str == null) {
            str = "";
        }
        String uri2 = buildUpon.appendQueryParameter("mtbShowCount", str).build().toString();
        ckf.c(uri2, "uri.buildUpon().appendQu…t?:\"\").build().toString()");
        return uri2;
    }

    public final void c(String str, Object[] objArr, o3j o3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced1e82b", new Object[]{this, str, objArr, o3jVar});
            return;
        }
        JSONObject f = o3jVar.f();
        if (f == null || !f.getBooleanValue("disableUtForDXTabEvent")) {
            n46.Companion.c(str, objArr, o3jVar, false);
        }
    }

    public final String d(DXRootView dXRootView, String str) {
        DXWidgetNode dXWidgetNode;
        CharSequence text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67e08593", new Object[]{this, dXRootView, str});
        }
        if (dXRootView == null) {
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str);
        } else {
            dXWidgetNode = null;
        }
        if (!(dXWidgetNode instanceof cx5)) {
            dXWidgetNode = null;
        }
        cx5 cx5Var = (cx5) dXWidgetNode;
        if (cx5Var == null || (text = cx5Var.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        fl6 fl6Var;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj2 = null;
        if (dXRuntimeContext != null) {
            fl6Var = dXRuntimeContext.S();
        } else {
            fl6Var = null;
        }
        if (!(fl6Var instanceof o3j)) {
            fl6Var = null;
        }
        o3j o3jVar = (o3j) fl6Var;
        if (o3jVar != null) {
            if (objArr != null) {
                obj = ic1.L(objArr, 0);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                obj2 = obj;
            }
            String str = (String) obj2;
            if (str != null) {
                c(str, objArr, o3jVar);
                e(dXRuntimeContext, str, o3jVar);
                a(str, o3jVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        r8 = r8.getString("url");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.taobao.android.dinamicx.DXRuntimeContext r7, java.lang.String r8, tb.o3j r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.r46.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "b11f2967"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            android.content.Context r3 = r7.h()
            java.lang.String r4 = "runtimeContext.context"
            tb.ckf.c(r3, r4)
            tb.h3j r9 = r9.g()
            com.alibaba.fastjson.JSONObject r9 = r9.g()
            if (r9 == 0) goto L_0x00ae
            java.lang.String r4 = "events"
            com.alibaba.fastjson.JSONObject r9 = r9.getJSONObject(r4)
            if (r9 == 0) goto L_0x00ae
            java.lang.String r4 = "clickEvents"
            com.alibaba.fastjson.JSONObject r9 = r9.getJSONObject(r4)
            if (r9 == 0) goto L_0x00ae
            com.alibaba.fastjson.JSONObject r8 = r9.getJSONObject(r8)
            if (r8 == 0) goto L_0x00ae
            java.lang.String r9 = "url"
            java.lang.String r8 = r8.getString(r9)
            if (r8 == 0) goto L_0x00ae
            android.net.Uri r9 = android.net.Uri.parse(r8)     // Catch: all -> 0x0081
            java.lang.String r4 = "uri"
            tb.ckf.c(r9, r4)     // Catch: all -> 0x0081
            java.lang.String r4 = r9.getHost()     // Catch: all -> 0x0081
            java.lang.String r5 = "tm.m.taobao.com"
            boolean r4 = tb.ckf.b(r4, r5)     // Catch: all -> 0x0081
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = r9.getPath()     // Catch: all -> 0x0081
            java.lang.String r5 = "/list.htm"
            boolean r4 = tb.ckf.b(r4, r5)     // Catch: all -> 0x0081
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = "mtbEnableOrderNumCheck"
            boolean r4 = tb.ih4.a(r4, r1)     // Catch: all -> 0x007f
            if (r4 == 0) goto L_0x0083
            java.lang.String r8 = r6.b(r7, r9)     // Catch: all -> 0x007f
            goto L_0x0083
        L_0x007f:
            goto L_0x0083
        L_0x0081:
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 == 0) goto L_0x008d
            com.taobao.android.nav.Nav r7 = com.taobao.android.nav.Nav.from(r3)
            r7.toUriSimple(r8)
            goto L_0x00a7
        L_0x008d:
            r7 = 0
            java.lang.String r9 = "https://m.taobao.com/go/mytaobao/newsettings?"
            boolean r7 = tb.wsq.O(r8, r9, r2, r0, r7)
            if (r7 == 0) goto L_0x00a0
            com.taobao.android.nav.Nav r7 = com.taobao.android.nav.Nav.from(r3)
            java.lang.String r9 = "https://tb.cn/n/im/dynamic/tb_aura_page.html?spm=a2141.7631743.1.100&scm=20140623.1.7.1&bizConfigCode=mtbSetting&pageTitleTag=mt_mainSettingTitle"
            r7.toUri(r9)
            goto L_0x00a7
        L_0x00a0:
            com.taobao.android.nav.Nav r7 = com.taobao.android.nav.Nav.from(r3)
            r7.toUri(r8)
        L_0x00a7:
            tb.u3j$a r7 = tb.u3j.Companion
            r7.d(r8)
            com.taobao.mytaobao.base.MtbGlobalEnv.i = r8
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r46.e(com.taobao.android.dinamicx.DXRuntimeContext, java.lang.String, tb.o3j):void");
    }
}
