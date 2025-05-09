package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kqt extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f22857a;
    public final /* synthetic */ lqt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqt(lqt lqtVar, String str, Runnable runnable) {
        super(str);
        this.f22857a = runnable;
    }

    public static /* synthetic */ Object ipc$super(kqt kqtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downloader/adapter/ThreadImpl$2");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f22857a.run();
            throw null;
        }
    }
}
