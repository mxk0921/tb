package com.taobao.infoflow.core.subservice.base.item.itemrenderservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import tb.cfc;
import tb.j6h;
import tb.lz7;
import tb.rgc;
import tb.t2o;
import tb.tof;
import tb.vgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ItemRenderServiceImpl implements IItemRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc mInfoFlowContext;
    private IItemRenderService.a mItemRenderFactory;
    private tof mItemRenderPresenter;
    private int mLoadMoreBottomOffset = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IItemRenderService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService.a
        public rgc a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rgc) ipChange.ipc$dispatch("4d5593c6", new Object[]{this, str});
            }
            rgc access$000 = ItemRenderServiceImpl.access$000(ItemRenderServiceImpl.this, str);
            if (access$000 != null) {
                return access$000;
            }
            return ItemRenderServiceImpl.access$100(ItemRenderServiceImpl.this, str);
        }
    }

    static {
        t2o.a(486539497);
        t2o.a(488636527);
    }

    public static /* synthetic */ rgc access$000(ItemRenderServiceImpl itemRenderServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("28ee45c9", new Object[]{itemRenderServiceImpl, str});
        }
        return itemRenderServiceImpl.createCustomItemRender(str);
    }

    public static /* synthetic */ rgc access$100(ItemRenderServiceImpl itemRenderServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("37c9f58a", new Object[]{itemRenderServiceImpl, str});
        }
        return itemRenderServiceImpl.createDefaultItemRender(str);
    }

    private rgc createCustomItemRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("706bfd95", new Object[]{this, str});
        }
        IItemRenderService.a aVar = this.mItemRenderFactory;
        if (aVar == null) {
            return null;
        }
        return aVar.a(str);
    }

    private rgc createDefaultItemRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgc) ipChange.ipc$dispatch("18a6887d", new Object[]{this, str});
        }
        if ("loading".equals(str)) {
            return new j6h(this.mInfoFlowContext, this.mLoadMoreBottomOffset);
        }
        if (str.contains(lz7.DRESS_UP_BIZ_CODE)) {
            return new lz7(this.mInfoFlowContext);
        }
        return null;
    }

    private IItemRenderService.a createItemRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IItemRenderService.a) ipChange.ipc$dispatch("a953a09b", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService
    public vgc getItemRenderPresenter(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vgc) ipChange.ipc$dispatch("47b9c62", new Object[]{this, cfcVar});
        }
        if (this.mItemRenderPresenter == null) {
            this.mItemRenderPresenter = new tof(cfcVar, createItemRenderFactory());
        }
        return this.mItemRenderPresenter;
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
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService
    public void setItemRenderFactory(IItemRenderService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7788c2f7", new Object[]{this, aVar});
        } else {
            this.mItemRenderFactory = aVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService
    public void setLoadMoreBottomOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3210b921", new Object[]{this, new Integer(i)});
        } else {
            this.mLoadMoreBottomOffset = i;
        }
    }
}
