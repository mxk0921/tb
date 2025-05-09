package com.taobao.taolive.room.mediaplatform.container.h5;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.ItemGroupPageInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveGoodsWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private static LiveItem sLiveItem;

    static {
        t2o.a(779092981);
    }

    private boolean checkAggregationParam(String str) {
        ItemGroupPageInfo itemGroupPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb2d0a48", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (itemGroupPageInfo = (ItemGroupPageInfo) JSON.parseObject(str, ItemGroupPageInfo.class)) != null && itemGroupPageInfo.checkInfo()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(TBLiveGoodsWVPlugin tBLiveGoodsWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/container/h5/TBLiveGoodsWVPlugin");
    }

    public static void setLiveItem(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ae80c3", new Object[]{liveItem});
        } else {
            sLiveItem = liveItem;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r9.equals("showGoodsAggregationList") == false) goto L_0x0032;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r9, java.lang.String r10, android.taobao.windvane.jsbridge.WVCallBackContext r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.mediaplatform.container.h5.TBLiveGoodsWVPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
