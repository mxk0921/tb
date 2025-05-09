package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXScroller;
import com.taobao.weex.ui.component.WXText;
import com.taobao.weex.ui.view.WXTextView;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, lbe> f17378a;
    public static final l b = new l();
    public static final m c = new m();
    public static final List<String> d = Arrays.asList("width", "height", pg1.ATOM_EXT_UDL_margin_left, pg1.ATOM_EXT_UDL_margin_right, pg1.ATOM_EXT_UDL_margin_top, pg1.ATOM_EXT_UDL_margin_bottom, pg1.ATOM_EXT_UDL_padding_left, pg1.ATOM_EXT_UDL_padding_right, pg1.ATOM_EXT_UDL_padding_top, pg1.ATOM_EXT_UDL_padding_bottom);
    public static final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17379a;
            public final /* synthetic */ int b;

            public a(View view, int i) {
                this.f17379a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17379a.getBackground();
                if (background == null) {
                    this.f17379a.setBackgroundColor(this.b);
                } else if (background instanceof BorderDrawable) {
                    ((BorderDrawable) background).setColor(this.b);
                } else if (background instanceof ColorDrawable) {
                    ((ColorDrawable) background).setColor(this.b);
                }
            }
        }

        public b() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Integer) {
                cww.c(new a(view, ((Integer) obj).intValue()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17380a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17380a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17380a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) cww.b(this.b, this.c));
                }
            }
        }

        public c() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17381a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17381a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17381a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) cww.b(this.b, this.c));
                }
            }
        }

        public d() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17382a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17382a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17382a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) cww.b(this.b, this.c));
                }
            }
        }

        public e() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17383a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17383a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17383a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) cww.b(this.b, this.c));
                }
            }
        }

        public f() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17384a;
            public final /* synthetic */ ArrayList b;
            public final /* synthetic */ a.c c;

            public a(View view, ArrayList arrayList, a.c cVar) {
                this.f17384a = view;
                this.b = arrayList;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                double d;
                double d2;
                double d3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17384a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    boolean z = this.b.get(0) instanceof Double;
                    double d4 = vu3.b.GEO_NOT_SUPPORT;
                    if (z) {
                        d = ((Double) this.b.get(0)).doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    if (this.b.get(1) instanceof Double) {
                        d2 = ((Double) this.b.get(1)).doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    if (this.b.get(2) instanceof Double) {
                        d3 = ((Double) this.b.get(2)).doubleValue();
                    } else {
                        d3 = 0.0d;
                    }
                    if (this.b.get(3) instanceof Double) {
                        d4 = ((Double) this.b.get(3)).doubleValue();
                    }
                    BorderDrawable borderDrawable = (BorderDrawable) background;
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) cww.b(d, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) cww.b(d2, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) cww.b(d3, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) cww.b(d4, this.c));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17385a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public b(View view, double d, a.c cVar) {
                this.f17385a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17385a.getBackground();
                if (background != null && (background instanceof BorderDrawable)) {
                    BorderDrawable borderDrawable = (BorderDrawable) background;
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) cww.b(this.b, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) cww.b(this.b, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) cww.b(this.b, this.c));
                    borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) cww.b(this.b, this.c));
                }
            }
        }

        public g() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() == 4) {
                    cww.c(new a(view, arrayList, cVar));
                }
            } else if (obj instanceof Double) {
                cww.c(new b(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17386a;
            public final /* synthetic */ int b;
            public final /* synthetic */ WXComponent c;

            public a(View view, int i, WXComponent wXComponent) {
                this.f17386a = view;
                this.b = i;
                this.c = wXComponent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WXTextView wXTextView = this.f17386a;
                if (wXTextView instanceof TextView) {
                    ((TextView) wXTextView).setTextColor(this.b);
                } else if ((this.c instanceof WXText) && (wXTextView instanceof WXTextView)) {
                    try {
                        wXTextView.setTextColor(this.b);
                        this.f17386a.invalidate();
                    } catch (Throwable th) {
                        gfh.c("can not update text color, try fallback to call the old API", th);
                        Layout textLayout = this.f17386a.getTextLayout();
                        if (textLayout != null) {
                            TextPaint paint = textLayout.getPaint();
                            if (paint != null) {
                                paint.setColor(this.b);
                            }
                            this.f17386a.invalidate();
                        }
                    }
                }
            }
        }

        public h() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Integer) {
                cww.c(new a(view, ((Integer) obj).intValue(), wXComponent));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class i implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17387a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17387a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f17387a.setScrollX((int) cww.b(this.b, this.c));
                this.f17387a.setScrollY((int) cww.b(this.b, this.c));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17388a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;
            public final /* synthetic */ double d;

            public b(View view, double d, a.c cVar, double d2) {
                this.f17388a = view;
                this.b = d;
                this.c = cVar;
                this.d = d2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f17388a.setScrollX((int) cww.b(this.b, this.c));
                this.f17388a.setScrollY((int) cww.b(this.d, this.c));
            }
        }

        public i() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
                return;
            }
            View a2 = cww.a(wXComponent);
            if (a2 != null) {
                if (obj instanceof Double) {
                    cww.c(new a(a2, ((Double) obj).doubleValue(), cVar));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                        cww.c(new b(a2, ((Double) arrayList.get(0)).doubleValue(), cVar, ((Double) arrayList.get(1)).doubleValue()));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class j implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17389a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17389a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17389a.setScrollX((int) cww.b(this.b, this.c));
                }
            }
        }

        public j() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
                return;
            }
            View a2 = cww.a(wXComponent);
            if (a2 != null && (obj instanceof Double)) {
                cww.c(new a(a2, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class k implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17390a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17390a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17390a.setScrollY((int) cww.b(this.b, this.c));
                }
            }
        }

        public k() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if ((obj instanceof Double) && (a2 = cww.a(wXComponent)) != null) {
                cww.c(new a(a2, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class m implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class n implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17392a;
            public final /* synthetic */ float b;

            public a(View view, float f) {
                this.f17392a = view;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17392a.setAlpha(this.b);
                }
            }
        }

        public n() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, (float) ((Double) obj).doubleValue()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class o implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17393a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17393a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int l = pxv.l(this.b.getContext(), WXUtils.getInt(this.f17393a.get(Constants.Name.PERSPECTIVE)));
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17393a.get("transformOrigin"), null), this.b);
                if (l != 0) {
                    this.b.setCameraDistance(l);
                }
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setRotation((float) ((Double) this.c).doubleValue());
            }
        }

        public o() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class p implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17394a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17394a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int l = pxv.l(this.b.getContext(), WXUtils.getInt(this.f17394a.get(Constants.Name.PERSPECTIVE)));
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17394a.get("transformOrigin"), null), this.b);
                if (l != 0) {
                    this.b.setCameraDistance(l);
                }
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setRotationX((float) ((Double) this.c).doubleValue());
            }
        }

        public p() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class q implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17395a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17395a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int l = pxv.l(this.b.getContext(), WXUtils.getInt(this.f17395a.get(Constants.Name.PERSPECTIVE)));
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17395a.get("transformOrigin"), null), this.b);
                if (l != 0) {
                    this.b.setCameraDistance(l);
                }
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setRotationY((float) ((Double) this.c).doubleValue());
            }
        }

        public q() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class r implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else {
                cww.c(new a(map, view, obj));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17396a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17396a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int l = pxv.l(this.b.getContext(), WXUtils.getInt(this.f17396a.get(Constants.Name.PERSPECTIVE)));
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17396a.get("transformOrigin"), null), this.b);
                if (l != 0) {
                    this.b.setCameraDistance(l);
                }
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                Object obj = this.c;
                if (obj instanceof Double) {
                    float doubleValue = (float) ((Double) obj).doubleValue();
                    this.b.setScaleX(doubleValue);
                    this.b.setScaleY(doubleValue);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                        double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                        double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                        this.b.setScaleX((float) doubleValue2);
                        this.b.setScaleY((float) doubleValue3);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class s implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17397a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17397a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17397a.get("transformOrigin"), null), this.b);
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setScaleX((float) ((Double) this.c).doubleValue());
            }
        }

        public s() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class t implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17398a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17398a = map;
                this.b = view;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Pair<Float, Float> m = pxv.m(WXUtils.getString(this.f17398a.get("transformOrigin"), null), this.b);
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setScaleY((float) ((Double) this.c).doubleValue());
            }
        }

        public t() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class u implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17399a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;
            public final /* synthetic */ double d;

            public a(View view, double d, a.c cVar, double d2) {
                this.f17399a = view;
                this.b = d;
                this.c = cVar;
                this.d = d2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f17399a.setTranslationX((float) cww.b(this.b, this.c));
                this.f17399a.setTranslationY((float) cww.b(this.d, this.c));
            }
        }

        public u() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                    cww.c(new a(view, ((Double) arrayList.get(0)).doubleValue(), cVar, ((Double) arrayList.get(1)).doubleValue()));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class v implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17400a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17400a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17400a.setTranslationX((float) cww.b(this.b, this.c));
                }
            }
        }

        public v() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class w implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17401a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17401a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17401a.setTranslationY((float) cww.b(this.b, this.c));
                }
            }
        }

        public w() {
        }

        @Override // tb.lbe
        public void a(WXComponent wXComponent, View view, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb27723", new Object[]{this, wXComponent, view, obj, cVar, map});
            } else if (obj instanceof Double) {
                cww.c(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17378a = hashMap;
        hashMap.put("opacity", new n());
        hashMap.put("transform.translate", new u());
        hashMap.put("transform.translateX", new v());
        hashMap.put("transform.translateY", new w());
        hashMap.put("transform.scale", new r());
        hashMap.put("transform.scaleX", new s());
        hashMap.put("transform.scaleY", new t());
        hashMap.put("transform.rotate", new o());
        hashMap.put("transform.rotateZ", new o());
        hashMap.put("transform.rotateX", new p());
        hashMap.put("transform.rotateY", new q());
        hashMap.put(pg1.ATOM_EXT_UDL_background_color, new b());
        hashMap.put("color", new h());
        hashMap.put("scroll.contentOffset", new i());
        hashMap.put("scroll.contentOffsetX", new j());
        hashMap.put("scroll.contentOffsetY", new k());
        hashMap.put(pg1.ATOM_EXT_UDL_border_top_left_radius, new e());
        hashMap.put(pg1.ATOM_EXT_UDL_border_top_right_radius, new f());
        hashMap.put(pg1.ATOM_EXT_UDL_border_bottom_left_radius, new c());
        hashMap.put(pg1.ATOM_EXT_UDL_border_bottom_right_radius, new d());
        hashMap.put(pg1.ATOM_EXT_UDL_border_radius, new g());
    }

    public static /* synthetic */ View a(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6c8a4dad", new Object[]{wXComponent});
        }
        return e(wXComponent);
    }

    public static /* synthetic */ double b(double d2, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52f55ad2", new Object[]{new Double(d2), cVar})).doubleValue();
        }
        return g(d2, cVar);
    }

    public static /* synthetic */ void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b49c6", new Object[]{runnable});
        } else {
            h(runnable);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273508", new Object[0]);
        } else {
            e.removeCallbacksAndMessages(null);
        }
    }

    public static View e(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a0b07105", new Object[]{wXComponent});
        }
        if (wXComponent instanceof WXScroller) {
            return ((WXScroller) wXComponent).getInnerView();
        }
        gfh.b("scroll offset only support on Scroller Component");
        return null;
    }

    public static lbe f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbe) ipChange.ipc$dispatch("ab2647cb", new Object[]{str});
        }
        lbe lbeVar = (lbe) ((HashMap) f17378a).get(str);
        if (lbeVar != null) {
            return lbeVar;
        }
        if (d.contains(str)) {
            l lVar = b;
            lVar.b(str);
            return lVar;
        }
        gfh.b("unknown property [" + str + "]");
        return c;
    }

    public static double g(double d2, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9adedf07", new Object[]{new Double(d2), cVar})).doubleValue();
        }
        return cVar.a(d2, new Object[0]);
    }

    public static void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            e.post(new qyw(runnable));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class l implements lbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17391a;

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a53493", new Object[]{this, str});
            } else {
                this.f17391a = str;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
            if (r2.equals(tb.pg1.ATOM_EXT_UDL_padding_bottom) == false) goto L_0x0051;
         */
        @Override // tb.lbe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.taobao.weex.ui.component.WXComponent r19, android.view.View r20, java.lang.Object r21, com.alibaba.android.bindingx.core.a.c r22, java.util.Map<java.lang.String, java.lang.Object> r23) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.cww.l.a(com.taobao.weex.ui.component.WXComponent, android.view.View, java.lang.Object, com.alibaba.android.bindingx.core.a$c, java.util.Map):void");
        }
    }
}
