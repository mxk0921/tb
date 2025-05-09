package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class xu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zxb f31607a;

    static {
        t2o.a(479199287);
    }

    public xu(zxb zxbVar) {
        this.f31607a = zxbVar;
    }

    public void a(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960cf66", new Object[]{this, requestConfig});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void c(RequestConfig requestConfig, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44921fd3", new Object[]{this, requestConfig, mtopResponse});
        }
    }

    public void d(RequestConfig requestConfig, MtopResponse mtopResponse, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86508c8", new Object[]{this, requestConfig, mtopResponse, fsbVar});
        }
    }

    public abstract void e(fsb fsbVar, RequestConfig requestConfig);

    public abstract void f(fsb fsbVar, RequestConfig requestConfig);

    public void g(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31396c29", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        }
    }

    public void h(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed986f7", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        }
    }
}
