package com.taobao.tao.topmultitab.service.bgcontainer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cfc;
import tb.t2o;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BGContainerServiceImpl implements IBGContainerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BGContainerView mBGContainerView;
    private wcc mHomePageContext;

    static {
        t2o.a(729810158);
        t2o.a(729810161);
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void createView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ae60a", new Object[]{this, view});
        } else if (view instanceof BGContainerView) {
            BGContainerView bGContainerView = (BGContainerView) view;
            this.mBGContainerView = bGContainerView;
            bGContainerView.setHomePageContext(this.mHomePageContext);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public Bitmap getBGContainerScreenShot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1200c331", new Object[]{this});
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bGContainerView.getWidth(), this.mBGContainerView.getHeight(), Bitmap.Config.ARGB_8888);
        this.mBGContainerView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public int getCurrentBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView == null) {
            return -1;
        }
        return bGContainerView.getCurrentBgViewId();
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public int getLastHeaderScrollDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67292df5", new Object[]{this})).intValue();
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView == null) {
            return 0;
        }
        return bGContainerView.getLastHeaderScrollDistance();
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.scrollToPosition(0);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void setBGContainerVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc50410", new Object[]{this, new Integer(i)});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.setBGContainerVisibility(i);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void setBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae059bdf", new Object[]{this, view});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.setBgView(view);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void updateBGContainerAlpha(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9727ab6f", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.updatePullStatus(i, f);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void updateBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3161acd8", new Object[]{this, view});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.updateBgView(view);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService
    public void updateHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bebf82", new Object[]{this});
            return;
        }
        BGContainerView bGContainerView = this.mBGContainerView;
        if (bGContainerView != null) {
            bGContainerView.updateHeaderView();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
        } else {
            this.mHomePageContext = wccVar;
        }
    }
}
