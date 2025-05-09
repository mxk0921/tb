package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXWidgetRefreshOption {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONS_EVENT_ARGS_HEIGHT = "height";
    public static final String CONS_EVENT_ARGS_WIDTH = "width";
    public static final int DX_REFRESH_CHILDREN_STRATEGY_AUTO_REFRESH = 3;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_REBUILD_CONTAINER = 2;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_WITHOUT_CONTAINER = 0;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_WITH_CONTAINER = 1;
    public boolean c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7414a = false;
    public int b = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = false;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXRefreshChildrenStrategy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7415a = false;
        public int b = 0;
        public boolean c = false;
        public int d = 0;
        public int e = 0;
        public boolean f = false;

        static {
            t2o.a(444597449);
        }

        public DXWidgetRefreshOption a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetRefreshOption) ipChange.ipc$dispatch("f466bcd0", new Object[]{this});
            }
            DXWidgetRefreshOption dXWidgetRefreshOption = new DXWidgetRefreshOption();
            DXWidgetRefreshOption.a(dXWidgetRefreshOption, this.f7415a);
            DXWidgetRefreshOption.b(dXWidgetRefreshOption, this.b);
            DXWidgetRefreshOption.c(dXWidgetRefreshOption, this.c);
            DXWidgetRefreshOption.d(dXWidgetRefreshOption, this.d);
            DXWidgetRefreshOption.e(dXWidgetRefreshOption, this.e);
            DXWidgetRefreshOption.f(dXWidgetRefreshOption, this.f);
            return dXWidgetRefreshOption;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e9b8215", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ecd5c357", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("77dc905d", new Object[]{this, new Boolean(z)});
            }
            this.f7415a = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bd9ccdb6", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b592271", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3fb6be92", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }
    }

    static {
        t2o.a(444597447);
    }

    public static /* synthetic */ boolean a(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57853890", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.f7414a = z;
        return z;
    }

    public static /* synthetic */ int b(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1b480cd", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.b = i;
        return i;
    }

    public static /* synthetic */ boolean c(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2be448ce", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.c = z;
        return z;
    }

    public static /* synthetic */ int d(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9613910b", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.d = i;
        return i;
    }

    public static /* synthetic */ int e(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43192a", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.e = i;
        return i;
    }

    public static /* synthetic */ boolean f(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a72e12b", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.f = z;
        return z;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22eb349d", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1648cab", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c9e8376", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7682b885", new Object[]{this})).booleanValue();
        }
        return this.f7414a;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8bf43f8", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d394f25", new Object[]{this})).booleanValue();
        }
        return this.f;
    }
}
