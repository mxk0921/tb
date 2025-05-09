package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import java.util.ArrayList;
import java.util.Iterator;
import tb.dh7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s2m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SIZE_TYPE_END_SIZE = 2;
    public static final int SIZE_TYPE_NO_VALUE = -1;
    public static final int SIZE_TYPE_ORIGINAL_SIZE = 1;
    public static final int SIZE_TYPE_PROCESS_SIZE = 3;

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f27760a;
    public final cxj b;
    public x3w c;
    public int d;
    public int e;
    public float f;
    public float g;
    public boolean h;
    public String j;
    public ArrayList<qqd> k;
    public float i = -1.0f;
    public boolean l = true;
    public int m = -1;

    static {
        t2o.a(352322159);
    }

    public s2m(dh7 dh7Var, cxj cxjVar) {
        this.f27760a = dh7Var;
        this.b = cxjVar;
        v();
    }

    public static /* synthetic */ boolean a(s2m s2mVar, dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6e5721", new Object[]{s2mVar, jVar})).booleanValue();
        }
        return s2mVar.y(jVar);
    }

    public static /* synthetic */ float b(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0be377b", new Object[]{s2mVar})).floatValue();
        }
        return s2mVar.f;
    }

    public static /* synthetic */ String c(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11345fe3", new Object[]{s2mVar});
        }
        return s2mVar.u();
    }

    public static /* synthetic */ float d(s2m s2mVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce657707", new Object[]{s2mVar, new Float(f)})).floatValue();
        }
        s2mVar.f = f;
        return f;
    }

    public static /* synthetic */ x3w e(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ba7233b7", new Object[]{s2mVar});
        }
        return s2mVar.c;
    }

    public static /* synthetic */ boolean f(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e6551f", new Object[]{s2mVar})).booleanValue();
        }
        return s2mVar.h;
    }

    public static /* synthetic */ boolean g(s2m s2mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c341569f", new Object[]{s2mVar, new Boolean(z)})).booleanValue();
        }
        s2mVar.h = z;
        return z;
    }

    public static /* synthetic */ float h(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2d564da", new Object[]{s2mVar})).floatValue();
        }
        return s2mVar.g;
    }

    public static /* synthetic */ float i(s2m s2mVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf33f588", new Object[]{s2mVar, new Float(f)})).floatValue();
        }
        s2mVar.g = f;
        return f;
    }

    public static /* synthetic */ float j(s2m s2mVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0027409", new Object[]{s2mVar, new Float(f)})).floatValue();
        }
        s2mVar.i = f;
        return f;
    }

    public static /* synthetic */ int k(s2m s2mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0d0fdd0", new Object[]{s2mVar, new Integer(i)})).intValue();
        }
        s2mVar.m = i;
        return i;
    }

    public static /* synthetic */ String l(s2m s2mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59114ab1", new Object[]{s2mVar, str});
        }
        s2mVar.j = str;
        return str;
    }

    public static /* synthetic */ int m(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb321a59", new Object[]{s2mVar})).intValue();
        }
        return s2mVar.d;
    }

    public static /* synthetic */ int n(s2m s2mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26dfad2", new Object[]{s2mVar, new Integer(i)})).intValue();
        }
        s2mVar.d = i;
        return i;
    }

    public static /* synthetic */ cxj o(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("83a896c2", new Object[]{s2mVar});
        }
        return s2mVar.b;
    }

    public static /* synthetic */ int p(s2m s2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f607517", new Object[]{s2mVar})).intValue();
        }
        return s2mVar.e;
    }

    public static /* synthetic */ int q(s2m s2mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d40af7d4", new Object[]{s2mVar, new Integer(i)})).intValue();
        }
        s2mVar.e = i;
        return i;
    }

    public static /* synthetic */ boolean r(s2m s2mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4d9b637", new Object[]{s2mVar, new Boolean(z)})).booleanValue();
        }
        s2mVar.l = z;
        return z;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a12b22c", new Object[]{this});
            return;
        }
        ArrayList<qqd> arrayList = this.k;
        if (arrayList != null) {
            Iterator<qqd> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().x(this);
            }
        }
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("518ff4f2", new Object[]{this});
        }
        return this.b.j().B();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b696aa", new Object[]{this});
        } else {
            this.f27760a.s(new a());
        }
    }

    public void w(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa89fbe", new Object[]{this, qqdVar});
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(qqdVar);
    }

    public void x(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da218f", new Object[]{this, x3wVar});
        } else {
            this.c = x3wVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dh7.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dh7.k
        public void a(dh7.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe7ec9", new Object[]{this, jVar});
            } else if (s2m.a(s2m.this, jVar)) {
                s2m.j(s2m.this, (jVar.d - s2m.b(s2m.this)) / (s2m.h(s2m.this) - s2m.b(s2m.this)));
                s2m.k(s2m.this, 3);
                s2m.this.t();
            }
        }

        @Override // tb.dh7.k
        public void b(String str, dh7.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7685d0c3", new Object[]{this, str, jVar});
            } else if (s2m.a(s2m.this, jVar)) {
                s2m.l(s2m.this, str);
                if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                    s2m.d(s2m.this, jVar.f17820a);
                    s2m.i(s2m.this, jVar.b);
                    s2m s2mVar = s2m.this;
                    s2m.n(s2mVar, cxo.c(s2m.o(s2mVar).i()));
                    s2m s2mVar2 = s2m.this;
                    s2m.q(s2mVar2, ((int) jVar.b) - cxo.c(s2m.o(s2mVar2).i()));
                    s2m.r(s2m.this, false);
                    txj.e(txj.TAG_PIC_ZOOM, "页面：" + s2m.c(s2m.this) + " " + s2m.e(s2m.this).f31127a + "IN_ANIMATION_START, popStartY: " + jVar.f17820a + ", popEndY: " + jVar.b + ", videoEndMarginTop: " + s2m.m(s2m.this) + ", videoEndHeight: " + s2m.p(s2m.this));
                } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_START.equals(str)) {
                    if (jVar.b > jVar.f17820a) {
                        s2m.g(s2m.this, true);
                    } else {
                        s2m.g(s2m.this, false);
                    }
                    txj.e(txj.TAG_PIC_ZOOM, "页面：" + s2m.c(s2m.this) + " " + s2m.e(s2m.this).f31127a + str + ", position.startY: " + jVar.f17820a + ", position.endY: " + jVar.b);
                } else if (IAKPopRender.LifecycleType.IN_ANIMATION_END.equals(str)) {
                    s2m.k(s2m.this, 2);
                    txj.e(txj.TAG_PIC_ZOOM, "页面：" + s2m.c(s2m.this) + " " + s2m.e(s2m.this).f31127a + str + ", videoEndMarginTop: " + s2m.m(s2m.this) + ", videoEndHeight: " + s2m.p(s2m.this));
                    s2m.this.t();
                } else if (IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END.equals(str)) {
                    if (!s2m.f(s2m.this)) {
                        s2m.k(s2m.this, 2);
                        txj.e(txj.TAG_PIC_ZOOM, "页面：" + s2m.c(s2m.this) + " " + s2m.e(s2m.this).f31127a + str + ", videoEndMarginTop: " + s2m.m(s2m.this) + ", videoEndHeight: " + s2m.p(s2m.this));
                        s2m.this.t();
                    }
                } else if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                    s2m.k(s2m.this, 1);
                    txj.e(txj.TAG_PIC_ZOOM, "页面：" + s2m.c(s2m.this) + " " + s2m.e(s2m.this).f31127a + str + ", videoEndMarginTop: " + s2m.m(s2m.this) + ", videoEndHeight: " + s2m.p(s2m.this));
                    s2m.this.t();
                    s2m.r(s2m.this, true);
                }
            }
        }
    }

    public final boolean y(dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b837a2c", new Object[]{this, jVar})).booleanValue();
        }
        if (jVar == null) {
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " position为空,不响应");
            return false;
        }
        x3w B = this.f27760a.B();
        if (B == null) {
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " currentDisplayNode为空,不响应");
            return false;
        }
        x3w x3wVar = this.c;
        if (x3wVar == null) {
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " mCurrentNode为空,不响应");
            return false;
        } else if (!x3wVar.q()) {
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " 开关关闭,不响应");
            return false;
        } else if (this.c.f31127a != B.f31127a) {
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " currentIndex: " + this.c.f31127a + "displayIndex: " + B.f31127a + "不匹配, 不响应");
            return false;
        } else {
            NewDetailScreenConfig.ScreenType a2 = this.b.j().K().a();
            if (!NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.equals(a2) && !NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.equals(a2)) {
                return true;
            }
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + " screenType不支持，不响应");
            return false;
        }
    }

    public void s(boolean z, qrc qrcVar, View view, int[] iArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6457c6c", new Object[]{this, new Boolean(z), qrcVar, view, iArr});
        } else if (this.j == null || this.l) {
        } else {
            if (qrcVar == null) {
                txj.e(txj.TAG_PIC_ZOOM, "adjustVideoSize失效，mVideoFrameSizeObject为空");
                return;
            }
            int i2 = qrcVar.c;
            int i3 = qrcVar.e;
            float f = this.i;
            int i4 = this.m;
            if (i4 == 1) {
                i = i2;
            } else if (i4 == 2) {
                i = this.e;
                i3 = this.d;
            } else if (i4 != 3) {
                qyj.b("unknownSizeType", "未知的尺寸类型。mCurrentPopSizeType:" + this.m);
                return;
            } else {
                i = (int) (i2 - ((i2 - this.e) * f));
                i3 = (int) (i3 - ((i3 - this.d) * f));
            }
            if (view == null) {
                txj.e(txj.TAG_PIC_ZOOM, "adjustVideoSize失效，mDWInstance.getView()为空");
                return;
            }
            int i5 = (int) (i * (qrcVar.d / i2));
            if (iArr != null && iArr.length >= 2) {
                iArr[0] = i5;
                iArr[1] = i;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                txj.e(txj.TAG_PIC_ZOOM, "adjustVideoSize失效，LayoutParams类型不符");
                return;
            }
            ViewParent parent = view.getParent();
            boolean z2 = parent instanceof RoundRectCardRoot;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i;
            if (!z2) {
                marginLayoutParams.topMargin = i3;
            } else {
                ViewGroup.LayoutParams layoutParams2 = ((RoundRectCardRoot) parent).getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i3;
                }
            }
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            view.setLayoutParams(marginLayoutParams);
            txj.e(txj.TAG_PIC_ZOOM, "页面：" + u() + ",index:" + this.c.f31127a + ",VideoEndHeight: " + this.e + ",VideoEndMarginTop: " + this.d + ", ratio: " + f + ",height:" + i + ",marginTop:" + i3);
        }
    }
}
