package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import com.taobao.informationflowdataservice.dataservice.utils.environment.AppAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gt6 implements iyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IAppAdapter f20207a = new AppAdapter();
    public final oih b = new oih();
    public final zmc c = new wah();
    public oob d = new e54();

    static {
        t2o.a(487588000);
        t2o.a(487587953);
    }

    @Override // tb.iyb
    public synchronized IAppAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAppAdapter) ipChange.ipc$dispatch("8ef230f", new Object[]{this});
        }
        return this.f20207a;
    }

    @Override // tb.iyb
    public zmc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmc) ipChange.ipc$dispatch("785e7a1f", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.iyb
    public ioc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ioc) ipChange.ipc$dispatch("1f65ae0f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.iyb
    public oob d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oob) ipChange.ipc$dispatch("7af8acef", new Object[]{this});
        }
        return this.d;
    }

    public void e(oob oobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4787f77", new Object[]{this, oobVar});
        } else {
            this.d = oobVar;
        }
    }
}
