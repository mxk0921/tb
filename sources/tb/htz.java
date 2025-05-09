package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class htz implements odz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f20897a;
    public final int b;

    static {
        t2o.a(598737533);
        t2o.a(598737026);
    }

    public htz(int i, int i2) {
        this.f20897a = i;
        this.b = i2;
    }

    @Override // tb.odz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2a5ad", new Object[]{this});
        } else {
            iiz.Companion.j(" ViewMeasureResult placeChildren 不进行处理，等ViewOnLayout 回调进行处理");
        }
    }

    @Override // tb.odz
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.odz
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.f20897a;
    }
}
