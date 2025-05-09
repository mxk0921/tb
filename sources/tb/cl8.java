package tb;

import com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent;
import com.alibaba.android.icart.core.promotionsubmit.event.MtopEvent;
import com.alibaba.android.icart.core.promotionsubmit.event.ToastEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_MTOP = "mtop";
    public static final String EVENT_TOAST = "toast";
    public static final String EVENT_TYPE_KEY = "eventType";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f17132a;
        public final BaseEvent b;

        static {
            t2o.a(479199547);
        }

        public a(String str, BaseEvent baseEvent) {
            this.f17132a = str;
            this.b = baseEvent;
        }
    }

    static {
        t2o.a(479199546);
    }

    public static BaseEvent a(JSONObject jSONObject, BaseEvent.a aVar) {
        BaseEvent baseEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("3083867e", new Object[]{jSONObject, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("eventType");
        if ("mtop".equals(string)) {
            BaseEvent baseEvent2 = (BaseEvent) JSON.toJavaObject(jSONObject, MtopEvent.class);
            if (baseEvent2 != null) {
                return baseEvent2.initEvent().setFinishedListener(aVar);
            }
        } else if ("toast".equals(string) && (baseEvent = (BaseEvent) JSON.toJavaObject(jSONObject, ToastEvent.class)) != null) {
            return baseEvent.initEvent().setFinishedListener(aVar);
        }
        return null;
    }

    public static List<a> b(JSONArray jSONArray, BaseEvent.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8cba25e", new Object[]{jSONArray, aVar});
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!(jSONObject == null || jSONObject.keySet() == null || jSONObject.keySet().size() <= 0)) {
                for (String str : jSONObject.keySet()) {
                    BaseEvent a2 = a(jSONObject.getJSONObject(str), aVar);
                    if (a2 != null) {
                        arrayList.add(new a(str, a2));
                    }
                }
            }
        }
        return arrayList;
    }
}
