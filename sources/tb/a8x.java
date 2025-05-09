package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a8x extends opc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537658);
    }

    public static /* synthetic */ Object ipc$super(a8x a8xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1941850402:
                super.onJSException((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case -1774438353:
                super.onRefreshSuccess((a) objArr[0]);
                return null;
            case -871865884:
                super.onRefreshFailed((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -871580117:
                super.onRenderFailed((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 664953691:
                super.onPrepareSuccess((a) objArr[0]);
                return null;
            case 724233032:
                super.onRenderSuccess((a) objArr[0]);
                return null;
            case 855112085:
                super.onDestroyed((MUSDKInstance) objArr[0]);
                return null;
            case 1000781377:
                a8xVar.a((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/weex/WeexRenderMonitor");
        }
    }

    @Override // tb.opc, tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        super.onDestroyed(mUSDKInstance);
        TLog.loge("basementWeexLog", "weex onDestroyed");
    }

    @Override // tb.opc, tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        super.onJSException(aVar, i, str);
        TLog.loge("basementWeexLog", "weex onJSException: type=" + i + ",errorMsg=" + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) "onJSException");
        jSONObject.put("type", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        s32.c().g("weexLoadFailed", jSONObject, 1.0d, false);
    }

    @Override // tb.opc, tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            return;
        }
        super.onPrepareSuccess(aVar);
        TLog.loge("basementWeexLog", "weex onPrepareSuccess");
    }

    @Override // tb.opc, tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRefreshFailed(aVar, i, str, z);
        TLog.loge("basementWeexLog", "weex onRefreshFailed: type=" + i + ",errorMsg=" + str + ",isFatal=" + z);
    }

    @Override // tb.opc, tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        super.onRefreshSuccess(aVar);
        TLog.loge("basementWeexLog", "weex onRefreshSuccess");
        s32.c().k("weexLoad");
    }

    @Override // tb.opc, tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(aVar, i, str, z);
        String str2 = "weex onRenderFailed: type=" + i + ",errorMsg=" + str + ",isFatal=" + z;
        TLog.loge("basementWeexLog", str2);
        s32.c().j("weexLoad", "onRenderFailed", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) "onRenderFailed");
        jSONObject.put("type", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        jSONObject.put("isFatal", (Object) Boolean.valueOf(z));
        s32.c().g("weexLoadFailed", jSONObject, 1.0d, false);
    }

    @Override // tb.opc, tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        TLog.loge("basementWeexLog", "weex onRenderSuccess");
    }
}
