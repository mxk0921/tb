package tv.danmaku.ijk.media.player;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.g4;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.taobao.application.common.IApmEventListener;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.a;
import com.taobao.taobaoavsdk.util.BluetoothStateBroadcastReceive;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.vpm.VPMManagerInstance;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a7m;
import tb.atb;
import tb.c15;
import tb.c21;
import tb.cq;
import tb.dq;
import tb.e2n;
import tb.eq;
import tb.ew0;
import tb.f7l;
import tb.feh;
import tb.gf4;
import tb.gq;
import tb.ja1;
import tb.kjb;
import tb.lya;
import tb.mya;
import tb.pgi;
import tb.r7t;
import tb.t2o;
import tb.tug;
import tb.vzc;
import tb.xau;
import tb.xsj;
import tb.z5r;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TaobaoMediaPlayer extends MonitorMediaPlayer implements kjb, vzc, eq {
    public static final String AUDIO_OFF_KEY = "audioOff";
    public static final String AUDIO_ON_KEY = "audioOn";
    public static final int FFP_PROP_ENABLE_FALLBACK_TO_SOUNDTOUCH = 20144;
    public static final int FFP_PROP_ENABLE_SOUNDTOUCH = 20139;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_COEF = 12002;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_INPUT_LOUDNESS = 90001;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_OUTPUT_LOUDNESS = 90002;
    public static final int FFP_PROP_FLOAT_AUDIO_GAIN_VALUE = 90000;
    public static final int FFP_PROP_FLOAT_AVG_FPS_DIFF_THRESHOLD = 22244;
    public static final int FFP_PROP_FLOAT_CDN_BITRATE_FACTOR = 140201;
    public static final int FFP_PROP_FLOAT_CDN_PLAYING_SPEED_FACTOR = 140200;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_ADVANCED_THRESHOLD = 22242;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_BASE_THRESHOLD = 22241;
    public static final int FFP_PROP_FLOAT_DROP_PKT_COUNT_RESUME_STEP = 22240;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_1080 = 140102;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_720 = 140103;
    public static final int FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_DEFAULT = 140101;
    public static final int FFP_PROP_FLOAT_PANO_FOV = 14001;
    public static final int FFP_PROP_FLOAT_PANO_FOV_PARAM_CHANGE = 14004;
    public static final int FFP_PROP_FLOAT_PANO_LATITUDE = 14002;
    public static final int FFP_PROP_FLOAT_PANO_LONGITUDE = 14003;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_FLOAT_RESUME_PKT_COUNT_BASE_THRESHOLD = 22243;
    public static final int FFP_PROP_FLOAT_SOURCER_PIPE_BUFFERING_RATIO = 35168;
    public static final int FFP_PROP_FLOAT_SOURCER_PIPE_START_RATIO = 35167;
    public static final int FFP_PROP_FLOAT_SYNC_PTS = 10006;
    public static final int FFP_PROP_FLOAT_VIDEO_DECODE_FPS_INTERVAL = 22225;
    public static final int FFP_PROP_FLOAT_VIDEO_DOWNLOAD_FPS_INTERVAL = 22224;
    public static final int FFP_PROP_FLOAT_VIDEO_FORMAT_FPS = 22230;
    public static final int FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL = 22226;
    public static final int FFP_PROP_FLOAT_VOLUME = 12001;
    public static final int FFP_PROP_INT64_ALLOW_LIVE_VIDEO_STREAM_INDEX_CHANGE = 11030;
    public static final int FFP_PROP_INT64_ANDROID_SW_RENDER_RGB = 11019;
    public static final int FFP_PROP_INT64_ARTC_SUPPORT_AUDIO_ONLY = 60006;
    public static final int FFP_PROP_INT64_ARTP_BITRATE = 21995;
    public static final int FFP_PROP_INT64_ARTP_COMMON_TRACE_INFO = 21996;
    public static final int FFP_PROP_INT64_ARTP_DLIB_PATH = 21802;
    public static final int FFP_PROP_INT64_ARTP_RECV_LOSS_RATE = 21904;
    public static final int FFP_PROP_INT64_ARTP_USE_RELATIVE_PTS = 21908;
    public static final int FFP_PROP_INT64_ARTP_USE_WEAK_NET_FLAG = 21997;
    public static final int FFP_PROP_INT64_AUDIORENDER_STALL_TIME_NEW = 80087;
    public static final int FFP_PROP_INT64_AUDIOTRACK_SET_VOLUME_FAIL_COUNT = 80090;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_DECODER_TYPE = 11011;
    public static final int FFP_PROP_INT64_AUDIO_DISABLE = 50001;
    public static final int FFP_PROP_INT64_AUDIO_MIN_BUFFER_SIZE = 40003;
    public static final int FFP_PROP_INT64_AUDIO_PROCESSOR_TYPE = 11013;
    public static final int FFP_PROP_INT64_AUDIO_RENDERER_TYPE = 11015;
    public static final int FFP_PROP_INT64_AUDIO_RENDERING_STALL_TIME = 80054;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_FALLBACK_16BIT = 80081;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_FPS = 80080;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_FRAME_LENGTH = 80059;
    public static final int FFP_PROP_INT64_AUDIO_RENDER_SAMPLE_RATE = 80060;
    public static final int FFP_PROP_INT64_AUDIO_STATE_NOTIFY_GAP = 22902;
    public static final int FFP_PROP_INT64_AUDIO_TIMESTAMP_MIN_POLL_TIME = 80042;
    public static final int FFP_PROP_INT64_AVFORMAT_FIRST_OPEN_TS = 20127;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_COUNT = 20126;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_TIME = 20122;
    public static final int FFP_PROP_INT64_AVFORMAT_OPEN_TOTAL_TIME = 20125;
    public static final int FFP_PROP_INT64_AVFORMAT_STREAM_INFO_TIME = 20123;
    public static final int FFP_PROP_INT64_AVG_BITRATE = 20115;
    public static final int FFP_PROP_INT64_AVG_BITRATE_BY_ESTIMATED = 20118;
    public static final int FFP_PROP_INT64_AVG_BITRATE_FROM_MEDIA = 20117;
    public static final int FFP_PROP_INT64_AVG_DECODER_VIDEO_FPS = 20113;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_SPEED = 21009;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_TIME = 21010;
    public static final int FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS = 20112;
    public static final int FFP_PROP_INT64_AVG_VIDEO_FPS = 20114;
    public static final int FFP_PROP_INT64_AVSYNC_TIME = 80088;
    public static final int FFP_PROP_INT64_BLUETOOTH_CONNECT = 80045;
    public static final int FFP_PROP_INT64_BUFFER_MONITOR_IGNORE_BUFFERING = 11026;
    public static final int FFP_PROP_INT64_CHECK_INPUTBUF_SIZE = 60005;
    public static final int FFP_PROP_INT64_COLOR_PRIMARIES = 15001;
    public static final int FFP_PROP_INT64_COLOR_RANGE = 15002;
    public static final int FFP_PROP_INT64_COLOR_SPACE = 15003;
    public static final int FFP_PROP_INT64_COMPLETE_DONE_SEEK = 60004;
    public static final int FFP_PROP_INT64_CPU_IS_QTI_CHIP = 18000;
    public static final int FFP_PROP_INT64_CREATE_AUDIO_DECODER_ERROR = 22200;
    public static final int FFP_PROP_INT64_CURRENT_AUDIO_BITRATE = 20143;
    public static final int FFP_PROP_INT64_CURRENT_VIDEO_BITRATE = 20142;
    public static final int FFP_PROP_INT64_DECODER_ENABLE_DYNAMIC_RELOAD = 11022;
    public static final int FFP_PROP_INT64_DECODE_SETUP_TIME = 22007;
    public static final int FFP_PROP_INT64_DISABLE_ARTC_RTT_STATISTIC = 11054;
    public static final int FFP_PROP_INT64_DISABLE_AUDIO_CNT_STATISTIC = 11053;
    public static final int FFP_PROP_INT64_DISABLE_AUDIO_SLOW_PLAY = 80063;
    public static final int FFP_PROP_INT64_DISABLE_COLLECT_HA_METRICS = 11209;
    public static final int FFP_PROP_INT64_DISABLE_CONN_REPORT = 11211;
    public static final int FFP_PROP_INT64_DISABLE_FIX_FFCB_CRASH = 11203;
    public static final int FFP_PROP_INT64_DISABLE_FIX_HLS_EOF = 16000;
    public static final int FFP_PROP_INT64_DISABLE_FIX_SEEK_COMPLETE = 80001;
    public static final int FFP_PROP_INT64_DISABLE_FIX_START_TIME = 11207;
    public static final int FFP_PROP_INT64_DISABLE_HLS_DISCON = 17000;
    public static final int FFP_PROP_INT64_DISABLE_HTTP_CACHE_SPEED = 11210;
    public static final int FFP_PROP_INT64_DISABLE_RENDER_INVISIBLE_DROP_BY_TID = 80037;
    public static final int FFP_PROP_INT64_DYNAMIC_CHECK_VIDEO_CHANGE = 60102;
    public static final int FFP_PROP_INT64_ENABLEAVSYNC_INFO = 11208;
    public static final int FFP_PROP_INT64_ENABLE_ACCURATE_SEEK = 20131;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_CLIP = 32001;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF = 22901;
    public static final int FFP_PROP_INT64_ENABLE_AUDIO_GAIN_COEF_AB = 80061;
    public static final int FFP_PROP_INT64_ENABLE_BT709_FULL_RANGE_SUPPORT = 80048;
    public static final int FFP_PROP_INT64_ENABLE_CHANGE_POSITION_TO_VIDEO_POSITION = 11070;
    public static final int FFP_PROP_INT64_ENABLE_CHECK_AVG_FPS = 80036;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE = 80044;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_USING_VIDEO_STREAM_START_TIME = 80039;
    public static final int FFP_PROP_INT64_ENABLE_DECODE_USING_VIDEO_STREAM_START_TIME_VVC = 80040;
    public static final int FFP_PROP_INT64_ENABLE_DETECT_TID_AND_ACTIVE_DROP_FRAME = 80031;
    public static final int FFP_PROP_INT64_ENABLE_EXTRADATA_CHANGE_FIX = 80083;
    public static final int FFP_PROP_INT64_ENABLE_FIX_MEMORY_LEAK_WITH_MFORMATOPTS = 80003;
    public static final int FFP_PROP_INT64_ENABLE_FIX_PLAY_TOKEN = 35193;
    public static final int FFP_PROP_INT64_ENABLE_FIX_ROTATE_VIDEO = 80041;
    public static final int FFP_PROP_INT64_ENABLE_FIX_SEI_NOTIFY = 80052;
    public static final int FFP_PROP_INT64_ENABLE_FIX_SET_SURFACE = 80049;
    public static final int FFP_PROP_INT64_ENABLE_GLOBAL_AUDIO_OUTPUT_BYTEARRAY = 80007;
    public static final int FFP_PROP_INT64_ENABLE_HW_DETAIL_INFO = 80086;
    public static final int FFP_PROP_INT64_ENABLE_LOOP = 11004;
    public static final int FFP_PROP_INT64_ENABLE_MEDIACODEC_FIRST_FRAME_FLUSH_OPT = 16001;
    public static final int FFP_PROP_INT64_ENABLE_MOV_FFMPEG_FORMAT_TO_SOURCER = 22221;
    public static final int FFP_PROP_INT64_ENABLE_NEW_MEDIACODEC_AFTER_CONFIGURE_ERROR = 80073;
    public static final int FFP_PROP_INT64_ENABLE_PLAYRATE3_DROP_PKT = 80085;
    public static final int FFP_PROP_INT64_ENABLE_POST_WHEN_RESOLUTION_CHANGE = 11069;
    public static final int FFP_PROP_INT64_ENABLE_REALTIME_SET_FFMPEG_STRING = 22220;
    public static final int FFP_PROP_INT64_ENABLE_RENDER_CALLBACK = 20000;
    public static final int FFP_PROP_INT64_ENABLE_REUSE_MEDIACODEC = 80071;
    public static final int FFP_PROP_INT64_ENABLE_RTC_COMMON_SIDE_DATA = 80043;
    public static final int FFP_PROP_INT64_ENABLE_RTC_DECODE_WAIT_TIME = 80009;
    public static final int FFP_PROP_INT64_ENABLE_RTC_NEW_BUFFER_STRATEGY = 80062;
    public static final int FFP_PROP_INT64_ENABLE_RTC_SWITCH = 80002;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_FAST_MODE = 60310;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_IN_PAUSE = 80006;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_PKT_DROP = 80032;
    public static final int FFP_PROP_INT64_ENABLE_SEEK_PKT_TID_DROP = 80033;
    public static final int FFP_PROP_INT64_ENABLE_STAT_RENDER_FRAME = 11060;
    public static final int FFP_PROP_INT64_ENABLE_STAT_STALL_ATTR_REASON = 80046;
    public static final int FFP_PROP_INT64_ENABLE_SW_FALLBACK = 80084;
    public static final int FFP_PROP_INT64_ENABLE_USE_SET_VOLUME = 80089;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_DELAY_STATS = 11029;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_FRAME_PLUGIN = 60002;
    public static final int FFP_PROP_INT64_ENABLE_VIDEO_RENDER_STATS = 20141;
    public static final int FFP_PROP_INT64_ENABLE_VPM = 11040;
    public static final int FFP_PROP_INT64_ENABLE_VPM_COLLECTOR_V2 = 11046;
    public static final int FFP_PROP_INT64_ENABLE_VPM_HEART_INTERVAL = 11042;
    public static final int FFP_PROP_INT64_ERROR_CODE_NEW = 60500;
    public static final int FFP_PROP_INT64_ERROR_CODE_SUB = 60501;
    public static final int FFP_PROP_INT64_EXTEND_ADAPTIVE_DECISION_WINDOW = 80004;
    public static final int FFP_PROP_INT64_EXTEND_DEFINITION_DECISION_WINDOW = 80005;
    public static final int FFP_PROP_INT64_EXTEND_DISABLE_CDN_SPEED = 80008;
    public static final int FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR = 80014;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_CDN_START_PLAY_SPEED = 80011;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_DECODE_WITHOUT_DATA_IN_SYNC_MODE = 80016;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_DROP_RENDER = 80035;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_EXTERN_CACHE = 80000;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_ALPHA = 80020;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_CROP = 80021;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_RTC_SYNC = 80015;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_START_DECODEC_THREAD_OPT = 80030;
    public static final int FFP_PROP_INT64_EXTEND_ENABLE_STAT_RENDER_STALL = 80012;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_EXTRADATA_DELAY = 80026;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_PROBESIZE = 80025;
    public static final int FFP_PROP_INT64_EXTEND_FFMPEG_VIDEO_INFO_DELAY = 80027;
    public static final int FFP_PROP_INT64_EXTEND_LOAD_DECODER = 80024;
    public static final int FFP_PROP_INT64_EXTEND_MAX_HEIGHT_FOR_MEDIACODEC = 80051;
    public static final int FFP_PROP_INT64_EXTEND_MAX_WIDTH_FOR_MEDIACODEC = 80050;
    public static final int FFP_PROP_INT64_EXTEND_MIN_SYNC_TIME_IN_ARTC = 80017;
    public static final int FFP_PROP_INT64_EXTEND_OPENGL_OPEN_DEVICE_MAX_ERROR_COUNT = 80029;
    public static final int FFP_PROP_INT64_EXTEND_SHOULD_STAT_RENDER_STALL = 80013;
    public static final int FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO = 80022;
    public static final int FFP_PROP_INT64_FAST_FRAME_AUDIO_COUNT = 80068;
    public static final int FFP_PROP_INT64_FAST_FRAME_TIME = 80066;
    public static final int FFP_PROP_INT64_FAST_FRAME_VIDEO_COUNT = 80067;
    public static final int FFP_PROP_INT64_FAST_PLAY = 11028;
    public static final int FFP_PROP_INT64_FATAL_AV_SYNC_COUNT = 11227;
    public static final int FFP_PROP_INT64_FATAL_AV_SYNC_THRESHOLD = 11228;
    public static final int FFP_PROP_INT64_FATAL_AV_SYNC_TIME = 11226;
    public static final int FFP_PROP_INT64_FATAL_ERROR_SYNC = 80098;
    public static final int FFP_PROP_INT64_FIND_STREAM_INFO_OPT = 11023;
    public static final int FFP_PROP_INT64_FINISH_READ_SOURCE_TIME = 22011;
    public static final int FFP_PROP_INT64_FINISH_SETUP_DECODER_TIME = 22013;
    public static final int FFP_PROP_INT64_FIRST_DECODE_PACKET_NUM = 22002;
    public static final int FFP_PROP_INT64_FIRST_DECODE_PACKET_TIME = 22005;
    public static final int FFP_PROP_INT64_FIRST_DECODE_PACKET_TS = 22015;
    public static final int FFP_PROP_INT64_FIRST_DECODE_TIME = 22001;
    public static final int FFP_PROP_INT64_FIRST_RENDER_TIME = 22006;
    public static final int FFP_PROP_INT64_FIRST_RENDER_TS = 22016;
    public static final int FFP_PROP_INT64_FIX_MEDIACODEC_TIMEOUT = 80096;
    public static final int FFP_PROP_INT64_FIX_SURFACEVIEW_AND_SOFTWARE_CENTER_CROP_ERROR = 80079;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_1080 = 60206;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_720 = 60209;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_DEFAULT = 60203;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_1080 = 60207;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_720 = 60210;
    public static final int FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_DEFAULT = 60204;
    public static final int FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_1080 = 60205;
    public static final int FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_720 = 60208;
    public static final int FFP_PROP_INT64_FLV_PARAM_MQX_QUEUE_TIME_MS_DEFAULT = 60202;
    public static final int FFP_PROP_INT64_FORBIDDEN_SMOOTH_SYNC = 80023;
    public static final int FFP_PROP_INT64_FORCE_MUTE_MODE = 21027;
    public static final int FFP_PROP_INT64_FPS_LIST_COLLECT_MAX_COUNT = 80019;
    public static final int FFP_PROP_INT64_FPS_LIST_COLLECT_TIME_INTERVAL = 80018;
    public static final int FFP_PROP_INT64_GET_AV_MAX_PTS_DIFF = 22118;
    public static final int FFP_PROP_INT64_GET_AV_MAX_PTS_DIFF_COUNT = 22119;
    public static final int FFP_PROP_INT64_GET_LATENCE_LEVEL = 80047;
    public static final int FFP_PROP_INT64_GRADUAL_VOLUME_ENABLE = 80093;
    public static final int FFP_PROP_INT64_GRADUAL_VOLUME_TIME = 80094;
    public static final int FFP_PROP_INT64_GRTN_GLOBAL_DELAY_INFO = 22800;
    public static final int FFP_PROP_INT64_HANDLE_SURFACE_DESTROY = 60101;
    public static final int FFP_PROP_INT64_HARDWARE_DECODER_ERROR_COUNT = 22201;
    public static final int FFP_PROP_INT64_HAS_SWITCH_RTC_BEFORE_START = 80091;
    public static final int FFP_PROP_INT64_HDRTOSDR_ENABLE = 15000;
    public static final int FFP_PROP_INT64_HDR_TYPE = 15005;
    public static final int FFP_PROP_INT64_HEVC_DECODE_OPT = 20101;
    public static final int FFP_PROP_INT64_HEVC_SOFT_DECODE_MAX_FPS = 20137;
    public static final int FFP_PROP_INT64_IS_REUSE_MEDIACODEC = 80072;
    public static final int FFP_PROP_INT64_IS_WAITING_SYNC = 20136;
    public static final int FFP_PROP_INT64_LAST_VIDEO_RENDER_TIME = 11300;
    public static final int FFP_PROP_INT64_LIVE_PAUSE_TIMESTAMP = 22009;
    public static final int FFP_PROP_INT64_LIVE_RESUME_TIME = 22008;
    public static final int FFP_PROP_INT64_MAX_BUFFER_SIZE = 40001;
    public static final int FFP_PROP_INT64_MAX_BUFFER_SIZE_REAL_PLAY = 40002;
    public static final int FFP_PROP_INT64_MAX_BUFFER_TIME_MS = 11008;
    public static final int FFP_PROP_INT64_MAX_FAST_PLAY_COUNT = 20135;
    public static final int FFP_PROP_INT64_MAX_VALID_NET_SPEED = 11221;
    public static final int FFP_PROP_INT64_MEDIACODEC_ACTION_CODE_WHHEN_ASYNC_ERROR = 22215;
    public static final int FFP_PROP_INT64_MEDIACODEC_ASYNC_ERROR = 22214;
    public static final int FFP_PROP_INT64_MEDIACODEC_ASYNC_ERROR_COUNT = 22213;
    public static final int FFP_PROP_INT64_MEDIACODEC_BUFFER_SIZE = 22216;
    public static final int FFP_PROP_INT64_MEDIACODEC_BUFFER_SIZE_CHANGE = 22217;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT = 22210;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT_CACHE_NUM = 22212;
    public static final int FFP_PROP_INT64_MEDIACODEC_HIT_REASON = 22211;
    public static final int FFP_PROP_INT64_MEDIACODEC_POOL_SIZE = 80075;
    public static final int FFP_PROP_INT64_MEDIA_ENGINE_TIME_CONSUMING = 80097;
    public static final int FFP_PROP_INT64_MUTED = 21008;
    public static final int FFP_PROP_INT64_MUTED_AUDIO_RESET_DATA = 21017;
    public static final int FFP_PROP_INT64_NET_SPEED_COLLECT_INTERVAL = 11220;
    public static final int FFP_PROP_INT64_NONSTANDARD_PIXEL_SUPPROT = 20116;
    public static final int FFP_PROP_INT64_NTP_START_OFFSET = 15004;
    public static final int FFP_PROP_INT64_PANO_TYPE = 14000;
    public static final int FFP_PROP_INT64_PLAYING_VVC = 80038;
    public static final int FFP_PROP_INT64_PLAY_SCENARIO = 21007;
    public static final int FFP_PROP_INT64_PREPARE_TO_FIRST_FRAME = 11031;
    public static final int FFP_PROP_INT64_REAL_HDR_ENABLE = 15006;
    public static final int FFP_PROP_INT64_RECV_FIRST_DECODE_PACKET_TIME = 22004;
    public static final int FFP_PROP_INT64_RECV_FIRST_DECODE_PACKET_TS = 22014;
    public static final int FFP_PROP_INT64_RECV_FIRST_PACKET_TIME = 22003;
    public static final int FFP_PROP_INT64_RTC_CONNECT_ONLY_AT_WARM_UP = 80070;
    public static final int FFP_PROP_INT64_RTC_DECODE_WAIT_TIME = 80010;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_AVFORMAT_OPEN_TIME = 22111;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_FIND_STREAM_INFO_TIME = 22112;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_PTS_LATENCY_INIT = 22104;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_READ_BYTES = 22113;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_HEIGHT = 22110;
    public static final int FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_WIDTH = 22109;
    public static final int FFP_PROP_INT64_SEEK_FLSUH_MODE = 31001;
    public static final int FFP_PROP_INT64_SEND_SEI = 20111;
    public static final int FFP_PROP_INT64_SET_DEFAULT_START_TIME = 11212;
    public static final int FFP_PROP_INT64_SHOULD_INIT_DECODER_EARLY = 80055;
    public static final int FFP_PROP_INT64_SHOULD_OPEN_DEVICE_EARLY = 80056;
    public static final int FFP_PROP_INT64_SHOULD_PAUSE_RTC_EARLY_AT_WARM_UP = 80053;
    public static final int FFP_PROP_INT64_SOURCER_AUDIO_PIPE_MAX_COUNT = 11017;
    public static final int FFP_PROP_INT64_SOURCER_AUDIO_PIPE_START_COUNT = 11021;
    public static final int FFP_PROP_INT64_SOURCER_ISSUE_FIX = 80069;
    public static final int FFP_PROP_INT64_SOURCER_PIPE_FORCE_POP_DATA_COUNT = 80065;
    public static final int FFP_PROP_INT64_SOURCER_PIPE_MAX_BUFFER_RATIO = 80064;
    public static final int FFP_PROP_INT64_SOURCER_TYPE = 11009;
    public static final int FFP_PROP_INT64_SOURCER_VIDEO_PIPE_MAX_COUNT = 11016;
    public static final int FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT = 11020;
    public static final int FFP_PROP_INT64_START_ON_PREPARED = 11007;
    public static final int FFP_PROP_INT64_START_POSITION = 60000;
    public static final int FFP_PROP_INT64_START_POSITION_ACCUSEEK = 60003;
    public static final int FFP_PROP_INT64_START_READ_SOURCE_TIME = 22010;
    public static final int FFP_PROP_INT64_START_SETUP_DECODER_TIME = 22012;
    public static final int FFP_PROP_INT64_STATE_AFTER_CONFIGURE_ERROR = 80074;
    public static final int FFP_PROP_INT64_STAT_MAX_FRAME_PER_SEC = 11061;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_1 = 60225;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_2 = 60226;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_DETAIL_3 = 60227;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER = 60220;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_1 = 60221;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_2 = 60222;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_3 = 60223;
    public static final int FFP_PROP_INT64_STAT_STAT_RENDER_STALL_COUNT_43833053_RENDER_REASON_4 = 60224;
    public static final int FFP_PROP_INT64_SUPPORT_OUT_LAST_FRAME_NEW = 50002;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY = 22101;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_HEIGHT_LEVEL = 22114;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_IMMEDIATELY_FOR_DOUBLE_DECODER = 22102;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_LOW_LEVEL = 22115;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_MAX_FIRST_PTS_TIMEOUT = 22116;
    public static final int FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT = 22100;
    public static final int FFP_PROP_INT64_SYNC_BY_DRIFT_PTS = 11027;
    public static final int FFP_PROP_INT64_SYNC_DIFF_TIME_AFTER_SEEK = 22206;
    public static final int FFP_PROP_INT64_SYNC_THRESHOLD = 80028;
    public static final int FFP_PROP_INT64_THUMBNAIL_ENGINE_ENABLE = 80082;
    public static final int FFP_PROP_INT64_TMP_DISABLE_FIX_VIDEO_RESOLUTION2 = 11068;
    public static final int FFP_PROP_INT64_TOTAL_ASYNC_TIME = 60400;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_60FPS = 22251;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_RENDER_INVISIBLE = 22252;
    public static final int FFP_PROP_INT64_TOTAL_DROP_FRAME_COUNT_AT_SEEK = 22250;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_COUNTS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER_TYPE = 11010;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_DELAY_MS = 21013;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_IN_COUNT = 22203;
    public static final int FFP_PROP_INT64_VIDEO_DECODE_OUT_COUNT = 22204;
    public static final int FFP_PROP_INT64_VIDEO_DOWNLOAD_COUNT = 22202;
    public static final int FFP_PROP_INT64_VIDEO_PROCESSOR_TYPE = 11012;
    public static final int FFP_PROP_INT64_VIDEO_RENDERER_TYPE = 11014;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_COUNT = 22205;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_DELAY_MS = 21015;
    public static final int FFP_PROP_INT64_VIDEO_RENDER_STALLED_THRESHOLD = 20140;
    public static final int FFP_PROP_INT64_VIDEO_SOURCE_DELAY_MS = 21011;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_DECODE_DELAY_MS = 21014;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_RENDER_DELAY_MS = 21016;
    public static final int FFP_PROP_INT64_VIDEO_TOTAL_SOURCE_DELAY_MS = 21012;
    public static final int FFP_PROP_INT64_VPM_ENABLE_HB_REPORT = 11048;
    public static final int FFP_PROP_INT64_VPM_ENABLE_SUMMARY_REPORT = 11049;
    public static final int FFP_PROP_INT64_VPM_NETWORK_COLLECTOR_TOKEN = 11043;
    public static final int FFP_PROP_INT64_VPM_SERIAL_TOKEN = 11045;
    public static final int FFP_PROP_INT64_VVC_DECODE_PERIOD_DURATION = 80058;
    public static final int FFP_PROP_INT64_VVC_DECODE_STATISTICS_ENABLE = 80057;
    public static final int FFP_PROP_INT64_WARMUP_FLAG = 11032;
    public static final int FFP_PROP_INT64_WARMUP_LEVEL = 11033;
    public static final int FFP_PROP_INT64_WEAK_NET_FLAG_LIFE_TIME = 80092;
    public static final int FFP_PROP_STRING_AUDIO_BUF_LATENCY_LIST = 40005;
    public static final int FFP_PROP_STRING_AUDIO_LATENCY_LIST = 40004;
    public static final int FFP_PROP_STRING_BACKUP_CDNIP = 21005;
    public static final int FFP_PROP_STRING_ENCODE_TYPE = 13001;
    public static final int FFP_PROP_STRING_FAST_PLAY_AV_STAT = 21008;
    public static final int FFP_PROP_STRING_PLAYEXPERIENCE_STAT_VALUE = 21007;
    public static final int FFP_PROP_STRING_PLAYING_RTC_LIVE_INFO = 21011;
    public static final int FFP_PROP_STRING_PLAYING_STAT_VALUE = 21006;
    public static final int FFP_PROP_STRING_PLAY_STALL_STAT = 21009;
    public static final int FFP_PROP_STRING_PLAY_TOKEN = 21038;
    public static final int FFP_PROP_STRING_RENDER_STALL_ATTR_REASONS = 22234;
    public static final int FFP_PROP_STRING_SEI_BITRATE = 21004;
    public static final int FFP_PROP_STRING_SERVER_IP = 21003;
    public static final int FFP_PROP_STRING_VIDEO_DECODE_FPS_LIST = 22228;
    public static final int FFP_PROP_STRING_VIDEO_DECODE_FPS_LIST_WITHOUT_SLOW_START = 22232;
    public static final int FFP_PROP_STRING_VIDEO_DOWNLOAD_FPS_LIST = 22227;
    public static final int FFP_PROP_STRING_VIDEO_DOWNLOAD_FPS_LIST_WITHOUT_SLOW_START = 22231;
    public static final int FFP_PROP_STRING_VIDEO_RENDER_FPS_LIST = 22229;
    public static final int FFP_PROP_STRING_VIDEO_RENDER_FPS_LIST_WITHOUT_SLOW_START = 22233;
    public static final int FFP_PROP_STRING_VVC_DECODE_AVG_TIME_LIST = 20200;
    public static final int FFP_PROP_STRING_VVC_DECODE_MAX_TIME_LIST = 20201;
    public static final int FFP_PROP_SUPPORT_OUT_LAST_FRAME = 50000;
    public static final int HDR_HLG = 2;
    public static final int HDR_None = 0;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_OUT_OF_BUFFERING = 300;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_RESUME_BUFFERING = 301;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SEEK_START = 400;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_WARMUP = 6;
    public static final int MediaAudioDecoder_FFmpeg = 1;
    public static final int MediaAudioDecoder_FFmpeg_PLC = 16;
    public static final int MediaAudioDecoder_MediaCodec = 2;
    public static final int MediaAudioDecoder_None = 0;
    public static final int MediaAudioRenderer_AudioTrack = 2;
    public static final int MediaAudioRenderer_None = 0;
    public static final int MediaAudioRenderer_OpenSLES = 4;
    public static final int MediaVideoDecoder_FFmpeg = 1;
    public static final int MediaVideoDecoder_MediaCodec = 32;
    public static final int MediaVideoDecoder_MediaCodec_EGL = 64;
    public static final int MediaVideoDecoder_MediaCodec_H264 = 8;
    public static final int MediaVideoDecoder_MediaCodec_HEVC = 16;
    public static final int MediaVideoDecoder_None = 0;
    public static final int MediaVideoRenderer_EGL = 8;
    public static final int MediaVideoRenderer_None = 0;
    public static final int MediaVideoRenderer_Surface = 4;
    public static final String ON_VIDEO_MUTE_STATE_CHANGED_ACTION = "com.taobao.avplayer.muteStateChanged";
    public static final int OPT_ARTP_SOURCE = 2;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final String ORANGE_ACCURATE_SEEK_NEW = "accurateSeekNew";
    public static final String ORANGE_ACCURATE_SEEK_NEW_BLACK = "accurateSeekWBlackList";
    public static final String ORANGE_ALLOW_LIVE_VIDEO_STREAM_INDEX_CHANGE = "allowLiveVideoStreamIndexChange";
    public static final String ORANGE_AUDIO_CLIP_MODE_BUSSINESSTYPE = "AudioForceEofModeSubBusinessTypes";
    public static final String ORANGE_AUDIO_SOURCER_PIPE_SIZE = "audioSourcerPipeSize";
    public static final String ORANGE_CDN_BITRATE_FACTOR = "cdnBitrateF";
    public static final String ORANGE_CDN_PLAYING_SPEED_FACTOR = "cdnPlayingSpeedF";
    public static final String ORANGE_DISABLE_ARTC_RTT_STAT = "disableArtcRttStat";
    public static final String ORANGE_DISABLE_AUDIO_CNT_STATISTIC = "disableAudioCntStatistic";
    public static final String ORANGE_DISABLE_AUDIO_MUTE_RESET_DATA = "disableAudioMuteResetData";
    public static final String ORANGE_DISABLE_CDN_SPEED = "disaCdnSpeed";
    public static final String ORANGE_DISABLE_COLLECT_HA_METRICS = "disableCollectHaMetrics";
    public static final String ORANGE_DISABLE_COLLECT_VPMHA_LIVE_STAT = "disableCollectVPMHALiveStat";
    public static final String ORANGE_DISABLE_CONN_REPORT = "disableConnReport";
    public static final String ORANGE_DISABLE_DECODER = "disaDecoder";
    public static final String ORANGE_DISABLE_FIX_SEEK_COUNTER = "disableFixSeekCounter";
    public static final String ORANGE_DISABLE_HARDWARE_DECODER_LIST = "disableHardwareDecoderList2";
    public static final String ORANGE_DISABLE_HARDWARE_DECODER_STRATEGY = "disaHardwareStrategy";
    public static final String ORANGE_DISABLE_HTTP_CACHE_SPEED = "disableHttpCacheSpeed";
    public static final String ORANGE_DISABLE_NETWORK_ERROR_HLS_SEND_EOF = "disableNetworkErrorHLSEof";
    public static final String ORANGE_DISABLE_PROCESS_NUMBER_SIGN = "disableNumberSign";
    public static final String ORANGE_DISABLE_SUPPORT_HLS_DISCONTINUITY = "disableSupportHLSDiscontinuity";
    public static final String ORANGE_DISABLE_SUPPORT_SET_TRACK_MIN_START_TIME = "disableSetTrackMinStartTimeNewSwitch";
    public static final String ORANGE_DISABLE_VIDEO_PROGRESS = "disVideoProgress";
    public static final String ORANGE_DISALBE_TMP_DISABLE_FIX_VIDEO_RESOLUTION2 = "disableFixVideoResolution2";
    public static final String ORANGE_ENABLE_BLUETOOTH_AVSYNC_MODE = "enabelBluetoothAvsyncMode3";
    public static final String ORANGE_ENABLE_COMMIT_LIVE_PUSH_CONTROL_INFO = "enLivePushContrInfo";
    public static final String ORANGE_ENABLE_COMPLETE_SEEKTO = "enableCompleteSeekTo";
    public static final String ORANGE_ENABLE_EGL_RENDER_WHEN_SV_AND_SW = "enableEglRenderWhenSVAndSW";
    public static final String ORANGE_ENABLE_EGL_RENDER_WHEN_SV_AND_SW_WHITE_SBT = "enableEglRenderWhenSVAndSWWhiteSbt";
    public static final String ORANGE_ENABLE_ENABLE_SEEK_IN_PAUSE = "enSeekInPause";
    public static final String ORANGE_ENABLE_FORCE_MUTE_MODE = "enableForceMuteMode";
    public static final String ORANGE_ENABLE_GET_OUT_START_TIME_IN_RELEASE = "enableGetOstInRelease";
    public static final String ORANGE_ENABLE_GLOBAL_RTC_SYNC = "enGlobalRtcSync";
    public static final String ORANGE_ENABLE_MEDIACODEC_INPUT_BUF_CHECK = "enableMediacodecInputBufferCheck";
    public static final String ORANGE_ENABLE_PLAYRATE3_DROP_PKT = "enPlayrate3DropPKT";
    public static final String ORANGE_ENABLE_POST_WHEN_RESOLUTION_CHANGE = "enablePostWhenResolutionChange";
    public static final String ORANGE_ENABLE_RTC_DECODE_WAIT_TIME = "enRtcDecodeWaitTime";
    public static final String ORANGE_ENABLE_SEEK_FAST_MODE = "enSeekFastMode";
    public static final String ORANGE_ENABLE_SEND_LOG_TOKEN = "enSendLogToken3";
    public static final String ORANGE_ENABLE_SET_CUS_HTTP_HEADER = "enableCusHttpHeader";
    public static final String ORANGE_ENABLE_STAT_RENDER_FRAME = "enStatRenderFrame";
    public static final String ORANGE_ENABLE_STAT_STALL_RENDER_IN_NON_SURFACE = "enStatStallRenderInNonSurface";
    public static final String ORANGE_ENABLE_STAT_STALL_RENDER_IN_NON_VISIBLE = "enStatStallRenderInNonVisible";
    public static final String ORANGE_ENABLE_SURFACEVIEW_P2FF_OS_VERSION_LIST = "svP2ffOSBlackList";
    public static final String ORANGE_ENABLE_SURFACEVIEW_REBUILD_BUSINESSTYPE_LIST = "svRebuildList";
    public static final String ORANGE_ENABLE_SYNC_AFTER_SEEK = "enSyncAfterSeek";
    public static final String ORANGE_ENABLE_VIDEO_REDNER_STALLED_DURATION_THRESHOLD = "VideoRenderStalledDurationThreshold";
    public static final String ORANGE_ENABLE_VIDEO_REDNER_STALLED_STATS = "enableVideoRenderStalledStats";
    public static final String ORANGE_ENABLE_VPM_HEADR_BEAT_INTERAVL = "heartBeatInterval";
    public static final String ORANGE_FIND_STREAM_INFO_OPT = "findStreamInfoOpt";
    public static final String ORANGE_FIX_ABNORMAL_STAT_FOR_FIRST_RENDER = "enableFixAbnormalStatForFirstRender2";
    public static final String ORANGE_FIX_ABNORMAL_STAT_FOR_LOOP = "enableFixAbnormalStatForLoop";
    public static final String ORANGE_GET_LATENCE_LEVEL = "getLatenceLevel";
    public static final String ORANGE_KEY_MAX_VALID_NET_SPEED = "MaxValidNetSpeed";
    public static final String ORANGE_KEY_NET_SPEED_COLLECT_INTERVAL = "NetSpeedCollectInterval";
    public static final String ORANGE_LIVEROOM_SWITCH_TO_BACKGROUND_KEY = "liveRoomSwitchToBackGroundKey";
    public static final String ORANGE_LIVEROOM_SWITCH_TO_FRONT_KEY = "liveRoomSwitchToFrontKey";
    public static final String ORANGE_LIVE_FAST_PLAY = "enableLiveFastPlay";
    public static final String ORANGE_MAX_RENDER_ABNORMAL_IN_RENDER_THREAD = "maxRenderAbnormal";
    public static final String ORANGE_MIN_SYNC_TIME_IN_ARTC = "minSyncTimeInArtc";
    public static final String ORANGE_OPT_SOURCER_PIPE_SIZE_LIST = "optSourcerPipeSizeList";
    public static final String ORANGE_OUT_PUT_LAST_FRAME_NEW = "outputLastVideoFrameNew";
    public static final String ORANGE_PANO_MAX_POLAR_DEGREES = "panoMaxPolarDegree";
    public static final String ORANGE_PROBESIZE_OF_FLV_OR_M3U8_WITHOUT_DECODER = "probesizeWithoutDec";
    public static final String ORANGE_RTC_DECODE_WAIT_TIME = "rtcDecodeWaitTime";
    public static final String ORANGE_SET_START_POS_DO_ACCUESEEK = "startPosDoAccuSeek";
    public static final String ORANGE_SET_START_TIME_DEFAULT_VALUE = "setStartTimeDefaulteValue";
    public static final String ORANGE_STAT_MAX_FRAME_PER_SEC = "statRenderFramePerSec";
    public static final String ORANGE_SUPPORT_SET_START_POSITION = "setStartPosition";
    public static final String ORANGE_SWITCH_STREAM_CAN_USE_SINGLE_DECODE = "switchStreamCanUsingSingleDecode";
    public static final String ORANGE_SWITCH_STREAM_HIGHER_TIMEOUT = "switchStreamHigherTimeout";
    public static final String ORANGE_SWITCH_STREAM_LOWER_TIMEOUT = "switchStreamLowerTimeout";
    public static final String ORANGE_SWITCH_STREAM_NEW_DEFIINITION_TIMEOUT = "switchNewDefTimeout";
    public static final String ORANGE_SW_RENDER_RGB = "swRenderRGB";
    public static final String ORANGE_SYNC_BY_DRIFT_PTS = "syncByDriftPts";
    public static final String ORANGE_UI_THREAD_ENABLE_WATCH = "enableWatch";
    public static final String ORANGE_UI_THREAD_WATCH_EXCEED_THRESHOLD = "watchExceedThreshold";
    public static final String ORANGE_UI_THREAD_WATCH_INTERVAL = "watchInterval";
    public static final String ORANGE_USE_ENABLE_AUDIO_CLIP = "EnableAudioForceEosControl";
    public static final String ORANGE_USE_ENABLE_SEEK_FLUSH_BUFFER = "EnableSeekFlushControl";
    public static final String ORANGE_USE_SEEK_FLUSH_MODE_BUSSINESSTYPE = "SeekFlushModeSubBusinessTypes";
    public static final String ORANGE_VIDEO_SOURCER_PIPE_SIZE = "videoSourcerPipeSize";
    public static final int RTCSTREAM_TRANSPORT_STREAM_INFO = 21990;
    public static final int SWITCH_NEW_DEFINITION_BY_ABR = 2;
    public static final int SWITCH_NEW_DEFINITION_BY_ABR_WITH_INTERACTIVE = 3;
    public static final int SWITCH_NEW_DEFINITION_BY_USER = 1;
    public static final int SWITCH_NEW_DEFINITION_ON_WARMUP = 10;
    public static final int SWITCH_STATUS_FAIL = 2;
    public static final int SWITCH_STATUS_START = 0;
    public static final int SWITCH_STATUS_SUCCESS = 1;
    public static final int SWITCH_VIEW_SIZE_CHANGED = 0;
    private static final String TAG = "AVSDK";
    private static volatile tug mDisableHardwareUtil;
    private static BluetoothStateBroadcastReceive mReceiveInstance;
    private long mDuration;
    private EventHandler mEventHandler;
    private TextureView mFrameInfoBaseView;
    private SurfaceView mFrameInfoSurfaceView;
    private TextureView mFrameInfoTextureView;
    private boolean mHasPostRenderFirstMesasgeInReuseState;
    private feh mLogContext;
    private long mNativeMediaPlayer;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private ViewGroup mViewGroup;
    private String statRecentBufPerMs;
    private String statRecentFFLive;
    private String statRecentLiveSpeedMax;
    private String statRecentLiveSpeedMean;
    private static volatile boolean mIsLibLoaded = false;
    private static Context mApplicationContext = null;
    private static HashMap<Long, TaobaoMediaPlayer> mTaobaoMediaPlayerMap = new HashMap<>();
    private static AtomicBoolean mIsLoadLibrariesOnce = new AtomicBoolean(false);
    private static feh mGlobalLogContext = new feh(TaobaoMediaPlayer.class.getSimpleName(), "Global");
    private float mPanoMaxPolarToleranceDegrees = 20.0f;
    public HashMap<String, String> mRequestHeader = null;
    private boolean isFirstFrameRenderedFlag = false;
    private HashSet<Long> mExperienceIdSet = new HashSet<>();
    private HashSet<Long> mExperienceReleaseIdSet = new HashSet<>();
    private HashSet<Long> mExperienceBucketIdSet = new HashSet<>();
    private boolean mIsReceiverRegistered = false;
    private boolean mAudioOff = false;
    private boolean mStartDisableAudio = false;
    private long mRtcAudioFakeDisable = 0;
    private AdaptiveLiveController mAdapitveLiveController = null;
    private long mTextureVideoViewNativeToken = 0;
    private long mPoorNetworkTime = -1;
    private List<Integer> mNetworkQualityStateNodes = new LinkedList();
    private long mLastPoorNetStartTs = -1;
    private int mCurrNetworkQuality = 0;
    private boolean mEnableNetworkQuality = false;
    public int mP2ffState = 0;
    private long mVideoCodecType = 1;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class CommitFetchSoStatRunnable implements Runnable {
        final TaobaoMediaPlayer mediaPayer;

        static {
            t2o.a(774898045);
        }

        private CommitFetchSoStatRunnable() {
            this.mediaPayer = TaobaoMediaPlayer.this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException unused) {
            }
            TaobaoMediaPlayer.this.commitFetchSoEvent(false);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class UnregisterFetchSoRunnable implements Runnable {
        final TaobaoMediaPlayer mediaPayer;

        static {
            t2o.a(774898047);
        }

        private UnregisterFetchSoRunnable() {
            this.mediaPayer = TaobaoMediaPlayer.this;
        }

        @Override // java.lang.Runnable
        public void run() {
            cq.i(this.mediaPayer);
        }
    }

    static {
        t2o.a(774898043);
        t2o.a(774897785);
        t2o.a(774897795);
        t2o.a(774897938);
    }

    public TaobaoMediaPlayer() {
        initPlayer(null);
    }

    public static boolean IsLoadLibrariesOnce() {
        return mIsLoadLibrariesOnce.get();
    }

    private native void _audioOff();

    private native void _audioOn();

    private native void _disableOnRenderCallback();

    private native void _enableOnRenderCallback();

    private static native long _getCdnSpeed();

    private native long _getDuration();

    public static native String _getLastCdnPlayingSpeedNodesStr();

    private static native boolean _getRtcWeakNetFlag();

    private native long _getVPMSessioinId();

    private native float[] _hitTest(float f, float f2);

    private native void _initExternCache(String str);

    public static native void _initFFmpegDecoder(String str);

    public static native void _initS266Decoder(String str);

    private boolean _isVPMLibLoaded() {
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null || !"com.taobao.avsdk.test".equals(context.getPackageName())) {
            return isVPMLibLoaded();
        }
        return true;
    }

    private native void _onRenderingHung();

    private native void _onRenderingResumed();

    private native void _pause() throws IllegalStateException;

    private native void _preRelease();

    private native void _refreshScreen();

    private native void _release();

    private native void _releaseAlphaBitmap();

    private native void _releaseSurface();

    private native void _seekTo(long j) throws IllegalStateException;

    private native void _seekToPause(long j, boolean z);

    private native void _setAlphaBitmap(Bitmap bitmap);

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setSeamlessSwitchMode(int i);

    private native void _setSeamlessSwitchUrl(String str);

    private native void _setVideoSurface(Object obj);

    private native void _setVideoSurfaceSize(int i, int i2);

    private native void _start() throws IllegalStateException;

    private native void _startRtcAdaption(String str);

    private native void _stop() throws IllegalStateException;

    private native void _stopExternCache(String str);

    private native void _stopRtcAdaption();

    private native void _stopSeamlessSwitch();

    private native void _switchStream(Surface surface);

    private native void _updateAlphaBitmap(Bitmap bitmap);

    private native void _updateNetWorkInfo(String str);

    private native void _uploadRecvBytes();

    private void addFrameInfoView() {
        Context context;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        if (this.mFrameInfoBaseView == null && this.mViewGroup != null) {
            this.mFrameInfoBaseView = new TextureView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(500, 150);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = this.mFrameInfoTop1Position;
            this.mViewGroup.addView(this.mFrameInfoBaseView, -1, layoutParams);
            this.mFrameInfoBaseView.bringToFront();
            int i = this.mFrameInfoLevel;
            if (i == 1 || i == 99) {
                this.mFrameInfoTextureView = new TextureView(context);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(800, 150);
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = this.mFrameInfoTop2Position;
                this.mViewGroup.addView(this.mFrameInfoTextureView, -1, layoutParams2);
                this.mFrameInfoTextureView.bringToFront();
            }
            int i2 = this.mFrameInfoLevel;
            if (i2 == 2 || i2 == 99) {
                this.mFrameInfoSurfaceView = new SurfaceView(context);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(800, 150);
                layoutParams3.leftMargin = 0;
                layoutParams3.topMargin = this.mFrameInfoTop2Position + 150;
                this.mViewGroup.addView(this.mFrameInfoSurfaceView, -1, layoutParams3);
                this.mFrameInfoSurfaceView.bringToFront();
            }
        }
    }

    private void callWithMsgInner(String str, String str2) {
        HashMap<String, String> z;
        if (AUDIO_ON_KEY.equals(str)) {
            if (0 == this.mRtcAudioFakeDisable) {
                this.mAudioOff = false;
                _audioOn();
                monitorSetAudioOn();
                return;
            }
            setMuted(false);
        } else if (AUDIO_OFF_KEY.equals(str)) {
            if (0 == this.mRtcAudioFakeDisable) {
                this.mAudioOff = true;
                _audioOff();
                if (this.mStartDisableAudio) {
                    monitorSetAudiOff();
                } else {
                    initDisableAudio(true);
                }
            } else {
                setMuted(true);
            }
        } else if (MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO.equals(str)) {
            if (!TextUtils.isEmpty(str2)) {
                this.mLivePushControlInfo = str2;
                generateRtcLiveControllInfoAndSetToCore();
            }
        } else if (MediaConstant.CMD_LIVE_REMOVE_CONTROL_INFO.equals(str)) {
            this.mLivePushControlInfo = null;
        } else if (MediaConstant.CMD_UPDATE_PLAY_EX.equals(str)) {
            if (!TextUtils.isEmpty(str2) && (z = ew0.z(str2, ",", "=")) != null && z.size() > 0) {
                if (this.mDynamicPlayExMap == null) {
                    this.mDynamicPlayExMap = new HashMap<>();
                }
                this.mDynamicPlayExMap.putAll(z);
            }
        } else if (MediaConstant.CMD_ENTER_FLOATING.equals(str)) {
            boolean equals = "1".equals(str2);
            this.mIsFloatWindow = equals;
            if (equals) {
                monitorStartPlayWithFloatWindow();
            } else {
                monitorEndPlayWithFloatWindow();
            }
            checkStatRenderStallFlag();
        } else if (MediaConstant.CMD_SWITCH_SCENE.equals(str)) {
            if (this.mSwitchSceneTime == 0) {
                this.mSwitchScene = str2;
                this.mSwitchSceneTime = System.currentTimeMillis();
            }
            if (str2.equals(this.mSwitchToBackKey)) {
                monitorStartPlayInBackground();
            } else if (str2.equals(this.mSwitchToFrontKey)) {
                monitorEndPlayInBackground();
            }
        } else if (MediaConstant.CMD_SET_VIEW_VISIBLE.equals(str)) {
            boolean equals2 = "1".equals(str2);
            if (!equals2 && isPlaying()) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "checkInvisible/BG playing: sbt=" + this.mConfig.y + ", still playing when viewInVisible");
                this.mIsPlayingWhenInvisible = true;
                String config = this.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_SHOULD_PAUSE_WHEN_INVISIBLE_SBT, "");
                if (this.mConfigAdapter != null && ew0.n(this.mConfig.y, config)) {
                    feh fehVar2 = this.mLogContext;
                    AVSDKLog.e(fehVar2, "sbt=" + this.mConfig.y + ", pause by autoPauseList=" + config);
                    pause();
                }
            }
            if (this.mViewIsVisible != equals2) {
                this.mViewIsVisible = equals2;
                if (equals2) {
                    onRenderingResumed();
                    if (this.mEnableRenderStallCalNew) {
                        onRenderingResumedV2();
                    }
                } else {
                    onRenderingHung();
                    if (this.mEnableRenderStallCalNew) {
                        onRenderingHungV2();
                    }
                }
                checkStatRenderStallFlag();
            }
        } else if (MediaConstant.CMD_SET_RECYCEL_REASON.equals(str)) {
            this.mReleaseReason = ew0.u(str2);
        } else if (MediaConstant.CMD_SET_SURFACE_TIME.equals(str)) {
            this.mSurfaceTime = ew0.v(str2);
        } else if (MediaConstant.CMD_SET_FIRST_FRAME_UPDATE_TIME.equals(str)) {
            this.mFirstFrameSurfaceUpdateTs = ew0.v(str2);
            if (getConfig() != null) {
                feh fehVar3 = this.mLogContext;
                AVSDKLog.e(fehVar3, "set mFirstFrameSurfaceUpdateTs=" + this.mFirstFrameSurfaceUpdateTs);
                this.isFirstFrameRenderedFlag = true;
            }
        } else if (MediaConstant.CMD_SET_ENTER_VOICE_ROOM.equals(str)) {
            int u = ew0.u(str2);
            this.mConfig.f27172a = u;
            if (this.mIsPlayingFlv && this.mEnableDecodeAACDSE) {
                if (u == 1) {
                    _setPropertyLong(FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE, 1L);
                } else if (u == 0) {
                    _setPropertyLong(FFP_PROP_INT64_ENABLE_DECODE_AAC_DSE, 0L);
                }
            }
        }
    }

    private boolean checkUseMediaCodec() {
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_DISABLE_HARDWARE_DECODER_STRATEGY, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        boolean z = true;
        if (TextUtils.isEmpty(config) || MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(config)) {
            z = true ^ ew0.n(this.mConfig.y, OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_DISABLE_HARDWARE_DECODER_LIST, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
        } else {
            if (mDisableHardwareUtil == null) {
                mDisableHardwareUtil = new tug();
                tug tugVar = mDisableHardwareUtil;
                tugVar.d("model", "" + Build.MODEL);
                tug tugVar2 = mDisableHardwareUtil;
                tugVar2.d(g4.a.f2721a, "" + Build.VERSION.SDK_INT);
                mDisableHardwareUtil.d("cpu_name", ew0.e());
                mDisableHardwareUtil.d("brand", Build.BRAND);
                long _getUsingSoType = _getUsingSoType();
                tug tugVar3 = mDisableHardwareUtil;
                tugVar3.d("armeabi", "" + _getUsingSoType);
            }
            mDisableHardwareUtil.g(config);
            mDisableHardwareUtil.f();
            mDisableHardwareUtil.c("business_type", this.mConfig.x);
            mDisableHardwareUtil.c(atb.EXP_KEY_SUB_BUSINESS_TYPE, this.mConfig.y);
            mDisableHardwareUtil.c("component", this.mUsingInterface);
            mDisableHardwareUtil.c(xau.PROPERTY_VIDEO_ID, this.mConfig.B);
            if (mDisableHardwareUtil.e()) {
                z = false;
            }
        }
        if (ja1.g0()) {
            return false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void commitFetchSoEvent(boolean z) {
        if (!this.mHasCommitFetchSoFinish) {
            this.mHasCommitFetchSoFinish = z;
            this.mFetchSoTime = System.currentTimeMillis() - this.mFetchSoStartTime;
            TBS.Adv.ctrlClicked("Page_Video", CT.Button, "AVSDKFetchSo", "ver=1,", "fetch_time=" + this.mFetchSoTime, "end=" + (z ? 1 : 0));
        }
    }

    private static String computeMD5(String str) {
        return e2n.e(str);
    }

    private String convertSetToString(HashSet<Long> hashSet, String str) {
        Iterator<Long> it = hashSet.iterator();
        String str2 = "";
        while (it.hasNext()) {
            Long next = it.next();
            if (TextUtils.isEmpty(str2)) {
                str2 = str2 + next.longValue();
            } else {
                str2 = str2 + "_" + next.longValue();
            }
        }
        return str2;
    }

    private static boolean deleteFile(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFile(file2);
            }
            return file.delete();
        } else if (file.exists()) {
            return file.delete();
        } else {
            return false;
        }
    }

    private static void drawFrame(long j, String str) {
        TaobaoMediaPlayer taobaoMediaPlayerFromToken = getTaobaoMediaPlayerFromToken(j);
        if (taobaoMediaPlayerFromToken != null) {
            taobaoMediaPlayerFromToken.drawFrameInfo(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawFrameInfo(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.drawFrameInfo(java.lang.String):void");
    }

    private void generateRtcLiveControllInfoAndSetToCore() {
        JSONObject optJSONObject;
        String str;
        if (!TextUtils.isEmpty(this.mLivePushControlInfo) && this.mEnableRtcSwitch) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject(this.mLivePushControlInfo);
                if (jSONObject2.has("ntpStartLiveOffset")) {
                    long j = jSONObject2.getLong("ntpStartLiveOffset");
                    if (j > 0) {
                        _callWithMsgLong(FFP_PROP_INT64_NTP_START_OFFSET, j);
                    }
                }
                jSONObject.put("width", "" + jSONObject2.optInt("width"));
                if (jSONObject2.has("dataChannelMsId") && jSONObject2.has("streamLevelPriorityList") && jSONObject2.has("streamLevelInfo")) {
                    if (jSONObject2.has("dataChannelMsId")) {
                        jSONObject.put("dataChannelMsId", "" + jSONObject2.optString("dataChannelMsId"));
                    }
                    if (jSONObject2.has("streamLevelPriorityList")) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("streamLevelPriorityList");
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            jSONArray.put(optJSONArray.optInt(i) + "");
                        }
                        jSONObject.put("streamLevelPriorityList", jSONArray);
                    }
                    if (jSONObject2.has("streamLevelInfo")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("streamLevelInfo");
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("streamIndex", next);
                            if (jSONObject3.optJSONObject(next).has("streamLevel")) {
                                str = "" + optJSONObject.optInt("streamLevel");
                            } else {
                                str = "-1";
                            }
                            jSONObject4.put("streamLevel", str);
                            jSONObject4.put("streamId", "" + optJSONObject.optString("streamId"));
                            jSONArray2.put(jSONObject4);
                        }
                        jSONObject.put("streamLevelInfo", jSONArray2);
                    }
                    String jSONObject5 = jSONObject.toString();
                    AVSDKLog.e(this.mLogContext, "generateRtcLiveControllInfoAndSetToCore: " + jSONObject5);
                    _setPropertyString(21011, jSONObject5);
                }
            } catch (Exception e) {
                AVSDKLog.e(this.mLogContext, "generateRtcLiveControllInfoAndSetToCore exception " + e.toString());
            }
        }
    }

    private static synchronized long generateTextVideoViewToken(TaobaoMediaPlayer taobaoMediaPlayer) {
        long currentTimeMillis;
        synchronized (TaobaoMediaPlayer.class) {
            currentTimeMillis = System.currentTimeMillis() - new Random().nextInt();
            mTaobaoMediaPlayerMap.put(Long.valueOf(currentTimeMillis), taobaoMediaPlayer);
        }
        return currentTimeMillis;
    }

    private Context getApplicationContext() {
        Context context;
        if (mApplicationContext == null) {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference == null) {
                context = null;
            } else {
                context = weakReference.get();
            }
            mApplicationContext = context.getApplicationContext();
        }
        return mApplicationContext;
    }

    public static long getCdnSpeed() {
        if (mIsLibLoaded) {
            return _getCdnSpeed();
        }
        return 0L;
    }

    public static boolean getRtcWeakNetFlag() {
        if (mIsLibLoaded) {
            return _getRtcWeakNetFlag();
        }
        return false;
    }

    private static synchronized TaobaoMediaPlayer getTaobaoMediaPlayerFromToken(long j) {
        synchronized (TaobaoMediaPlayer.class) {
            if (j == 0) {
                return null;
            }
            return mTaobaoMediaPlayerMap.get(Long.valueOf(j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int initFetchSo() {
        /*
            r4 = this;
            loadVPMSoOnce()
            boolean r0 = tb.cq.a()
            r4.mFetchArtcSoReadyInit = r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mArtcSoPath
            java.lang.String r2 = tb.fq.t()
            r0.set(r2)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mArtcSoMajorVersion
            java.lang.String r2 = tb.fq.r()
            r0.set(r2)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mArtcSoMinorVersion
            java.lang.String r2 = tb.fq.s()
            r0.set(r2)
            tb.r7t r0 = r4.mConfig
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.K0
            if (r0 == 0) goto L_0x0035
            r4.mFetchArtcSoAfterSelect = r1
            r0 = -1
            goto L_0x0036
        L_0x0033:
            r4.mNeedRegisterFetchCallback = r1
        L_0x0035:
            r0 = 0
        L_0x0036:
            boolean r2 = tb.cq.b()
            r4.mFetchFFMpegSoReadyInit = r2
            if (r2 == 0) goto L_0x0068
            java.util.concurrent.atomic.AtomicBoolean r2 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mIsDecoderLoadedGlobal
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0068
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mFFMpegSoPath
            java.lang.String r3 = tb.fq.u()
            r2.set(r3)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mFFMpegSoPath
            java.lang.Object r2 = r2.get()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0068
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mFFMpegSoPath
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            loadDecoder(r2)
        L_0x0068:
            boolean r2 = r4.mFetchFFMpegSoReadyInit
            if (r2 == 0) goto L_0x007f
            java.util.concurrent.atomic.AtomicBoolean r2 = tv.danmaku.ijk.media.player.MonitorMediaPlayer.mIsDecoderLoadedGlobal
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x007f
            r4.mIsDecoderLoaded = r1
            r1 = 80024(0x13898, float:1.12138E-40)
            r2 = 1
            r4._setPropertyLong(r1, r2)
            goto L_0x0081
        L_0x007f:
            r4.mNeedRegisterFetchCallback = r1
        L_0x0081:
            boolean r1 = r4.mNeedRegisterFetchCallback
            if (r1 == 0) goto L_0x0095
            tb.cq.g(r4)
            java.util.concurrent.ExecutorService r1 = tb.dq.b()
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$CommitFetchSoStatRunnable r2 = new tv.danmaku.ijk.media.player.TaobaoMediaPlayer$CommitFetchSoStatRunnable
            r3 = 0
            r2.<init>()
            r1.submit(r2)
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.initFetchSo():int");
    }

    private void initPlayer(c15 c15Var) {
        a.i(this.mAnalysis, "INIT_PLAYER");
        this.mPlayerCreatTs = System.currentTimeMillis();
        monitorPlayerEventNew(1);
        loadLibrariesOnce(c15Var);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        native_setup(new WeakReference(this));
        if (this.mPlayerInitTimeMS == -1) {
            this.mPlayerInitTimeMS = System.currentTimeMillis();
        }
        _setOption(1, "timeout", 4000000L);
        a.h(this.mAnalysis, "INIT_PLAYER");
    }

    private static void initProxyOnce(Context context) {
        synchronized (TaobaoMediaPlayer.class) {
            try {
                a7m.d(context);
            }
        }
    }

    public static boolean isDecoderLoaded() {
        return MonitorMediaPlayer.mIsDecoderLoadedGlobal.get();
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isVPMLibLoaded() {
        boolean e = cq.e();
        MonitorMediaPlayer.mIsVPMLibLoaded = e;
        return e;
    }

    public static synchronized void loadDecoder(String str) {
        synchronized (TaobaoMediaPlayer.class) {
            if (mIsLibLoaded && !MonitorMediaPlayer.mIsDecoderLoadedGlobal.get()) {
                feh fehVar = mGlobalLogContext;
                AVSDKLog.e(fehVar, "loadDecoder " + str);
                MonitorMediaPlayer.mIsDecoderLoadedGlobal.set(true);
            }
        }
    }

    public static void loadLibrariesOnce(c15 c15Var) {
        mIsLoadLibrariesOnce.compareAndSet(false, true);
        synchronized (TaobaoMediaPlayer.class) {
            try {
                if (!mIsLibLoaded) {
                    AVSDKLog.e(mGlobalLogContext, "loadLibrariesOnce start");
                    if (c15Var != null) {
                        c15Var.loadLibrary("c++_shared");
                        c15Var.loadLibrary("tbffmpeg");
                        c15Var.loadLibrary("taobaoplayer");
                    } else {
                        AVSDKLog.e(mGlobalLogContext, "loadLib c++_shared start");
                        System.loadLibrary("c++_shared");
                        AVSDKLog.e(mGlobalLogContext, "loadLib tbffmpeg start");
                        System.loadLibrary("tbffmpeg");
                        AVSDKLog.e(mGlobalLogContext, "loadLib taobaoplayer start");
                        System.loadLibrary("taobaoplayer");
                    }
                    AVSDKLog.e(mGlobalLogContext, "loadLibrariesOnce finished");
                    mIsLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized boolean loadS266Decoder(String str) {
        synchronized (TaobaoMediaPlayer.class) {
            loadLibrariesOnce(null);
            if (!mIsLibLoaded) {
                AVSDKLog.e(mGlobalLogContext, "loadS266Decoder fail by loading other so fail");
                return false;
            }
            if (!MonitorMediaPlayer.mIs266DecoderLoadedGlobal) {
                feh fehVar = mGlobalLogContext;
                AVSDKLog.e(fehVar, "loadS266Decoder " + str);
                MonitorMediaPlayer.mIs266DecoderLoadedGlobal = true;
                _initS266Decoder(str);
            }
            return true;
        }
    }

    private static void loadVPMSoOnce() {
        synchronized (TaobaoMediaPlayer.class) {
            if (!MonitorMediaPlayer.mIsVPMLibLoaded && !MonitorMediaPlayer.mVPMLibLoadError) {
                if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "fixVPMLockANR", "false"))) {
                    try {
                        try {
                            try {
                                VPMManagerInstance.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                            } catch (ClassNotFoundException e) {
                                MonitorMediaPlayer.mVPMLibLoadError = true;
                                e.printStackTrace();
                            }
                        } catch (IllegalAccessException e2) {
                            MonitorMediaPlayer.mVPMLibLoadError = true;
                            e2.printStackTrace();
                        }
                    } catch (NoSuchMethodException e3) {
                        MonitorMediaPlayer.mVPMLibLoadError = true;
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        MonitorMediaPlayer.mVPMLibLoadError = true;
                        e4.printStackTrace();
                    }
                }
                MonitorMediaPlayer.mIsVPMLibLoaded = cq.e();
            }
        }
    }

    private void monitorLongTermAB(String str) {
        String l0 = ja1.l0("ab_experiment", str, "&");
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "LongTerm experiment is " + l0);
        if (!TextUtils.isEmpty(l0)) {
            try {
                long parseLong = Long.parseLong(l0);
                if (ja1.q0(parseLong, 1)) {
                    AVSDKLog.e(this.mLogContext, "解码器并行初始化 打开");
                    _setPropertyLong(FFP_PROP_INT64_SHOULD_INIT_DECODER_EARLY, 1L);
                    _setPropertyLong(FFP_PROP_INT64_SHOULD_OPEN_DEVICE_EARLY, 1L);
                } else {
                    AVSDKLog.e(this.mLogContext, "解码器并行初始化 关闭");
                    _setPropertyLong(FFP_PROP_INT64_SHOULD_INIT_DECODER_EARLY, 0L);
                    _setPropertyLong(FFP_PROP_INT64_SHOULD_OPEN_DEVICE_EARLY, 0L);
                }
                if (ja1.q0(parseLong, 2)) {
                    AVSDKLog.e(this.mLogContext, "解码器复用 打开");
                    _setPropertyLong(FFP_PROP_INT64_ENABLE_REUSE_MEDIACODEC, 1L);
                } else {
                    AVSDKLog.e(this.mLogContext, "解码器复用 关闭");
                    _setPropertyLong(FFP_PROP_INT64_ENABLE_REUSE_MEDIACODEC, 0L);
                }
                if (ja1.q0(parseLong, 3)) {
                    AVSDKLog.e(this.mLogContext, "禁用rtc慢播 打开");
                    _setPropertyLong(FFP_PROP_INT64_DISABLE_AUDIO_SLOW_PLAY, 1L);
                } else {
                    AVSDKLog.e(this.mLogContext, "禁用rtc慢播 关闭");
                    _setPropertyLong(FFP_PROP_INT64_DISABLE_AUDIO_SLOW_PLAY, 0L);
                }
                this.mExperiment = parseLong;
            } catch (NumberFormatException e) {
                PrintStream printStream = System.out;
                printStream.println("Invalid string format for a long: " + e.getMessage());
            }
        }
    }

    private native void native_setup(Object obj);

    private void notifyVideoInfo(long j, long j2, Object obj) {
        EventData eventData = new EventData();
        eventData.arg1 = j;
        eventData.arg2 = j2;
        eventData.obj = obj;
        notifyVideoInfo(eventData);
    }

    private static void onRenderFinish(Object obj) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (!(obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null)) {
            synchronized (TaobaoMediaPlayer.class) {
                try {
                    List<IMediaPlayer.OnVFPluginListener> list = taobaoMediaPlayer.mVFPluginListener;
                    if (list != null) {
                        for (IMediaPlayer.OnVFPluginListener onVFPluginListener : list) {
                            onVFPluginListener.onRenderFinish(taobaoMediaPlayer);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static int onRenderOesTextureCallback(Object obj, int i, int i2, int i3, float[] fArr) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null) {
            return -1;
        }
        synchronized (TaobaoMediaPlayer.class) {
            try {
                List<IMediaPlayer.OnVFPluginListener> list = taobaoMediaPlayer.mVFPluginListener;
                if (list != null) {
                    for (IMediaPlayer.OnVFPluginListener onVFPluginListener : list) {
                        int onRenderOes = onVFPluginListener.onRenderOes(taobaoMediaPlayer, i, i2, i3, fArr);
                        if (onRenderOes >= 0) {
                            return onRenderOes;
                        }
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int onRenderYuvTextureCallback(Object obj, int i, int i2, int i3, int i4, int i5) {
        TaobaoMediaPlayer taobaoMediaPlayer;
        if (obj == null || (taobaoMediaPlayer = (TaobaoMediaPlayer) ((WeakReference) obj).get()) == null) {
            return -1;
        }
        synchronized (TaobaoMediaPlayer.class) {
            try {
                List<IMediaPlayer.OnVFPluginListener> list = taobaoMediaPlayer.mVFPluginListener;
                if (list != null) {
                    for (IMediaPlayer.OnVFPluginListener onVFPluginListener : list) {
                        int onRenderYUV = onVFPluginListener.onRenderYUV(taobaoMediaPlayer, i, i2, i3, i4, i5);
                        if (onRenderYUV >= 0) {
                            return onRenderYUV;
                        }
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onVideoVolumeChangeBroadcast(boolean z, String str) {
        Intent intent = new Intent("com.taobao.avplayer.muteStateChanged");
        intent.putExtra("isMute", z);
        intent.putExtra("subBussinessType", str);
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    private void postRenderingStartMesageInReuseState() {
        EventHandler eventHandler;
        if (this.mReuseFlag && !this.mHasPostRenderFirstMesasgeInReuseState && (eventHandler = this.mEventHandler) != null) {
            this.mHasPostRenderFirstMesasgeInReuseState = true;
            Message obtainMessage = eventHandler.obtainMessage(200);
            EventData eventData = new EventData();
            eventData.arg1 = 3L;
            eventData.arg2 = System.currentTimeMillis();
            eventData.arg3 = 0L;
            obtainMessage.obj = eventData;
            this.mEventHandler.sendMessageAtFrontOfQueue(obtainMessage);
            AVSDKLog.e(this.mLogContext, "post another onInfo_MEDIA_INFO_VIDEO_RENDERING_START event");
        }
    }

    private void recordFirstSetSurfaceTime(Surface surface) {
        if (surface != null && this.mFirstSetSurfaceTime == 0) {
            this.mFirstSetSurfaceTime = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void registerBluetoothReceiver() {
        WeakReference<Context> weakReference = this.mContextRef;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "registerBluetoothReceiver fail, taobaoMediaPlayer index=" + this.mPlayerIndex);
            return;
        }
        if (mReceiveInstance == null) {
            mReceiveInstance = new BluetoothStateBroadcastReceive(this.mLogContext.b());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.SCO_AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
            try {
                Context applicationContext = getApplicationContext();
                if (applicationContext != null) {
                    applicationContext.registerReceiver(mReceiveInstance, intentFilter);
                    this.mIsReceiverRegistered = true;
                }
            } catch (Exception unused) {
                AVSDKLog.e(this.mLogContext, "registerReceiver failed");
            }
        }
        mReceiveInstance.a(this);
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, "registerBluetoothReceiver suc, taobaoMediaPlayer index=" + this.mPlayerIndex);
    }

    private synchronized void registerNetworkStateReceiver() {
        if (this.mEnableNetworkQuality) {
            try {
                xsj.a().c(this);
            } catch (Exception unused) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "registerNetworkStateReceiver failed, taobaoMediaPlayer index=" + this.mPlayerIndex);
            }
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "registerNetworkStateReceiver suc, taobaoMediaPlayer index=" + this.mPlayerIndex);
        }
    }

    private static void removeDir(String str) {
        deleteFile(new File(str));
    }

    private void removeFrameInfoView() {
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup != null) {
            TextureView textureView = this.mFrameInfoBaseView;
            if (textureView != null) {
                viewGroup.removeView(textureView);
                this.mFrameInfoBaseView = null;
            }
            if (this.mFrameInfoBaseView != null) {
                this.mViewGroup.removeView(this.mFrameInfoTextureView);
                this.mFrameInfoTextureView = null;
            }
            if (this.mFrameInfoBaseView != null) {
                this.mViewGroup.removeView(this.mFrameInfoSurfaceView);
                this.mFrameInfoSurfaceView = null;
            }
            this.mViewGroup = null;
        }
    }

    private static synchronized void removeTextureVideoViewByToken(long j) {
        synchronized (TaobaoMediaPlayer.class) {
            if (j != 0) {
                mTaobaoMediaPlayerMap.remove(Long.valueOf(j));
            }
        }
    }

    private void resizePlayerNum() {
        if (_getUsingSoType() == 2) {
            pgi.n().p(3);
        }
    }

    private void setFlvExtraConfig() {
        if (!ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "enableFlvConfig", "true"))) {
            _setPropertyLong(FFP_PROP_INT64_FAST_PLAY, 0L);
            return;
        }
        ja1.T();
        String str = ja1.m0;
        if (TextUtils.isEmpty(str)) {
            str = MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "flvConfigTest", "");
            if (TextUtils.isEmpty(str)) {
                return;
            }
        }
        setFlvExtraConfigInner(str);
    }

    private void setFlvExtraConfigInner(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("flvLiveControl_720");
            if (optJSONObject != null) {
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_720, optJSONObject.optInt("maxQueueTimeMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_720, optJSONObject.optInt("fastPlayEnterMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_720, optJSONObject.optInt("fastPlayExitMs"));
                _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_720, (float) optJSONObject.optDouble("fastPlayRate"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("flvLiveControl_1080");
            if (optJSONObject2 != null) {
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MAX_QUEUE_TIME_MS_1080, optJSONObject2.optInt("maxQueueTimeMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_1080, optJSONObject2.optInt("fastPlayEnterMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_1080, optJSONObject2.optInt("fastPlayExitMs"));
                _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_1080, (float) optJSONObject2.optDouble("fastPlayRate"));
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("flvLiveControl");
            if (optJSONObject3 != null) {
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_MQX_QUEUE_TIME_MS_DEFAULT, optJSONObject3.optInt("maxQueueTimeMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_ENTER_MS_DEFAULT, optJSONObject3.optInt("fastPlayEnterMs"));
                _setPropertyLong(FFP_PROP_INT64_FLV_PARAM_FAST_PLAY_QUIT_MS_DEFAULT, optJSONObject3.optInt("fastPlayExitMs"));
                _setPropertyFloat(FFP_PROP_FLOAT_FLV_PARAM_FAST_PLAY_RATE_DEFAULT, (float) optJSONObject3.optDouble("fastPlayRate"));
            }
        } catch (JSONException e) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "setFlvExtraConfigInner " + str + ", error: " + e.toString());
        }
    }

    private void setHasControlSurface(Surface surface) {
        if (surface != null) {
            this.mHasSetControlSurface = true;
        }
    }

    private void setHasSurface(Surface surface) {
        if (surface != null) {
            this.mHasSetSurface = true;
        }
    }

    private void setOptions(int i, Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key == null || value == null)) {
                    _setOption(i, key, value);
                }
            }
        }
    }

    private boolean showFrameInfo() {
        if (this.mFrameInfoLevel >= 0) {
            return true;
        }
        return false;
    }

    private void stopAdaptiveLiveController() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        if (adaptiveLiveController != null) {
            adaptiveLiveController.stop();
            unregisterOnInfoListener(this.mAdapitveLiveController);
            unregisterOnPlayerEventListener(this.mAdapitveLiveController);
            this.mAdapitveLiveController = null;
        }
    }

    private void unregisterFetchCallback() {
        if (this.mNeedRegisterFetchCallback) {
            this.mNeedRegisterFetchCallback = false;
            dq.b().submit(new UnregisterFetchSoRunnable());
        }
    }

    private synchronized void unregisterNetworkStateReceiver() {
        if (this.mEnableNetworkQuality) {
            try {
                xsj.a().e(this);
            } catch (Exception unused) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "unregisterNetworkStateReceiver failed index, taobaoMediaPlayer index=" + this.mPlayerIndex);
            }
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "unregisterNetworkStateReceiver suc, taobaoMediaPlayer index=" + this.mPlayerIndex);
        }
    }

    public native void _callWithMsgFloat(int i, float f);

    public native void _callWithMsgLong(int i, long j);

    public native void _callWithMsgString(int i, String str);

    public native float _getCurCachePosition();

    public native float _getPropertyFloat(int i, float f);

    public native long _getPropertyLong(int i, long j);

    public native String _getPropertyString(int i);

    public native long _getUsingSoType();

    public native float _getVideoRenderPts();

    public native void _notifyVideoRenderStateChange();

    public native void _prepareAsync() throws IllegalStateException;

    public native String _sendDebugCommand(String str);

    public native void _setBluetoothConnectStatus(int i);

    public native void _setOption(int i, String str, long j);

    public native void _setOption(int i, String str, String str2);

    public native void _setPropertyFloat(int i, float f);

    public native void _setPropertyLong(int i, long j);

    public native void _setPropertyString(int i, String str);

    public native int _switchPathSyncFrame(String str);

    public native void _switchStreamSeamless(String str);

    public void addExperienceInfo(long j, long j2, long j3) {
        this.mExperienceIdSet.add(Long.valueOf(j));
        this.mExperienceReleaseIdSet.add(Long.valueOf(j2));
        this.mExperienceBucketIdSet.add(Long.valueOf(j3));
    }

    public void audioOff() {
        if (0 == this.mRtcAudioFakeDisable) {
            this.mAudioOff = true;
            _audioOff();
            if (this.mStartDisableAudio) {
                monitorSetAudiOff();
            } else {
                initDisableAudio(true);
            }
        } else {
            setMuted(true);
        }
    }

    public void audioOn() {
        if (0 == this.mRtcAudioFakeDisable) {
            this.mAudioOff = false;
            _audioOn();
            monitorSetAudioOn();
            return;
        }
        setMuted(false);
    }

    public void callWithMsg(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                callWithMsgInner(entry.getKey(), entry.getValue());
            }
        }
    }

    public void disableOnRenderCallback() {
        _disableOnRenderCallback();
    }

    public void enableOnRenderCallback() {
        _enableOnRenderCallback();
    }

    public BluetoothStateBroadcastReceive.BLUESTATUS getBlueConnectStatus() {
        BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive = mReceiveInstance;
        if (bluetoothStateBroadcastReceive != null) {
            return bluetoothStateBroadcastReceive.b();
        }
        return BluetoothStateBroadcastReceive.BLUESTATUS.NOTOPEN;
    }

    public void getBlueToothState() {
        BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive = mReceiveInstance;
        if (bluetoothStateBroadcastReceive == null) {
            return;
        }
        if (bluetoothStateBroadcastReceive.b() == BluetoothStateBroadcastReceive.BLUESTATUS.CONNECT) {
            setBluetoothStatus(true);
        } else {
            setBluetoothStatus(false);
        }
    }

    public boolean getBuleRegisterSattus() {
        return this.mIsReceiverRegistered;
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public float getCurCachePosition() {
        return _getCurCachePosition();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getCurrentPosition();

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        if (this.mDuration <= 0) {
            this.mDuration = _getDuration();
        }
        return this.mDuration;
    }

    public boolean getEnableRtcSwitch() {
        return this.mEnableRtcSwitch;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public String getExperienceBuctetId() {
        return convertSetToString(this.mExperienceBucketIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public String getExperienceId() {
        return convertSetToString(this.mExperienceIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public String getExperienceReleaseId() {
        return convertSetToString(this.mExperienceReleaseIdSet, "_");
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public String getExterntPlayEx() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        if (adaptiveLiveController != null) {
            return adaptiveLiveController.getPlayExStat();
        }
        return "";
    }

    public HashMap<String, String> getLiveControlInfoForPlayEx() {
        Set<Map.Entry<String, Object>> entrySet;
        if (TextUtils.isEmpty(this.mLivePushControlInfo)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) JSON.parse(this.mLivePushControlInfo);
            if (!(jSONObject == null || (entrySet = jSONObject.entrySet()) == null || entrySet.size() <= 0)) {
                for (Map.Entry<String, Object> entry : entrySet) {
                    String str = entry.getKey().toString();
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, entry.getValue().toString());
                    }
                }
            }
        } catch (Exception e) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "getLiveControlInfoForPlayEx error " + e.toString());
        }
        return hashMap;
    }

    public long getMaxRenderInterval() {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "shengjian::before getMaxRenderInterval mMaxRenderInterval=" + this.mMaxRenderInterval);
        if (this.bFirstFrameRendered && this.mLastMonitorRenderSystemTime > 0) {
            this.mMaxRenderInterval = Math.max(this.mMaxRenderInterval, System.currentTimeMillis() - this.mLastMonitorRenderSystemTime);
        } else if (!this.bFirstFrameRendered && this.mStartTime > 0) {
            this.mMaxRenderInterval = Math.max(this.mMaxRenderInterval, System.currentTimeMillis() - this.mStartTime);
        }
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, "shengjian::after getMaxRenderInterval mMaxRenderInterval=" + this.mMaxRenderInterval);
        return this.mMaxRenderInterval;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public List<Integer> getNetworkQualityStateNodes() {
        return this.mNetworkQualityStateNodes;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public long getPoorNetworkTime() {
        return this.mPoorNetworkTime;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(this.mLastErrorCode));
        hashMap.put("abnormal_count", String.valueOf(this.mBufferingCount));
        hashMap.put("abnormal_total_time", String.valueOf(this.mBufferingTotalTime));
        hashMap.put("video_rendering_stalled_count", String.valueOf(this.videoRenderingStalledCount));
        hashMap.put("first_frame_rendering_time", String.valueOf(this.mFirstRenderTime));
        hashMap.put("first_frame_update_ts", String.valueOf(this.mFirstFrameSurfaceUpdateTs));
        this.mHttpOpenTime = _getPropertyLong(FFP_PROP_INT64_AVFORMAT_OPEN_TIME, 0L);
        hashMap.put("realtimeBandWidth", String.valueOf((((float) _getPropertyLong(21009, 0L)) / 1024.0f) / 1000.0f));
        hashMap.put("open_time", String.valueOf(this.mHttpOpenTime));
        hashMap.put("p2ff_state", String.valueOf(this.mP2ffState));
        r7t r7tVar = this.mConfigClone;
        if (r7tVar != null) {
            hashMap.put("net_speed", String.valueOf(r7tVar.K));
        }
        return hashMap;
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public long getVPMSessioinId() {
        return _getVPMSessioinId();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        int i = this.mRotate;
        if (i == 90 || i == 270) {
            return this.mVideoWidth;
        }
        return this.mVideoHeight;
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public float getVideoRenderPts() {
        return _getVideoRenderPts();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        int i = this.mRotate;
        if (i == 90 || i == 270) {
            return this.mVideoHeight;
        }
        return this.mVideoWidth;
    }

    public long getViedoCodecType() {
        return this.mVideoCodecType;
    }

    public List<mya> hitTest(List<lya> list) {
        if (this.mPanoType == 0 || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (lya lyaVar : list) {
            float[] _hitTest = _hitTest(lyaVar.b, lyaVar.c);
            if (_hitTest != null && _hitTest.length == 2) {
                mya myaVar = new mya();
                myaVar.f24389a = lyaVar;
                myaVar.b = _hitTest[0];
                myaVar.c = _hitTest[1];
                arrayList.add(myaVar);
            }
        }
        return arrayList;
    }

    public void initAdapitveLiveController(boolean z, int i, int i2, float f, float f2) {
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            int i3 = r7tVar.d;
            boolean z2 = false;
            boolean z3 = (i3 == 1) | (i3 == 0);
            if (MediaConstant.RTCLIVE_URL_NAME.equals(r7tVar.N) || MediaConstant.BFRTC_URL_NAME.equals(this.mConfig.N)) {
                z2 = true;
            }
            if (z3 && z2) {
                AdaptiveLiveController adaptiveLiveController = new AdaptiveLiveController(this);
                this.mAdapitveLiveController = adaptiveLiveController;
                adaptiveLiveController.initParam(z, i, i2, f, f2);
                registerOnPlayerEventListener(this.mAdapitveLiveController);
                registerOnInfoListener(this.mAdapitveLiveController);
                _setPropertyLong(80004, this.mAdapitveLiveController.getDeciseWindow());
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
        if (this.mVolume != 0.0f && !this.bInstantSeeked) {
            this.mMuteAudio = true;
            _setPropertyLong(21008, 1L);
        }
        this.bInstantSeeked = true;
        this.mSeekPos = j;
        monitorSeek();
        _seekTo(j);
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public boolean isAudioHardwareDecode() {
        if (_getPropertyLong(FFP_PROP_INT64_AUDIO_DECODER_TYPE, 0L) == 2) {
            return true;
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public boolean isHardwareDecode() {
        long _getPropertyLong = _getPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 0L);
        if (_getPropertyLong == 32 || _getPropertyLong == 64) {
            return true;
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native boolean isPlaying();

    public void monitorRtcLiveAbrReason(int i) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "monitorRtcLiveAbrReason reason: " + i);
        this.mRtcLiveAbrReasonList.offer(Integer.valueOf(i));
        if (this.mRtcLiveAbrReasonList.size() > 80) {
            this.mRtcLiveAbrReasonList.poll();
        }
    }

    public void notifySwitchLiveLevel(int i) {
        EventData eventData = new EventData();
        eventData.arg1 = 12002L;
        eventData.arg2 = i;
        notifyVideoInfo(eventData);
    }

    @Override // tb.eq
    public void onFetchFinished(gq gqVar) {
        MonitorMediaPlayer.mArtcSoPath.set(gqVar.b);
        MonitorMediaPlayer.mArtcSoMajorVersion.set(gqVar.c);
        MonitorMediaPlayer.mArtcSoMinorVersion.set(gqVar.d);
        MonitorMediaPlayer.mFFMpegSoPath.set(gqVar.e);
        if (!TextUtils.isEmpty(MonitorMediaPlayer.mArtcSoPath.get())) {
            commitFetchSoEvent(true);
        }
        unregisterFetchCallback();
    }

    public void onNetworkStateUpdate(int i, double d) {
        if (this.mEnableNetworkQuality) {
            this.mNetworkQualityStateNodes.add(Integer.valueOf(i));
            int i2 = this.mCurrNetworkQuality;
            this.mCurrNetworkQuality = i;
            if (i2 == 1 && i != 1 && this.mLastPoorNetStartTs > 0) {
                this.mPoorNetworkTime += System.currentTimeMillis() - this.mLastPoorNetStartTs;
                this.mLastPoorNetStartTs = -1L;
            }
            if (i2 != 1 && this.mCurrNetworkQuality == 1) {
                this.mLastPoorNetStartTs = System.currentTimeMillis();
            }
            r7t r7tVar = this.mConfig;
            if (r7tVar != null && r7tVar.d == 0) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("ANetWorkLevel", String.valueOf(i));
                    hashMap.put("ANetWorkBWCurrent", String.valueOf((float) z5r.c()));
                    hashMap.put("ANetworkBWPredict", String.valueOf(d));
                    String jSONString = JSON.toJSONString(hashMap);
                    _updateNetWorkInfo(jSONString);
                    AVSDKLog.e(this.mLogContext, "onNetworkStateUpdate: networkJson=" + jSONString);
                } catch (Exception unused) {
                    AVSDKLog.e(this.mLogContext, "onNetworkStateUpdate to native rtc failed.");
                }
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public void onRenderingHung() {
        super.onRenderingHung();
        _onRenderingHung();
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public void onRenderingResumed() {
        super.onRenderingResumed();
        _onRenderingResumed();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "pause called, taobaoMediaPlayer index = " + this.mPlayerIndex);
        monitorPause();
        _pause();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        a.i(this.mAnalysis, "PREPARE");
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mVideoSarNum = 0;
        this.mVideoSarDen = 0;
        this.mDuration = 0L;
        monitorPrepare();
        _prepareAsync();
    }

    public void refreshScreen() {
        _refreshScreen();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        a.i(this.mAnalysis, InstantPatchChangeInfo.TYPE_RELEASE);
        this.mDebugStatus = "Release";
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "release called, taobaoMediaPlayer index = " + this.mPlayerIndex);
        monitorPlayerEventNew(6);
        stopAdaptiveLiveController();
        monitorPlayExperience();
        _uploadRecvBytes();
        monitorRelease();
        IApmEventListener iApmEventListener = this.mApmEventListener;
        if (iApmEventListener != null) {
            c21.k(iApmEventListener);
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "ApmManager removeApmEventListener, taobaoMediaPlayer index = " + this.mPlayerIndex);
            this.mApmEventListener = null;
        }
        if (!this.mSyncNotifyHttpDns) {
            notifyHttpDnsAdapterConnectionEvent();
        }
        synchronized (TaobaoMediaPlayer.class) {
            try {
                EventHandler eventHandler = this.mEventHandler;
                if (eventHandler != null) {
                    eventHandler.removeCallbacksAndMessages(null);
                    this.mEventHandler = null;
                }
                this.mVideoWidth = 0;
                this.mVideoHeight = 0;
                this.mDuration = 0L;
                this.mIsFloatWindow = false;
                this.mSwitchScene = null;
                this.mSwitchSceneTime = 0L;
                this.mLivePushControlInfo = null;
                r7t r7tVar = this.mConfigClone;
                if (!(r7tVar == null || r7tVar.d == 0)) {
                    this.mDynamicPlayExMap = null;
                }
                this.mSwitchSceneTime = 0L;
                this.mSwitchScene = null;
                this.mSeamlessSwitchStatusAll = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        _release();
        unregisterFetchCallback();
        a.h(this.mAnalysis, InstantPatchChangeInfo.TYPE_RELEASE);
        r7t r7tVar2 = this.mConfig;
        if (r7tVar2 != null) {
            a.b(this.mAnalysis, r7tVar2.d);
        }
    }

    public void releaseAlphaBitmap() {
        AVSDKLog.e(this.mLogContext, "releaseAlphaBitmap");
        _releaseAlphaBitmap();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
        if (this.mSyncNotifyHttpDns) {
            notifyHttpDnsAdapterConnectionEvent();
        }
        _preRelease();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        monitorPlayExperience();
        monitorReset();
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            a.b(this.mAnalysis, r7tVar.d);
        }
        synchronized (TaobaoMediaPlayer.class) {
            try {
                EventHandler eventHandler = this.mEventHandler;
                if (eventHandler != null) {
                    eventHandler.removeCallbacksAndMessages(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        _release();
    }

    public void seamlessSwitchStream(Surface surface) {
        if (this.mEnableRtcSwitch) {
            this.mArtcSwitchCount++;
        }
        this.mSeamlessSwitchStartTime = System.currentTimeMillis();
        this.mSeamlessSwitchStatus = 0;
        this.mSeamlessSwitchIndex++;
        AVSDKLog.e(this.mLogContext, "SeamlessSwitch change Stream " + surface);
        _switchStream(surface);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        if (this.mVolume != 0.0f && this.bInstantSeeked) {
            this.mMuteAudio = false;
            _setPropertyLong(21008, 0L);
        }
        this.bInstantSeeked = false;
        this.mSeekPos = j;
        monitorSeek();
        _seekTo(j);
    }

    public void setAlphaBitmap(Bitmap bitmap) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setAlphaBitmap " + bitmap);
        _setAlphaBitmap(bitmap);
    }

    public void setBluetoothStatus(boolean z) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setBluetoothStatus=" + z);
        if (z) {
            _setBluetoothConnectStatus(1);
            _setPropertyLong(FFP_PROP_INT64_BLUETOOTH_CONNECT, 1L);
            this.mHasEverEnableBluetooth = true;
            return;
        }
        _setPropertyLong(FFP_PROP_INT64_BLUETOOTH_CONNECT, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0d0d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0e30  */
    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int setConfig(tb.r7t r21) {
        /*
            Method dump skipped, instructions count: 3640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setConfig(tb.r7t):int");
    }

    public void setControlSurface(Surface surface) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setControlSurface surface=" + surface + ", mSurface=" + this.mControlSurface);
        Surface surface2 = this.mControlSurface;
        if ((surface2 != null || surface != null) && surface2 != surface) {
            this.mControlSurface = surface;
            if (surface != null) {
                feh fehVar2 = this.mLogContext;
                AVSDKLog.e(fehVar2, "setControlSurface surface=" + surface + ", mSurface=" + this.mControlSurface);
                setHasControlSurface(surface);
                _setVideoSurface(surface);
                return;
            }
            _releaseSurface();
        }
    }

    public void setEnableRtcSwitch(boolean z) {
        this.mEnableRtcSwitch = z;
    }

    public void setFov(float f, float f2, float f3) {
        if (this.mPanoType > 0) {
            _setPropertyLong(FFP_PROP_FLOAT_PANO_FOV_PARAM_CHANGE, 1L);
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_FOV, f);
            float max = Math.max(Math.min(f2, 90.0f - this.mPanoMaxPolarToleranceDegrees), this.mPanoMaxPolarToleranceDegrees - 90.0f);
            float f4 = f3 % 360.0f;
            if (f4 > 180.0f) {
                f4 -= 360.0f;
            }
            if (f4 < -180.0f) {
                f4 += 360.0f;
            }
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_LATITUDE, max);
            _setPropertyFloat(FFP_PROP_FLOAT_PANO_LONGITUDE, f4);
        }
    }

    public void setHttpRequestHeader(HashMap<String, String> hashMap) {
        if (!hashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getValue());
                }
                sb.append("\r\n");
                _setOption(1, "headers", sb.toString());
                sb.setLength(0);
            }
        }
    }

    public void setLiveDefinitionAutoSwitch(boolean z) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "rtcLiveAutoSwitch: " + this.mRtcLiveAutoSwitch + " => " + z);
        this.mRtcLiveAutoSwitch = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
        long j;
        r7t r7tVar = this.mConfig;
        if (!(r7tVar == null || r7tVar.d != 2 || this.mLastMuteState == z)) {
            onVideoVolumeChangeBroadcast(z, r7tVar.y);
        }
        this.mMuteStateNodes.add(Integer.valueOf(z ? 1 : 0));
        this.mMuteAudio = z;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        _setPropertyLong(21008, j);
        if (!z) {
            this.mAlwaysMutePlay = false;
        }
        this.mLastMuteState = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
        this.mPlayRate = f;
        _setPropertyFloat(10003, f);
    }

    public void setPlayingLiveDefinition(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.mPlayingLiveDefinition) || this.mPlayingLiveDefinition.equals(str)) {
            this.mPlayingLiveDefinition = str;
            return;
        }
        computePlayTimeForRtcSwitch();
        this.mLastPlayTime = System.currentTimeMillis();
        if (this.mIsBackground) {
            this.mLastPlayTimeInBackground = this.mLastPlayTime;
        }
        this.mPlayingLiveDefinition = str;
    }

    public void setRequestHeader(Map<String, String> map) {
        if (map != null) {
            this.mRequestHeader = new HashMap<>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.mRequestHeader.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void setReuseFlag(boolean z) {
        this.mReuseFlag = z;
    }

    public void setSeamlessSwitchOption(boolean z, int i, boolean z2) {
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, i);
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY, z ? 1L : 0L);
        _setPropertyLong(FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT, 8L);
        _setSeamlessSwitchMode(1);
    }

    public void setSeamlessSwitchUrl(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "SeamlessSwitch setSeamlessSwitchUrl " + str);
        setGrtnRtcConfig(str);
        this.mSeamlessSwitchPath = str;
        _setSeamlessSwitchUrl(str);
    }

    public void setShowViewParent(ViewGroup viewGroup) {
        if (showFrameInfo()) {
            long j = this.mTextureVideoViewNativeToken;
            if (j == 0) {
                AVSDKLog.e(this.mLogContext, "setShowViewParent add");
                this.mViewGroup = viewGroup;
                long generateTextVideoViewToken = generateTextVideoViewToken(this);
                this.mTextureVideoViewNativeToken = generateTextVideoViewToken;
                _setPropertyLong(FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR, generateTextVideoViewToken);
                addFrameInfoView();
            } else if (j != 0 && viewGroup == null) {
                AVSDKLog.e(this.mLogContext, "setShowViewParent remove");
                removeTextureVideoViewByToken(this.mTextureVideoViewNativeToken);
                this.mTextureVideoViewNativeToken = 0L;
                _setPropertyLong(FFP_PROP_INT64_EXTEND_DRAW_FRAME_INFO_PTR, 0L);
                this.mFrameInfoSurfaceView = null;
                this.mFrameInfoTextureView = null;
                this.mFrameInfoBaseView = null;
                this.mViewGroup = null;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setSurface surface=" + surface + ", mSurface=" + this.mSurface);
        Surface surface2 = this.mSurface;
        if ((surface2 != null || surface != null) && surface2 != surface) {
            recordFirstSetSurfaceTime(surface);
            setHasSurface(surface);
            this.mSurface = surface;
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "setSurface surface=" + surface);
            if (this.mSurface == null) {
                if (!this.mEnableStatRenderStallInNonSurface) {
                    this.mLastRenderVideoEveryFrame = 0L;
                    this.mLastMonitorRenderSystemTime = 0L;
                    checkStatRenderStallFlag();
                    onRenderingHung();
                    if (this.mEnableRenderStallCalNew) {
                        onRenderingHungV2();
                    }
                }
                _releaseSurface();
                return;
            }
            if (!this.mEnableStatRenderStallInNonSurface) {
                onRenderingResumed();
                if (this.mEnableRenderStallCalNew) {
                    onRenderingResumedV2();
                }
                checkStatRenderStallFlag();
            }
            _setVideoSurface(surface);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setSurfaceSize width=" + i + ", height=" + i2);
        _setVideoSurfaceSize(i, i2);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        float f3 = this.mVolume;
        this.mLastVolume = f3;
        this.mVolume = f;
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.d == 2 && ((f3 > 0.0f && f == 0.0f) || (f3 == 0.0f && f > 0.0f))) {
            onVideoVolumeChangeBroadcast(f == 0.0f, r7tVar.y);
        }
        this.mVolumeStateNodes.add(Float.valueOf(this.mVolume));
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setVolume, leftVolume: " + f + ", rightVolume: " + f2);
        _setPropertyFloat(12001, f);
        if (f == 0.0f && f2 == 0.0f) {
            this.mMuteAudio = true;
            _setPropertyLong(21008, 1L);
            return;
        }
        this.mMuteAudio = false;
        _setPropertyLong(21008, 0L);
        this.mAlwaysMutePlay = false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "start called, taobaoMediaPlayer index=" + this.mPlayerIndex);
        monitorStart();
        _setPropertyLong(11007, 1L);
        _start();
        postRenderingStartMesageInReuseState();
    }

    public void startRtcAdaption(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "startRtcAdaption " + str);
        if (TextUtils.isEmpty(str)) {
            AVSDKLog.e(this.mLogContext, "startRtcAdaption empty param");
        } else {
            _startRtcAdaption(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "stop called, taobaoMediaPlayer index = " + this.mPlayerIndex);
        _pause();
        IApmEventListener iApmEventListener = this.mApmEventListener;
        if (iApmEventListener != null) {
            c21.k(iApmEventListener);
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "ApmManager removeApmEventListener, taobaoMediaPlayer index = " + this.mPlayerIndex);
            this.mApmEventListener = null;
        }
        unregisterBluetoothReceiver();
        if (this.mEnableNetworkQuality) {
            unregisterNetworkStateReceiver();
        }
    }

    public void stopRtcAdaption() {
        AVSDKLog.e(this.mLogContext, "stopRtcAdaption called.");
        _stopRtcAdaption();
    }

    public void stopSwitch() {
        AVSDKLog.e(this.mLogContext, "stopSwitch called.");
        _stopSeamlessSwitch();
    }

    public void switchStreamSeamless(String str) {
        this.mErrorCodeInternal = this.mLastErrorCode;
        this.mLastErrorCode = 0;
        this.mSwitchStreamSeamlessTs = System.currentTimeMillis();
        monitorPlayerEventNew(20);
        _switchStreamSeamless(str);
    }

    public void switchToNewDefinition(int i, String str) {
        if (this.mEnableRtcSwitch) {
            this.mArtcSwitchCount++;
            if (isSwitchUp(this.mPlayingLiveDefinition, str)) {
                this.mArtcSwitchUpCount++;
                if (i == 2) {
                    this.mArtcAbrSwitchUpCount++;
                }
            } else {
                this.mArtcSwitchDownCount++;
                if (this.mFirstSwitchDownReason == -1) {
                    this.mFirstSwitchDownReason = i;
                }
                if (i == 2) {
                    this.mArtcAbrSwitchDownCount++;
                }
            }
        }
        this.mSwitchTargetLiveDefinition = str;
        this.mSeamlessSwitchStartTime = System.currentTimeMillis();
        this.mSeamlessSwitchStatus = 0;
        this.mSeamlessSwitchIndex++;
        monitorPlayerEventNew(16);
        AVSDKLog.e(this.mLogContext, "switchToNewDefinition definition: " + str);
        _switchStream(null);
    }

    public synchronized void unregisterBluetoothReceiver() {
        BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive;
        try {
            WeakReference<Context> weakReference = this.mContextRef;
            if ((weakReference == null ? null : weakReference.get()) == null || (bluetoothStateBroadcastReceive = mReceiveInstance) == null) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "unregisterBluetoothReceiver fail, taobaoMediaPlayer index=" + this.mPlayerIndex);
            } else {
                bluetoothStateBroadcastReceive.c(this);
                feh fehVar2 = this.mLogContext;
                AVSDKLog.e(fehVar2, "unregisterBluetoothReceiver suc, taobaoMediaPlayer index=" + this.mPlayerIndex);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateAbrRedundantRequestSwitchCount(boolean z) {
        if (this.mEnableRtcSwitch) {
            AVSDKLog.e(this.mLogContext, "updateAbrRedundantRequestSwitchCount upSwitch: " + z);
            if (z) {
                this.mArtcAbrRedundantRequestSwitchUpCount++;
            } else {
                this.mArtcAbrRedundantRequestSwitchDownCount++;
            }
        }
    }

    public void updateAbrRequestSwitchCount(boolean z, boolean z2) {
        if (this.mEnableRtcSwitch) {
            if (z2) {
                if (z) {
                    this.mArtcAbrRequestSwitchUpCount++;
                } else {
                    this.mArtcAbrRequestSwitchDownCount++;
                }
            }
            if (z) {
                this.mArtcAbrTotalRequestSwitchUpCount++;
            } else {
                this.mArtcAbrTotalRequestSwitchDownCount++;
            }
        }
    }

    public void updateAlphaBitmap(Bitmap bitmap) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "updateAlphaBitmap " + bitmap);
        _updateAlphaBitmap(bitmap);
    }

    public void updateLastStreamSelectReason(int i) {
        if (this.mStreamSelectReasonList.size() >= 2) {
            this.mStreamSelectReasonList.removeFirst();
        }
        this.mStreamSelectReasonList.add(Integer.valueOf(i));
    }

    public void updateMuteNodes(boolean z) {
        if (z) {
            this.mMuteStateNodes.add(1);
        } else {
            this.mMuteStateNodes.add(0);
        }
    }

    public void updateSeamlessSwitchStatus(int i, String str) {
        String str2 = "" + i + f7l.BRACKET_START_STR + str + f7l.BRACKET_END_STR;
        if (TextUtils.isEmpty(this.mSeamlessSwitchStatusAll)) {
            this.mSeamlessSwitchStatusAll = str2;
            return;
        }
        this.mSeamlessSwitchStatusAll += "_" + str2;
    }

    public void useAdaptiveLiveDeciseResult() {
        AdaptiveLiveController adaptiveLiveController = this.mAdapitveLiveController;
        if (adaptiveLiveController != null) {
            adaptiveLiveController.useDeciseResult();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setGrtnRtcConfig(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setGrtnRtcConfig(java.lang.String):void");
    }

    public String getVPMHAStatString() {
        boolean s = ew0.s(this.mConfigAdapter.getConfig("DWInteractive", MonitorMediaPlayer.ORANGE_ENABLE_VPM, "true"));
        boolean s2 = ew0.s(this.mConfigAdapter.getConfig("DWInteractive", ORANGE_DISABLE_COLLECT_VPMHA_LIVE_STAT, "false"));
        boolean z = !s2;
        feh fehVar = this.mLogContext;
        StringBuilder sb = new StringBuilder("TaobaoMediaPlayer:bEnableVPM:");
        sb.append(String.valueOf(s));
        sb.append(",mIsVPMLibLoaded:");
        sb.append(cq.e());
        sb.append(",islive:");
        sb.append(String.valueOf(this.mConfig.d == 0));
        sb.append(",enableVPMHALiveStat=");
        sb.append(String.valueOf(z));
        AVSDKLog.e(fehVar, sb.toString());
        if (s && cq.e() && this.mConfig.d == 0 && !s2) {
            try {
                Object invoke = VPMManagerInstance.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Method method = VPMManagerInstance.class.getMethod("getHAMetrics", String.class);
                HashMap hashMap = (HashMap) method.invoke(invoke, "RecentPlayerFF");
                if (hashMap.containsKey("recent_ff_live")) {
                    this.statRecentFFLive = (String) hashMap.get("recent_ff_live");
                }
                HashMap hashMap2 = (HashMap) method.invoke(invoke, "RefNetSpeed");
                if (hashMap2.containsKey("recent_live_mean")) {
                    this.statRecentLiveSpeedMean = (String) hashMap2.get("recent_live_mean");
                }
                if (hashMap2.containsKey("recent_live_max")) {
                    this.statRecentLiveSpeedMax = (String) hashMap2.get("recent_live_max");
                }
                HashMap hashMap3 = (HashMap) method.invoke(invoke, "PlayerBufferRate");
                if (hashMap3.containsKey("avg_bufms_ps")) {
                    this.statRecentBufPerMs = (String) hashMap3.get("avg_bufms_ps");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: class not found error:" + e.toString());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: vpmha ill:" + e2.toString());
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: vpmha no such method:" + e3.toString());
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: vpmha invocation excaption:" + e4.toString());
            } catch (Exception e5) {
                e5.printStackTrace();
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: vpmha exception:" + e5.toString());
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(this.statRecentFFLive)) {
            stringBuffer.append(",recent_ff_live=");
            stringBuffer.append(this.statRecentFFLive);
        }
        if (!TextUtils.isEmpty(this.statRecentLiveSpeedMean)) {
            stringBuffer.append(",recent_live_mean=");
            stringBuffer.append(this.statRecentLiveSpeedMean);
        }
        if (!TextUtils.isEmpty(this.statRecentLiveSpeedMax)) {
            stringBuffer.append(",recent_live_max=");
            stringBuffer.append(this.statRecentLiveSpeedMax);
        }
        if (!TextUtils.isEmpty(this.statRecentBufPerMs)) {
            stringBuffer.append(",avg_bufms_ps=");
            stringBuffer.append(this.statRecentBufPerMs);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r6 != false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x006b;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDataSource(java.lang.String r18) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.setDataSource(java.lang.String):void");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
            setHasSurface(surface);
        } else {
            surface = null;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setDisplay surface=" + surface + ", mSurface=" + this.mSurface);
        Surface surface2 = this.mSurface;
        if ((surface2 != null || surface != null) && surface2 != surface) {
            recordFirstSetSurfaceTime(surface);
            this.mSurface = surface;
            if (surface == null) {
                if (!this.mEnableStatRenderStallInNonSurface) {
                    this.mLastRenderVideoEveryFrame = 0L;
                    this.mLastMonitorRenderSystemTime = 0L;
                }
                _releaseSurface();
                return;
            }
            _setVideoSurface(surface);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EventHandler extends Handler {
        private boolean bFirstFrameRendered = false;
        private WeakReference<TaobaoMediaPlayer> mWeakPlayer;

        static {
            t2o.a(774898046);
        }

        public EventHandler(TaobaoMediaPlayer taobaoMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(taobaoMediaPlayer);
        }

        /* JADX WARN: Removed duplicated region for block: B:235:0x05e3  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x05eb  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x060f  */
        /* JADX WARN: Removed duplicated region for block: B:412:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r47) {
            /*
                Method dump skipped, instructions count: 2256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.EventHandler.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
        com.taobao.taobaoavsdk.AVSDKLog.e(r6.getLogContext(), "postEventFromNative MEDIA_INFO_VIDEO_RENDERING_START: before mp.mEventHandler.sendMessage(m)");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void postEventFromNative(java.lang.Object r6, int r7, long r8, long r10, long r12, java.lang.Object r14) {
        /*
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer r6 = (tv.danmaku.ijk.media.player.TaobaoMediaPlayer) r6
            if (r6 != 0) goto L_0x000e
            return
        L_0x000e:
            r0 = 3
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            tb.feh r0 = r6.getLogContext()
            java.lang.String r1 = "postEventFromNative MEDIA_INFO_VIDEO_RENDERING_START: after mp get from weakThiz"
            com.taobao.taobaoavsdk.AVSDKLog.e(r0, r1)
        L_0x001e:
            java.lang.Class<tv.danmaku.ijk.media.player.TaobaoMediaPlayer> r0 = tv.danmaku.ijk.media.player.TaobaoMediaPlayer.class
            monitor-enter(r0)
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$EventHandler r1 = r6.mEventHandler     // Catch: all -> 0x0032
            if (r1 == 0) goto L_0x00c9
            if (r2 != 0) goto L_0x0035
            tb.feh r1 = r6.getLogContext()     // Catch: all -> 0x0032
            java.lang.String r3 = "postEventFromNative: real get MEDIA_INFO_VIDEO_RENDERING_START in synchronized"
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r3)     // Catch: all -> 0x0032
            goto L_0x0035
        L_0x0032:
            r6 = move-exception
            goto L_0x00cb
        L_0x0035:
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$EventHandler r1 = r6.mEventHandler     // Catch: all -> 0x0032
            android.os.Message r1 = r1.obtainMessage(r7)     // Catch: all -> 0x0032
            tv.danmaku.ijk.media.player.EventData r3 = new tv.danmaku.ijk.media.player.EventData     // Catch: all -> 0x0032
            r3.<init>()     // Catch: all -> 0x0032
            r3.arg1 = r8     // Catch: all -> 0x0032
            r3.arg2 = r10     // Catch: all -> 0x0032
            r3.arg3 = r12     // Catch: all -> 0x0032
            r3.obj = r14     // Catch: all -> 0x0032
            r1.obj = r3     // Catch: all -> 0x0032
            boolean r12 = r6.mUseSurfaceView     // Catch: all -> 0x0032
            r13 = 1
            if (r12 == 0) goto L_0x009d
            r4 = 740(0x2e4, double:3.656E-321)
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x009d
            com.taobao.orange.OrangeConfig r8 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: all -> 0x0032
            java.lang.String r9 = "DWInteractive"
            java.lang.String r12 = "disableSendMessageWhenSurfaceView"
            java.lang.String r14 = "false"
            java.lang.String r8 = r8.getConfig(r9, r12, r14)     // Catch: all -> 0x0032
            boolean r8 = tb.ew0.s(r8)     // Catch: all -> 0x0032
            if (r8 == 0) goto L_0x0093
            tb.r7t r8 = r6.mConfig     // Catch: all -> 0x0032
            if (r8 == 0) goto L_0x0093
            int r8 = r8.d     // Catch: all -> 0x0032
            r9 = 2
            if (r8 == r9) goto L_0x0093
            long r7 = r3.arg3     // Catch: all -> 0x0032
            int r8 = (int) r7     // Catch: all -> 0x0032
            if (r8 <= 0) goto L_0x0087
            float r7 = r6.mRtcTotalRate     // Catch: all -> 0x0032
            float r8 = (float) r8     // Catch: all -> 0x0032
            r9 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r9
            float r7 = r7 + r8
            r6.mRtcTotalRate = r7     // Catch: all -> 0x0032
            int r7 = r6.mRtcTotalCount     // Catch: all -> 0x0032
            int r7 = r7 + r13
            r6.mRtcTotalCount = r7     // Catch: all -> 0x0032
        L_0x0087:
            r6.monitorVideoRenderEveryFrame(r10)     // Catch: all -> 0x0032
            boolean r7 = r6.mEnableRenderStallCalNew     // Catch: all -> 0x0032
            if (r7 == 0) goto L_0x0091
            r6.monitorVideoRenderEveryFrameNew(r10)     // Catch: all -> 0x0032
        L_0x0091:
            monitor-exit(r0)     // Catch: all -> 0x0032
            return
        L_0x0093:
            r6.monitorVideoRenderEveryFrame(r10)     // Catch: all -> 0x0032
            boolean r8 = r6.mEnableRenderStallCalNew     // Catch: all -> 0x0032
            if (r8 == 0) goto L_0x009d
            r6.monitorVideoRenderEveryFrameNew(r10)     // Catch: all -> 0x0032
        L_0x009d:
            if (r7 == r13) goto L_0x00ac
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x00a6
            if (r2 != 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$EventHandler r6 = r6.mEventHandler     // Catch: all -> 0x0032
            r6.sendMessage(r1)     // Catch: all -> 0x0032
            goto L_0x00c9
        L_0x00ac:
            if (r2 != 0) goto L_0x00b8
            tb.feh r7 = r6.getLogContext()     // Catch: all -> 0x0032
            java.lang.String r8 = "postEventFromNative MEDIA_INFO_VIDEO_RENDERING_START: before mp.mEventHandler.sendMessage(m)"
            com.taobao.taobaoavsdk.AVSDKLog.e(r7, r8)     // Catch: all -> 0x0032
        L_0x00b8:
            tv.danmaku.ijk.media.player.TaobaoMediaPlayer$EventHandler r7 = r6.mEventHandler     // Catch: all -> 0x0032
            r7.sendMessageAtFrontOfQueue(r1)     // Catch: all -> 0x0032
            if (r2 != 0) goto L_0x00c9
            tb.feh r6 = r6.getLogContext()     // Catch: all -> 0x0032
            java.lang.String r7 = "postEventFromNative MEDIA_INFO_VIDEO_RENDERING_START: after mp.mEventHandler.sendMessage(m)"
            com.taobao.taobaoavsdk.AVSDKLog.e(r6, r7)     // Catch: all -> 0x0032
        L_0x00c9:
            monitor-exit(r0)     // Catch: all -> 0x0032
            return
        L_0x00cb:
            monitor-exit(r0)     // Catch: all -> 0x0032
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.TaobaoMediaPlayer.postEventFromNative(java.lang.Object, int, long, long, long, java.lang.Object):void");
    }

    public void addExperienceInfo(HashSet<Long> hashSet, HashSet<Long> hashSet2, HashSet<Long> hashSet3) {
        this.mExperienceIdSet.addAll(hashSet);
        this.mExperienceReleaseIdSet.addAll(hashSet2);
        this.mExperienceBucketIdSet.addAll(hashSet3);
    }

    private void chooseDecodeAndRender(r7t r7tVar) {
        Map<String, String> map;
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        this.mVideoCodecType = 1L;
        this.mUseMediacodec = ja1.h;
        int i = Build.VERSION.SDK_INT;
        boolean checkUseMediaCodec = checkUseMediaCodec();
        this.mUseSoftwareByPolicy = !checkUseMediaCodec;
        boolean s = (this.mPlayerIndex != 1 || r7tVar == null || (map = r7tVar.T) == null || map.get(atb.EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo) == null) ? false : ew0.s(r7tVar.T.get(atb.EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo));
        if (!ja1.h || checkUseMediaCodec == 0 || s) {
            if (!ja1.h && checkUseMediaCodec != 0) {
                int u = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_MAX_SOFTWARE_BY_FALLBACK_COUNT, "3"));
                monitorSoftwareByFallBack();
                if (ja1.o >= u) {
                    ja1.r++;
                    ja1.h = true;
                    ja1.f = true;
                    ja1.g = true;
                    resetSoftwareByFallBackCount();
                }
            }
            r7tVar.g = 0;
            r7tVar.h = 0;
            _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, this.mVideoCodecType);
        } else {
            this.mNotSetH26XInConfig = true;
            if (MediaSystemUtils.isApkDebuggable()) {
                r7t r7tVar2 = this.mConfig;
                if (r7tVar2.h == 1) {
                    this.mVideoCodecType |= 24;
                    this.mNotSetH26XInConfig = false;
                }
                if (r7tVar2.g == 1) {
                    this.mVideoCodecType |= 24;
                    this.mNotSetH26XInConfig = false;
                }
            } else {
                r7t r7tVar3 = this.mConfig;
                if (r7tVar3.h == 1) {
                    this.mVideoCodecType |= 16;
                    this.mNotSetH26XInConfig = false;
                }
                if (r7tVar3.g == 1) {
                    this.mVideoCodecType |= 8;
                    this.mNotSetH26XInConfig = false;
                }
            }
            _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, this.mVideoCodecType);
        }
        AVSDKLog.e(this.mLogContext, "setDecodeType: " + this.mVideoCodecType);
        if (i >= 23) {
            int i2 = r7tVar.c0;
            this.mPanoType = i2;
            if (i2 > 0) {
                boolean s2 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableEACMediaCodec", "true"));
                _setPropertyLong(FFP_PROP_INT64_PANO_TYPE, this.mPanoType);
                if (s2) {
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 64L);
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 0L);
                } else {
                    this.mUseSoftwareByPolicy = 2;
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 1L);
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 8L);
                }
            }
        }
        if (ja1.q() && ja1.j0(context) && ja1.h) {
            this.mEnableVFPlugin = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_VF_PLUGIN, "false"));
            boolean n = ew0.n(this.mConfig.y, OrangeConfig.getInstance().getConfig("DWInteractive", MonitorMediaPlayer.ORANGE_ENABLE_VF_PLUGIN_LIVE, "[\"LiveRoom\"]"));
            if (this.mEnableVFPlugin && n) {
                _setPropertyLong(60002, 1L);
                boolean s3 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableMediacodecOpenglPre", "false"));
                this.mEnableMediacodecOpengl = s3;
                if (s3) {
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 64L);
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 0L);
                } else {
                    this.mUseSoftwareByPolicy = 3;
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 1L);
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 8L);
                }
            }
        }
        if (r7tVar.L0) {
            if (this.mVideoCodecType > 1) {
                if (r7tVar.M0) {
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 32L);
                    _setPropertyLong(FFP_PROP_INT64_REAL_HDR_ENABLE, 1L);
                    _setPropertyLong(FFP_PROP_INT64_ENABLE_REUSE_MEDIACODEC, 0L);
                    if (r7tVar.d0 || (!TextUtils.isEmpty(r7tVar.D) && r7tVar.D.contains("hdr"))) {
                        _setPropertyLong(FFP_PROP_INT64_HDR_TYPE, 2L);
                    }
                    AVSDKLog.e(this.mLogContext, "HDR choose deoceder MediaVideoDecoder_MediaCodec");
                } else {
                    _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 64L);
                    if (r7tVar.N0) {
                        _setPropertyLong(FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_ALPHA, 1L);
                    }
                    if (r7tVar.O0) {
                        _setPropertyLong(FFP_PROP_INT64_EXTEND_ENABLE_OPENGL_CROP, 1L);
                    }
                }
            } else if (ja1.J0) {
                _setPropertyLong(FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 8L);
                ja1.K0 = true;
            }
        }
        if (ew0.s(ja1.K(context, "DWInteractive", "forceFFmpegDecoder", "false"))) {
            this.mVideoCodecType = 1L;
            _setPropertyLong(FFP_PROP_INT64_VIDEO_DECODER_TYPE, 1L);
            AVSDKLog.e("AVSDK", "TaobaoMediaPlayer:" + this + " setDecodeType by orange: " + this.mVideoCodecType);
        }
    }

    public void setSeamlessSwitchOption(int i, boolean z, boolean z2) {
        int i2;
        if (z2) {
            i2 = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_SWITCH_STREAM_LOWER_TIMEOUT, "15000"));
        } else {
            i2 = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_SWITCH_STREAM_HIGHER_TIMEOUT, IDecisionResult.ENGINE_ERROR));
        }
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_TIMEOUT, i2);
        _setPropertyLong(FFP_PROP_INT64_SWITCH_STREAM_FORCEDLY, z ? 1L : 0L);
        _setPropertyLong(FFP_PROP_INT64_SOURCER_VIDEO_PIPE_START_COUNT, 8L);
        _setSeamlessSwitchMode(1);
    }

    public void setSeamlessSwitchUrl(String str, String str2) {
        this.mSeamlessSwitchSelectName = str2;
        setSeamlessSwitchUrl(str);
    }

    public void notifyVideoInfo(EventData eventData) {
        if (eventData != null) {
            List<IMediaPlayer.OnInfoListener> list = this.mOnInfoListeners;
            if (list != null) {
                for (IMediaPlayer.OnInfoListener onInfoListener : list) {
                    onInfoListener.onInfo(this, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj);
                }
            }
            IMediaPlayer.OnInfoListener onInfoListener2 = this.mOnInfoListener;
            if (onInfoListener2 != null) {
                onInfoListener2.onInfo(this, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
        long j2 = 0;
        if (this.mVolume != 0.0f && this.bInstantSeeked) {
            _setPropertyLong(21008, 0L);
        }
        if (this.mEnableSeekInPause) {
            if (z2) {
                j2 = 1;
            }
            _setPropertyLong(80006, j2);
        }
        this.bInstantSeeked = false;
        this.mSeekPos = j;
        monitorSeek();
        _seekToPause(j, z);
    }

    public TaobaoMediaPlayer(Context context) {
        super(context);
        initPlayer(null);
    }

    public TaobaoMediaPlayer(Context context, gf4 gf4Var) {
        super(context, gf4Var);
        initPlayer(null);
    }

    public TaobaoMediaPlayer(Context context, gf4 gf4Var, c15 c15Var) {
        super(context, gf4Var);
        initPlayer(c15Var);
        initProxyOnce(context);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }
}
