package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.download.DownloadManager$downloadTemplates$1$1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j5z implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ mzy f21786a;
    public final /* synthetic */ u1a b;
    public final /* synthetic */ u1a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ nzy e;
    public final /* synthetic */ y1a f;

    public j5z(mzy mzyVar, u1a u1aVar, u1a u1aVar2, String str, nzy nzyVar, y1a y1aVar) {
        this.b = u1aVar;
        this.c = u1aVar2;
        this.d = str;
        this.f = y1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            m5z.INSTANCE.a(null, this.b, new DownloadManager$downloadTemplates$1$1(this.d, null, this.f, this.c), this.c);
        }
    }
}
