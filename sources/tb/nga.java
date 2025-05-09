package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.h5tabframe.H5TabFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.wbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nga implements wbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699930);
        t2o.a(806356114);
    }

    @Override // tb.wbc
    public View a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("60f2a8fa", new Object[]{this, obj});
        }
        if (obj instanceof H5TabFrame) {
            return ((H5TabFrame) obj).getView();
        }
        return null;
    }

    @Override // tb.wbc
    public wbc.a b(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbc.a) ipChange.ipc$dispatch("b56ad785", new Object[]{this, context, extraGoodsTabItem, new Boolean(z), tBLiveDataModel});
        }
        if (extraGoodsTabItem == null) {
            jbu.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab item = null");
            return null;
        } else if (!TextUtils.equals("h5", extraGoodsTabItem.type)) {
            jbu.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab != h5, key = " + qfa.c(extraGoodsTabItem));
            return null;
        } else if (TextUtils.isEmpty(extraGoodsTabItem.url)) {
            jbu.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab url = null");
            return null;
        } else {
            H5TabFrame h5TabFrame = new H5TabFrame(context, z, tBLiveDataModel, vx9.d());
            h5TabFrame.onBindData(tBLiveDataModel);
            h5TabFrame.init(extraGoodsTabItem.url);
            jbu.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] frame create success, url = " + extraGoodsTabItem.url);
            return h5TabFrame;
        }
    }

    @Override // tb.wbc
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else if (obj instanceof H5TabFrame) {
            ((H5TabFrame) obj).onDestroy();
        }
    }
}
