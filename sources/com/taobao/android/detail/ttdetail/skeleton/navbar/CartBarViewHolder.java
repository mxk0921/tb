package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.ee7;
import tb.jos;
import tb.mr7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CartBarViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CART_COUNT_CHANGE = "OpenCartItemCountChange";
    public static final String CART_BAR_MAXIMUM = "99+";
    public static final String UT_KEY_CART_BADGE = "CartBadge";
    public static final String UT_KEY_COUNT = "count";
    public static final String UT_KEY_TEXT = "text";
    public static final String UT_VALUE_CART_BADGE = "allitemcount";
    public static int d;
    public static int e;
    public static boolean f = false;
    public static int g = 0;

    /* renamed from: a  reason: collision with root package name */
    public CartBarBroadcast f6914a;
    public final Context b;
    public jos.e.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class CartBarBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TextView> f6915a;
        public final jos.e.a b;

        static {
            t2o.a(912262575);
        }

        public CartBarBroadcast(TextView textView, jos.e.a aVar) {
            this.f6915a = new WeakReference<>(textView);
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(CartBarBroadcast cartBarBroadcast, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/CartBarViewHolder$CartBarBroadcast");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                try {
                    TextView textView = this.f6915a.get();
                    if (textView != null) {
                        int intExtra = intent.getIntExtra("itemCount", 0);
                        CartBarViewHolder.b(intExtra);
                        if (intExtra <= 0) {
                            i2 = 8;
                        }
                        textView.setVisibility(i2);
                        textView.setText(CartBarViewHolder.c(intExtra));
                        if (CartBarViewHolder.d()) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                            if (CartBarViewHolder.e(intExtra)) {
                                i = CartBarViewHolder.f();
                            } else {
                                i = CartBarViewHolder.g();
                            }
                            layoutParams.leftMargin = i;
                            textView.setLayoutParams(layoutParams);
                            CartBarViewHolder.h(intExtra);
                        } else {
                            CartBarViewHolder.i(intExtra);
                        }
                        jos.e.a aVar = this.b;
                        if (aVar != null) {
                            aVar.f = intExtra;
                        }
                    }
                } catch (Exception e) {
                    tgh.b("CartBarViewHolder", "onReceive error=" + e.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewParent f6916a;
        public final /* synthetic */ TaoDetailActionBarV3 b;

        public a(ViewParent viewParent, TaoDetailActionBarV3 taoDetailActionBarV3) {
            this.f6916a = viewParent;
            this.b = taoDetailActionBarV3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f6916a;
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            TextView p = CartBarViewHolder.this.p(iArr[0], iArr[1], frameLayout.getWidth());
            if (p != null) {
                this.b.getMiniAppContainer().addView(p);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/CartBarViewHolder$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), mr7.b(CartBarViewHolder.a(CartBarViewHolder.this), 9.0f));
            }
        }
    }

    static {
        t2o.a(912262572);
    }

    public CartBarViewHolder(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Context a(CartBarViewHolder cartBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6aaa98ca", new Object[]{cartBarViewHolder});
        }
        return cartBarViewHolder.b;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4936387c", new Object[]{new Integer(i)})).intValue();
        }
        g = i;
        return i;
    }

    public static /* synthetic */ String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de19d9b6", new Object[]{new Integer(i)});
        }
        return o(i);
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return f;
    }

    public static /* synthetic */ boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d700dec", new Object[]{new Integer(i)})).booleanValue();
        }
        return r(i);
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552faf", new Object[0])).intValue();
        }
        return d;
    }

    public static /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa3b6af0", new Object[0])).intValue();
        }
        return e;
    }

    public static /* synthetic */ void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5139485", new Object[]{new Integer(i)});
        } else {
            l(i);
        }
    }

    public static /* synthetic */ void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf4c164", new Object[]{new Integer(i)});
        } else {
            m(i);
        }
    }

    public static void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88472388", new Object[]{new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", String.valueOf(i));
        hashMap.put(UT_KEY_CART_BADGE, UT_VALUE_CART_BADGE);
        hashMap.put("text", o(i));
    }

    public static void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9904c8", new Object[]{new Integer(i)});
        } else {
            new HashMap().put("count", String.valueOf(i));
        }
    }

    public static String o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("940f60ae", new Object[]{new Integer(i)});
        }
        if (i > 99) {
            return "99+";
        }
        return String.valueOf(i);
    }

    public static boolean r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb829d6", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i <= 9) {
            return true;
        }
        return false;
    }

    public boolean j(View view, ee7 ee7Var, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a00f88", new Object[]{this, view, ee7Var, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!(ee7Var instanceof TaoDetailActionBarV3)) {
            return false;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = (TaoDetailActionBarV3) ee7Var;
        taoDetailActionBarV3.addItemView(view, i);
        ViewParent parent = view.getParent();
        if (!(parent instanceof FrameLayout)) {
            return false;
        }
        ((FrameLayout) parent).post(new a(parent, taoDetailActionBarV3));
        return true;
    }

    public boolean k(View view, ee7 ee7Var, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1be0b0b1", new Object[]{this, view, ee7Var, new Boolean(z), new Integer(i)})).booleanValue();
        }
        try {
            return j(view, ee7Var, z, i);
        } catch (Exception e2) {
            tgh.b("CartBarViewHolder", "error msg=" + e2.getMessage());
            return false;
        }
    }

    public final TextView n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a5aad74a", new Object[]{this, new Integer(i)});
        }
        TextView textView = new TextView(this.b);
        textView.setBackgroundColor(Color.parseColor("#ff5000"));
        textView.setTextColor(-1);
        textView.setTextSize(0, mr7.b(this.b, 10.0f));
        textView.setText(o(i));
        if (f) {
            l(i);
        } else {
            m(i);
        }
        textView.setGravity(17);
        if (i == 0) {
            textView.setVisibility(8);
        }
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new b());
        return textView;
    }

    public TextView p(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1d00bc12", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        f = true;
        jos.e.a aVar = this.c;
        if (aVar == null || !aVar.e) {
            return null;
        }
        int i7 = aVar.f;
        g = i7;
        if (r(i7)) {
            i4 = mr7.b(this.b, 18.0f);
        } else {
            i4 = mr7.b(this.b, 24.0f);
        }
        if (r(i7)) {
            i5 = mr7.b(this.b, 18.0f);
        } else {
            i5 = mr7.b(this.b, 17.0f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        float f2 = i;
        float f3 = i3;
        d = (int) ((0.5f * f3) + f2);
        e = (int) (f2 + (f3 * 0.4f));
        if (r(i7)) {
            i6 = d;
        } else {
            i6 = e;
        }
        layoutParams.leftMargin = i6;
        layoutParams.topMargin = i2;
        TextView n = n(i7);
        n.setLayoutParams(layoutParams);
        t(n, this.c);
        return n;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return g;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.f6914a != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f6914a);
        }
    }

    public final void t(TextView textView, jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656a059e", new Object[]{this, textView, aVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_CART_COUNT_CHANGE);
        if (this.f6914a != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f6914a);
        }
        this.f6914a = new CartBarBroadcast(textView, aVar);
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.f6914a, intentFilter);
    }

    public void u(jos.e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7b6815", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }
}
