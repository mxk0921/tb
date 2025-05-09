package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RANKENTRANCETAP = -1569183620047155440L;
    public static final String EVENT_BANNER_PRERENDER = "bannerPreRender";
    public static final String EVENT_GIFT_VOTE_REFRESH_DX = "giftVoteBannerRefreshDx";
    public static final String EVENT_REFRESH_DX = "bannerRefreshDx";
    public static final String KEY_BANNER_CARD_LIST = "bannerCardList";
    public static final String KEY_BANNER_DATA = "bannerData";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f21847a;
        public final /* synthetic */ JSONArray b;

        public a(JSONObject jSONObject, JSONArray jSONArray) {
            this.f21847a = jSONObject;
            this.b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f21847a.remove("bannerMedalIcon");
            ux9 d = vx9.d();
            sjr g = sjr.g();
            JSONArray jSONArray = this.b;
            if (d == null) {
                str = null;
            } else {
                str = d.C();
            }
            g.c(j96.EVENT_REFRESH_DX, jSONArray, str);
        }
    }

    static {
        t2o.a(295699645);
    }

    public static float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("127b5a82", new Object[0])).floatValue();
        }
        return yqq.j(v2s.o().p().b("tblive", "openRankEntranceWebViewLayerHeight", "0.6666"));
    }

    public static /* synthetic */ Object ipc$super(j96 j96Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/rank/DXRankEntranceTapEventHandler");
    }

    public final JSONArray a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("729ced9a", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null || !jSONObject.containsKey(str) || !(jSONObject.get(str) instanceof JSONArray)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public final void b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ee6a9", new Object[]{this, context, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString(rg0.JUMP_URL);
        String string3 = jSONObject.getString("componentName");
        ofn.b(jSONObject);
        if ("H5".equals(string)) {
            h(context, string2, jSONObject);
        } else if ("native".equals(string)) {
            Nav.from(context).toUri(string2);
            o3s.b("RankEntranceFrame", "handleEvent: native, h5Url=" + string2);
        } else if ("alive".equals(string)) {
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject);
            if (!TextUtils.isEmpty(string3) && giv.d() != null) {
                giv.d().a(string3, hashMap);
            }
            o3s.b("RankEntranceFrame", "handleEvent: alive, componentName=" + string3);
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b002199e", new Object[]{this, jSONObject});
        } else {
            ofn.c(jSONObject);
        }
    }

    public final void f(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5eaeea0", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXWidgetNode W = dXRuntimeContext.W();
        if (W instanceof DXSliderLayout) {
            int pageIndex = ((DXSliderLayout) W).getPageIndex();
            JSONObject i = dXRuntimeContext.i();
            if (i != null) {
                JSONArray a2 = a(i, KEY_BANNER_DATA);
                if (a2 == null || a2.isEmpty()) {
                    a2 = a(i, KEY_BANNER_CARD_LIST);
                }
                if (a2 != null && !a2.isEmpty() && pageIndex >= 0 && pageIndex < a2.size()) {
                    c(a2.getJSONObject(pageIndex));
                }
            }
        }
    }

    public final void g(DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2db2b49", new Object[]{this, dXRuntimeContext});
            return;
        }
        Object O = dXRuntimeContext.O();
        if (O instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) O;
            if (jSONObject.containsKey("data") && (jSONObject.get("data") instanceof JSONObject)) {
                jSONObject = jSONObject.getJSONObject("data");
            }
            View D = dXRuntimeContext.D();
            if (jSONObject.containsKey("bannerMedalIcon") && (jSONArray = dXRuntimeContext.i().getJSONArray(KEY_BANNER_DATA)) != null) {
                D.post(new a(jSONObject, jSONArray));
            }
        }
    }

    public final void h(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc6ab71", new Object[]{this, context, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            o3s.b("RankEntranceFrame", "handleEvent: showRankEntranceH5: h5Url is empty!");
        } else {
            HashMap hashMap = new HashMap();
            float e = hw0.e() * e();
            hashMap.put("x", "0");
            hashMap.put("y", String.valueOf(hw0.u((hw0.e() - hw0.d(context)) - e)));
            hashMap.put("width", String.valueOf(-1));
            hashMap.put("height", String.valueOf(hw0.u(e)));
            hashMap.put("modal", "true");
            hashMap.put("exitAnimation", "1");
            hashMap.put("enterAnimation", "1");
            hashMap.put("bizData", "showRankEntranceH5");
            if (!(jSONObject == null || jSONObject.getString("options") == null)) {
                try {
                    for (Map.Entry<String, Object> entry : fkx.d(jSONObject.getString("options")).entrySet()) {
                        hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                } catch (Throwable th) {
                    v7t.d(j96.class.getSimpleName(), th.toString());
                }
            }
            if (giv.d() != null) {
                o3s.b("RankEntranceFrame", "handleEvent: openWebViewLayer: h5Url=" + str);
                if (!(vx9.d() == null || vx9.f(vx9.d()) == null)) {
                    giv.d().b(iba.b(context, vx9.f(vx9.d())), str, hashMap);
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

    public final void d(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1d1249", new Object[]{this, dXRuntimeContext});
            return;
        }
        JSONArray jSONArray = dXRuntimeContext.i().getJSONArray(KEY_BANNER_DATA);
        if (jSONArray.size() == 1) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if ("tblive-base-openWebview".equals(jSONObject.getString("componentName")) && "alive".equals(jSONObject.getString("type")) && !TextUtils.isEmpty(jSONObject.getString(rg0.JUMP_URL))) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", (Object) jSONObject.getString(rg0.JUMP_URL));
                sjr.g().e(EVENT_BANNER_PRERENDER, jSONObject2);
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        if (objArr.length == 0) {
            f(dXRuntimeContext);
        }
        if (objArr.length > 1 && (objArr[0] instanceof String) && (objArr[1] instanceof JSONObject)) {
            g(dXRuntimeContext);
            String str = (String) objArr[0];
            JSONObject jSONObject = (JSONObject) objArr[1];
            if ("click".equals(str)) {
                b(dXRuntimeContext.h(), jSONObject);
            } else if ("voteCountDownFinish".equals(str) && (i = dXRuntimeContext.i()) != null) {
                sjr.g().e(EVENT_GIFT_VOTE_REFRESH_DX, i);
            }
        } else if (objArr.length == 1) {
            Object obj = objArr[0];
            if ((obj instanceof String) && ((String) obj).equals(z1x.PRE_RENDER)) {
                d(dXRuntimeContext);
            }
        }
    }
}
