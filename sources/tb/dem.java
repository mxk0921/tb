package tb;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dem implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626340);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "PopLayerProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        try {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString) && dataString.startsWith("poplayer")) {
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "MatchSchema.BroadcastTrigger.PopLayerHooker.url=".concat(dataString));
                Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent2.putExtra("event", dataString);
                intent2.putExtra("param", dataString);
                intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "navUrl");
                LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent2);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "BroadcastTrigger.PopLayerHooker.hook.success");
                return false;
            }
            return true;
        } catch (Throwable unused) {
            Log.e("TBPoplayer", "PopLayerNavHooker.hook.error");
            return true;
        }
    }
}
