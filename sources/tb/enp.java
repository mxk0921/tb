package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class enp extends dop {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int h;
    public int i;
    public boolean j;

    static {
        t2o.a(766510314);
    }

    public /* synthetic */ enp(int i, int i2, boolean z, int i3, a07 a07Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
    }

    public static /* synthetic */ Object ipc$super(enp enpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/data/Shop2023HeaderComponentPositionModel");
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c689d393", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8705d9bb", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6754a9e", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85048031", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe5b7af", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5200d62c", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public enp(int i, int i2, boolean z) {
        super(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
        this.h = i;
        this.i = i2;
        this.j = z;
    }
}
