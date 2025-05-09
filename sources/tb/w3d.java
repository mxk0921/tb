package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface w3d {
    Context getContext();

    cdr getFrameContext();

    cba getGlobalContext();

    OpenArchSingleEntityAdapter getOpenArchEntityAdapter();

    RecModel getRecModel();

    TBLiveBizDataModel getTBLiveBizDataModel();

    String getUniStr();

    Map<String, String> getUtParams();

    void initParams(Object obj);

    void mute(boolean z);

    void needPresentAvatarPage(Map<String, String> map);

    void onBindView(RecModel recModel);

    void onDestroy();

    void onDidAppear();

    void onDidDisappear();

    void onPause();

    void onResume();

    void onStart();

    void onStop(boolean z);

    void onViewHolderDestroy();

    void onViewHolderDidAppear();

    void onViewHolderDidDisappear();

    void onViewHolderWillAppear();

    void onViewHolderWillDisappear();

    void onViewHolderWillLoad(RecModel recModel);

    void onWillAppear();

    void onWillDisappear();

    void reportRequest();

    void retryVideo();

    void setContainerOffset(JSONObject jSONObject);

    void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy);

    void updatePerformanceTrack(String str, String str2);

    void updateUserTrackData(Map<String, String> map);
}
