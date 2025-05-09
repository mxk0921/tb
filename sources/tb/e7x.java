package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e7x implements d7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<q3x> f18346a = new ConcurrentLinkedQueue<>();
    public final WeexInstance b;

    static {
        t2o.a(982515932);
        t2o.a(982515803);
    }

    public e7x(WeexInstance weexInstance) {
        this.b = weexInstance;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    @Override // tb.d7x
    public void a(q3x q3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eef3559", new Object[]{this, q3xVar});
        } else {
            this.f18346a.add(q3xVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        Iterator<q3x> it = this.f18346a.iterator();
        while (it.hasNext()) {
            it.next().onActivityPause();
        }
    }

    public void c(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Iterator<q3x> it = this.f18346a.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        Iterator<q3x> it = this.f18346a.iterator();
        while (it.hasNext()) {
            it.next().onActivityResume();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        Iterator<q3x> it = this.f18346a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStart();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        Iterator<q3x> it = this.f18346a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStop();
        }
    }

    @Override // tb.d7x
    public WeexInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("ded4f1a2", new Object[]{this});
        }
        return this.b;
    }
}
