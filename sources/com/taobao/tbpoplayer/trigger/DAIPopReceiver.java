package com.taobao.tbpoplayer.trigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.a9l;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DAIPopReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_MODEL_NAME = "com.tmall.android.dai.intent.extra.MODEL_NAME";
    public static final String EXTRA_OUTPUT_DATA = "com.tmall.android.dai.intent.extra.OUTPUT_DATA";
    public static final String EXTRA_RESULT = "com.tmall.android.dai.intent.extra.RESULT";

    static {
        t2o.a(790626499);
    }

    public static /* synthetic */ Object ipc$super(DAIPopReceiver dAIPopReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/trigger/DAIPopReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (!a9l.w().z()) {
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "DAIPopReceiver.isDAITriggerSwitchOn=false.");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("com.tmall.android.dai.intent.extra.RESULT", false);
            String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
            Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
            if (!(serializableExtra instanceof HashMap)) {
                wdm.c(wdm.CATEGORY_TRIGGER_EVENT, "", "DAIPopReceiver.onReceive.intent.getOutputData.fail.");
                return;
            }
            HashMap hashMap = (HashMap) serializableExtra;
            if (!booleanExtra) {
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "DAIPopReceiver.invalid.result=false.modelName=" + stringExtra);
                return;
            }
            Object obj = hashMap.get("event");
            Object obj2 = hashMap.get("param");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent2.putExtra("event", (String) obj);
                intent2.putExtra("param", (String) obj2);
                intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "dai");
                LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent2);
                wdm.d("DAIPopReceiver.msg=" + intent.getExtras(), new Object[0]);
                return;
            }
            wdm.c(wdm.CATEGORY_TRIGGER_EVENT, "", "DAIPopReceiver.onReceive.outputData.getParam.fail.");
        } catch (Throwable unused) {
            wdm.c(wdm.CATEGORY_TRIGGER_EVENT, "", "DAIPopReceiver.onReceive.fail.");
        }
    }
}
