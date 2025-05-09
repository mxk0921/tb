package tb;

import com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface alc {
    Map<String, String> buildCustomerKLifecycleParam();

    Map<Object, Object> getCustomerPageUTExtParams();

    ImmersiveManager getImmersiveManager();

    a getLiveSecondRefreshManager();

    n getNode();

    g3l getOpenConfig();

    kxd getTab2ServiceDelegate();

    TaoliveOpenLiveRoom getTaoliveOpenLiveRoom();

    g2e getTrackTint();

    p3h getViewParams();

    void onCleanPreloadData();

    void onInteractiveMsg(Map<Object, Object> map, Map<Object, Object> map2);

    void onLiveDetailSuccess();

    void rootViewHeightChange(boolean z);

    void sendLiveRoomMessage(String str, Map<String, Object> map);

    void sendMuteStateMessage(boolean z);

    void sendScrollStateMessage(boolean z, boolean z2, boolean z3);

    void setImmersiveMode(boolean z);

    void setScrollEnable(boolean z);

    void updateCurrentLiveRoomInfo(VideoInfo videoInfo, String str, Boolean bool);

    void updatePageName(String str);

    void updatePageProperties(Object obj, Map<String, String> map);
}
