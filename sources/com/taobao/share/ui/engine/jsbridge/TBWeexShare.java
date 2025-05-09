package com.taobao.share.ui.engine.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.utils.ImgShareHelper;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a0m;
import tb.bwr;
import tb.fwr;
import tb.hhi;
import tb.ikp;
import tb.j8c;
import tb.jkp;
import tb.kpw;
import tb.mi3;
import tb.nsw;
import tb.oj8;
import tb.q0u;
import tb.rip;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.upd;
import tb.xjp;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBWeexShare extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_POP_PANEL = "share_receiver_close_share_menu";
    public static final String ACTION_CLOSE_SHARE_PANEL = "com.taobao.share.closeSharePanel";
    public static final String ACTION_SAVE_SHARE_IMAGE = "com.taobao.share.saveShareImage";
    private static final String HUB_FRAGMENT_TAG = "ShareModule_tag_fragment";
    public static final String INTENT_DATA = "data";
    public static final String NEW_WEEX_VERSION_SIGN = "newWeexShare";
    private static final String TAG = "TBWeexShare-WVApiPlugin";
    private static JSONObject mSinaWeiboAuthData;
    private volatile int imageListCount;
    private volatile AtomicInteger saveSuccessCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11768a;
        public final /* synthetic */ ScrollView b;

        public a(String str, ScrollView scrollView) {
            this.f11768a = str;
            this.b = scrollView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String string = JSON.parseObject(this.f11768a).getString("subContentHeight");
                float parseFloat = Float.parseFloat(string);
                LinearLayout linearLayout = (LinearLayout) this.b.getChildAt(0);
                View childAt = linearLayout.getChildAt(0);
                int measuredHeight = childAt.getMeasuredHeight();
                int i = (int) ((parseFloat * TBWeexShare.access$000(TBWeexShare.this).getResources().getDisplayMetrics().density) + 0.5f);
                fwr.a("requestScrollViewLayout", "subContentHeight:" + string + " pxValue:" + i);
                if (i > measuredHeight || i > 0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = i;
                    childAt.setLayoutParams(layoutParams);
                    childAt.requestLayout();
                    childAt.invalidate();
                }
                fwr.a("requestScrollViewLayout", " getChildAt height:" + linearLayout.getLayoutParams().height + " ScrollView height:" + this.b.getLayoutParams().height);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11769a;
        public final /* synthetic */ ScrollView b;
        public final /* synthetic */ View c;

        public b(String str, ScrollView scrollView, View view) {
            this.f11769a = str;
            this.b = scrollView;
            this.c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String string = JSON.parseObject(this.f11769a).getString("subContentHeight");
                float parseFloat = Float.parseFloat(string);
                LinearLayout linearLayout = (LinearLayout) this.b.getChildAt(0);
                View childAt = linearLayout.getChildAt(0);
                int measuredHeight = childAt.getMeasuredHeight();
                int i = (int) ((parseFloat * TBWeexShare.access$100(TBWeexShare.this).getResources().getDisplayMetrics().density) + 0.5f);
                fwr.a("requestScrollViewLayout", "subContentHeight:" + string + " pxValue:" + i);
                if (i > measuredHeight || i > 0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = i;
                    childAt.setLayoutParams(layoutParams);
                    childAt.requestLayout();
                    this.c.requestLayout();
                    this.c.invalidate();
                }
                fwr.a("requestScrollViewLayout", " getChildAt height:" + linearLayout.getLayoutParams().height + " ScrollView height:" + this.b.getLayoutParams().height);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11770a;
        public final /* synthetic */ String b;

        public c(WVCallBackContext wVCallBackContext, String str) {
            this.f11770a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBWeexShare.access$200(TBWeexShare.this, this.f11770a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11771a;

        public d(WVCallBackContext wVCallBackContext) {
            this.f11771a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11771a.error();
            q0u.a(TBWeexShare.access$300(TBWeexShare.this), Localization.q(R.string.taobao_app_1010_1_18167));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11772a;

        public e(WVCallBackContext wVCallBackContext) {
            this.f11772a = wVCallBackContext;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            fwr.b("TBWeexShare", " saveShareImageList load fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
            this.f11772a.error();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11773a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f11774a;
            public final /* synthetic */ File b;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.share.ui.engine.jsbridge.TBWeexShare$f$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0664a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0664a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    f.this.f11773a.success();
                    oj8.d().c("saveShareImageListSuccess", oj8.EMPTY_EVENT);
                }
            }

            public a(Bitmap bitmap, File file) {
                this.f11774a = bitmap;
                this.b = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TextUtils.isEmpty(hhi.b(true, this.f11774a, this.b, TBWeexShare.access$500(TBWeexShare.this)))) {
                    TBWeexShare.access$400(TBWeexShare.this).getAndIncrement();
                    fwr.b("TBWeexShare", " saveShareImageList index:" + TBWeexShare.access$400(TBWeexShare.this).get() + " total:" + TBWeexShare.access$600(TBWeexShare.this));
                    if (TBWeexShare.access$400(TBWeexShare.this).get() == TBWeexShare.access$600(TBWeexShare.this)) {
                        fwr.b("TBWeexShare", " saveShareImageList all done");
                        new Handler(Looper.getMainLooper()).post(new RunnableC0664a());
                    }
                } else {
                    fwr.b("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
                }
            }
        }

        public f(WVCallBackContext wVCallBackContext) {
            this.f11773a = wVCallBackContext;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null) {
                Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                if (bitmap != null) {
                    AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(bitmap, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)));
                } else {
                    fwr.b("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
                }
            } else {
                fwr.b("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements j8c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11776a;

        public g(TBWeexShare tBWeexShare, WVCallBackContext wVCallBackContext) {
            this.f11776a = wVCallBackContext;
        }

        @Override // tb.j8c.a
        public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
                return;
            }
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                this.f11776a.error();
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b(zk4.CONTACTS_INFO_KEY, str);
            nswVar.k();
            this.f11776a.success(nswVar);
        }
    }

    static {
        t2o.a(667942946);
    }

    public static /* synthetic */ Context access$000(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b4c4f87a", new Object[]{tBWeexShare});
        }
        return tBWeexShare.mContext;
    }

    public static /* synthetic */ Context access$100(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("92b85e59", new Object[]{tBWeexShare});
        }
        return tBWeexShare.mContext;
    }

    public static /* synthetic */ void access$200(TBWeexShare tBWeexShare, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e25107", new Object[]{tBWeexShare, wVCallBackContext, str});
        } else {
            tBWeexShare.saveImageList(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ Context access$300(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4e9f2a17", new Object[]{tBWeexShare});
        }
        return tBWeexShare.mContext;
    }

    public static /* synthetic */ AtomicInteger access$400(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("31073068", new Object[]{tBWeexShare});
        }
        return tBWeexShare.saveSuccessCount;
    }

    public static /* synthetic */ Context access$500(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a85f5d5", new Object[]{tBWeexShare});
        }
        return tBWeexShare.mContext;
    }

    public static /* synthetic */ int access$600(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f4470af", new Object[]{tBWeexShare})).intValue();
        }
        return tBWeexShare.imageListCount;
    }

    private void cancelGuangVideoDownload(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c582553f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent e2 = bwr.h().e();
        if (e2 != null) {
            mi3 mi3Var = new mi3();
            rip ripVar = new rip();
            ripVar.c(e2);
            mi3Var.d(ripVar);
            mi3Var.e("videodownload");
            xjp.b().a(mi3Var);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error();
    }

    @WindVaneInterface
    private void closeSharePanel(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76c484b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_CLOSE_SHARE_PANEL);
            intent.putExtra("data", str);
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            wVCallBackContext.success();
        } catch (Exception e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void getContactsInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02de865", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            fwr.b("TIMECOST", "windvane getContactsInfo: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
            zk4 c2 = zk4.c();
            c2.d(wVCallBackContext);
            c2.b();
        } catch (Exception e2) {
            fwr.b(fwr.SHARE_TAG, "getContactsInfo err:" + e2.getMessage());
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void getRecentContacts(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8d2ed2", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ShareBizAdapter.getInstance().getFriendsProvider().a(0, new g(this, wVCallBackContext));
        } catch (Throwable th) {
            wVCallBackContext.error();
            fwr.b("TBWeexShare", " getRecentContacts err:" + th.getMessage());
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(TBWeexShare tBWeexShare, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/ui/engine/jsbridge/TBWeexShare");
    }

    @WindVaneInterface
    private void registerWeexShareListener(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769b871d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            fwr.b("TIMECOST", "windvane registerWeexShareListener: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
            oj8.d().e(wVCallBackContext);
            TBShareContent e2 = bwr.h().e();
            if ("common".equals(e2.templateId)) {
                String config = OrangeConfig.getInstance().getConfig("android_share", "commonTemplateId", "");
                if (!TextUtils.isEmpty(config)) {
                    e2.templateId = config;
                }
            }
            if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) SubstituteConstants.KEY_CHANNEL_FRIENDS);
                jSONObject.put("state", (Object) (-1));
                oj8.d().c(oj8.DATA_STATE_EVENT, jSONObject);
            }
            if (!str.contains(NEW_WEEX_VERSION_SIGN)) {
                nsw nswVar = new nsw();
                nswVar.b(oj8.SHARE_CONTENT_KEY, JSON.toJSONString(e2));
                wVCallBackContext.success(nswVar);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            wVCallBackContext.error();
            fwr.b("TBWeexShare", "registerWeexShareListener err:" + e3.getMessage());
        }
    }

    private void requestScrollViewLayout(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ced8ed9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        upd shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk("");
        WeexInstance d2 = shareWeexSdk != null ? shareWeexSdk.d() : null;
        if (d2 != null && d2.getRootView() != null && (d2.getRootView() instanceof ViewGroup)) {
            View findViewWithTag = d2.getRootView().findViewWithTag("sharescrollViewTag");
            if (findViewWithTag instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) findViewWithTag;
                findViewWithTag.post(new a(str, scrollView));
                findViewWithTag.postDelayed(new b(str, scrollView, findViewWithTag), 30L);
            }
        }
    }

    @WindVaneInterface
    private void saveImageList(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c280d7aa", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONArray jSONArray = JSON.parseObject(str).getJSONArray(BaseJsExecutor.NAME_IMAGE_LIST);
            this.saveSuccessCount = new AtomicInteger(0);
            this.imageListCount = jSONArray.size();
            for (int i = 0; i < this.imageListCount; i++) {
                s0m.B().N0(this.mContext.getApplicationContext()).T((String) jSONArray.get(i)).succListener(new f(wVCallBackContext)).failListener(new e(wVCallBackContext)).fetch();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void shareSendBroadCast(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5d6728", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("pageName");
            String string2 = parseObject.getString("pageUrl");
            String string3 = parseObject.getString("openTimestamp");
            Intent intent = new Intent("afc_page_open_broadcast");
            intent.putExtra("pageName", string);
            intent.putExtra("pageUrl", string2);
            intent.putExtra("openTimestamp", string3);
            intent.putExtra("data", str);
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            wVCallBackContext.success();
        } catch (Exception e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void shareToChannel(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703920b7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ikp.a().b(JSON.parseObject(str));
            wVCallBackContext.success();
        } catch (Exception e2) {
            fwr.b(fwr.SHARE_TAG, "shareToChannel err:" + e2.getMessage());
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void shareToContact(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c2df94", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            jkp.a().b((ContactInfo) JSON.parseObject(str, ContactInfo.class));
            wVCallBackContext.success();
        } catch (Exception e2) {
            fwr.b(fwr.SHARE_TAG, "shareToContact err:" + e2.getMessage());
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void startGuangVideoDownload(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b53f27", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent e2 = bwr.h().e();
        if (e2 != null) {
            e2.extraParams.put("isWeexDownload", "true");
            mi3 mi3Var = new mi3();
            rip ripVar = new rip();
            ripVar.c(e2);
            mi3Var.d(ripVar);
            mi3Var.e("videodownload");
            xjp.b().onEvent(mi3Var);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error();
    }

    private void traceShareBtnExpose(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d65c54", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ShareBusiness.traceShareBtnExpose(JSON.parseObject(str).getString("bizType"));
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void updateShareContent(WVCallBackContext wVCallBackContext, String str) {
        try {
            TBShareContent e2 = bwr.h().e();
            for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                Field declaredField = e2.getClass().getDeclaredField(entry.getKey());
                declaredField.setAccessible(true);
                declaredField.set(e2, entry.getValue());
            }
            wVCallBackContext.success();
        } catch (Exception e3) {
            wVCallBackContext.error();
            e3.printStackTrace();
            fwr.b(fwr.SHARE_TAG, " updateShareContent err:" + e3.getMessage());
        }
    }

    private void updateWaterMaskVideoPath(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8990be14", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent e2 = bwr.h().e();
        JSONObject parseObject = JSON.parseObject(str);
        if (e2 == null || parseObject == null || !TextUtils.equals(parseObject.getString("videoPath"), e2.extraParams.get("videoPath")) || TextUtils.isEmpty(parseObject.getString("waterMaskVideoPath"))) {
            wVCallBackContext.error();
            return;
        }
        e2.extraParams.put("waterMaskVideoPath", parseObject.getString("waterMaskVideoPath"));
        wVCallBackContext.success();
    }

    @WindVaneInterface
    private void saveShareImageList(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740fc0a5", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            if (a0m.c()) {
                saveImageList(wVCallBackContext, str);
            } else {
                com.taobao.runtimepermission.a.c(this.mContext, a0m.a()).t("tb_share").x(true).w(Localization.q(R.string.taobao_app_1010_1_18168)).z(new d(wVCallBackContext)).A(new c(wVCallBackContext, str)).m();
            }
        } catch (Throwable th) {
            wVCallBackContext.error();
            fwr.b("TBWeexShare", " saveShareImageList err:" + th.getMessage());
            th.printStackTrace();
        }
    }

    @WindVaneInterface
    private void saveShareImage(WVCallBackContext wVCallBackContext, String str) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2949f5e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_SAVE_SHARE_IMAGE);
            intent.putExtra("data", str);
            try {
                JSONObject parseObject = JSON.parseObject(str);
                ImgShareHelper.disableSuccessToast = parseObject.getBooleanValue("disableSuccessToast");
                z = parseObject.getBooleanValue("isPasteImageToPasteboard");
                try {
                    ImgShareHelper.saveImageToClipboard = z;
                    fwr.e("保存画报入参:disableSuccessToast=" + ImgShareHelper.disableSuccessToast + " isPasteImageToPasteboard=" + ImgShareHelper.saveImageToClipboard);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z = false;
            }
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            nsw nswVar = new nsw();
            nswVar.a("patchValid", Boolean.TRUE);
            if (!z || Build.VERSION.SDK_INT < 31) {
                z2 = false;
            }
            nswVar.a("pasteImageToPasteboardSuccess", Boolean.valueOf(z2));
            wVCallBackContext.success(nswVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("registerWeexShareListener".equals(str)) {
            registerWeexShareListener(wVCallBackContext, str2);
        } else if ("closeSharePanel".equals(str)) {
            closeSharePanel(wVCallBackContext, str2);
        } else if ("saveShareImage".equals(str)) {
            saveShareImage(wVCallBackContext, str2);
        } else if ("updateShareContent".equals(str)) {
            updateShareContent(wVCallBackContext, str2);
        } else if ("saveShareImageList".equals(str)) {
            saveShareImageList(wVCallBackContext, str2);
        } else if ("getContactsInfo".equals(str)) {
            getContactsInfo(wVCallBackContext, str2);
        } else if ("shareToContact".equals(str)) {
            shareToContact(wVCallBackContext, str2);
        } else if ("getRecentContacts".equals(str)) {
            getRecentContacts(wVCallBackContext, str2);
        } else if ("shareToChannel".equals(str)) {
            shareToChannel(wVCallBackContext, str2);
        } else if ("startGuangVideoDownload".equals(str)) {
            startGuangVideoDownload(wVCallBackContext, str2);
        } else if ("cancelGuangVideoDownload".equals(str)) {
            cancelGuangVideoDownload(wVCallBackContext, str2);
        } else if ("updateWaterMaskVideoPath".equals(str)) {
            updateWaterMaskVideoPath(wVCallBackContext, str2);
        } else if ("feShareToContact".equals(str)) {
            feShareToContact(wVCallBackContext, str2);
        } else if ("shareInputExposure".equals(str)) {
            traceShareBtnExpose(wVCallBackContext, str2);
        } else if ("shareSendBroadCast".equals(str)) {
            shareSendBroadCast(wVCallBackContext, str2);
        } else if ("requestScrollViewLayout".equals(str)) {
            requestScrollViewLayout(wVCallBackContext, str2);
        } else if ("requestScrollViewLayout".equals(str)) {
            requestScrollViewLayout(wVCallBackContext, str2);
        } else if (!"shareSendBroadCast".equals(str)) {
            return false;
        } else {
            shareSendBroadCast(wVCallBackContext, str2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:6:0x001a, B:9:0x0023, B:16:0x0040, B:21:0x004c, B:24:0x0057, B:32:0x006c, B:33:0x0073, B:34:0x008f, B:35:0x00ae, B:36:0x00b7), top: B:39:0x001a }] */
    @android.taobao.windvane.jsbridge.WindVaneInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void feShareToContact(android.taobao.windvane.jsbridge.WVCallBackContext r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "TBShare"
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.share.ui.engine.jsbridge.TBWeexShare.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001a
            java.lang.String r3 = "72680b73"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r8
            r5[r1] = r9
            r5[r0] = r10
            r4.ipc$dispatch(r3, r5)
            return
        L_0x001a:
            com.alibaba.fastjson.JSONObject r10 = com.alibaba.fastjson.JSON.parseObject(r10)     // Catch: Exception -> 0x0049
            java.lang.String r4 = "feShareToContact err"
            if (r10 == 0) goto L_0x00b7
            java.lang.String r5 = "action"
            java.lang.String r10 = r10.getString(r5)     // Catch: Exception -> 0x0049
            int r5 = r10.hashCode()     // Catch: Exception -> 0x0049
            r6 = 3135262(0x2fd71e, float:4.393438E-39)
            java.lang.String r7 = "fail"
            if (r5 == r6) goto L_0x0057
            r6 = 3541570(0x360a42, float:4.962797E-39)
            if (r5 == r6) goto L_0x004c
            r6 = 94750088(0x5a5c588, float:1.5589087E-35)
            if (r5 == r6) goto L_0x0040
            goto L_0x005f
        L_0x0040:
            java.lang.String r5 = "click"
            boolean r10 = r10.equals(r5)     // Catch: Exception -> 0x0049
            if (r10 == 0) goto L_0x005f
            goto L_0x0060
        L_0x0049:
            r10 = move-exception
            goto L_0x00be
        L_0x004c:
            java.lang.String r2 = "succ"
            boolean r10 = r10.equals(r2)     // Catch: Exception -> 0x0049
            if (r10 == 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x0057:
            boolean r10 = r10.equals(r7)     // Catch: Exception -> 0x0049
            if (r10 == 0) goto L_0x005f
            r2 = 2
            goto L_0x0060
        L_0x005f:
            r2 = -1
        L_0x0060:
            if (r2 == 0) goto L_0x00ae
            java.lang.String r10 = "ret"
            java.lang.String r5 = "platform"
            if (r2 == r1) goto L_0x008f
            if (r2 == r0) goto L_0x0073
            tb.fwr.b(r3, r4)     // Catch: Exception -> 0x0049
            r9.error()     // Catch: Exception -> 0x0049
            goto L_0x00da
        L_0x0073:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: Exception -> 0x0049
            r0.<init>()     // Catch: Exception -> 0x0049
            com.ut.share.business.ShareTargetType r1 = com.ut.share.business.ShareTargetType.Share2Contact     // Catch: Exception -> 0x0049
            java.lang.String r1 = r1.getValue()     // Catch: Exception -> 0x0049
            r0.put(r5, r1)     // Catch: Exception -> 0x0049
            r0.put(r10, r7)     // Catch: Exception -> 0x0049
            com.ut.share.business.ShareBusiness r10 = com.ut.share.business.ShareBusiness.getInstance()     // Catch: Exception -> 0x0049
            r10.onShareFinished(r0)     // Catch: Exception -> 0x0049
            r9.success()     // Catch: Exception -> 0x0049
            goto L_0x00da
        L_0x008f:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: Exception -> 0x0049
            r0.<init>()     // Catch: Exception -> 0x0049
            com.ut.share.business.ShareTargetType r1 = com.ut.share.business.ShareTargetType.Share2Contact     // Catch: Exception -> 0x0049
            java.lang.String r1 = r1.getValue()     // Catch: Exception -> 0x0049
            r0.put(r5, r1)     // Catch: Exception -> 0x0049
            java.lang.String r1 = "success"
            r0.put(r10, r1)     // Catch: Exception -> 0x0049
            com.ut.share.business.ShareBusiness r10 = com.ut.share.business.ShareBusiness.getInstance()     // Catch: Exception -> 0x0049
            r10.onShareFinished(r0)     // Catch: Exception -> 0x0049
            r9.success()     // Catch: Exception -> 0x0049
            goto L_0x00da
        L_0x00ae:
            com.ut.share.business.ShareTargetType r10 = com.ut.share.business.ShareTargetType.Share2Contact     // Catch: Exception -> 0x0049
            tb.akp.e(r10)     // Catch: Exception -> 0x0049
            r9.success()     // Catch: Exception -> 0x0049
            goto L_0x00da
        L_0x00b7:
            tb.fwr.b(r3, r4)     // Catch: Exception -> 0x0049
            r9.error()     // Catch: Exception -> 0x0049
            goto L_0x00da
        L_0x00be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "feShareToContact err:"
            r0.<init>(r1)
            java.lang.String r1 = r10.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            tb.fwr.b(r3, r0)
            r10.printStackTrace()
            r9.error()
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.ui.engine.jsbridge.TBWeexShare.feShareToContact(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
