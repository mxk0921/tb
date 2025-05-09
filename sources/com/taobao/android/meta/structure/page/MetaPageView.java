package com.taobao.android.meta.structure.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.meta.structure.page.MetaPageView;
import com.taobao.android.searchbaseframe.business.srp.page.uikit.RoundFrameLayout;
import com.taobao.android.searchbaseframe.business.srp.viewpager.uikit.SearchViewPager;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.uikit.ImmersiveFrameLayout;
import tb.bsi;
import tb.buc;
import tb.ckf;
import tb.esi;
import tb.g1a;
import tb.igw;
import tb.iuc;
import tb.juc;
import tb.rz;
import tb.t2o;
import tb.xhv;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MetaPageView extends rz<FrameLayout, iuc> implements juc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bsi d;
    public MetaLayout e;
    public FrameLayout f;
    public View g;
    public SearchViewPager h;

    static {
        t2o.a(993001543);
        t2o.a(993001539);
    }

    public static final xhv c(MetaPageView metaPageView, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2a10864e", new Object[]{metaPageView, bool});
        }
        ckf.g(metaPageView, "this$0");
        SearchViewPager searchViewPager = metaPageView.h;
        if (searchViewPager != null) {
            ckf.d(bool);
            searchViewPager.setDragEnabled(bool.booleanValue());
            return xhv.INSTANCE;
        }
        ckf.y("pagerView");
        throw null;
    }

    public static /* synthetic */ Object ipc$super(MetaPageView metaPageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/page/MetaPageView");
    }

    public final bsi S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsi) ipChange.ipc$dispatch("1ffd1048", new Object[]{this});
        }
        bsi bsiVar = this.d;
        if (bsiVar != null) {
            return bsiVar;
        }
        ckf.y("config");
        throw null;
    }

    /* renamed from: T */
    public FrameLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void U(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9aa4dc", new Object[]{this, bsiVar});
            return;
        }
        ckf.g(bsiVar, "<set-?>");
        this.d = bsiVar;
    }

    @Override // tb.juc
    public void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a9583f", new Object[]{this, onPageChangeListener});
            return;
        }
        ckf.g(onPageChangeListener, DataReceiveMonitor.CB_LISTENER);
        SearchViewPager searchViewPager = this.h;
        if (searchViewPager != null) {
            searchViewPager.addOnPageChangeListener(onPageChangeListener);
        } else {
            ckf.y("pagerView");
            throw null;
        }
    }

    @Override // tb.juc
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            metaLayout.commit();
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    @Override // tb.juc
    public ViewPager getViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        SearchViewPager searchViewPager = this.h;
        if (searchViewPager != null) {
            return searchViewPager;
        }
        ckf.y("pagerView");
        throw null;
    }

    @Override // tb.juc
    public void h(ytc ytcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d92e2", new Object[]{this, ytcVar});
            return;
        }
        ckf.g(ytcVar, "header");
        if (ytcVar instanceof esi) {
            ((esi) ytcVar).m();
        }
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            metaLayout.addHeader(ytcVar);
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    @Override // tb.juc
    public MetaLayout j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("8345f741", new Object[]{this});
        }
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            return metaLayout;
        }
        ckf.y("metaLayout");
        throw null;
    }

    @Override // tb.juc
    public void k(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        ckf.g(pagerAdapter, "adapter");
        SearchViewPager searchViewPager = this.h;
        if (searchViewPager != null) {
            searchViewPager.setAdapter(pagerAdapter);
        } else {
            ckf.y("pagerView");
            throw null;
        }
    }

    @Override // tb.juc
    public void m(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c5f541", new Object[]{this, bsiVar});
            return;
        }
        ckf.g(bsiVar, "config");
        U(bsiVar);
    }

    @Override // tb.juc
    public void q(buc bucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c092ced", new Object[]{this, bucVar});
            return;
        }
        ckf.g(bucVar, "list");
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            metaLayout.setCurrentList(bucVar);
        } else {
            ckf.y("metaLayout");
            throw null;
        }
    }

    @Override // tb.juc
    public void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafeba77", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            ckf.y("rootView");
            throw null;
        } else if (frameLayout != null) {
            View view2 = this.g;
            if (view2 != null) {
                frameLayout.addView(view, frameLayout.indexOfChild(view2) + 1, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ckf.y("backgroundView");
                throw null;
            }
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    /* renamed from: R */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        if (S().r()) {
            ckf.d(context);
            frameLayout = new ImmersiveFrameLayout(context);
        } else {
            ckf.d(context);
            frameLayout = new RoundFrameLayout(context);
        }
        this.f = frameLayout;
        this.e = new MetaLayout(context);
        if (S().t()) {
            MetaLayout metaLayout = this.e;
            if (metaLayout != null) {
                metaLayout.layoutListFirst();
            } else {
                ckf.y("metaLayout");
                throw null;
            }
        }
        MetaLayout metaLayout2 = this.e;
        if (metaLayout2 != null) {
            metaLayout2.setLayoutType(S().B());
            MetaLayout metaLayout3 = this.e;
            if (metaLayout3 != null) {
                metaLayout3.setScrollable(S().Q());
                SearchViewPager searchViewPager = new SearchViewPager(context);
                this.h = searchViewPager;
                searchViewPager.setImportantForAccessibility(2);
                SearchViewPager searchViewPager2 = this.h;
                if (searchViewPager2 != null) {
                    searchViewPager2.setOffscreenPageLimit(1);
                    MetaLayout metaLayout4 = this.e;
                    if (metaLayout4 != null) {
                        SearchViewPager searchViewPager3 = this.h;
                        if (searchViewPager3 != null) {
                            metaLayout4.addListContainer(searchViewPager3);
                            MetaLayout metaLayout5 = this.e;
                            if (metaLayout5 != null) {
                                metaLayout5.setUseHiddenHeight();
                                View view = new View(context);
                                this.g = view;
                                FrameLayout frameLayout2 = this.f;
                                if (frameLayout2 != null) {
                                    frameLayout2.addView(view, new ViewGroup.LayoutParams(-1, -1));
                                    View view2 = this.g;
                                    if (view2 != null) {
                                        igw.b(view2, S().T());
                                        if (S().S() != null) {
                                            View view3 = this.g;
                                            if (view3 != null) {
                                                ViewCompat.setBackground(view3, S().S());
                                            } else {
                                                ckf.y("backgroundView");
                                                throw null;
                                            }
                                        }
                                        FrameLayout frameLayout3 = this.f;
                                        if (frameLayout3 != null) {
                                            MetaLayout metaLayout6 = this.e;
                                            if (metaLayout6 != null) {
                                                frameLayout3.addView(metaLayout6, new ViewGroup.LayoutParams(-1, -1));
                                                P().B();
                                                S().U().d(new g1a() { // from class: tb.ifz
                                                    @Override // tb.g1a
                                                    public final Object invoke(Object obj) {
                                                        xhv c;
                                                        c = MetaPageView.c(MetaPageView.this, (Boolean) obj);
                                                        return c;
                                                    }
                                                });
                                                FrameLayout frameLayout4 = this.f;
                                                if (frameLayout4 != null) {
                                                    return frameLayout4;
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
                                    ckf.y("backgroundView");
                                    throw null;
                                }
                                ckf.y("rootView");
                                throw null;
                            }
                            ckf.y("metaLayout");
                            throw null;
                        }
                        ckf.y("pagerView");
                        throw null;
                    }
                    ckf.y("metaLayout");
                    throw null;
                }
                ckf.y("pagerView");
                throw null;
            }
            ckf.y("metaLayout");
            throw null;
        }
        ckf.y("metaLayout");
        throw null;
    }
}
