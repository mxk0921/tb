package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.industry.tbiunicontainer.core.component.DXLoadStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ua6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DXLoadStrategy f29257a;
    public JSONObject b;
    public Integer c;
    public Integer d;
    public final Context e;
    public final DinamicXEngine f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ua6 f29258a;

        static {
            t2o.a(804257828);
        }

        public a(Context context, DinamicXEngine dinamicXEngine) {
            ckf.g(context, "context");
            ckf.g(dinamicXEngine, gbv.PARAM_KEY_DX_ENGINE);
            this.f29258a = new ua6(context, dinamicXEngine, null);
        }

        public final ua6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ua6) ipChange.ipc$dispatch("c4f5be99", new Object[]{this});
            }
            return this.f29258a;
        }

        public final a b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("949a75b6", new Object[]{this, jSONObject});
            }
            this.f29258a.g(jSONObject);
            return this;
        }

        public final a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a828baf9", new Object[]{this, new Integer(i)});
            }
            this.f29258a.h(Integer.valueOf(i));
            return this;
        }

        public final a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("50a0dd94", new Object[]{this, new Integer(i)});
            }
            this.f29258a.i(Integer.valueOf(i));
            return this;
        }
    }

    static {
        t2o.a(804257827);
    }

    public ua6(Context context, DinamicXEngine dinamicXEngine) {
        this.e = context;
        this.f = dinamicXEngine;
        this.f29257a = DXLoadStrategy.DOUBLE_RENDER;
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.e;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8f062fb", new Object[]{this});
        }
        return this.b;
    }

    public final DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.f;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2bd104ca", new Object[]{this});
        }
        return this.d;
    }

    public final DXLoadStrategy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLoadStrategy) ipChange.ipc$dispatch("6da029a9", new Object[]{this});
        }
        return this.f29257a;
    }

    public final Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("22bef37", new Object[]{this});
        }
        return this.c;
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ce21e9", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public final void h(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca1a40", new Object[]{this, num});
        } else {
            this.d = num;
        }
    }

    public final void i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279c9db", new Object[]{this, num});
        } else {
            this.c = num;
        }
    }

    public /* synthetic */ ua6(Context context, DinamicXEngine dinamicXEngine, a07 a07Var) {
        this(context, dinamicXEngine);
    }
}
