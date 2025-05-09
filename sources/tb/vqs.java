package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vqs implements xxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISceneService f30188a;

    static {
        t2o.a(486539317);
        t2o.a(488636439);
    }

    public vqs(cfc cfcVar, ISceneService iSceneService) {
        this.f30188a = iSceneService;
    }

    @Override // tb.zxd
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        } else {
            this.f30188a.onPageScrolled(f, i);
        }
    }

    @Override // tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            this.f30188a.onPageSelected();
        }
    }

    @Override // tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        } else {
            this.f30188a.onPageUnSelected();
        }
    }
}
