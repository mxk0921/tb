package tb;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<PluginModel> f27870a;

    static {
        t2o.a(839909900);
    }

    public s8m(boolean z) {
    }

    public s8m a(List<PluginModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8m) ipChange.ipc$dispatch("8d59ab9", new Object[]{this, list});
        }
        this.f27870a = list;
        return this;
    }

    public s8m b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8m) ipChange.ipc$dispatch("9f06f239", new Object[]{this, str});
        }
        return this;
    }

    public s8m c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8m) ipChange.ipc$dispatch("2e3b1f41", new Object[]{this, str});
        }
        return this;
    }
}
