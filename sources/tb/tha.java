package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest;
import com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest;
import com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectionidsGetRequest;
import com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(707788862);
    }

    public static is6 a(String str, long j, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("a1bd73c6", new Object[]{str, new Long(j), map});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.request.GoodsRequest", "public static DataRequest addCollectRequest(String appName, long itemId, String extendMap)", "20180112");
        MtopTaobaoMercuryAddCollectRequest mtopTaobaoMercuryAddCollectRequest = new MtopTaobaoMercuryAddCollectRequest();
        mtopTaobaoMercuryAddCollectRequest.setAppName(str);
        mtopTaobaoMercuryAddCollectRequest.setItemId(j);
        if (map != null) {
            try {
                mtopTaobaoMercuryAddCollectRequest.setExtendMap(JSON.toJSONString(map));
            } catch (Throwable unused) {
            }
        }
        return ks6.a(mtopTaobaoMercuryAddCollectRequest, 44);
    }

    public static is6 b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("4da36974", new Object[]{str, new Long(j)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.request.GoodsRequest", "public static DataRequest checkCollectRequest(String ids, long type)", "20180112");
        MtopTaobaoMercuryCheckCollectRequest mtopTaobaoMercuryCheckCollectRequest = new MtopTaobaoMercuryCheckCollectRequest();
        mtopTaobaoMercuryCheckCollectRequest.setIds(str);
        mtopTaobaoMercuryCheckCollectRequest.setType(j);
        return ks6.a(mtopTaobaoMercuryCheckCollectRequest, 44);
    }

    public static is6 c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("66b9053b", new Object[]{str, str2, new Integer(i)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.request.GoodsRequest", "public static DataRequest deleteCollectsRequest(String appName, String itemIds, int favType)", "20180112");
        MtopTaobaoMercuryDelCollectsRequest mtopTaobaoMercuryDelCollectsRequest = new MtopTaobaoMercuryDelCollectsRequest();
        mtopTaobaoMercuryDelCollectsRequest.setAppName(str);
        mtopTaobaoMercuryDelCollectsRequest.setItemIds(str2);
        mtopTaobaoMercuryDelCollectsRequest.setFavType(i);
        return ks6.a(mtopTaobaoMercuryDelCollectsRequest, 44);
    }

    public static is6 d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("a56cc4b7", new Object[]{new Integer(i), new Integer(i2)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.request.GoodsRequest", "public static DataRequest getCollectedItemsRequest(int favType, int pageSize)", "20180112");
        MtopTaobaoMercuryCollectionidsGetRequest mtopTaobaoMercuryCollectionidsGetRequest = new MtopTaobaoMercuryCollectionidsGetRequest();
        mtopTaobaoMercuryCollectionidsGetRequest.setFavType(i);
        mtopTaobaoMercuryCollectionidsGetRequest.setSize(i2);
        return ks6.a(mtopTaobaoMercuryCollectionidsGetRequest, 44);
    }
}
