package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.b9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wyp implements b9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705391);
        t2o.a(511705370);
    }

    @Override // tb.b9e
    public void G(b9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3be2658", new Object[]{this, aVar});
        }
    }

    @Override // tb.b9e
    public void J(b9e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ece067", new Object[]{this, bVar});
        }
    }

    @Override // tb.b9e
    public void T(tdd tddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bdb55c", new Object[]{this, tddVar});
        }
    }

    @Override // tb.b9e
    public void g(tdd tddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8b2fd9", new Object[]{this, tddVar});
        }
    }

    @Override // tb.b9e
    public void i0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f)});
        }
    }

    @Override // tb.b9e
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.b9e
    public void p(b9e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43cb3be6", new Object[]{this, cVar});
        }
    }

    @Override // tb.b9e
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.b9e
    public void q0(b9e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230d2e49", new Object[]{this, cVar});
        }
    }

    @Override // tb.b9e
    public void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
        }
    }

    @Override // tb.b9e
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }
}
