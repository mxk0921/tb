package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h0 A;
    public static final h0 B;
    public static final h0 C;
    public static final h0 D;
    public static final h0 E;
    public static final h0 F;
    public static final h0 G;
    public static final h0 H;
    public static final h0 I;
    public static final h0 J;
    public static final h0 K;
    public static final h0 L;
    public static final HashMap<String, h0> e;
    public static final h0 f;
    public static final h0 g;
    public static final h0 h;
    public static final h0 i;
    public static final h0 j;
    public static final h0 k;
    public static final h0 l;
    public static final h0 m;
    public static final h0 n;
    public static final h0 o;
    public static final h0 p;
    public static final h0 q;
    public static final h0 r;
    public static final h0 s;
    public static final h0 t;
    public static final h0 u;
    public static final h0 v;
    public static final h0 w;
    public static final h0 x;
    public static final h0 y;
    public static final h0 z;

    /* renamed from: a  reason: collision with root package name */
    public YogaNode f32144a;
    public final Component b;
    public float c = Float.NaN;
    public float d = Float.NaN;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            if (jfwVar.c > 0) {
                z = true;
            } else {
                z = false;
            }
            if (akt.S()) {
                if (jfwVar.c < 0) {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                yogaNode.setMinWidth(jfwVar.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            String str = jfwVar.Y;
            if (str != null && str.equals("hidden")) {
                yogaNode.setOverflow(YogaOverflow.HIDDEN);
            } else if (component instanceof sxo) {
                yogaNode.setOverflow(YogaOverflow.SCROLL);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            if (jfwVar.d > 0) {
                z = true;
            } else {
                z = false;
            }
            if (akt.S()) {
                if (jfwVar.d < 0) {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                yogaNode.setMinHeight(jfwVar.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaJustify yogaJustify = jfwVar.w;
            if (yogaJustify != null) {
                yogaNode.setJustifyContent(yogaJustify);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.e;
            if (i > 0) {
                yogaNode.setMaxWidth(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaAlign yogaAlign = jfwVar.p;
            if (yogaAlign != null) {
                yogaNode.setAlignItems(yogaAlign);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.f;
            if (i > 0) {
                yogaNode.setMaxHeight(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaAlign yogaAlign = jfwVar.o;
            if (yogaAlign != null) {
                yogaNode.setAlignContent(yogaAlign);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            float f = jfwVar.r;
            if (f > 0.0f) {
                yogaNode.setFlex(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (jfwVar.f21973a >= 0) {
                if (!akt.c0() && (i = jfwVar.e) > 0 && jfwVar.f21973a > i) {
                    jfwVar.f21973a = i;
                }
                yogaNode.setWidth(jfwVar.f21973a);
                yk9.b(component.getFlexBoxNode(), jfwVar.f21973a);
            } else {
                com.taobao.tao.flexbox.layoutmanager.core.n nVar = component.node;
                if (nVar.b == null && jfwVar.r == 1.0f) {
                    float B = s6o.B(nVar.N());
                    yogaNode.setWidth(B);
                    yk9.b(component.getFlexBoxNode(), B);
                } else if (yk9.a(component.getFlexBoxNode()) > 0.0f) {
                    yogaNode.setWidth(yk9.a(component.getFlexBoxNode()));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            float f = jfwVar.s;
            if (f > 0.0f) {
                yogaNode.setFlexGrow(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (jfwVar.b >= 0) {
                if (!akt.c0() && (i = jfwVar.f) > 0 && jfwVar.b > i) {
                    jfwVar.b = i;
                }
                yogaNode.setHeight(jfwVar.b);
                yk9.d(component.getFlexBoxNode(), jfwVar.b);
            } else if (yk9.c(component.getFlexBoxNode()) > 0.0f) {
                yogaNode.setHeight(yk9.c(component.getFlexBoxNode()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            float f = jfwVar.t;
            if (f > 0.0f) {
                yogaNode.setFlexShrink(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g0 implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaAlign yogaAlign = jfwVar.q;
            if (yogaAlign != null) {
                yogaNode.setAlignSelf(yogaAlign);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            float f = jfwVar.u;
            if (f > 0.0f) {
                yogaNode.setAspectRatio(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h0 {
        void a(Component component, YogaNode yogaNode, jfw jfwVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaDisplay yogaDisplay = jfwVar.y;
            if (yogaDisplay != null) {
                yogaNode.setDisplay(yogaDisplay);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else {
                yogaNode.setMargin(YogaEdge.LEFT, jfwVar.k);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaWrap yogaWrap = jfwVar.x;
            if (yogaWrap != null) {
                yogaNode.setWrap(yogaWrap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else {
                yogaNode.setMargin(YogaEdge.TOP, jfwVar.m);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class m implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else {
                yogaNode.setMargin(YogaEdge.RIGHT, jfwVar.l);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class n implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else {
                yogaNode.setMargin(YogaEdge.BOTTOM, jfwVar.n);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class o implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            yk9.e().a(component, yogaNode, jfwVar);
            yk9.f().a(component, yogaNode, jfwVar);
            yk9.g().a(component, yogaNode, jfwVar);
            yk9.h().a(component, yogaNode, jfwVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class p implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            YogaPositionType yogaPositionType = jfwVar.z;
            if (yogaPositionType != null) {
                yogaNode.setPositionType(yogaPositionType);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class q implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.A;
            if (i != -1) {
                yogaNode.setPosition(YogaEdge.LEFT, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class r implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.C;
            if (i != -1) {
                yogaNode.setPosition(YogaEdge.TOP, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class s implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.B;
            if (i != -1) {
                yogaNode.setPosition(YogaEdge.RIGHT, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class t implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
                return;
            }
            int i = jfwVar.D;
            if (i != -1) {
                yogaNode.setPosition(YogaEdge.BOTTOM, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class u implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (!(component instanceof ol4)) {
                yogaNode.setPadding(YogaEdge.LEFT, jfwVar.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class v implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else {
                yogaNode.setFlexDirection(jfwVar.v);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class w implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (!(component instanceof ol4)) {
                yogaNode.setPadding(YogaEdge.TOP, jfwVar.i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class x implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (!(component instanceof ol4)) {
                yogaNode.setPadding(YogaEdge.RIGHT, jfwVar.h);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class y implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (!(component instanceof ol4)) {
                yogaNode.setPadding(YogaEdge.BOTTOM, jfwVar.j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class z implements h0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yk9.h0
        public void a(Component component, YogaNode yogaNode, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48653b8c", new Object[]{this, component, yogaNode, jfwVar});
            } else if (!(component instanceof ol4)) {
                yk9.i().a(component, yogaNode, jfwVar);
                yk9.j().a(component, yogaNode, jfwVar);
                yk9.k().a(component, yogaNode, jfwVar);
                yk9.l().a(component, yogaNode, jfwVar);
            }
        }
    }

    public yk9() {
    }

    public static /* synthetic */ float a(yk9 yk9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a30a18d", new Object[]{yk9Var})).floatValue();
        }
        return yk9Var.c;
    }

    public static /* synthetic */ float b(yk9 yk9Var, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50cf3ab5", new Object[]{yk9Var, new Float(f2)})).floatValue();
        }
        yk9Var.c = f2;
        return f2;
    }

    public static /* synthetic */ float c(yk9 yk9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe6f112c", new Object[]{yk9Var})).floatValue();
        }
        return yk9Var.d;
    }

    public static /* synthetic */ float d(yk9 yk9Var, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("445ebef6", new Object[]{yk9Var, new Float(f2)})).floatValue();
        }
        yk9Var.d = f2;
        return f2;
    }

    public static /* synthetic */ h0 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("30645c0e", new Object[0]);
        }
        return x;
    }

    public static /* synthetic */ h0 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("e57c1ed", new Object[0]);
        }
        return y;
    }

    public static /* synthetic */ h0 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("ec4b27cc", new Object[0]);
        }
        return z;
    }

    public static /* synthetic */ h0 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("ca3e8dab", new Object[0]);
        }
        return A;
    }

    public static /* synthetic */ h0 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("a831f38a", new Object[0]);
        }
        return H;
    }

    public static /* synthetic */ h0 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("86255969", new Object[0]);
        }
        return I;
    }

    public static /* synthetic */ h0 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("6418bf48", new Object[0]);
        }
        return J;
    }

    public static /* synthetic */ h0 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0) ipChange.ipc$dispatch("420c2527", new Object[0]);
        }
        return K;
    }

    public static yk9 v(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk9) ipChange.ipc$dispatch("73da0030", new Object[]{component});
        }
        return new yk9(component);
    }

    public static yk9 w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk9) ipChange.ipc$dispatch("b113ebb0", new Object[0]);
        }
        yk9 yk9Var = new yk9();
        yk9Var.F();
        return yk9Var;
    }

    public float A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51394eaf", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            return yogaNode.getLayoutX();
        }
        return 0.0f;
    }

    public float B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51476630", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            return yogaNode.getLayoutY();
        }
        return 0.0f;
    }

    public YogaPositionType C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaPositionType) ipChange.ipc$dispatch("cde8b8ae", new Object[]{this});
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            return yogaNode.getPositionType();
        }
        return YogaPositionType.RELATIVE;
    }

    public YogaNode D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaNode) ipChange.ipc$dispatch("c2798b20", new Object[]{this});
        }
        return this.f32144a;
    }

    public final boolean E(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44db312f", new Object[]{this, component})).booleanValue();
        }
        return component instanceof ol4;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c377fb8b", new Object[]{this});
        } else if (this.f32144a == null) {
            this.f32144a = ut2.n();
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9939dce", new Object[]{this})).booleanValue();
        }
        if (this.f32144a == null) {
            return true;
        }
        return false;
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddea3a", new Object[]{this});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null && yogaNode.isMeasureDefined()) {
            this.f32144a.dirty();
        }
    }

    public void I(int i2, int i3) {
        YogaNode yogaNode;
        YogaNode yogaNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a57c05", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (t() && akt.p2("fixYogaMove", true) && (yogaNode = this.b.node.b.f.getFlexBoxNode().f32144a) != null && (yogaNode2 = this.f32144a) != null && yogaNode.indexOf(yogaNode2) == i2) {
            yogaNode.removeChildAt(i2);
            if (i3 >= 0 && i3 <= yogaNode.getChildCount()) {
                yogaNode.addChildAt(this.f32144a, i3);
            }
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a90bb4", new Object[]{this});
            return;
        }
        ut2.D(this.f32144a);
        this.f32144a = null;
    }

    public List<yk9> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("219726ab", new Object[]{this});
        }
        List<yk9> x2 = x();
        for (yk9 yk9Var : x2) {
            yk9Var.L();
        }
        return x2;
    }

    public void L() {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab23dc5d", new Object[]{this});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null && yogaNode.getParent() != null && (indexOf = this.f32144a.getParent().indexOf(this.f32144a)) >= 0) {
            this.f32144a.getParent().removeChildAt(indexOf);
        }
    }

    public void M(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03ab97e", new Object[]{this, new Float(f2)});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            yogaNode.setFlex(f2);
        }
    }

    public void N(YogaFlexDirection yogaFlexDirection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3842a44", new Object[]{this, yogaFlexDirection});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            yogaNode.setFlexDirection(yogaFlexDirection);
        }
    }

    public void O(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f2)});
        } else if (this.f32144a != null) {
            if (!YogaConstants.isUndefined(f2)) {
                this.d = f2;
            }
            this.f32144a.setHeight(f2);
        }
    }

    public void P(YogaMeasureFunction yogaMeasureFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd75a4", new Object[]{this, yogaMeasureFunction});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            yogaNode.setMeasureFunction(yogaMeasureFunction);
        }
    }

    public void Q(YogaEdge yogaEdge, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e0e4c", new Object[]{this, yogaEdge, new Float(f2)});
            return;
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            yogaNode.setPadding(yogaEdge, f2);
        }
    }

    public void R(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f815", new Object[]{this, new Float(f2)});
        } else if (this.f32144a != null) {
            if (!YogaConstants.isUndefined(f2)) {
                this.c = f2;
            }
            this.f32144a.setWidth(f2);
        }
    }

    public final void m(YogaNode yogaNode, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52fdb6", new Object[]{this, yogaNode, new Integer(i2)});
        } else if (this.f32144a != null && yogaNode.getParent() == null) {
            if (!this.f32144a.isMeasureDefined()) {
                int childCount = this.f32144a.getChildCount();
                if (i2 < 0 || i2 > childCount) {
                    tfs.e("TNode", "Cannot add child: insertIndex <= 0");
                } else {
                    this.f32144a.addChildAt(yogaNode, i2);
                }
            } else {
                tfs.e("TNode", "Cannot add child: Nodes with measure functions cannot have children.");
            }
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd7e508f", new Object[]{this})).booleanValue();
        }
        if (!t()) {
            return false;
        }
        this.b.node.b.f.getFlexBoxNode().m(this.f32144a, r());
        return true;
    }

    public void o(yk9 yk9Var, int i2) {
        YogaNode yogaNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0be2a4", new Object[]{this, yk9Var, new Integer(i2)});
        } else if (yk9Var != null && (yogaNode = this.f32144a) != null) {
            yk9Var.m(yogaNode, i2);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1645cf", new Object[]{this});
            return;
        }
        Component component = this.b;
        if (component != null && this.f32144a != null) {
            jfw viewParams = component.getViewParams();
            igs.a("applyStyleForYogaNode");
            ((k) f).a(this.b, this.f32144a, viewParams);
            ((v) g).a(this.b, this.f32144a, viewParams);
            ((a0) h).a(this.b, this.f32144a, viewParams);
            ((b0) i).a(this.b, this.f32144a, viewParams);
            ((c0) j).a(this.b, this.f32144a, viewParams);
            ((d0) k).a(this.b, this.f32144a, viewParams);
            ((g0) n).a(this.b, this.f32144a, viewParams);
            ((e0) l).a(this.b, this.f32144a, viewParams);
            ((f0) m).a(this.b, this.f32144a, viewParams);
            ((a) o).a(this.b, this.f32144a, viewParams);
            ((b) p).a(this.b, this.f32144a, viewParams);
            ((c) q).a(this.b, this.f32144a, viewParams);
            ((d) r).a(this.b, this.f32144a, viewParams);
            ((e) s).a(this.b, this.f32144a, viewParams);
            ((f) t).a(this.b, this.f32144a, viewParams);
            ((g) u).a(this.b, this.f32144a, viewParams);
            ((h) v).a(this.b, this.f32144a, viewParams);
            ((i) w).a(this.b, this.f32144a, viewParams);
            ((o) B).a(this.b, this.f32144a, viewParams);
            ((z) L).a(this.b, this.f32144a, viewParams);
            ((p) C).a(this.b, this.f32144a, viewParams);
            ((q) D).a(this.b, this.f32144a, viewParams);
            ((r) E).a(this.b, this.f32144a, viewParams);
            ((s) F).a(this.b, this.f32144a, viewParams);
            ((t) G).a(this.b, this.f32144a, viewParams);
            igs.c();
        }
    }

    public void q(String str) {
        h0 h0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2de6e7", new Object[]{this, str});
        } else if (this.b != null && this.f32144a != null && (h0Var = e.get(str)) != null) {
            Component component = this.b;
            h0Var.a(component, this.f32144a, component.getViewParams());
        }
    }

    public final int r() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c80d4d", new Object[]{this})).intValue();
        }
        List<com.taobao.tao.flexbox.layoutmanager.core.n> list = this.b.node.b.d;
        int i3 = -1;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i2 >= arrayList.size()) {
                return i3;
            }
            com.taobao.tao.flexbox.layoutmanager.core.n nVar = (com.taobao.tao.flexbox.layoutmanager.core.n) arrayList.get(i2);
            if (nVar == this.b.node) {
                return i3 + 1;
            }
            Component component = nVar.f;
            if (component != null && !(component instanceof piw)) {
                i3++;
            }
            i2++;
        }
    }

    public void s(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281c58f7", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (this.f32144a != null) {
            if (!YogaConstants.isUndefined(f2)) {
                this.c = f2;
                this.f32144a.setWidth(f2);
            }
            if (!YogaConstants.isUndefined(f3)) {
                this.d = f3;
                this.f32144a.setHeight(f3);
            }
            this.f32144a.calculateLayout(this.c, this.d);
        }
    }

    public final boolean t() {
        Component component;
        com.taobao.tao.flexbox.layoutmanager.core.n nVar;
        Component component2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8edec77f", new Object[]{this})).booleanValue();
        }
        if (this.f32144a == null || (component = this.b) == null || (nVar = component.node.b) == null || (component2 = nVar.f) == null || E(component2) || this.b.node.b.f.getFlexBoxNode() == null) {
            return false;
        }
        return true;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89accc5d", new Object[]{this});
            return;
        }
        Component component = this.b;
        if (component != null) {
            if (component.getViewParams().f21973a < 0) {
                this.c = Float.NaN;
                YogaNode yogaNode = this.f32144a;
                if (yogaNode != null) {
                    yogaNode.setWidth(Float.NaN);
                }
            }
            if (this.b.getViewParams().b < 0) {
                this.d = Float.NaN;
                YogaNode yogaNode2 = this.f32144a;
                if (yogaNode2 != null) {
                    yogaNode2.setHeight(Float.NaN);
                }
            }
        }
    }

    public List<yk9> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d76ceb32", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Component component = this.b;
        if (component != null) {
            Iterator it = ((ArrayList) component.getTNode().d).iterator();
            while (it.hasNext()) {
                com.taobao.tao.flexbox.layoutmanager.core.n nVar = (com.taobao.tao.flexbox.layoutmanager.core.n) it.next();
                if (nVar.K() != null) {
                    arrayList.add(nVar.K().getFlexBoxNode());
                }
            }
        }
        return arrayList;
    }

    public float y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc5e", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            return yogaNode.getLayoutHeight();
        }
        return 0.0f;
    }

    public float z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b44fd", new Object[]{this})).floatValue();
        }
        YogaNode yogaNode = this.f32144a;
        if (yogaNode != null) {
            return yogaNode.getLayoutWidth();
        }
        return 0.0f;
    }

    static {
        t2o.a(503317050);
        HashMap<String, h0> hashMap = new HashMap<>();
        e = hashMap;
        k kVar = new k();
        f = kVar;
        v vVar = new v();
        g = vVar;
        a0 a0Var = new a0();
        h = a0Var;
        b0 b0Var = new b0();
        i = b0Var;
        c0 c0Var = new c0();
        j = c0Var;
        d0 d0Var = new d0();
        k = d0Var;
        e0 e0Var = new e0();
        l = e0Var;
        f0 f0Var = new f0();
        m = f0Var;
        g0 g0Var = new g0();
        n = g0Var;
        a aVar = new a();
        o = aVar;
        b bVar = new b();
        p = bVar;
        c cVar = new c();
        q = cVar;
        d dVar = new d();
        r = dVar;
        e eVar = new e();
        s = eVar;
        f fVar = new f();
        t = fVar;
        g gVar = new g();
        u = gVar;
        h hVar = new h();
        v = hVar;
        i iVar = new i();
        w = iVar;
        j jVar = new j();
        x = jVar;
        l lVar = new l();
        y = lVar;
        m mVar = new m();
        z = mVar;
        n nVar = new n();
        A = nVar;
        o oVar = new o();
        B = oVar;
        p pVar = new p();
        C = pVar;
        q qVar = new q();
        D = qVar;
        r rVar = new r();
        E = rVar;
        s sVar = new s();
        F = sVar;
        t tVar = new t();
        G = tVar;
        u uVar = new u();
        H = uVar;
        w wVar = new w();
        I = wVar;
        x xVar = new x();
        J = xVar;
        y yVar = new y();
        K = yVar;
        z zVar = new z();
        L = zVar;
        hashMap.put(pg1.ATOM_EXT_UDL_flex_wrap, kVar);
        hashMap.put(pg1.ATOM_EXT_UDL_flex_direction, vVar);
        hashMap.put("overflow", a0Var);
        hashMap.put(pg1.ATOM_EXT_UDL_justify_content, b0Var);
        hashMap.put(pg1.ATOM_EXT_UDL_align_items, c0Var);
        hashMap.put(pg1.ATOM_EXT_UDL_align_content, d0Var);
        hashMap.put(pg1.ATOM_EXT_UDL_align_self, g0Var);
        hashMap.put("width", e0Var);
        hashMap.put("height", f0Var);
        hashMap.put("flex", eVar);
        hashMap.put(pg1.ATOM_EXT_UDL_flex_grow, fVar);
        hashMap.put(pg1.ATOM_EXT_UDL_flex_shrink, gVar);
        hashMap.put(pg1.ATOM_EXT_UDL_max_width, cVar);
        hashMap.put(pg1.ATOM_EXT_UDL_max_height, dVar);
        hashMap.put(pg1.ATOM_EXT_UDL_min_width, aVar);
        hashMap.put(pg1.ATOM_EXT_UDL_min_height, bVar);
        hashMap.put("padding", zVar);
        hashMap.put(pg1.ATOM_EXT_UDL_padding_left, uVar);
        hashMap.put(pg1.ATOM_EXT_UDL_padding_top, wVar);
        hashMap.put(pg1.ATOM_EXT_UDL_padding_right, xVar);
        hashMap.put(pg1.ATOM_EXT_UDL_padding_bottom, yVar);
        hashMap.put("margin", oVar);
        hashMap.put(pg1.ATOM_EXT_UDL_margin_left, jVar);
        hashMap.put(pg1.ATOM_EXT_UDL_margin_top, lVar);
        hashMap.put(pg1.ATOM_EXT_UDL_margin_right, mVar);
        hashMap.put(pg1.ATOM_EXT_UDL_margin_bottom, nVar);
        hashMap.put("aspect-ratio", hVar);
        hashMap.put("position", pVar);
        hashMap.put("left", qVar);
        hashMap.put("top", rVar);
        hashMap.put("right", sVar);
        hashMap.put("bottom", tVar);
        hashMap.put("display", iVar);
    }

    public yk9(Component component) {
        this.b = component;
    }
}
