package tb;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class omf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<JSONObject> f25488a = new SparseArray<>();

    static {
        t2o.a(481297458);
    }

    public final void a(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bf58ac", new Object[]{this, num, jSONObject});
        } else if (jSONObject != null && num != null && num.intValue() >= 0) {
            this.f25488a.put(num.intValue(), jSONObject);
        }
    }

    public final void b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f0e2fb", new Object[]{this, num});
        } else if (num != null && num.intValue() >= 0) {
            this.f25488a.remove(num.intValue());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f25488a.clear();
        }
    }

    public final JSONObject d(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe61db8e", new Object[]{this, num});
        }
        if (num == null || num.intValue() < 0) {
            return null;
        }
        return this.f25488a.get(num.intValue());
    }
}
