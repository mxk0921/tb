package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.copy.process.StorebackFlowData$StoreRedirectUrlRequest;
import com.taobao.share.copy.process.StorebackFlowData$StorebackflowdataRequest;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.shop.common.ShopConstants;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mkp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareUrlProcess";

    /* renamed from: a  reason: collision with root package name */
    public Uri f24106a;
    public String b;
    public String c;
    public final List<String> d;
    public Handler e;
    public final Handler f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mkp.a(mkp.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mkp.b(mkp.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mkp f24109a = new mkp(null);

        static {
            t2o.a(664797209);
        }

        public static /* synthetic */ mkp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mkp) ipChange.ipc$dispatch("51ccf2e1", new Object[0]);
            }
            return f24109a;
        }
    }

    static {
        t2o.a(664797206);
    }

    public /* synthetic */ mkp(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(mkp mkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1561d764", new Object[]{mkpVar})).booleanValue();
        }
        return mkpVar.d();
    }

    public static /* synthetic */ void b(mkp mkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7d55ff", new Object[]{mkpVar});
        } else {
            mkpVar.e();
        }
    }

    public static mkp c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkp) ipChange.ipc$dispatch("5aa347c5", new Object[0]);
        }
        return c.a();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e20744c", new Object[]{this});
            return;
        }
        if (((ArrayList) this.d).size() > 1) {
            StorebackFlowData$StoreRedirectUrlRequest storebackFlowData$StoreRedirectUrlRequest = new StorebackFlowData$StoreRedirectUrlRequest();
            storebackFlowData$StoreRedirectUrlRequest.targetUrl = this.b;
            storebackFlowData$StoreRedirectUrlRequest.redirectUrlList = this.d;
            fwr.a(TAG, "notifyRedirect: " + this.b + " -> " + JSON.toJSONString(this.d));
            ((RemoteBusiness) RemoteBusiness.build(ClipUrlWatcherControl.z().i, storebackFlowData$StoreRedirectUrlRequest, ClipUrlWatcherControl.z().j).reqMethod(MethodEnum.POST)).asyncRequest();
        }
        this.b = null;
        this.c = null;
        ((ArrayList) this.d).clear();
        this.e = null;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a871997d", new Object[]{this, str});
            return;
        }
        StorebackFlowData$StorebackflowdataRequest storebackFlowData$StorebackflowdataRequest = new StorebackFlowData$StorebackflowdataRequest();
        storebackFlowData$StorebackflowdataRequest.shareUrl = str;
        RemoteBusiness.build(ClipUrlWatcherControl.z().i, storebackFlowData$StorebackflowdataRequest, ClipUrlWatcherControl.z().j).asyncRequest();
    }

    public mkp() {
        this.f24106a = null;
        this.b = "";
        this.c = "";
        this.d = new ArrayList();
        this.f = new Handler(Looper.getMainLooper());
    }

    public final void i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef7802", new Object[]{this, uri});
        } else if (this.e != null && !"true".equals(OrangeConfig.getInstance().getConfig("android_share", "storeRedirectUrlOff", "false"))) {
            String uri2 = uri.toString();
            if (TextUtils.isEmpty(this.b)) {
                fwr.a(TAG, "startRedirect init: " + uri2);
                this.b = uri2;
            }
            if (!TextUtils.equals(uri2, this.c)) {
                this.c = uri2;
                ((ArrayList) this.d).add(uri2);
                fwr.a(TAG, "startRedirect add: " + uri2.length() + " = " + uri2);
                try {
                    if (this.f24106a.isHierarchical() && !TextUtils.isEmpty(this.f24106a.getQueryParameter("targetUrl"))) {
                        String decode = URLDecoder.decode(this.f24106a.getQueryParameter("targetUrl"), "utf-8");
                        ((ArrayList) this.d).add(decode);
                        fwr.a(TAG, "startRedirect targetUrl add: = " + decode);
                    } else if (uri2.contains("weex_original_url=")) {
                        String decode2 = URLDecoder.decode(uri2.split("weex_original_url=")[1], "utf-8");
                        ((ArrayList) this.d).add(decode2);
                        fwr.a(TAG, "startRedirect weex_original_url add:  = " + decode2);
                    }
                } catch (Throwable unused) {
                }
                this.e.removeCallbacksAndMessages(null);
                this.e.postDelayed(new b(), Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "redirectTrackDelayed", "3000")));
            }
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10e78318", new Object[]{this})).booleanValue();
        }
        if (!this.f24106a.isHierarchical() || this.f24106a.toString().startsWith(ShopConstants.SHOP_URI)) {
            return false;
        }
        String queryParameter = this.f24106a.getQueryParameter("ut_sk");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        String uri = this.f24106a.toString();
        if (uri.contains("h5.waptest.taobao.com/scan/transit-sms.html") || uri.contains("h5.wapa.taobao.com/scan/transit-sms.html") || uri.contains("h5.m.taobao.com/scan/transit-sms.html")) {
            uri = this.f24106a.getQueryParameter("url");
        }
        if (TextUtils.isEmpty(uri)) {
            uri = this.f24106a.toString();
        }
        String[] split = queryParameter.split("\\.");
        if (split.length > 2) {
            String str = split.length > 3 ? split[3] : null;
            String queryParameter2 = this.f24106a.getQueryParameter("app");
            HashMap hashMap = new HashMap();
            hashMap.put("passwordKey", ClipUrlWatcherControl.z().n);
            if (TextUtils.isEmpty(queryParameter2)) {
                String str2 = split[2];
                TBS.Ext.commitEvent(5004, str, str2, uri, hashMap.toString() + "," + bwr.h().m());
                f(uri);
            } else {
                hashMap.put("app", queryParameter2);
                String str3 = split[2];
                TBS.Ext.commitEvent(5004, str, str3, uri, hashMap.toString() + "," + bwr.h().m());
                f(uri);
            }
        }
        return true;
    }

    public boolean g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf35d937", new Object[]{this, intent})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            this.f24106a = data;
            if (data != null && data.isHierarchical()) {
                if (this.e != null) {
                    i(this.f24106a);
                }
                this.f.removeCallbacksAndMessages(null);
                fwr.a(TAG, "startRedirect onActivityCreated: " + this.f24106a.toString());
                return d();
            }
        }
        return false;
    }

    public boolean h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12826c96", new Object[]{this, intent})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            this.f24106a = data;
            if (data != null && data.isHierarchical()) {
                boolean z = !this.f24106a.toString().startsWith(ShopConstants.SHOP_URI);
                if (TextUtils.isEmpty(this.f24106a.getQueryParameter("ut_sk"))) {
                    z = false;
                }
                boolean equals = "true".equals(OrangeConfig.getInstance().getConfig("android_share", "fixUtTrack", "true"));
                if (!z) {
                    return false;
                }
                if (equals) {
                    this.f.postDelayed(new a(), Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "fixUtTrackDelayed", "3000")));
                }
                this.e = new Handler(Looper.getMainLooper());
                return true;
            }
        }
        return false;
    }
}
