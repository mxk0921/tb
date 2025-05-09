package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class sj4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_GROUP_NAME = "shortvideo";
    public static final String CARD_TYPE_GGLIVESEGMENT = "ggLiveSegment";
    public static final int DEFAULT_HEIGHT = 1200;
    public static final int DEFAULT_WIDTH = 1200;
    public static final String FOLLOW_TAB_VIDEO_GUANGGUANG_LOADING = "https://gw.alicdn.com/imgextra/i4/O1CN01n4vQBy1QdaPTBJZBf_!!6000000001999-2-tps-360-78.png";
    public static final String FOLLOW_TAB_VIDEO_LOADING = "https://gw.alicdn.com/imgextra/i2/O1CN01N5UtUh24e7iXRAVvt_!!6000000007415-2-tps-360-78.png";
    public static final String GAME_SPM = "a310p.13800399.hudong-lite-2023.";
    public static final int HALF_VALUE = 2;
    public static final String IS_HOOK_VIDEO_END = "isHook";
    public static final String KEY_VIDEOACTIONTYPE = "videoActionType";
    public static final String KEY_VIDEO_UPDATE_PARAMS = "updatePlayEx";
    public static final int MULTI_TAB_FOLLOW_INDEX = 1;
    public static final int MULTI_TAB_RECOMMEND_INDEX = 0;
    public static final String NATIVE_ALBUM = "enableNativeAlbum";
    public static final String NOTIFY_TNODE_NEXT_VIDEO = "next";
    public static final String NOTIFY_TNODE_VIDEO_LOOP = "loop";
    public static final String NOTIFY_TNODE_VIDEO_NEXT_STATE = "next_state";
    public static final String PICTURE_TYPE_LIVE_PHOTO = "LIVE_PHOTO";
    public static final String PLAY_SCENES = "videoFullScreen";
    public static final String TAB2_CONTAINER_TYPE_FOLLOW = "newFollow";
    public static final String TAB2_CONTAINER_TYPE_LIVE_LARGE = "livelarge";
    public static final String TAB2_CONTAINER_TYPE_VIDEO = "video";
    public static final String TAB2_NATIVE = "tab2native";
    public static final String TAB2_NATIVE_VALUE = "true";
    public static final String TAB2_SOURCE_OUTSIDE = "outside";
    public static final String UPDATE_DATA_MSG_FOR_GLOBAL_H5 = "updateDataMsgForGlobalH5";
    public static final String URL_ENABLE_SHARE_PALYER = "1";
    public static final String VIDEO_ACTION_TYPE_INIT = "init";
    public static final String VIDEO_ACTION_TYPE_REFRESH_INIT = "refreshInit";
    public static final String VIDEO_ACTION_TYPE_SHAREPLAYER = "sharePlayer";
    public static final String VIDEO_ACTION_TYPE_UPDOWNSWITCH = "updownSwitch";
    public static final String VIDEO_FINISHED_STATE = "finished";
    public static final String VIDEO_PAUSE_STATE = "pause";
    public static final String VIDEO_PLAY_STATE = "play";
    public static final String WEEX_STATE_CONSUME = "weexStateConsume";
    public static final String WEEX_STATE_NOT_CONSUME = "weexStateNotConsume";
    public static final String WEEX_STATE_NOT_EXIST = "weexStateNotExist";

    /* renamed from: a  reason: collision with root package name */
    public static final String f28084a = "a310p.13800399.0.0";

    static {
        t2o.a(468713751);
    }

    public static void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b65a888", new Object[]{map});
        } else if (map != null) {
            map.put(FluidSDK.FLUID_SDK_FLAG, "1");
            map.put(wr9.FLUID_SDK_REMOTE_VERSION, wr9.FLUID_SDK_REMOTE_VERSION_VALUE);
            map.put(TAB2_NATIVE, "true");
            if (b93.f()) {
                map.put(NATIVE_ALBUM, "true");
            }
            map.putAll(c5g.h());
        }
    }
}
