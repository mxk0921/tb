package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode;
import com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode;
import com.taobao.android.dinamicx.widget.DXWebViewWidgetNode;
import com.taobao.android.dinamicx.widget.a0;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.dinamicx.widget.l;
import com.taobao.android.dinamicx.widget.u;
import com.taobao.android.dinamicx.widget.video.DXProgressBarWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import com.taobao.android.dinamicx.widget.z;
import tb.kxb;
import tb.qub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x implements kxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qub f7535a = new u.a();
    public final qub b = new l.c();
    public final qub c = new DXHorizontalAutoScrollLayoutWidgetNode.b();
    public final qub d = new z.c();
    public final qub e = new DXOCRImageViewWidgetNode.a();
    public final qub f = new DXWebViewWidgetNode.a();
    public final qub g = new DXVideoViewWidgetNode.d();
    public final qub h = new DXProgressBarWidgetNode.a();
    public final qub i = new b0.a();
    public final qub j = new a0.a();

    @Override // tb.kxb
    public qub get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("a3667fbc", new Object[]{this, new Long(j)});
        }
        if (j == -4224482009255257824L) {
            return this.f7535a;
        }
        if (j == l.DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT) {
            return this.b;
        }
        if (j == DXHorizontalAutoScrollLayoutWidgetNode.DXHORIZONTALAUTOSCROLLLAYOUT_HORIZONTALAUTOSCROLLLAYOUT) {
            return this.c;
        }
        if (j == z.DX_WIDGET_ID) {
            return this.d;
        }
        if (j == DXOCRImageViewWidgetNode.DXOCRIMAGEVIEW_OCRIMAGEVIEW) {
            return this.e;
        }
        if (j == DXWebViewWidgetNode.DXWEBVIEW) {
            return this.f;
        }
        if (j == DXVideoViewWidgetNode.DXVIDEOVIEW_VIDEOVIEW) {
            return this.g;
        }
        if (j == DXProgressBarWidgetNode.DXVIDEOPROGRESSBAR_VIDEOPROGRESSBAR) {
            return this.h;
        }
        if (j == b0.DXMEGAPRICEVIEW_MEGAPRICEVIEW) {
            return this.i;
        }
        if (j == -7827222248633552986L) {
            return this.j;
        }
        return null;
    }
}
