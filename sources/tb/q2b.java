package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q2b implements c6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809398);
        t2o.a(488636516);
    }

    @Override // tb.c6d
    public JSONObject getCurrentPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this});
        }
        return zza.c().v();
    }

    @Override // tb.c6d
    public JSONObject getCurrentUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this});
        }
        return zza.c().w();
    }

    @Override // tb.c6d
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return zza.c().A();
    }
}
