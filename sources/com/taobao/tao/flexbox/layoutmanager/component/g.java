package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.f;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ir2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FOLD_TRANSLATION = 1;
    public static final int MSG_FOLD = 1;
    public static final int MSG_UNFOLD = 2;
    public static final int UNFOLD_TRANSLATION = 2;
    public static final HashMap<o, HashMap<String, g>> f = new HashMap<>();
    public int b;
    public final f c;

    /* renamed from: a  reason: collision with root package name */
    public int f12156a = 0;
    public int d = 0;
    public final List<e> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12157a;

        public a(int i) {
            this.f12157a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 0);
            g.c(g.this, 1);
            g gVar = g.this;
            gVar.s(g.b(gVar), g.b(g.this), true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 0);
            g.c(g.this, 1);
            g gVar = g.this;
            gVar.s(g.b(gVar), g.b(g.this), true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 1);
            g gVar = g.this;
            gVar.s(this.f12157a, g.b(gVar), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            g gVar = g.this;
            gVar.s(-intValue, g.b(gVar), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12159a;

        public c(int i) {
            this.f12159a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 0);
            g.c(g.this, 2);
            g gVar = g.this;
            gVar.s(0, g.b(gVar), true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 0);
            g.c(g.this, 2);
            g gVar = g.this;
            gVar.s(0, g.b(gVar), true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            g.a(g.this, 2);
            g gVar = g.this;
            gVar.s(-this.f12159a, g.b(gVar), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            g gVar = g.this;
            gVar.s(-intValue, g.b(gVar), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void b(int i, int i2, int i3, boolean z);
    }

    static {
        t2o.a(503316870);
    }

    public g(Component component, String[] strArr) {
        super(Looper.getMainLooper());
        f c2;
        if (component != null && (c2 = h.c(component.getNode(), strArr, false)) != null) {
            if (c2.getNode().v(com.taobao.tao.flexbox.layoutmanager.component.e.class) == null || ((f.b) c2.getViewParams()).x0) {
                this.b = c2.getNode().S().b;
                this.c = c2;
            }
        }
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9865aefd", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.d = i;
        return i;
    }

    public static /* synthetic */ int b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99940eed", new Object[]{gVar})).intValue();
        }
        return gVar.b;
    }

    public static /* synthetic */ int c(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ebd157f", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.f12156a = i;
        return i;
    }

    public static g d(o oVar, Component component, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f3da1bf5", new Object[]{oVar, component, strArr});
        }
        HashMap<o, HashMap<String, g>> hashMap = f;
        HashMap<String, g> hashMap2 = hashMap.get(oVar);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(oVar, hashMap2);
        }
        String a2 = ir2.a(strArr);
        g gVar = hashMap2.get(a2);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(component, strArr);
        hashMap2.put(a2, gVar2);
        return gVar2;
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabFoldHandler");
    }

    public static void n(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e087f1", new Object[]{oVar});
        } else {
            f.remove(oVar);
        }
    }

    public void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5a247c", new Object[]{this, eVar});
        } else if (!((ArrayList) this.e).contains(eVar)) {
            ((ArrayList) this.e).add(eVar);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6657aa5b", new Object[]{this});
        } else if (!hasMessages(1) && this.f12156a != 1 && this.d == 0 && this.b > 0) {
            removeMessages(2);
            sendMessageDelayed(Message.obtain(this, 1, Boolean.FALSE), 200L);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aadc06", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45957343", new Object[]{this})).intValue();
        }
        return this.f12156a;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.view.View] */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2 && this.f12156a != 2) {
                int i3 = -this.b;
                f fVar = this.c;
                if (!(fVar == null || fVar.getView() == 0)) {
                    i3 = (int) this.c.getView().getTranslationY();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i3, 0);
                ofInt.addListener(new c(i3));
                ofInt.addUpdateListener(new d());
                ofInt.setDuration(250L);
                ofInt.start();
            }
        } else if (this.f12156a != 1) {
            f fVar2 = this.c;
            if (!(fVar2 == null || fVar2.getView() == 0)) {
                i = (int) this.c.getView().getTranslationY();
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i, -this.b);
            ofInt2.addListener(new a(i));
            ofInt2.addUpdateListener(new b());
            ofInt2.setDuration(250L);
            ofInt2.start();
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf56c347", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2254f56", new Object[]{this})).booleanValue();
        }
        if (this.f12156a == 1) {
            return true;
        }
        return false;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd2f06c", new Object[]{this});
        } else {
            q();
        }
    }

    public void l(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6718627c", new Object[]{this, map});
            return;
        }
        Boolean bool = (Boolean) map.get("foldTab");
        if (bool == null) {
            int intValue = ((Integer) map.get("totalY")).intValue();
            float floatValue = ((Float) map.get("moveY")).floatValue();
            int i = this.b;
            f fVar = this.c;
            if (fVar != null && ((f.b) fVar.getViewParams()).z0 > 0) {
                i = ((f.b) this.c.getViewParams()).z0;
            }
            if (intValue >= i && (-floatValue) > i && (((Float) map.get("mDy")).floatValue() < 0.0f || ((Integer) map.get("dy")).intValue() > 0)) {
                f();
            } else if (((Float) map.get("mDy")).floatValue() <= 0.0f && ((Integer) map.get("dy")).intValue() >= 0) {
            } else {
                if (intValue == 0) {
                    q();
                    return;
                }
                f fVar2 = this.c;
                if (fVar2 == null) {
                    return;
                }
                if (floatValue > i && !((f.b) fVar2.getViewParams()).y0) {
                    q();
                } else if (intValue <= i || ((Integer) map.get("firstIndex")).intValue() == 0) {
                    q();
                }
            }
        } else if (bool.booleanValue()) {
            f();
        } else {
            q();
        }
    }

    public void m(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82e3e93", new Object[]{this, map});
        } else if (map.containsKey("foldTab")) {
            if (String.valueOf(map.get("foldTab")).equals("true")) {
                f();
            }
        } else if (map.containsKey("unfoldTab") && String.valueOf(map.get("unfoldTab")).equals("true")) {
            q();
        }
    }

    public void o(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2b539f", new Object[]{this, eVar});
        } else {
            ((ArrayList) this.e).remove(eVar);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f12156a = 2;
        removeCallbacksAndMessages(null);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68eb222", new Object[]{this});
        } else if (!hasMessages(2) && this.f12156a != 2 && this.d == 0 && this.b > 0) {
            removeMessages(1);
            sendMessageDelayed(Message.obtain(this, 2, Boolean.FALSE), 200L);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33863f86", new Object[]{this});
            return;
        }
        f fVar = this.c;
        if (fVar != null) {
            int i = this.b;
            if (fVar.getNode() != null && this.c.getNode().S() != null) {
                int i2 = this.c.getNode().S().b;
                this.b = i2;
                if (i != i2 && this.f12156a == 1) {
                    s(i2, i2, false);
                }
            }
        }
    }

    public int s(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df631059", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        int i3 = this.f12156a;
        if (i >= i2) {
            this.f12156a = 1;
        } else if (i <= 0 || i >= i2) {
            this.f12156a = 2;
        } else {
            this.f12156a = 0;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(-i, this.b, i3, z);
        }
        return i3;
    }
}
