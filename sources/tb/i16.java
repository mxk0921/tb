package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.tao.recommend4.manager.a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_INSERTCARDS = 204709052093538189L;

    static {
        t2o.a(729809023);
    }

    public static /* synthetic */ Object ipc$super(i16 i16Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXInsertCardsEventHandler");
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32f56f4", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("args");
            jSONObject3.put(yj4.PARAM_PVID, (Object) jSONObject4.getString(yj4.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject4.getString("spm"));
            JSONObject jSONObject5 = jSONObject4.getJSONObject("utLogMapEdge");
            if (jSONObject5 != null) {
                jSONObject3.put("x_object_id", (Object) jSONObject5.getString("x_object_id"));
                if (cw6.b()) {
                    bqa.d(z68.TAG, "commit tap, it can get utLogMapEdge");
                }
            } else {
                String string = jSONObject4.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put("x_object_id", (Object) JSON.parseObject(URLDecoder.decode(string, "utf-8")).getString("x_object_id"));
                    }
                } catch (UnsupportedEncodingException e) {
                    sfh.e("DXInsertCardsEventHandler", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    sfh.e("DXInsertCardsEventHandler", "utLogMap catch npe error", e2);
                }
            }
        }
        if (jSONObject2.getJSONObject("clickParam") != null) {
            str2 = jSONObject2.getJSONObject("clickParam").getString("itemId");
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
        } else {
            str = "click_recommend_item";
            str2 = null;
        }
        cqv.u("Page_Home", str, null, str2, gqv.b(jSONObject3));
    }

    public final String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cb8e944", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            bqa.d("DXInsertCardsEventHandler", "getClickId item is null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
        if (jSONObject2 != null) {
            return jSONObject2.getString("itemId");
        }
        bqa.d("DXInsertCardsEventHandler", "getClickId clickParam is null item = " + jSONObject);
        return null;
    }

    public final void c(JSONObject jSONObject, String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943e654", new Object[]{this, jSONObject, str, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            uqa.b("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item.content数据错误 : " + str);
        } else if (dXRuntimeContext != null) {
            fl6 S = dXRuntimeContext.S();
            if (S instanceof RecommendDxUserContext) {
                Object object = ((RecommendDxUserContext) S).getObject("rmd_container");
                if (object instanceof WeakReference) {
                    Object obj = ((WeakReference) object).get();
                    if (obj instanceof a) {
                        String string = jSONObject2.getString("upBizParam");
                        if (TextUtils.isEmpty(string)) {
                            uqa.b("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item.upBizParam 为空 : " + str);
                        }
                        String b = b(jSONObject);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("sectionBizCode", (Object) str);
                        jSONObject3.put("upBizParam", (Object) string);
                        jSONObject3.put("clickId", (Object) b);
                        ((a) obj).j(jSONObject3);
                    }
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        JSONObject i = dXRuntimeContext.i();
        if (!(i instanceof JSONObject)) {
            uqa.b("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "section数据错误");
            return;
        }
        String string = i.getString("sectionBizCode");
        if (TextUtils.isEmpty(string)) {
            uqa.b("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "sectionBizCode为空");
            return;
        }
        JSONObject jSONObject = (JSONObject) objArr[0];
        if (!(jSONObject instanceof JSONObject)) {
            uqa.b("DxEventHandler", "DXInsertCardsEventHandler#handleEvent", "item数据错误 : " + string);
            return;
        }
        c(jSONObject, string, dXRuntimeContext);
        r5a.d(i, jSONObject);
        a(i, jSONObject);
    }
}
