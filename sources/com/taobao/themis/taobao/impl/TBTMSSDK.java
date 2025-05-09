package com.taobao.themis.taobao.impl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.solution.TMSGameSolution;
import com.taobao.themis.inside.TMSSDK;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.preload.a;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.mix.TMSTinyAppSolution;
import com.taobao.themis.weex.solution.TMSLegacyWeexSolution;
import com.taobao.themis.widget.TMSWidgetSolution;
import com.taobao.themis.widget.group.TMSWidgetIsomorphicSolution;
import java.io.Serializable;
import tb.cds;
import tb.g51;
import tb.h8s;
import tb.no8;
import tb.t2o;
import tb.v2i;
import tb.vxm;
import tb.yas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBTMSSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean isInitialized = false;

    static {
        t2o.a(847249481);
    }

    public static void initTBTMS(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5c30fc", new Object[]{application});
        } else {
            initTBTMS(application.getApplicationContext());
        }
    }

    private static void registerSolution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7d13c3", new Object[0]);
            return;
        }
        cds.c(TMSSolutionType.MIX, TMSTinyAppSolution.class);
        cds.c(TMSSolutionType.WIDGET, TMSWidgetSolution.class);
        cds.c(TMSSolutionType.CLUSTER_WIDGET, TMSWidgetIsomorphicSolution.class);
        cds.c(TMSSolutionType.MINIGAME, TMSGameSolution.class);
        cds.c(TMSSolutionType.WEEX, TMSLegacyWeexSolution.class);
    }

    public static void initTBTMS(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b425e5", new Object[]{context});
        } else {
            initTBTMS(context, true);
        }
    }

    public static void initTBTMSNew(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdeec5d", new Object[]{context});
            return;
        }
        TMSLogger.b("TBTMSSDK", "try init new");
        TMSSDK.init(context);
        if (!isInitialized) {
            registerSolution();
            TMSLogger.b("TBTMSSDK", "init new");
            no8 f = h8s.f(context, "enableAsyncInitTask");
            if (!f.d()) {
                yas.a();
            }
            vxm.b.e().a("enableAsyncExecuteTask", f.b());
            isInitialized = true;
            g51.b();
        }
    }

    public static void initTBTMS(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d1498f", new Object[]{context, new Boolean(z)});
            return;
        }
        TMSLogger.b("TBTMSSDK", "try init");
        if (h8s.a(context)) {
            TMSLogger.b("initTBTMSNew", "try init");
            initTBTMSNew(context);
            return;
        }
        TMSSDK.init(context);
        registerSolution();
        if (!isInitialized) {
            TMSLogger.b("TBTMSSDK", "init");
            isInitialized = true;
            no8 l = h8s.l(context, "enableAsyncExecuteTask", "[0,98],[99,100]");
            if (!l.d()) {
                yas.a();
            }
            vxm.b.e().a("enableAsyncExecuteTask", l.b());
            g51.b();
            if (z) {
                a.d();
                v2i.a();
                return;
            }
            Log.e("极简链路", "不执行 Themis 的预加载任务");
        }
    }
}
