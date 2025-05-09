package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xd2 implements ejb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISceneService f31316a;

    static {
        t2o.a(486539315);
        t2o.a(488636436);
    }

    public xd2(cfc cfcVar, ISceneService iSceneService) {
        this.f31316a = iSceneService;
    }

    @Override // tb.ejb
    public kqb getContainerDataInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqb) ipChange.ipc$dispatch("d883883e", new Object[]{this});
        }
        return this.f31316a.getContainerDataInvoker();
    }

    @Override // tb.ejb
    public oqb getContainerInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqb) ipChange.ipc$dispatch("86aa58aa", new Object[]{this});
        }
        return this.f31316a.getContainerInvoker();
    }

    @Override // tb.ejb
    public e7c getFirstScreenConfigInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7c) ipChange.ipc$dispatch("97b1e364", new Object[]{this});
        }
        return this.f31316a.getFirstScreenConfigInvoker();
    }

    @Override // tb.ejb
    public cac getGlobalThemeInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cac) ipChange.ipc$dispatch("c06d6134", new Object[]{this});
        }
        return this.f31316a.getGlobalThemeInvoker();
    }

    @Override // tb.ejb
    public dzc getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzc) ipChange.ipc$dispatch("93ccde42", new Object[]{this});
        }
        return this.f31316a.getNaviBarInvoker();
    }

    @Override // tb.ejb
    public uzc getNetRequestInvoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzc) ipChange.ipc$dispatch("de53969c", new Object[]{this});
        }
        return this.f31316a.getNetRequestInvoke();
    }

    @Override // tb.ejb
    public j4d getOrderPreRequestInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4d) ipChange.ipc$dispatch("ee00ed9c", new Object[]{this});
        }
        return this.f31316a.getOrderPreRequestInvoker();
    }

    @Override // tb.ejb
    public m4d getOutLinkInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m4d) ipChange.ipc$dispatch("446de138", new Object[]{this});
        }
        return this.f31316a.getOutLinkInvoker();
    }

    @Override // tb.ejb
    public u7d getPassParamsInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7d) ipChange.ipc$dispatch("f9c352fc", new Object[]{this});
        }
        return this.f31316a.getPassParamsInvoker();
    }

    @Override // tb.ejb
    public sad getPopInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sad) ipChange.ipc$dispatch("1f31ddca", new Object[]{this});
        }
        return this.f31316a.getPopInvoker();
    }

    @Override // tb.ejb
    public hed getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hed) ipChange.ipc$dispatch("64e92110", new Object[]{this});
        }
        return this.f31316a.getPullDownRefreshInvoker();
    }

    @Override // tb.ejb
    public vkd getRocketInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkd) ipChange.ipc$dispatch("821d6ece", new Object[]{this});
        }
        return this.f31316a.getRocketInvoker();
    }

    @Override // tb.ejb
    public ssd getStayTimeInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssd) ipChange.ipc$dispatch("3a184ce", new Object[]{this});
        }
        return this.f31316a.getStayTimeInvoker();
    }

    @Override // tb.ejb
    public o1e getTopViewInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1e) ipChange.ipc$dispatch("cf762b1c", new Object[]{this});
        }
        return this.f31316a.getTopViewInvoker();
    }

    @Override // tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        return this.f31316a.getUtInvoker();
    }
}
