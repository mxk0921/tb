package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.FeedsData;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e4u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_ID = "topShowVideo";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f18278a;
    public SectionModel b;
    public int c = -1;
    public int d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(e4u e4uVar) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#downloadTemplate onSuccess");
            }
        }
    }

    static {
        t2o.a(491782711);
    }

    public e4u(cfc cfcVar) {
        this.f18278a = cfcVar;
    }

    public void c(LinkedSplashData linkedSplashData) {
        JSONObject linkedData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe06673", new Object[]{this, linkedSplashData});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.f18278a.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null && (linkedData = linkedSplashData.getLinkedData("feeds")) != null) {
            SectionModel sectionModel = new SectionModel(linkedData);
            ArrayList arrayList = new ArrayList();
            arrayList.add(sectionModel);
            iDxItemRenderService.downloadTemplate(arrayList, new a(this));
        }
    }

    public final int g(List<SectionModel> list, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e072264", new Object[]{this, list, new Integer(i), str})).intValue();
        }
        SectionModel sectionModel = list.get(i);
        if (sectionModel != null) {
            return sectionModel.getExt().getIntValue(str);
        }
        return 0;
    }

    public int i(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c88e69d", new Object[]{this, linkedSplashData})).intValue();
        }
        SectionModel j = j(linkedSplashData);
        int i = -1;
        if (j == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime Section is null ");
            return -1;
        }
        JSONObject jSONObject = j.getJSONObject("ext");
        if (jSONObject == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime ext is null");
            return -1;
        }
        String string = jSONObject.getString(FeedsData.KEY_VIDEO_CURRENT_POSITION);
        if (TextUtils.isEmpty(string)) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime splashVideoCurrentPosition is null ");
            return -1;
        }
        try {
            i = Integer.parseInt(string);
        } catch (Exception e) {
            fve.c(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime error ", e);
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime videoPosition " + i);
        return i;
    }

    public SectionModel j(LinkedSplashData linkedSplashData) {
        JSONObject linkedData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("38e0c1c5", new Object[]{this, linkedSplashData});
        }
        if (linkedSplashData == null || (linkedData = linkedSplashData.getLinkedData("feeds")) == null) {
            return null;
        }
        SectionModel sectionModel = this.b;
        if (sectionModel != null) {
            return sectionModel;
        }
        return new SectionModel(linkedData);
    }

    public final String k() {
        JSONObject topViewSplashData;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87fd4940", new Object[]{this});
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.f18278a.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null || (topViewSplashData = iFirstScreenDataService.getTopViewSplashData()) == null || (jSONObject = topViewSplashData.getJSONObject("ext")) == null) {
            return null;
        }
        return jSONObject.getString("topShowRule");
    }

    public void r(BaseSectionModel<?> baseSectionModel) {
        SectionModel sectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21025280", new Object[]{this, baseSectionModel});
            return;
        }
        if (baseSectionModel == null) {
            sectionModel = null;
        } else {
            sectionModel = new SectionModel(baseSectionModel);
        }
        this.b = sectionModel;
    }

    public void l(SectionModel sectionModel, boolean z, boolean z2, int i) {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43457526", new Object[]{this, sectionModel, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#insertCard isNeedTrigger: " + z);
        IContainerDataService iContainerDataService = (IContainerDataService) this.f18278a.a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null) {
            ArrayList arrayList = new ArrayList(containerData.getTotalData());
            int e = e(arrayList, i);
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#findInsertPosition: " + e);
            if (z && !d(e, z2)) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#enableInsertExposeRatio false");
            } else if (e >= 0 && e <= arrayList.size() - 1) {
                JSONObject jSONObject = (JSONObject) arrayList.get(e);
                q(arrayList, sectionModel, e);
                arrayList.remove(e);
                arrayList.add(e, sectionModel);
                containerData.updateBaseSections(arrayList);
                if (z) {
                    fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerUiRefresh ");
                    iContainerDataService.triggerEvent("OnlyUiRefresh", null);
                }
            }
        }
    }

    public final boolean m(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4a414c4", new Object[]{this, baseSectionModel})).booleanValue();
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return false;
        }
        return TextUtils.equals(ext.getString("sectionCardType"), "activity_algo");
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da301e8b", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f18278a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return false;
        }
        BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(this.c);
        if (findItemDataByPosition == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess sectionModel null");
            return false;
        }
        JSONObject jSONObject = findItemDataByPosition.getJSONObject("ext");
        if (jSONObject == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess ext null");
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isTopShowCard");
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess isTopShowCard " + booleanValue);
        return booleanValue;
    }

    public final void q(List<SectionModel> list, SectionModel sectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4509912c", new Object[]{this, list, sectionModel, new Integer(i)});
            return;
        }
        this.d = g(list, i, "marginSide");
        this.e = g(list, i, "marginTop");
        if (this.d == 0) {
            int i2 = i + 1;
            this.d = g(list, i2, "marginSide");
            this.e = g(list, i2, "marginTop");
        }
        JSONObject jSONObject = sectionModel.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("marginSide", (Object) Integer.valueOf(this.d));
        jSONObject.put("marginTop", (Object) Integer.valueOf(this.e));
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#setTopShowMargin: " + jSONObject);
    }

    public final boolean d(int i, boolean z) {
        View findItemViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c1a1a7", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#isColdStart:" + z);
        if (z) {
            return true;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f18278a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i)) == null) {
            return false;
        }
        int top = findItemViewByPosition.getTop();
        int r = pb6.r(eue.a());
        int bottom = findItemViewByPosition.getBottom();
        double c = pb6.c(eue.a(), 171.0f) / 0.701d;
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#enableInsertExposeRatio bottom " + bottom + ",Top:" + top + ",cardHeight:" + c);
        return top >= 0 && bottom <= r && c <= ((double) (r - top));
    }

    public final int h(List<SectionModel> list, int i, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97461639", new Object[]{this, list, new Integer(i), new Boolean(z)})).intValue();
        }
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            SectionModel sectionModel = list.get(i2);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (!TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        this.c = i + i2;
                        break;
                    }
                    z = true;
                }
            }
            i2++;
        }
        return this.c;
    }

    public final boolean o(BaseSectionModel<?> baseSectionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707351c", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel.getExt().getBooleanValue("isTopShowCard")) {
            return true;
        }
        JSONObject jSONObject2 = baseSectionModel.getJSONObject("bizData");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("itemPassParam")) == null) {
            return false;
        }
        String string = jSONObject.getString("x_object_type");
        return !TextUtils.isEmpty(string) && string.startsWith("k2brand");
    }

    public void a(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb8ed98", new Object[]{this, aVar});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f18278a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(this.c);
            View a2 = a48.a(findItemViewByPosition, "recMainImageBlock");
            if (a2 != null) {
                p(aVar, a2);
            } else if (findItemViewByPosition != null) {
                int[] iArr = new int[2];
                findItemViewByPosition.getLocationInWindow(iArr);
                aVar.f26271a = findItemViewByPosition.getWidth() - this.d;
                int height = findItemViewByPosition.getHeight();
                int i = this.e;
                aVar.b = height - i;
                aVar.c = iArr[0] + this.d;
                aVar.d = iArr[1] + i;
                aVar.e = pb6.c(Globals.getApplication(), 6.0f);
                fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#calLocationData width: " + aVar.f26271a + "，height:" + aVar.b + ",positionX:" + aVar.c + ",positionY:" + aVar.d + ",topShowView width:" + findItemViewByPosition.getWidth() + ",mMarginSide:" + this.d + ",mTargetPosition:" + this.c);
            }
        }
    }

    public final void b(List<SectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7679592e", new Object[]{this, list, new Boolean(z)});
            return;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SectionModel sectionModel = list.get(i2);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        this.c = i2 + 1;
                        z = true;
                    } else {
                        i++;
                        if (i > 2) {
                            return;
                        }
                        if (o(sectionModel)) {
                            if (i == 2) {
                                int i3 = i2 - 1;
                                list.set(i2, list.get(i3));
                                list.set(i3, list.get(i2));
                                this.c = i3;
                                return;
                            } else if (i == 1) {
                                this.c = i2;
                                return;
                            } else {
                                this.c = i2;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int e(List<SectionModel> list, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85fc4c43", new Object[]{this, list, new Integer(i)})).intValue();
        }
        if (i != -1) {
            return h(list, i, false);
        }
        String k = k();
        if (TextUtils.equals(k, "dynamic")) {
            this.c = f(list, false);
        } else if (TextUtils.equals(k, "lock1")) {
            b(list, false);
        } else {
            int size = list.size();
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                SectionModel sectionModel = list.get(i2);
                if (sectionModel != null) {
                    String sectionBizCode = sectionModel.getSectionBizCode();
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                        if (!TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                            i3++;
                            if (i3 > 2) {
                                break;
                            } else if (o(sectionModel)) {
                                this.c = i2;
                                break;
                            }
                        } else {
                            this.c = i2 + 1;
                            z = true;
                        }
                    }
                }
                i2++;
            }
        }
        return this.c;
    }

    public final int f(List<SectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f7a2ed", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        int size = list.size();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            SectionModel sectionModel = list.get(i3);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        i2 = i3 + 1;
                        z = true;
                    } else {
                        i++;
                        if (i > 2 || m(sectionModel)) {
                            return i3 - 1;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final void p(psg.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc36426c", new Object[]{this, aVar, view});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        aVar.f26271a = view.getWidth();
        aVar.b = view.getHeight();
        aVar.c = iArr[0];
        aVar.d = iArr[1];
        aVar.e = pb6.c(Globals.getApplication(), 6.0f);
        fve.e(obq.SPLASH_BUSINESS_TAG, "TopShowInsert#recMainImage#calLocationData width: " + aVar.f26271a + "，height:" + aVar.b + ",positionX:" + aVar.c + ",positionY:" + aVar.d + ",topShowView width:" + view.getWidth() + ",mMarginSide:" + this.d + ",mTargetPosition:" + this.c);
    }
}
