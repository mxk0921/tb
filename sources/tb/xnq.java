package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xnq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f31487a;
    public final /* synthetic */ File b;

    public xnq(long j, File file) {
        this.f31487a = j;
        this.b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "StorageAdapter", "clearExpiredCache :" + this.f31487a, null, 4, null);
        File[] listFiles = this.b.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null && file.isFile()) {
                    long lastModified = file.lastModified();
                    if (lastModified > 0 && System.currentTimeMillis() - lastModified > this.f31487a) {
                        tpu.a.b(tpu.Companion, "StorageAdapter", "clearExpiredCache, cache " + file.getName() + " is deleted", null, 4, null);
                        file.delete();
                    }
                }
            }
        }
    }
}
