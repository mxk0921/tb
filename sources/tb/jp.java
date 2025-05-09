package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fdb.l f22135a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InputStream d;
    public final /* synthetic */ hp e;

    public jp(hp hpVar, fdb.l lVar, String str, String str2, InputStream inputStream) {
        this.e = hpVar;
        this.b = str;
        this.c = str2;
        this.d = inputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.e.W(this.b, this.c, this.d, 0);
            throw null;
        }
    }
}
