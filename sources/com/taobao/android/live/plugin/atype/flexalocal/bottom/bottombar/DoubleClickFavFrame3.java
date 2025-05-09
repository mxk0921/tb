package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav.DoubleClickFavView2;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.nh4;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.uyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DoubleClickFavFrame3 extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DoubleClickFavView2 mDoubleClickFavView;

    static {
        t2o.a(295698451);
        t2o.a(806355016);
    }

    public DoubleClickFavFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(DoubleClickFavFrame3 doubleClickFavFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/DoubleClickFavFrame3");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_room_double_click_fav_layout3_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taolive.taolive.room.double_click_favor_show", uyg.EVENT_CLICK_FAVOR_IN_MIDDLE, uyg.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.h().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.h().a(this);
        this.mDoubleClickFavView.checkFavorPicByUrl(tBLiveDataModel.mVideoInfo.favorImg);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        DoubleClickFavView2 doubleClickFavView2;
        DoubleClickFavView2 doubleClickFavView22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taolive.taolive.room.double_click_favor_show".equals(str)) {
            if ((obj instanceof PointF) && (doubleClickFavView22 = this.mDoubleClickFavView) != null) {
                doubleClickFavView22.setMaxRatio(1.5f);
                this.mDoubleClickFavView.showDoubleClickFav((PointF) obj);
            }
        } else if (uyg.EVENT_CLICK_FAVOR_IN_MIDDLE.equalsIgnoreCase(str)) {
            if ((obj instanceof PointF) && (doubleClickFavView2 = this.mDoubleClickFavView) != null) {
                doubleClickFavView2.setMaxRatio(1.2f);
                this.mDoubleClickFavView.showDoubleClickFav((PointF) obj);
            }
        } else if (uyg.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE.equalsIgnoreCase(str) && (obj instanceof String)) {
            this.mDoubleClickFavView.checkFavorPicByUrl((String) obj);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        if (nh4.z()) {
            super.onViewCreated(view);
        }
        this.mDoubleClickFavView = (DoubleClickFavView2) findViewById(R.id.taolive_room_double_click_view);
    }
}
