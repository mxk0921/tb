package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.OrderFinishedBroadcastReceiver;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.nextrpc.infoFlow.preload")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o8r extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public lo f;

    static {
        t2o.a(708837472);
    }

    public static /* synthetic */ Object ipc$super(o8r o8rVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/TBBuyInfoFlowPreloadExtension");
    }

    public final void J0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ca30a1", new Object[]{this, jSONObject});
        } else if (!bh.b(jSONObject)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (!bh.b(jSONObject2)) {
                JSONObject jSONObject3 = new JSONObject();
                String string = jSONObject2.getString("backUrl");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject3.put("backUrl", (Object) string);
                    K0(this.f.f(), jSONObject3.toJSONString());
                }
            }
        }
    }

    public final void K0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7cd06b", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(OrderFinishedBroadcastReceiver.ACTION_ORDER_DID_FINISHED);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("params", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
        } else if (kkVar.j()) {
            J0(kkVar.b());
        }
    }

    @Override // tb.et
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.et, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = loVar;
    }
}
