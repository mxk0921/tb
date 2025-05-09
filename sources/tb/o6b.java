package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o6b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_DENY = "请授权日历权限！";
    public static final String CALENDAR_TEXT = "您淘宝直播预约的宝贝马上开抢！";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f25163a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ String c;

        public a(xea xeaVar, LiveItem liveItem, String str) {
            this.f25163a = xeaVar;
            this.b = liveItem;
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/hanlerimpl/HotItemSubscriber$1");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (netResponse != null) {
                hha.b("HotItemSubscriber", "subscribeHotItem | onError, msg=" + netResponse.getRetMsg());
                a1u.a(this.f25163a.i(), netResponse.getRetMsg());
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                try {
                    JSONObject optJSONObject = netResponse.getDataJsonObject().optJSONObject("displayInfo");
                    String optString = netResponse.getDataJsonObject().optString("subscribeResultCode");
                    if (optJSONObject == null) {
                        hha.b("HotItemSubscriber", "subscribeHotItem | displayInfo null.");
                        return;
                    }
                    String string = optJSONObject.getString("message");
                    a1u.a(this.f25163a.i(), string);
                    if (this.f25163a.j() != null) {
                        this.f25163a.j().c0(String.valueOf(this.b.itemId), optString, this.c);
                    }
                    long longValue = this.b.itemExtData.getLongValue("promotionStartTime");
                    long millis = longValue + TimeUnit.MINUTES.toMillis(10L);
                    hha.b("HotItemSubscriber", "subscribeHotItem | startTime=" + longValue + " name=" + this.b.itemName + "  msg=" + string);
                    o6b.b(this.f25163a, this.b, longValue, millis, "hotitem_subscribe");
                } catch (Throwable th) {
                    hha.b("HotItemSubscriber", th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements l8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f25164a;

        public b(xea xeaVar) {
            this.f25164a = xeaVar;
        }

        @Override // tb.l8d
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                return;
            }
            hha.b("HotItemSubscriber", "onDenied.");
            a1u.a(this.f25164a.i(), "请授权日历权限！");
        }

        @Override // tb.l8d
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                hha.b("HotItemSubscriber", "onGranted.");
            }
        }
    }

    static {
        t2o.a(295698986);
    }

    public static String a(xea xeaVar, LiveItem liveItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3fd6875", new Object[]{xeaVar, liveItem});
        }
        if (xeaVar == null || liveItem == null) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        if (xeaVar.H() == null || xeaVar.H().broadCaster == null) {
            str = "";
        } else {
            str = xeaVar.H().broadCaster.accountName;
        }
        String str2 = liveItem.itemName;
        if (!TextUtils.isEmpty(liveItem.itemShortTitle)) {
            str2 = liveItem.itemShortTitle;
        }
        return "你预约的" + str + str2 + "补贴马上开始使用咯～";
    }

    public static void b(xea xeaVar, LiveItem liveItem, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1abda78", new Object[]{xeaVar, liveItem, new Long(j), new Long(j2), str});
        } else if (xeaVar != null && liveItem != null && xeaVar.i() != null) {
            kkr.i().d().f(xeaVar.q(), xeaVar.i(), a(xeaVar, liveItem), "https://h5.m.taobao.com/taolive/video.html?userId=" + xeaVar.g() + "&livesource=" + str, j, j2, 1L, new b(xeaVar));
        }
    }

    public static void c(xea xeaVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a02826", new Object[]{xeaVar, liveItem, str});
        } else if (xeaVar == null || xeaVar.j() == null || liveItem == null || liveItem.itemExtData == null) {
            hha.b("HotItemSubscriber", "subscribeHotItem | params null.");
        } else if (v2s.o().u() == null) {
            hha.b("HotItemSubscriber", "subscribeHotItem | LoginAdapter null.");
        } else {
            new m6b(new a(xeaVar, liveItem, str)).K(liveItem.itemExtData.getString("activityDetailId"), v2s.o().u().getUserId());
        }
    }

    public static void d(xea xeaVar, LiveItem liveItem, String str) {
        com.alibaba.fastjson.JSONObject jSONObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9232314d", new Object[]{xeaVar, liveItem, str});
        } else if (kkr.i().o() != null && liveItem != null && (jSONObject = liveItem.personalityData) != null && jSONObject.getIntValue("hotItemPreheatSubscribeStatus") == 0) {
            HashMap<String, String> e = zha.e(xeaVar, liveItem);
            if (TextUtils.equals(str, "showcase")) {
                str2 = "itemwidow";
            } else {
                str2 = vrp.BIZ_GOODS_LIST;
            }
            e.put("clickSource", str2);
            kkr.i().o().c("gl_hotItemSubscribe", e);
        }
    }
}
