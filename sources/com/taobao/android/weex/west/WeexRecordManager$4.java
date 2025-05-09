package com.taobao.android.weex.west;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apc;
import tb.r3x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WeexRecordManager$4 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WeexRecordManager$4 weexRecordManager$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/west/WeexRecordManager$4");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && "com.taobao.android.weex2.record.start".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("url");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) stringExtra);
            apc j = r3x.j();
            if (j != null) {
                j.a(null, null, jSONObject.toJSONString());
            }
        }
    }
}
