package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final srd f29706a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final v f29707a = new v();

        public static /* synthetic */ v a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v) ipChange.ipc$dispatch("cf93421a", new Object[0]);
            }
            return f29707a;
        }
    }

    public static v a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("8ead7d1f", new Object[0]);
        }
        return b.a();
    }

    public int b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cf87cc", new Object[]{this, context, str})).intValue();
        }
        return ((pdq) this.f29706a).c(context, str);
    }

    public v() {
        this.f29706a = new pdq();
    }
}
