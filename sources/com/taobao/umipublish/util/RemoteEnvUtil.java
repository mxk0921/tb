package com.taobao.umipublish.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.remote.TaopaiLoadConfig;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.taobao.R;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.ebg;
import tb.jfv;
import tb.ng8;
import tb.odg;
import tb.t2o;
import tb.xbt;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RemoteEnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str, String str2);

        void b();
    }

    static {
        t2o.a(944767253);
    }

    public static void a(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862e59a6", new Object[]{context, str, aVar});
        } else if (!b(context)) {
            aVar.a(PreRequestPresenter.SOURCE_RATE_HISTORY, "base env not support");
        } else if (c(str, false)) {
            aVar.b();
            jfv.k(str, false);
        } else {
            g(context, str, false, null, aVar);
            jfv.k(str, true);
        }
    }

    public static TaopaiLoadConfig d(Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaopaiLoadConfig) ipChange.ipc$dispatch("7ea3b5d3", new Object[]{context, str, aVar});
        }
        TaopaiLoadConfig l = new TaopaiLoadConfig.b().r(context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry)).n(TextUtils.equals(str, "guangguang")).o(true).m(false).p("guangguang").q(str).l();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.taopai.load.success");
        intentFilter.addAction("action.taopai.load.fail");
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.umipublish.util.RemoteEnvUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/umipublish/util/RemoteEnvUtil$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String str2;
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null && intent.getAction() != null) {
                    String action = intent.getAction();
                    action.hashCode();
                    if (action.equals("action.taopai.load.fail")) {
                        if (intent.getExtras() != null) {
                            str3 = intent.getStringExtra("error_code");
                            str2 = intent.getStringExtra(MUSAppMonitor.ERROR_MSG);
                        } else {
                            str3 = null;
                            str2 = null;
                        }
                        a aVar2 = a.this;
                        if (aVar2 != null) {
                            aVar2.a(str3, str2);
                        }
                        UmiPublishMonitor.B("taopai_remote", "init fail=" + str3 + " " + str2);
                        UmiPublishMonitor.w().c("start", "7001", "open_page_remote_module_init_fail", str2);
                    } else if (action.equals("action.taopai.load.success")) {
                        a aVar3 = a.this;
                        if (aVar3 != null) {
                            aVar3.b();
                        }
                        UmiPublishMonitor.B("taopai_remote", "BROADCAST_SUCCESS_ACTION");
                    }
                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(this);
                }
            }
        }, intentFilter);
        return l;
    }

    public static TaopaiLoadConfig e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaopaiLoadConfig) ipChange.ipc$dispatch("4f1b8a34", new Object[]{context, str});
        }
        return new TaopaiLoadConfig.b().m(false).n(false).o(true).p("guangguang").q(str).l();
    }

    public static TaopaiLoadConfig f(Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaopaiLoadConfig) ipChange.ipc$dispatch("d050a3dd", new Object[]{context, str, intent});
        }
        return new TaopaiLoadConfig.b().r(context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry)).n(TextUtils.equals(str, "guangguang")).m(false).o(true).s(intent).p("guangguang").q(str).l();
    }

    public static boolean h(Context context, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3401ff09", new Object[]{context, str, intent})).booleanValue();
        }
        if (!b(context)) {
            return false;
        }
        if (!c(str, false)) {
            jfv.k(str, true);
            g(context, str, false, intent, null);
            return false;
        }
        jfv.k(str, false);
        return true;
    }

    public static boolean c(String str, boolean z) {
        String str2;
        String str3;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b654e286", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            z2 = xbt.d();
            str2 = "";
        } catch (Throwable th) {
            String message = th.getMessage();
            th.printStackTrace();
            str2 = message;
        }
        if (!z2) {
            UmiPublishMonitor w = UmiPublishMonitor.w();
            if (z) {
                str3 = "open_page_remote_module_not_ready_check";
            } else {
                str3 = "open_page_remote_module_not_ready";
            }
            w.o("start", "7002", str3, str + "|" + str2);
        }
        return z2;
    }

    public static void g(Context context, String str, boolean z, Intent intent, a aVar) {
        TaopaiLoadConfig taopaiLoadConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7734c5", new Object[]{context, str, new Boolean(z), intent, aVar});
            return;
        }
        try {
            if (z) {
                taopaiLoadConfig = e(context, str);
            } else if (intent != null) {
                taopaiLoadConfig = f(context, str, intent);
            } else {
                taopaiLoadConfig = d(context, str, aVar);
            }
            xbt.b(context, taopaiLoadConfig, true ^ z, "litecreator");
        } catch (Throwable th) {
            String str2 = str + th.getMessage();
            th.printStackTrace();
            if (aVar != null) {
                aVar.a("-1", str2);
            }
            if (!z) {
                ebg.l(context, context.getResources().getString(R.string.gg_pub_shooting_module_load_failed_retry));
            }
            UmiPublishMonitor.w().c("start", "7001", "open_page_remote_module_init_fail", str2);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56b23371", new Object[]{context})).booleanValue();
        }
        odg.c("RemoteEnvUtil", "当前机型为：" + Build.MODEL);
        if (ydv.r()) {
            ebg.l(context, "该设备暂不支持发布，请更换设备");
            odg.c("RemoteEnvUtil", "在 orange 黑名单中");
            return false;
        } else if (!ng8.d(context)) {
            return true;
        } else {
            ebg.l(context, "您的设备架构过低，建议您更换设备后再发布噢");
            odg.c("RemoteEnvUtil", "32位包/设备暂不支持发布，请更换");
            UmiPublishMonitor.w().o("start", "7003", "open_page_cpu_not_suport", "cpu<=v7");
            return false;
        }
    }
}
