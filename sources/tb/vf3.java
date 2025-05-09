package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest;
import com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(707788844);
    }

    public static is6 a(String str, int i, String str2, String str3, String str4, long j, long j2, long j3, String str5, String str6, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("ea4519b5", new Object[]{str, new Integer(i), str2, str3, str4, new Long(j), new Long(j2), new Long(j3), str5, str6, new Long(j4)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.request.CategoryRequest", "public static DataRequest createListRequest(String appName, int type, String moduleId, String categoryName, String categoryDesc, long categoryType, long source, long isSync, String addItemIdsm, String headPic, long utdid)", "20180112");
        ComTaobaoMercuryCreateShareListRequest comTaobaoMercuryCreateShareListRequest = new ComTaobaoMercuryCreateShareListRequest();
        comTaobaoMercuryCreateShareListRequest.setAppName(str);
        comTaobaoMercuryCreateShareListRequest.setType(i);
        comTaobaoMercuryCreateShareListRequest.setModuleId(Long.parseLong(str2));
        comTaobaoMercuryCreateShareListRequest.setSource(j2);
        comTaobaoMercuryCreateShareListRequest.setIsSync(j3);
        comTaobaoMercuryCreateShareListRequest.setCategoryName(str3);
        comTaobaoMercuryCreateShareListRequest.setCategoryType(j);
        comTaobaoMercuryCreateShareListRequest.setCategoryDesc(str4);
        comTaobaoMercuryCreateShareListRequest.setAddItemIds(str5);
        comTaobaoMercuryCreateShareListRequest.setHeadPic(str6);
        comTaobaoMercuryCreateShareListRequest.setUtdid(j4);
        return ks6.a(comTaobaoMercuryCreateShareListRequest, 44);
    }

    public static is6 b(String str, int i, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("c0cf03a1", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), str2});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.request.CategoryRequest", "public static DataRequest queryListRequest(String appName, int pageSize, int type, int source, String cursor)", "20180112");
        ComTaobaoMercuryQueryShareListRequest comTaobaoMercuryQueryShareListRequest = new ComTaobaoMercuryQueryShareListRequest();
        comTaobaoMercuryQueryShareListRequest.setPageSize(i);
        comTaobaoMercuryQueryShareListRequest.setType(i2);
        comTaobaoMercuryQueryShareListRequest.setAppName(str);
        comTaobaoMercuryQueryShareListRequest.setSource(i3);
        comTaobaoMercuryQueryShareListRequest.setCursor(str2);
        return ks6.a(comTaobaoMercuryQueryShareListRequest, 44);
    }
}
