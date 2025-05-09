package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.data.FloutNewBrowserConfigData;
import com.taobao.linkmanager.flowout.data.FloutNewBrowserHostBean;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FloutNewConfigItemData;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.qa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p41 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STRATEGY_1 = 1;
    public static final int STRATEGY_2 = 2;
    public static final int STRATEGY_3 = 3;
    public static final int STRATEGY_4 = 4;
    public static final int STRATEGY_5 = 5;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25865a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ qa.b d;
        public final /* synthetic */ Dialog e;

        public a(p41 p41Var, String str, int i, Map map, qa.b bVar, Dialog dialog) {
            this.f25865a = str;
            this.b = i;
            this.c = map;
            this.d = bVar;
            this.e = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            vp9.a("linkx", "AppController.showConfirmDialog.onClick.允许跳出");
            ah0.d("flow_out_success", this.f25865a, String.valueOf(this.b), this.c);
            ah0.d("flow_out_alert_ok", this.f25865a, String.valueOf(this.b), this.c);
            this.d.a(true);
            this.e.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f25866a;

        public b(p41 p41Var, Dialog dialog) {
            this.f25866a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f25866a.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25867a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ qa.b d;

        public c(p41 p41Var, String str, int i, Map map, qa.b bVar) {
            this.f25867a = str;
            this.b = i;
            this.c = map;
            this.d = bVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            ah0.d("flow_out_alert_cancel", this.f25867a, String.valueOf(this.b), this.c);
            this.c.put("type", "cancel");
            ah0.d("flow_out_fail", this.f25867a, String.valueOf(this.b), this.c);
            vp9.a("linkx", "AppController.showConfirmDialog.onClick.拒绝跳出");
            this.d.a(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(p41 p41Var) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                vp9.a("linkx", "AppController.showConfirmDialog.onDismiss");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f25868a;
        public String b;
        public String c;

        static {
            t2o.a(744489085);
        }

        public e(int i) {
            this.f25868a = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final p41 f25869a = new p41();

        static {
            t2o.a(744489086);
        }

        public static /* synthetic */ p41 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p41) ipChange.ipc$dispatch("595b48c0", new Object[0]);
            }
            return f25869a;
        }
    }

    static {
        t2o.a(744489080);
    }

    public static p41 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p41) ipChange.ipc$dispatch("689754e5", new Object[0]);
        }
        return f.a();
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10ef324", new Object[]{this})).booleanValue();
        }
        return pm2.g().h();
    }

    public final int c(FloutNewConfigData floutNewConfigData, String str, Intent intent, Uri uri, String str2, String str3) {
        Integer num;
        FloutNewBrowserHostBean floutNewBrowserHostBean;
        String str4;
        FloutNewConfigItemData floutNewConfigItemData;
        Map<String, Integer> map;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("821ffe8f", new Object[]{this, floutNewConfigData, str, intent, uri, str2, str3})).intValue();
        }
        if (floutNewConfigData == null) {
            return 1;
        }
        try {
            if (!"https".equals(str2) && !"http".equals(str2)) {
                Map<String, FloutNewConfigItemData> map2 = floutNewConfigData.floutControl;
                if (map2 == null || (floutNewConfigItemData = map2.get(str)) == null) {
                    return gq9.k() ? 5 : 1;
                }
                if (floutNewConfigItemData.addNewTask) {
                    intent.addFlags(268435456);
                } else if (floutNewConfigItemData.needNewTask) {
                    intent.setFlags(268435456);
                }
                if (uri != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    Map<String, List<String>> map3 = floutNewConfigItemData.urlBlack;
                    if (!(map3 == null || (list = map3.get(str2)) == null || list.isEmpty())) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            String lowerCase = uri.toString().toLowerCase();
                            if (lowerCase.startsWith((str2 + HttpConstant.SCHEME_SPLIT + it.next()).toLowerCase())) {
                                vp9.a("linkx", "AppController === Hit url black list, url=" + lowerCase);
                                return 5;
                            }
                        }
                    }
                    Map<String, Map<String, Integer>> map4 = floutNewConfigItemData.schemeStrategy;
                    if (!(map4 == null || (map = map4.get(str2)) == null)) {
                        Integer num2 = map.get(str3);
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        Integer num3 = map.get("defaultStrategy");
                        if (num3 != null) {
                            return num3.intValue();
                        }
                    }
                    return floutNewConfigItemData.defaultStrategy;
                }
                return floutNewConfigItemData.defaultStrategy;
            }
            FloutNewBrowserConfigData floutNewBrowserConfigData = floutNewConfigData.browserFloutControl;
            if (floutNewBrowserConfigData != null) {
                Map<String, FloutNewBrowserHostBean> map5 = floutNewBrowserConfigData.hostStrategyPlus;
                if (!(map5 == null || map5.isEmpty() || (floutNewBrowserHostBean = map5.get(str3)) == null)) {
                    Map<String, Integer> map6 = floutNewBrowserHostBean.pathStrategy;
                    if (uri != null) {
                        str4 = uri.getPath();
                    } else {
                        str4 = "";
                    }
                    if (map6 != null && !TextUtils.isEmpty(str4)) {
                        for (Map.Entry<String, Integer> entry : map6.entrySet()) {
                            if (str4.toLowerCase().startsWith(entry.getKey())) {
                                Integer value = entry.getValue();
                                vp9.a("linkx", "AppController.getStrategyAndProcessFlag. url=" + uri + ", strategy=" + value);
                                return value.intValue();
                            }
                        }
                    }
                    Integer num4 = floutNewBrowserHostBean.defaultStrategy;
                    if (num4 != null) {
                        return num4.intValue();
                    }
                }
                Map<String, Integer> map7 = floutNewConfigData.browserFloutControl.hostStrategy;
                if (!((map5 != null && !map5.isEmpty()) || map7 == null || (num = map7.get(str3)) == null)) {
                    return num.intValue();
                }
                Integer num5 = floutNewConfigData.browserFloutControl.defaultStrategy;
                if (num5 != null) {
                    return num5.intValue();
                }
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    public boolean b(Intent intent, String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe08936", new Object[]{this, intent, str, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null) {
            vp9.a("linkx", "AppController === jumpProcess === flowOutConfig配置为空,放过不拦截");
            jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 0);
            return true;
        } else if (jq9.i(intent, flowOutConfigData)) {
            vp9.a("linkx", "AppController === jumpProcess === 系统跳转行为，放过不拦截 === intent:" + intent);
            jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 1);
            return true;
        } else {
            String stringExtra = intent.getStringExtra("source");
            if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("sso_auth")) {
                String stringExtra2 = intent.getStringExtra("jump_source");
                if (TextUtils.isEmpty(stringExtra2) || !TextUtils.equals("assistant", stringExtra2)) {
                    if (gq9.m()) {
                        String stringExtra3 = intent.getStringExtra(hq9.FLOW_OUT_SOURCE);
                        if (!TextUtils.isEmpty(stringExtra3) && TextUtils.equals("share", stringExtra3)) {
                            vp9.a("linkx", "AppController === jumpProcess === 分享，放过不拦截 === source=" + stringExtra3);
                            jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 9);
                            intent.removeExtra(hq9.FLOW_OUT_SOURCE);
                            return true;
                        }
                    }
                    Uri data = intent.getData();
                    if (data != null) {
                        String queryParameter = data.getQueryParameter(hq9.FL_OUT_ID);
                        if (TextUtils.isEmpty(queryParameter)) {
                            queryParameter = data.getQueryParameter(hq9.VISA);
                        }
                        if (queryParameter != null && TextUtils.equals(hq9.LOGIN_VISA, queryParameter)) {
                            return true;
                        }
                        if (jq9.a(queryParameter, flowOutConfigData)) {
                            vp9.a("linkx", "AppController === jumpProcess === flowOutIdWhiteList白名单内，放过不拦截 === intent:" + intent);
                            jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 2);
                            return true;
                        }
                    }
                    return false;
                }
                vp9.a("linkx", "AppController === jumpProcess === 小助手，放过不拦截 === source=" + stringExtra2);
                jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 7);
                return true;
            }
            vp9.a("linkx", "AppController === jumpProcess === 授权登录，放过不拦截 === source=".concat(stringExtra));
            jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 3);
            return true;
        }
    }

    public boolean a(Intent intent, FlowOutConfigData flowOutConfigData, String str) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8723956", new Object[]{this, intent, flowOutConfigData, str})).booleanValue();
        }
        Uri data = intent.getData();
        if (b(intent, str, flowOutConfigData)) {
            return true;
        }
        vp9.a("linkx", "AppController === jumpProcess === data=" + data);
        if (data == null) {
            List<FloutWhiteListBean> list = flowOutConfigData.floutWhiteList;
            if (list != null) {
                for (FloutWhiteListBean floutWhiteListBean : list) {
                    String str2 = floutWhiteListBean.packageName;
                    if (!TextUtils.isEmpty(str2) && TextUtils.equals(str, str2)) {
                        vp9.a("linkx", "AppController === jumpProcess === 在包名白名单内，放过不拦截 === packageName：" + str);
                        jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, str, 8);
                        return true;
                    }
                }
            }
        } else {
            String queryParameter = data.getQueryParameter(hq9.FL_OUT_ID);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = data.getQueryParameter(hq9.VISA);
            }
            String d2 = jq9.d(flowOutConfigData, data.getScheme());
            if (flowOutConfigData.floutIdEnable) {
                if (TextUtils.isEmpty(queryParameter)) {
                    vp9.a("linkx", "AppController === jumpProcess === flowOutId为空，进行拦截");
                    jq9.l(intent, d2, 3);
                    return false;
                } else if (!jq9.g(d2, queryParameter, flowOutConfigData) || !jq9.f(flowOutConfigData, data.getScheme())) {
                    i = 4;
                } else {
                    vp9.a("linkx", "AppController === jumpProcess === 在flowOutId合法列表内，放过不拦截 === floutId=" + queryParameter);
                    jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, d2, 5);
                    return true;
                }
            } else if (jq9.f(flowOutConfigData, data.getScheme())) {
                vp9.a("linkx", "AppController === jumpProcess === 在APP白名单内，放过不拦截 === data=" + data);
                jq9.n(iq9.ARG1_OUTGOING_AUTHORIZED, intent, d2, 4);
                return true;
            }
            jq9.l(intent, d2, i);
        }
        return false;
    }

    public final boolean h(Uri uri, String str, String str2, int i, qa.b bVar) {
        String str3;
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec3cb88e", new Object[]{this, uri, str, str2, new Integer(i), bVar})).booleanValue();
        }
        try {
            if (Boolean.parseBoolean(pg0.i().c("useDialogController", "false"))) {
                return fl7.c().d(uri, str, str2, i, bVar);
            }
            vp9.a("linkx", "AppController.showConfirmDialog.");
            HashMap hashMap = new HashMap();
            String str4 = "";
            hashMap.put("scheme", uri != null ? String.valueOf(uri.getScheme()) : str4);
            hashMap.put("host", uri != null ? String.valueOf(uri.getHost()) : str4);
            if (uri != null) {
                str4 = uri.toString();
            }
            hashMap.put("url", str4);
            Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
            if (currentActivity == null) {
                vp9.a("linkx", "AppController.showConfirmDialog.topActivity=null.pass.");
                ah0.d("flow_out_success", str, String.valueOf(i), hashMap);
                return true;
            }
            vp9.a("linkx", "AppController.showConfirmDialog.topActivity=" + currentActivity.getComponentName());
            Dialog dialog = new Dialog(currentActivity);
            dialog.requestWindowFeature(1);
            Window window = dialog.getWindow();
            if (window == null) {
                vp9.a("linkx", "AppController.showConfirmDialog.window=null.pass.");
                ah0.d("flow_out_success", str, String.valueOf(i), hashMap);
                return true;
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            View inflate = View.inflate(currentActivity, R.layout.flout_confirm_dialog, null);
            dialog.setContentView(inflate);
            dialog.setCanceledOnTouchOutside(false);
            str3 = "flow_out_success";
            try {
                ViewProxy.setOnClickListener(inflate.findViewById(R.id.confirm_yes), new a(this, str, i, hashMap, bVar, dialog));
                ViewProxy.setOnClickListener(inflate.findViewById(R.id.confirm_no), new b(this, dialog));
                if (!TextUtils.isEmpty(str2)) {
                    String string = Globals.getApplication().getResources().getString(R.string.afc_flout_toast);
                    if (!TextUtils.isEmpty(string)) {
                        ((TextView) inflate.findViewById(R.id.confirm_title)).setText(string + str2);
                    }
                }
                dialog.setOnCancelListener(new c(this, str, i, hashMap, bVar));
                dialog.setOnDismissListener(new d(this));
                dialog.show();
                window.setLayout((int) TFCCommonUtils.h(290.0f), -2);
                ah0.d("flow_out_show_alert", str, String.valueOf(i), hashMap);
                return false;
            } catch (Throwable th2) {
                th = th2;
                vp9.b("linkx", "AppController.showConfirmDialog.error." + th);
                ah0.d(str3, str, String.valueOf(i), new HashMap());
                return true;
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "flow_out_success";
        }
    }

    public boolean g(Intent intent, FloutNewConfigData floutNewConfigData, String str, qa.b bVar) {
        Uri uri;
        String str2;
        int i;
        String str3;
        String str4;
        FloutNewConfigItemData floutNewConfigItemData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7b5177", new Object[]{this, intent, floutNewConfigData, str, bVar})).booleanValue();
        }
        Uri data = intent.getData();
        vp9.a("linkx", "AppController === jumpProcessNew === uri=" + data);
        String str5 = "";
        String scheme = data != null ? data.getScheme() : str5;
        String host = data != null ? data.getHost() : str5;
        if (!TextUtils.isEmpty(str)) {
            str2 = "linkx";
            uri = data;
            int c2 = c(floutNewConfigData, str, intent, data, scheme, host);
            str3 = null;
            if (!(floutNewConfigData == null || floutNewConfigData.floutControl == null || TextUtils.isEmpty(str) || (floutNewConfigItemData = floutNewConfigData.floutControl.get(str)) == null)) {
                str3 = floutNewConfigItemData.name;
            }
            i = c2;
            str4 = str;
        } else {
            str2 = "linkx";
            uri = data;
            vp9.a(str2, "AppController === packageName is empty.");
            e d2 = d(floutNewConfigData, intent, uri, scheme, host);
            int i2 = d2.f25868a;
            String str6 = d2.b;
            if (!TextUtils.isEmpty(str6)) {
                vp9.a(str2, "AppController === rewrite packageName = " + str6);
            }
            str3 = d2.c;
            i = i2;
            str4 = str6;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scheme", String.valueOf(scheme));
        hashMap.put("host", String.valueOf(host));
        hashMap.put("url", String.valueOf(intent.getDataString()));
        if (intent.getComponent() != null) {
            str5 = intent.getComponent().toShortString();
        }
        hashMap.put("component", str5);
        hashMap.put("curPage", AfcLifeCycleCenter.instance().getCurrentActivityName());
        hashMap.put("curPageUrl", AfcLifeCycleCenter.instance().getCurrentActivityUrl());
        hashMap.put("prePage", AfcLifeCycleCenter.instance().getPreActivityName());
        hashMap.put("prePageUrl", AfcLifeCycleCenter.instance().getPreActivityUrl());
        boolean f2 = f();
        hashMap.put("isAutoJumpOut", String.valueOf(f2));
        boolean b2 = e().b(intent, str4, gq9.f());
        hashMap.put("canPassControl", String.valueOf(b2));
        ah0.d("flow_out_exposure", str4, String.valueOf(i), hashMap);
        vp9.a(str2, "AppController.jumpProcessNew === strategy=" + i + " === isAutoBrowserFlout=" + f2 + " === canPassControl =" + b2);
        if (b2) {
            ah0.d("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        }
        if (f2) {
            if (i == 1 || i == 2) {
                if (i == 2) {
                    return h(uri, str4, str3, i, bVar);
                }
                ah0.d("flow_out_success", str4, String.valueOf(i), hashMap);
                return true;
            } else if (i == 3 || i == 4 || i == 5) {
                hashMap.put("type", "ban");
                ah0.d("flow_out_fail", str4, String.valueOf(i), hashMap);
                return false;
            }
        }
        if (i == 2 || i == 3) {
            return h(uri, str4, str3, i, bVar);
        }
        if (i == 1 || i == 4) {
            ah0.d("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        } else if (i == 5) {
            hashMap.put("type", "ban");
            ah0.d("flow_out_fail", str4, String.valueOf(i), hashMap);
            return false;
        } else {
            ah0.d("flow_out_success", str4, String.valueOf(i), hashMap);
            return true;
        }
    }

    public final e d(FloutNewConfigData floutNewConfigData, Intent intent, Uri uri, String str, String str2) {
        Integer num;
        FloutNewBrowserHostBean floutNewBrowserHostBean;
        String str3;
        boolean z;
        Map<String, Integer> map;
        List<String> list;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5650f0d6", new Object[]{this, floutNewConfigData, intent, uri, str, str2});
        }
        if (floutNewConfigData == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new e(1);
        }
        if ("https".equals(str) || "http".equals(str)) {
            FloutNewBrowserConfigData floutNewBrowserConfigData = floutNewConfigData.browserFloutControl;
            if (floutNewBrowserConfigData != null) {
                Map<String, FloutNewBrowserHostBean> map2 = floutNewBrowserConfigData.hostStrategyPlus;
                if (!(map2 == null || map2.isEmpty() || (floutNewBrowserHostBean = map2.get(str2)) == null)) {
                    Map<String, Integer> map3 = floutNewBrowserHostBean.pathStrategy;
                    if (uri != null) {
                        str3 = uri.getPath();
                    } else {
                        str3 = "";
                    }
                    if (map3 != null && !TextUtils.isEmpty(str3)) {
                        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
                            if (str3.toLowerCase().startsWith(entry.getKey())) {
                                Integer value = entry.getValue();
                                vp9.a("linkx", "AppController.getStrategyAndProcessFlag. url=" + uri + ", strategy=" + value);
                                return new e(value.intValue());
                            }
                        }
                    }
                    if (floutNewBrowserHostBean.defaultStrategy != null) {
                        return new e(floutNewBrowserHostBean.defaultStrategy.intValue());
                    }
                }
                Map<String, Integer> map4 = floutNewConfigData.browserFloutControl.hostStrategy;
                if (!((map2 != null && !map2.isEmpty()) || map4 == null || (num = map4.get(str2)) == null)) {
                    return new e(num.intValue());
                }
                if (floutNewConfigData.browserFloutControl.defaultStrategy != null) {
                    return new e(floutNewConfigData.browserFloutControl.defaultStrategy.intValue());
                }
            }
            return new e(1);
        }
        Map<String, FloutNewConfigItemData> map5 = floutNewConfigData.floutControl;
        if (map5 != null) {
            FloutNewConfigItemData floutNewConfigItemData = null;
            String str4 = null;
            int i = 1;
            for (Map.Entry<String, FloutNewConfigItemData> entry2 : map5.entrySet()) {
                str4 = entry2.getKey();
                floutNewConfigItemData = entry2.getValue();
                if (floutNewConfigItemData != null) {
                    Map<String, List<String>> map6 = floutNewConfigItemData.urlBlack;
                    if (map6 != null && uri != null && (list = map6.get(str)) != null && !list.isEmpty()) {
                        Iterator<String> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String lowerCase = uri.toString().toLowerCase();
                            if (lowerCase.startsWith((str + HttpConstant.SCHEME_SPLIT + it.next()).toLowerCase())) {
                                vp9.a("linkx", "AppController === Hit url black list, url=".concat(lowerCase));
                                z2 = true;
                                i = 5;
                                break;
                            }
                        }
                    }
                    Map<String, Map<String, Integer>> map7 = floutNewConfigItemData.schemeStrategy;
                    if (!(map7 == null || (map = map7.get(str)) == null)) {
                        Integer num2 = map.get(str2);
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            Integer num3 = map.get("defaultStrategy");
                            if (num3 != null) {
                                i = num3.intValue();
                            }
                        }
                        z = true;
                        break;
                    }
                }
            }
            z = z2;
            e eVar = new e(i);
            if (z && floutNewConfigItemData != null) {
                if (floutNewConfigItemData.addNewTask) {
                    intent.addFlags(268435456);
                } else if (floutNewConfigItemData.needNewTask) {
                    intent.setFlags(268435456);
                }
                eVar.b = str4;
                eVar.c = floutNewConfigItemData.name;
            }
            return eVar;
        } else if (gq9.k()) {
            return new e(5);
        } else {
            return new e(1);
        }
    }
}
