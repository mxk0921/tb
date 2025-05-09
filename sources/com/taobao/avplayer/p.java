package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController.FullOritation f10198a;
    public final /* synthetic */ DWVideoViewController b;

    public p(DWVideoViewController dWVideoViewController, DWVideoViewController.FullOritation fullOritation) {
        this.b = dWVideoViewController;
        this.f10198a = fullOritation;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DWVideoViewController.v(this.b).requestLayout();
        DWVideoViewController.FullOritation fullOritation = this.f10198a;
        if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90 || fullOritation == DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
            DWVideoViewController.U(this.b, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
        } else {
            DWVideoViewController.U(this.b, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
        }
        DWVideoViewController.v(this.b).setLayerType(0, null);
        DWVideoViewController.C(this.b, false);
    }
}
