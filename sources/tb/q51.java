package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<AppModel> f26510a;

    static {
        t2o.a(839909791);
    }

    public q51(boolean z) {
    }

    public q51 a(List<AppModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q51) ipChange.ipc$dispatch("76a27698", new Object[]{this, list});
        }
        this.f26510a = list;
        return this;
    }

    public q51 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q51) ipChange.ipc$dispatch("f3a72f18", new Object[]{this, str});
        }
        return this;
    }

    public q51 c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q51) ipChange.ipc$dispatch("87292f27", new Object[]{this, jSONObject});
        }
        return this;
    }

    public q51 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q51) ipChange.ipc$dispatch("46825110", new Object[]{this, str});
        }
        return this;
    }
}
