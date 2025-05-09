package tb;

import com.alibaba.android.ultron.event.AdjustStateSubscriber;
import com.alibaba.android.ultron.event.AsyncRefreshSubscriber;
import com.alibaba.android.ultron.event.CommonRequestSubscriber;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ou1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends rtd>> f25654a;

    public static Map<String, Class<? extends rtd>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8dd1bfc", new Object[0]);
        }
        return f25654a;
    }

    static {
        t2o.a(157286528);
        HashMap hashMap = new HashMap();
        f25654a = hashMap;
        hashMap.put("openUrl", o5l.class);
        hashMap.put("openUrlResult", l5l.class);
        hashMap.put("userTrack", guv.class);
        hashMap.put("asyncRefresh", AsyncRefreshSubscriber.class);
        hashMap.put("request", CommonRequestSubscriber.class);
        hashMap.put("toast", n74.class);
        hashMap.put("popupSelect", l64.class);
        hashMap.put(WeexPopContainer.PARAMS_SHOW_LOADING, g74.class);
        hashMap.put("hide_loading", v54.class);
        hashMap.put("dismissPop", o54.class);
        hashMap.put("serverEvent", d74.class);
        hashMap.put(ag0.EVENT_TYPE, AdjustStateSubscriber.class);
        hashMap.put(wm.EVENT_TYPE, v64.class);
        hashMap.put("postMessage", n64.class);
        hashMap.put(f4l.EVENT_TYPE, s9v.class);
        hashMap.put("textInputChanged", m74.class);
        hashMap.put("hideKeyBoard", u54.class);
        hashMap.put("checkEmpty", k54.class);
    }
}
