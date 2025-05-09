package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.DinamicViewHelper;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import tb.oit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f65 f = new f65();

    /* renamed from: a  reason: collision with root package name */
    public oit.f f19045a;
    public cv b;
    public dn7 c;
    public ul7 d;
    public DImageViewConstructor.a e;

    static {
        t2o.a(444596226);
    }

    public static f65 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f65) ipChange.ipc$dispatch("194922e1", new Object[0]);
        }
        return f;
    }

    public ul7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ul7) ipChange.ipc$dispatch("7f1ef5da", new Object[]{this});
        }
        return this.d;
    }

    public oit.f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oit.f) ipChange.ipc$dispatch("f2a64f2c", new Object[]{this});
        }
        return this.f19045a;
    }

    public cv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv) ipChange.ipc$dispatch("f6aac370", new Object[]{this});
        }
        return this.b;
    }

    public dn7 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn7) ipChange.ipc$dispatch("705aff5a", new Object[]{this});
        }
        return this.c;
    }

    public void e(ul7 ul7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18048cfd", new Object[]{this, ul7Var});
            return;
        }
        if (this.c == null) {
            this.c = new dn7(ul7Var);
        }
        this.d = ul7Var;
    }

    public void f(String str, av avVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc983df2", new Object[]{this, str, avVar});
        } else {
            km7.c(str, avVar);
        }
    }

    public void g(String str, bv bvVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b74527d", new Object[]{this, str, bvVar});
        } else {
            DinamicViewHelper.registerEventHandler(str, bvVar);
        }
    }

    public void m(String str, sn7 sn7Var) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb661c7", new Object[]{this, str, sn7Var});
        } else {
            DinamicViewHelper.registerViewConstructor(str, sn7Var);
        }
    }

    public void h(oit.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348bd19f", new Object[]{this, fVar});
        } else if (this.f19045a != null) {
            ym7.d("registerHttpLoader failed, loader is exist", new String[0]);
        } else {
            this.f19045a = fVar;
            DTemplateManager.c().q(fVar);
        }
    }

    public void i(DImageViewConstructor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a81c7", new Object[]{this, aVar});
        } else if (this.e != null) {
            ym7.d("registerImageInterface failed, imageInterface is exist", new String[0]);
        } else {
            this.e = aVar;
            DImageViewConstructor dImageViewConstructor = (DImageViewConstructor) tl7.d("DImageView");
            if (dImageViewConstructor != null) {
                dImageViewConstructor.setDxWebImageInterface(aVar);
            }
        }
    }

    public void k(cv cvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67cf19e3", new Object[]{this, cvVar});
        } else if (this.b == null) {
            this.b = cvVar;
        } else {
            ym7.d("registerMonitor failed, monitor is exist", new String[0]);
        }
    }

    public void l(uzb uzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd97de5", new Object[]{this, uzbVar});
        } else if (ym7.f32189a != null) {
            ym7.d("registerRemoteDebugLog failed, iDinamicRemoteDebugLog is exist", new String[0]);
        } else {
            ym7.k(uzbVar);
        }
    }
}
