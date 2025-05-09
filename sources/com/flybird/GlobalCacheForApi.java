package com.flybird;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird._FBDocumentInitializer;
import com.flybird.support.basics.AppContextHolder;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import tb.l2w;
import tb.mkf;
import tb.nkf;
import tb.okf;
import tb.os2;
import tb.pg1;
import tb.uca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalCacheForApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f4981a;

    public static synchronized void a() {
        synchronized (GlobalCacheForApi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (!f4981a) {
                uca.b(new os2("Conf:CtxDisplayMetrics", new mkf(AppContextHolder.f5004a), new Callable<DisplayMetrics>() { // from class: com.flybird.GlobalCacheForApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.util.DisplayMetrics] */
                    @Override // java.util.concurrent.Callable
                    public DisplayMetrics call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f5004a;
                        try {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
                            defaultDisplay.getRealMetrics(displayMetrics);
                            if (displayMetrics.heightPixels * 9 > displayMetrics.widthPixels * 16) {
                                return displayMetrics;
                            }
                            defaultDisplay.getMetrics(displayMetrics);
                            return displayMetrics;
                        } catch (Throwable unused) {
                            return context.getResources().getDisplayMetrics();
                        }
                    }
                }));
                uca.b(new os2("Conf:DefDisplayMetrics", new mkf(AppContextHolder.f5004a), new Callable<DisplayMetrics>() { // from class: com.flybird.GlobalCacheForApi.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, android.util.DisplayMetrics] */
                    @Override // java.util.concurrent.Callable
                    public DisplayMetrics call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f5004a;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                        return displayMetrics;
                    }
                }));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                uca.b(new os2("Timed:ActiveNetworkInfo", new okf(10L, timeUnit), new Callable<NetworkInfo>() { // from class: com.flybird.GlobalCacheForApi.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v5, types: [android.net.NetworkInfo, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public NetworkInfo call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        return ((ConnectivityManager) AppContextHolder.f5004a.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                }));
                uca.b(new os2("App:RpcEnv", new nkf(), new Callable<Integer>() { // from class: com.flybird.GlobalCacheForApi.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Integer] */
                    @Override // java.util.concurrent.Callable
                    public Integer call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        IpChange ipChange3 = Platform.$ipChange;
                        return 0;
                    }
                }));
                uca.b(new os2("Timed:EngineDocSwitches", new okf(120L, timeUnit), new Callable<_FBDocumentInitializer.CachingModel>() { // from class: com.flybird.GlobalCacheForApi.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.flybird._FBDocumentInitializer$CachingModel] */
                    @Override // java.util.concurrent.Callable
                    public _FBDocumentInitializer.CachingModel call() throws Exception {
                        int i;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        IpChange ipChange3 = Platform.$ipChange;
                        _FBDocumentInitializer.CachingModel cachingModel = new _FBDocumentInitializer.CachingModel();
                        cachingModel.f4985a = true;
                        cachingModel.b = true;
                        cachingModel.d = true;
                        cachingModel.e = true;
                        cachingModel.f = true;
                        cachingModel.g = true;
                        cachingModel.h = true;
                        cachingModel.i = true;
                        IpChange ipChange4 = FBDocumentAssistor.$ipChange;
                        Integer num = (Integer) uca.c("Timed:GlobalPerfRatio");
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        cachingModel.j = i;
                        boolean[] zArr = {cachingModel.f4985a, cachingModel.d, cachingModel.e, false, cachingModel.f, cachingModel.g, cachingModel.h, cachingModel.i};
                        IpChange ipChange5 = l2w.$ipChange;
                        long j = 0;
                        for (int i2 = 0; i2 < 8 && i2 < 16; i2++) {
                            if (zArr[i2]) {
                                j |= 1 << i2;
                            }
                        }
                        cachingModel.k = String.valueOf(j);
                        return cachingModel;
                    }
                }));
                uca.b(new os2("App:PackageInfo", new nkf(), new Callable<PackageInfo>() { // from class: com.flybird.GlobalCacheForApi.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, android.content.pm.PackageInfo] */
                    @Override // java.util.concurrent.Callable
                    public PackageInfo call() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        Context context = AppContextHolder.f5004a;
                        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    }
                }));
                uca.b(new os2("User:UserInfoId", new okf(10L, timeUnit), new Callable() { // from class: tb.laa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Platform.c();
                    }
                }));
                uca.b(new os2("App:TalkbackEnabled", new okf(10L, timeUnit), new Callable() { // from class: tb.maa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(Platform.a());
                    }
                }));
                uca.b(new os2("App:OlderVersionEnabled", new okf(10L, timeUnit), new Callable() { // from class: tb.naa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(Platform.g());
                    }
                }));
                uca.b(new os2("App:ApLang", new okf(10L, timeUnit), new Callable() { // from class: tb.oaa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Platform.b();
                    }
                }));
                uca.b(new os2("App:ServerTime", new okf(10L, timeUnit), new Callable() { // from class: tb.paa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Platform.e();
                    }
                }));
                uca.b(new os2("User:UtdidOrEquiv", new nkf(), new Callable() { // from class: tb.qaa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Platform.d();
                    }
                }));
                uca.b(new os2("Timed:ApsecTokenResult", new okf(120L, timeUnit), new Callable() { // from class: tb.raa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Platform.f();
                    }
                }));
                f4981a = true;
            }
        }
    }
}
