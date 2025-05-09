package tb;

import com.alibaba.android.icart.core.data.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class br6 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fsb f16562a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ a d;

    public br6(a aVar, fsb fsbVar, boolean z, JSONObject jSONObject) {
        this.d = aVar;
        this.f16562a = fsbVar;
        this.b = z;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a.o0(this.d, this.f16562a, this.b, this.c.toJSONString().getBytes());
        } catch (Throwable th) {
            ub3.g("DataManager", "cacheFirstPageDataIfNeedException," + th.getMessage());
        }
    }
}
