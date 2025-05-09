package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kq4 implements em1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f22847a;
    public final JSONObject b;
    public final Map<String, Object> c = new ConcurrentHashMap();
    public final BHREvent d;
    public final BHRTaskConfigBase e;

    static {
        t2o.a(404750395);
    }

    public kq4(BHREvent bHREvent, BHRTaskConfigBase bHRTaskConfigBase) {
        this.d = bHREvent;
        this.e = bHRTaskConfigBase;
        this.b = bHRTaskConfigBase.getOriginal();
    }

    @Override // tb.em1
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecf92e44", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.em1
    public JSONObject b() {
        BHREvent bHREvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dc929df", new Object[]{this});
        }
        if (this.f22847a == null && (bHREvent = this.d) != null) {
            this.f22847a = bHREvent.toJsonObject();
        }
        return this.f22847a;
    }

    public BHRTaskConfigBase c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigBase) ipChange.ipc$dispatch("c729fcfa", new Object[]{this});
        }
        BHRTaskConfigBase bHRTaskConfigBase = this.e;
        if (bHRTaskConfigBase != null) {
            return bHRTaskConfigBase;
        }
        return BHRTaskConfig.EMPTY_CONFIG;
    }

    public BHREvent d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("7f39299a", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.em1
    public Map<String, Object> getExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93e6caad", new Object[]{this});
        }
        return this.c;
    }
}
