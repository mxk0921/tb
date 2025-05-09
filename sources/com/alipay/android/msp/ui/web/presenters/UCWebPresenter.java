package com.alipay.android.msp.ui.web.presenters;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.results.H5PayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.contracts.MspWebContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.android.msp.ui.web.UCWebViewWindow;
import com.alipay.android.msp.ui.web.WebViewWindowStack;
import com.alipay.android.msp.ui.widget.SystemDefaultDialog;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.m.c.a;
import com.alipay.sdk.m.f.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.CookieManager;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.f7l;
import tb.h1p;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UCWebPresenter extends MspBasePresenter<MspWebContract.IView> implements MspWebContract.IPresenter<MspWebActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ResultReceiver d;
    public String f;
    public MspWebActivity g;
    public final int h;
    public final String j;
    public final boolean k;
    public final String o;
    public final boolean p;
    public final String q;
    public String r;
    public UCWebViewWindow b = null;
    public WebViewWindowStack c = null;
    public WebView e = null;
    public boolean i = false;
    public boolean l = false;
    public String m = null;
    public final String n = "javascript:window.AlipayJSBridge.callListener('h5BackAction','', 'back');";
    public final Map<String, MspWebActivity.WebStatsEvent> s = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.ui.web.presenters.UCWebPresenter$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass4 extends WebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4() {
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r6, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1171743094) {
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/web/presenters/UCWebPresenter$4");
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onReceivedSslError", String.valueOf(sslError));
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.4.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = UCWebPresenter.this.getActivity();
                    if (activity != null) {
                        SystemDefaultDialog.showDialog(activity, LanguageHelper.localizedStringForKey("msp_ssl_error", activity.getString(R.string.msp_ssl_error), new Object[0]), LanguageHelper.localizedStringForKey("flybird_exit", activity.getString(R.string.flybird_exit), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.4.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                sslErrorHandler.cancel();
                                dialogInterface.dismiss();
                                UCWebPresenter.this.getActivity().finish();
                            }
                        }, "", (DialogInterface.OnClickListener) null);
                    }
                }
            });
            if (mspContextByBizId != null) {
                StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                statisticInfo.addError(ErrorType.NETWORK, NetErrorException.Channel.WEB + "_sslerr", String.valueOf(sslError));
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onPageStarted", "url=".concat(String.valueOf(str)));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MspWebActivity.WebStatsEvent webStatsEvent = (MspWebActivity.WebStatsEvent) UCWebPresenter.access$900(UCWebPresenter.this).get(str);
            if (webStatsEvent != null) {
                webStatsEvent.startLoadUrlTime = elapsedRealtime;
            }
            UCWebPresenter.access$1002(UCWebPresenter.this, false);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onReceivedError", "failingUrl=" + str2 + "， description=" + str);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
            UCWebPresenter.access$1002(UCWebPresenter.this, true);
            if (mspContextByBizId != null) {
                StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                StringBuilder sb = new StringBuilder();
                NetErrorException.Channel channel = NetErrorException.Channel.WEB;
                sb.append(String.valueOf(channel));
                sb.append("_");
                sb.append(i);
                statisticInfo.addError(ErrorType.DEFAULT, sb.toString(), str2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("failingUrl", (Object) str2);
                jSONObject.put("description", (Object) str);
                AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_WEB_EXCEPTION, channel + "_" + i, jSONObject.toJSONString(), null, null);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
                    jSONObject2.put("failingUrl", (Object) str2);
                    jSONObject2.put("description", (Object) str);
                    Utils.postNotification(mspContextByBizId.getContext(), "MQPWebErr", jSONObject2, UCWebPresenter.access$000(UCWebPresenter.this));
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            try {
                LogUtil.record(2, "UCWebPresenter:onPageFinished", "url=".concat(String.valueOf(str)));
                webView.loadUrl("javascript:window.prompt('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');javascript:" + UCWebPresenter.access$1400(UCWebPresenter.this) + "javascript:window.AlipayJSBridge.callListener('h5PageFinished','', '');");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                MspWebActivity.WebStatsEvent webStatsEvent = (MspWebActivity.WebStatsEvent) UCWebPresenter.access$900(UCWebPresenter.this).get(str);
                if (webStatsEvent != null) {
                    long j = elapsedRealtime - webStatsEvent.startLoadUrlTime;
                    StEvent stEvent = webStatsEvent.stEvent;
                    if (stEvent != null) {
                        stEvent.updateEventTime();
                        webStatsEvent.stEvent.onStatistic(StEvent.FILL_DATE_TIME, String.valueOf(j));
                    }
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
                    if (!(UCWebPresenter.access$000(UCWebPresenter.this) == -1 || mspContextByBizId == null)) {
                        mspContextByBizId.getStatisticInfo().addEvent(webStatsEvent.stEvent);
                        UCWebPresenter.access$900(UCWebPresenter.this).remove(str);
                        String host = URI.create(str).getHost();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("host", (Object) host);
                        jSONObject.put(z9u.KEY_LOAD_TIME, (Object) Long.valueOf(j));
                        AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_OPEN_WEB, "end", jSONObject.toJSONString(), "", "");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", (Object) str);
                        jSONObject2.put(z9u.KEY_LOAD_TIME, (Object) Long.valueOf(j));
                        Utils.postNotification(mspContextByBizId.getContext(), "MQP_WEBVIEW_FIRST_LOADED", jSONObject2, UCWebPresenter.access$000(UCWebPresenter.this));
                    }
                }
                if (UCWebPresenter.access$1000(UCWebPresenter.this)) {
                    UCWebPresenter.access$200(UCWebPresenter.this).setVisibility(4);
                    UCWebPresenter.access$100(UCWebPresenter.this).showReFreshView(false);
                    return;
                }
                UCWebPresenter.access$200(UCWebPresenter.this).setVisibility(0);
                UCWebPresenter.access$100(UCWebPresenter.this).showReFreshView(true);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            LogUtil.record(2, "UCWebPresenter:shouldOverrideUrlLoading", "url=" + str + ", mExitUrl=" + UCWebPresenter.access$1100(UCWebPresenter.this) + " , mbizid=" + UCWebPresenter.access$000(UCWebPresenter.this));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (!TextUtils.isEmpty(UCWebPresenter.access$1100(UCWebPresenter.this)) && str.startsWith(UCWebPresenter.access$1100(UCWebPresenter.this))) {
                UCWebPresenter.access$600(UCWebPresenter.this, true);
            } else if (!TextUtils.isEmpty(UCWebPresenter.access$1100(UCWebPresenter.this)) && str.contains(UCWebPresenter.access$1100(UCWebPresenter.this))) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
                if (mspContextByBizId != null) {
                    mspContextByBizId.setCallbackUrlForOpenWeb(str);
                }
                UCWebPresenter.access$600(UCWebPresenter.this, true);
            } else if (str.startsWith(c.l)) {
                try {
                    str2 = URLDecoder.decode(str, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    UCWebPresenter.access$300(UCWebPresenter.this, "jsapi", str2.substring(17));
                }
                UCWebPresenter.access$1200(UCWebPresenter.this, str);
            } else if (TextUtils.equals(str, a.d)) {
                UCWebPresenter.access$600(UCWebPresenter.this, false);
            } else if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
                if (!TextUtils.isEmpty(str)) {
                    MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
                    webStatsEvent.stEvent = UCWebPresenter.newStEvent("webonload", UCWebPresenter.access$1300(UCWebPresenter.this, str));
                    UCWebPresenter.access$900(UCWebPresenter.this).put(str, webStatsEvent);
                    MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
                    if (mspContextByBizId2 != null) {
                        try {
                            str = URI.create(str).getHost();
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("host", (Object) str);
                        AlertIntelligenceEngine.startAction(mspContextByBizId2, AlertIntelligenceEngine.ACTION_OPEN_WEB, "start", jSONObject.toJSONString(), "", "");
                    }
                }
                return false;
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    UCWebPresenter.this.getActivity().startActivity(intent);
                } catch (Exception e2) {
                    LogUtil.printExceptionStackTrace(e2);
                }
            }
            return true;
        }
    }

    public UCWebPresenter(int i, boolean z, String str, String str2, boolean z2, String str3, ResultReceiver resultReceiver, String str4, Context context) {
        this.h = i;
        this.k = z;
        this.j = str3;
        this.o = str2;
        this.d = resultReceiver;
        this.p = z2;
        this.q = str4;
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9d86300", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 20) {
            str2 = str.substring(0, 19);
        } else {
            str2 = str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                return parse.getPath();
            }
            return str2;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return str2;
        }
    }

    public static /* synthetic */ int access$000(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("206b6411", new Object[]{uCWebPresenter})).intValue();
        }
        return uCWebPresenter.h;
    }

    public static /* synthetic */ UCWebViewWindow access$100(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCWebViewWindow) ipChange.ipc$dispatch("ac5317ad", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.b;
    }

    public static /* synthetic */ boolean access$1000(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c655d3", new Object[]{uCWebPresenter})).booleanValue();
        }
        return uCWebPresenter.i;
    }

    public static /* synthetic */ boolean access$1002(UCWebPresenter uCWebPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c241f6b", new Object[]{uCWebPresenter, new Boolean(z)})).booleanValue();
        }
        uCWebPresenter.i = z;
        return z;
    }

    public static /* synthetic */ UCWebViewWindow access$102(UCWebPresenter uCWebPresenter, UCWebViewWindow uCWebViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCWebViewWindow) ipChange.ipc$dispatch("9ab65e15", new Object[]{uCWebPresenter, uCWebViewWindow});
        }
        uCWebPresenter.b = uCWebViewWindow;
        return uCWebViewWindow;
    }

    public static /* synthetic */ String access$1100(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecb76cb2", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.q;
    }

    public static /* synthetic */ String access$1300(UCWebPresenter uCWebPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0e71f2a", new Object[]{uCWebPresenter, str});
        }
        return a(str);
    }

    public static /* synthetic */ String access$1400(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e236eb5", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.f;
    }

    public static /* synthetic */ void access$1500(UCWebPresenter uCWebPresenter, final String str, final ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966b013a", new Object[]{uCWebPresenter, str, valueCallback});
        } else if (!TextUtils.isEmpty(str) && uCWebPresenter.getActivity() != null && !uCWebPresenter.getActivity().isFinishing()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (UCWebPresenter.access$200(UCWebPresenter.this) != null) {
                            UCWebPresenter.access$200(UCWebPresenter.this).evaluateJavascript(str, valueCallback);
                        }
                    } catch (Throwable th) {
                        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
                        if (mspContextByBizId != null) {
                            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.MSP_WEB_JS_ERROR, th.getClass().getSimpleName());
                        }
                    }
                }
            });
        }
    }

    public static /* synthetic */ boolean access$1600(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da0c6d0d", new Object[]{uCWebPresenter})).booleanValue();
        }
        return uCWebPresenter.p;
    }

    public static /* synthetic */ void access$1700(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586d70e8", new Object[]{uCWebPresenter});
        } else {
            uCWebPresenter.c();
        }
    }

    public static /* synthetic */ String access$1800(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1008c6b9", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.n;
    }

    public static /* synthetic */ void access$1900(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552f78a6", new Object[]{uCWebPresenter});
        } else {
            uCWebPresenter.e();
        }
    }

    public static /* synthetic */ WebView access$200(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("84e4ee66", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.e;
    }

    public static /* synthetic */ void access$300(UCWebPresenter uCWebPresenter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3da34f", new Object[]{uCWebPresenter, str, str2});
        } else {
            uCWebPresenter.g(str, str2);
        }
    }

    public static /* synthetic */ WebViewWindowStack access$400(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebViewWindowStack) ipChange.ipc$dispatch("8bc5ab2", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.c;
    }

    public static /* synthetic */ void access$500(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98507779", new Object[]{uCWebPresenter});
        } else if (uCWebPresenter.c != null) {
            LogUtil.record(2, "UCwebPresenter:doJsPopWindow", "mbizId=" + uCWebPresenter.h + " ,webview=" + uCWebPresenter.e);
            UCWebViewWindow uCWebViewWindow = (UCWebViewWindow) uCWebPresenter.c.popJsWebViewWindow();
            uCWebPresenter.b.setAnimation(AnimationUtils.loadAnimation(uCWebPresenter.getActivity(), R.anim.alipay_right_out));
            if (uCWebPresenter.getIView() != null) {
                uCWebPresenter.getIView().removeViewFromMainLayout(uCWebPresenter.b);
            }
            uCWebPresenter.b.destroy();
            if (uCWebPresenter.getIView() != null) {
                uCWebPresenter.getIView().addViewToMainLayout(uCWebViewWindow);
            }
            uCWebPresenter.b = uCWebViewWindow;
            uCWebPresenter.e();
        }
    }

    public static /* synthetic */ void access$600(UCWebPresenter uCWebPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7ea27c", new Object[]{uCWebPresenter, new Boolean(z)});
        } else {
            uCWebPresenter.d(z);
        }
    }

    public static /* synthetic */ MspWebActivity access$700(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWebActivity) ipChange.ipc$dispatch("60671095", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.g;
    }

    public static /* synthetic */ String access$800(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b566404a", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.o;
    }

    public static /* synthetic */ Map access$900(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d20c86a", new Object[]{uCWebPresenter});
        }
        return uCWebPresenter.s;
    }

    public static void addStEventForBizId(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f2ebd3", new Object[]{new Integer(i), str, str2});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (i != -1 && mspContextByBizId != null) {
            mspContextByBizId.getStatisticInfo().addEvent(newStEvent(str, str2));
        }
    }

    public static /* synthetic */ Object ipc$super(UCWebPresenter uCWebPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/web/presenters/UCWebPresenter");
    }

    public static StEvent newStEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("12c27a75", new Object[]{str, str2});
        }
        return new StEvent("webview", str, Utils.truncateString(str2, 30));
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void attachIView(MspWebContract.IView iView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf38116c", new Object[]{this, iView});
        } else {
            this.g = (MspWebActivity) iView;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[]{this});
            return;
        }
        WebView webView = this.e;
        if (webView != null) {
            webView.evaluateJavascript("javascript:alipayjsbridgeH5BackAction()", new ValueCallback<String>() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if ("true".equals(str)) {
                        UCWebPresenter.access$300(UCWebPresenter.this, "click", "webonback");
                    } else if (UCWebPresenter.this.getIView() != null && UCWebPresenter.this.getActivity() != null && !UCWebPresenter.this.getActivity().isFinishing()) {
                        if (UCWebPresenter.access$400(UCWebPresenter.this) != null && !UCWebPresenter.access$400(UCWebPresenter.this).isEmpty()) {
                            UCWebPresenter.access$500(UCWebPresenter.this);
                        } else if (UCWebPresenter.access$1600(UCWebPresenter.this)) {
                            if (UCWebPresenter.this.getActivity() == null || UCWebPresenter.this.getActivity().isFinishing()) {
                                LogUtil.record(8, "UCWebPresenter:doJsOnBack", "unexpected point 2");
                                return;
                            }
                            UCWebPresenter.access$300(UCWebPresenter.this, "click", "webgoback");
                            UCWebPresenter.this.getActivity().finish();
                        } else if (UCWebPresenter.access$200(UCWebPresenter.this) == null || !UCWebPresenter.access$200(UCWebPresenter.this).canGoBack()) {
                            UCWebPresenter.access$300(UCWebPresenter.this, "click", "webonexit");
                            UCWebPresenter.access$600(UCWebPresenter.this, false);
                        } else {
                            UCWebPresenter.access$300(UCWebPresenter.this, "click", "webgoback");
                            UCWebPresenter.access$200(UCWebPresenter.this).goBack();
                        }
                    }
                }
            });
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        getActivity().finish();
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void detachIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98beade2", new Object[]{this});
        } else if (this.g != null) {
            this.g = null;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.e = this.b.getWebView();
        LogUtil.record(2, "UCWebPresenter:initView", "webview=" + this.e);
        if (this.e != null) {
            if (getIView() != null) {
                getIView().initUI(this.b);
            }
            this.e.setWebChromeClient(new WebChromeClient() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r3, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1540056808) {
                        super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else if (hashCode == -634514222) {
                        return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/web/presenters/UCWebPresenter$3");
                    }
                }

                @Override // com.uc.webview.export.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
                    }
                    return super.onConsoleMessage(consoleMessage);
                }

                @Override // com.uc.webview.export.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                        return;
                    }
                    if (UCWebPresenter.this.getIView() != null) {
                        UCWebPresenter.this.getIView().setProgressVisibility(i);
                    }
                    super.onProgressChanged(webView, i);
                }

                @Override // com.uc.webview.export.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                        return;
                    }
                    try {
                        if (UCWebPresenter.access$700(UCWebPresenter.this) != null && webView != null && webView.getUrl() != null && !webView.getUrl().endsWith(str) && TextUtils.isEmpty(UCWebPresenter.access$800(UCWebPresenter.this))) {
                            LogUtil.record(2, "UCWebPresenter#onReceivedTitle", str);
                            UCWebPresenter.access$100(UCWebPresenter.this).getTitleView().setText(str);
                        }
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }

                @Override // com.uc.webview.export.WebChromeClient
                public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
                    }
                    LogUtil.record(2, "UCWebPresenter:onJsPrompt", "url=" + str + ", message=" + str2);
                    if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                        str2.indexOf("-->", str2.indexOf("sdk_result_code:"));
                        UCWebPresenter.this.getActivity().finish();
                    }
                    jsPromptResult.cancel();
                    return true;
                }
            });
            this.e.setWebViewClient(new AnonymousClass4());
        }
    }

    public final void f(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd59bc89", new Object[]{this, str, str2});
            return;
        }
        try {
            final UCWebViewWindow uCWebViewWindow = new UCWebViewWindow(getActivity());
            uCWebViewWindow.init(this.k, "", this.r);
            if (this.c == null) {
                this.c = new WebViewWindowStack();
            }
            this.c.pushJsWebViewWindow(this.b);
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.alipay_right_in);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    if (UCWebPresenter.this.getIView() != null) {
                        UCWebPresenter.this.getIView().removeViewFromMainLayout(UCWebPresenter.access$100(UCWebPresenter.this));
                    }
                    UCWebPresenter.access$102(UCWebPresenter.this, uCWebViewWindow);
                    UCWebPresenter.access$1900(UCWebPresenter.this);
                    LogUtil.record(2, "UCWebPresenter:doJsPushWindow", "newurl=" + str);
                    if (!TextUtils.isEmpty(str)) {
                        MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
                        webStatsEvent.stEvent = UCWebPresenter.newStEvent("webonload", UCWebPresenter.access$1300(UCWebPresenter.this, str));
                        UCWebPresenter.access$900(UCWebPresenter.this).put(str, webStatsEvent);
                    }
                    UCWebPresenter.access$200(UCWebPresenter.this).loadUrl(str);
                    if (!TextUtils.isEmpty(str2) && UCWebPresenter.this.getIView() != null) {
                        UCWebPresenter.this.getIView().setTitleText(str2);
                    }
                }
            });
            uCWebViewWindow.setAnimation(loadAnimation);
            if (getIView() != null) {
                getIView().addViewToMainLayout(uCWebViewWindow);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f9e78a", new Object[]{this, str, str2});
        } else {
            addStEventForBizId(this.h, str, str2);
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        if (getIView() != null) {
            return getIView();
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.h;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void notifyCaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e9dabb", new Object[]{this});
        } else if (this.d != null) {
            this.d.send(0, H5PayResult.toBundle(this.l, this.m));
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            return;
        }
        LogUtil.record(2, "UCwebPresenter:onBack", "mbizId=" + this.h + " ,webview=" + this.e);
        WebView webView = this.e;
        if (webView != null) {
            webView.evaluateJavascript("javascript:window.AlipayJSBridge.hasListener('h5BackAction')", new ValueCallback<String>() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if (!"true".equals(str)) {
                        if (UCWebPresenter.access$200(UCWebPresenter.this) != null) {
                            UCWebPresenter.access$1700(UCWebPresenter.this);
                        }
                    } else if (UCWebPresenter.access$200(UCWebPresenter.this) != null) {
                        UCWebPresenter.access$300(UCWebPresenter.this, "click", "webonback");
                        UCWebPresenter.access$200(UCWebPresenter.this).evaluateJavascript(UCWebPresenter.access$1800(UCWebPresenter.this), null);
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LogUtil.record(2, "UCWebview:onDestroy", "webview=" + this.e);
        WebView webView = this.e;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.e.removeAllViews();
            if (this.e.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            this.e.destroy();
            this.e = null;
        }
        WebViewWindowStack webViewWindowStack = this.c;
        if (webViewWindowStack != null && !webViewWindowStack.isEmpty()) {
            this.c.destroy();
            this.c = null;
        }
        if (this.k) {
            notifyCaller();
        }
        ((ConcurrentHashMap) this.s).clear();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void pushWebviewWindow(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3d476a", new Object[]{this, str, str2});
        } else {
            f(str, str2);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void setWebViewUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4010052a", new Object[]{this});
            return;
        }
        String str = this.e.getSettings().getUserAgentString() + " AlipaySDK(" + getActivity().getPackageName() + "/" + GlobalHelper.getInstance().getPackageVersion() + "/" + GlobalSdkConstant.getMspVersion() + f7l.BRACKET_END_STR;
        if (!str.contains("Language/")) {
            str = str + " Language/" + Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes()));
        }
        this.e.getSettings().setUserAgentString(str);
    }

    public final String b() {
        InputStream inputStream;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b06b64d", new Object[]{this});
        }
        try {
            inputStream = getActivity().getAssets().open("mspjs_v2.js");
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        if (inputStream == null) {
            LogUtil.record(2, "UCWebPresenter:getDefaultJs", "failed to open js file, see previous stack trace");
            return "";
        }
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                i = inputStream.read(bArr);
            } catch (IOException e2) {
                e2.printStackTrace();
                i = 0;
            }
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                try {
                    break;
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public UCWebViewWindow getJsWebViewWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UCWebViewWindow) ipChange.ipc$dispatch("80f2f8a1", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void initWebUI(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e87cadd", new Object[]{this, str, str2, str3});
            return;
        }
        LogUtil.record(2, "UCWebPresenter:initWebUI", "url=" + str3 + ", method=" + str);
        e();
        setWebViewUA();
        MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
        webStatsEvent.stEvent = newStEvent("webonload", a(str3));
        if (str3 != null) {
            ((ConcurrentHashMap) this.s).put(str3, webStatsEvent);
        }
        if (TextUtils.isEmpty(str)) {
            this.e.loadUrl(str3);
            return;
        }
        if (str.equals("GET")) {
            this.e.loadUrl(str3);
        }
        if (str.equals("POST")) {
            try {
                this.e.postUrl(str3, str2.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void access$1200(UCWebPresenter uCWebPresenter, String str) {
        char c;
        JSONObject jSONObject;
        char c2 = 65535;
        int i = 4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da81e17", new Object[]{uCWebPresenter, str});
            return;
        }
        Uri parse = Uri.parse(str);
        String authority = parse.getAuthority();
        authority.hashCode();
        switch (authority.hashCode()) {
            case -1873243140:
                if (authority.equals("onRefresh")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1013481626:
                if (authority.equals("onBack")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1013369955:
                if (authority.equals("onExit")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -794464810:
                if (authority.equals("showBackButton")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -139887495:
                if (authority.equals("callNativeFunc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1300890510:
                if (authority.equals("onLoadJs")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1405084438:
                if (authority.equals("setTitle")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                uCWebPresenter.e.reload();
                return;
            case 1:
                uCWebPresenter.onBack();
                return;
            case 2:
                uCWebPresenter.m = parse.getQueryParameter("result");
                uCWebPresenter.d(TextUtils.equals("true", parse.getQueryParameter("bsucc")));
                return;
            case 3:
                if (parse.getQueryParameterNames().contains("bshow")) {
                    boolean equals = TextUtils.equals("true", parse.getQueryParameter("bshow"));
                    View backView = uCWebPresenter.b.getBackView();
                    if (equals) {
                        i = 0;
                    }
                    backView.setVisibility(i);
                    return;
                }
                return;
            case 4:
                String queryParameter = parse.getQueryParameter("func");
                final String queryParameter2 = parse.getQueryParameter("cbId");
                try {
                    jSONObject = JSON.parseObject(parse.getQueryParameter("data"));
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                queryParameter.hashCode();
                switch (queryParameter.hashCode()) {
                    case 3015911:
                        if (queryParameter.equals("back")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3127582:
                        if (queryParameter.equals("exit")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 110371416:
                        if (queryParameter.equals("title")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 459033919:
                        if (queryParameter.equals("h5JsFuncCallback")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1085444827:
                        if (queryParameter.equals("refresh")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1643599610:
                        if (queryParameter.equals(MspWebActivity.V2_FUNCTION_AUTOLOGIN)) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1703426986:
                        if (queryParameter.equals("pushWindow")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1906413305:
                        if (queryParameter.equals("backButton")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 2033767917:
                        if (queryParameter.equals("refreshButton")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        uCWebPresenter.onBack();
                        return;
                    case 1:
                        uCWebPresenter.m = jSONObject.getString("result");
                        uCWebPresenter.d(jSONObject.getBooleanValue("success"));
                        return;
                    case 2:
                        if (jSONObject.containsKey("title") && uCWebPresenter.getIView() != null) {
                            uCWebPresenter.getIView().setTitleText(jSONObject.getString("title"));
                            return;
                        }
                        return;
                    case 3:
                        if (TextUtils.equals(queryParameter2, "back") && TextUtils.equals(jSONObject.getString("success"), "fail")) {
                            uCWebPresenter.c();
                            return;
                        }
                        return;
                    case 4:
                        uCWebPresenter.e.reload();
                        return;
                    case 5:
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.5
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    boolean autoLogin = PhoneCashierMspEngine.getMspWallet().autoLogin(UCWebPresenter.access$000(UCWebPresenter.this));
                                    UCWebPresenter.access$1500(UCWebPresenter.this, "javascript:window.AlipayJSBridge.callBackFromNativeFunc('" + queryParameter2 + "','" + autoLogin + "')", null);
                                }
                            });
                            return;
                        }
                        return;
                    case 6:
                        if (jSONObject.getString("url") != null) {
                            uCWebPresenter.f(jSONObject.getString("url"), jSONObject.getString("title"));
                            return;
                        }
                        return;
                    case 7:
                        if (jSONObject.containsKey("show")) {
                            z = jSONObject.getBoolean("show").booleanValue();
                        }
                        View backView2 = uCWebPresenter.b.getBackView();
                        if (z) {
                            i = 0;
                        }
                        backView2.setVisibility(i);
                        return;
                    case '\b':
                        if (jSONObject.containsKey("show")) {
                            z = jSONObject.getBoolean("show").booleanValue();
                        }
                        uCWebPresenter.b.showReFreshView(z);
                        return;
                    default:
                        return;
                }
            case 5:
                WebView webView = uCWebPresenter.e;
                webView.loadUrl("javascript:" + uCWebPresenter.f);
                return;
            case 6:
                uCWebPresenter.b.getTitleView().setText(parse.getQueryParameter("title"));
                return;
            default:
                return;
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public MspWebActivity getIView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWebActivity) ipChange.ipc$dispatch("d134954d", new Object[]{this}) : this.g;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public boolean init(boolean z, String str, String str2, final int i, String str3, JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56448ac0", new Object[]{this, new Boolean(z), str, str2, new Integer(i), str3, jSONObject, jSONObject2})).booleanValue();
        }
        LogUtil.record(2, "UCWebPresenter:init", "url=".concat(String.valueOf(str)));
        try {
            this.f = b();
            this.r = str3;
            UCWebViewWindow uCWebViewWindow = new UCWebViewWindow(getActivity());
            this.b = uCWebViewWindow;
            uCWebViewWindow.init(z, str2, str3);
            final Activity activity = getActivity();
            final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.h);
            if (!(jSONObject2 == null || activity == null)) {
                this.b.showTip(jSONObject2.getString("icon"), jSONObject2.getString("text"), new View.OnClickListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Utils.postNotification(activity, "MQP_LOC_H5_TIP_ACTION_NOTIFY", new JSONObject(), UCWebPresenter.access$000(UCWebPresenter.this));
                        if (mspContextByBizId != null && jSONObject2.containsKey("action")) {
                            ActionsCreator.get(mspContextByBizId).createDialogEventAction(jSONObject2.getJSONObject("action").toJSONString());
                        }
                    }
                });
            }
            this.b.setBackAction(jSONObject);
            if (!TextUtils.isEmpty(this.j)) {
                CookieSyncManager.createInstance(getActivity()).sync();
                CookieManager.getInstance().setCookie(str, this.j);
                CookieSyncManager.getInstance().sync();
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MspBasePresenter mspBasePresenter;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LogUtil.record(2, "UCWebPresenter:showWebview", "bizid=" + UCWebPresenter.access$000(UCWebPresenter.this));
                        if (UCWebPresenter.this.getIView() != null && !UCWebPresenter.this.getActivity().isFinishing()) {
                            MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.access$000(UCWebPresenter.this));
                            if (!(mspContextByBizId2 == null || i <= 0 || (mspBasePresenter = mspContextByBizId2.getMspBasePresenter()) == null || mspBasePresenter.getIView() == null)) {
                                LogUtil.record(2, "UCWebPresenter:showWebview", "stopLoadingView");
                                mspBasePresenter.getIView().stopLoadingView();
                            }
                            UCWebPresenter.this.getIView().addViewToMainLayout(UCWebPresenter.access$100(UCWebPresenter.this));
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            }, i);
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }
}
