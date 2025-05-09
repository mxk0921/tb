package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gc5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final short f19886a;
    public final String b;
    public final int c;

    static {
        t2o.a(444598003);
    }

    public gc5(short s, String str, int i) {
        this.f19886a = s;
        this.b = str;
        this.c = i;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4252dc1a", new Object[]{this});
        }
        return this.b;
    }

    public short b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd99f903", new Object[]{this})).shortValue();
        }
        return this.f19886a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ac41c60", new Object[]{this})).intValue();
        }
        return this.c;
    }
}
