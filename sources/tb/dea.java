package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.concurrent.TimeUnit;
import tb.fws;
import tb.i0m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_DENY = "请授权日历权限！";
    public static final String CALENDAR_TEXT = "您淘宝直播预约的宝贝马上开抢！";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17756a;
        public final /* synthetic */ c b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;

        public a(Context context, c cVar, String str, JSONObject jSONObject) {
            this.f17756a = context;
            this.b = cVar;
            this.c = str;
            this.d = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/goodcard/GoodItemSubscriber$1");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (netResponse != null) {
                o3s.b("HotItemSubscriber", "subscribeHotItem | onError, msg=" + netResponse.getRetMsg());
                a1u.a(this.f17756a, "预约失败，请重试~");
                ((fws.b) this.b).a();
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                try {
                    org.json.JSONObject optJSONObject = netResponse.getDataJsonObject().optJSONObject("displayInfo");
                    if (optJSONObject == null) {
                        o3s.b("HotItemSubscriber", "subscribeHotItem | displayInfo null.");
                        return;
                    }
                    String string = optJSONObject.getString("message");
                    if ("ALREADY_SUBSCRIBED".equals(netResponse.getDataJsonObject().getString("subscribeResultCode"))) {
                        a1u.a(this.f17756a, string);
                        return;
                    }
                    ((fws.b) this.b).b(netResponse.getDataJsonObject());
                    long j = netResponse.getDataJsonObject().getLong("promotionStartTime");
                    long millis = j + TimeUnit.MINUTES.toMillis(10L);
                    o3s.b("HotItemSubscriber", "subscribeHotItem | startTime=" + j + "  msg=" + string);
                    dea.a(dea.this, this.f17756a, j, millis, "hotitem_subscribe", this.c, this.d);
                } catch (Throwable th) {
                    o3s.b("HotItemSubscriber", th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17757a;

        public b(dea deaVar, Context context) {
            this.f17757a = context;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                return;
            }
            o3s.b("HotItemSubscriber", "onDenied.");
            a1u.a(this.f17757a, "请授权日历权限！");
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                o3s.b("HotItemSubscriber", "onGranted.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    static {
        t2o.a(779092805);
    }

    public static /* synthetic */ void a(dea deaVar, Context context, long j, long j2, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865696ef", new Object[]{deaVar, context, new Long(j), new Long(j2), str, str2, jSONObject});
        } else {
            deaVar.c(context, j, j2, str, str2, jSONObject);
        }
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca1294fc", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        String string = jSONObject.getString("anchorName");
        String string2 = jSONObject.getString("itemName");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        return "你预约的" + string + string2 + "可以用补贴抢购啦～";
    }

    public final void c(Context context, long j, long j2, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abeca243", new Object[]{this, context, new Long(j), new Long(j2), str, str2, jSONObject});
        } else if (context != null) {
            gq0.d().b(context, b(jSONObject), "https://h5.m.taobao.com/taolive/video.html?userId=" + str2 + "&livesource=" + str, j, j2, 1L, new b(this, context));
        }
    }

    public void d(Context context, String str, String str2, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a6e7ee", new Object[]{this, context, str, str2, jSONObject, cVar});
        } else if (context == null) {
            o3s.b("HotItemSubscriber", "subscribeHotItem | params null.");
        } else if (v2s.o().u() == null) {
            o3s.b("HotItemSubscriber", "subscribeHotItem | LoginAdapter null.");
        } else {
            new cea(new a(context, cVar, str2, jSONObject)).K(str, v2s.o().u().getUserId());
        }
    }
}
