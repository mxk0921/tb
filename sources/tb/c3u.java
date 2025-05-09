package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.multitab.ITabStyleListener;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c3u implements ITabStyleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUTTON_COLOR = "#ff11192d";
    public static final String BUTTON_COLOR_LIGHT = "#ffffffff";
    public static final a Companion = new a(null);
    public static final String TAB_BAR_ITEM_COLOR = "#ff50607a";
    public static final String TAB_BAR_ITEM_COLOR_LIGHT = "#daffffff";
    public static final String TAB_BAR_ITEM_SCROLLED_COLOR = "#ff11192d";
    public static final String TAB_BAR_ITEM_SCROLLED_COLOR_LIGHT = "#ffffffff";

    /* renamed from: a  reason: collision with root package name */
    public final List<qr1<?, ?>> f16839a;
    public final ops b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455703);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455702);
        t2o.a(916455449);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c3u(List<? extends qr1<?, ?>> list, ops opsVar) {
        ckf.g(list, "buttonComponentList");
        ckf.g(opsVar, "tabBarComponent");
        this.f16839a = list;
        this.b = opsVar;
    }

    @Override // com.taobao.android.turbo.base.service.multitab.ITabStyleListener
    public void a(int i, float f, boolean z, boolean z2, ITabStyleListener.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a0ff61", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), triggerType});
            return;
        }
        ckf.g(triggerType, "triggerType");
        c(i, f, z, z2);
        e(i, f, z, z2);
        if (triggerType != ITabStyleListener.TriggerType.TAB_SCROLLED || f < 0.001d || z != z2) {
            d(i, f, z, z2);
            b(f, z, z2);
        }
    }

    public final void b(float f, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7627322e", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        String str2 = "#ff11192d";
        if (z) {
            str = "#ffffffff";
        } else {
            str = str2;
        }
        if (z2) {
            str2 = "#ffffffff";
        }
        int a2 = r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f);
        Iterator<T> it = this.f16839a.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).l(a2);
        }
    }

    public final void c(int i, float f, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbedae4", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            str = "#ffffffff";
        } else {
            str = "#ff11192d";
        }
        if (z2) {
            str2 = TAB_BAR_ITEM_COLOR_LIGHT;
        } else {
            str2 = TAB_BAR_ITEM_COLOR;
        }
        this.b.w(i, r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f));
    }

    public final void d(int i, float f, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8e260e", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        String str2 = TAB_BAR_ITEM_COLOR;
        if (z) {
            str = TAB_BAR_ITEM_COLOR_LIGHT;
        } else {
            str = str2;
        }
        if (z2) {
            str2 = TAB_BAR_ITEM_COLOR_LIGHT;
        }
        int a2 = r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f);
        int o = this.b.o();
        for (int i2 = 0; i2 < o; i2++) {
            if (!(i2 == i || i2 == i + 1)) {
                this.b.w(i2, a2);
            }
        }
    }

    public final void e(int i, float f, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45261ee1", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            str = TAB_BAR_ITEM_COLOR_LIGHT;
        } else {
            str = TAB_BAR_ITEM_COLOR;
        }
        if (z2) {
            str2 = "#ffffffff";
        } else {
            str2 = "#ff11192d";
        }
        this.b.w(i + 1, r14.INSTANCE.a(Color.parseColor(str), Color.parseColor(str2), f));
    }
}
