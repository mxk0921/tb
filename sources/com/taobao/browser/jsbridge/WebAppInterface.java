package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.core.content.pm.ShortcutManagerCompat;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gsp;
import tb.iqw;
import tb.jjx;
import tb.jqw;
import tb.jup;
import tb.kpw;
import tb.kqw;
import tb.lqw;
import tb.m7r;
import tb.nsw;
import tb.psp;
import tb.qsp;
import tb.t2o;
import tb.ttp;
import tb.v7t;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WebAppInterface extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = WebAppInterface.class.getSimpleName();
    private Handler mHandler;
    private PageStartWVEventListener pageStartWVEventListener;
    private boolean mAutoHideMenuRightItem = false;
    private boolean mAutoHideMenuSecondRightItem = false;
    private boolean mAutoHideMenuMoreItem = false;
    private boolean mAutoHideShortCut = false;
    private boolean mAutoShowNavbar = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class PageStartWVEventListener implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<WebAppInterface> webAppInterfaceWeakReference;

        static {
            t2o.a(619708553);
            t2o.a(989856388);
        }

        public PageStartWVEventListener(WebAppInterface webAppInterface) {
            this.webAppInterfaceWeakReference = new WeakReference<>(webAppInterface);
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            WeakReference<WebAppInterface> weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            if (i != 1001 || (weakReference = this.webAppInterfaceWeakReference) == null) {
                return null;
            }
            WebAppInterface webAppInterface = weakReference.get();
            if (webAppInterface != null) {
                WebAppInterface.access$000(webAppInterface);
                return null;
            } else if (!v7t.h()) {
                return null;
            } else {
                v7t.i("WebAppInterface", "webAppInterfaceWeakReference is free");
                return null;
            }
        }
    }

    static {
        t2o.a(619708535);
    }

    public static /* synthetic */ void access$000(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95220e1", new Object[]{webAppInterface});
        } else {
            webAppInterface.tryAutoResetItem();
        }
    }

    public static /* synthetic */ Context access$100(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fd895a38", new Object[]{webAppInterface});
        }
        return webAppInterface.mContext;
    }

    public static /* synthetic */ Handler access$200(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("aca25ec7", new Object[]{webAppInterface});
        }
        return webAppInterface.mHandler;
    }

    public static /* synthetic */ boolean access$300(WebAppInterface webAppInterface, Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ad5a54", new Object[]{webAppInterface, context, str, str2, bitmap})).booleanValue();
        }
        return webAppInterface.createShortCutApi26(context, str, str2, bitmap);
    }

    public static /* synthetic */ boolean access$400(WebAppInterface webAppInterface, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd9ed119", new Object[]{webAppInterface, context, str})).booleanValue();
        }
        return webAppInterface.isShortCutOnDesktopApi26(context, str);
    }

    public static /* synthetic */ Context access$500(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5e60fb4", new Object[]{webAppInterface});
        }
        return webAppInterface.mContext;
    }

    private void cancelLoadingView(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82790575", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = m7r.HIDE_LOADING_DIALOG;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error("mHandler==null");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error(th.toString());
        }
    }

    private boolean createShortCutApi26(Context context, String str, String str2, Bitmap bitmap) {
        Object systemService;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        boolean requestPinShortcut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59d414d9", new Object[]{this, context, str, str2, bitmap})).booleanValue();
        }
        try {
            systemService = context.getSystemService(ttp.a());
            ShortcutManager a2 = jup.a(systemService);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(context.getPackageName());
            intent2.setData(Uri.parse(str));
            qsp.a();
            shortLabel = psp.a(context, str2).setShortLabel(str2);
            longLabel = shortLabel.setLongLabel(str2);
            createWithBitmap = Icon.createWithBitmap(bitmap);
            icon = longLabel.setIcon(createWithBitmap);
            intent = icon.setIntent(intent2);
            build = intent.build();
            requestPinShortcut = a2.requestPinShortcut(build, null);
            return requestPinShortcut;
        } catch (Exception e) {
            v7t.d("WebAppInterface", "createShortCutApi26: failed, reason:" + e);
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(WebAppInterface webAppInterface, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/WebAppInterface");
        }
    }

    private void tryAutoResetItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d949129f", new Object[]{this});
            return;
        }
        if (this.mAutoHideMenuMoreItem) {
            this.mAutoHideMenuMoreItem = false;
            Message obtain = Message.obtain();
            obtain.what = m7r.ACTIONBAR_MENU_LIST;
            Bundle bundle = new Bundle();
            bundle.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
            obtain.obj = bundle;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
        if (this.mAutoHideMenuRightItem) {
            this.mAutoHideMenuRightItem = false;
            Message obtain2 = Message.obtain();
            obtain2.what = m7r.ACTIONBAR_MENU_RIGHT;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
            obtain2.obj = bundle2;
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.sendMessage(obtain2);
            }
        }
        if (this.mAutoHideMenuSecondRightItem) {
            this.mAutoHideMenuSecondRightItem = false;
            Message obtain3 = Message.obtain();
            obtain3.what = m7r.ACTIONBAR_MENU_SECOND_RIGHT;
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
            obtain3.obj = bundle3;
            Handler handler3 = this.mHandler;
            if (handler3 != null) {
                handler3.sendMessage(obtain3);
            }
        }
        if (this.mAutoHideShortCut) {
            this.mAutoHideShortCut = false;
            Message obtain4 = Message.obtain();
            obtain4.what = m7r.ACTIONBAR_ADDTODESKTOP;
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
            obtain4.obj = bundle4;
            Handler handler4 = this.mHandler;
            if (handler4 != null) {
                handler4.sendMessage(obtain4);
            }
        }
        if (this.mAutoShowNavbar) {
            this.mAutoShowNavbar = false;
            Message obtain5 = Message.obtain();
            obtain5.what = m7r.HIDDEN_NAVBAR;
            obtain5.obj = "0";
            Handler handler5 = this.mHandler;
            if (handler5 != null) {
                handler5.sendMessage(obtain5);
            }
        }
    }

    public void clearNaviBarMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc790b6", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = m7r.ACTIONBAR_MENU_LIST;
        Bundle bundle = new Bundle();
        bundle.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void clearNaviBarRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e99b3fd", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = m7r.ACTIONBAR_MENU_RIGHT;
        Bundle bundle = new Bundle();
        bundle.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void clearShortcutToDesktop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be71e3c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = m7r.ACTIONBAR_ADDTODESKTOP;
        Bundle bundle = new Bundle();
        bundle.putBoolean(m7r.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void enableHookNativeBack(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e832e992", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1121;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void getLinkparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d060cca", new Object[]{this, obj, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("linkhref");
                String string2 = jSONObject.getString("linkonclick");
                if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("linkhref", string);
                    bundle.putString("linkonclick", string2);
                    Message obtain = Message.obtain();
                    obtain.what = 1108;
                    obtain.obj = bundle;
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.sendMessage(obtain);
                    }
                    ((WVCallBackContext) obj).success();
                }
            } catch (Exception unused) {
                v7t.d("WebAppInterface", "getLinkparam: param parse to JSON error, param=" + str);
                ((WVCallBackContext) obj).error();
            }
        }
    }

    public void goToOrder(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff2d438", new Object[]{this, obj, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1109;
        obtain.obj = str;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        ((WVCallBackContext) obj).success();
    }

    public void hasMenu(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fed2e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            bundle.putBoolean("hasMenu", jSONObject.optBoolean("hasMenu", true));
            bundle.putBoolean("autoReset", jSONObject.optBoolean("autoReset", true));
            Message obtain = Message.obtain();
            obtain.what = m7r.ACTIONBAR_HAS_MENU;
            obtain.obj = bundle;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error();
        }
    }

    public void hideNaviBarDefaultMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88eb4c8c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            boolean optBoolean = new JSONObject(str).optBoolean(jjx.ZZB_BUNDLE_KEY, false);
            wVCallBackContext.success();
            Message obtain = Message.obtain();
            obtain.what = m7r.HIDE_DEAFAULT_MORE_ITEM;
            Bundle bundle = new Bundle();
            bundle.putBoolean(m7r.ACTION_BAR_ITEM_USER_HELPER_HIDE, optBoolean);
            obtain.obj = bundle;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (iWVWebView instanceof BrowserHybridWebView) {
            this.mHandler = ((BrowserHybridWebView) iWVWebView).getOutHandler();
        } else {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        this.pageStartWVEventListener = new PageStartWVEventListener(this);
        lqw.d().b(this.pageStartWVEventListener);
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mAutoHideMenuRightItem = false;
        this.mAutoHideMenuSecondRightItem = false;
        this.mAutoHideMenuMoreItem = false;
        this.mAutoHideShortCut = false;
        this.mAutoShowNavbar = false;
        this.mHandler = null;
        if (this.pageStartWVEventListener != null) {
            lqw.d().h(this.pageStartWVEventListener);
        }
        super.onDestroy();
    }

    public void pop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b46e01f", new Object[]{this, wVCallBackContext, str});
        } else if (!handleTMSPop(wVCallBackContext)) {
            Message obtain = Message.obtain(this.mHandler);
            obtain.obj = str;
            obtain.what = 88;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        }
    }

    public void setNaviBarHidden(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc50623", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mAutoShowNavbar = jSONObject.optBoolean("autoReset", false);
            str = jSONObject.optString("hidden", "1");
        } catch (JSONException unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = m7r.HIDDEN_NAVBAR;
        obtain.obj = str;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void addShortcutToDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f92768", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String optString = jSONObject.optString("title");
                final String optString2 = jSONObject.optString("icon");
                final String optString3 = jSONObject.optString("url");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || !Uri.parse(optString2).isHierarchical() || !Uri.parse(optString3).isHierarchical()) {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                }
                            }
                        });
                    }
                } else {
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WebAppInterface$1");
                        }

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            Bitmap decodeByteArray;
                            boolean z = true;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            byte[] bytedata = new DegradableNetwork(WebAppInterface.access$100(WebAppInterface.this)).syncSend(new RequestImpl(optString2), null).getBytedata();
                            if (bytedata == null || bytedata.length <= 0 || (decodeByteArray = BitmapFactory.decodeByteArray(bytedata, 0, bytedata.length)) == null || WebAppInterface.access$200(WebAppInterface.this) == null) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.3
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                            }
                                        }
                                    });
                                }
                                return null;
                            }
                            if (Build.VERSION.SDK_INT < 26 || !ShortcutManagerCompat.isRequestPinShortcutSupported(yaa.n)) {
                                BrowserUtil.k(yaa.n, optString3, optString, decodeByteArray);
                            } else {
                                z = WebAppInterface.access$300(WebAppInterface.this, yaa.n, optString3, optString, decodeByteArray);
                            }
                            if (z) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.success(nsw.RET_SUCCESS);
                                            }
                                        }
                                    });
                                }
                            } else if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(nsw.RET_FAIL);
                                        }
                                    }
                                });
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                }
            } catch (Exception unused) {
                v7t.d("WebAppInterface", "setShortcutToDesktop: param parse to JSON error, param=" + str);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            }
        } else {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
        }
    }

    public void fullScreen(WVCallBackContext wVCallBackContext, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d66129", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = m7r.FULL_SCREEN;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("on")) {
                z = jSONObject.optBoolean("on", false);
            } else {
                z = "true".equalsIgnoreCase(jSONObject.optString("open", "false"));
            }
            obtain.obj = Boolean.valueOf(z);
            wVCallBackContext.success();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        } catch (JSONException unused) {
            v7t.d("WebAppInterface", "fullScreen: param parse to JSON error, param=" + str);
            wVCallBackContext.error(new nsw());
        }
    }

    public void isShortcutOnDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da4225b", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                final String optString = new JSONObject(str).optString("title");
                if (!TextUtils.isEmpty(optString)) {
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WebAppInterface$4");
                        }

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            boolean z = false;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    z = WebAppInterface.access$400(WebAppInterface.this, yaa.n, optString);
                                }
                                if (z) {
                                    if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                        WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    wVCallBackContext.success(nsw.RET_SUCCESS);
                                                }
                                            }
                                        });
                                    }
                                } else if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.2
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.error(nsw.RET_FAIL);
                                            }
                                        }
                                    });
                                }
                                return null;
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                        }
                                    }
                                });
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                } else {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                }
                            }
                        });
                    }
                }
            } catch (Exception unused) {
                v7t.d("WebAppInterface", "isShortcutOnDesktop: param parse to JSON error, param=" + str);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            }
        } else {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
        }
    }

    public void setCustomPageTitle(Object obj, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4daeb983", new Object[]{this, obj, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                String decode = URLDecoder.decode(str, "utf-8");
                try {
                    JSONObject jSONObject = new JSONObject(decode);
                    Bundle bundle = new Bundle();
                    String optString = jSONObject.optString("icon", "");
                    boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                    boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                    boolean optBoolean3 = jSONObject.optBoolean("stretch", false);
                    String optString2 = jSONObject.optString("title", "");
                    String optString3 = jSONObject.optString("iconType", "");
                    bundle.putString("icon", optString);
                    bundle.putString("title", optString2);
                    bundle.putBoolean("stretch", optBoolean3);
                    if (TextUtils.isEmpty(optString2)) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("iconType", optString3);
                        } else {
                            if (!optBoolean) {
                                str2 = "Base64";
                            } else if (optBoolean2) {
                                str2 = "IconFont";
                            } else {
                                str2 = "Native";
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                bundle.putString("iconType", str2);
                            }
                        }
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = bundle;
                    obtain.what = 1104;
                    obtain.arg1 = 111;
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.sendMessage(obtain);
                    }
                    ((WVCallBackContext) obj).success();
                } catch (JSONException unused) {
                    v7t.d("WebAppInterface", "setCustomPageTitle: param parse to JSON error, param=" + decode);
                    ((WVCallBackContext) obj).error();
                }
            } catch (Exception unused2) {
                v7t.d("WebAppInterface", "getLinkparam: param decode error param=" + str);
                ((WVCallBackContext) obj).error();
            }
        }
    }

    public void setFestivalStyle(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e19025", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("naviBar", "");
            boolean optBoolean = jSONObject.optBoolean("noTimeCheck", false);
            if (!TextUtils.isEmpty(optString) && !"none".equals(optString)) {
                boolean v = FestivalMgr.i().v("global");
                if (!optBoolean && !v) {
                    nsw nswVar = new nsw();
                    nswVar.b("msg", "Festival is not on, please test in daily or preRelease environment.");
                    wVCallBackContext.error(nswVar);
                    return;
                }
            }
            Message obtain = Message.obtain();
            obtain.what = m7r.FESTIVAL_STYLE;
            obtain.obj = optString;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    public void setNaviBarMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add04441", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                this.mAutoHideMenuMoreItem = new JSONObject(str).optBoolean("autoReset", false);
                Bundle bundle = new Bundle();
                bundle.putString("param", str);
                Message obtain = Message.obtain();
                obtain.what = m7r.ACTIONBAR_MENU_LIST;
                obtain.obj = bundle;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                wVCallBackContext.error(new nsw());
            }
        }
    }

    public void setNaviBarRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea771d2", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                String optString = jSONObject.optString("icon", "");
                boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                this.mAutoHideMenuRightItem = jSONObject.optBoolean("autoReset", false);
                String optString2 = jSONObject.optString("title", "");
                bundle.putString("icon", optString);
                bundle.putString("title", optString2);
                bundle.putBoolean("fromNative", optBoolean);
                bundle.putBoolean("iconFont", optBoolean2);
                Message obtain = Message.obtain();
                obtain.what = m7r.ACTIONBAR_MENU_RIGHT;
                obtain.obj = bundle;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                v7t.d("WebAppInterface", "setNaviBarRightItem: param parse to JSON error, param=" + str);
                wVCallBackContext.error();
            }
        }
    }

    public void setNaviBarSecondRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23afcfe", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                String optString = jSONObject.optString("icon", "");
                boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                this.mAutoHideMenuSecondRightItem = jSONObject.optBoolean("autoReset", false);
                String optString2 = jSONObject.optString("title", "");
                bundle.putString("icon", optString);
                bundle.putString("title", optString2);
                bundle.putBoolean("fromNative", optBoolean);
                bundle.putBoolean("iconFont", optBoolean2);
                Message obtain = Message.obtain();
                obtain.what = m7r.ACTIONBAR_MENU_SECOND_RIGHT;
                obtain.obj = bundle;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                v7t.d("WebAppInterface", "setNaviBarSecondRightItem: param parse to JSON error, param=" + str);
                wVCallBackContext.error();
            }
        }
    }

    public void setShortcutToDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d911b07", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final Bundle bundle = new Bundle();
                String optString = jSONObject.optString("title");
                final String optString2 = jSONObject.optString("icon");
                String optString3 = jSONObject.optString("url");
                String optString4 = jSONObject.optString("buttonText");
                this.mAutoHideShortCut = jSONObject.optBoolean("autoReset", false);
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || !Uri.parse(optString2).isHierarchical() || !Uri.parse(optString3).isHierarchical()) {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                }
                            }
                        });
                    }
                } else {
                    bundle.putString("title", optString);
                    bundle.putString("icon", optString2);
                    bundle.putString("url", optString3);
                    bundle.putString("buttonText", optString4);
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WebAppInterface$7");
                        }

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            byte[] bytedata = new DegradableNetwork(WebAppInterface.access$500(WebAppInterface.this)).syncSend(new RequestImpl(optString2), null).getBytedata();
                            if (!(bytedata == null || bytedata.length <= 0 || BitmapFactory.decodeByteArray(bytedata, 0, bytedata.length) == null)) {
                                bundle.putByteArray(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, bytedata);
                                Message obtain = Message.obtain();
                                obtain.what = m7r.ACTIONBAR_ADDTODESKTOP;
                                obtain.obj = bundle;
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).sendMessage(obtain);
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.success(nsw.RET_SUCCESS);
                                            }
                                        }
                                    });
                                    return null;
                                }
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(nsw.RET_PARAM_ERR);
                                        }
                                    }
                                });
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                }
            } catch (Exception unused) {
                v7t.d("WebAppInterface", "setShortcutToDesktop: param parse to JSON error, param=" + str);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            }
        } else {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
        }
    }

    private boolean handleTMSPop(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373ae867", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (!(webview instanceof WVUCWebView)) {
            return false;
        }
        Object externalContext = ((WVUCWebView) webview).getExternalContext("themis_page");
        if (!(externalContext instanceof ITMSPage)) {
            return false;
        }
        if (((ITMSPage) externalContext).getInstance().W().f(true)) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error("TMSInstance can't pop");
        }
        return true;
    }

    private boolean isShortCutOnDesktopApi26(Context context, String str) {
        Object systemService;
        List pinnedShortcuts;
        CharSequence longLabel;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b56a5e", new Object[]{this, context, str})).booleanValue();
        }
        try {
            systemService = context.getSystemService(ttp.a());
            pinnedShortcuts = jup.a(systemService).getPinnedShortcuts();
            Iterator it = pinnedShortcuts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                longLabel = gsp.a(it.next()).getLongLabel();
                if (str.equals(longLabel)) {
                    break;
                }
            }
            return z;
        } catch (Exception e) {
            v7t.d("WebAppInterface", "isShortCutOnDesktopApi26: failed, reason:" + e);
            return false;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = TAG;
        String str4 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(str3, str4, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        if ("goToOrder".equals(str)) {
            goToOrder(wVCallBackContext, str2);
        } else if ("setNaviBarMoreItem".equals(str)) {
            setNaviBarMoreItem(wVCallBackContext, str2);
        } else if ("setNaviBarRightItem".equals(str)) {
            setNaviBarRightItem(wVCallBackContext, str2);
        } else if ("setNaviBarSecondRightItem".equals(str)) {
            setNaviBarSecondRightItem(wVCallBackContext, str2);
        } else if ("getLinkparam".equals(str)) {
            getLinkparam(wVCallBackContext, str2);
        } else if ("setCustomPageTitle".equals(str)) {
            setCustomPageTitle(wVCallBackContext, str2);
        } else if ("pop".equals(str)) {
            pop(wVCallBackContext, str2);
        } else if ("transverseFullScreen".equals(str)) {
            fullScreen(wVCallBackContext, str2);
        } else if ("fullScreen".equals(str)) {
            fullScreen(wVCallBackContext, str2);
        } else if ("setNaviBarHidden".equals(str)) {
            setNaviBarHidden(wVCallBackContext, str2);
        } else if ("setShortcutToDesktop".equals(str)) {
            setShortcutToDesktop(wVCallBackContext, str2);
        } else if ("addShortcutToDesktop".equals(str)) {
            addShortcutToDesktop(wVCallBackContext, str2);
        } else if ("isShortcutOnDesktop".equals(str)) {
            isShortcutOnDesktop(wVCallBackContext, str2);
        } else if ("clearNaviBarMoreItem".equals(str)) {
            clearNaviBarMoreItem(wVCallBackContext, str2);
        } else if ("clearShortcutToDesktop".equals(str)) {
            clearShortcutToDesktop(wVCallBackContext, str2);
        } else if ("clearNaviBarRightItem".equals(str)) {
            clearNaviBarRightItem(wVCallBackContext, str2);
        } else if ("enableHookNativeBack".equals(str)) {
            enableHookNativeBack(wVCallBackContext, str2);
        } else if ("setPageUserInfo".equals(str)) {
            setPageUserInfo(wVCallBackContext, str2);
        } else if ("hideNaviBarDefaultMoreItem".equals(str)) {
            hideNaviBarDefaultMoreItem(wVCallBackContext, str2);
        } else if ("setFestivalStyle".equals(str)) {
            setFestivalStyle(wVCallBackContext, str2);
        } else if ("hasMenu".equals(str)) {
            hasMenu(wVCallBackContext, str2);
        } else if (!"cancelLoadingView".equals(str)) {
            return false;
        } else {
            cancelLoadingView(wVCallBackContext, str2);
        }
        return true;
    }

    public void setPageUserInfo(WVCallBackContext wVCallBackContext, String str) {
        try {
            String optString = new JSONObject(str).optString(jjx.ZZB_BUNDLE_KEY, "");
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView == null || !(iWVWebView instanceof BrowserHybridWebView)) {
                Context context = this.mContext;
                if (context != null && (context instanceof Activity)) {
                    try {
                        Method method = context.getClass().getMethod("setPageUserInfo", String.class);
                        if (method != null) {
                            method.setAccessible(true);
                            method.invoke(this.mContext, optString);
                            wVCallBackContext.success();
                            return;
                        }
                    } catch (Throwable th) {
                        v7t.n("WebAppInterface", "failed to set pageUserInfo: " + th.getMessage());
                        wVCallBackContext.error();
                        return;
                    }
                }
                wVCallBackContext.error();
                return;
            }
            if (!TextUtils.isEmpty(optString)) {
                BrowserUtil.b(TAG, "setPageUserInfo", "setData2H5", null, null);
            }
            ((BrowserHybridWebView) this.mWebView).setData2H5(optString);
            wVCallBackContext.success();
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }
}
