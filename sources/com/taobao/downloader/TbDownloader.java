package com.taobao.downloader;

import android.content.Context;
import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.downloader.manager.PriorityTaskManager;
import com.taobao.tao.Globals;
import java.io.File;
import java.io.Serializable;
import tb.a25;
import tb.c21;
import tb.dxm;
import tb.ey1;
import tb.h5s;
import tb.hzi;
import tb.is7;
import tb.rv7;
import tb.sb;
import tb.sx3;
import tb.u11;
import tb.vd9;
import tb.vw0;
import tb.xh4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbDownloader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DOWNLOAD_STRATEGY_OPT = "downloader_strategy_opt";
    private static final String DOWNLOAD_TASK_OPT = "downloader_task_opt";
    private static final String TAG = "TbDownloader";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final vd9 f10390a = new vd9();

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                this.f10390a.g();
            } else if (i == 50) {
                this.f10390a.f();
            }
        }
    }

    private static boolean abSwitchLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba8a73cb", new Object[]{str})).booleanValue();
        }
        try {
            return new File(ey1.SWITCH_FILE_DIR, str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static rv7 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv7) ipChange.ipc$dispatch("9a210597", new Object[0]);
        }
        return rv7.e();
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            getInstance();
        }
    }

    private static void initABGlobal(Context context) {
        try {
            boolean isDownloaderAsync = AwcnConfig.isDownloaderAsync();
            xh4.r = isDownloaderAsync;
            if (!isDownloaderAsync) {
                boolean abSwitchLocal = abSwitchLocal(DOWNLOAD_STRATEGY_OPT);
                xh4.r = abSwitchLocal;
                if (abSwitchLocal) {
                    AwcnConfig.setDownloadAsync(true);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            xh4.s = ((Boolean) ABGlobal.class.getMethod("isFeatureOpened", Context.class, String.class).invoke(ABGlobal.class, context, DOWNLOAD_TASK_OPT)).booleanValue();
        } catch (Throwable unused2) {
        }
    }

    private static void initDownLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2820ce5f", new Object[0]);
            return;
        }
        if (xh4.f31395a == null) {
            xh4.f31395a = Globals.getApplication();
        }
        initABGlobal(xh4.f31395a);
        initOrange();
        xh4.k = isDebug(xh4.f31395a);
        xh4.e = new dxm();
        xh4.d = new a25();
        xh4.b = new h5s();
        xh4.c = new hzi();
        xh4.i = new is7();
        xh4.j = new sx3();
        xh4.l = sb.class;
        xh4.m = vw0.class;
        xh4.g = new PriorityTaskManager();
        c21.c(new a());
    }

    private static void initOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d10e5", new Object[0]);
            return;
        }
        try {
            xh4.q = AwcnConfig.getRangeBoostOpen();
            xh4.p = AwcnConfig.getFragmentFileLengthThreshold();
        } catch (Throwable unused) {
        }
    }

    private static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }
}
