package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s66 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_OPENRECSKU = 1829977483167961545L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(s66 s66Var) {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            } else {
                Log.e("xiangzhi", "onFail");
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else {
                Log.e("xiangzhi", "onSuccess");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(s66 s66Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dinamic/DXOpenRecSKUEventHandler");
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
        } else if (objArr != null && objArr.length != 0) {
            try {
                JSONObject parseObject = JSON.parseObject(objArr[0].toString());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bizName", (Object) "minidetail");
                jSONObject.put(q2q.KEY_SKU_ID, (Object) "");
                jSONObject.put("from", (Object) "ovs");
                jSONObject.put("openFrom", (Object) "tmg-recommend-dx");
                HashMap hashMap = new HashMap(3);
                hashMap.put("itemId", parseObject.getString("itemId"));
                hashMap.put("sourceType", "0");
                hashMap.put("exParams", jSONObject);
                rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new a(this));
            } catch (Exception unused) {
                Log.e("xiangzhi", TLogTracker.SCENE_EXCEPTION);
            }
        }
    }
}
