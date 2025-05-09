package tb;

import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import tb.o9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c9y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16932a;
    public final /* synthetic */ o9y.a b;

    public c9y(o9y.a aVar, int i) {
        this.b = aVar;
        this.f16932a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.b(HonorPushErrorEnum.fromCode(this.f16932a));
    }
}
