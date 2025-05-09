package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.ultron.MTBPresenter;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nsh extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTB_ONTAP = 8490245503891339469L;

    /* renamed from: a  reason: collision with root package name */
    public final MTBPresenter f24925a;

    static {
        t2o.a(745538104);
    }

    public nsh(MTBPresenter mTBPresenter) {
        this.f24925a = mTBPresenter;
    }

    public static /* synthetic */ Object ipc$super(nsh nshVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/eventHandler/MTBOnTapEventHandler");
    }

    public final void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0c91b9", new Object[]{this, jSONObject, str});
            return;
        }
        MTBPresenter mTBPresenter = this.f24925a;
        if (mTBPresenter != null) {
            mTBPresenter.Y("orderModule_15", str, jSONObject);
        }
    }

    public final void b(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30f6929", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[1];
            if (obj instanceof String) {
                Nav.from(dXRuntimeContext.h()).toUri((String) obj);
                suv.d(u3j.b, "Page_MyTaobao_click-transition", "a2141.7631743.67.1", null, null);
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = "";
            }
            if ("openDelivery".equals(str)) {
                c(objArr, dXRuntimeContext);
            } else if ("openBasement".equals(str)) {
                b(objArr, dXRuntimeContext);
            }
        }
    }

    public final void c(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c922bf2e", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 3) {
            try {
                JSONArray jSONArray2 = (JSONArray) objArr[1];
                int parseInt = Integer.parseInt((String) objArr[2]);
                if (jSONArray2 != null && parseInt < jSONArray2.size()) {
                    tl8.b(dXRuntimeContext.h(), jSONArray2.getJSONObject(parseInt), new ArrayList(jSONArray2), parseInt);
                }
                if (objArr.length > 3 && (jSONArray = (JSONArray) objArr[3]) != null && jSONArray.size() > 0) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.containsKey("type")) {
                            a(jSONObject, jSONObject.getString("type"));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
