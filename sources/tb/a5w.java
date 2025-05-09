package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.login4android.api.Coordinator;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.global.SDKUtils;
import tb.qy8;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a5w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String FIRST_FRAME_IMAGE_URL = "firstFrameImageUrl";
    public static final String HOME_PAGE = "homepage";
    public static final String VIDEO_ANIMATION = "videoAnimation";
    public static final String VIDEO_ANIMATION_BIZ_NAME = "videoAnimationMonitor";
    public static final String VIDEO_TIME = "videoTime";
    public static final String VIDEO_URL = "videoUrl";

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f15558a = new CopyOnWriteArrayList();
    public final List<String> b = new CopyOnWriteArrayList();
    public IContainerDataService<?> c;
    public IMainFeedsViewService<?> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(a5w a5wVar) {
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            tve.c(a5w.VIDEO_ANIMATION, "videoDownLoadError", "", a5w.VIDEO_ANIMATION_BIZ_NAME, "", null);
            fve.e("VideoAnimationCardHelper", "download error url：" + str + "，path" + str2);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            tve.c(a5w.VIDEO_ANIMATION, "videoDownLoadSuccess", "", a5w.VIDEO_ANIMATION_BIZ_NAME, "", null);
            fve.e("VideoAnimationCardHelper", "download finish url：" + str + "，path" + str2);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15559a;
        public final /* synthetic */ boolean b;

        public b(String str, boolean z) {
            this.f15559a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = a5w.a(a5w.this);
            if (!TextUtils.isEmpty(a2)) {
                File file = new File(a2);
                if (file.exists()) {
                    boolean b = a5w.b(a5w.this, this.f15559a, gov.SUFFIX_MP4);
                    File[] listFiles = file.listFiles();
                    String i = a5w.this.i(this.f15559a);
                    for (File file2 : listFiles) {
                        if (!b || !a5w.b(a5w.this, file2.getAbsolutePath(), gov.SUFFIX_MP4) || TextUtils.equals(i, file2.getAbsolutePath())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b || a5w.b(a5w.this, file2.getAbsolutePath(), gov.SUFFIX_MP4) || TextUtils.equals(i, file2.getAbsolutePath())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (this.b || z || z2) {
                            fve.e("VideoAnimationCardHelper", "delete file:" + file2.getAbsolutePath() + ",delete:" + file2.delete());
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(491782749);
    }

    public a5w(IContainerDataService<?> iContainerDataService, IMainFeedsViewService<?> iMainFeedsViewService) {
        boolean z;
        StringBuilder sb = new StringBuilder("initService mMainFeedsViewService is null:");
        boolean z2 = false;
        if (iContainerDataService == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(",mDataService is null:");
        sb.append(iMainFeedsViewService == null ? true : z2);
        fve.e("VideoAnimationCardHelper", sb.toString());
        this.c = iContainerDataService;
        this.d = iMainFeedsViewService;
    }

    public static /* synthetic */ String a(a5w a5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23779c0c", new Object[]{a5wVar});
        }
        return a5wVar.p();
    }

    public static /* synthetic */ boolean b(a5w a5wVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0f9a5ad", new Object[]{a5wVar, str, str2})).booleanValue();
        }
        return a5wVar.m(str, str2);
    }

    public final void c(long j, long j2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1b65b7", new Object[]{this, new Long(j), new Long(j2), str, str2});
            return;
        }
        String e = qy8.b.e("homepage_switch", "localRecord", "");
        if (TextUtils.isEmpty(e)) {
            fve.e("VideoAnimationCardHelper", "checkAndResetLocalFatigue 本地无疲劳度:");
            s(j, j2, str, str2);
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(e);
            if (parseObject.getLongValue("startTime") == j && parseObject.getLongValue("endTime") == j2 && TextUtils.equals(parseObject.getString("videoUrl"), str)) {
                return;
            }
            fve.e("VideoAnimationCardHelper", "checkAndResetLocalFatigue 数据更新:");
            s(j, j2, str, str2);
        } catch (Exception e2) {
            fve.c("VideoAnimationCardHelper", "checkAndResetLocalFatigue 解析异常:", e2);
            s(j, j2, str, str2);
        }
    }

    public final boolean e(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8b3665c", new Object[]{this, sectionModel})).booleanValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.d;
        if (iMainFeedsViewService == null) {
            fve.e("VideoAnimationCardHelper", "checkVisibleAndRefresh mainFeedsViewService null:");
            return false;
        }
        int positionBySectionBizCode = iMainFeedsViewService.getPositionBySectionBizCode(sectionModel.getSectionBizCode());
        fve.e("VideoAnimationCardHelper", "checkVisibleAndRefresh card position:" + positionBySectionBizCode);
        View findItemViewByPosition = this.d.findItemViewByPosition(positionBySectionBizCode);
        if (findItemViewByPosition == null) {
            fve.e("VideoAnimationCardHelper", "checkVisibleAndRefresh targetView null:");
            return false;
        }
        boolean o = o(findItemViewByPosition);
        fve.e("VideoAnimationCardHelper", "checkVisibleAndRefresh iswCompleteVisible :" + o);
        if (!o) {
            return false;
        }
        this.d.reloadUi();
        return true;
    }

    public void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6581f5", new Object[]{this, str, new Boolean(z)});
        } else {
            Coordinator.execute(new b(str, z));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c = null;
        this.d = null;
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ee90a90", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String p = p();
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        fve.e("VideoAnimationCardHelper", "getUrlFleName " + substring);
        File file = new File(p, substring);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        fve.e("VideoAnimationCardHelper", "getLocalUrlPath: " + file + " ,no exist");
        return null;
    }

    public JSONObject j(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6fb52a1b", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (ext = base.getExt()) == null) {
            return null;
        }
        String string = ext.getString(VIDEO_ANIMATION);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string);
        } catch (Exception e) {
            fve.c("VideoAnimationCardHelper", "getVideoAnimation parse error：", e);
            return null;
        }
    }

    public final SectionModel k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("560ffc7d", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.c;
        if (iContainerDataService == null) {
            fve.e("VideoAnimationCardHelper", "getVideoCardSectionModel mDataService null:");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("VideoAnimationCardHelper", "getVideoCardSectionModel containerData null:");
            return null;
        }
        try {
            List totalData = containerData.getTotalData();
            if (totalData.isEmpty()) {
                fve.e("VideoAnimationCardHelper", "getVideoCardSectionModel totalData null:");
                return null;
            }
            for (int i = 0; i < totalData.size(); i++) {
                SectionModel sectionModel = (SectionModel) totalData.get(i);
                if (sectionModel != null) {
                    String sectionBizCode = sectionModel.getSectionBizCode();
                    if (!TextUtils.isEmpty(sectionBizCode)) {
                        if (!((CopyOnWriteArrayList) this.f15558a).contains(sectionBizCode)) {
                            fve.e("VideoAnimationCardHelper", "getVideoCardSectionModel sectionBizCode:" + sectionBizCode + ",sectionBizCodes:" + ((CopyOnWriteArrayList) this.f15558a).size());
                        } else {
                            fve.e("VideoAnimationCardHelper", "getVideoCardSectionModel find card:");
                            return sectionModel;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            fve.c("VideoAnimationCardHelper", "getVideoCardSectionModel error:", e);
            return null;
        }
    }

    public final boolean m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd99b43a", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.split("\\?")[0].endsWith(str2);
    }

    public boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46e1bac5", new Object[]{this, str})).booleanValue();
        }
        return ((CopyOnWriteArrayList) this.b).contains(str);
    }

    public final boolean o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a58c272", new Object[]{this, view})).booleanValue();
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return rect.equals(new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()));
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a8cde04", new Object[]{this});
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null) {
            fve.e("VideoAnimationCardHelper", "localVideoPath: cache null");
            return null;
        }
        File file = new File(filesDir, File.separator + "homepage");
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            fve.e("VideoAnimationCardHelper", "localVideoPath createFile: " + mkdirs);
        }
        return file.getAbsolutePath();
    }

    public void q(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0de34c", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null) {
            fve.e("VideoAnimationCardHelper", "parseVideoAnimationConfigData:containerDataModel null");
        } else {
            IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
            if (base == null) {
                fve.e("VideoAnimationCardHelper", "parseVideoAnimationConfigData:base null");
                return;
            }
            JSONObject ext = base.getExt();
            if (ext == null) {
                fve.e("VideoAnimationCardHelper", "parseVideoAnimationConfigData:ext null");
                return;
            }
            try {
                fve.e("VideoAnimationCardHelper", "updateVideoAnimationData refresh type data");
                u(ext.getJSONArray("videoRefreshTypes"), this.b);
                fve.e("VideoAnimationCardHelper", "updateVideoAnimationData sectionBizCodes data");
                u(ext.getJSONArray("videoSectionBizCodes"), this.f15558a);
            } catch (Exception e) {
                fve.c("VideoAnimationCardHelper", "updateVideoAnimationData updateVideoAnimationData error", e);
            }
        }
    }

    public final void s(long j, long j2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56b278a", new Object[]{this, new Long(j), new Long(j2), str, str2});
            return;
        }
        fve.e("VideoAnimationCardHelper", "resetLocalFatigue 本地疲劳度:");
        qy8.b.i("homepage_switch", str2, "0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", (Object) Long.valueOf(j));
        jSONObject.put("endTime", (Object) Long.valueOf(j2));
        jSONObject.put("videoUrl", (Object) str);
        qy8.b.i("homepage_switch", "localRecord", jSONObject.toJSONString());
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefeeb60", new Object[]{this});
            return;
        }
        SectionModel k = k();
        if (k == null) {
            fve.e("VideoAnimationCardHelper", "uiRefresh videoCardSectionModel null:");
            return;
        }
        boolean e = e(k);
        fve.e("VideoAnimationCardHelper", "uiRefresh result:" + e);
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3004f47", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                int parseInt = Integer.parseInt(qy8.b.e("homepage_switch", str, "0"));
                int i = 1 + parseInt;
                fve.e("VideoAnimationCardHelper", "recordFatigue fatigue:" + parseInt + ",newFatigue:" + i);
                qy8.b.i("homepage_switch", str, String.valueOf(i));
            } catch (Exception e) {
                fve.c("VideoAnimationCardHelper", "recordFatigue error", e);
            }
        }
    }

    public final boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51c0c53", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String i = i(str);
        f(str, false);
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(i)) {
            fve.e("VideoAnimationCardHelper", "checkDownload:url：" + str + "，不下载");
            return false;
        } else if (!z || m(str, gov.SUFFIX_MP4)) {
            return true;
        } else {
            fve.e("VideoAnimationCardHelper", "downloadVideo:非mp4后缀不下载");
            return false;
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11944a56", new Object[]{this, jSONObject});
        } else if (!ncw.d()) {
            fve.e("VideoAnimationCardHelper", "downloadVideo:device not SupportVideo ");
        } else {
            String string = jSONObject.getString("videoUrl");
            ArrayList arrayList = new ArrayList();
            if (d(string, true)) {
                tve.c(VIDEO_ANIMATION, "videoDownLoadStart", "", VIDEO_ANIMATION_BIZ_NAME, "", null);
                arrayList.add(new onf(string));
            }
            String string2 = jSONObject.getString(FIRST_FRAME_IMAGE_URL);
            if (d(string2, false)) {
                arrayList.add(new onf(string2));
            }
            if (!arrayList.isEmpty()) {
                zu7 zu7Var = new zu7();
                zu7Var.f33016a = arrayList;
                upl uplVar = new upl();
                zu7Var.b = uplVar;
                uplVar.f29547a = "homepage";
                uplVar.g = p();
                zu7Var.b.h = false;
                rv7.e().b(zu7Var, new a(this));
            }
        }
    }

    public final void u(JSONArray jSONArray, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4e37dc", new Object[]{this, jSONArray, list});
        } else if (jSONArray == null || jSONArray.isEmpty()) {
            fve.e("VideoAnimationCardHelper", "updateVideoAnimationData data null :");
        } else {
            list.clear();
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    list.add(string);
                }
            }
            fve.e("VideoAnimationCardHelper", "updateVideoAnimationData refreshTypeList:" + list.size());
        }
    }

    public boolean l(JSONObject jSONObject) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9776da32", new Object[]{this, jSONObject})).booleanValue();
        }
        long longValue = jSONObject.getLongValue("effectiveStartTime");
        long longValue2 = jSONObject.getLongValue("effectiveEndTime");
        String string = jSONObject.getString("videoUrl");
        String i3 = i(string);
        c(longValue, longValue2, string, i3);
        long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
        if (correctionTimeMillis < longValue || correctionTimeMillis > longValue2) {
            fve.e("VideoAnimationCardHelper", "isInAvailablePeriod:not in period");
            return false;
        } else if (TextUtils.isEmpty(i3)) {
            return false;
        } else {
            try {
                i = Integer.parseInt(jSONObject.getString("fatigueMaxCount"));
            } catch (Exception e) {
                fve.c("VideoAnimationCardHelper", "isInAvailablePeriod error", e);
                i = 0;
            }
            try {
                i2 = Integer.parseInt(qy8.b.e("homepage_switch", i3, "0"));
            } catch (Exception e2) {
                fve.c("VideoAnimationCardHelper", "isInAvailablePeriod error", e2);
                i2 = 0;
            }
            fve.e("VideoAnimationCardHelper", "isInAvailablePeriod:fatigueMaxCount:" + i + ",fatigue:" + i2);
            return i2 < i;
        }
    }
}
