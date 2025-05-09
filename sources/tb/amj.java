package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class amj implements x8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j7c f15836a;
    public final btb b;

    static {
        t2o.a(352321855);
        t2o.a(352321854);
    }

    public amj(j7c j7cVar) {
        this.f15836a = j7cVar;
        this.b = j7cVar.b();
    }

    @Override // tb.x8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.a();
        }
    }

    @Override // tb.x8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.b();
        }
    }

    @Override // tb.x8e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c274f7", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // tb.x8e
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.d(qtbVar);
        }
    }

    @Override // tb.x8e
    public void e(zxc zxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eee3f83", new Object[]{this, zxcVar});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.x(zxcVar);
        }
    }

    @Override // tb.x8e
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.f(i, i2);
        }
    }

    @Override // tb.x8e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d89743", new Object[]{this});
            return;
        }
        j7c j7cVar = this.f15836a;
        if (j7cVar != null) {
            j7cVar.a();
        }
    }

    @Override // tb.x8e
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            return btbVar.getVideoState();
        }
        return 0;
    }

    @Override // tb.x8e
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            return btbVar.getView();
        }
        return null;
    }

    @Override // tb.x8e
    public Pair<Boolean, Map<String, String>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7917fc0b", new Object[]{this});
        }
        this.f15836a.c();
        return new Pair<>(Boolean.TRUE, null);
    }

    @Override // tb.x8e
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        btb btbVar = this.b;
        if (btbVar == null) {
            return;
        }
        if (btbVar.getVideoState() == 1) {
            this.b.pauseVideo();
        } else {
            this.b.playVideo();
        }
    }

    @Override // tb.x8e
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.pauseVideo();
        }
    }

    @Override // tb.x8e
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        btb btbVar = this.b;
        if (btbVar != null) {
            btbVar.playVideo();
        }
    }
}
