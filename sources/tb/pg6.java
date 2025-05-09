package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLFOLLOWCONTENTHANDLER = 7112904513270593381L;

    static {
        t2o.a(779092468);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("235cbd54", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("fields")) == null || (jSONObject3 = jSONObject2.getJSONObject("utParams")) == null || (jSONObject4 = jSONObject3.getJSONObject("args")) == null)) {
            hashMap.put("livesource", jSONObject4.getString("livesource"));
            hashMap.put("entryLiveSource", jSONObject4.getString("entryLiveSource"));
            hashMap.put("entrySpm", jSONObject4.getString("spm-cnt"));
            hashMap.put("spm-cnt", jSONObject4.getString("spm-cnt"));
            hashMap.put("spm-url", jSONObject4.getString("spm-url"));
            hashMap.put(z9u.KEY_ACCOUNT_ID, jSONObject4.getString(z9u.KEY_ACCOUNT_ID));
            hashMap.put("feed_id", jSONObject4.getString("feed_id"));
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(pg6 pg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/tbliveFllowContent/DXTblFollowContentHandlerEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null) {
            String valueOf = String.valueOf(objArr[0]);
            Object obj = objArr[1];
            if ((obj instanceof JSONObject) && (jSONObject2 = (jSONObject = (JSONObject) obj).getJSONObject("fields")) != null) {
                String string = jSONObject2.getString(rg0.JUMP_URL);
                if (!TextUtils.isEmpty(string) && dXRuntimeContext != null) {
                    Nav.from(dXRuntimeContext.h()).toUri(string);
                }
                Map<String, String> a2 = a(jSONObject);
                if ("clickEntryButton".equals(valueOf)) {
                    a2.put("click_class", "clickbutton");
                } else if ("clickLiveInfo".equals(valueOf)) {
                    a2.put("click_class", "clickavatar");
                }
                gbu.a("Page_TaobaoLiveWatch", "focus_livecard_click", a2);
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
}
