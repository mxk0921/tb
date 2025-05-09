package com.taobao.android.fluid.business.videocollection;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.ArrayList;
import tb.cz3;
import tb.dgf;
import tb.hz3;
import tb.iim;
import tb.jz3;
import tb.kon;
import tb.pep;
import tb.prp;
import tb.sv2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CollectionService implements ICollectionService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cz3 mCollectionCacheManager;
    private hz3 mCollectionPoplayerManager;
    private final jz3 mCollectionServiceConfig = new jz3();
    private b mCollectionVideoPlayManager;
    private final FluidContext mFluidContext;

    static {
        t2o.a(468713659);
        t2o.a(468713664);
    }

    public CollectionService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService, com.taobao.android.fluid.business.videocollection.b
    public void cancelPlayCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a393b23", new Object[]{this});
            return;
        }
        b bVar = this.mCollectionVideoPlayManager;
        if (bVar != null) {
            bVar.cancelPlayCollectionNextVideo();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean checkDialogPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743774a7", new Object[]{this})).booleanValue();
        }
        return this.mCollectionPoplayerManager.b();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean checkPopupFisrtTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95201726", new Object[]{this})).booleanValue();
        }
        return this.mCollectionPoplayerManager.c();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean checkResizeVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f930a", new Object[]{this})).booleanValue();
        }
        return this.mCollectionPoplayerManager.d();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean checkUseNativePopupCollection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdccbbbf", new Object[]{this})).booleanValue();
        }
        return this.mCollectionPoplayerManager.e();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService, com.taobao.android.fluid.business.videocollection.b
    public void clearCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba26c4", new Object[]{this});
        } else {
            this.mCollectionVideoPlayManager.clearCollectionNextVideo();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public ArrayList<a> getCollectionDataCache(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("beacf7f2", new Object[]{this, new Integer(i)});
        }
        cz3 cz3Var = this.mCollectionCacheManager;
        if (cz3Var != null) {
            return cz3Var.b(i);
        }
        return new ArrayList<>();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService, com.taobao.android.fluid.business.videocollection.b
    public kon.h getCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("d503a28f", new Object[]{this});
        }
        b bVar = this.mCollectionVideoPlayManager;
        if (bVar != null) {
            return bVar.getCollectionNextVideo();
        }
        return null;
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public int getCollectionTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30c8fd8a", new Object[]{this})).intValue();
        }
        return this.mCollectionCacheManager.c();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public jz3 getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jz3) ipChange.ipc$dispatch("27ccbe4", new Object[]{this});
        }
        return this.mCollectionServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void insertToCollectionDataCacheAndDetailList(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18a645b", new Object[]{this, hVar});
            return;
        }
        cz3 cz3Var = this.mCollectionCacheManager;
        if (cz3Var != null) {
            cz3Var.d(hVar);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void invalidCollectionCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7cb294", new Object[]{this});
        } else if (this.mCollectionPoplayerManager.f() != null) {
            this.mCollectionPoplayerManager.f().c();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean isActiveCardLastCollection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a6087f", new Object[]{this})).booleanValue();
        }
        return this.mCollectionCacheManager.e();
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean isCollectionPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2952f22", new Object[]{this})).booleanValue();
        }
        pep sessionParams = ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            return TextUtils.equals(sessionParams.b, dgf.GUANGGUANG_COLLECTION);
        }
        return false;
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean isCollectionScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e539408f", new Object[]{this})).booleanValue();
        }
        return ((IDataService) this.mFluidContext.getService(IDataService.class)).getConfig().j().H;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mCollectionCacheManager = new cz3(this.mFluidContext);
        this.mCollectionVideoPlayManager = new a(this.mFluidContext);
        this.mCollectionPoplayerManager = new hz3(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void openForClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb86b0", new Object[]{this});
        } else {
            this.mCollectionPoplayerManager.g();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void openForPageEnter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98695b1", new Object[]{this});
        } else {
            this.mCollectionPoplayerManager.h();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService, com.taobao.android.fluid.business.videocollection.b
    public void playCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24bdfd", new Object[]{this});
        } else {
            this.mCollectionVideoPlayManager.playCollectionNextVideo();
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void putCollectionDataCache(a aVar) {
        cz3 cz3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12ecb4d", new Object[]{this, aVar});
        } else if (isCollectionScene() && (cz3Var = this.mCollectionCacheManager) != null) {
            cz3Var.f(aVar);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService, com.taobao.android.fluid.business.videocollection.b
    public void requestCollectionNextVideo(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb74fc5", new Object[]{this, str, bVar});
        } else {
            this.mCollectionVideoPlayManager.requestCollectionNextVideo(str, bVar);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void setCollectionTotal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62aa5758", new Object[]{this, new Integer(i)});
        } else {
            this.mCollectionCacheManager.g(i);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void setVideoResizeForCollectionPopLayer(FluidContext fluidContext, iim iimVar, View view, prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf91f53", new Object[]{this, fluidContext, iimVar, view, prpVar});
        } else {
            this.mCollectionPoplayerManager.j(iimVar, view, prpVar);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public boolean tryReuseCollectionDataCacheForDetailList(int i, sv2<kon.h> sv2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb9ff01", new Object[]{this, new Integer(i), sv2Var, new Boolean(z)})).booleanValue();
        }
        cz3 cz3Var = this.mCollectionCacheManager;
        if (cz3Var != null) {
            return cz3Var.i(i, sv2Var, z);
        }
        return false;
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void updateCollectionDialog(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c128b6a", new Object[]{this, hVar});
        } else {
            this.mCollectionPoplayerManager.l(hVar);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.ICollectionService
    public void updateDetailListAndScrollTo(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e36eb", new Object[]{this, str, new Integer(i)});
        } else {
            this.mCollectionCacheManager.j(str, i);
        }
    }
}
