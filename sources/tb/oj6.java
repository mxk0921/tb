package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oj6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_EASE = 4;
    public static final int FUNC_EASE_IN = 1;
    public static final int FUNC_EASE_IN_OUT = 3;
    public static final int FUNC_EASE_OUT = 2;
    public static final int FUNC_LINEAR = 0;
    public static final int PROP_BACKGROUND_COLOR = 2;
    public static final int PROP_OPACITY = 1;
    public static final int PROP_TRANSFORM = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f25423a;
        public final /* synthetic */ float b;
        public final /* synthetic */ View c;

        public a(float f, float f2, View view) {
            this.f25423a = f;
            this.b = f2;
            this.c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                float f = this.f25423a;
                this.c.setAlpha(f + ((this.b - f) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25424a;
        public final /* synthetic */ float b;

        public b(View view, float f) {
            this.f25424a = view;
            this.b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                this.f25424a.setAlpha(this.b);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                this.f25424a.setAlpha(this.b);
            }
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
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25425a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;

        public c(int i, int i2, View view) {
            this.f25425a = i;
            this.b = i2;
            this.c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue != 0.0f) {
                    int red = Color.red(this.f25425a);
                    int green = Color.green(this.f25425a);
                    int blue = Color.blue(this.f25425a);
                    int alpha = Color.alpha(this.f25425a);
                    this.c.setBackgroundColor(Color.argb((int) (alpha + ((Color.alpha(this.b) - alpha) * floatValue)), (int) (red + ((Color.red(this.b) - red) * floatValue)), (int) (green + ((Color.green(this.b) - green) * floatValue)), (int) (blue + ((Color.blue(this.b) - blue) * floatValue))));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25426a;
        public final /* synthetic */ int b;

        public d(View view, int i) {
            this.f25426a = view;
            this.b = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                this.f25426a.setBackgroundColor(this.b);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                this.f25426a.setBackgroundColor(this.b);
            }
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
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f25427a;
        public final long b;
        public final long c;
        public final int d;

        static {
            t2o.a(444597501);
        }

        public e(int i, long j, long j2, int i2) {
            this.f25427a = i;
            this.b = j;
            this.c = j2;
            this.d = i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransitionProp{prop=" + this.f25427a + ", delayInMs=" + this.b + ", durationInMs=" + this.c + ", func=" + this.d + '}';
        }
    }

    static {
        t2o.a(444597496);
    }

    public static Interpolator a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("eda58e21", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
        }
        if (i == 2) {
            return PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        }
        if (i == 3) {
            return PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);
        }
        if (i != 4) {
            return new LinearInterpolator();
        }
        return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe747518", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3105774:
                if (str.equals(Constants.TimeFunction.EASE)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 1;
        }
        if (c2 == 1) {
            return 2;
        }
        if (c2 == 2) {
            return 3;
        }
        if (c2 != 3) {
            return 0;
        }
        return 4;
    }

    public static ValueAnimator d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("e3214d5c", new Object[]{eVar});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(eVar.c);
        ofFloat.setStartDelay(eVar.b);
        ofFloat.setInterpolator(a(eVar.d));
        return ofFloat;
    }

    public static List<Animator> g(List<e> list, View view, float f, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("27123986", new Object[]{list, view, new Float(f), new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            boolean z = false;
            loop0: while (true) {
                boolean z2 = false;
                for (e eVar : list) {
                    int i3 = eVar.f25427a;
                    if (i3 != 1) {
                        if (i3 == 2 && !z2) {
                            if (view.getBackground() instanceof ColorDrawable) {
                                i2 = ((ColorDrawable) view.getBackground()).getColor();
                            } else {
                                i2 = 16777215;
                            }
                            if (i == i2) {
                                break;
                            }
                            ValueAnimator d2 = d(eVar);
                            d2.addUpdateListener(new c(i2, i, view));
                            d2.addListener(new d(view, i));
                            arrayList.add(d2);
                            z2 = true;
                        }
                    } else if (!z) {
                        float alpha = view.getAlpha();
                        if (Float.compare(alpha, f) == 0) {
                            z = false;
                        } else {
                            ValueAnimator d3 = d(eVar);
                            d3.addUpdateListener(new a(alpha, f, view));
                            d3.addListener(new b(view, f));
                            arrayList.add(d3);
                            z = true;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da934f6", new Object[]{str})).longValue();
        }
        if (str.endsWith("ms")) {
            return Float.parseFloat(str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) * 1000.0f;
        }
        throw new IllegalArgumentException("Invalid transition time: ".concat(str));
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63325cf7", new Object[]{str})).intValue();
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1267206133:
                    if (str.equals("opacity")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 605322756:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_color)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 0;
                default:
                    throw new IllegalArgumentException("Invalid Transition prop: ".concat(str));
            }
        } else {
            throw new IllegalArgumentException("Invalid Transition prop: " + str);
        }
    }

    public static List<e> e(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long j;
        int i;
        String str7;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("319a6011", new Object[]{str, str2, str3, str4, str5});
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        String[] strArr = null;
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (!isEmpty) {
            String[] split = str.split(",");
            LinkedList linkedList = new LinkedList();
            for (String str9 : split) {
                String[] split2 = str9.trim().split("\\s");
                if (split2.length == 3) {
                    linkedList.add(new e(c(split2[0].trim()), 0L, f(split2[1].trim()), b(split2[2].trim())));
                } else {
                    throw new IllegalArgumentException("split by space array's length != 3");
                }
            }
            return linkedList;
        } else if (TextUtils.isEmpty(str3)) {
            return null;
        } else {
            String[] split3 = str2.split(",");
            String[] split4 = str3.split(",");
            String[] split5 = TextUtils.isEmpty(str4) ? null : str4.split(",");
            String[] split6 = TextUtils.isEmpty(str5) ? null : str5.split(",");
            if (!(split4.length == 1 || split4.length == split3.length)) {
                return null;
            }
            if (!(split5 == null || split5.length == 1 || split5.length == split3.length)) {
                split5 = null;
            }
            if (split6 == null || split6.length == 1 || split6.length == split3.length) {
                strArr = split6;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i2 = 0; i2 < split3.length; i2++) {
                int c2 = c(split3[i2].trim());
                if (split4.length != split3.length) {
                    str6 = split4[0];
                } else {
                    str6 = split4[i2];
                }
                long f = f(str6.trim());
                if (split5 != null) {
                    if (split5.length != split3.length) {
                        str8 = split5[0];
                    } else {
                        str8 = split5[i2];
                    }
                    j = f(str8.trim());
                } else {
                    j = 0;
                }
                if (strArr != null) {
                    if (strArr.length != split3.length) {
                        str7 = strArr[0];
                    } else {
                        str7 = strArr[i2];
                    }
                    i = b(str7.trim());
                } else {
                    i = 0;
                }
                linkedList2.add(new e(c2, j, f, i));
            }
            return linkedList2;
        }
    }
}
