package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tuq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f28973a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ a d;

    public tuq(a aVar, String str, String str2, long j) {
        this.d = aVar;
        this.f28973a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        JSONObject i = a.i(this.d, this.f28973a, this.b);
        if (i == null || i.getLongValue("start") <= 0) {
            tfs.e("SubTaskTracker", this.f28973a + ":" + this.b + " subTaskSuccess error");
            return;
        }
        i.put("end", (Object) Long.valueOf(this.c));
        tfs.e("SubTaskTracker", this.f28973a + ":" + this.b + " subTaskSuccess");
    }
}
