package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a6k implements zp7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f15567a;

    static {
        t2o.a(620757045);
        t2o.a(620757036);
    }

    public a6k(int i) {
        this.f15567a = i;
    }

    @Override // tb.zp7
    public boolean a(String str, int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f618c8e", new Object[]{this, str, new Integer(i), bArr, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return false;
    }

    @Override // tb.zp7
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f931b", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    @Override // tb.zp7
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f0c2f7", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.zp7
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    @Override // tb.zp7
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c1d36ea", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zp7
    public long e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a05552a", new Object[]{this, str, new Integer(i)})).longValue();
        }
        return -1L;
    }

    @Override // tb.zp7
    public int[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("99f2983", new Object[]{this, str});
        }
        return new int[0];
    }

    /* renamed from: g */
    public ud8 get(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("33b83a71", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    @Override // tb.zp7
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.f15567a;
    }
}
