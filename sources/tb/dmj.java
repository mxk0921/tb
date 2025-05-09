package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, lyc> f17920a;
    public static final f b = new f();
    public static final g c = new g();
    public static final List<String> d = Arrays.asList("width", "height", pg1.ATOM_EXT_UDL_margin_left, pg1.ATOM_EXT_UDL_margin_right, pg1.ATOM_EXT_UDL_margin_top, pg1.ATOM_EXT_UDL_margin_bottom, pg1.ATOM_EXT_UDL_padding_left, pg1.ATOM_EXT_UDL_padding_right, pg1.ATOM_EXT_UDL_padding_top, pg1.ATOM_EXT_UDL_padding_bottom);
    public static final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17921a;
            public final /* synthetic */ int b;

            public a(View view, int i) {
                this.f17921a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Drawable background = this.f17921a.getBackground();
                if (background == null) {
                    this.f17921a.setBackgroundColor(this.b);
                } else if (background instanceof ColorDrawable) {
                    ((ColorDrawable) background).setColor(this.b);
                }
            }
        }

        public b() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Integer) {
                dmj.a(new a(view, ((Integer) obj).intValue()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17922a;
            public final /* synthetic */ int b;

            public a(View view, int i) {
                this.f17922a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = this.f17922a;
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(this.b);
                }
            }
        }

        public c() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Integer) {
                dmj.a(new a(view, ((Integer) obj).intValue()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17923a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17923a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17923a.setScrollX((int) dmj.b(this.b, this.c));
                }
            }
        }

        public d() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17924a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17924a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17924a.setScrollY((int) dmj.b(this.b, this.c));
                }
            }
        }

        public e() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17936a;
            public final /* synthetic */ float b;

            public a(View view, float f) {
                this.f17936a = view;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17936a.setAlpha(this.b);
                }
            }
        }

        public h() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(view, (float) ((Double) obj).doubleValue()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class i implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17937a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17937a = map;
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
                int l = pxv.l(this.b.getContext(), dmj.c(this.f17937a, Constants.Name.PERSPECTIVE));
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17937a, "transformOrigin"), this.b);
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

        public i() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class j implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17938a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17938a = map;
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
                int l = pxv.l(this.b.getContext(), dmj.c(this.f17938a, Constants.Name.PERSPECTIVE));
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17938a, "transformOrigin"), this.b);
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

        public j() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class k implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17939a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17939a = map;
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
                int l = pxv.l(this.b.getContext(), dmj.c(this.f17939a, Constants.Name.PERSPECTIVE));
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17939a, "transformOrigin"), this.b);
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

        public k() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class l implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else {
                dmj.a(new a(map, view, obj));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17940a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17940a = map;
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
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17940a, "transformOrigin"), this.b);
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
    public static final class m implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17941a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17941a = map;
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
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17941a, "transformOrigin"), this.b);
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setScaleX((float) ((Double) this.c).doubleValue());
            }
        }

        public m() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class n implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f17942a;
            public final /* synthetic */ View b;
            public final /* synthetic */ Object c;

            public a(Map map, View view, Object obj) {
                this.f17942a = map;
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
                Pair<Float, Float> m = pxv.m(pxv.h(this.f17942a, "transformOrigin"), this.b);
                if (m != null) {
                    this.b.setPivotX(((Float) m.first).floatValue());
                    this.b.setPivotY(((Float) m.second).floatValue());
                }
                this.b.setScaleY((float) ((Double) this.c).doubleValue());
            }
        }

        public n() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(map, view, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class o implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17943a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;
            public final /* synthetic */ double d;

            public a(View view, double d, a.c cVar, double d2) {
                this.f17943a = view;
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
                this.f17943a.setTranslationX((float) dmj.b(this.b, this.c));
                this.f17943a.setTranslationY((float) dmj.b(this.d, this.c));
            }
        }

        public o() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                    dmj.a(new a(view, ((Double) arrayList.get(0)).doubleValue(), cVar, ((Double) arrayList.get(1)).doubleValue()));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class p implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17944a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17944a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17944a.setTranslationX((float) dmj.b(this.b, this.c));
                }
            }
        }

        public p() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class q implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17945a;
            public final /* synthetic */ double b;
            public final /* synthetic */ a.c c;

            public a(View view, double d, a.c cVar) {
                this.f17945a = view;
                this.b = d;
                this.c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f17945a.setTranslationY((float) dmj.b(this.b, this.c));
                }
            }
        }

        public q() {
        }

        @Override // tb.lyc
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf2d6f72", new Object[]{this, view, str, obj, cVar, map});
            } else if (obj instanceof Double) {
                dmj.a(new a(view, ((Double) obj).doubleValue(), cVar));
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17920a = hashMap;
        hashMap.put("opacity", new h());
        hashMap.put("transform.translate", new o());
        hashMap.put("transform.translateX", new p());
        hashMap.put("transform.translateY", new q());
        hashMap.put("transform.scale", new l());
        hashMap.put("transform.scaleX", new m());
        hashMap.put("transform.scaleY", new n());
        hashMap.put("transform.rotate", new i());
        hashMap.put("transform.rotateZ", new i());
        hashMap.put("transform.rotateX", new j());
        hashMap.put("transform.rotateY", new k());
        hashMap.put(pg1.ATOM_EXT_UDL_background_color, new b());
        hashMap.put("color", new c());
        hashMap.put("scroll.contentOffsetX", new d());
        hashMap.put("scroll.contentOffsetY", new e());
    }

    public static /* synthetic */ void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06d74aa", new Object[]{runnable});
        } else {
            h(runnable);
        }
    }

    public static /* synthetic */ double b(double d2, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("193d9a38", new Object[]{new Double(d2), cVar})).doubleValue();
        }
        return g(d2, cVar);
    }

    public static /* synthetic */ int c(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85c74d14", new Object[]{map, str})).intValue();
        }
        return f(map, str);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273508", new Object[0]);
        } else {
            e.removeCallbacksAndMessages(null);
        }
    }

    public static lyc e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyc) ipChange.ipc$dispatch("c7a1dc1f", new Object[]{str});
        }
        lyc lycVar = (lyc) ((HashMap) f17920a).get(str);
        if (lycVar != null) {
            return lycVar;
        }
        if (d.contains(str)) {
            f fVar = b;
            fVar.b(str);
            return fVar;
        }
        gfh.b("unknown property [" + str + "]");
        return c;
    }

    public static int f(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1eb85523", new Object[]{map, str})).intValue();
        }
        if (map == null || TextUtils.isEmpty(str) || (obj = map.get(str)) == null) {
            return 0;
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
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
    public static final class f implements lyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17925a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17926a;
            public final /* synthetic */ int b;

            public a(View view, int i) {
                this.f17926a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = this.f17926a;
                view.setPadding(view.getPaddingLeft(), this.f17926a.getPaddingTop(), this.f17926a.getPaddingRight(), this.b);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17927a;
            public final /* synthetic */ int b;

            public b(View view, int i) {
                this.f17927a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17927a.getLayoutParams();
                layoutParams.width = this.b;
                this.f17927a.setLayoutParams(layoutParams);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17928a;
            public final /* synthetic */ int b;

            public c(View view, int i) {
                this.f17928a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17928a.getLayoutParams();
                layoutParams.height = this.b;
                this.f17928a.setLayoutParams(layoutParams);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17929a;
            public final /* synthetic */ int b;

            public d(View view, int i) {
                this.f17929a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17929a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.b;
                    this.f17929a.setLayoutParams(layoutParams);
                    return;
                }
                gfh.b("set margin left failed");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17930a;
            public final /* synthetic */ int b;

            public e(View view, int i) {
                this.f17930a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17930a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.b;
                    this.f17930a.setLayoutParams(layoutParams);
                    return;
                }
                gfh.b("set margin right failed");
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.dmj$f$f  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0907f implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17931a;
            public final /* synthetic */ int b;

            public RunnableC0907f(View view, int i) {
                this.f17931a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17931a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.b;
                    this.f17931a.setLayoutParams(layoutParams);
                    return;
                }
                gfh.b("set margin top failed");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class g implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17932a;
            public final /* synthetic */ int b;

            public g(View view, int i) {
                this.f17932a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.f17932a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.b;
                    this.f17932a.setLayoutParams(layoutParams);
                    return;
                }
                gfh.b("set margin bottom failed");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class h implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17933a;
            public final /* synthetic */ int b;

            public h(View view, int i) {
                this.f17933a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = this.f17933a;
                view.setPadding(this.b, view.getPaddingTop(), this.f17933a.getPaddingRight(), this.f17933a.getPaddingBottom());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class i implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17934a;
            public final /* synthetic */ int b;

            public i(View view, int i) {
                this.f17934a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = this.f17934a;
                view.setPadding(view.getPaddingLeft(), this.f17934a.getPaddingTop(), this.b, this.f17934a.getPaddingBottom());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class j implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17935a;
            public final /* synthetic */ int b;

            public j(View view, int i) {
                this.f17935a = view;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View view = this.f17935a;
                view.setPadding(view.getPaddingLeft(), this.b, this.f17935a.getPaddingRight(), this.f17935a.getPaddingBottom());
            }
        }

        public f() {
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a53493", new Object[]{this, str});
            } else {
                this.f17925a = str;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
            if (r12.equals(tb.pg1.ATOM_EXT_UDL_padding_bottom) == false) goto L_0x0047;
         */
        @Override // tb.lyc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.view.View r10, java.lang.String r11, java.lang.Object r12, com.alibaba.android.bindingx.core.a.c r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.dmj.f.a(android.view.View, java.lang.String, java.lang.Object, com.alibaba.android.bindingx.core.a$c, java.util.Map):void");
        }
    }
}
