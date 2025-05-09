package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q8m implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppModel f26581a;
    public final /* synthetic */ List b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ p8m d;

    public q8m(AppModel appModel, List list, JSONObject jSONObject, p8m p8mVar) {
        this.f26581a = appModel;
        this.b = list;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            r8m.c(this.f26581a, this.b, this.c);
        }
    }
}
