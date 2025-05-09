package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class GoodsBaseTempView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xea mGoodLiveContext;

    static {
        t2o.a(295698850);
    }

    public GoodsBaseTempView(xea xeaVar) {
        super(xeaVar.i());
        this.mGoodLiveContext = xeaVar;
    }

    public static /* synthetic */ Object ipc$super(GoodsBaseTempView goodsBaseTempView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/basemvplib/impl/GoodsBaseTempView");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void showPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7932290", new Object[]{this});
        }
    }
}
