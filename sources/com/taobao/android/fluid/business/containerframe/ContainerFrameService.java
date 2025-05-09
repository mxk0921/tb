package com.taobao.android.fluid.business.containerframe;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.o6d;
import tb.t2o;
import tb.uj0;
import tb.x7w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ContainerFrameService implements IContainerFrameService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private uj0 mAlbumDetailFrame;
    private final FluidContext mFluidContext;
    private x7w mGoodsListFrame;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/ContainerFrameService$1");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            if (ContainerFrameService.access$000(ContainerFrameService.this) != null) {
                ContainerFrameService.access$000(ContainerFrameService.this).c();
                ContainerFrameService.access$002(ContainerFrameService.this, null);
            }
            if (ContainerFrameService.access$100(ContainerFrameService.this) != null) {
                ContainerFrameService.access$100(ContainerFrameService.this).c();
                ContainerFrameService.access$102(ContainerFrameService.this, null);
            }
        }
    }

    static {
        t2o.a(468713478);
        t2o.a(468713480);
    }

    public ContainerFrameService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ x7w access$000(ContainerFrameService containerFrameService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7w) ipChange.ipc$dispatch("e6122c83", new Object[]{containerFrameService});
        }
        return containerFrameService.mGoodsListFrame;
    }

    public static /* synthetic */ x7w access$002(ContainerFrameService containerFrameService, x7w x7wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7w) ipChange.ipc$dispatch("282cb19", new Object[]{containerFrameService, x7wVar});
        }
        containerFrameService.mGoodsListFrame = x7wVar;
        return x7wVar;
    }

    public static /* synthetic */ uj0 access$100(ContainerFrameService containerFrameService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uj0) ipChange.ipc$dispatch("b1dc7cb1", new Object[]{containerFrameService});
        }
        return containerFrameService.mAlbumDetailFrame;
    }

    public static /* synthetic */ uj0 access$102(ContainerFrameService containerFrameService, uj0 uj0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uj0) ipChange.ipc$dispatch("45392f6a", new Object[]{containerFrameService, uj0Var});
        }
        containerFrameService.mAlbumDetailFrame = uj0Var;
        return uj0Var;
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void handleAlbumDetail(AlbumData albumData, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca755f0", new Object[]{this, albumData, aVar});
        } else if (aVar != null && albumData != null && !TextUtils.isEmpty(albumData.type) && (e = aVar.e()) != null) {
            if (this.mAlbumDetailFrame == null) {
                uj0 uj0Var = new uj0(this.mFluidContext);
                this.mAlbumDetailFrame = uj0Var;
                uj0Var.t(((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAlbumDetailStub());
            }
            this.mAlbumDetailFrame.r(albumData, e);
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void hideCommentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aaf937", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public boolean isAlbumDetailFrameShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a3d0a59", new Object[]{this})).booleanValue();
        }
        uj0 uj0Var = this.mAlbumDetailFrame;
        if (uj0Var == null || !uj0Var.b()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public boolean isGoodListShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12426e4b", new Object[]{this})).booleanValue();
        }
        x7w x7wVar = this.mGoodsListFrame;
        if (x7wVar == null || !x7wVar.b()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        } else {
            ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new a());
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void onGoodsClick(a.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469dc68c", new Object[]{this, dVar, str});
            return;
        }
        if (this.mGoodsListFrame == null) {
            x7w x7wVar = new x7w(this.mFluidContext);
            this.mGoodsListFrame = x7wVar;
            x7wVar.n(((IContainerService) this.mFluidContext.getService(IContainerService.class)).getGoodListStub());
        }
        this.mGoodsListFrame.o(str);
        this.mGoodsListFrame.j(dVar);
        this.mGoodsListFrame.l();
    }
}
