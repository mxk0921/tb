package com.taobao.tao.infoflow.commonsubservice.windvaneservice;

import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IWindVaneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.cfc;
import tb.dwe;
import tb.fve;
import tb.nex;
import tb.t2o;
import tb.u83;
import tb.von;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeWindVaneServiceImpl implements IWindVaneService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_DATA = "bizData";
    private static final int DEAULT_NEARBY_ITEM_LIMITED_COUNT = 3;
    private static final String ENABLE_WIND_TAG_ONE_TO_THREE = "enableWindTagOneToThree";
    private static final String ENABLE_WIND_VANE_DURATION_LIMIT = "windVaneLimitedDuration";
    private static final String IS_WINDVANE_BIZ_OPT_ENABLE = "isWindvaneBizOptEnable";
    private static final String ITEM_PASS_PARAM = "itemPassParam";
    private static final String NEARBY_ITEM_LIMITED_COUNT = "nearbyItemLimitedCount";
    private static final String NEARBY_WIND_VANE_LIMIT_COUNT = "nearbyWindVaneLimitedCount";
    private static final String SINGLE_ITEM_PRE_SCREEN_ENABLE = "singleItemPerScreenEnable";
    private static final int WIND_VANE_CHECK_COUNT = 10;
    private static final int WIND_VANE_CHECK_CTR_NUMBER = 3;
    private cfc infoFlowContext;
    private IContainerDataService.e mRequestBizParamsCreator;
    private static final String TAG = HomeWindVaneServiceImpl.class.getSimpleName();
    public static long clickInfoFlowTimeMills = -1;
    public static long secondPageDurationLimit = 0;
    private double cardExposeRatioForRequestWindVane = 1.0d;
    private u83 cardOverLayResidentHelper = null;
    private HashSet<String> hasOverLay = new HashSet<>();
    private String clickId = "";
    private String containerId = "";
    private String cardSectionBizCode = "";
    private boolean mHasWindVaneCParams = false;

    static {
        t2o.a(729809438);
        t2o.a(488636620);
    }

    private boolean getEnableWindTagOneToThree(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a602462", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        return getValueFromContainer(iContainerDataModel, ENABLE_WIND_TAG_ONE_TO_THREE);
    }

    private int getNearbyItemLimitedCount(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f551aca", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (ext = base.getExt()) == null || (integer = ext.getInteger(NEARBY_ITEM_LIMITED_COUNT)) == null) {
            return 3;
        }
        return integer.intValue();
    }

    private JSONObject getWindParams(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2bf6913", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel.getJSONObject(BIZ_DATA) != null) {
            return baseSectionModel.getJSONObject(BIZ_DATA).getJSONObject(ITEM_PASS_PARAM);
        }
        return null;
    }

    private int getWindVaneDurationLimit(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee5c1440", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null) {
            return -1;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e(TAG, "baseData == null");
            return -1;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            return -1;
        }
        return ext.getIntValue(ENABLE_WIND_VANE_DURATION_LIMIT);
    }

    private boolean isExistWindVaneCardInNearByLimit(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527417db", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return false;
        }
        for (int i3 = 1; i3 <= i2; i3++) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i - i3);
            BaseSectionModel<?> findItemDataByPosition2 = iMainFeedsViewService.findItemDataByPosition(i + i3);
            if (isWindVaneCard(findItemDataByPosition) || isWindVaneCard(findItemDataByPosition2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWholeCardExpose(int i) {
        View findItemViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac78227f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i)) == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!findItemViewByPosition.getGlobalVisibleRect(rect) || rect.bottom - rect.top != findItemViewByPosition.getHeight()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public long getLastInsertTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("347788cd", new Object[]{this})).longValue();
        }
        return von.r();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public List<String> getWindVaneExposedItemKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a929a1f9", new Object[]{this});
        }
        return von.u(this.infoFlowContext.getContainerType().getContainerId());
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public boolean hasWindVaneParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f278cb5", new Object[]{this})).booleanValue();
        }
        return this.mHasWindVaneCParams;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.infoFlowContext = cfcVar;
        this.cardOverLayResidentHelper = new u83(cfcVar);
        this.containerId = cfcVar.getContainerType().getContainerId();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.cardOverLayResidentHelper.f();
        this.cardOverLayResidentHelper = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public void updateWindVaneClick(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711628ba", new Object[]{this, baseSectionModel, baseSubItemModel});
            return;
        }
        String containerId = this.infoFlowContext.getContainerType().getContainerId();
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataModel<?> containerData = iContainerDataService.getContainerData();
            long windVaneDurationLimit = getWindVaneDurationLimit(containerData);
            secondPageDurationLimit = windVaneDurationLimit;
            if (windVaneDurationLimit > 0) {
                clickInfoFlowTimeMills = SystemClock.uptimeMillis();
            } else {
                clickInfoFlowTimeMills = 0L;
            }
            dwe.o(secondPageDurationLimit, clickInfoFlowTimeMills);
            boolean enableWindTagOneToThree = getEnableWindTagOneToThree(containerData);
            boolean enableWindvaneBizOpt = enableWindvaneBizOpt(containerData);
            if (enableWindTagOneToThree) {
                checkAndPrepareWindvaneParams(baseSectionModel, baseSubItemModel, enableWindvaneBizOpt, containerData, enableWindTagOneToThree);
            }
            String itemId = baseSubItemModel.getClickParam().getItemId();
            String sectionBizCode = baseSectionModel.getSectionBizCode();
            JSONObject windParams = getWindParams(baseSectionModel);
            if (itemId == null) {
                itemId = "";
            }
            if (sectionBizCode == null) {
                sectionBizCode = "";
            }
            if (windParams != null) {
                windParams = (JSONObject) windParams.clone();
            }
            this.clickId = itemId;
            this.cardSectionBizCode = sectionBizCode;
            von.H(containerId, itemId);
            von.I(containerId, itemId, sectionBizCode, windParams);
            boolean singleItemPerScreenEnable = getSingleItemPerScreenEnable(containerData);
            int nearByWindVneCardLimitCount = getNearByWindVneCardLimitCount(containerData);
            von.K(singleItemPerScreenEnable, nearByWindVneCardLimitCount);
            von.C(true);
            dwe.j(containerId, itemId);
            dwe.k(containerId, itemId, sectionBizCode, windParams);
            dwe.m(singleItemPerScreenEnable, nearByWindVneCardLimitCount);
        }
    }

    private boolean enableWindvaneBizOpt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8777f6b", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e(TAG, "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            return false;
        }
        return ext.getBooleanValue(IS_WINDVANE_BIZ_OPT_ENABLE);
    }

    private int getNearByWindVneCardLimitCount(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ef1e33", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null) {
            return 0;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e(TAG, "baseData == null");
            return 0;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            return 0;
        }
        return ext.getIntValue(NEARBY_WIND_VANE_LIMIT_COUNT);
    }

    private boolean getSingleItemPerScreenEnable(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff0361dd", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e(TAG, "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            return false;
        }
        return ext.getBooleanValue(SINGLE_ITEM_PRE_SCREEN_ENABLE);
    }

    private boolean getValueFromContainer(IContainerDataModel<?> iContainerDataModel, String str) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2242ea6", new Object[]{this, iContainerDataModel, str})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (ext = base.getExt()) == null || (string = ext.getString(str)) == null || string.isEmpty()) {
            return false;
        }
        return string.equals("true");
    }

    private void checkAndPrepareWindvaneParams(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, boolean z, IContainerDataModel<?> iContainerDataModel, boolean z2) {
        String str;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1400ae00", new Object[]{this, baseSectionModel, baseSubItemModel, new Boolean(z), iContainerDataModel, new Boolean(z2)});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        boolean z4 = z2 && (args == null || !args.containsKey("realExposeIndex"));
        int intValue = (args == null || !args.containsKey("realExposeIndex")) ? -1 : args.getIntValue("realExposeIndex");
        boolean isWholeCardExpose = isWholeCardExpose(intValue);
        boolean isExistWindVaneCardInNearByLimit = !z ? isExistWindVaneCardInNearByLimit(intValue, getNearbyItemLimitedCount(iContainerDataModel)) : false;
        if (TextUtils.isEmpty(baseSectionModel.getSectionBizCode())) {
            str = "";
        } else {
            str = baseSectionModel.getSectionBizCode();
        }
        boolean z5 = z2 && (TextUtils.isEmpty(str) || this.hasOverLay.contains(str));
        if (!isExistWindVaneCardInNearByLimit && isWholeCardExpose && !z5 && !z4) {
            z3 = true;
        }
        String str2 = TAG;
        fve.e(str2, "shouldRequestWindVane:" + z3 + "|exitWindVanceCardInNearByLimit:" + isExistWindVaneCardInNearByLimit + "|wholeCardExpose:" + isWholeCardExpose + "|hasOverLay:" + z5 + "|noExpose:" + z4);
        if (z3) {
            this.hasOverLay.add(str);
        }
        von.D(z3, true);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            addWindVaneCTRParams(jSONObject2, intValue, 10);
            von.a(jSONObject2);
        }
        if (z2) {
            jSONObject.put(ENABLE_WIND_TAG_ONE_TO_THREE, (Object) "true");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("windTagParams", (Object) jSONObject);
        von.B(jSONObject3.toJSONString());
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public boolean isWindVaneCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f56c97", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        JSONObject ext = baseSectionModel.getExt();
        return (ext != null && TextUtils.equals(ext.getString(nex.KEY_SECTION_TYPE), nex.TYPE_WIND_VANE_CARD)) || (baseSectionModel.getSubSection() != null && baseSectionModel.getSubSection().getWindvaneOverlay() != null);
    }

    private void addWindVaneCTRParams(JSONObject jSONObject, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16e902d", new Object[]{this, jSONObject, new Integer(i3), new Integer(i4)});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            ArrayList arrayList = new ArrayList();
            int i6 = 1;
            while (i6 <= i4) {
                int i7 = i3 - i6;
                BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i7);
                int i8 = i3 + i6;
                BaseSectionModel<?> findItemDataByPosition2 = iMainFeedsViewService.findItemDataByPosition(i8);
                if (i6 <= i5 && findItemDataByPosition != null) {
                    JSONObject ext = findItemDataByPosition.getExt();
                    String string = ext.getString("hybridCtr");
                    if (string != null) {
                        jSONObject2.put(String.valueOf(-i6), (Object) string);
                    }
                    String string2 = ext.getString("hybridCvr");
                    if (string2 != null) {
                        jSONObject3.put(String.valueOf(-i6), (Object) string2);
                    }
                }
                if (i6 <= 3 && findItemDataByPosition2 != null) {
                    JSONObject ext2 = findItemDataByPosition2.getExt();
                    String string3 = ext2.getString("hybridCtr");
                    if (string3 != null) {
                        jSONObject2.put(String.valueOf(i6), (Object) string3);
                    }
                    String string4 = ext2.getString("hybridCvr");
                    if (string4 != null) {
                        jSONObject3.put(String.valueOf(i6), (Object) string4);
                    }
                }
                if (isWindVaneCard(findItemDataByPosition)) {
                    arrayList.add(String.valueOf(i7));
                }
                if (isWindVaneCard(findItemDataByPosition2)) {
                    arrayList.add(String.valueOf(i8));
                }
                i6++;
                i3 = i;
                i4 = i2;
                i5 = 3;
            }
            jSONObject.put("targetItemIndex", (Object) Integer.valueOf(i));
            if (!arrayList.isEmpty()) {
                jSONObject.put("nearbyWindvaneItemIndexs", (Object) JSON.toJSONString(arrayList));
            }
            if (!jSONObject2.isEmpty()) {
                jSONObject.put("nearbyCtrs", (Object) jSONObject2);
            }
            if (!jSONObject3.isEmpty()) {
                jSONObject.put("nearbyCvrs", (Object) jSONObject3);
            }
        }
    }
}
