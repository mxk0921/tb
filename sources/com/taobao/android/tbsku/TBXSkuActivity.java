package com.taobao.android.tbsku;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.SkuCore;
import com.taobao.android.sku.network.SkuRequestParams;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.model.IntentModel;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import com.ut.share.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;
import tb.a58;
import tb.acq;
import tb.bw7;
import tb.c0s;
import tb.epq;
import tb.go2;
import tb.h0c;
import tb.hxj;
import tb.jk;
import tb.k3q;
import tb.kxf;
import tb.m0u;
import tb.n2q;
import tb.n4v;
import tb.o2q;
import tb.owc;
import tb.p2q;
import tb.q2q;
import tb.rrh;
import tb.t2o;
import tb.to8;
import tb.txl;
import tb.uwl;
import tb.v7j;
import tb.vkb;
import tb.y0i;
import tb.ybl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBXSkuActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long j = 8000;
    public IntentModel b;
    public ViewGroup c;
    public ViewGroup d;
    public TBXSkuCore e;
    public c0s g;
    public SkuUpdateDataReceiver h;
    public Runnable i;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9547a = new Handler(Looper.getMainLooper());
    public String f = hxj.UNIQID + System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class SkuUpdateDataReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(785383437);
        }

        public SkuUpdateDataReceiver() {
        }

        public static /* synthetic */ Object ipc$super(SkuUpdateDataReceiver skuUpdateDataReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/TBXSkuActivity$SkuUpdateDataReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TBXSkuActivity.p3(TBXSkuActivity.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", TBXSkuActivity.q3(TBXSkuActivity.this));
                hashMap.put("openFrom", TBXSkuActivity.r3(TBXSkuActivity.this));
                hashMap.put("bizName", TBXSkuActivity.F3(TBXSkuActivity.this).l);
                hashMap.put("utParams", TBXSkuActivity.F3(TBXSkuActivity.this).k);
                hashMap.put("url", TBXSkuActivity.s3(TBXSkuActivity.this));
                hashMap.put("codePath", "SkuUpdateDataReceiver_onReceive");
                n4v.b(19999, "Sku_Code_Track", hashMap);
                String p = TBXSkuActivity.p3(TBXSkuActivity.this).p();
                if (!TextUtils.isEmpty(p) && TBXSkuActivity.D3(TBXSkuActivity.this).equals(intent.getStringExtra("skuToken")) && p.equals(intent.getStringExtra("originalItemId"))) {
                    String stringExtra = intent.getStringExtra("targetItemId");
                    String stringExtra2 = intent.getStringExtra(q2q.KEY_AREA_ID);
                    String stringExtra3 = intent.getStringExtra("addressId");
                    String stringExtra4 = intent.getStringExtra("params");
                    String stringExtra5 = intent.getStringExtra("forbidLoading");
                    HashMap hashMap2 = new HashMap(TBXSkuActivity.F3(TBXSkuActivity.this).g);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        hashMap2.put(q2q.KEY_AREA_ID, stringExtra2);
                    }
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        hashMap2.put("addressId", stringExtra3);
                    }
                    if (!TextUtils.isEmpty(stringExtra4)) {
                        hashMap2.put("params", stringExtra4);
                    }
                    if (TBXSkuActivity.t3(TBXSkuActivity.this, stringExtra, hashMap2, false) && !"true".equalsIgnoreCase(stringExtra5)) {
                        TBXSkuActivity.p3(TBXSkuActivity.this).q().d0();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class TBXSkuResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mInit;
        private Handler mMainHandler;
        private String mOpenFrom;
        private WeakReference<TBXSkuActivity> mWeakReference;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TBXSkuActivity f9550a;
            public final /* synthetic */ MtopResponse b;

            public a(TBXSkuActivity tBXSkuActivity, MtopResponse mtopResponse) {
                this.f9550a = tBXSkuActivity;
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TBXSkuActivity.x3(this.f9550a)) {
                    TBXSkuResponseListener.access$2400(TBXSkuResponseListener.this, TBXSkuActivity.z3(this.f9550a, this.b));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f9551a;

            public b(JSONObject jSONObject) {
                this.f9551a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TBXSkuActivity tBXSkuActivity = (TBXSkuActivity) TBXSkuResponseListener.access$2700(TBXSkuResponseListener.this).get();
                if (tBXSkuActivity != null && !TBXSkuActivity.x3(tBXSkuActivity)) {
                    TBXSkuResponseListener.this.dealMtopSuccess(tBXSkuActivity, this.f9551a);
                }
            }
        }

        static {
            t2o.a(785383438);
            t2o.a(589299719);
        }

        public TBXSkuResponseListener(TBXSkuActivity tBXSkuActivity, Handler handler, boolean z, String str) {
            this.mWeakReference = new WeakReference<>(tBXSkuActivity);
            this.mMainHandler = handler;
            this.mInit = z;
            this.mOpenFrom = str;
        }

        public static /* synthetic */ void access$2400(TBXSkuResponseListener tBXSkuResponseListener, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ceb7f4f", new Object[]{tBXSkuResponseListener, jSONObject});
            } else {
                tBXSkuResponseListener.dealResultInMainThread(jSONObject);
            }
        }

        public static /* synthetic */ WeakReference access$2700(TBXSkuResponseListener tBXSkuResponseListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("2bd95052", new Object[]{tBXSkuResponseListener});
            }
            return tBXSkuResponseListener.mWeakReference;
        }

        private void dealResultInMainThread(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4ac2778", new Object[]{this, jSONObject});
            } else {
                this.mMainHandler.post(new b(jSONObject));
            }
        }

        public void dealMtopSuccess(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fec05f1a", new Object[]{this, tBXSkuActivity, jSONObject});
                return;
            }
            if (this.mInit) {
                TBXSkuActivity.B3(tBXSkuActivity, jSONObject);
            } else {
                TBXSkuActivity.A3(tBXSkuActivity, jSONObject);
            }
            v7j.b(tBXSkuActivity.getApplicationContext(), jSONObject, this.mOpenFrom);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity != null && !TBXSkuActivity.x3(tBXSkuActivity)) {
                dealMtopError(tBXSkuActivity, mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity != null && !TBXSkuActivity.x3(tBXSkuActivity) && this.mMainHandler != null) {
                txl.h().p("mtop", new HashMap<String, String>(mtopResponse) { // from class: com.taobao.android.tbsku.TBXSkuActivity.TBXSkuResponseListener.1
                    public final /* synthetic */ MtopResponse val$mtopResponse;

                    {
                        this.val$mtopResponse = mtopResponse;
                        put("api", mtopResponse.getApi());
                        put("v", mtopResponse.getV());
                        put("eagleEyeTraceId", uwl.b(mtopResponse));
                        put("mtopState", mtopResponse.getMtopStat().toString());
                    }
                });
                txl.h().q("afterMtop", "container");
                new Thread(new a(tBXSkuActivity, mtopResponse), "TBXSkuActivity.TBXSkuResponseListener").start();
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity != null && !TBXSkuActivity.x3(tBXSkuActivity)) {
                dealMtopError(tBXSkuActivity, mtopResponse);
            }
        }

        public void dealMtopError(TBXSkuActivity tBXSkuActivity, MtopResponse mtopResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ec2d536", new Object[]{this, tBXSkuActivity, mtopResponse});
                return;
            }
            if (mtopResponse == null) {
                str = "";
            } else {
                str = mtopResponse.getRetMsg();
            }
            if (TextUtils.isEmpty(str)) {
                str = p2q.SKU_MSG_QUERYDATA_FAILED;
            }
            m0u.b(tBXSkuActivity, p2q.SKU_MSG_QUERYDATA_FAILED, 1);
            if (this.mInit) {
                SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_MTOP_E, str, TBXSkuActivity.q3(tBXSkuActivity), TBXSkuActivity.s3(tBXSkuActivity));
                TBXSkuActivity.y3(tBXSkuActivity, 8, null);
                return;
            }
            TBXSkuActivity.A3(tBXSkuActivity, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements owc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBXSkuResponseListener f9552a;
        public final /* synthetic */ String b;

        public a(TBXSkuResponseListener tBXSkuResponseListener, String str) {
            this.f9552a = tBXSkuResponseListener;
            this.b = str;
        }

        @Override // tb.owc
        public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                return;
            }
            this.f9552a.onSuccess(i, mtopInfo.a(), baseOutDo, obj);
            if (!y0i.API_NAME.equals(mtopInfo.a().getApi())) {
                HashMap hashMap = new HashMap();
                hashMap.put("outType", "skuActivity");
                hashMap.put("openFrom", this.b);
                n4v.b(19999, "Request_Degrade", hashMap);
            }
            if (TBXSkuActivity.u3(TBXSkuActivity.this) != null) {
                TBXSkuActivity.w3(TBXSkuActivity.this).removeCallbacks(TBXSkuActivity.u3(TBXSkuActivity.this));
            }
        }

        @Override // tb.owc
        public void b(MtopInfo mtopInfo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i), obj});
                return;
            }
            MtopResponse a2 = mtopInfo.a();
            this.f9552a.onError(i, a2, obj);
            HashMap hashMap = new HashMap();
            if (a2 != null) {
                hashMap.put(jk.KEY_RET_CODE, a2.getRetCode());
                hashMap.put(jk.KEY_RET_MSG, a2.getRetMsg());
                hashMap.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, String.valueOf(a2.getResponseCode()));
                hashMap.put("traceId", epq.a(a2));
            }
            TBXSkuActivity.this.g4(hashMap, -700028, "SkuMtopError");
            if (TBXSkuActivity.u3(TBXSkuActivity.this) != null) {
                TBXSkuActivity.w3(TBXSkuActivity.this).removeCallbacks(TBXSkuActivity.u3(TBXSkuActivity.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBXSkuResponseListener f9553a;

        public b(TBXSkuResponseListener tBXSkuResponseListener) {
            this.f9553a = tBXSkuResponseListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SkuLogUtils.k("prefetchSkuMtop 已经设置回调 但是超时未执行 被另一个sku浮层的回调覆盖了 需要关闭当前页面  否则一直在转圈");
            TBXSkuActivity.this.f4(-700030, "SkuWaitPrefetchTimeout");
            this.f9553a.onError(0, null, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements h0c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h0c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a97b7546", new Object[]{this, str});
            } else if (!TBXSkuActivity.x3(TBXSkuActivity.this)) {
                m0u.b(TBXSkuActivity.this, p2q.SKU_MSG_JS_CRASHED, 1);
                TBXSkuActivity.y3(TBXSkuActivity.this, 16, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements AliXSkuCore.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.sku.AliXSkuCore.j
        public void a(Map<String, String> map, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e09bd96c", new Object[]{this, map, new Integer(i), str});
            } else {
                TBXSkuActivity.this.g4(map, i, str);
            }
        }
    }

    static {
        t2o.a(785383426);
    }

    public static /* synthetic */ void A3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a723a9ce", new Object[]{tBXSkuActivity, jSONObject});
        } else {
            tBXSkuActivity.p4(jSONObject);
        }
    }

    public static /* synthetic */ void B3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879cffcf", new Object[]{tBXSkuActivity, jSONObject});
        } else {
            tBXSkuActivity.n4(jSONObject);
        }
    }

    public static /* synthetic */ void C3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b142f3f2", new Object[]{tBXSkuActivity});
        } else {
            tBXSkuActivity.M3();
        }
    }

    public static /* synthetic */ String D3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d829aef", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.f;
    }

    public static /* synthetic */ void E3(TBXSkuActivity tBXSkuActivity, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb022cb", new Object[]{tBXSkuActivity, str, map});
        } else {
            tBXSkuActivity.c4(str, map);
        }
    }

    public static /* synthetic */ IntentModel F3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntentModel) ipChange.ipc$dispatch("682ee682", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.b;
    }

    public static /* synthetic */ Intent G3(TBXSkuActivity tBXSkuActivity, Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("388ad04e", new Object[]{tBXSkuActivity, intent, jSONObject});
        }
        return tBXSkuActivity.Q3(intent, jSONObject);
    }

    public static /* synthetic */ JSONObject H3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91449a63", new Object[]{tBXSkuActivity, jSONObject});
        }
        return tBXSkuActivity.S3(jSONObject);
    }

    public static /* synthetic */ String I3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50e913dc", new Object[]{tBXSkuActivity, jSONObject});
        }
        return tBXSkuActivity.T3(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(TBXSkuActivity tBXSkuActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/TBXSkuActivity");
        }
    }

    public static /* synthetic */ boolean l3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e30e59", new Object[]{tBXSkuActivity})).booleanValue();
        }
        return tBXSkuActivity.N3();
    }

    public static /* synthetic */ JSONObject m3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95b6c438", new Object[]{tBXSkuActivity, jSONObject, new Boolean(z)});
        }
        return tBXSkuActivity.R3(jSONObject, z);
    }

    public static /* synthetic */ void n3(TBXSkuActivity tBXSkuActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67387650", new Object[]{tBXSkuActivity, str});
        } else {
            tBXSkuActivity.L3(str);
        }
    }

    public static /* synthetic */ void o3(TBXSkuActivity tBXSkuActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d167fe6f", new Object[]{tBXSkuActivity, str});
        } else {
            tBXSkuActivity.K3(str);
        }
    }

    public static /* synthetic */ TBXSkuCore p3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBXSkuCore) ipChange.ipc$dispatch("52770750", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.e;
    }

    public static /* synthetic */ String q3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7c6675d", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.W3();
    }

    public static /* synthetic */ String r3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4585df5e", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.X3();
    }

    public static /* synthetic */ String s3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9345575f", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.Y3();
    }

    public static /* synthetic */ boolean t3(TBXSkuActivity tBXSkuActivity, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b49afd", new Object[]{tBXSkuActivity, str, map, new Boolean(z)})).booleanValue();
        }
        return tBXSkuActivity.k4(str, map, z);
    }

    public static /* synthetic */ Runnable u3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4e264397", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.i;
    }

    public static /* synthetic */ Intent v3(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("644f2bfc", new Object[]{tBXSkuActivity, jSONObject, new Boolean(z)});
        }
        return tBXSkuActivity.P3(jSONObject, z);
    }

    public static /* synthetic */ Handler w3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4b37ef5f", new Object[]{tBXSkuActivity});
        }
        return tBXSkuActivity.f9547a;
    }

    public static /* synthetic */ boolean x3(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865bdea", new Object[]{tBXSkuActivity})).booleanValue();
        }
        return tBXSkuActivity.d4();
    }

    public static /* synthetic */ void y3(TBXSkuActivity tBXSkuActivity, int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2789599b", new Object[]{tBXSkuActivity, new Integer(i), intent});
        } else {
            tBXSkuActivity.O3(i, intent);
        }
    }

    public static /* synthetic */ JSONObject z3(TBXSkuActivity tBXSkuActivity, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("691cdb89", new Object[]{tBXSkuActivity, mtopResponse});
        }
        return tBXSkuActivity.h4(mtopResponse);
    }

    public final void J3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b986cb4", new Object[]{this, jSONObject});
            return;
        }
        String Z3 = Z3(jSONObject);
        if (!TextUtils.isEmpty(Z3)) {
            IntentModel intentModel = this.b;
            SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_REDIRECT_URL_E, "商品出现降级 redirectUrl: " + Z3, intentModel.f9595a, intentModel.f);
        }
    }

    public final void K3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697d4a8e", new Object[]{this, str});
            return;
        }
        IntentModel intentModel = this.b;
        if (intentModel == null || !intentModel.b()) {
            Intent intent = new Intent();
            intent.setAction("cartRefreshData");
            intent.putExtra("result", "fail");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("stringifyAddCartResult", str);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    public final void L3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b33ed4", new Object[]{this, str});
            return;
        }
        IntentModel intentModel = this.b;
        if (intentModel == null || !intentModel.b()) {
            Intent intent = new Intent();
            intent.setAction("cartRefreshData");
            intent.putExtra("result", "success");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("stringifyAddCartResult", str);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            SkuLogUtils.k("TBXSkuActivity.broadcastAddCartSuccess");
        }
    }

    public final void M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d535775c", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public final void O3(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d39dbe", new Object[]{this, new Integer(i), intent});
            return;
        }
        setResult(i, intent);
        finish();
    }

    public final Intent P3(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("6bf71836", new Object[]{this, jSONObject, new Boolean(z)});
        }
        if (z) {
            str = to8.ADD_CART;
        } else {
            str = go2.EVENT_TYPE;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null) {
            str4 = jSONObject2.getString("itemId");
            str3 = jSONObject2.getString(q2q.KEY_SKU_ID);
            str2 = jSONObject2.getString("quantity");
        } else {
            str4 = "";
            str2 = str4;
            str3 = str2;
        }
        Intent intent = new Intent();
        intent.putExtra("id", str4);
        intent.putExtra(q2q.KEY_SKU_ID, str3);
        intent.putExtra("sku_quantity", str2);
        return intent;
    }

    public final JSONObject R3(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ed364f1", new Object[]{this, jSONObject, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        if (z) {
            str = to8.ADD_CART;
        } else {
            str = go2.EVENT_TYPE;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (jSONObject3 != null) {
            str4 = jSONObject3.getString("itemId");
            str3 = jSONObject3.getString(q2q.KEY_SKU_ID);
            str2 = jSONObject3.getString("quantity");
        } else {
            str4 = "";
            str2 = str4;
            str3 = str2;
        }
        jSONObject2.put("itemId", (Object) str4);
        jSONObject2.put(q2q.KEY_SKU_ID, (Object) str3);
        jSONObject2.put("quantity", (Object) str2);
        return jSONObject2;
    }

    public final JSONObject S3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f221e288", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject(go2.EVENT_TYPE);
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject2;
    }

    public final String T3(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("825a373a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(to8.ADD_CART)) == null) {
            return null;
        }
        return jSONObject2.getString("addCartResult");
    }

    public final JSONObject U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80b87576", new Object[]{this});
        }
        return new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1
            {
                put("actionFrom", "CLOSE_BTN");
                put("inputMode", (Object) TBXSkuActivity.F3(TBXSkuActivity.this).e);
                put(go2.EVENT_TYPE, (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1.1
                    {
                        put("itemId", (Object) TBXSkuActivity.p3(TBXSkuActivity.this).p());
                    }
                });
                put(to8.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1.2
                    {
                        put("itemId", (Object) TBXSkuActivity.p3(TBXSkuActivity.this).p());
                    }
                });
            }
        };
    }

    public final String V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("140c133a", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.s;
        }
        return p2q.SKU_MSG_DEPRESS_SHOW_H5_SKU;
    }

    public final String W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.f9595a;
        }
        return null;
    }

    public final String X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649a4eaf", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel == null) {
            return "";
        }
        if (TextUtils.isEmpty(intentModel.b)) {
            return (String) ((HashMap) this.b.g).get("openFrom");
        }
        return this.b.b;
    }

    public final String Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fc3e7ca", new Object[]{this});
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.f;
        }
        return null;
    }

    public final String Z3(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c3db74", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE)) == null || jSONObject2.isEmpty()) {
            return null;
        }
        return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
    }

    public final void a4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275ebed1", new Object[]{this, jSONObject});
            return;
        }
        this.g = new c0s(this);
        this.e.q().e0(this.g);
        this.e.s(jSONObject);
        this.e.O();
    }

    public void addSkuInRootContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f17eed", new Object[]{this, view});
        } else if (view != null && !d4()) {
            this.c.setVisibility(8);
            this.d.removeAllViews();
            this.d.addView(view, -1, -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449679b3", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = new TBXSkuCore(this, this.f);
        this.e = tBXSkuCore;
        tBXSkuCore.I(this.b.l);
        this.e.N(this.b.k);
        this.e.K(this.b.c());
        this.e.J(new c());
        this.e.q().v0(new d());
    }

    public final boolean d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c07544b", new Object[]{this})).booleanValue();
        }
        if (isFinishing()) {
            return true;
        }
        return isDestroyed();
    }

    public final boolean e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98ede26", new Object[]{this})).booleanValue();
        }
        IntentModel intentModel = this.b;
        if (intentModel != null) {
            return intentModel.r;
        }
        return false;
    }

    public void f4(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584bc307", new Object[]{this, new Integer(i), str});
        } else {
            g4(null, i, str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, R.anim.xsku_slide_down);
    }

    public void g4(Map<String, String> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d1922e", new Object[]{this, map, new Integer(i), str});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("openFrom", X3());
        map.put("itemId", W3());
        map.put("utdid", UTDevice.getUtdid(getApplicationContext()));
        bw7.b(map, i, str);
    }

    public final JSONObject h4(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8d14731", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        String str = new String(mtopResponse.getBytedata());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a58.f(str);
    }

    public final void j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5358779", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.sku.intent.action.updateData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.h = new SkuUpdateDataReceiver();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.h, intentFilter);
        this.e.L(new SkuActionCallback());
    }

    public final void o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcacb80", new Object[]{this});
            return;
        }
        try {
            if (this.h != null) {
                LocalBroadcastManager.getInstance(this).unregisterReceiver(this.h);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        AliXSkuPresenterEngine.b m = this.e.q().I().m();
        if (m == null || !m.onBackPressed()) {
            vkb w = this.e.q().w();
            if (w != null) {
                w.a(U3());
            }
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        o4();
        TBXSkuCore tBXSkuCore = this.e;
        if (tBXSkuCore != null) {
            tBXSkuCore.m();
        }
        this.f9547a.removeCallbacks(this.i);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c0s c0sVar = this.g;
        if (c0sVar != null) {
            c0sVar.p();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c0s c0sVar = this.g;
        if (c0sVar != null) {
            c0sVar.q();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        c0s c0sVar = this.g;
        if (c0sVar != null) {
            c0sVar.r();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        c0s c0sVar = this.g;
        if (c0sVar != null) {
            c0sVar.s();
        }
    }

    public final void p4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2021a435", new Object[]{this, jSONObject});
            return;
        }
        J3(jSONObject);
        TBXSkuCore tBXSkuCore = this.e;
        if (tBXSkuCore != null) {
            tBXSkuCore.V(jSONObject);
        }
    }

    public final boolean N3() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cff67e2", new Object[]{this})).booleanValue();
        }
        JSONObject E = this.e.q().E();
        if (E == null || (jSONObject = E.getJSONObject("feature")) == null) {
            return false;
        }
        return "true".equals(jSONObject.getString("enableMSOAReturnAdapt"));
    }

    public final Intent Q3(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f302e2d4", new Object[]{this, intent, jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(go2.EVENT_TYPE, "true");
        JSONObject jSONObject2 = jSONObject.getJSONObject(go2.EVENT_TYPE);
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        intent.putExtra("sourceType", "11");
        intent.putExtra("buildOrderParamsBundle", bundle);
        return intent;
    }

    public final boolean l4(String str, Map<String, String> map, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5421ccc", new Object[]{this, str, map, new Boolean(z), iRemoteBaseListener})).booleanValue();
        }
        k3q k3qVar = new k3q(this, new SkuRequestParams(str, map));
        k3qVar.b(iRemoteBaseListener);
        boolean a2 = k3qVar.a();
        if (!a2) {
            m0u.b(this, p2q.SKU_MSG_MTOP_INIT_FAILED, 1);
        }
        return a2;
    }

    public final boolean m4(Map<String, String> map, owc owcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42b8ee02", new Object[]{this, map, owcVar})).booleanValue();
        }
        Intent intent = new Intent();
        intent.putExtra("id", W3());
        MainRequestParams mainRequestParams = new MainRequestParams(intent);
        map.put("skuOutSdk", "true");
        map.put("container_type", "sku");
        map.put("isPrefetchSkuMtop", "false");
        IntentModel intentModel = this.b;
        if (intentModel != null && !TextUtils.isEmpty(intentModel.e)) {
            map.put("skuType", this.b.e.toLowerCase());
        }
        mainRequestParams.getExParams().remove("openFrom");
        mainRequestParams.updateRefreshParams(map);
        y0i y0iVar = new y0i(mainRequestParams);
        y0iVar.q(new MainRequestCallback(mainRequestParams, owcVar));
        y0iVar.c();
        return true;
    }

    public final void n4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25160269", new Object[]{this, jSONObject});
            return;
        }
        J3(jSONObject);
        if (!d4()) {
            if (!e4() || !n2q.c(jSONObject, this.b.l)) {
                IntentModel intentModel = this.b;
                if (intentModel != null && intentModel.t && !TextUtils.isEmpty(Z3(jSONObject))) {
                    f4(-700027, "isDepressShowRedirectSku");
                    m0u.b(this, this.b.u, 1);
                    O3(15, null);
                } else if (!n2q.d(jSONObject, this.b.l)) {
                    f4(700019, "isNotSupportNewSku");
                    m0u.b(this, p2q.SKU_MSG_NOT_SUPPORT, 1);
                    O3(15, null);
                } else {
                    a4(jSONObject);
                }
            } else {
                f4(-700026, "isDepressShowH5Sku");
                m0u.b(this, V3(), 1);
                O3(15, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class SkuActionCallback implements vkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(785383434);
            t2o.a(442499149);
        }

        public SkuActionCallback() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
            if (r3.equals("CLOSE_BTN") != false) goto L_0x008b;
         */
        @Override // tb.vkb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.alibaba.fastjson.JSONObject r13) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.TBXSkuActivity.SkuActionCallback.a(com.alibaba.fastjson.JSONObject):void");
        }
    }

    public final void i4() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b635e52", new Object[]{this});
            return;
        }
        txl.h().m(this.b.l, "FirstScreenPaint");
        if (!TextUtils.isEmpty(this.b.w) && (b2 = kxf.b(this.b.w)) != null) {
            long longValue = b2.getLongValue("JSBRIDGE_START_UPTIME");
            long longValue2 = b2.getLongValue("MSOA_START_UPTIME");
            long longValue3 = b2.getLongValue("MSOA_END_UPTIME");
            if (!(longValue == 0 || longValue2 == 0)) {
                txl.h().d("jsBridge", TBBuyPreloadScene.NAV, longValue, longValue2, null);
            }
            if (!(longValue2 == 0 || longValue3 == 0)) {
                txl.h().d("mosa", TBBuyPreloadScene.NAV, longValue2, longValue3, null);
            }
        }
        txl.h().d(TBBuyPreloadScene.NAV, TBBuyPreloadScene.NAV, this.b.v, uwl.a(), null);
        txl.h().q("beforeMtop", "container");
    }

    public final boolean k4(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a51ddf2", new Object[]{this, str, map, new Boolean(z)})).booleanValue();
        }
        txl.h().p("beforeMtop", null);
        txl.h().q("mtop", "container");
        String str2 = (String) ((HashMap) this.b.g).get("openFrom");
        boolean a2 = v7j.a(this, str2);
        if ((!Localization.o() && !a2) || !ybl.b()) {
            return l4(str, map, z, new TBXSkuResponseListener(this, this.f9547a, z, str2));
        }
        TBXSkuResponseListener tBXSkuResponseListener = new TBXSkuResponseListener(this, this.f9547a, z, str2);
        a aVar = new a(tBXSkuResponseListener, str2);
        this.i = new b(tBXSkuResponseListener);
        if (!ybl.c()) {
            return m4(map, aVar);
        }
        String str3 = p2q.SKU_PREFETCH_TOKEN_PREFIX + W3() + "_" + X3();
        a4o a4oVar = new a4o(str3);
        if (a4oVar.g() == null) {
            SkuLogUtils.k("prefetchSkuMtop 尚未发起预请求 此时需要发起请求");
            return m4(map, aVar);
        }
        a4o.a e = a4oVar.e();
        if (e == null) {
            a4oVar.m(aVar);
            SkuLogUtils.k("prefetchSkuMtop 缓存中没有预请求的返回结果 直接设置回调 等待接口返回后执行回调");
            this.f9547a.postDelayed(this.i, j);
        } else {
            String b2 = e.b();
            MtopInfo a3 = e.a();
            SkuLogUtils.k("prefetchSkuMtop 缓存中存在预请求成功的接口数据 直接执行回调 status:" + b2);
            if (TextUtils.equals(b2, "success")) {
                aVar.a(a3, 0, null, null);
            } else {
                aVar.b(a3, 0, null);
            }
            SkuLogUtils.k("prefetchSkuMtop 主动触发执行回调后清理token:" + str3);
            a4oVar.b();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.XSku_Dialog_Activity);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(51);
        overridePendingTransition(R.anim.xsku_slide_up, 0);
        getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        this.b = new IntentModel(getIntent());
        i4();
        IntentModel intentModel = this.b;
        if (intentModel.m) {
            SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_INIT_E, intentModel.o, intentModel.f9595a, intentModel.f);
            if (TextUtils.isEmpty(this.b.f9595a)) {
                f4(-700018, "ItemIdEmpty");
            }
            m0u.b(this, this.b.o, 1);
            O3(this.b.n, null);
            return;
        }
        if (!TextUtils.isEmpty(intentModel.d)) {
            this.f = this.b.d;
        }
        setContentView(R.layout.xsku_activity_tbxsku);
        this.c = (ViewGroup) findViewById(R.id.xsku_container_progress);
        this.d = (ViewGroup) findViewById(R.id.xsku_activity_root_container);
        View findViewById = findViewById(R.id.ll_preset_container);
        View findViewById2 = findViewById(R.id.progress_bar);
        int i = 8;
        findViewById.setVisibility(o2q.e() ? 0 : 8);
        if (!o2q.e()) {
            i = 0;
        }
        findViewById2.setVisibility(i);
        getWindow().setLayout(-1, -1);
        getWindow().setGravity(80);
        b4();
        j4();
        if (Boolean.TRUE.toString().equals(this.b.x)) {
            SkuCore.l = true;
            Toast.makeText(this, "slLoad true", 0).show();
        } else if (Boolean.FALSE.toString().equals(this.b.x)) {
            SkuCore.l = false;
            Toast.makeText(this, "slLoad false", 0).show();
        }
        IntentModel intentModel2 = this.b;
        if (!k4(intentModel2.f9595a, intentModel2.g, true)) {
            IntentModel intentModel3 = this.b;
            SkuLogUtils.c(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_URL_DOWNGRADE_INIT_E, "Mtop初始化失败!", intentModel3.f9595a, intentModel3.f);
            O3(14, null);
        }
    }

    public final void c4(String str, Map<String, Object> map) {
        try {
            rrh.class.getDeclaredMethod("onRequestSuccess", String.class, Map.class).invoke(rrh.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str, map);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                rrh.e().l(str, map);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
