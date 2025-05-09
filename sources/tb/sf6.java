package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sf6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVECOMMENTACTION = 8145846171775414553L;

    static {
        t2o.a(295698569);
    }

    public static /* synthetic */ Object ipc$super(sf6 sf6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/DXTaoLiveCommentActionEventHandler");
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

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
        } else if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof String) && ((String) obj).equals("chatHotSaleClick") && objArr.length > 1) {
                Object obj2 = objArr[1];
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj2;
                    String string = jSONObject.getString(rg0.JUMP_URL);
                    if (!TextUtils.isEmpty(string)) {
                        HashMap hashMap = new HashMap(op3.k(string));
                        if (hashMap.containsKey("action")) {
                            String str = (String) hashMap.get("action");
                            hashMap.remove("action");
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            String string2 = jSONObject.getString("itemId");
                            String string3 = jSONObject.getString("desc");
                            if (!TextUtils.isEmpty(string2)) {
                                hashMap2.put("item_id", string2);
                            }
                            if (string3 != null) {
                                hashMap2.put("recom_reason", string3);
                            }
                            if (!TextUtils.isEmpty(str) && "openGoodsContainer".equals(str)) {
                                if (kkr.i().o() != null) {
                                    kkr.i().o().c("commentBuyAtmosphere", hashMap2);
                                }
                                if (hashMap.containsKey("clickSource")) {
                                    hashMap.put("from", hashMap.get("clickSource"));
                                }
                                d9m.n().getActionAdapter().g(xeaVar == null ? null : xeaVar.q(), uyg.EVENT_SHOW_GOODSPACKAGE, new HashMap(hashMap));
                            }
                        }
                    }
                }
            }
        }
    }
}
