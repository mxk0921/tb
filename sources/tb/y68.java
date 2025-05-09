package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y68 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Edge";
    public Map<String, Object> baseSaveMap;
    public long id = -1;
    public long left_node_id = 0;
    public long right_node_id = 0;
    public String left_table = "";
    public String right_table = "";
    public String left_event_id = "";
    public String right_event_id = "";
    public String left_event_name = "";
    public String right_event_name = "";
    public String left_scene = "";
    public String right_scene = "";
    public String create_time = "";
    public String update_time = "";

    static {
        t2o.a(962593230);
    }

    public Map<String, Object> getBaseSaveMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92b751d4", new Object[]{this});
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.baseSaveMap = synchronizedMap;
        synchronizedMap.put("left_node_id", Long.valueOf(this.left_node_id));
        this.baseSaveMap.put("right_node_id", Long.valueOf(this.right_node_id));
        this.baseSaveMap.put("left_table", my1.stringNotNull(this.left_table));
        this.baseSaveMap.put("right_table", my1.stringNotNull(this.right_table));
        this.baseSaveMap.put("left_event_id", my1.stringNotNull(this.left_event_id));
        this.baseSaveMap.put("right_event_id", my1.stringNotNull(this.right_event_id));
        this.baseSaveMap.put("left_event_name", my1.stringNotNull(this.left_event_name));
        this.baseSaveMap.put("right_event_name", my1.stringNotNull(this.right_event_name));
        this.baseSaveMap.put("left_scene", my1.stringNotNull(this.left_scene));
        this.baseSaveMap.put("right_scene", my1.stringNotNull(this.right_scene));
        this.baseSaveMap.put("create_time", my1.stringNotNull(this.create_time));
        return this.baseSaveMap;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "edge";
    }

    public long save() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84643f78", new Object[]{this})).longValue();
        }
        Map<String, Object> baseSaveMap = getBaseSaveMap();
        this.baseSaveMap = baseSaveMap;
        if (baseSaveMap == null) {
            return -1L;
        }
        return r0v.getInstance().getDataCollectorAdapter().commit(BHRTaskConfigBase.TYPE_CONFIG_UT, getType(), this.create_time, this.baseSaveMap);
    }

    public long update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee4a30c4", new Object[]{this})).longValue();
        }
        nhh.f(TAG, "update id", Long.valueOf(this.id));
        if (this.id < 0) {
            return -1L;
        }
        Map<String, Object> baseSaveMap = getBaseSaveMap();
        this.baseSaveMap = baseSaveMap;
        if (baseSaveMap == null) {
            return -1L;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        return r0v.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, getType(), valueOf, "id=" + this.id, null, this.baseSaveMap);
    }
}
