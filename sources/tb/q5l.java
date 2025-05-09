package tb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789081);
    }

    public static void a(Bundle bundle, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63df453", new Object[]{bundle, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    public static String b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1c1bc2f", new Object[]{str, map});
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public static UMFRuleIO c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("16cb3791", new Object[]{aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        AURARenderComponent j = eventModel.j();
        if (j == null) {
            return null;
        }
        Event event = new Event();
        event.fields = eventModel.c();
        event.id = eventModel.e();
        event.tag = eventModel.d();
        event.type = aURAEventIO.getEventType();
        rxu rxuVar = new rxu();
        rxuVar.b = j.key;
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        ym ymVar = rxuVar.d;
        AURARenderComponentData aURARenderComponentData = j.data;
        ymVar.fields = aURARenderComponentData.fields;
        ymVar.events = aURARenderComponentData.events;
        HashMap hashMap = new HashMap();
        hashMap.put(aURAEventIO.getEventModel().d(), Collections.singletonList(event));
        rxuVar.c.events = hashMap;
        return new UMFRuleIO(Collections.singletonList(rxuVar));
    }
}
