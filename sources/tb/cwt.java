package tb;

import com.taobao.artc.internal.ArtcParams;
import java.util.TimerTask;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltb/cwt;", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class cwt extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g1a<TimerTask, xhv> f17377a;

    /* JADX WARN: Multi-variable type inference failed */
    public cwt(g1a<? super TimerTask, xhv> g1aVar) {
        this.f17377a = g1aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f17377a.invoke(this);
    }
}
