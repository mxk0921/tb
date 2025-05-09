package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f20998a;

    public i(k kVar) {
        this.f20998a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            ogh.f("ABAugeService", "【人群数据】开始更新人群数据。");
            jj1.h().l();
        } catch (Throwable th) {
            ogh.h("ABAugeService", th.getMessage(), th);
        }
    }
}
