package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class aqv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15942a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ String[] e;

    public aqv(String str, String str2, String str3, Map map, String[] strArr) {
        this.f15942a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            cqv.r(this.f15942a, this.b, this.c, this.d, this.e);
        }
    }
}
