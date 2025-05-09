package com.taobao.mmad;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;
import tb.ei2;
import tb.hkb;
import tb.jgh;
import tb.mh2;
import tb.mjb;
import tb.nwi;
import tb.owi;
import tb.t2o;
import tb.ygm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TopShowBootImage implements hkb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopShowBootImage";
    private mh2 mChannel;
    private owi mMmAdManager;
    private FrameLayout rootView;

    static {
        t2o.a(573571078);
        t2o.a(736100365);
    }

    @Override // tb.hkb
    public String getBusinessCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ffdf296", new Object[]{this});
        }
        return nwi.BIZ_CODE;
    }

    @Override // tb.hkb
    public void instantiate(mjb mjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933fde58", new Object[]{this, mjbVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.mChannel = new mh2(mjbVar);
        owi owiVar = new owi(this.mChannel);
        this.mMmAdManager = owiVar;
        owiVar.k();
        jgh.a(TAG, "instantiate: cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tb.ckc
    public void onCreateView(BootImageInfo bootImageInfo, ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c79f3", new Object[]{this, bootImageInfo, ei2Var, new Integer(i)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        jgh.a(TAG, "onCreateView: ");
        this.mChannel.f(2001);
        this.mMmAdManager.h().i(ei2Var);
        ygm.b(this.mMmAdManager.h());
        FrameLayout frameLayout = (FrameLayout) ei2Var.b().getParent();
        this.rootView = frameLayout;
        this.mMmAdManager.l(frameLayout);
        jgh.a(TAG, "onCreateView end: cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tb.ckc
    public void onDownload(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2161d64", new Object[]{this, list, new Integer(i)});
            return;
        }
        jgh.a(TAG, "onDownload start. startType=" + i);
        this.mMmAdManager.g(list, i);
    }

    @Override // tb.ckc
    public void onStart(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270aeca8", new Object[]{this, list, new Integer(i)});
            return;
        }
        jgh.a(TAG, "onStart start. startType=" + i);
        this.mMmAdManager.j(list, i);
    }

    @Override // tb.ckc
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        jgh.a(TAG, "onTerminate: startType=" + i + ", closeType=" + i2);
        this.mMmAdManager.m(i, i2, i3);
    }

    @Override // tb.ckc
    public void onViewShown(ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc759ce", new Object[]{this, ei2Var, new Integer(i)});
            return;
        }
        jgh.a(TAG, "onViewShown: ");
        this.mChannel.g(2001);
    }
}
