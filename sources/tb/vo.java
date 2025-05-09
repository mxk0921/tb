package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.weex2")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vo extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "weex2FireEvent";
    public static final String KEY_INSTANCE_ID = "instanceId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MESSAGE_ACTION = "messageAction";
    public static final String KEY_MESSAGE_DATA = "messageData";
    public c3x e;

    static {
        t2o.a(81789238);
    }

    public static /* synthetic */ Object ipc$super(vo voVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/weex2/event/AURAWeex2FireEvent");
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = (c3x) aURAGlobalData.get("auraWeex2InstanceManager", c3x.class);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return EVENT_TYPE;
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else if (this.e == null) {
            ck.g().f("innerHandleEvent:mWeex2InstanceManager is null", ck.b.b().l("AURAWeex2FireEvent").i("AURA/core").a());
        } else {
            JSONObject c = aURAEventIO.getEventModel().c();
            if (c == null) {
                ck.g().f("innerHandleEvent:eventFields is null", ck.b.b().l("AURAWeex2FireEvent").i("AURA/core").a());
                return;
            }
            String string = c.getString("instanceId");
            if (TextUtils.isEmpty(string)) {
                ck.g().f("innerHandleEvent:instanceId is empty", ck.b.b().l("AURAWeex2FireEvent").i("AURA/core").a());
                return;
            }
            d3x d = this.e.d(string);
            if (d == null || d.j() == null) {
                ck.g().f("innerHandleEvent:weexInstance or MUSInstance is null", ck.b.b().l("AURAWeex2FireEvent").i("AURA/core").a());
                return;
            }
            JSONObject jSONObject = c.getJSONObject("message");
            if (jSONObject == null) {
                ck.g().f("innerHandleEvent:message is null", ck.b.b().l("AURAWeex2FireEvent").i("AURA/core").a());
            } else {
                d.j().fireEvent(1, c.getString(KEY_MESSAGE_ACTION), jSONObject);
            }
        }
    }
}
