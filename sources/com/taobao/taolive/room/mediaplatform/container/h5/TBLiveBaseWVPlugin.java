package com.taobao.taolive.room.mediaplatform.container.h5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taolivecontainer.TBLiveH5Container;
import tb.bxg;
import tb.cwd;
import tb.fkx;
import tb.igq;
import tb.jnr;
import tb.kpw;
import tb.lbo;
import tb.mxf;
import tb.nsw;
import tb.nwg;
import tb.pg1;
import tb.rbu;
import tb.sj9;
import tb.t2o;
import tb.ux9;
import tb.v2s;
import tb.vx9;
import tb.zmr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveBaseWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private lbo mRetentionViewHelper = new lbo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13172a;
        public final /* synthetic */ String b;
        public final /* synthetic */ jnr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, jnr jnrVar) {
            super(str);
            this.f13172a = str2;
            this.b = str3;
            this.c = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/container/h5/TBLiveBaseWVPlugin$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nwg.d(this.f13172a, this.b);
            this.c.f();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f13173a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, WVCallBackContext wVCallBackContext, String str2) {
            super(str);
            this.f13173a = wVCallBackContext;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/container/h5/TBLiveBaseWVPlugin$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f13173a != null) {
                Object b = nwg.b(this.b);
                nsw nswVar = new nsw();
                nswVar.a(pg1.ATOM_values, b);
                nswVar.b("key", this.b);
                this.f13173a.success(nswVar);
            }
        }
    }

    static {
        t2o.a(779092978);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBaseWVPlugin tBLiveBaseWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/container/h5/TBLiveBaseWVPlugin");
    }

    private void sendLiveBroadCast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76ba594", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        intent.putExtra("force", "true");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    private void tlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{this, str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("BaseWVPlugin_" + str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        jnr jnrVar = new jnr(str, str2, wVCallBackContext);
        str.hashCode();
        String str4 = "";
        char c = 65535;
        switch (str.hashCode()) {
            case -1910655742:
                str3 = "reason";
                if (str.equals("readTaoLiveData")) {
                    c = 0;
                    break;
                }
                break;
            case -1828246403:
                str3 = "reason";
                if (str.equals("destroyLiveRoomController")) {
                    c = 1;
                    break;
                }
                break;
            case -1412554983:
                str3 = "reason";
                if (str.equals("writeTaoLiveData")) {
                    c = 2;
                    break;
                }
                break;
            case -1350704967:
                str3 = "reason";
                if (str.equals("openRetentionView")) {
                    c = 3;
                    break;
                }
                break;
            case -1237788857:
                str3 = "reason";
                if (str.equals("createRetentionView")) {
                    c = 4;
                    break;
                }
                break;
            case -645098549:
                str3 = "reason";
                if (str.equals("closeRetentionView")) {
                    c = 5;
                    break;
                }
                break;
            case -153529056:
                str3 = "reason";
                if (str.equals("UTShowExpose")) {
                    c = 6;
                    break;
                }
                break;
            case -23849236:
                str3 = "reason";
                if (str.equals("fetchTaskEntryLoaction")) {
                    c = 7;
                    break;
                }
                break;
            case 656954893:
                if (str.equals("commitInteractEvent")) {
                    str3 = "reason";
                    c = '\b';
                    break;
                }
                str3 = "reason";
                break;
            case 723633289:
                if (str.equals("UTControlClicked")) {
                    str3 = "reason";
                    c = '\t';
                    break;
                }
                str3 = "reason";
                break;
            case 1074044202:
                if (str.equals("commitAPMAlarm")) {
                    str3 = "reason";
                    c = '\n';
                    break;
                }
                str3 = "reason";
                break;
            case 1075999720:
                if (str.equals("commitAPMCount")) {
                    str3 = "reason";
                    c = 11;
                    break;
                }
                str3 = "reason";
                break;
            default:
                str3 = "reason";
                break;
        }
        switch (c) {
            case 0:
                tlog("readTaoLiveData", str2);
                Coordinator.postTask(new b("TBLiveBaseWVPlugin", wVCallBackContext, fkx.d(str2).getString("key")));
                return true;
            case 1:
                sendLiveBroadCast(this.mContext);
                return true;
            case 2:
                tlog("writeTaoLiveData", str2);
                JSONObject d = fkx.d(str2);
                Coordinator.postTask(new a("TBLiveBaseWVPlugin", d.getString("key"), d.getString(pg1.ATOM_values), jnrVar));
                return true;
            case 3:
                JSONObject d2 = fkx.d(str2);
                if (!d2.containsKey("hashCode") || !this.mRetentionViewHelper.g(d2.getString("hashCode"))) {
                    nsw nswVar = new nsw();
                    nswVar.b(str3, "展示失败");
                    jnrVar.d(nswVar);
                    return false;
                }
                jnrVar.f();
                return true;
            case 4:
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview.getContext() instanceof Activity) {
                    Activity activity = (Activity) webview.getContext();
                    JSONObject d3 = fkx.d(str2);
                    if (d3.containsKey("url")) {
                        String f = this.mRetentionViewHelper.f(activity, d3.getString("url"));
                        nsw nswVar2 = new nsw();
                        nswVar2.b("hashCode", f);
                        jnrVar.i(nswVar2);
                        return true;
                    }
                }
                jnrVar.b();
                return false;
            case 5:
                IWVWebView webview2 = wVCallBackContext.getWebview();
                JSONObject d4 = fkx.d(str2);
                boolean booleanValue = (d4 == null || d4.isEmpty()) ? true : d4.getBoolean("popLiveRoomPage").booleanValue();
                if (webview2 instanceof TBLiveH5Container) {
                    this.mRetentionViewHelper.e((TBLiveH5Container) webview2, booleanValue);
                    jnrVar.f();
                    return true;
                }
                IWVWebView iWVWebView = this.mWebView;
                if (!(iWVWebView instanceof WVUCWebView) || !(((WVUCWebView) iWVWebView).getExternalContext(zmr.TB_LIVE_THEMIS_CONTAINER) instanceof zmr)) {
                    nsw nswVar3 = new nsw();
                    nswVar3.b(str3, "WebView not instance of TBLiveH5Container!");
                    jnrVar.d(nswVar3);
                    return false;
                }
                this.mRetentionViewHelper.e((zmr) webview2, booleanValue);
                jnrVar.f();
                return true;
            case 6:
                tlog("UTShowExpose", str2);
                JSONObject d5 = fkx.d(str2);
                if (d5 != null) {
                    String string = d5.getString("arg1");
                    JSONObject jSONObject = d5.getJSONObject("args");
                    sj9.z(string, jSONObject);
                    rbu.c0(vx9.d(), string, mxf.b(jSONObject));
                    jnrVar.f();
                    return true;
                }
                jnrVar.c("parseObject fail");
                tlog("UTShowExpose", "parseObject fail");
                return false;
            case 7:
                nsw nswVar4 = new nsw();
                nswVar4.a("bottomRightEntryX", Integer.valueOf(bxg.f16701a));
                nswVar4.a("bottomRightEntryY", Integer.valueOf(bxg.b));
                jnrVar.i(nswVar4);
                return true;
            case '\b':
                tlog("commitInteractEvent", str2);
                jnrVar.f();
                return true;
            case '\t':
                tlog("UTControlClicked", str2);
                JSONObject d6 = fkx.d(str2);
                if (d6 != null) {
                    String string2 = d6.getString("arg1");
                    JSONObject jSONObject2 = d6.getJSONObject("args");
                    sj9.z(string2, jSONObject2);
                    ux9 d7 = vx9.d();
                    if (d7 != null && !jSONObject2.containsKey("liveComponentSession")) {
                        jSONObject2.put("liveComponentSession", (Object) d7.p());
                    }
                    rbu.L(d7, string2, mxf.a(jSONObject2));
                    jnrVar.f();
                    return true;
                }
                jnrVar.c("parseObject fail");
                tlog("UTControlClicked", "parseObject fail");
                return false;
            case '\n':
                tlog("commitAPMAlarm", str2);
                JSONObject d8 = fkx.d(str2);
                if (d8 != null) {
                    boolean booleanValue2 = d8.getBoolean("success").booleanValue();
                    String string3 = d8.getString("monitorPoint");
                    String string4 = d8.getString("errorCode");
                    String string5 = d8.getString("errorMsg");
                    JSONObject jSONObject3 = d8.getJSONObject("args");
                    if (jSONObject3 != null) {
                        str4 = jSONObject3.toJSONString();
                    }
                    if (booleanValue2) {
                        igq.n().e(string3, str4);
                    } else {
                        igq.n().c(string3, str4, string4, string5);
                    }
                    jnrVar.f();
                    return true;
                }
                jnrVar.c("parseObject fail");
                tlog("commitAPMAlarm", "parseObject fail");
                return false;
            case 11:
                tlog("commitAPMCount", str2);
                JSONObject d9 = fkx.d(str2);
                if (d9 != null) {
                    String string6 = d9.getString("monitorPoint");
                    JSONObject jSONObject4 = d9.getJSONObject("args");
                    if (jSONObject4 != null) {
                        str4 = jSONObject4.toJSONString();
                    }
                    igq.n().g(string6, str4, 1.0d);
                    jnrVar.f();
                    return true;
                }
                jnrVar.c("parseObject fail");
                tlog("commitAPMCount", "parseObject fail");
                return false;
            default:
                jnrVar.h(NO_FUNCTION);
                return true;
        }
    }
}
