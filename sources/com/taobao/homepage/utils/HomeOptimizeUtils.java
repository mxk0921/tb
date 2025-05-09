package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.speed.TBSpeed;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.bqa;
import tb.f4b;
import tb.h2b;
import tb.huv;
import tb.o6h;
import tb.t2o;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HomeOptimizeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.homepage.utils.HomeOptimizeUtils$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10604a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ a c;
        public final /* synthetic */ long d;
        public final /* synthetic */ o6h e;

        public AnonymousClass1(long j, boolean z, a aVar, long j2, o6h o6hVar) {
            this.f10604a = j;
            this.b = z;
            this.c = aVar;
            this.d = j2;
            this.e = o6hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LauncherRuntime.c();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.homepage.utils.HomeOptimizeUtils.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    huv.c("Page_Home", 19999, "tb_start_opt", new HashMap<String, String>() { // from class: com.taobao.homepage.utils.HomeOptimizeUtils.1.1.1
                        {
                            put("forec_excute_duration", String.valueOf(System.currentTimeMillis() - AnonymousClass1.this.f10604a));
                            put(WeexPopContainer.PARAMS_SHOW_LOADING, String.valueOf(AnonymousClass1.this.b));
                        }
                    });
                    if (AnonymousClass1.this.c != null) {
                        bqa.d("Home_OptLoading", "executeLauncherTask finish = " + (SystemClock.uptimeMillis() - AnonymousClass1.this.d));
                        AnonymousClass1.this.c.a();
                    }
                    try {
                        o6h o6hVar = AnonymousClass1.this.e;
                        if (o6hVar != null) {
                            o6hVar.dismiss();
                        }
                    } catch (Throwable th) {
                        bqa.d("Home_OptLoading", "loadingDialog error " + th.getMessage());
                    }
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(729809142);
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c32239", new Object[]{context, aVar});
        } else {
            b(context, aVar, true);
        }
    }

    public static void b(Context context, a aVar, boolean z) {
        o6h o6hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a1d7bb", new Object[]{context, aVar, new Boolean(z)});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f4b.b("enableHomePageJumpToNextPageCostOpt2", true) || !c(context)) {
            if (!LauncherRuntime.h()) {
                bqa.d("Home_OptLoading", "executeLauncherTask showLoading = " + z);
                if (z) {
                    z6d c = h2b.a().c();
                    if (c == null) {
                        bqa.d("Home_OptLoading", "IPageProvider is null");
                        return;
                    }
                    Activity k1 = c.k1();
                    if (k1 == null) {
                        bqa.d("Home_OptLoading", "Activity is null ");
                        return;
                    }
                    o6h o6hVar2 = new o6h(k1, R.style.Dialog_Status_Container);
                    o6hVar2.setContentView(View.inflate(k1, R.layout.homepage_dialog_loading, null));
                    o6hVar2.setCancelable(false);
                    o6hVar2.setCanceledOnTouchOutside(false);
                    o6hVar2.c();
                    o6hVar2.show();
                    o6hVar = o6hVar2;
                } else {
                    o6hVar = null;
                }
                new Thread(new AnonymousClass1(System.currentTimeMillis(), z, aVar, uptimeMillis, o6hVar), "AddTimingLogThread").start();
            } else if (aVar != null) {
                bqa.d("Home_OptLoading", "executeLauncherTask isEnforceStageExecuted = " + (SystemClock.uptimeMillis() - uptimeMillis));
                aVar.a();
            }
        } else if (aVar != null) {
            bqa.d("Home_OptLoading", "executeLauncherTask needDirectPass = " + (SystemClock.uptimeMillis() - uptimeMillis));
            aVar.a();
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("517d5655", new Object[]{context})).booleanValue();
        }
        boolean isSpeedEdition = TBSpeed.isSpeedEdition(context, "tb_start_direct_pass");
        bqa.d("Home_OptLoading", "needDirectPass = " + isSpeedEdition);
        return isSpeedEdition;
    }
}
