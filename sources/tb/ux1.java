package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ux1<T extends JSONObject> implements dtc<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29653a = zoi.a(getClass());

    static {
        t2o.a(912261350);
        t2o.a(912261359);
    }

    @Override // tb.dtc
    public int getMessageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e7ed346", new Object[]{this})).intValue();
        }
        return this.f29653a;
    }
}
