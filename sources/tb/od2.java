package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class od2 implements es6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final i5a f25307a;

    static {
        t2o.a(475004952);
        t2o.a(475004953);
    }

    public od2(i5a i5aVar) {
        this.f25307a = i5aVar;
    }

    @Override // tb.es6
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5df90a9b", new Object[]{this, list});
        }
        if (list == null || list.size() < 2 || list.get(0) == null || list.get(1) == null) {
            return "";
        }
        String obj = list.get(0).toString();
        if (TextUtils.isEmpty(obj)) {
            return "";
        }
        Object obj2 = list.get(1);
        JSONObject a2 = this.f25307a.a(obj);
        if (a2 != null) {
            return a2.get(obj2);
        }
        return "";
    }
}
