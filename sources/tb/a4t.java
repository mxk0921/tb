package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownRequestType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a4t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a4t INSTANCE = new a4t();
    public static final String FIRST_ENTRY = "FirstEntry";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f15544a = a.j(jpu.a(FIRST_ENTRY, "0"), jpu.a(TaoLiveKtUpDownRequestType.FirstBatch.getValue(), "1"), jpu.a(TaoLiveKtUpDownRequestType.NextBatch.getValue(), "2"), jpu.a(TaoLiveKtUpDownRequestType.ForceBatch.getValue(), "3"), jpu.a(TaoLiveKtUpDownRequestType.NormalRealtime.getValue(), "4"), jpu.a(TaoLiveKtUpDownRequestType.AdRealtime.getValue(), "5"), jpu.a(TaoLiveKtUpDownRequestType.AutoRealtime.getValue(), "6"));

    static {
        t2o.a(1010827402);
    }

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe016bb8", new Object[]{this});
        }
        return f15544a;
    }

    public final String c(Map<String, ? extends Object> map, pxs pxsVar) {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9faf3afe", new Object[]{this, map, pxsVar});
        }
        if (map == null || pxsVar == null || (d = pxsVar.d()) == null) {
            return null;
        }
        if (map.get("officialLiveInfo") != null && ckf.b(map.get("roomStatus"), "1")) {
            return "official";
        }
        if (d.isGoodsCard()) {
            return "goodsCard";
        }
        return "live";
    }

    public final String d(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e225d8f3", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        if (map.get("timeMovingPlayInfo") != null) {
            return RecModel.MEDIA_TYPE_TIMEMOVE;
        }
        if (ckf.b(map.get("roomStatus"), "2")) {
            return "playback";
        }
        return "live";
    }

    public final String e(pxs pxsVar) {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5c55517", new Object[]{this, pxsVar});
        }
        if (pxsVar == null || (d = pxsVar.d()) == null) {
            return null;
        }
        return d.getRequestType();
    }

    public final String b(Map<String, ? extends Object> map, pxs pxsVar) {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("669cc9b8", new Object[]{this, map, pxsVar});
        }
        Object obj = null;
        if (map == null || pxsVar == null || (d = pxsVar.d()) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("officialLiveInfo") != null) {
            Object obj2 = map.get("officialLiveInfo");
            if (obj2 == null) {
                obj2 = null;
            }
            KMPJsonObject kMPJsonObject = new KMPJsonObject(obj2);
            sb.append("#officialLive=" + kMPJsonObject.getString("officialLive"));
        }
        if (d.getRecommendCardInfo() != null) {
            StringBuilder sb2 = new StringBuilder("#dxTemplateName=");
            Map<String, Object> recommendCardInfo = d.getRecommendCardInfo();
            sb2.append(recommendCardInfo != null ? recommendCardInfo.get("dxTemplateName") : null);
            sb.append(sb2.toString());
        }
        if (d.getReserveItemCardInfo() != null) {
            Map<String, Object> reserveItemCardInfo = d.getReserveItemCardInfo();
            if ((reserveItemCardInfo != null ? reserveItemCardInfo.get("cardInfo") : null) != null) {
                Map<String, Object> reserveItemCardInfo2 = d.getReserveItemCardInfo();
                Object obj3 = reserveItemCardInfo2 != null ? reserveItemCardInfo2.get("cardInfo") : null;
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map2 != null) {
                    obj = map2.get("dxTemplateName");
                }
                if (obj != null) {
                    sb.append("#dxTemplateName=" + map2.get("dxTemplateName"));
                }
            }
        }
        if (d.getAlimama() != null) {
            sb.append("#isAD");
        }
        TaoLiveKtSwitchModel e = pxsVar.e(pxsVar.c() - 1);
        if (e != null && e.getNextGuideShown()) {
            sb.append("#fromLiveGuide");
        }
        return sb.toString();
    }
}
