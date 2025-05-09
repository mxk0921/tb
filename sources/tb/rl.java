package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27450a;
    @JSONField(name = "confirm")
    private boolean mConfirm;
    @JSONField(name = "protocol")
    private JSONObject mProtocol;

    static {
        t2o.a(80740392);
    }

    public rl(JSONObject jSONObject, boolean z) {
        this.mConfirm = z;
        this.mProtocol = jSONObject;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4b5215", new Object[]{this})).booleanValue();
        }
        return this.mConfirm;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ca4b0b5", new Object[]{this});
        }
        return this.mProtocol;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc11e791", new Object[]{this});
        }
        return this.f27450a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c97f05", new Object[]{this, str});
        } else {
            this.f27450a = str;
        }
    }

    public rl(JSONObject jSONObject) {
        this.mConfirm = true;
        this.mProtocol = jSONObject;
    }
}
