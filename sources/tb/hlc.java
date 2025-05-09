package tb;

import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface hlc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str);

        void onGetVideoInfoFail(String str);

        void onGetVideoInfoSuccess(VideoInfo videoInfo, String str);
    }

    void destroy();

    void getVideoInfo(jg7 jg7Var, String str, a aVar);

    void setIRemoteExtendListener(IRemoteExtendListener iRemoteExtendListener);
}
