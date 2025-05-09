package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wg6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVEGOTODETAIL = -8940556935659657630L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements deb<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f30678a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ Map c;

        public a(xea xeaVar, LiveItem liveItem, Map map) {
            this.f30678a = xeaVar;
            this.b = liveItem;
            this.c = map;
        }

        /* renamed from: a */
        public void onResult(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63ce410a", new Object[]{this, bool});
            } else if (bool.booleanValue()) {
                wg6.d(wg6.this, this.f30678a, this.b, this.c);
            } else {
                hha.b("Handler_GoToDetail", "handleEvent | result is false.");
                wg6.e(this.b, null);
            }
        }

        @Override // tb.deb
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            hha.c("Handler_GoToDetail", "handleEvent.onError | liveId=" + this.b.liveId + "   itemId=" + this.b.itemId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("s", (Object) str);
            jSONObject.put("s1", (Object) str2);
            wg6.e(this.b, jSONObject);
        }
    }

    static {
        t2o.a(295698939);
    }

    public static /* synthetic */ void d(wg6 wg6Var, xea xeaVar, LiveItem liveItem, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfef987", new Object[]{wg6Var, xeaVar, liveItem, map});
        } else {
            wg6Var.f(xeaVar, liveItem, map);
        }
    }

    public static /* synthetic */ void e(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82daae7d", new Object[]{liveItem, jSONObject});
        } else {
            g(liveItem, jSONObject);
        }
    }

    public static boolean i(String str, char c, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("148aeb82", new Object[]{str, new Character(c), str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (c == 0) {
            return TextUtils.equals(str, str2);
        }
        for (String str3 : str.split(Character.toString(c))) {
            if (TextUtils.equals(str2, str3)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(wg6 wg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTbliveGoToDetailEventHandler");
    }

    public final void f(xea xeaVar, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1489676", new Object[]{this, xeaVar, liveItem, map});
        } else if (kkr.i().d() != null && xeaVar != null) {
            hha.c("Handler_GoToDetail", "handleEvent.onResult | liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
            kkr.i().d().h(xeaVar.q(), (Activity) xeaVar.i(), liveItem, "detail", map);
            h(liveItem);
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

    public static void g(LiveItem liveItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac7d41d", new Object[]{liveItem, jSONObject});
        } else {
            iha.t("口袋列表", liveItem, false, jSONObject);
        }
    }

    public static void h(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e0bad0", new Object[]{liveItem});
        } else {
            iha.t("口袋列表", liveItem, true, null);
        }
    }

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        String str = "2";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[0];
            Context h = dXRuntimeContext.h();
            LiveItem liveItem = (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class);
            if (liveItem != null) {
                if (objArr.length < 3 || !"taolive_goods_list_item".equals(objArr[2]) || !pfa.v(h, liveItem)) {
                    pfa.b(xeaVar, liveItem);
                    String p = pfa.p(liveItem);
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene", p);
                    hashMap.put("laiyuan", str);
                    String string = jSONObject.getString("item_position");
                    hashMap.put("item_position", string);
                    LiveItem.Ext ext = liveItem.extendVal;
                    if (ext == null || !"secKill".equals(ext.itemBizType)) {
                        str = "1";
                    }
                    hashMap.put("bubbleType", str);
                    liveItem.cpsClickPos = pfa.j(liveItem, false, "");
                    he7.b(xeaVar, liveItem, string);
                    JSONObject jSONObject2 = liveItem.itemActionData;
                    if (jSONObject2 == null || !jSONObject2.containsKey("userBehaviorEvents")) {
                        f(xeaVar, liveItem, hashMap);
                        return;
                    }
                    String string2 = liveItem.itemActionData.getString("userBehaviorEvents");
                    if (TextUtils.isEmpty(string2) || !i(string2, '@', "userbuy")) {
                        f(xeaVar, liveItem, hashMap);
                    } else {
                        new xa3().d(xeaVar, liveItem, new a(xeaVar, liveItem, hashMap));
                    }
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("taolive_goods_list_item", (Object) Boolean.valueOf("taolive_goods_list_item".equals(objArr[2])));
                    jSONObject3.put("isItemDown", (Object) Boolean.valueOf(pfa.v(h, liveItem)));
                    g(liveItem, jSONObject3);
                }
            }
        } catch (Throwable th) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("exception", (Object) th.toString());
            g(null, jSONObject4);
        }
    }
}
