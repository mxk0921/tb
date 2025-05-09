package com.alibaba.android.icart.core.performance.preloader.task.impl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.b3o;
import tb.c9x;
import tb.ckf;
import tb.f9v;
import tb.hav;
import tb.ib3;
import tb.ic3;
import tb.lav;
import tb.na3;
import tb.oa3;
import tb.op6;
import tb.pav;
import tb.ppq;
import tb.qa3;
import tb.sb3;
import tb.t2o;
import tb.ub3;
import tb.vav;
import tb.vc3;
import tb.wz;
import tb.xh8;
import tb.z1x;
import tb.zs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CartFirstPageRequestPreloader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CartFirstPageRequestPreloader INSTANCE = new CartFirstPageRequestPreloader();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f2213a = new AtomicBoolean(false);
    public static String b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$preload$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f2217a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public c(Activity activity, String str, boolean z, String str2) {
            this.f2217a = activity;
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                CartFirstPageRequestPreloader.a(CartFirstPageRequestPreloader.INSTANCE, this.f2217a, this.b, this.c, this.d);
            } catch (Throwable th) {
                xh8 c = xh8.a("Ultron").c("CartFirstPageRequestPreloader");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c.message(message));
            }
        }
    }

    static {
        t2o.a(479199527);
    }

    public static final /* synthetic */ void a(CartFirstPageRequestPreloader cartFirstPageRequestPreloader, Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c080a4e", new Object[]{cartFirstPageRequestPreloader, activity, str, new Boolean(z), str2});
        } else {
            cartFirstPageRequestPreloader.d(activity, str, z, str2);
        }
    }

    public static final /* synthetic */ AtomicBoolean b(CartFirstPageRequestPreloader cartFirstPageRequestPreloader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("d284a0f4", new Object[]{cartFirstPageRequestPreloader});
        }
        return f2213a;
    }

    public final boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3991d1d", new Object[]{this, context})).booleanValue();
        }
        return op6.e(context);
    }

    public final void f(final Activity activity, final String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ec32bc", new Object[]{this, activity, str, new Boolean(z), str2});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(activity, new BroadcastReceiver() { // from class: com.alibaba.android.icart.core.performance.preloader.task.impl.CartFirstPageRequestPreloader$observeLoginStatus$$inlined$tryCatch$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(CartFirstPageRequestPreloader$observeLoginStatus$$inlined$tryCatch$lambda$1 cartFirstPageRequestPreloader$observeLoginStatus$$inlined$tryCatch$lambda$1, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$observeLoginStatus$$inlined$tryCatch$lambda$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.g(context, "context");
                    ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    if (Login.checkSessionValid()) {
                        LoginBroadcastHelper.unregisterLoginReceiver(activity, this);
                        hav.d("CartFirstPageRequestPreloader", "登录，恢复预请求");
                        CartFirstPageRequestPreloader.b(CartFirstPageRequestPreloader.INSTANCE).set(false);
                        CartFirstPageRequestPreloader.g(activity, str, z, str2);
                    }
                }
            });
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c("CartFirstPageRequestPreloader");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements ppq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2215a;
        public final /* synthetic */ Activity b;

        public a(String str, Activity activity) {
            this.f2215a = str;
            this.b = activity;
        }

        @Override // tb.ppq
        public void a(List<? extends AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0fbf7c", new Object[]{this, list});
            }
        }

        @Override // tb.ppq
        public void b(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2839d44", new Object[]{this, streamOtherResponse});
            }
        }

        @Override // tb.ppq
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39875222", new Object[]{this, streamOtherResponse});
                return;
            }
            if (vav.a(c9x.CART_BIZ_NAME, "resetPreRequestStatusWhenError", true)) {
                CartFirstPageRequestPreloader.b(CartFirstPageRequestPreloader.INSTANCE).set(false);
            }
            ub3.d("preRequestAPIStatus", "失败:" + this.f2215a, false, 1.0f);
        }

        @Override // tb.ppq
        public void d(StreamRemoteMainResponse streamRemoteMainResponse, List<? extends AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34f4ab25", new Object[]{this, streamRemoteMainResponse, list});
            } else if (streamRemoteMainResponse != null) {
                try {
                    ub3.d("preRequestAPIStatus", "成功:" + this.f2215a, true, 0.01f);
                    byte[] bArr = streamRemoteMainResponse.getMtopStreamResponse().e;
                    JSONObject jSONObject = (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                    if (vav.b(c9x.CART_BIZ_NAME, "preDownloadTemplatesWhenPreRequest", true, true)) {
                        qa3.c(this.b, jSONObject);
                    }
                    if (vav.b(c9x.CART_BIZ_NAME, na3.sCacheFirstPageWhenPreRequest, false, true)) {
                        op6.h(this.b, bArr);
                    }
                    if (vav.b(c9x.CART_BIZ_NAME, na3.sLoadImageWhenPreRequest, false, true)) {
                        sb3.f(jSONObject.getJSONObject("data"));
                    }
                    oa3.e();
                } catch (Throwable th) {
                    xh8 c = xh8.a("Ultron").c("CartFirstPageRequestPreloader");
                    String message = th.getMessage();
                    if (message == null) {
                        message = "出错了";
                    }
                    f9v.q(c.message(message));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b extends wz<Boolean, StreamNextRpcRequest> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2216a;

        public b(String str) {
            this.f2216a = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$doPreload$2");
        }

        /* renamed from: b */
        public Boolean a(StreamNextRpcRequest streamNextRpcRequest) {
            boolean z = true;
            z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a74ded1e", new Object[]{this, streamNextRpcRequest});
            }
            if (streamNextRpcRequest != null) {
                try {
                } catch (Exception e) {
                    String message = e.getMessage();
                    ckf.d(message);
                    hav.b("CartFirstPageRequestPreloader", "预请求报错#", message);
                }
                if (streamNextRpcRequest.getMtopBusiness() != null) {
                    Map<String, String> map = streamNextRpcRequest.getMtopBusiness().request.dataParams;
                    if (map == null) {
                        hav.d("CartFirstPageRequestPreloader", "预请求比较#dataParams为空");
                        return Boolean.FALSE;
                    }
                    String str = map.get("exParams");
                    if (str == null) {
                        hav.d("CartFirstPageRequestPreloader", "预请求比较#exParams为空");
                        return Boolean.FALSE;
                    }
                    JSONObject parseObject = JSON.parseObject(str);
                    String string = parseObject.getString(RequestConfig.IS_ICART_IS_FIRST_REQUEST);
                    if (!ckf.b(parseObject.getString("instanceId"), this.f2216a) || !Boolean.parseBoolean(string)) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return Boolean.FALSE;
        }
    }

    @JvmStatic
    public static final void g(Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c124f172", new Object[]{activity, str, new Boolean(z), str2});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(str2, "scene");
        if (str != null) {
            try {
                if (!INSTANCE.i(activity, str, z, str2)) {
                    pav.m(true, new c(activity, str, z, str2));
                }
            } catch (Throwable th) {
                xh8 c2 = xh8.a("Ultron").c("CartFirstPageRequestPreloader");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c2.message(message));
            }
        }
    }

    public final MtopBusiness c(Activity activity, boolean z, String str) {
        String str2;
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("43ffea09", new Object[]{this, activity, new Boolean(z), str});
        }
        QueryParamsManager queryParamsManager = new QueryParamsManager(activity, activity.getIntent());
        b3o d = zs6.d(queryParamsManager.f());
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "preRequestOfClick";
        } else {
            str2 = z1x.PRE_REQUEST;
        }
        hashMap.put(str2, "true");
        Map<String, String> a2 = ib3.a(activity, queryParamsManager, str, hashMap);
        ckf.f(a2, "CartFirstQueryParamsBuil… customExParams\n        )");
        a2.put(RequestConfig.NO_CACHE_OF_FIRST_PAGE, "true");
        d.a(a2);
        MtopRequest mtopRequest = new MtopRequest();
        b = d.c();
        mtopRequest.setApiName(d.c());
        mtopRequest.setVersion(d.d());
        mtopRequest.setNeedSession(d.m());
        mtopRequest.setNeedEcode(d.l());
        Map<String, String> i = d.i();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(i);
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.dataParams = i;
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.setUnitStrategy("UNIT_TRADE");
        build.allowParseJson(true);
        if (d.n()) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        build.allowSwitchToPOST(d.k());
        build.setConnectionTimeoutMilliSecond(30000);
        if (d.o()) {
            build.useWua();
        }
        int e = d.e();
        if (-1 != e) {
            build.setBizId(e);
        }
        build.setBizId(c9x.CART_BIZ_NAME);
        if (!z || !vav.a(c9x.CART_BIZ_NAME, "setMtopTopicToFirstWhenClickToPreRequest", true)) {
            build.setBizTopic(na3.MTOP_TOPIC_QUERY_PRELOAD);
        } else {
            build.setBizTopic(na3.MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY);
        }
        String j = d.j();
        if (!TextUtils.isEmpty(j)) {
            build.setUnitStrategy(j);
        }
        Map<String, String> g = d.g();
        if (g != null) {
            build.headers(g);
        }
        return build;
    }

    public final void d(Activity activity, String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a3ddd", new Object[]{this, activity, str, new Boolean(z), str2});
            return;
        }
        lav.k(activity, c(activity, z, str), vc3.sStreamNextRpcServiceName, new a(str2, activity), new b(str));
        if (z) {
            str3 = "点击";
        } else {
            str3 = "闲时";
        }
        ub3.d(z1x.PRE_REQUEST, str3.concat("预请求"), true, 0.001f);
        hav.d("CartFirstPageRequestPreloader", "doPreLoad " + str2 + "#end");
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2395ddf2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "scene");
        String str2 = b;
        if (str2 != null) {
            f2213a.set(false);
            lav.l(c9x.CART_BIZ_NAME, str2);
            hav.g("CartFirstPageRequestPreloader", "重置状态:", str);
        }
    }

    public final boolean i(Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b94efd5", new Object[]{this, activity, str, new Boolean(z), str2})).booleanValue();
        }
        if (!ic3.c()) {
            hav.d("CartFirstPageRequestPreloader", "已经打开过购物车，跳过");
            return true;
        } else if (f2213a.getAndSet(true)) {
            hav.d("CartFirstPageRequestPreloader", "已经发起过了预请求，跳过");
            return true;
        } else if (!vav.a(c9x.CART_BIZ_NAME, "enablePrefetchFirstPageRequestV2", true)) {
            hav.d("CartFirstPageRequestPreloader", "开关关闭，不做预请求");
            return true;
        } else if (e(activity)) {
            return true;
        } else {
            if (Login.checkSessionValid()) {
                return false;
            }
            hav.d("CartFirstPageRequestPreloader", "未登录，暂停预请求，注册登录监听");
            f(activity, str, z, str2);
            return true;
        }
    }
}
