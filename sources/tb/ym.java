package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f32185a;
    @JSONField(name = "events")
    public Map<String, List<Event>> events;
    @JSONField(name = "fields")
    public Map<String, Object> fields;

    static {
        t2o.a(80740414);
    }

    public ym(Map<String, Object> map, Map<String, List<Event>> map2, Map<String, Object> map3) {
        this.fields = map;
        this.events = map2;
        this.f32185a = map3;
    }

    public static ym a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ym) ipChange.ipc$dispatch("d37b0c32", new Object[0]);
        }
        return new ym(null, null, null);
    }
}
