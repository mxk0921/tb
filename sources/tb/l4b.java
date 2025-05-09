package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l4b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f23105a;
    public final /* synthetic */ int b;
    public final /* synthetic */ i4b c;

    public l4b(i4b i4bVar, String str, int i) {
        this.c = i4bVar;
        this.f23105a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            i4b.G(this.c, this.f23105a, this.b, false);
        }
    }
}
