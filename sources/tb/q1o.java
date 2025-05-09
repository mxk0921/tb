package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.IPlayPublicService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q1o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26450a;
    public String b;
    public long c;
    public IPlayPublicService d;

    static {
        t2o.a(779093534);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ReplayBean{replayUrl='" + this.f26450a + "', videoId='null', bizCode='" + this.b + "', currentPosition=" + this.c + ", playPublicService=" + this.d + '}';
    }
}
