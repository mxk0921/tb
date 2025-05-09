package com.taobao.taolive.adapterimpl.global;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.taolive.adapterimpl.LiveRoomInit;
import com.taobao.taolive.room.H5EmbedView;
import com.taobao.taolive.room.H5EmbedWVPlugin;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveGoodsWVPlugin;
import com.taobao.taolive.room.openarchitecture.openh5.TaoliveOpenH5PlatformView;
import java.io.Serializable;
import tb.c21;
import tb.e51;
import tb.fqw;
import tb.fsw;
import tb.iiv;
import tb.j5m;
import tb.qmh;
import tb.t2o;
import tb.uvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoLiveApplication extends Application implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TaoLiveApplication.class.getSimpleName();

    static {
        t2o.a(779092305);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveApplication taoLiveApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/global/TaoLiveApplication");
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        init(Globals.getApplication());
    }

    public static void init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        new TaoApplication().onCreate(application);
        MKTHandler.d().e(application);
        LiveRoomInit.init();
        iiv.a();
        fsw.i("TaoLiveH5EmbedWVPlugin", H5EmbedWVPlugin.class, true);
        fqw.g(H5EmbedView.VIEW_TYPE, H5EmbedView.class, true);
        fqw.g(TaoliveOpenH5PlatformView.ViewType, TaoliveOpenH5PlatformView.class, true);
        fsw.i("TBLiveGoodsWVPlugin", TBLiveGoodsWVPlugin.class, true);
        e51 e51Var = new e51();
        e51Var.c(j5m.e(application));
        e51Var.d(j5m.f(application));
        qmh.f().k(e51Var);
        uvg.g().i(c21.i());
        Log.e("TaoLiveApplication", "application init time = " + (System.currentTimeMillis() - currentTimeMillis));
    }
}
