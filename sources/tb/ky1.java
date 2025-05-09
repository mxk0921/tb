package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ky1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseNode";
    public Map<String, Object> baseSaveMap;
    public long id = -1;
    public String cold_start_id = "";
    public String session_id = "";
    public String pv_key = "";
    public String pv_id = "";
    public String scene = "";
    public String from_scene = "";
    public String event_id = "";
    public String createTime = "";
    public String updateTime = "";
    public String user_id = "";
    public String page = "";
    public Map<String, String> bizMap = null;

    static {
        t2o.a(962593228);
    }

    public Map<String, Object> getBaseSaveMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92b751d4", new Object[]{this});
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.baseSaveMap = synchronizedMap;
        synchronizedMap.put("cold_start_id", my1.stringNotNull(this.cold_start_id));
        this.baseSaveMap.put("session_id", my1.stringNotNull(this.session_id));
        this.baseSaveMap.put("pv_key", my1.stringNotNull(this.pv_key));
        this.baseSaveMap.put("scene", my1.stringNotNull(this.scene));
        this.baseSaveMap.put("from_scene", my1.stringNotNull(this.from_scene));
        this.baseSaveMap.put(UserTrackDO.COLUMN_EVENT_ID, my1.stringNotNull(this.event_id));
        this.baseSaveMap.put("create_time", my1.stringNotNull(this.createTime));
        this.baseSaveMap.put("update_time", my1.stringNotNull(this.updateTime));
        this.baseSaveMap.put("user_id", my1.stringNotNull(this.user_id));
        this.baseSaveMap.put("page", my1.stringNotNull(this.page));
        Map<String, String> map = this.bizMap;
        if (map != null) {
            this.baseSaveMap.put("pv_id", my1.stringNotNull(map.get("utpvid")));
            this.baseSaveMap.put("arg1", my1.stringNotNull(this.bizMap.get(oeh.ARG1)));
            this.baseSaveMap.put("arg2", my1.stringNotNull(this.bizMap.get(oeh.ARG2)));
            this.baseSaveMap.put("arg3", my1.stringNotNull(this.bizMap.get(oeh.ARG3)));
            try {
                this.baseSaveMap.put("args", my1.stringNotNull(JSON.toJSONString(this.bizMap)));
            } catch (Exception unused) {
            }
            this.baseSaveMap.put("spm_cnt", my1.stringNotNull(this.bizMap.get("spm-cnt")));
            this.baseSaveMap.put("spm_url", my1.stringNotNull(this.bizMap.get("spm-url")));
            this.baseSaveMap.put("spm_pre", my1.stringNotNull(this.bizMap.get("spm-pre")));
            this.baseSaveMap.put("scm", my1.stringNotNull(this.bizMap.get("scm")));
            this.baseSaveMap.put("scm_pre", my1.stringNotNull(this.bizMap.get("scm-pre")));
            this.baseSaveMap.put("utparam_cnt", my1.stringNotNull(this.bizMap.get("utparam-cnt")));
            this.baseSaveMap.put("utparam_url", my1.stringNotNull(this.bizMap.get(z9u.KEY_UTPARAM_URL)));
            this.baseSaveMap.put("utparam_pre", my1.stringNotNull(this.bizMap.get("utparam-pre")));
            this.baseSaveMap.put("utlogmap", my1.stringNotNull(this.bizMap.get("utlogmap")));
            this.baseSaveMap.put("utlogmapedge", my1.stringNotNull(this.bizMap.get("utlogmapedge")));
            this.baseSaveMap.put("object_id", my1.stringNotNull(this.bizMap.get("object_id")));
            this.baseSaveMap.put("object_type", my1.stringNotNull(this.bizMap.get("object_type")));
            my1.getInstance().putArgFields(this.baseSaveMap, this.bizMap);
        }
        return this.baseSaveMap;
    }

    public abstract String getNodeType();

    public String getTableName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return "dc_ut_" + getNodeType();
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
        return r0v.getInstance().getDataCollectorAdapter().commit(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.createTime, this.baseSaveMap);
    }

    public void updateBizMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e577516c", new Object[]{this, map});
            return;
        }
        try {
            this.bizMap = Collections.synchronizedMap(new HashMap(map));
        } catch (Exception unused) {
        }
    }

    public long updatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c881309e", new Object[]{this})).longValue();
        }
        nhh.f("BaseNode", "update id", Long.valueOf(this.id), "pageName", this.page, "pv_key", this.pv_key);
        if (this.id < 0) {
            return -1L;
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.put("pv_key", my1.stringNotNull(this.pv_key));
        synchronizedMap.put("page", my1.stringNotNull(this.page));
        return r0v.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.updateTime, "id=" + this.id, null, synchronizedMap);
    }

    public long update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee4a30c4", new Object[]{this})).longValue();
        }
        nhh.f("BaseNode", "update id", Long.valueOf(this.id));
        if (this.id < 0) {
            return -1L;
        }
        Map<String, Object> baseSaveMap = getBaseSaveMap();
        this.baseSaveMap = baseSaveMap;
        if (baseSaveMap == null) {
            return -1L;
        }
        return r0v.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.updateTime, "id=" + this.id, null, this.baseSaveMap);
    }
}
