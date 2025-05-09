package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class my8 implements INewConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOCK_CONFIG_VERSION = "mock";

    /* renamed from: a  reason: collision with root package name */
    public final INewConfigAdapter f24387a;
    public JSONObject b;
    public final Map<String, Set<String>> c = new HashMap();
    public final Set<String> d = new HashSet();

    static {
        t2o.a(625999939);
        t2o.a(625999974);
    }

    public my8(INewConfigAdapter iNewConfigAdapter, JSONObject jSONObject) {
        this.f24387a = iNewConfigAdapter;
        c(jSONObject);
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0a0f5a", new Object[]{this, str, str2});
            return;
        }
        Set<String> set = this.c.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.c.put(str, set);
        }
        set.add(str2);
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2cd078", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject;
        ((HashMap) this.c).clear();
        ((HashSet) this.d).clear();
        a();
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        try {
            return this.b.getString(str);
        } catch (Throwable th) {
            wdm.h("ConfigFetcherNew.getConfigItemById.error", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Set<String> getConfigsIdSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("74182602", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getCurConfigVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a14762d", new Object[]{this});
        }
        return "mock";
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Map<String, Set<String>> getUriConfigsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b40cd3d", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void startFetchConfig(opb opbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c2028a", new Object[]{this, opbVar});
        } else {
            opbVar.a(true, "mock", JSON.toJSONString(this.c), this.d);
        }
    }

    public final void a() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ac7986", new Object[]{this});
            return;
        }
        for (String str : this.b.getString("poplayer_config").split(",")) {
            if (!TextUtils.isEmpty(str)) {
                ((HashSet) this.d).add(str);
                for (UriModel uriModel : qg4.b(this.b.getString(str), str, "mock").triggerConfigs.pages) {
                    for (String str2 : uriModel.uris) {
                        b(str2, str);
                    }
                }
            }
        }
    }
}
