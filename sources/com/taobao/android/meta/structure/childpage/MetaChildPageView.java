package com.taobao.android.meta.structure.childpage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageView;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import tb.bsi;
import tb.ckf;
import tb.g1a;
import tb.guc;
import tb.kuc;
import tb.rtc;
import tb.rz;
import tb.stc;
import tb.t2o;
import tb.xhv;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaChildPageView extends rz<FrameLayout, rtc> implements stc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bsi d;
    public FrameLayout e;
    public MetaLayout f;
    public LinearLayout g;
    public FrameLayout h;

    static {
        t2o.a(993001521);
        t2o.a(993001518);
    }

    public MetaChildPageView(bsi bsiVar) {
        ckf.g(bsiVar, "metaConfig");
        this.d = bsiVar;
    }

    public static final xhv f(MetaChildPageView metaChildPageView, kuc kucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ed9e486b", new Object[]{metaChildPageView, kucVar});
        }
        ckf.g(metaChildPageView, "this$0");
        MetaLayout metaLayout = metaChildPageView.f;
        if (metaLayout != null) {
            metaLayout.setScrollListener(kucVar);
            return xhv.INSTANCE;
        }
        ckf.y("metaLayout");
        throw null;
    }

    public static final xhv g(MetaChildPageView metaChildPageView, guc gucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("41c8b606", new Object[]{metaChildPageView, gucVar});
        }
        ckf.g(metaChildPageView, "this$0");
        MetaLayout metaLayout = metaChildPageView.f;
        if (metaLayout != null) {
            metaLayout.setOverScrollListener(gucVar);
            return xhv.INSTANCE;
        }
        ckf.y("metaLayout");
        throw null;
    }

    public static final void i(MetaChildPageView metaChildPageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26a5b1", new Object[]{metaChildPageView});
            return;
        }
        ckf.g(metaChildPageView, "this$0");
        MetaLayout metaLayout = metaChildPageView.f;
        if (metaLayout != null) {
            metaLayout.requestLayout();
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(MetaChildPageView metaChildPageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/childpage/MetaChildPageView");
    }

    @Override // tb.stc
    public ViewGroup P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7f672803", new Object[]{this});
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("leftBarContainer");
        throw null;
    }

    /* renamed from: S */
    public FrameLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    @Override // tb.qtc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        MetaLayout metaLayout = this.f;
        if (metaLayout != null) {
            metaLayout.setListStart(i);
            new Handler().post(new Runnable() { // from class: tb.sdz
                @Override // java.lang.Runnable
                public final void run() {
                    MetaChildPageView.i(MetaChildPageView.this);
                }
            });
            return;
        }
        ckf.y("metaLayout");
        throw null;
    }

    @Override // tb.stc
    public void h(ytc ytcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d92e2", new Object[]{this, ytcVar});
            return;
        }
        ckf.g(ytcVar, "header");
        MetaLayout metaLayout = this.f;
        if (metaLayout != null) {
            metaLayout.addHeader(ytcVar);
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    @Override // tb.stc
    public MetaLayout j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("8345f741", new Object[]{this});
        }
        MetaLayout metaLayout = this.f;
        if (metaLayout != null) {
            return metaLayout;
        }
        ckf.y("metaLayout");
        throw null;
    }

    @Override // tb.stc
    public ViewGroup o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6c006bc1", new Object[]{this});
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("listContainer");
        throw null;
    }

    @Override // tb.qtc
    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c912d9a", new Object[]{this, new Integer(i)});
            return;
        }
        MetaLayout metaLayout = this.f;
        if (metaLayout != null) {
            metaLayout.setHeaderOffset(i);
            MetaLayout metaLayout2 = this.f;
            if (metaLayout2 != null) {
                metaLayout2.requestLayout();
            } else {
                ckf.y("metaLayout");
                throw null;
            }
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    @Override // tb.stc
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.f;
        if (metaLayout != null) {
            metaLayout.clearHeaders();
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    /* renamed from: R */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        this.e = new FrameLayout(context);
        this.f = new MetaLayout(context);
        if (this.d.t()) {
            MetaLayout metaLayout = this.f;
            if (metaLayout != null) {
                metaLayout.layoutListFirst();
            } else {
                ckf.y("metaLayout");
                throw null;
            }
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            MetaLayout metaLayout2 = this.f;
            if (metaLayout2 != null) {
                frameLayout.addView(metaLayout2, new ViewGroup.LayoutParams(-1, -1));
                FrameLayout frameLayout2 = this.e;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    FrameLayout frameLayout3 = this.e;
                    if (frameLayout3 != null) {
                        frameLayout3.setFocusableInTouchMode(false);
                        LinearLayout linearLayout = new LinearLayout(context);
                        this.g = linearLayout;
                        linearLayout.setOrientation(0);
                        MetaLayout metaLayout3 = this.f;
                        if (metaLayout3 != null) {
                            LinearLayout linearLayout2 = this.g;
                            if (linearLayout2 != null) {
                                metaLayout3.addListContainer(linearLayout2);
                                FrameLayout frameLayout4 = new FrameLayout(context);
                                this.h = frameLayout4;
                                LinearLayout linearLayout3 = this.g;
                                if (linearLayout3 != null) {
                                    linearLayout3.addView(frameLayout4, -2, -1);
                                    MetaLayout metaLayout4 = this.f;
                                    if (metaLayout4 != null) {
                                        metaLayout4.setHeaderChangeListener(P());
                                        this.d.a0().d(new g1a() { // from class: tb.qdz
                                            @Override // tb.g1a
                                            public final Object invoke(Object obj) {
                                                xhv f;
                                                f = MetaChildPageView.f(MetaChildPageView.this, (kuc) obj);
                                                return f;
                                            }
                                        });
                                        this.d.R().d(new g1a() { // from class: tb.rdz
                                            @Override // tb.g1a
                                            public final Object invoke(Object obj) {
                                                xhv g;
                                                g = MetaChildPageView.g(MetaChildPageView.this, (guc) obj);
                                                return g;
                                            }
                                        });
                                        FrameLayout frameLayout5 = this.e;
                                        if (frameLayout5 != null) {
                                            return frameLayout5;
                                        }
                                        ckf.y("rootView");
                                        throw null;
                                    }
                                    ckf.y("metaLayout");
                                    throw null;
                                }
                                ckf.y("listContainer");
                                throw null;
                            }
                            ckf.y("listContainer");
                            throw null;
                        }
                        ckf.y("metaLayout");
                        throw null;
                    }
                    ckf.y("rootView");
                    throw null;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("metaLayout");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
