package com.taobao.bootimage.arch.flow.bootimage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import tb.epo;
import tb.m7c;
import tb.o4v;
import tb.t2o;
import tb.tm1;
import tb.usg;
import tb.uy3;
import tb.v4s;
import tb.wzi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BroadcastFlowInterceptor implements m7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10223a = true;
    public String b = "";
    public int c = 0;
    public final epo d = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends epo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/bootimage/BroadcastFlowInterceptor$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                tm1.a("BroadcastFlowInterceptor", "屏蔽超时 ：");
                BroadcastFlowInterceptor.d(BroadcastFlowInterceptor.this, true);
            }
        }
    }

    static {
        t2o.a(736100362);
        t2o.a(736100366);
    }

    public BroadcastFlowInterceptor() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.bootimage.arch.flow.bootimage.BroadcastFlowInterceptor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/bootimage/BroadcastFlowInterceptor$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && TextUtils.equals(intent.getAction(), "TBBootImageForbiddenModeBroadcast")) {
                    String stringExtra = intent.getStringExtra(v4s.PARAM_UPLOAD_STAGE);
                    if (TextUtils.equals(stringExtra, "startForbidden")) {
                        String stringExtra2 = intent.getStringExtra("timeout");
                        BroadcastFlowInterceptor.c(BroadcastFlowInterceptor.this, ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                        try {
                            BroadcastFlowInterceptor.c(BroadcastFlowInterceptor.this, Integer.parseInt(stringExtra2));
                        } catch (Exception e) {
                            tm1.b("BroadcastFlowInterceptor", "parse delay time error", e);
                        }
                        BroadcastFlowInterceptor.d(BroadcastFlowInterceptor.this, false);
                        BroadcastFlowInterceptor.e(BroadcastFlowInterceptor.this).removeCallbacksAndMessages(null);
                        BroadcastFlowInterceptor.e(BroadcastFlowInterceptor.this).sendEmptyMessageDelayed(1, BroadcastFlowInterceptor.b(BroadcastFlowInterceptor.this) * 1000);
                        tm1.a("BroadcastFlowInterceptor", "receive 屏蔽时间：" + (BroadcastFlowInterceptor.b(BroadcastFlowInterceptor.this) * 1000));
                        BroadcastFlowInterceptor.f(BroadcastFlowInterceptor.this, intent.getStringExtra("bizId"));
                        BroadcastFlowInterceptor broadcastFlowInterceptor = BroadcastFlowInterceptor.this;
                        BroadcastFlowInterceptor.g(broadcastFlowInterceptor, intent, BroadcastFlowInterceptor.b(broadcastFlowInterceptor));
                    }
                    if (TextUtils.equals(stringExtra, "stopForbidden")) {
                        tm1.a("BroadcastFlowInterceptor", "receive 解除屏蔽 ：");
                        BroadcastFlowInterceptor.f(BroadcastFlowInterceptor.this, "");
                        BroadcastFlowInterceptor.c(BroadcastFlowInterceptor.this, 0);
                        BroadcastFlowInterceptor.d(BroadcastFlowInterceptor.this, true);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TBBootImageForbiddenModeBroadcast");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        tm1.a("BroadcastFlowInterceptor", "注册屏蔽广播 ：");
        LocalBroadcastManager.getInstance(uy3.a()).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ int b(BroadcastFlowInterceptor broadcastFlowInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21cb7640", new Object[]{broadcastFlowInterceptor})).intValue();
        }
        return broadcastFlowInterceptor.c;
    }

    public static /* synthetic */ int c(BroadcastFlowInterceptor broadcastFlowInterceptor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5bb944b", new Object[]{broadcastFlowInterceptor, new Integer(i)})).intValue();
        }
        broadcastFlowInterceptor.c = i;
        return i;
    }

    public static /* synthetic */ boolean d(BroadcastFlowInterceptor broadcastFlowInterceptor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d969feee", new Object[]{broadcastFlowInterceptor, new Boolean(z)})).booleanValue();
        }
        broadcastFlowInterceptor.f10223a = z;
        return z;
    }

    public static /* synthetic */ epo e(BroadcastFlowInterceptor broadcastFlowInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("da97b36b", new Object[]{broadcastFlowInterceptor});
        }
        return broadcastFlowInterceptor.d;
    }

    public static /* synthetic */ String f(BroadcastFlowInterceptor broadcastFlowInterceptor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b23793ae", new Object[]{broadcastFlowInterceptor, str});
        }
        broadcastFlowInterceptor.b = str;
        return str;
    }

    public static /* synthetic */ void g(BroadcastFlowInterceptor broadcastFlowInterceptor, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b220c3d", new Object[]{broadcastFlowInterceptor, intent, new Integer(i)});
        } else {
            broadcastFlowInterceptor.h(intent, i);
        }
    }

    @Override // tb.m7c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c579d4a", new Object[]{this})).booleanValue();
        }
        if (!this.f10223a) {
            usg.d().e().c(wzi.LAUNCHER, "InBroadcastIntercept", this.b, String.valueOf(this.c), "", "");
        }
        return this.f10223a;
    }

    public final void h(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560b577c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) intent.getStringExtra("bizId"));
            jSONObject.put("page", (Object) "Page_Home");
            jSONObject.put("eventId", (Object) 19999);
            jSONObject.put("arg1", (Object) "broadcastFlowInterceptor");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", (Object) intent.getStringExtra("scene"));
            jSONObject2.put("ext", (Object) intent.getStringExtra("ext"));
            jSONObject2.put("timeout", (Object) Integer.valueOf(i));
            jSONObject.put("args", (Object) jSONObject2);
            o4v.b(jSONObject);
        } catch (Throwable th) {
            tm1.b("BroadcastFlowInterceptor", "commitUTMonitor", th);
        }
    }
}
