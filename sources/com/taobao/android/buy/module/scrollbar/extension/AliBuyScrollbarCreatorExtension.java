package com.taobao.android.buy.module.scrollbar.extension;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView;
import java.util.List;
import tb.hbb;
import tb.ps;
import tb.sn0;
import tb.t2o;
import tb.xn0;
import tb.yn0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.render.component.creator.scrollbar")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AliBuyScrollbarCreatorExtension extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AURAGlobalData g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends yn0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6482a;
        public int b;
        public final /* synthetic */ xn0 c;
        public final /* synthetic */ RecyclerView d;
        public final /* synthetic */ AliBuyScrollbarView e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.buy.module.scrollbar.extension.AliBuyScrollbarCreatorExtension$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class animation.InterpolatorC0340a implements Interpolator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public animation.InterpolatorC0340a(a aVar) {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                return 0.3f;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Interpolator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(a aVar) {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                return 0.3f;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class c implements Interpolator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c(a aVar) {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                return 1.0f;
            }
        }

        public a(AliBuyScrollbarCreatorExtension aliBuyScrollbarCreatorExtension, xn0 xn0Var, RecyclerView recyclerView, AliBuyScrollbarView aliBuyScrollbarView) {
            this.c = xn0Var;
            this.d = recyclerView;
            this.e = aliBuyScrollbarView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/module/scrollbar/extension/AliBuyScrollbarCreatorExtension$2");
        }

        @Override // tb.yn0
        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc8a4ea2", new Object[]{this, new Float(f), new Float(f2)});
            } else if (f2 <= 0.01f) {
                this.d.scrollToPosition(0);
                this.e.hide();
            } else {
                if (f2 >= 0.99f) {
                    RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset((this.e.getItemCount() - 1) + this.e.mStartPosition, 1000);
                        this.e.hide();
                        return;
                    }
                }
                this.b = this.c.b();
                this.f6482a = this.c.a();
                float computeVerticalScrollExtent = ((this.b - this.d.computeVerticalScrollExtent()) * f2) - this.f6482a;
                if (Math.abs(computeVerticalScrollExtent) <= 2600.0f) {
                    this.d.smoothScrollBy(0, (int) computeVerticalScrollExtent, new c(this));
                } else {
                    float itemCount = this.e.getItemCount() * f2;
                    float f3 = this.e.mStartPosition;
                    float f4 = itemCount + f3;
                    if (f4 > f3) {
                        f4 -= 1.0f;
                    }
                    this.d.scrollToPosition((int) f4);
                }
                this.e.hide();
            }
        }

        @Override // tb.yn0
        public void b(float f, float f2) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f321a98", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.b = this.c.b();
            this.f6482a = this.c.a();
            float computeVerticalScrollExtent = ((this.b - this.d.computeVerticalScrollExtent()) * f2) - this.f6482a;
            if (Math.abs(computeVerticalScrollExtent) > 2600.0f) {
                if (computeVerticalScrollExtent <= 0.0f) {
                    i = -1;
                }
                this.d.smoothScrollBy(0, i * 2600, new animation.InterpolatorC0340a(this));
                return;
            }
            if ((f2 > f && computeVerticalScrollExtent < 0.0f) || (f2 < f && computeVerticalScrollExtent > 0.0f)) {
                computeVerticalScrollExtent = 0.0f;
            }
            this.d.smoothScrollBy(0, (int) computeVerticalScrollExtent, new b(this));
        }

        @Override // tb.yn0
        public void c(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2639b8e9", new Object[]{this, new Float(f), new Float(f2)});
            }
        }
    }

    static {
        t2o.a(301990072);
    }

    public static /* synthetic */ Object ipc$super(AliBuyScrollbarCreatorExtension aliBuyScrollbarCreatorExtension, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/module/scrollbar/extension/AliBuyScrollbarCreatorExtension");
    }

    public final void L(final AliBuyScrollbarView aliBuyScrollbarView) {
        RecyclerView recyclerView;
        final xn0 xn0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4fc910", new Object[]{this, aliBuyScrollbarView});
            return;
        }
        AURAGlobalData aURAGlobalData = this.g;
        if (aURAGlobalData != null && (recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class)) != null && (xn0Var = (xn0) this.g.get("alibuy_scrollState", xn0.class)) != null) {
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener(this) { // from class: com.taobao.android.buy.module.scrollbar.extension.AliBuyScrollbarCreatorExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/module/scrollbar/extension/AliBuyScrollbarCreatorExtension$1");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView2, i);
                    if (i == 0) {
                        aliBuyScrollbarView.hide();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    int i3 = 1;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView2, i, i2);
                    if (i2 != 0) {
                        if (Math.abs(i2) > 120) {
                            aliBuyScrollbarView.show();
                        }
                        AliBuyScrollbarView aliBuyScrollbarView2 = aliBuyScrollbarView;
                        if (aliBuyScrollbarView2.mStartPosition == -1) {
                            aliBuyScrollbarView2.mStartPosition = xn0Var.c();
                        }
                        int b = xn0Var.b();
                        int itemCount = aliBuyScrollbarView.getItemCount();
                        int computeVerticalScrollExtent = b - recyclerView2.computeVerticalScrollExtent();
                        if (computeVerticalScrollExtent != 0) {
                            float f = 1.0f;
                            float min = Math.min(1.0f, Math.max(xn0Var.a() / computeVerticalScrollExtent, 0.0f));
                            int a2 = sn0.a(recyclerView2);
                            AliBuyScrollbarView aliBuyScrollbarView3 = aliBuyScrollbarView;
                            if ((a2 - aliBuyScrollbarView3.mStartPosition) + 1 < itemCount || i2 <= 0) {
                                f = min;
                            }
                            if (i2 <= 0) {
                                i3 = -1;
                            }
                            aliBuyScrollbarView3.scrollToPercent(f, i3);
                        }
                    }
                }
            });
            aliBuyScrollbarView.setListener(new a(this, xn0Var, recyclerView, aliBuyScrollbarView));
        }
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return "buy_v2_right_nav_bar";
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        AliBuyScrollbarView aliBuyScrollbarView = (AliBuyScrollbarView) this.g.get("alibuy_scrollbar", AliBuyScrollbarView.class);
        if (aliBuyScrollbarView != null) {
            m0(aliBuyScrollbarView, (xn0) this.g.get("alibuy_scrollState", xn0.class));
            return aliBuyScrollbarView;
        }
        AliBuyScrollbarView aliBuyScrollbarView2 = new AliBuyScrollbarView(viewGroup.getContext());
        this.g.update("alibuy_scrollbar", aliBuyScrollbarView2);
        xn0 xn0Var = new xn0();
        if (viewGroup instanceof RecyclerView) {
            aliBuyScrollbarView2.setBarHeight(viewGroup.getHeight());
            m0(aliBuyScrollbarView2, xn0Var);
            xn0Var.d((RecyclerView) viewGroup);
        }
        this.g.update("alibuy_scrollState", xn0Var);
        L(aliBuyScrollbarView2);
        return aliBuyScrollbarView2;
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (view instanceof AliBuyScrollbarView) {
            AliBuyScrollbarView aliBuyScrollbarView = (AliBuyScrollbarView) view;
            if (!aliBuyScrollbarView.hasInit() && (aURARenderComponentData = aURARenderComponent.data) != null) {
                aliBuyScrollbarView.onDataChange(aURARenderComponentData.fields);
            }
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return "buy_v2_right_nav_bar";
    }

    public final void m0(AliBuyScrollbarView aliBuyScrollbarView, xn0 xn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00f1c97", new Object[]{this, aliBuyScrollbarView, xn0Var});
            return;
        }
        xn0Var.f = aliBuyScrollbarView.mStartPosition;
        List list = (List) this.g.get("render_view_item_models", List.class);
        aliBuyScrollbarView.setItemCount(list.size() - sn0.b(list));
        xn0Var.e = aliBuyScrollbarView.getItemCount();
    }

    @Override // tb.ps, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.g = aURAGlobalData;
    }
}
