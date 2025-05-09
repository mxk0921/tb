package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f20475a;
    public int businessId;
    public ISocialBusinessListener<?> listener;

    static {
        t2o.a(817889344);
    }

    public String getParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        Map<String, String> map = this.f20475a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public void setRequestParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3f498b", new Object[]{this, map});
        } else {
            this.f20475a = map;
        }
    }
}
