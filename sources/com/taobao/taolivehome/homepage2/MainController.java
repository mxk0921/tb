package com.taobao.taolivehome.homepage2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import tb.c1j;
import tb.d5h;
import tb.d9m;
import tb.o5h;
import tb.r0h;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MainController implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int IMG_BIE_ID = 31;
    public static String IMG_BIE_TYPE = "taolivehome";
    public static String DINAMIC_BIZ_TYPE = "live_channel";
    private static AtomicInteger sRefCount = new AtomicInteger(0);

    public static void destroy4LiveHomeOnCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8d48e7", new Object[0]);
            return;
        }
        LiveHomeController.instance().destroy();
        sRefCount = new AtomicInteger(0);
    }

    public static void initializer(DinamicSdkManager.IDinamicRegister iDinamicRegister, ux9 ux9Var) {
        o5h o5hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff1afe0", new Object[]{iDinamicRegister, ux9Var});
            return;
        }
        r0h.a("MainController", "initializer");
        if (sRefCount.compareAndSet(0, 1)) {
            r0h.a("MainController", "initializer start");
            LiveHomeController.instance().setTemplateCardListOwner(new d5h());
            LiveHomeController.instance().loadTemplate(1);
            DinamicSdkManager dinamicSdkManager = new DinamicSdkManager(d9m.H().getDXBizType(), IMG_BIE_ID, IMG_BIE_TYPE);
            if (!(ux9Var == null || (o5hVar = ux9Var.b) == null)) {
                ((c1j) o5hVar).c(dinamicSdkManager.getDinamicEngine());
            }
            dinamicSdkManager.setIDinamicRegister(iDinamicRegister);
            LiveHomeController.instance().setDinamicSdkManager(dinamicSdkManager);
            return;
        }
        sRefCount.getAndIncrement();
    }

    public static void initializerPreload(DinamicSdkManager.IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e1d073", new Object[]{iDinamicRegister});
        }
    }

    public static void unInitializer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b36e90", new Object[0]);
            return;
        }
        r0h.a("MainController", "unInitializer");
        if (sRefCount.compareAndSet(1, 0)) {
            LiveHomeController.instance().destroy();
        } else if (sRefCount.get() > 0) {
            sRefCount.getAndDecrement();
        }
    }

    static {
        t2o.a(806356555);
    }
}
