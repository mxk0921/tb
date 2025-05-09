package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bdl extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_DXCUSTOMEVENT = 8297186312837803622L;

    static {
        t2o.a(614465605);
    }

    public static /* synthetic */ Object ipc$super(bdl bdlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/OrderDxCustomEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXEvent instanceof DXOnSelectDateEvent) {
            Map<String, String> data = ((DXOnSelectDateEvent) dXEvent).getData();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
            if (objArr.length > 0) {
                String str = (String) objArr[0];
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("userId", (Object) str);
                }
            }
            try {
                dXRuntimeContext.s().f().v().l("calendarViewEvent", jSONObject);
            } catch (NullPointerException e) {
                kor.d("ODxCustomEvent", "DXOnSelectDateEvent-error", e);
            }
        }
    }
}
