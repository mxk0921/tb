package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IEditionService;
import com.taobao.infoflow.protocol.subservice.biz.ILoginService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hng implements h6d, zxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f20762a;

    public hng(cfc cfcVar) {
        this.f20762a = cfcVar;
    }

    public final boolean a(cfc cfcVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43021583", new Object[]{this, cfcVar})).booleanValue();
        }
        boolean d = d(cfcVar);
        if (c(cfcVar, d) || d) {
            z = true;
        } else {
            z = false;
        }
        if (b(cfcVar, z) || z) {
            return true;
        }
        return false;
    }

    public final boolean b(cfc cfcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5c6dc2d", new Object[]{this, cfcVar, new Boolean(z)})).booleanValue();
        }
        IEditionService iEditionService = (IEditionService) cfcVar.a(IEditionService.class);
        if (iEditionService == null) {
            return false;
        }
        return iEditionService.editionStatusTrigger(z);
    }

    public final boolean c(cfc cfcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7423a58", new Object[]{this, cfcVar, new Boolean(z)})).booleanValue();
        }
        ILoginService iLoginService = (ILoginService) cfcVar.a(ILoginService.class);
        if (iLoginService == null) {
            return false;
        }
        return iLoginService.loginStatusTrigger(z);
    }

    public final boolean d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("557fb664", new Object[]{this, cfcVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null || xt6.a(containerData)) {
            return iContainerDataService.triggerEvent("PageEnter", null);
        }
        return false;
    }

    @Override // tb.h6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // tb.zxd
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            a(this.f20762a);
        }
    }

    @Override // tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            a(this.f20762a);
        }
    }

    @Override // tb.h6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
        }
    }

    @Override // tb.h6d
    public /* synthetic */ void onColdStartResume() {
    }

    @Override // tb.h6d
    public /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }
}
