package com.taobao.monitor.adapter;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.SessionManager;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.k52;
import tb.obk;
import tb.oua;
import tb.v5r;
import tb.x11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBAPMAdapterLauncherPart2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean init;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBAPMAdapterLauncherPart2 tBAPMAdapterLauncherPart2) {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                x11.d(OrangeConfig.getInstance().getConfigs(x11.ORANGE_NAMESPACE));
            }
        }
    }

    private void configOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb89897", new Object[]{this});
        } else if (v5r.c) {
            OrangeConfig.getInstance().registerListener(new String[]{x11.ORANGE_NAMESPACE}, new a(this), true);
        }
    }

    private static void initBatteryCanary(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5160a83", new Object[]{application});
        } else {
            k52.a(application);
        }
    }

    private void initLogin(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e2cf88", new Object[]{this, context});
        } else if (v5r.b) {
            final SessionManager instance = SessionManager.getInstance(context);
            oua.m = instance.getNick();
            oua.l = instance.getUserId();
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver(this) { // from class: com.taobao.monitor.adapter.TBAPMAdapterLauncherPart2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/adapter/TBAPMAdapterLauncherPart2$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    oua.m = instance.getNick();
                    oua.l = instance.getUserId();
                }
            });
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (!init) {
            init = true;
            initLogin(application);
            configOrange();
            initBatteryCanary(application);
        }
    }
}
