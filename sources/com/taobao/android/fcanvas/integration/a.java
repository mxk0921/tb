package com.taobao.android.fcanvas.integration;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import tb.shw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FCanvasJNIBridge f7654a;
    public Surface b;
    public final String c;

    static {
        t2o.a(945815569);
    }

    public a(FCanvasJNIBridge fCanvasJNIBridge, String str) {
        this.f7654a = fCanvasJNIBridge;
        this.c = str;
    }

    public void a(shw shwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e56893", new Object[]{this, shwVar});
        } else {
            this.f7654a.setViewportMetrics(shwVar.f28063a, shwVar.b, shwVar.c);
        }
    }

    public void b(Surface surface, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d019a06", new Object[]{this, surface, renderType});
            return;
        }
        if (this.b != null) {
            c(renderType);
        }
        this.b = surface;
        this.f7654a.onSurfaceCreated(surface, this.c, renderType);
    }

    public void c(FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82f0672", new Object[]{this, renderType});
            return;
        }
        this.f7654a.onSurfaceDestroyed(this.c, renderType);
        Surface surface = this.b;
        if (surface != null && surface.isValid()) {
            this.b.release();
        }
        this.b = null;
    }

    public void d(int i, int i2, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7d5f93", new Object[]{this, new Integer(i), new Integer(i2), renderType});
        } else {
            this.f7654a.onSurfaceChanged(i, i2, this.c, renderType);
        }
    }
}
