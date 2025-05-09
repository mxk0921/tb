package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fdb.b f22818a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ hp d;

    public kp(hp hpVar, fdb.b bVar, String str, String str2) {
        this.d = hpVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.d.y(this.b, this.c);
            throw null;
        }
    }
}
