package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q0j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CONTEXT_KEY_CARD_INDEX = "cardIndex";
    public static final String BIZ_CONTEXT_KEY_CARD_NID = "cardNid";
    public static final String BIZ_CONTEXT_KEY_CARD_TYPE = "cardType";
    public static final String BIZ_CONTEXT_KEY_DETAIL_TRACE_ID = "detailTraceId";
    public static final String BIZ_CONTEXT_KEY_RECOMMEND_TRACE_ID = "recommendTraceId";
    public static final String ERROR_CODE_ATMOS_COLOR_PARSE_ERROR = "20802";
    public static final String ERROR_CODE_ATMOS_PARAMS_PARSE_ERROR = "20801";
    public static final String ERROR_CODE_BIZ_EMPTY = "10003";
    public static final String ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR = "10017";
    public static final String ERROR_CODE_COMMON_CONTEXT_NULL = "10016";
    public static final String ERROR_CODE_COMMON_GET_HOLDER_ERROR = "10018";
    public static final String ERROR_CODE_COMMON_RECYCLERVIEW_LAYOUT_ERROR = "10015";
    public static final String ERROR_CODE_CONTROL_SCROLL = "30001";
    public static final String ERROR_CODE_DATA_EMPTY = "10007";
    public static final String ERROR_CODE_DELIVER_DATA_ABSENT = "20709";
    public static final String ERROR_CODE_DELIVER_DATA_PIC_INCONSISTENT = "20710";
    public static final String ERROR_CODE_DESC_ERROR = "10004";
    public static final String ERROR_CODE_DESC_RENDER_ERROR = "10010";
    public static final String ERROR_CODE_DESC_TEMPLATE_RENDER_ERROR = "10012";
    public static final String ERROR_CODE_DESC_TEMPLATE_VERSION_PARSE_ERROR = "10011";
    public static final String ERROR_CODE_DX_TEMPLATE_RENDER_ERROR = "30101";
    public static final String ERROR_CODE_FIRST_302 = "10005";
    public static final String ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL = "20012";
    public static final String ERROR_CODE_FLOAT_NODE_GENERATE_ERROR = "10013";
    public static final String ERROR_CODE_IMAGE_URL_IS_NULL = "31001";
    public static final String ERROR_CODE_INNER_NODE_GENERATE_ERROR = "10013";
    public static final String ERROR_CODE_INSERT_CARD_CHECK_NO_PARAM = "20405";
    public static final String ERROR_CODE_INSERT_CARD_ERROR = "20403";
    public static final String ERROR_CODE_INSERT_CARD_NO_CONTEXT = "20401";
    public static final String ERROR_CODE_INSERT_CARD_NO_PARAM = "20402";
    public static final String ERROR_CODE_INSERT_CARD_PARSE_ERROR = "20404";
    public static final String ERROR_CODE_INSIDE_DETAIL_FLOAT_UNKNOWN_ERROR = "40011";
    public static final String ERROR_CODE_INSIDE_DETAIL_NO_FLOAT_ERROR = "40010";
    public static final String ERROR_CODE_INSTANCE_NO_MAIN_NULL = "20015";
    public static final String ERROR_CODE_ITEM_ID_EMPTY = "10008";
    public static final String ERROR_CODE_MAIN_PAGE_FLOAT_EMPTY = "10001";
    public static final String ERROR_CODE_MAIN_PIC_MARIN_TOP_PARSE_ERROR = "10014";
    public static final String ERROR_CODE_MAIN_PIC_NATIVE_INCONSISTENT = "20902";
    public static final String ERROR_CODE_NAV_NO_MAIN_NULL = "20014";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR = "20708";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_DATA_EMPTY = "20703";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_DATA_PART_ABSENT = "20704";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_GAUSSIAN_PIC_LOAD_FAIL = "20706";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT = "10082";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT_RANDOM = "10084";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PARSE_ERROR = "20701";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PIC_LOAD_FAIL = "20702";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_PRELOAD_RESOURCES_EXCEPTION = "20705";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL = "10080";
    public static final String ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL_RANDOM = "10083";
    public static final String ERROR_CODE_PENDING_GESTURE_FIVE_ERROR = "10019";
    public static final String ERROR_CODE_PENDING_GESTURE_TEN_ERROR = "10020";
    public static final String ERROR_CODE_PLAYER_MEDIA_INCONSISTENT = "20901";
    public static final String ERROR_CODE_RECOMMEND_DATA_EMPTY = "10050";
    public static final String ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT = "10062";
    public static final String ERROR_CODE_RECOMMEND_FAIL_HAS_DATA_APPEND = "10063";
    public static final String ERROR_CODE_RECOMMEND_FIRST_CARD_ERROR_SHOW = "10061";
    public static final String ERROR_CODE_RECOMMEND_FIRST_NODE_DETAIL_INFO_EMPTY = "10058";
    public static final String ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY = "10052";
    public static final String ERROR_CODE_RECOMMEND_ITEM_ID_INCONSISTENCY = "10059";
    public static final String ERROR_CODE_RECOMMEND_NODE_DETAIL_INFO_EMPTY = "10056";
    public static final String ERROR_CODE_RECOMMEND_SECTION_BUFFER_DUPLICATE_ID = "10054";
    public static final String ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID = "10053";
    public static final String ERROR_CODE_RECOMMEND_SECTION_EMPTY = "10051";
    public static final String ERROR_CODE_RERANK_BUFFER_NULL = "20301";
    public static final String ERROR_CODE_RERANK_ERROR = "20305";
    public static final String ERROR_CODE_RERANK_EXPOSE_POS_EXCEPTION = "20304";
    public static final String ERROR_CODE_RERANK_SCROLL = "20302";
    public static final String ERROR_CODE_RERANK_UNEXPOSED_EXCEPTION = "20303";
    public static final String ERROR_CODE_SERVER_WEEX_URL_NULL = "20013";
    public static final String ERROR_CODE_TBLIVE_JUMP_URL_ERROR = "20203";
    public static final String ERROR_CODE_TBLIVE_MAIN_PAGE_FLOAT_EMPTY = "20205";
    public static final String ERROR_CODE_TBLIVE_PLAYER_ERROR = "20200";
    public static final String ERROR_CODE_TBLIVE_PM_INFO_ERROR = "20202";
    public static final String ERROR_CODE_TBLIVE_PM_STATUS_ERROR = "20201";
    public static final String ERROR_CODE_VIDEO_THEME_MAIN_PAGE_FLOAT_EMPTY = "20501";
    public static final String ERROR_CODE_VIEW_EMPTY = "10006";
    public static final String ERROR_CODE_WEEX_RELOAD_BROADCAST = "20005";
    public static final String ERROR_CODE_WEEX_RENDER_EXCEPTION = "20002";
    public static final String ERROR_CODE_WEEX_RENDER_FAILED = "20010";
    public static final String ERROR_CODE_WEEX_RENDER_FATAL_EXCEPTION = "20009";
    public static final String ERROR_CODE_WEEX_URL_CHANGE = "20004";
    public static final String ERROR_CODE_WEEX_URL_EMPTY = "20003";
    public static final String ERROR_CODE_WEEX_V1_WHITE_SCREEN = "20007";
    public static final String ERROR_CODE_WEEX_V2_WHITE_SCREEN = "20006";
    public static final String ERROR_CODE_WEEX_VIEW_NULL = "20011";
    public static final String NEW_DETAIL_MODULE_NAME = "new_detail";
    public static final String NEW_DETAIL_TAG_SECTION = "new_detail分阶段";
    public static final String NEW_DETAIL_TAG_SPINDLE = "new_detail异常";
    public static final String SCENE_CONTROL_SCROLL = "controlScrollEnable";
    public static final String SCENE_DESC = "desc";
    public static final String SCENE_DOWNGRADE = "downgrade";
    public static final String SCENE_DX = "dinamicX";
    public static final String SCENE_ENTRANCE_ATMOS = "entranceCardAtmos";
    public static final String SCENE_HOME_PAGE_INTO = "intoHomePage";
    public static final String SCENE_INSERT_CARD = "insert_card";
    public static final String SCENE_INSIDE_DETAIL = "nd-inside-detail";
    public static final String SCENE_MAIN = "main";
    public static final String SCENE_MAIN_PAGE_FLOAT = "mainPageFloat";
    public static final String SCENE_MAIN_PIC_FLOAT = "mainPicFloat";
    public static final String SCENE_MEDIA_PLAYER = "media";
    public static final String SCENE_OPEN_IMMEDIATELY = "openImmediately";
    public static final String SCENE_RECOMMEND = "recommend";
    public static final String SCENE_RERANK = "rerank";
    public static final String SCENE_TBLIVE_JUMP = "tbliveJumpUrl";
    public static final String SCENE_TBLIVE_MAIN_PAGE_FLOAT = "tbliveMainPageFloat";
    public static final String SCENE_TBLIVE_PLAYER = "tblivePlayer";
    public static final String SCENE_TBLIVE_PM_INFO = "tblivePMInfo";
    public static final String SCENE_TBLIVE_PM_STATUS = "tblivePMStatus";
    public static final String SCENE_VIDEO_THEME_MAIN_PAGE_FLOAT = "videoThemeMainPageFloat";
    public static final String SCENE_WEEX_CONTAINER = "weexContainer";
    public static final String SECTION_CONTAINER_INIT = "NewDetail_ContainerInit";
    public static final String SECTION_FAST_ANIM_VISIBLE = "NewDetail_FcpFastAnimRootVisible";
    public static final String SECTION_FIRST_DETAIL_REQUEST = "NewDetail_FcpRequest";
    public static final String SECTION_FIRST_DETAIL_REQUEST_PARSE = "NewDetail_FcpDataParser";
    public static final String SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE = "NewDetail_FcpMainWeexV2Init";
    public static final String SECTION_FIRST_MAIN_WEEXV2_RENDER = "NewDetail_FcpMainWeexV2Render";
    public static final String SECTION_FIRST_MAIN_WEEX_GET_DETAIL_RENDER = "NewDetail_FcpMainWeexGetDetail";
    public static final String SECTION_FIRST_MAIN_WEEX_REFRESH = "NewDetail_FcpMainWeexRefresh";
    public static final String SECTION_FIRST_MAIN_WEEX_REFRESH_PRE = "NewDetail_FcpMainWeexRefresh_Pre";
    public static final String SECTION_FIRST_NATIVE_PIC_VISIBLE = "NewDetail_FcpNativePicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE = "NewDetail_FcpOpenImmediatelyNativeGaussianPicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE = "NewDetail_FcpOpenImmediatelyNativePicVisible";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY = "NewDetail_FcpVideoOpenImmediatelyReady";
    public static final String SECTION_FIRST_OPEN_IMMEDIATELY_WEEX_VISIBLE = "NewDetail_FcpOpenImmediatelyWeexVisible";
    public static final String SECTION_FIRST_OTHER_BIND = "NewDetail_FcpOtherBind";
    public static final String SECTION_FIRST_OTHER_BIND_PRE = "NewDetail_FcpOtherBindPre";
    public static final String SECTION_FIRST_RECYCLERVIEW = "NewDetail_FcpRecyclerView";
    public static final String SECTION_FIRST_RECYCLERVIEW_PRE = "NewDetail_FcpRecyclerViewPre";
    public static final String SECTION_FIRST_TPP_REQUEST = "NewDetail_FcpTppRequest";
    public static final String SECTION_FIRST_TPP_REQUEST_PARSE = "NewDetail_FcpTppDataParser";
    public static final String SECTION_FIRST_UI_DATA_REFRESH = "NewDetail_FcpUIDataRefresh";
    public static final String SECTION_FIRST_UI_DATA_REFRESH_PRE = "NewDetail_FcpUIDataRefreshPre";
    public static final String SECTION_FIRST_VIDEO_READY = "NewDetail_FcpVideoReady";
    public static final String SECTION_NAV = "NewDetail_Nav";
    public static final String SECTION_NAV_BAR_WEEX_VISIBLE = "NewDetail_NavBarWeexVisible";
    public static final String SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST = "NewDetail_OpenImmedHPToRealRequest";
    public static final String SECTION_SECOND_NATIVE_PIC_VISIBLE = "NewDetail_SecondNativePicVisible";
    public static final String SECTION_SECOND_WEEX_VISIBLE = "NewDetail_SecondWeexVisible";
    public static final String SECTION_START_REQUEST_TO_CLICK = "NewDetail_RequestToClick";
    public static final String SECTION_VISIBLE = "NewDetail_FcpRootVisible";
    public static final String UMBRELLA_FEATURE_TYPE_EVENT_PROCESS = "eventProcess";
    public static final String UMBRELLA_TAG_ENTER_PAGE_INIT = "Monitor_NewDetail_PageInit";
    public static final String UMBRELLA_TAG_ERROR_PAGE = "Monitor_NewDetail_ErrorPage";
    public static final String UMBRELLA_TAG_FILTER_WEEX_SKIP_URL = "Monitor_NewDetail_FilterWeexSkipUrl";
    public static final String UMBRELLA_TAG_FIRST_PAGE_REQUEST = "Monitor_NewDetail_FirstPageReq";
    public static final String UMBRELLA_TAG_INSERT_CARD_BROADCAST_PAUSE = "Monitor_NewDetail_InsertCardBroadcastPause";
    public static final String UMBRELLA_TAG_INSERT_CARD_BROADCAST_REQ_ERR = "Monitor_NewDetail_InsertCardBroadcastReqErr";
    public static final String UMBRELLA_TAG_INSERT_CARD_BROADCAST_REQ_SUC = "Monitor_NewDetail_InsertCardBroadcastReqSuc";
    public static final String UMBRELLA_TAG_INSERT_CARD_BX_BROADCAST = "Monitor_NewDetail_InsertCardBxBroadcast";
    public static final String UMBRELLA_TAG_INSERT_CARD_BX_BROADCAST_NEW = "Monitor_NewDetail_InsertCardBxBroadcastNew";
    public static final String UMBRELLA_TAG_INSERT_CARD_CAN_TRIGGER = "Monitor_NewDetail_InsertCardCanTrigger";
    public static final String UMBRELLA_TAG_INSERT_CARD_EXPOSURE_ABORT = "Monitor_NewDetail_InsertCardExposureAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_HAS_REQUEST_ABORT = "Monitor_NewDetail_InsertCardHasRequestAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_IF_TRIGGER = "Monitor_NewDetail_InsertCardIfTrigger";
    public static final String UMBRELLA_TAG_INSERT_CARD_INSTANCE_ID_ABORT = "Monitor_NewDetail_InsertCardInstanceIdAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_MTOP_ERR = "Monitor_NewDetail_InsertCardMtopErr";
    public static final String UMBRELLA_TAG_INSERT_CARD_MTOP_START = "Monitor_NewDetail_InsertCardMtopStart";
    public static final String UMBRELLA_TAG_INSERT_CARD_MTOP_SUC = "Monitor_NewDetail_InsertCardMtopSuc";
    public static final String UMBRELLA_TAG_INSERT_CARD_NODE_ON_REQUEST_SUC_NEW = "Monitor_NewDetail_InsertCardOnRequestSucNew";
    public static final String UMBRELLA_TAG_INSERT_CARD_NODE_ON_REQ_SUC = "Monitor_NewDetail_InsertCardOnReqSuc";
    public static final String UMBRELLA_TAG_INSERT_CARD_NODE_SIZE_EMPTY_ABORT = "Monitor_NewDetail_InsertCardNodeSizeEmptyAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_REARRANGING_ABORT = "Monitor_NewDetail_InsertCardRearrangingAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQUESTING_LIST_ABORT = "Monitor_NewDetail_InsertCardRequestingListAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQUEST_EFFECT = "Monitor_NewDetail_InsertCardRequestEffect";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQUEST_START = "Monitor_NewDetail_InsertCardRequestStart";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQUEST_USE_RATIO = "Monitor_NewDetail_InsertCardRequestUseRatio";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQUEST_USE_RATIO_NEW = "Monitor_NewDetail_InsertCardRequestUseRatioNew";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQ_CALLBACK = "Monitor_NewDetail_InsertCardReqCallback";
    public static final String UMBRELLA_TAG_INSERT_CARD_REQ_START_NEW = "Monitor_NewDetail_InsertCardReqStartNew";
    public static final String UMBRELLA_TAG_INSERT_CARD_RESULT_FALSE_ABORT = "Monitor_NewDetail_InsertCardResultFalseAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_SWITCH_ABORT = "Monitor_NewDetail_InsertCardSwitchAbort";
    public static final String UMBRELLA_TAG_INSERT_CARD_TRACK_PAGE = "Monitor_NewDetail_InsertCardTracePage";
    public static final String UMBRELLA_TAG_INSERT_CARD_UI_SUCCESS = "Monitor_NewDetail_InsertCardUiSuccess";
    public static final String UMBRELLA_TAG_PLACEHOLDER_GAUSSIAN_IMAGE_CALLBACK_SUCCESS = "Monitor_NewDetail_PlaceholderGaussianImageCallbackSuccess";
    public static final String UMBRELLA_TAG_PLACEHOLDER_IMAGE_CALLBACK_SUCCESS = "Monitor_NewDetail_PlaceholderImageCallbackSuccess";
    public static final String UMBRELLA_TAG_PLACEHOLDER_RENDER_SUCCESS = "Monitor_NewDetail_PlaceholderRenderSuccess";
    public static final String UMBRELLA_TAG_PRELOAD_MEDIA_SUCCESS = "Monitor_NewDetail_PreloadMediaSuccess";
    public static final String UMBRELLA_TAG_PRELOAD_WEEX_LOAD_SO_SUCCESS = "Monitor_NewDetail_PreloadWeexLoadSoSuccess";
    public static final String UMBRELLA_TAG_PRE_REQUEST_SUCCESS = "Monitor_NewDetail_PreRequestSuccess";
    public static final String UMBRELLA_TAG_PRE_REQUEST_VISIT = "Monitor_NewDetail_PreRequestVisit";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_BEHAVIOR = "Monitor_NewDetail_RealTimeRequestBehavior";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_EFFECT = "Monitor_NewDetail_RealTimeRequestEffect";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_START = "Monitor_NewDetail_RealTimeRequestStart";
    public static final String UMBRELLA_TAG_REAL_TIME_REQUEST_USE_RATIO = "Monitor_NewDetail_RealTimeRequestUseRatio";
    public static final String UMBRELLA_TAG_REQUEST = "Monitor_NewDetail_Req";
    public static final String UMBRELLA_TAG_REQUEST_FAIL = "Monitor_NewDetail_ReqFail";
    public static final String UMBRELLA_TAG_REQUEST_TIME_OUT = "Monitor_NewDetail_ReqTimeOut";
    public static final String UMBRELLA_TAG_WEEX_CACHE_HIT_SUCCESS = "Monitor_NewDetail_WeexCacheHitSuccess";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_REQUEST = "Monitor_NewDetail_OpenImmediatelyPreSendDataRequest";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_SUCCESS = "Monitor_NewDetail_OpenImmediatelyPreSendDataSuccess";
    public static final String UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_RENDER_SUCCESS = "Monitor_NewDetail_OpenImmediatelyRenderSuccess";

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f26426a = hdv.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ag8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return String.valueOf(obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ag8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return String.valueOf(obj);
        }
    }

    static {
        t2o.a(352321689);
    }

    public static void A(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73db6f5", new Object[]{str, str2, str3, str4, map});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str4)) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("catalog", str);
                map.put("extraInfo", str2);
                f26426a.commitFailure("AppErrorTrace", "", "", r7j.UMBRELLA_SPINDLE_BIZ, "new_detail", map, str3, str5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(bxj bxjVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe7ce42", new Object[]{bxjVar, str, obj});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (!p || byj.l()) {
                if (bxjVar instanceof Activity) {
                    vxm.b.a((Activity) bxjVar).a(str, obj);
                } else if (bxjVar instanceof Fragment) {
                    vxm.b.j((Fragment) bxjVar).a(str, obj);
                }
                txj.e("new_detail分阶段", " addProperty, key: " + str + ", value: " + obj);
            }
        }
    }

    public static void b(x3w x3wVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b68da65", new Object[]{x3wVar, str, str2});
        } else if (x3wVar != null) {
            x3wVar.y.put(str, str2);
        }
    }

    public static void c(x3w x3wVar, String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780b6786", new Object[]{x3wVar, str, str2, th, new Boolean(z)});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        d(x3wVar, str, str2 + stringWriter2, z);
    }

    public static void d(x3w x3wVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc6726d", new Object[]{x3wVar, str, str2, new Boolean(z)});
        } else if (x3wVar != null) {
            x3w.a aVar = new x3w.a();
            aVar.c = z;
            aVar.f31128a = str;
            aVar.b = str2;
            ((ArrayList) x3wVar.x).add(aVar);
        }
    }

    public static void e(x3w x3wVar, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c47d42e", new Object[]{x3wVar, str, str2, str3, new Boolean(z)});
            return;
        }
        d(x3wVar, str2, str3, z);
        o(x3wVar, str, str2, str3);
    }

    public static void f(x3w x3wVar, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487199c4", new Object[]{x3wVar, str, str2, str3, new Boolean(z)});
            return;
        }
        d(x3wVar, str2, str3, z);
        r(x3wVar, str, str2, str3);
    }

    public static void g(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d246b22", new Object[]{str, str2, map});
            return;
        }
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            a2.commitSuccess(str, str2, "", "Page_NewDetail", "", map);
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a99b04d", new Object[]{str});
        }
        return k(str);
    }

    public static String i(String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfa211f2", new Object[]{str, x3wVar});
        }
        return str + ", subType: " + x3wVar.c;
    }

    public static Map<String, String> j(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fea6dc0", new Object[]{x3wVar});
        }
        HashMap hashMap = new HashMap(x3wVar.C().T());
        JSONObject F = x3wVar.F();
        if (F != null) {
            hashMap.putAll(xxj.a(F, new a()));
        }
        JSONObject u = x3wVar.u();
        if (u != null) {
            hashMap.putAll(xxj.a(u, new b()));
        }
        return hashMap;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5299d17", new Object[]{str});
        }
        return "tppGuide" + str;
    }

    public static void l(bxj bxjVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3769f36", new Object[]{bxjVar, str, new Long(j)});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (p && !byj.l()) {
                return;
            }
            if (bxjVar instanceof Activity) {
                vxm.b.a((Activity) bxjVar).j(str, j);
            } else if (bxjVar instanceof Fragment) {
                vxm.b.j((Fragment) bxjVar).j(str, j);
            }
        }
    }

    public static void m(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4541f946", new Object[]{str, str2, str3, map});
            return;
        }
        A("componentRender", str, h(str2), str3, map);
        TLog.loge("new_detail异常", str3);
    }

    public static void n(String str, String str2, String str3, Map<String, String> map, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ceca26f", new Object[]{str, str2, str3, map, th});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        m(str, str2, str3 + stringWriter2, map);
    }

    public static void o(x3w x3wVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d703655", new Object[]{x3wVar, str, str2, str3});
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (x3wVar != null) {
            m(str, str2, i(str3 + ", bizContext: " + JSON.toJSONString(x3wVar.y), x3wVar), j(x3wVar));
        }
    }

    public static void p(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f31373c", new Object[]{str, str2, str3, map});
        } else {
            s("new_detail异常", str, h(str2), str3, map);
        }
    }

    public static void q(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94da7e50", new Object[]{str, str2, str3, map, str4, str5});
            return;
        }
        p(str, str2, str3 + ", detailTraceId: " + str4 + ", recommendTraceId: " + str5, map);
    }

    public static void r(x3w x3wVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a184279f", new Object[]{x3wVar, str, str2, str3});
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (x3wVar != null) {
            p(str, str2, i(str3 + ", bizContext: " + JSON.toJSONString(x3wVar.y), x3wVar), j(x3wVar));
        }
    }

    public static void s(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d3aaa6", new Object[]{str, str2, str3, str4, map});
            return;
        }
        A(p6j.MTOP_STAGE_DATAPARSE, str2, str3, str4, map);
        TLog.loge(str, str4);
    }

    public static void u(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b117aaa", new Object[]{str, str2, str3, map});
        } else {
            A(bia.UNDER_TAKE_INSIDE_DETAIL, str, str2, str3, map);
        }
    }

    public static void v(String str, String str2, String str3, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87daa051", new Object[]{str, str2, str3, traceLogEventType, strArr});
            return;
        }
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            a2.trace("new_detail", str, "NewDetailActivity", str2, null, str3, traceLogEventType, strArr);
        }
    }

    public static void w(bxj bxjVar, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b9bd03", new Object[]{bxjVar, str, new Long(j), str2});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (!p || byj.l()) {
                if (bxjVar instanceof Activity) {
                    vxm.b.a((Activity) bxjVar).n(str, j, null);
                } else if (bxjVar instanceof Fragment) {
                    vxm.b.j((Fragment) bxjVar).n(str, j, null);
                }
                txj.e("new_detail分阶段", str + " end, currentTime: " + j + ", [" + str2 + "]");
            }
        }
    }

    public static void x(bxj bxjVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d961b5", new Object[]{bxjVar, str, str2});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (!p || byj.l()) {
                if (bxjVar instanceof Activity) {
                    vxm.b.a((Activity) bxjVar).e(str, null);
                } else if (bxjVar instanceof Fragment) {
                    vxm.b.j((Fragment) bxjVar).e(str, null);
                }
                txj.e("new_detail分阶段", str + " end, currentTime: " + SystemClock.uptimeMillis() + ", [" + str2 + "]");
            }
        }
    }

    public static void y(bxj bxjVar, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797c5f9c", new Object[]{bxjVar, str, new Long(j), str2});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (!p || byj.l()) {
                if (bxjVar instanceof Activity) {
                    vxm.b.a((Activity) bxjVar).g(str, j);
                } else if (bxjVar instanceof Fragment) {
                    vxm.b.j((Fragment) bxjVar).g(str, j);
                }
                txj.e("new_detail分阶段", str + " start, currentTime: " + j + ", [" + str2 + "]");
            }
        }
    }

    public static void z(bxj bxjVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5b87fc", new Object[]{bxjVar, str, str2});
        } else if (bxjVar != null) {
            boolean P = TBDeviceUtils.P(bxjVar.getNewDetailContext());
            boolean p = TBDeviceUtils.p(bxjVar.getNewDetailContext());
            if (P && !byj.r()) {
                return;
            }
            if (!p || byj.l()) {
                if (bxjVar instanceof Activity) {
                    vxm.b.a((Activity) bxjVar).v(str);
                } else if (bxjVar instanceof Fragment) {
                    vxm.b.j((Fragment) bxjVar).v(str);
                }
                txj.e(txj.TAG_RENDER, str + " start, currentTime: " + SystemClock.uptimeMillis() + ", [" + str2 + "]");
            }
        }
    }
}
