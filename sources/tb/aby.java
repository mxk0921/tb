package tb;

import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jay;
import tb.o9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class aby implements jay {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f15651a = new AtomicInteger(1);
    public volatile IPushInvoke b;
    public final jay.a c;
    public lby d;

    public aby(jay.a aVar) {
        this.c = aVar;
    }

    public final void a(int i) {
        new StringBuilder("notifyFailed result: ").append(i);
        jay.a aVar = this.c;
        if (aVar != null) {
            o9y.a aVar2 = (o9y.a) aVar;
            Looper myLooper = Looper.myLooper();
            o9y o9yVar = o9y.this;
            if (myLooper == o9yVar.f25238a.getLooper()) {
                aVar2.b(HonorPushErrorEnum.fromCode(i));
            } else {
                o9yVar.f25238a.post(new c9y(aVar2, i));
            }
        }
    }

    public boolean b() {
        AtomicInteger atomicInteger = this.f15651a;
        if (atomicInteger.get() == 3 || atomicInteger.get() == 4) {
            return true;
        }
        return false;
    }
}
