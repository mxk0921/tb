package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class imr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static imr c;
    public static Application d;

    /* renamed from: a  reason: collision with root package name */
    public ISmallWindowStrategy f21438a;
    public hgb b;

    static {
        t2o.a(779093444);
    }

    public static imr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imr) ipChange.ipc$dispatch("7eac2c0c", new Object[0]);
        }
        if (c == null) {
            c = new imr();
        }
        return c;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return d;
    }

    public hlc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hlc) ipChange.ipc$dispatch("8c3ccdff", new Object[]{this});
        }
        return new TBLiveDataProvider();
    }

    public ISmallWindowStrategy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmallWindowStrategy) ipChange.ipc$dispatch("63658c7d", new Object[]{this});
        }
        return this.f21438a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f21438a = null;
        }
    }

    public void f(hgb hgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71bccd3", new Object[]{this, hgbVar});
        } else {
            this.b = hgbVar;
        }
    }

    public void g(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6571bd43", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.f21438a = iSmallWindowStrategy;
        }
    }

    public void h(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667f43c5", new Object[]{this, application, str});
        } else {
            i(application, str, null);
        }
    }

    public final void i(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c336e64f", new Object[]{this, application, str, str2});
        } else {
            d = application;
        }
    }
}
