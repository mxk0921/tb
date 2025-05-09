package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vpv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f30164a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ String[] e;

    public vpv(String str, String str2, Object obj, Map map, String[] strArr) {
        this.f30164a = str;
        this.b = str2;
        this.c = obj;
        this.d = map;
        this.e = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            cqv.k(this.f30164a, this.b, this.c, this.d, this.e);
        }
    }
}
