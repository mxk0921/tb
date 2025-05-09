package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ly8 implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IConfigAdapter f23639a;
    public JSONObject b;

    static {
        t2o.a(625999938);
        t2o.a(625999969);
    }

    public ly8(IConfigAdapter iConfigAdapter, JSONObject jSONObject) {
        this.f23639a = iConfigAdapter;
        this.b = jSONObject;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        try {
            return this.b.getString(str);
        } catch (Throwable th) {
            wdm.h("FakeIConfigAdapter.getConfigItemByKey.error.", th);
            return "";
        }
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigsIdSetString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0ac231c", new Object[]{this});
        }
        try {
            return this.b.getString("poplayer_config");
        } catch (Throwable th) {
            wdm.h("FakeIConfigAdapter.getConfigItemByKey.error.", th);
            return "";
        }
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void init(opb opbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f8e94", new Object[]{this, opbVar});
        }
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void startFetchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb53c61", new Object[]{this});
        }
    }
}
