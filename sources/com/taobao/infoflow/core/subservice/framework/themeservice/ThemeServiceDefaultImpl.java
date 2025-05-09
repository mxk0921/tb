package com.taobao.infoflow.core.subservice.framework.themeservice;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.cfc;
import tb.iqb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ThemeServiceDefaultImpl implements IThemeService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539721);
        t2o.a(488636652);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void preCreateTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setEnableCreateGlobalTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e32816", new Object[]{this, str});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setGlobalThemeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a748e3f", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public FrameLayout createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setVisibility(8);
        return frameLayout;
    }
}
