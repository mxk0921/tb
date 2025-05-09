package androidx.activity;

import android.content.res.Resources;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILtb/g1a;)V", "isDark", "getScrim$activity_release", "(Z)I", "getScrim", "getScrimWithEnforcedContrast$activity_release", "getScrimWithEnforcedContrast", TLogTracker.LEVEL_INFO, "getDarkScrim$activity_release", "()I", "getNightMode$activity_release", "Ltb/g1a;", "getDetectDarkMode$activity_release", "()Ltb/g1a;", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SystemBarStyle {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final g1a<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/SystemBarStyle;", "auto", "(IILtb/g1a;)Landroidx/activity/SystemBarStyle;", "scrim", ThemeUtils.COLOR_SCHEME_DARK, "(I)Landroidx/activity/SystemBarStyle;", "light", "(II)Landroidx/activity/SystemBarStyle;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, g1a g1aVar, int i3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SystemBarStyle) ipChange.ipc$dispatch("63dd9cd8", new Object[]{companion, new Integer(i), new Integer(i2), g1aVar, new Integer(i3), obj});
            }
            if ((i3 & 4) != 0) {
                g1aVar = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, g1aVar);
        }

        @JvmStatic
        public final SystemBarStyle auto(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SystemBarStyle) ipChange.ipc$dispatch("5919f968", new Object[]{this, new Integer(i), new Integer(i2)}) : auto$default(this, i, i2, null, 4, null);
        }

        @JvmStatic
        public final SystemBarStyle dark(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SystemBarStyle) ipChange.ipc$dispatch("37956f58", new Object[]{this, new Integer(i)});
            }
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        @JvmStatic
        public final SystemBarStyle light(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SystemBarStyle) ipChange.ipc$dispatch("736cac21", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final SystemBarStyle auto(int i, int i2, g1a<? super Resources, Boolean> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SystemBarStyle) ipChange.ipc$dispatch("31c45462", new Object[]{this, new Integer(i), new Integer(i2), g1aVar});
            }
            ckf.g(g1aVar, "detectDarkMode");
            return new SystemBarStyle(i, i2, 0, g1aVar, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, g1a g1aVar, a07 a07Var) {
        this(i, i2, i3, g1aVar);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SystemBarStyle) ipChange.ipc$dispatch("5919f968", new Object[]{new Integer(i), new Integer(i2)}) : Companion.auto(i, i2);
    }

    @JvmStatic
    public static final SystemBarStyle dark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarStyle) ipChange.ipc$dispatch("37956f58", new Object[]{new Integer(i)});
        }
        return Companion.dark(i);
    }

    @JvmStatic
    public static final SystemBarStyle light(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarStyle) ipChange.ipc$dispatch("736cac21", new Object[]{new Integer(i), new Integer(i2)});
        }
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e41bdfb", new Object[]{this})).intValue();
        }
        return this.darkScrim;
    }

    public final g1a<Resources, Boolean> getDetectDarkMode$activity_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("4216960c", new Object[]{this});
        }
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2043abf0", new Object[]{this})).intValue();
        }
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ab62c15", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbcc077f", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.nightMode == 0) {
            return 0;
        }
        if (z) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i, int i2, int i3, g1a<? super Resources, Boolean> g1aVar) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = g1aVar;
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2, g1a<? super Resources, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SystemBarStyle) ipChange.ipc$dispatch("31c45462", new Object[]{new Integer(i), new Integer(i2), g1aVar}) : Companion.auto(i, i2, g1aVar);
    }
}
