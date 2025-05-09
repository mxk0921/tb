package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;
import com.taobao.mytaobao.pop.bridge.TBMyTaobaoPopWVApiPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qsh implements voc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final rsh f26908a = new rsh();
    public final psh b = new psh();

    static {
        t2o.a(745538008);
        t2o.a(745538013);
    }

    public qsh() {
        d();
    }

    public MTBIconPixelInfoBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("cbca088e", new Object[]{this, str});
        }
        return this.f26908a.i(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26dda215", new Object[]{this, str});
        } else {
            this.f26908a.j(str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TBMyTaobaoPopWVApiPlugin.unregisterMTBIconPositionListener();
        this.f26908a.o();
        this.f26908a.p();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        TBMyTaobaoPopWVApiPlugin.registerMTBIconPositionListener(this);
        this.f26908a.l(this.b);
    }

    public void e(uoc uocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9930131", new Object[]{this, uocVar});
        } else {
            this.f26908a.k(uocVar);
        }
    }
}
