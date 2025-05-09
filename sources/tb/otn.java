package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class otn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25645a;

    static {
        t2o.a(713031928);
    }

    public boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93032c7f", new Object[]{this, activity})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f25645a) || !dbl.f()) {
            return false;
        }
        return Nav.from(activity).disableTransition().toUri(this.f25645a);
    }

    public void f(MtopResponse mtopResponse) {
        JSONObject dataJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0095e20", new Object[]{this, mtopResponse});
        } else if (mtopResponse != null && (dataJsonObject = mtopResponse.getDataJsonObject()) != null) {
            try {
                JSONObject jSONObject = dataJsonObject.getJSONObject("global");
                if (jSONObject != null && jSONObject.has("redirectUrlWhenClose")) {
                    String string = jSONObject.getString("redirectUrlWhenClose");
                    if (!TextUtils.isEmpty(string)) {
                        this.f25645a = string;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean b(zmj zmjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce00bbd9", new Object[]{zmjVar, str})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enableRedirectInNotification", false)) {
            hav.g("RedirectUtil", "preInterceptLogisticsDetail:", "switcher is off");
            return false;
        } else if (TextUtils.isEmpty(str) || !str.contains("viewLogisticDetail=true")) {
            return false;
        } else {
            return d(zmjVar, str, false);
        }
    }

    public static boolean a(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("736240c", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enableRedirectInDetail", false)) {
            hav.g("RedirectUtil", "preInterceptLogisticsInDetail:", "switcher is off");
            return false;
        } else if (!"true".equals(jql.l(intent, CoreConstants.IN_PARAMS_VIEW_LOGISTICS)) || intent == null || intent.getData() == null) {
            return false;
        } else {
            return d(zmjVar, intent.getData().toString(), true);
        }
    }

    public static boolean c(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b109755", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (!dbl.c()) {
            hav.g("RedirectUtil", "preInterceptODetail:", "switcher is off");
            return false;
        }
        if (!(zmjVar == null || zmjVar.d() == null)) {
            Context d = zmjVar.d();
            if (!(intent == null || intent.getData() == null || intent.getData().getQuery() == null)) {
                String query = intent.getData().getQuery();
                if (query.contains("downgrade2native=true")) {
                    hav.g("RedirectUtil", "preInterceptODetail:", "query contains downgrade2native");
                    return false;
                } else if ("true".equals(jql.l(intent, CoreConstants.IN_PARAMS_VIEW_LOGISTICS))) {
                    return false;
                } else {
                    String g = jql.g(intent);
                    if (TextUtils.isEmpty(g)) {
                        hav.g("RedirectUtil", "preInterceptODetail:", "orderId is empty");
                        return false;
                    }
                    String e = cbv.e("https://meta.m.taobao.com/app/tb-trade/odetail/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&wx_limit_raster_cache=true&openFrom=native2weex&wx_auto_back=true&orderId=" + g + "&orderLineId=" + g + "&disableNav=YES&status_bar_transparent=true&nativeDirectToweex=true");
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append('&');
                    sb.append(query);
                    String sb2 = sb.toString();
                    if (dbl.a()) {
                        sb2 = sb2 + "&tradeHybrid=true";
                    }
                    Nav.from(d).disableTransition().toUri(Uri.parse(sb2));
                    idl.c(idl.a.a(OrderBizCode.orderDetail, "nativeDirectToOrder4").sampling(1.0f).message("nav to odetail4, original url:" + intent.getData().toString()));
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(zmj zmjVar, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("708c4a27", new Object[]{zmjVar, str, new Boolean(z)})).booleanValue();
        }
        if (!(zmjVar == null || zmjVar.d() == null || TextUtils.isEmpty(str))) {
            Context d = zmjVar.d();
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    if (!queryParameterNames.contains("downgrade2native") || !TextUtils.equals(parse.getQueryParameter("downgrade2native"), "true")) {
                        Uri.Builder buildUpon = Uri.parse(cbv.e("https://meta.m.taobao.com/app/mtb/logisticsV2/detail?wh_weex=true&renderMode=texture&wx_opaque=1&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&wx_limit_raster_cache=true&tradeHybrid=true&nativeDirectToweex=true")).buildUpon();
                        for (String str3 : queryParameterNames) {
                            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(parse.getQueryParameter(str3))) {
                                buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
                            }
                        }
                        if (z) {
                            str2 = "universal";
                        } else {
                            str2 = RemoteMessageConst.NOTIFICATION;
                        }
                        buildUpon.appendQueryParameter(PreloadTaskEntity.SOURCE_FROM, str2);
                        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "appendAnimQueryInRedirect", true)) {
                            buildUpon.appendQueryParameter("skipEnterAnimation", "true");
                        }
                        Nav.from(d).disableTransition().toUri(buildUpon.build());
                        h15 sampling = idl.a.a(OrderBizCode.orderDetail, "nativeDirectToLogistics").sampling(0.001f);
                        idl.c(sampling.message("nav to logisticsDetail, fromDetail: " + z + ", directToUrl: " + str));
                        return true;
                    }
                    hav.g("RedirectUtil", "preInterceptLogisticsDetail:", "query contains downgrade2native");
                    return false;
                }
                return false;
            } catch (Throwable th) {
                hav.g("RedirectUtil", "preInterceptLogisticsDetail:", "throwable: " + th.toString());
            }
        }
        return false;
    }
}
