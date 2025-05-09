package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class upv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29551a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String[] f;

    public upv(String str, String str2, String str3, Object obj, Map map, String[] strArr) {
        this.f29551a = str;
        this.b = str2;
        this.c = str3;
        this.d = obj;
        this.e = map;
        this.f = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            cqv.n(this.f29551a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
