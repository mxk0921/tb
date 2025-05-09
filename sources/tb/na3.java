package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class na3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY = "firstScreenColdStart";
    public static final String MTOP_TOPIC_NOT_COLD_START_QUERY = "other";
    public static final String MTOP_TOPIC_QUERY_PRELOAD = "queryPreload";
    public static final String MTOP_TOPIC_SECONDARY_QUERY = "secondaryQuery";
    public static final String MTOP_TOPIC_UPDATE_PREFIX = "check-";
    public static final String sCacheFirstPageWhenPreRequest = "cacheFirstPageWhenPreRequest";
    public static final String sEnableMtopStreamJsonForAdjust = "enableMtopStreamJsonForAdjust";
    public static final String sEnableMtopStreamJsonForQuery = "enableMtopStreamJsonForQuery";
    public static final String sEnablePanForStdPop = "enablePanForStdPop";
    public static final String sGetCacheDataOnSameThread = "getCacheDataOnSameThread";
    public static final String sKeyEditGroupPopWindow = "editGroupPopWindow";
    public static final String sKeyEventExtraCartItemView = "CartItemView";
    public static final String sKeyFeedFlowType = "feedFlowType";
    public static final String sKeyMtopConfig = "mtopConfig";
    public static final String sKeyRecommendShotAtFirstScreen = "recommendShotAtFirstScreen";
    public static final String sKeyTagGroupExtendBody = "groupExtendBody";
    public static final String sLoadCacheWhenLoadFirstPageOnCreate = "loadCacheWhenLoadFirstPageOnCreate";
    public static final String sLoadImageWhenPreRequest = "loadImageWhenPreRequest";
    public static final String sPageScrollBottomLeftCountToPrefetch = "pageScrollBottomLeftCountToPrefetch";
    public static final int sPopupAnimationTime = 200;
    public static final String sQueryParamsKeyDefaultFilterItem = "defaultFilterItem";
    public static final String sResetPreRequestDataWhenAddCart = "resetPreRequestDataWhenAddCart";
    public static final String sShowWithStdPop = "showWithStdPop";
    public static final String sStageLoadImage = "loadImage";

    static {
        t2o.a(479199234);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20bffe49", new Object[0]);
        }
        return UUID.randomUUID().toString().replace("-", "");
    }
}
