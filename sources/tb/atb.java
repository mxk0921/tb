package tb;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface atb {
    public static final String EXP_KEY_COMMON_PRELOAD_PLAY = "commonPreloadPlay";
    public static final String EXP_KEY_FROM_LAUNCHER = "isFromLauncher";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_ACTIVE_TS = "full_page_card_life_active_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_APPEAR_TS = "full_page_card_life_appear_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_BIND_TS = "full_page_card_life_bind_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_DISAPPEAR_TS = "full_page_card_life_disappear_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_DISATIVE_TS = "full_page_card_life_disactive_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_RECYCLE_TS = "full_page_card_life_recycle_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_WILL_ACTIVE_TS = "full_page_card_life_will_active_ts";
    public static final String EXP_KEY_FULL_PAGE_CARD_LIFE_WILL_DISACTIVE_TS = "full_page_card_life_will_disactive_ts";
    public static final String EXP_KEY_FULL_PAGE_CONTENT_TYPE = "full_page_content_type";
    public static final String EXP_KEY_FULL_PAGE_DW_CREATE_TS = "full_page_dw_create_ts";
    public static final String EXP_KEY_FULL_PAGE_DW_DESTROY_TS = "full_page_dw_destroy_ts";
    public static final String EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_ID = "full_page_dw_has_video_id";
    public static final String EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_RES = "full_page_dw_has_video_res";
    public static final String EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_URL = "full_page_dw_has_video_url";
    public static final String EXP_KEY_FULL_PAGE_DW_P2FF_TS = "full_page_dw_p2ff_ts";
    public static final String EXP_KEY_FULL_PAGE_DW_START_TS = "full_page_dw_start_ts";
    public static final String EXP_KEY_FULL_PAGE_INDEX = "full_page_index";
    public static final String EXP_KEY_FULL_PAGE_IS_APPEAR_PLAY = "full_page_is_appear_play";
    public static final String EXP_KEY_FULL_PAGE_IS_FINGER_LEAVE_PLAY = "full_page_is_finger_leave_play";
    public static final String EXP_KEY_FULL_PAGE_PREDOWNLOAD_CANEL_INFO = "full_page_predownload_cancel_info";
    public static final String EXP_KEY_FULL_PAGE_PREDOWNLOAD_ERROR_INFO = "full_page_predownload_error_info";
    public static final String EXP_KEY_FULL_PAGE_PREDOWNLOAD_FINISH_TS = "full_page_predownload_finish_ts";
    public static final String EXP_KEY_FULL_PAGE_PREDOWNLOAD_SIZE = "full_page_predownload_size";
    public static final String EXP_KEY_FULL_PAGE_PREDOWNLOAD_START_TS = "full_page_predownload_start_ts";
    public static final String EXP_KEY_FULL_PAGE_TAB_NAME = "full_page_tab_name";
    public static final String EXP_KEY_FULL_PAGE_TITLE = "full_page_title";
    public static final String EXP_KEY_FULL_PAGE_UID = "full_page_uid";
    public static final String EXP_KEY_GG_LIVE_WARMUP_BUCKET_ID = "gg_live_warmup_bucketid";
    public static final String EXP_KEY_IS_HUITUI = "isHuitui";
    public static final String EXP_KEY_IS_LOCAL_VIDEO = "isLocalVideo";
    public static final String EXP_KEY_LAUNCHER_NODE_URL = "launcherNodeUrl";
    public static final String EXP_KEY_PRECREATED_DW = "precreatedw";
    public static final String EXP_KEY_PRELOAD_REAL_PLAY = "preloadRealPlay";
    public static final String EXP_KEY_PROCESS_LAUNCHER_FLAG = "processLauncherFlag";
    public static final String EXP_KEY_SUB_BUSINESS_TYPE = "sub_business_type";
    public static final String EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo = "useSoftwareForFirstVideo";
    public static final String EXP_KEY_VIDEO_ACTIONTYPE = "videoActionType";
    public static final String KIRIN_STD_BUSINESS_TYPE = "guangguang";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        a a(boolean z);

        a b(boolean z);
    }

    void A(eub eubVar);

    boolean B();

    void C(boolean z);

    void D(ytb ytbVar);

    boolean E();

    void a();

    void b();

    void c(HashMap<String, String> hashMap);

    void d(qtb qtbVar);

    void destroy();

    void e(HashMap<String, String> hashMap);

    void f(int i, int i2);

    void g(dub dubVar);

    long getDuration();

    int getVideoState();

    ViewGroup getView();

    Bitmap h();

    void i(DWInstanceType dWInstanceType);

    void j(aub aubVar);

    void k(int i);

    void l(nj9 nj9Var);

    void m(float f, float f2, int i, int i2);

    void mute(boolean z);

    void n(boolean z);

    Map<String, String> o();

    void p(HashMap<String, String> hashMap);

    void pauseVideo();

    void playVideo();

    void prepareToFirstFrame();

    void q(String str, boolean z, HashMap<String, String> hashMap);

    void s(ImageView imageView);

    void seekTo(int i);

    void setBizCode(String str);

    void setPlayRate(float f);

    void setVideoLoop(boolean z);

    void setVolume(float f);

    void start();

    String t();

    void u(MediaLiveWarmupConfig mediaLiveWarmupConfig);

    void v(Map<String, String> map);

    void w(int i, boolean z);

    jgi x();

    boolean y();

    void z(boolean z);
}
