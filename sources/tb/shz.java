package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class shz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte f28065a = hrz.b((byte) -1);
    public byte b = drz.b((byte) -1);
    public eoz c;

    static {
        t2o.a(598736905);
    }

    public final eoz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eoz) ipChange.ipc$dispatch("e578b2ae", new Object[]{this});
        }
        return this.c;
    }

    public final byte b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6fcdb41", new Object[]{this})).byteValue();
        }
        return this.b;
    }

    public final byte c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e95ae0a3", new Object[]{this})).byteValue();
        }
        return this.f28065a;
    }

    public final void d(eoz eozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72821838", new Object[]{this, eozVar});
        } else {
            this.c = eozVar;
        }
    }

    public final void e(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a447bdd3", new Object[]{this, new Byte(b)});
        } else {
            this.b = b;
        }
    }

    public final void f(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2da8a62", new Object[]{this, new Byte(b)});
        } else {
            this.f28065a = b;
        }
    }
}
