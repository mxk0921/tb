package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexExternalType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeexExternalType f23127a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final WeexExternalEventType f;
    public final long g;

    static {
        t2o.a(982515743);
    }

    public l5x(WeexExternalType weexExternalType, float f, float f2, float f3, float f4, WeexExternalEventType weexExternalEventType, long j) {
        this.f23127a = weexExternalType;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = weexExternalEventType;
        this.g = j;
    }

    public WeexExternalEventType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalEventType) ipChange.ipc$dispatch("d645fcbe", new Object[]{this});
        }
        return this.f;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public WeexExternalType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalType) ipChange.ipc$dispatch("96b5d30d", new Object[]{this});
        }
        return this.f23127a;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
        }
        return this.c;
    }
}
