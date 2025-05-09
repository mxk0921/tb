package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fuv extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189327);
    }

    public static /* synthetic */ Object ipc$super(fuv fuvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/UserTrackSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject fields = g().getFields();
        if (fields != null) {
            try {
                i = fields.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                String string = fields.getString("page");
                String string2 = fields.getString("arg1");
                String string3 = fields.getString("arg2");
                String string4 = fields.getString("arg3");
                String str = "";
                String str2 = TextUtils.isEmpty(string3) ? str : string3;
                if (!TextUtils.isEmpty(string4)) {
                    str = string4;
                }
                JSONObject jSONObject = fields.getJSONObject("args");
                HashMap hashMap = new HashMap();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && (value instanceof String)) {
                            hashMap.put(key, String.valueOf(zr8.a(this.e.getData(), value)));
                        }
                    }
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
            }
        }
    }
}
