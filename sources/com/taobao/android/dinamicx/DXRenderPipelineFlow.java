package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.bi6;
import tb.hyp;
import tb.svb;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRenderPipelineFlow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_PARSE_TIME = "dataParseTime";
    public static final int DX_PIPELINE_MODE_RENDER = 0;
    public static final int DX_PIPELINE_MODE_SIZE = 1;
    public static final String END_STAGE = "endStage";
    public static final String FLATTEN_TIME = "flattenTime";
    public static final String FROM_STAGE = "fromStage";
    public static final String LAYOUT_TIME = "layoutTime";
    public static final String LOAD_BINARY_TIME = "loadBinaryTime";
    public static final String MEASURE_TIME = "measureTime";
    public static final String PIPELINE_TYPE = "pipelineType";
    public static final String RENDER_TIME = "renderTime";

    /* renamed from: a  reason: collision with root package name */
    public int f7290a;
    public View b;
    public WeakReference<View> c;
    public DXWidgetNode d;
    public svb e;
    public DXRuntimeContext f;
    public int g;
    public int h;
    public final boolean i = zg5.l4();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXPipelineMode {
    }

    static {
        t2o.a(444596545);
    }

    public final svb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("c8e20647", new Object[]{this});
        }
        svb i = i();
        this.e = i;
        return i;
    }

    public final svb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("c9983150", new Object[]{this});
        }
        svb j = j();
        this.e = j;
        return j;
    }

    public final DXWidgetNode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6bea66bb", new Object[]{this});
        }
        DXWidgetNode k = k();
        this.d = k;
        return k;
    }

    public final DXWidgetNode d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("3904937", new Object[]{this});
        }
        DXWidgetNode l = l();
        this.d = l;
        return l;
    }

    public final DXWidgetNode e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6afa1279", new Object[]{this});
        }
        DXWidgetNode m = m();
        this.d = m;
        return m;
    }

    public final DXWidgetNode f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("472908e", new Object[]{this});
        }
        DXWidgetNode n = n();
        this.d = n;
        return n;
    }

    public final View g(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b08ba81a", new Object[]{this, dXRenderOptions});
        }
        q(o(dXRenderOptions));
        return h();
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        if (!this.i) {
            return this.b;
        }
        WeakReference<View> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public svb i() {
        throw null;
    }

    public svb j() {
        throw null;
    }

    public DXWidgetNode k() {
        throw null;
    }

    public DXWidgetNode l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ec2c3e8b", new Object[]{this});
        }
        return this.d;
    }

    public DXWidgetNode m() {
        throw null;
    }

    public DXWidgetNode n() {
        throw null;
    }

    public View o(DXRenderOptions dXRenderOptions) {
        throw null;
    }

    public void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
        } else if (this.i) {
            this.c = new WeakReference<>(view);
        } else {
            this.b = view;
        }
    }

    public void p(int i, int i2, DXRenderOptions dXRenderOptions, hyp hypVar) {
        DXWidgetNode childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a9dcd4", new Object[]{this, new Integer(i), new Integer(i2), dXRenderOptions, hypVar});
        } else if (i <= i2) {
            if (hypVar == null) {
                try {
                    hypVar = new hyp();
                } catch (Throwable th) {
                    f.a aVar = new f.a("Pipeline", "SIMPLE_PIPELINE_CRASH", f.DX_SIMPLE_PIPELINE_CRASH);
                    aVar.e = xv5.a(th);
                    DXRuntimeContext dXRuntimeContext = this.f;
                    if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || this.f.m().c == null)) {
                        ((ArrayList) this.f.m().c).add(aVar);
                    }
                    xv5.b(th);
                    return;
                }
            }
            hypVar.b("pipelineType", 2);
            hypVar.b("fromStage", Integer.valueOf(i));
            hypVar.b("endStage", Integer.valueOf(i2));
            hypVar.b("renderType", Integer.valueOf(this.f.I()));
            this.f.c0(m.THREAD_NAME, Thread.currentThread().getName());
            DXWidgetNode dXWidgetNode = this.d;
            String R = (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) ? null : this.d.getDXRuntimeContext().R();
            this.f7290a = i;
            while (this.f7290a <= i2) {
                if (dXRenderOptions == null || (!(dXRenderOptions.f() == 1 || dXRenderOptions.f() == 2) || !dXRenderOptions.j())) {
                    switch (this.f7290a) {
                        case 0:
                        case 1:
                            DXTraceUtil.b("DX-SimplePipeline-RenderWt-Load", " : ", R);
                            if (d() != null) {
                                DXTraceUtil.c();
                                break;
                            } else {
                                return;
                            }
                        case 2:
                            DXTraceUtil.b("DX-SimplePipeline-RenderWt-Parser", " : ", R);
                            long nanoTime = System.nanoTime();
                            if (f() != null) {
                                hypVar.a("dataParseTime", Long.valueOf(System.nanoTime() - nanoTime));
                                DXTraceUtil.c();
                                break;
                            } else {
                                return;
                            }
                        case 3:
                            DXTraceUtil.b("DX-SimplePipeline-RenderWt-Measure", " : ", R);
                            long nanoTime2 = System.nanoTime();
                            if (e() != null) {
                                hypVar.a("measureTime", Long.valueOf(System.nanoTime() - nanoTime2));
                                DXTraceUtil.c();
                                break;
                            } else {
                                return;
                            }
                        case 4:
                            DXTraceUtil.b("DX-SimplePipeline-RenderWt-Layout", " : ", R);
                            long nanoTime3 = System.nanoTime();
                            if (c() != null) {
                                hypVar.a("layoutTime", Long.valueOf(System.nanoTime() - nanoTime3));
                                DXTraceUtil.c();
                                break;
                            } else {
                                return;
                            }
                        case 5:
                            DXTraceUtil.b("DX-SimplePipeline-RenderWt-Flatten", " : ", R);
                            long nanoTime4 = System.nanoTime();
                            if (b() != null) {
                                hypVar.a("flattenTime", Long.valueOf(System.nanoTime() - nanoTime4));
                                DXTraceUtil.c();
                                break;
                            } else {
                                return;
                            }
                        case 6:
                            if (a() != null) {
                                break;
                            } else {
                                return;
                            }
                        case 7:
                            long nanoTime5 = System.nanoTime();
                            if (g(dXRenderOptions) != null) {
                                hypVar.a("renderTime", Long.valueOf(System.nanoTime() - nanoTime5));
                                break;
                            } else {
                                return;
                            }
                        case 8:
                            DXWidgetNode dXWidgetNode2 = this.d;
                            if ((dXWidgetNode2 instanceof bi6) && dXWidgetNode2.getChildrenCount() > 0 && (childAt = this.d.getChildAt(0)) != null && childAt.isV4Node() && !childAt.getStatInPrivateFlags(1048576)) {
                                List<DXExtensionSectionLoader.a> d = childAt.getDxv4Properties().d();
                                if (d != null) {
                                    for (DXExtensionSectionLoader.a aVar2 : d) {
                                        aVar2.a(null, childAt.getDXRuntimeContext(), null);
                                    }
                                }
                                childAt.setStatFlag(1048576);
                                break;
                            }
                            break;
                    }
                    this.f7290a++;
                } else {
                    return;
                }
            }
        }
    }
}
