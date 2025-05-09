package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode;
import com.taobao.android.dinamicx.widget.e;
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.dinamicx.widget.z;
import tb.kxb;
import tb.le5;
import tb.lxb;
import tb.me5;
import tb.qub;
import tb.rl6;
import tb.sn6;
import tb.u28;
import tb.v5z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w implements kxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lxb f7534a;
    public final lxb b;
    public final qub c;
    public final qub d;
    public final qub e;
    public final qub f = new r.a(new u28());
    public final qub g = new rl6.a(new v5z());

    public w() {
        me5 me5Var = new me5();
        le5 le5Var = new le5();
        this.c = new sn6(new e.a(), me5Var);
        this.d = new sn6(new z.c(), le5Var);
        this.e = new sn6(new DXOCRImageViewWidgetNode.a(), le5Var);
    }

    @Override // tb.kxb
    public qub get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("a3667fbc", new Object[]{this, new Long(j)});
        }
        if (j == -4224482009255257824L) {
            return this.c;
        }
        if (j == z.DX_WIDGET_ID) {
            return this.d;
        }
        if (j == u28.DXMEGAFLOWLAYOUT_MEGAFLOWLAYOUT) {
            return this.f;
        }
        if (j == DXOCRImageViewWidgetNode.DXOCRIMAGEVIEW_OCRIMAGEVIEW) {
            return this.e;
        }
        if (j == b0.DXMEGAPRICEVIEW_MEGAPRICEVIEW) {
            return this.g;
        }
        return null;
    }
}
