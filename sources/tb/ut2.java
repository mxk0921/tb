package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LruCache;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserViewPager;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TIconFontTextView;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.RoundedCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import tb.mx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ut2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pools.SynchronizedPool<YogaNode> f29596a = new Pools.SynchronizedPool<>(256);
    public static final Pools.SimplePool<xkt> b = new Pools.SynchronizedPool(64);
    public static final Pools.SimplePool<mx7.a> c = new Pools.SynchronizedPool(64);
    public static final Pools.SimplePool<rgo> d = new Pools.SynchronizedPool(16);
    public static final HashMap<Context, Pools.SimplePool<TNodeImageView>> e = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<ObservableHorizontalScrollView>> f = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<TextView>> g = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<StaticLayoutView>> h = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<TIconFontTextView>> i = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<FlatViewGroup>> j = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<RoundedCornerLayout>> k = new HashMap<>();
    public static final HashMap<Context, Pools.SimplePool<BrowserViewPager>> l = new HashMap<>();
    public static final LruCache<String, Bitmap> m = new LruCache<>(5);
    public static final LruCache<String, SoftReference<Drawable>> n = new LruCache<>(5);
    public static final HashMap<String, Component.k> o = new HashMap<>();
    public static final LruCache<String, String> p = new LruCache<>(20);

    static {
        t2o.a(503317404);
        new Pools.SynchronizedPool(16);
    }

    public static void A(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98682249", new Object[]{staticLayoutView});
        } else if (staticLayoutView != null) {
            s(staticLayoutView);
            staticLayoutView.clear();
            Context context = staticLayoutView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<StaticLayoutView>> hashMap = h;
                Pools.SimplePool<StaticLayoutView> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(64);
                    hashMap.put(staticLayoutView.getContext(), simplePool);
                }
                simplePool.release(staticLayoutView);
            }
        }
    }

    public static void B(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df79dfa4", new Object[]{textView});
        } else if (textView != null) {
            s(textView);
            Context context = textView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<TextView>> hashMap = g;
                Pools.SimplePool<TextView> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(64);
                    hashMap.put(textView.getContext(), simplePool);
                }
                simplePool.release(textView);
            }
        }
    }

    public static void C(BrowserViewPager browserViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3274832", new Object[]{browserViewPager});
        } else if (browserViewPager != null) {
            s(browserViewPager);
            Context context = browserViewPager.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<BrowserViewPager>> hashMap = l;
                Pools.SimplePool<BrowserViewPager> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(3);
                    hashMap.put(browserViewPager.getContext(), simplePool);
                }
                simplePool.release(browserViewPager);
            }
        }
    }

    public static void D(YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185935f9", new Object[]{yogaNode});
        } else if (yogaNode != null) {
            if (yogaNode.getParent() != null) {
                yogaNode.getParent().removeChildAt(yogaNode.getParent().indexOf(yogaNode));
            }
            for (int childCount = yogaNode.getChildCount() - 1; childCount >= 0; childCount--) {
                yogaNode.removeChildAt(childCount);
            }
            yogaNode.reset();
            try {
                f29596a.release(yogaNode);
            } catch (Throwable unused) {
            }
        }
    }

    public static void E(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec30fd53", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            LruCache<String, String> lruCache = p;
            lruCache.put(str + str2, str3);
        }
    }

    public static rgo a(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgo) ipChange.ipc$dispatch("f80ac3f6", new Object[]{resources});
        }
        rgo acquire = d.acquire();
        if (acquire == null) {
            acquire = new rgo(resources);
        }
        acquire.p(false);
        return acquire;
    }

    public static ColorDrawable b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("2b8a784e", new Object[]{new Integer(i2)});
        }
        mx7.a acquire = c.acquire();
        if (acquire == null) {
            acquire = new mx7.a();
        }
        acquire.setColor(i2);
        return acquire;
    }

    public static FlatViewGroup c(Context context) {
        FlatViewGroup flatViewGroup;
        Pools.SimplePool<FlatViewGroup> simplePool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("7a6568a7", new Object[]{context});
        }
        if (!akt.q() || (simplePool = j.get(context)) == null) {
            flatViewGroup = null;
        } else {
            flatViewGroup = simplePool.acquire();
        }
        if (flatViewGroup == null) {
            return new FlatViewGroup(context);
        }
        return flatViewGroup;
    }

    public static RoundedCornerLayout d(Context context) {
        RoundedCornerLayout roundedCornerLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedCornerLayout) ipChange.ipc$dispatch("848e3ea6", new Object[]{context});
        }
        Pools.SimplePool<RoundedCornerLayout> simplePool = k.get(context);
        if (simplePool != null) {
            roundedCornerLayout = simplePool.acquire();
        } else {
            roundedCornerLayout = null;
        }
        if (roundedCornerLayout == null) {
            return new RoundedCornerLayout(context);
        }
        return roundedCornerLayout;
    }

    public static GradientDrawable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("944d0f1f", new Object[0]);
        }
        return new mx7.b();
    }

    public static TNodeImageView f(Context context) {
        TNodeImageView tNodeImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("3689bc3", new Object[]{context});
        }
        Pools.SimplePool<TNodeImageView> simplePool = e.get(context);
        if (simplePool != null) {
            tNodeImageView = simplePool.acquire();
        } else {
            tNodeImageView = null;
        }
        if (tNodeImageView == null) {
            tNodeImageView = new TNodeImageView(context);
        }
        tNodeImageView.setInCachePool(false);
        return tNodeImageView;
    }

    public static Bitmap g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2d177533", new Object[]{str});
        }
        return m.get(str);
    }

    public static ObservableHorizontalScrollView h(Context context) {
        ObservableHorizontalScrollView observableHorizontalScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObservableHorizontalScrollView) ipChange.ipc$dispatch("d924b7b2", new Object[]{context});
        }
        Pools.SimplePool<ObservableHorizontalScrollView> simplePool = f.get(context);
        if (simplePool != null) {
            observableHorizontalScrollView = simplePool.acquire();
        } else {
            observableHorizontalScrollView = null;
        }
        if (observableHorizontalScrollView == null) {
            return new ObservableHorizontalScrollView(context);
        }
        return observableHorizontalScrollView;
    }

    public static Drawable i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("5f058e1e", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        if (z) {
            SoftReference<Drawable> remove = n.remove(str);
            if (remove != null) {
                return remove.get();
            }
        } else {
            SoftReference<Drawable> softReference = n.get(str);
            if (softReference != null) {
                return softReference.get();
            }
        }
        return null;
    }

    public static Component.k j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component.k) ipChange.ipc$dispatch("73545788", new Object[]{str});
        }
        return o.remove(str);
    }

    public static StaticLayoutView k(Context context) {
        StaticLayoutView staticLayoutView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayoutView) ipChange.ipc$dispatch("586fcca6", new Object[]{context});
        }
        Pools.SimplePool<StaticLayoutView> simplePool = h.get(context);
        if (simplePool != null) {
            staticLayoutView = simplePool.acquire();
        } else {
            staticLayoutView = null;
        }
        if (staticLayoutView == null) {
            return new StaticLayoutView(context);
        }
        return staticLayoutView;
    }

    public static xkt l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkt) ipChange.ipc$dispatch("645761ca", new Object[0]);
        }
        xkt acquire = b.acquire();
        if (acquire == null) {
            return new xkt();
        }
        return acquire;
    }

    public static BrowserViewPager m(Context context) {
        BrowserViewPager browserViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserViewPager) ipChange.ipc$dispatch("601a0fb9", new Object[]{context});
        }
        Pools.SimplePool<BrowserViewPager> simplePool = l.get(context);
        if (simplePool != null) {
            browserViewPager = simplePool.acquire();
        } else {
            browserViewPager = null;
        }
        if (browserViewPager != null) {
            return browserViewPager;
        }
        BrowserViewPager browserViewPager2 = new BrowserViewPager(context);
        browserViewPager2.setId(nwv.A());
        return browserViewPager2;
    }

    public static YogaNode n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaNode) ipChange.ipc$dispatch("be5f09a0", new Object[0]);
        }
        YogaNode acquire = f29596a.acquire();
        if (acquire != null) {
            return acquire;
        }
        try {
            return YogaNode.create();
        } catch (UnsatisfiedLinkError e2) {
            tfs.d("acquireYogaNode " + e2.getMessage());
            return acquire;
        }
    }

    public static void o(String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d91e25", new Object[]{str, bitmap});
        } else {
            m.put(str, bitmap);
        }
    }

    public static void p(String str, View view, Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770117ea", new Object[]{str, view, drawable});
        } else if (str != null) {
            if ((view instanceof ImageView) && ((ImageView) view).getScaleType() == ImageView.ScaleType.CENTER_CROP && (drawable instanceof BitmapDrawable)) {
                int width = view.getWidth();
                int height = view.getHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                float f2 = (width * 1.0f) / height;
                float f3 = intrinsicWidth;
                float f4 = intrinsicHeight;
                float f5 = (1.0f * f3) / f4;
                if (width >= s6o.B(view.getContext()) / 2) {
                    try {
                        if (f2 > f5) {
                            int i2 = (int) ((f4 - (f3 / f2)) / 2.0f);
                            bitmapDrawable = new BitmapDrawable(view.getResources(), Bitmap.createBitmap(bitmap, 0, i2, intrinsicWidth, intrinsicHeight - (i2 * 2)));
                        } else if (f2 < f5) {
                            int i3 = (int) ((f3 - (f4 * f2)) / 2.0f);
                            bitmapDrawable = new BitmapDrawable(view.getResources(), Bitmap.createBitmap(bitmap, i3, 0, intrinsicWidth - (i3 * 2), intrinsicHeight));
                        }
                        drawable = bitmapDrawable;
                    } catch (Throwable unused) {
                    }
                }
            }
            n.put(str, new SoftReference<>(drawable));
        }
    }

    public static void q(String str, Component.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd4ab94", new Object[]{str, kVar});
        } else {
            o.put(str, kVar);
        }
    }

    public static void r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b5778", new Object[]{context});
            return;
        }
        HashMap<Context, Pools.SimplePool<TNodeImageView>> hashMap = e;
        hashMap.remove(context);
        HashMap<Context, Pools.SimplePool<TextView>> hashMap2 = g;
        hashMap2.remove(context);
        HashMap<Context, Pools.SimplePool<StaticLayoutView>> hashMap3 = h;
        hashMap3.remove(context);
        HashMap<Context, Pools.SimplePool<TIconFontTextView>> hashMap4 = i;
        hashMap4.remove(context);
        HashMap<Context, Pools.SimplePool<FlatViewGroup>> hashMap5 = j;
        hashMap5.remove(context);
        HashMap<Context, Pools.SimplePool<RoundedCornerLayout>> hashMap6 = k;
        hashMap6.remove(context);
        HashMap<Context, Pools.SimplePool<ObservableHorizontalScrollView>> hashMap7 = f;
        hashMap7.remove(context);
        HashMap<Context, Pools.SimplePool<BrowserViewPager>> hashMap8 = l;
        hashMap8.remove(context);
        hashMap.remove(o.O);
        hashMap2.remove(o.O);
        hashMap3.remove(o.O);
        hashMap4.remove(o.O);
        hashMap5.remove(o.O);
        hashMap6.remove(o.O);
        hashMap7.remove(o.O);
        hashMap8.remove(o.O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r4 = r6.getForeground();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(android.view.View r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ut2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "ce90619"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            android.graphics.drawable.Drawable r2 = r6.getBackground()
            r3 = 0
            if (r2 == 0) goto L_0x001f
            v(r2)
            r6.setBackgroundDrawable(r3)
        L_0x001f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 >= r4) goto L_0x0029
            boolean r5 = r6 instanceof com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView
            if (r5 == 0) goto L_0x004b
        L_0x0029:
            boolean r5 = r6 instanceof com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView
            if (r5 == 0) goto L_0x003d
            r4 = r6
            com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView r4 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView) r4
            android.graphics.drawable.Drawable r5 = r4.getForeground()
            if (r5 == 0) goto L_0x004b
            v(r5)
            r4.setForeground(r3)
            goto L_0x004b
        L_0x003d:
            if (r2 < r4) goto L_0x004b
            android.graphics.drawable.Drawable r4 = tb.e6x.a(r6)
            if (r4 == 0) goto L_0x004b
            v(r4)
            tb.f6x.a(r6, r3)
        L_0x004b:
            boolean r4 = r6 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x0061
            r4 = r6
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.graphics.drawable.Drawable r5 = r4.getDrawable()
            v(r5)
            r4.setImageDrawable(r3)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r4.setScaleType(r5)
        L_0x0061:
            com.taobao.schedule.ViewProxy.setOnClickListener(r6, r3)
            r6.setClickable(r0)
            com.taobao.schedule.ViewProxy.setOnLongClickListener(r6, r3)
            r6.setLongClickable(r0)
            boolean r4 = r6 instanceof com.taobao.uikit.utils.IFeatureList
            if (r4 == 0) goto L_0x0077
            r4 = r6
            com.taobao.uikit.utils.IFeatureList r4 = (com.taobao.uikit.utils.IFeatureList) r4
            r4.clearFeatures()
        L_0x0077:
            r6.clearAnimation()
            r6.setTag(r3)
            int r4 = com.taobao.taobao.R.id.layout_manager_pending_animations
            r6.setTag(r4, r3)
            int r4 = com.taobao.taobao.R.id.layout_manager_transition_card_view
            r6.setTag(r4, r3)
            int r4 = com.taobao.taobao.R.id.layout_manager_tnode
            r6.setTag(r4, r3)
            int r4 = tb.dgw.APM_VIEW_TOKEN
            r6.setTag(r4, r3)
            android.view.ViewParent r4 = r6.getParent()
            if (r4 == 0) goto L_0x00a0
            android.view.ViewParent r4 = r6.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r6)
        L_0x00a0:
            com.taobao.schedule.ViewProxy.setOnTouchListener(r6, r3)
            r4 = 28
            r5 = 0
            if (r2 < r4) goto L_0x00ac
            tb.yy0.a(r6)
            goto L_0x00b2
        L_0x00ac:
            r6.setPivotX(r5)
            r6.setPivotY(r5)
        L_0x00b2:
            r6.setTranslationX(r5)
            r6.setTranslationY(r5)
            r6.setTranslationZ(r5)
            r6.setZ(r5)
            r6.setRotation(r5)
            r6.setRotationX(r5)
            r6.setRotationY(r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r2)
            r6.setScaleY(r2)
            r6.setAlpha(r2)
            r6.setTransitionName(r3)
            r6.setVisibility(r0)
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00e1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.setClipChildren(r1)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ut2.s(android.view.View):void");
    }

    public static String t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc870a3e", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        LruCache<String, String> lruCache = p;
        return lruCache.get(str + str2);
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d291a549", new Object[0]);
            return;
        }
        try {
            f29596a.release(YogaNode.create());
        } catch (Throwable th) {
            tfs.d(th.getMessage());
        }
    }

    public static void w(FlatViewGroup flatViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668f6360", new Object[]{flatViewGroup});
        } else if (flatViewGroup != null) {
            s(flatViewGroup);
            flatViewGroup.clear();
            Context context = flatViewGroup.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && akt.q()) {
                HashMap<Context, Pools.SimplePool<FlatViewGroup>> hashMap = j;
                Pools.SimplePool<FlatViewGroup> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(128);
                    hashMap.put(flatViewGroup.getContext(), simplePool);
                }
                simplePool.release(flatViewGroup);
            }
        }
    }

    public static void x(RoundedCornerLayout roundedCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6baafd5f", new Object[]{roundedCornerLayout});
        } else if (roundedCornerLayout != null) {
            s(roundedCornerLayout);
            roundedCornerLayout.clear();
            Context context = roundedCornerLayout.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<RoundedCornerLayout>> hashMap = k;
                Pools.SimplePool<RoundedCornerLayout> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(8);
                    hashMap.put(roundedCornerLayout.getContext(), simplePool);
                }
                simplePool.release(roundedCornerLayout);
            }
        }
    }

    public static void y(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da161ee4", new Object[]{tNodeImageView});
        } else if (tNodeImageView != null) {
            s(tNodeImageView);
            tNodeImageView.setElevation(0.0f);
            Context context = tNodeImageView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<TNodeImageView>> hashMap = e;
                Pools.SimplePool<TNodeImageView> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(32);
                    hashMap.put(tNodeImageView.getContext(), simplePool);
                }
                simplePool.release(tNodeImageView);
                tNodeImageView.setInCachePool(true);
            }
        }
    }

    public static void z(ObservableHorizontalScrollView observableHorizontalScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b9ff15", new Object[]{observableHorizontalScrollView});
        } else if (observableHorizontalScrollView != null) {
            if (akt.w()) {
                observableHorizontalScrollView.clear();
                observableHorizontalScrollView.scrollTo(0, 0);
            }
            s(observableHorizontalScrollView);
            Context context = observableHorizontalScrollView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<ObservableHorizontalScrollView>> hashMap = f;
                Pools.SimplePool<ObservableHorizontalScrollView> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(16);
                    hashMap.put(observableHorizontalScrollView.getContext(), simplePool);
                }
                simplePool.release(observableHorizontalScrollView);
            }
        }
    }

    public static void v(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea5cf0", new Object[]{drawable});
            return;
        }
        try {
            if (drawable instanceof mx7.a) {
                ((mx7.a) drawable).setColor(0);
                c.release((mx7.a) drawable);
            } else if (drawable instanceof xkt) {
                ((xkt) drawable).a();
                b.release((xkt) drawable);
            } else if (drawable instanceof dy0) {
                ((dy0) drawable).stop();
            } else if (!(drawable instanceof GradientDrawable) && (drawable instanceof rgo)) {
                ((rgo) drawable).g();
                ((rgo) drawable).p(true);
                d.release((rgo) drawable);
            }
        } catch (Throwable th) {
            tfs.d("releaseDrawable:" + th.getMessage());
        }
    }
}
