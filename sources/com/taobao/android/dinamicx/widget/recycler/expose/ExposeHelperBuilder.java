package com.taobao.android.dinamicx.widget.recycler.expose;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c4c;
import tb.d4c;
import tb.e4c;
import tb.f4c;
import tb.g4c;
import tb.gp8;
import tb.hjd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExposeHelperBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f7477a;
    public d4c b;
    public e4c c;
    public final c4c d;
    public hjd e;
    public g4c f;
    public f4c g;
    public long h = 500;
    public boolean i = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum REPEAT_MODE {
        NONE,
        CELL_REPEAT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(REPEAT_MODE repeat_mode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/expose/ExposeHelperBuilder$REPEAT_MODE");
        }

        public static REPEAT_MODE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (REPEAT_MODE) ipChange.ipc$dispatch("95788fd3", new Object[]{str});
            }
            return (REPEAT_MODE) Enum.valueOf(REPEAT_MODE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements g4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7478a;

        public a(ExposeHelperBuilder exposeHelperBuilder, float f) {
            this.f7478a = f;
        }

        @Override // tb.g4c
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bbb59a6a", new Object[]{this})).floatValue();
            }
            return this.f7478a;
        }
    }

    static {
        t2o.a(444597548);
    }

    public ExposeHelperBuilder(RecyclerView recyclerView, c4c c4cVar) {
        IpChange ipChange = REPEAT_MODE.$ipChange;
        this.f7477a = recyclerView;
        this.d = c4cVar;
    }

    public gp8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gp8) ipChange.ipc$dispatch("b5bad641", new Object[]{this});
        }
        return new gp8(this.f7477a, this);
    }

    public ExposeHelperBuilder b(d4c d4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("c9231cf7", new Object[]{this, d4cVar});
        }
        this.b = d4cVar;
        return this;
    }

    public ExposeHelperBuilder c(f4c f4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("75cd055", new Object[]{this, f4cVar});
        }
        this.g = f4cVar;
        return this;
    }

    public ExposeHelperBuilder d(e4c e4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("8a7eadaf", new Object[]{this, e4cVar});
        }
        this.c = e4cVar;
        return this;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e36535c8", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public d4c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4c) ipChange.ipc$dispatch("30c741e9", new Object[]{this});
        }
        return this.b;
    }

    public c4c g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4c) ipChange.ipc$dispatch("b314c6cd", new Object[]{this});
        }
        return this.d;
    }

    public e4c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e4c) ipChange.ipc$dispatch("9c6a61a9", new Object[]{this});
        }
        return this.c;
    }

    public hjd i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjd) ipChange.ipc$dispatch("f006cf2d", new Object[]{this});
        }
        return this.e;
    }

    public f4c j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4c) ipChange.ipc$dispatch("7b7cf89", new Object[]{this});
        }
        return this.g;
    }

    public g4c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4c) ipChange.ipc$dispatch("de4b91b0", new Object[]{this});
        }
        return this.f;
    }

    public ExposeHelperBuilder l(REPEAT_MODE repeat_mode, hjd hjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("79cbc214", new Object[]{this, repeat_mode, hjdVar});
        }
        if (repeat_mode != REPEAT_MODE.NONE) {
            this.e = hjdVar;
        }
        return this;
    }

    public ExposeHelperBuilder m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("8e3c492b", new Object[]{this, new Float(f)});
        }
        this.f = new a(this, f);
        return this;
    }

    public ExposeHelperBuilder n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("f73593ae", new Object[]{this, new Long(j)});
        }
        this.h = j;
        return this;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d449b9bc", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public ExposeHelperBuilder p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("c7619e09", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }
}
