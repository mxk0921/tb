package com.alipay.android.msp.framework.preload;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.MqpConfigService;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreloadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f3657a;
    public static final PreloadCache b = new PreloadCache();
    public static final PreloadConnection c = new PreloadConnection();
    public static boolean d = false;

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{new Long(j)})).booleanValue();
        }
        if (j > f3657a + 120000) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ PreloadCache access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadCache) ipChange.ipc$dispatch("c56cbdfc", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ PreloadConnection access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadConnection) ipChange.ipc$dispatch("39779a38", new Object[0]);
        }
        return c;
    }

    public static PreloadCache getPreloadCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadCache) ipChange.ipc$dispatch("89de97bb", new Object[0]);
        }
        return b;
    }

    public static boolean isPrepareVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5936a0e1", new Object[0])).booleanValue();
        }
        return MqpConfigService.isTrue(DrmKey.GRAY_VI_ENV_INFO_PRE_LOAD_10676);
    }

    public static void startPreLoad(final Context context) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d5e71a", new Object[]{context});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f3657a >= 3000) {
            if (GlobalHelper.getInstance().getContext() == null) {
                GlobalHelper.getInstance().init(context);
            }
            if (a(elapsedRealtime)) {
                j = elapsedRealtime;
            } else {
                long j2 = f3657a;
                j = j2 + (((elapsedRealtime - j2) / 60000) * 60000);
            }
            boolean a2 = a(elapsedRealtime);
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PreloadManager.access$000().startCache(60000L, context);
                    }
                }
            });
            long j3 = f3657a + 120000;
            for (int i = 1; i <= 2; i++) {
                long j4 = (60000 * i) + j;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (j4 > j3 && j4 > elapsedRealtime2) {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PreloadManager.access$000().startCache(60000L, context);
                            }
                        }
                    }, j4 - elapsedRealtime2);
                }
            }
            if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_PRELOAD_NETWORK, false, context) && elapsedRealtime - f3657a > 60000) {
                if (a2 || !d) {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PreloadManager.access$102(PreloadManager.access$200().startConnect());
                            }
                        }
                    });
                }
                long j5 = f3657a + 120000;
                for (int i2 = 1; i2 <= 2; i2++) {
                    long j6 = (i2 * 60000) + j;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (j6 > j5 && j6 > elapsedRealtime3) {
                        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    PreloadManager.access$102(PreloadManager.access$200().startConnect());
                                }
                            }
                        }, j6 - elapsedRealtime3);
                    }
                }
            }
            f3657a = j;
        }
    }
}
