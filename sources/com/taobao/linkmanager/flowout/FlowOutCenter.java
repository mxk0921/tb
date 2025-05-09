package com.taobao.linkmanager.flowout;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.ccrc.service.CcrcOffClientService;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.util.HashMap;
import tb.ah0;
import tb.gq9;
import tb.hq9;
import tb.iq9;
import tb.jq9;
import tb.p41;
import tb.pp9;
import tb.qa;
import tb.rg0;
import tb.s5b;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlowOutCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public pp9 f10929a;
    public final BroadcastReceiver b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements qa.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public boolean a(Intent intent, String str, String str2, Context context, qa.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d9a955e", new Object[]{this, intent, str, str2, context, bVar})).booleanValue();
            }
            vp9.a("linkx", "FlowOutCenter === onExternalRedirect === 进行跳出拦截");
            return FlowOutCenter.c(FlowOutCenter.this, intent, context, str, bVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final FlowOutCenter f10932a = new FlowOutCenter();

        static {
            t2o.a(744489073);
        }

        public static /* synthetic */ FlowOutCenter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlowOutCenter) ipChange.ipc$dispatch("87a7c417", new Object[0]);
            }
            return f10932a;
        }
    }

    static {
        t2o.a(744489070);
    }

    public static /* synthetic */ pp9 a(FlowOutCenter flowOutCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pp9) ipChange.ipc$dispatch("f90f228b", new Object[]{flowOutCenter});
        }
        return flowOutCenter.f10929a;
    }

    public static /* synthetic */ pp9 b(FlowOutCenter flowOutCenter, pp9 pp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pp9) ipChange.ipc$dispatch("9bf9c891", new Object[]{flowOutCenter, pp9Var});
        }
        flowOutCenter.f10929a = pp9Var;
        return pp9Var;
    }

    public static /* synthetic */ boolean c(FlowOutCenter flowOutCenter, Intent intent, Context context, String str, qa.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf1bdc5", new Object[]{flowOutCenter, intent, context, str, bVar})).booleanValue();
        }
        return flowOutCenter.d(intent, context, str, bVar);
    }

    public static FlowOutCenter f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowOutCenter) ipChange.ipc$dispatch("f7d9dd12", new Object[0]);
        }
        return b.a();
    }

    public final void e(FlowOutConfigData flowOutConfigData, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d42e633", new Object[]{this, flowOutConfigData, uri, intent});
        } else if (jq9.h(uri.toString(), jq9.d(flowOutConfigData, uri.getScheme()), flowOutConfigData)) {
            String uri2 = uri.toString();
            String queryParameter = uri.getQueryParameter("bc_fl_src");
            String queryParameter2 = uri.getQueryParameter(hq9.FL_OUT_ID);
            if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                uri2 = TFCCommonUtils.d(uri2, "bc_fl_src", queryParameter2);
            }
            intent.setData(Uri.parse(uri2 + hq9.LINK_PREFIX));
        }
    }

    public void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895efe3b", new Object[]{this, application});
            return;
        }
        vp9.a("linkx", "FlowOutCenter === registerFlowOut === 注册跳出模块");
        gq9.j(application);
        h(application);
        LocalBroadcastManager.getInstance(application).registerReceiver(this.b, new IntentFilter("afc_page_open_broadcast"));
    }

    public final void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bb498a", new Object[]{this, application});
            return;
        }
        try {
            FloutNewConfigData g = gq9.g();
            FlowOutConfigData f = gq9.f();
            if ((g == null || !g.newFloutEnable) && (f == null || !f.floutEnable)) {
                vp9.b("linkx", "FlowOutCenter === registerOutHook === 未开启外跳管控，放过");
                return;
            }
            vp9.a("linkx", "FlowOutCenter === registerOutHook === 注册跳出拦截监听");
            s5b.a(application, g);
            qa.c = new a();
        } catch (Exception e) {
            vp9.b("linkx", "FlowOutCenter === registerOutHook === error： " + e.toString());
        }
    }

    public FlowOutCenter() {
        this.b = new BroadcastReceiver() { // from class: com.taobao.linkmanager.flowout.FlowOutCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/flowout/FlowOutCenter$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if ("afc_page_open_broadcast".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("pageName");
                    if ("scan".equals(stringExtra) || "share".equals(stringExtra)) {
                        vp9.b("linkx", "FlowOutCenter === afc_page_open_broadcast === " + stringExtra);
                        String stringExtra2 = intent.getStringExtra("pageUrl");
                        long longExtra = intent.getLongExtra("openTimestamp", 0L);
                        if (longExtra <= 0) {
                            try {
                                longExtra = Long.parseLong(intent.getStringExtra("openTimestamp"));
                            } catch (Exception unused) {
                            }
                        }
                        FlowOutCenter.b(FlowOutCenter.this, new pp9());
                        FlowOutCenter.a(FlowOutCenter.this).f26224a = stringExtra;
                        FlowOutCenter.a(FlowOutCenter.this).b = stringExtra2;
                        FlowOutCenter.a(FlowOutCenter.this).c = longExtra;
                    }
                }
            }
        };
    }

    public void i(Context context, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1f2ab0", new Object[]{this, context, flowOutConfigData});
            return;
        }
        vp9.a("linkx", "AppController === showTips === 显示拦截tips");
        if (context != null) {
            String str = flowOutConfigData.blockTip;
            if (TextUtils.isEmpty(str)) {
                str = "正在努力尝试跳转，请先逛逛其他内容~";
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    public final boolean d(Intent intent, Context context, String str, qa.b bVar) {
        String str2;
        long j;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8d77f69", new Object[]{this, intent, context, str, bVar})).booleanValue();
        }
        Uri data = intent.getData();
        pp9 pp9Var = this.f10929a;
        if (pp9Var != null && !TextUtils.isEmpty(pp9Var.f26224a) && this.f10929a.c > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.f10929a.c;
            String dataString = intent.getDataString();
            if (!gq9.l() || j2 > gq9.i() || gq9.h() != 1) {
                j = -1;
                z = false;
                str2 = null;
            } else {
                if (CcrcContext.init(context, TbFcLinkInit.instance().ttid)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pageName", this.f10929a.f26224a);
                    hashMap.put("pageUrl", this.f10929a.b);
                    hashMap.put(rg0.JUMP_URL, dataString);
                    hashMap.put("timeDiff", Long.valueOf(j2));
                    RiskShowCustomizedResult detectWithActivate = CcrcOffClientService.getService().detectWithActivate(hashMap);
                    if (detectWithActivate.isSuccess()) {
                        z = detectWithActivate.isRisk();
                        str2 = detectWithActivate.getSampleID();
                        j = System.currentTimeMillis() - currentTimeMillis;
                    }
                }
                z = false;
                str2 = null;
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            iq9.d(this.f10929a, dataString, currentTimeMillis, z, j, str2);
            if (z) {
                vp9.a("linkx", "FlowOutCenter === FlowDistribute === 命中安全策略，外跳拦截");
                return false;
            }
        }
        if (data == null || !data.toString().contains("fl_out_green=true")) {
            FloutNewConfigData g = gq9.g();
            if (g != null && g.newFloutEnable) {
                return p41.e().g(intent, g, str, bVar);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url", intent.getDataString());
            ah0.d("flow_out_history_unexpect", "", "", hashMap2);
            FlowOutConfigData f = gq9.f();
            if (data == null || data.getScheme() == null) {
                vp9.a("linkx", "FlowOutCenter === FlowDistribute === app拦截流程，data为空");
                return p41.e().a(intent, f, str);
            }
            String scheme = data.getScheme();
            if (TextUtils.equals("http", scheme) || TextUtils.equals("https", scheme)) {
                vp9.a("linkx", "FlowOutCenter === FlowDistribute === 浏览器拦截流程");
                return true;
            }
            vp9.a("linkx", "FlowOutCenter === FlowDistribute === app拦截流程，data不为空");
            boolean a2 = p41.e().a(intent, f, str);
            if (a2) {
                e(f, data, intent);
            } else {
                i(context, f);
            }
            return a2;
        }
        vp9.a("linkx", "FlowOutCenter === FlowDistribute === 参数包含fl_out_green放过");
        return true;
    }
}
