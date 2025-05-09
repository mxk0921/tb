package tb;

import android.content.Context;
import android.view.View;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface wbc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    View a(Object obj);

    a b(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, boolean z, TBLiveDataModel tBLiveDataModel);

    void destroy(Object obj);
}
