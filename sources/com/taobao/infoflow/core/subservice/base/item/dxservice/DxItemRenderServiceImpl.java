package com.taobao.infoflow.core.subservice.base.item.dxservice;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.List;
import tb.cfc;
import tb.eue;
import tb.fve;
import tb.jf5;
import tb.o18;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DxItemRenderServiceImpl implements IDxItemRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DxItemRenderServiceImpl";
    private jf5 dxCardRender;
    private final o18 dxCenter = new o18();
    private DXEngineConfig.b mDxEngineConfigBuilder;
    private IDxItemRenderService.a mDxRegisterListener;
    private cfc mInfoFlowContext;

    static {
        t2o.a(486539331);
        t2o.a(488636524);
    }

    private void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
        } else if (this.dxCardRender == null) {
            throw new IllegalArgumentException("信息流DX引擎未初始化！请先调用：initDx");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService, tb.rgc
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        checkInit();
        this.dxCardRender.bindData(view, baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService, tb.rgc
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        checkInit();
        return this.dxCardRender.createView(viewGroup, i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void downloadTemplate(List<BaseSectionModel> list, IDxItemRenderService.b bVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d87026", new Object[]{this, list, bVar});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        if (this.dxCardRender != null) {
            Application a2 = eue.a();
            if (a2 != null && (TBDeviceUtils.p(a2) || TBDeviceUtils.P(a2))) {
                z = false;
            }
            this.dxCenter.b(this.mInfoFlowContext, list, bVar, z);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void downloadTemplateWithoutPrefetch(List<BaseSectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fd8a21", new Object[]{this, list, bVar});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        if (this.dxCardRender != null) {
            this.dxCenter.b(this.mInfoFlowContext, list, bVar, false);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService, tb.rgc
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        checkInit();
        return this.dxCardRender.getViewType(baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public synchronized void initDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef6c4b", new Object[]{this});
        } else if (this.dxCardRender != null) {
            fve.e(TAG, "initDx 请勿重复初始化");
        } else if (this.mInfoFlowContext == null) {
            fve.e(TAG, "initDx mInfoFlowContext is null");
        } else {
            fve.e(TAG, "initDx");
            this.dxCenter.d(this.mInfoFlowContext, this.mDxEngineConfigBuilder, this.mDxRegisterListener);
            this.dxCardRender = this.dxCenter.c();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else {
            this.mInfoFlowContext = cfcVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.dxCenter.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService, tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        if (this.dxCardRender == null) {
            initDx();
        }
        jf5 jf5Var = this.dxCardRender;
        if (jf5Var != null) {
            jf5Var.preRender(context, baseSectionModel, z, i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.dxCenter.e();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789a24b", new Object[]{this, activity});
        } else {
            this.dxCenter.f(activity);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxEngineConfigBuilder(DXEngineConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2edef15", new Object[]{this, bVar});
        } else {
            this.mDxEngineConfigBuilder = bVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setDxEngineDesignScaleEnable(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33807f3e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.dxCenter.g(z, z2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService
    public void setOnDxRegisterListener(IDxItemRenderService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a7b2de", new Object[]{this, aVar});
        } else {
            this.mDxRegisterListener = aVar;
        }
    }
}
