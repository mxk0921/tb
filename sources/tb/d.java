package tb;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17478a = false;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements AccessibilityManager.TouchExplorationStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17479a;

        public a(Context context) {
            this.f17479a = context;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c140c907", new Object[]{this, new Boolean(z)});
            } else {
                d.a(d.b(this.f17479a));
            }
        }
    }

    static {
        t2o.a(335544324);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18144814", new Object[]{context})).booleanValue();
        }
        return d(context);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd879e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (f17478a) {
            return b;
        }
        ((AccessibilityManager) applicationContext.getSystemService("accessibility")).addTouchExplorationStateChangeListener(new a(applicationContext));
        f17478a = true;
        boolean d = d(applicationContext);
        b = d;
        return d;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b0f6ea8", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            return false;
        }
        return true;
    }
}
