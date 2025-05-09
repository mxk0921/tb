package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.Globals;
import com.taobao.tao.common.ucp.UcpManager;
import com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yyj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_DEFAULT_CONFIG_JSON = "{\\\"newface_home_main\\\":{\\\"PullToRefresh\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"pullRefresh\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"pullRefresh\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"pullRefresh\\\"}}]}}],\\\"LoadCache\\\":[{\\\"actionName\\\":\\\"newface.loadCache\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"needSync\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}]}}],\\\"ColdStart\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"coldStart\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"coldStart\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"coldStart\\\"}}]}}],\\\"HotStart\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"hotStart\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"hotStart\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"hotStart\\\"}}]}}],\\\"PageBack\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"forceRequest\\\":\\\"@eventParam{forceRequest}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"pageBack\\\",\\\"checkDeltaExpire\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"itemId\\\":\\\"@eventParam{bizParam.itemId}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"switch.string\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@callbackParam{dataChangeType}\\\"},\\\"callback\\\":{\\\"base\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"pageBack\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\",\\\"requestType\\\":\\\"pageBack\\\"}}],\\\"delta\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"pageBack\\\"}}]}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"LocationChanged\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"locationChanged\\\",\\\"checkDeltaExpire\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"itemId\\\":\\\"@eventParam{bizParam.itemId}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"switch.string\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@callbackParam{dataChangeType}\\\"},\\\"callback\\\":{\\\"base\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"locationChanged\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\",\\\"requestType\\\":\\\"locationChanged\\\"}}],\\\"delta\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"locationChanged\\\"}}]}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"UserLogin\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"success\\\":\\\"false\\\"}}]}}],\\\"Preview\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"preview\\\",\\\"forceRequest\\\":\\\"true\\\",\\\"previewParam\\\":\\\"@eventParam{previewParam}\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"preview\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"preview\\\",\\\"success\\\":\\\"false\\\"}}]}}],\\\"EditionSwitch\\\":[{\\\"actionName\\\":\\\"newface.loadCache\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"needSync\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}]}},{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"success\\\":\\\"false\\\"}}]}}]},\\\"newface_home_main.loading\\\":{\\\"ViewClick\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]},\\\"newface_home_main.error\\\":{\\\"ViewClick\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"errorRetry\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]},\\\"newface_home_main.*.overlay\\\":{\\\"DeleteOperation\\\":[{\\\"actionName\\\":\\\"newface.dataDelete\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"deleteModel\\\":\\\"@eventParam{deleteModel}\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"dataChangeType\\\":\\\"delta\\\"}}]}}]},\\\"newface_home_main.*.video\\\":{\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"enqueue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}],\\\"ViewDisappear\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}},{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@eventParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"pause\\\"}}}}],\\\"VideoEndPlaying\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}},{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"enqueue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}],\\\"VideoErrorPlaying\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}]},\\\"newface_home_main.*\\\":{\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"switch.bool\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@eq{@newFaceItemLastIndex{@eventParam{containers}, '10'}, @eventParam{index}}\\\"},\\\"callback\\\":{\\\"true\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]}}]}}";
    public static final x4a i = new x4a(d());
    public static final x4a j = new x4a(d() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
    public static final x4a k = new x4a(d() + ".error");
    public static final x4a l = new x4a(d() + ".loading");
    public static final x4a m = new x4a(d() + ".*.overlay");
    public static final x4a n = new x4a(d() + ".*.dinamicX");

    /* renamed from: a  reason: collision with root package name */
    public boolean f32417a;
    public q4a b;
    public imn c;
    public final Object d;
    public nzj e;
    public imi f;
    public final ConcurrentHashMap<String, uqb> g;
    public wmn h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements UcpManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f32418a;
        public final /* synthetic */ String[] b;

        public a(yyj yyjVar, JSONObject jSONObject, String[] strArr) {
            this.f32418a = jSONObject;
            this.b = strArr;
        }

        @Override // com.taobao.tao.common.ucp.UcpManager.d
        public void a(UcpManager.FinishedType finishedType, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49d74cc6", new Object[]{this, finishedType, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uppParams", (Object) jSONObject);
            n5a.b(jSONObject2, this.f32418a);
            kmn.w("PageBack", yyj.i, this.b, jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements UcpManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f32419a;
        public final /* synthetic */ String[] b;

        public b(yyj yyjVar, JSONObject jSONObject, String[] strArr) {
            this.f32419a = jSONObject;
            this.b = strArr;
        }

        @Override // com.taobao.tao.common.ucp.UcpManager.d
        public void a(UcpManager.FinishedType finishedType, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49d74cc6", new Object[]{this, finishedType, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uppParams", (Object) jSONObject);
            n5a.b(jSONObject2, this.f32419a);
            kmn.w("ClickAiRefresh", yyj.i, this.b, jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yyj f32420a = new yyj(null);

        static {
            t2o.a(729809764);
        }

        public static /* synthetic */ yyj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yyj) ipChange.ipc$dispatch("4f522698", new Object[0]);
            }
            return f32420a;
        }
    }

    static {
        t2o.a(729809761);
        StringBuilder sb = new StringBuilder();
        sb.append(d());
        sb.append(".*.video");
    }

    public /* synthetic */ yyj(a aVar) {
        this();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcc83ca", new Object[0]);
        }
        return i2b.HOMEPAGE_NEWFACE;
    }

    public static yyj e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyj) ipChange.ipc$dispatch("fc1e6cf2", new Object[0]);
        }
        return c.a();
    }

    public static z4a l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("24262772", new Object[0]);
        }
        if (kbq.e(Globals.getApplication())) {
            return z4a.NEW_FACE_CHILD_INTL;
        }
        return z4a.NEW_FACE_CHILD;
    }

    public static boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8756687", new Object[]{str})).booleanValue();
        }
        if (str == null || e().o(str) || e().q(str)) {
            return true;
        }
        return false;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b11cf91b", new Object[0])).booleanValue();
        }
        return true;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4419d39a", new Object[]{this});
        } else {
            kmn.w("HomeTabAppear", i, new String[]{f(), k()}, null);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e852ff4", new Object[]{this});
        } else {
            kmn.w("HotStart", i, new String[]{f(), k()}, g());
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0d05eb", new Object[]{this});
        } else {
            D(null);
        }
    }

    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33ede65", new Object[]{this, jSONObject});
            return;
        }
        phg.b("triggerLoadCache");
        kmn.w("LoadCache", i, new String[]{f(), k()}, jSONObject);
        phg.a("triggerLoadCache");
    }

    public void E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56123742", new Object[]{this, jSONObject});
        } else {
            kmn.w("LocationChanged", i, new String[]{f(), k()}, jSONObject);
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a553417", new Object[]{this});
        } else {
            kmn.w("MultiTabSelect", i, new String[]{f(), k()}, null);
        }
    }

    public void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7e59be", new Object[]{this, jSONObject});
            return;
        }
        kmn.w("OnlyRequest", i, new String[]{k()}, n5a.b(jSONObject, g()));
    }

    public void H(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad27038a", new Object[]{this, strArr});
        } else {
            I(strArr, null);
        }
    }

    public void I(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d350a6", new Object[]{this, strArr, jSONObject});
        } else if (strArr != null && strArr.length != 0) {
            if (UcpManager.j().q()) {
                UcpManager.j().s(new a(this, jSONObject, strArr));
            } else {
                kmn.w("PageBack", i, strArr, jSONObject);
            }
        }
    }

    public void J(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5a9ae7", new Object[]{this, str, jSONObject});
        } else {
            kmn.w(str, i, new String[]{f(), k()}, jSONObject);
        }
    }

    public void K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba637259", new Object[]{this, jSONObject});
        } else {
            kmn.w("Preview", i, new String[]{f(), k()}, jSONObject);
        }
    }

    public void L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6826", new Object[]{this, jSONObject});
            return;
        }
        kmn.w("insertCard", i, new String[]{k()}, n5a.b(jSONObject, g()));
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1d3985", new Object[]{this});
        } else {
            N(null);
        }
    }

    public void N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d060b", new Object[]{this, jSONObject});
        } else {
            kmn.w("PullToRefresh", i, new String[]{f(), k()}, n5a.b(g(), jSONObject));
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c285753", new Object[]{this});
            return;
        }
        String[] strArr = {k()};
        JSONObject g = g();
        if (g == null) {
            g = new JSONObject();
        }
        kmn.w("RecbotRefresh", i, strArr, g);
    }

    public void P(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4440191c", new Object[]{this, str, jSONObject});
        } else {
            kmn.w(str, i, new String[]{f(), k()}, n5a.b(jSONObject, g()));
        }
    }

    public void Q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c38bbd", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        h(jSONObject);
        kmn.w("EditionSwitch", i, new String[]{f(), k()}, jSONObject);
    }

    public void R(boolean z, boolean z2, String str, String[] strArr) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f47ff", new Object[]{this, new Boolean(z), new Boolean(z2), str, strArr});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containers", (Object) strArr);
        jSONObject.put("requestType", (Object) str);
        if (z2) {
            str2 = "base";
        } else {
            str2 = "delta";
        }
        jSONObject.put("dataChangeType", (Object) str2);
        if (z) {
            str3 = "remote";
        } else {
            str3 = "local";
        }
        jSONObject.put("dataSourceType", (Object) str3);
        kmn.x("UIRefresh", i, jSONObject);
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78ac50d", new Object[]{this});
        } else {
            kmn.w("UserLogin", i, new String[]{f(), k()}, g());
        }
    }

    public uqb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqb) ipChange.ipc$dispatch("d0f3c4d0", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.g.get(str);
    }

    public String[] b(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8d9ab1d0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (obj = jSONObject.get("containers")) == null || !(obj instanceof String[])) {
            return null;
        }
        String[] strArr = (String[]) obj;
        if (strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    public imn c() {
        imn imnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("e7c3953e", new Object[]{this});
        }
        synchronized (this.d) {
            imnVar = this.c;
        }
        return imnVar;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("511cf14c", new Object[]{this});
        }
        if (kbq.e(Globals.getApplication())) {
            return z4a.NEW_FACE_PARENT_INTL.f32522a;
        }
        return z4a.NEW_FACE_PARENT.f32522a;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad1d8977", new Object[]{this});
        }
        if (!r()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(kmn.f22763a, (Object) Boolean.TRUE);
        return jSONObject;
    }

    public final void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab2779", new Object[]{this, jSONObject});
        } else if (jSONObject != null && r()) {
            jSONObject.put(kmn.f22763a, (Object) Boolean.TRUE);
        }
    }

    public synchronized wmn i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wmn) ipChange.ipc$dispatch("944a13aa", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new wmn();
        }
        return this.h;
    }

    public String j(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4c3eda1", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            if (o(str)) {
                return str;
            }
        }
        return strArr[0];
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ab0c627", new Object[]{this});
        }
        return l().f32522a;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d7b0f6", new Object[]{this});
            return;
        }
        z4a z4aVar = z4a.NEW_FACE_PARENT;
        s(z4aVar.f32522a, new dzh(z4aVar.f32522a));
        z4a z4aVar2 = z4a.NEW_FACE_CHILD;
        s(z4aVar2.f32522a, new b0i(z4aVar2.f32522a));
        z4a z4aVar3 = z4a.NEW_FACE_PARENT_INTL;
        s(z4aVar3.f32522a, new dzh(z4aVar3.f32522a));
        z4a z4aVar4 = z4a.NEW_FACE_CHILD_INTL;
        s(z4aVar4.f32522a, new bkf(z4aVar4.f32522a));
    }

    public boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9af55d3", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !str.startsWith(f())) {
            return false;
        }
        return true;
    }

    public boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8faaf0c0", new Object[]{this, str})).booleanValue();
        }
        return k().equals(str);
    }

    public boolean s(String str, uqb uqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76f1d797", new Object[]{this, str, uqbVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || uqbVar == null || this.g.put(str, uqbVar) == null) {
            return false;
        }
        return true;
    }

    public final void t(z4a z4aVar, imi imiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f322c336", new Object[]{this, z4aVar, imiVar});
        } else if (z4aVar != null && imiVar != null) {
            zza.h(z4aVar.f32522a, imiVar);
            zza.i(z4aVar.b, imiVar);
        }
    }

    public void u(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cebfb", new Object[]{this, imnVar});
            return;
        }
        synchronized (this.d) {
            this.c = imnVar;
        }
    }

    public void v(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b42c47b", new Object[]{this, strArr, jSONObject});
        } else if (strArr != null && strArr.length != 0) {
            if (UcpManager.j().q()) {
                UcpManager.j().s(new b(this, jSONObject, strArr));
            } else {
                kmn.w("ClickAiRefresh", i, strArr, jSONObject);
            }
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615a1e8d", new Object[]{this});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        phg.b("triggerColdStart");
        String[] strArr = {f(), k()};
        JSONObject g = g();
        if (g == null) {
            g = new JSONObject();
        }
        kmn.w("ColdStart", i, strArr, g);
        phg.a("triggerColdStart");
        uqa.b("NewFaceGatewayManager", "triggerColdStart", "requestTask cos Time :" + (SystemClock.uptimeMillis() - uptimeMillis));
    }

    public void y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd979b1", new Object[]{this, jSONObject});
        } else {
            kmn.w("DebugScan", i, new String[]{f(), k()}, jSONObject);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd2cf41", new Object[]{this});
        } else {
            kmn.w("EditionSwitch", i, new String[]{f(), k()}, g());
        }
    }

    public yyj() {
        this.d = new Object();
        this.g = new ConcurrentHashMap<>(2);
    }

    public void n(Context context, z4a z4aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b345f817", new Object[]{this, context, z4aVar, new Boolean(z)});
        } else if (this.f32417a) {
            t(z4aVar, this.f);
        } else {
            q4a.a(s5a.f(), context);
            try {
                String str = z4aVar.b;
                if (z) {
                    this.b = new q4a(str, new y4a(str, "gateway2/newface_gateway2.json", GATEWAY_DEFAULT_CONFIG_JSON, true).e());
                } else {
                    this.b = new q4a(str, "gateway2/newface_gateway2.json", GATEWAY_DEFAULT_CONFIG_JSON);
                }
                imi imiVar = new imi();
                this.f = imiVar;
                t(z4aVar, imiVar);
                this.b.d(this.f);
                synchronized (this.d) {
                    if (this.c == null) {
                        this.c = new imn(context, str);
                    }
                }
                zza.j(z4aVar.f32522a, this.c);
                this.e = new nzj();
                xzj xzjVar = new xzj();
                s2b.c().r(xzjVar);
                this.b.b(new azj(this.c), "newface.loadCache");
                this.b.b(new NewFaceDataProcessAction(this.c), "newface.dataProcess");
                this.b.b(new vzj(this.c, xzjVar), "newface.uiRefresh");
                this.b.b(new jzj(this.c, this.e), "newface.request");
                this.b.b(new pzj(this.c), "newface.scrollToPosition");
                this.b.b(new qzj(this.c, xzjVar), "newface.scrollToTop");
                this.b.b(new tzj(context), "newface.toastError");
                this.b.b(new uyj(this.c), "newface.dataDelete");
                this.b.b(new hzj(), "newface.playerQueue");
                this.b.b(new yzj(), "newface.widgetPostMsg");
                this.b.b(new uzj(), "newface.toast");
                this.b.c(new zyj(this.c), "newFaceItemLastIndex");
                zza.l(this.c);
                zza.m(this.f);
                this.f32417a = true;
            } catch (GatewayException e) {
                uqa.b("HomeGatewayLauncher", "NewFaceGatewayManager", "NewFace 网关初始化异常:" + e.getMessage());
            }
            m();
        }
    }

    public void w(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6485f2", new Object[]{this, jSONObject});
            return;
        }
        String f = e().f();
        if (this.c.q(f).ext.getBooleanValue("clickBack")) {
            JSONObject g = g();
            if (g == null) {
                g = new JSONObject();
            }
            String k2 = e().k();
            g.put("scrollPosition", (Object) Integer.valueOf(e().c().q(k2).infoFlowCardStartOffset));
            g.put("containerId", (Object) f);
            g.put("scrollPositionOffset", (Object) 2);
            kmn.w("ClickBack", i, new String[]{f, k2}, n5a.b(g, jSONObject));
        }
    }
}
