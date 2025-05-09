package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zf6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEHOTRESERVATIONSWITCHCARDACTION = -7829444384169238528L;

    static {
        t2o.a(779092957);
    }

    public static /* synthetic */ Object ipc$super(zf6 zf6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/dx/DXTaoLiveHotReservationSwitchCardActionEventHandler");
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc05e141", new Object[]{this, jSONObject});
        } else {
            ryg.b().c("com.taobao.taolive.room.good.card.subscribe", jSONObject);
        }
    }

    public final void b(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f20525", new Object[]{this, dXRuntimeContext, jSONObject, str});
            return;
        }
        String string = dXRuntimeContext.i().getString("bizType");
        String string2 = jSONObject.getString("subscribeStatus");
        String string3 = jSONObject.getString("itemId");
        String string4 = jSONObject.getString("liveId");
        String string5 = jSONObject.getString(RequestConfig.KEY_ANCHOR_ID);
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", string);
        hashMap.put("item_status", string2);
        hashMap.put("item_id", string3);
        hashMap.put("button_type", str);
        hashMap.put("feed_id", string4);
        hashMap.put(z9u.KEY_ACCOUNT_ID, string5);
        rbu.K(vx9.d(), "guideItem", hashMap);
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
        } else if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                str.hashCode();
                if (!str.equals("itemCardBottonClick")) {
                    if (str.equals("itemCardClick") && objArr.length > 1) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) obj2;
                            if (!TextUtils.isEmpty(jSONObject.getString(rg0.JUMP_URL))) {
                                Nav.from(dXRuntimeContext.h()).toUri(jSONObject.getString(rg0.JUMP_URL));
                            }
                            b(dXRuntimeContext, jSONObject, "detail");
                        }
                    }
                } else if (objArr.length > 1) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj3;
                        a(jSONObject2);
                        b(dXRuntimeContext, jSONObject2, pg1.ATOM_EXT_button);
                    }
                }
            }
        }
    }
}
