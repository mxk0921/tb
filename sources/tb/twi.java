package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class twi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, yuc<?, ?>> f29001a = new HashMap<>(10);

    static {
        t2o.a(481297016);
    }

    public static xuc<?, ?> a(NetConfig netConfig) {
        yuc<?, ?> yucVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuc) ipChange.ipc$dispatch("1442cefb", new Object[]{netConfig});
        }
        if (netConfig == null || TextUtils.isEmpty(netConfig.type) || (yucVar = f29001a.get(netConfig.type)) == null) {
            return null;
        }
        return yucVar.a(netConfig);
    }

    public static void b(String str, yuc<?, ?> yucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978cbdb7", new Object[]{str, yucVar});
        } else {
            f29001a.put(str, yucVar);
        }
    }
}
