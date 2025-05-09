package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DataUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16176a = -1;

    static {
        t2o.a(912262214);
    }

    public synchronized boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ec8a23", new Object[]{this, jSONObject})).booleanValue();
        }
        int i = !DataUtils.a0(jSONObject) ? 1 : 0;
        if (i < this.f16176a) {
            return false;
        }
        this.f16176a = i;
        return true;
    }
}
