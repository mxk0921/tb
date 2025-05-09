package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class zpv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f32939a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String[] f;

    public zpv(String str, String str2, int i, int i2, Map map, String[] strArr) {
        this.f32939a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = map;
        this.f = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            cqv.F(this.f32939a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
