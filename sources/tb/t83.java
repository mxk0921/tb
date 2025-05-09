package tb;

import android.graphics.RectF;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class t83 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIM_BIG_CARD = 1;
    public static final int ANIM_SMALL_CARD = 0;
    public static final a Companion = new a(null);
    public static final int OPTION_ADD = 0;
    public static final int OPTION_HIDE = 2;
    public static final int OPTION_REFRESH = 4;
    public static final int OPTION_REMOVE = 1;
    public static final int OPTION_SHOW = 3;

    /* renamed from: a  reason: collision with root package name */
    public final String f28562a;
    public int b = -1;
    public l83 c;
    public y73 d;
    public JSONObject e;
    public int f;
    public RectF g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297563);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297562);
    }

    public t83(String str) {
        ckf.g(str, "cardRectFKey");
        this.f28562a = str;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b89be6c0", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final y73 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y73) ipChange.ipc$dispatch("53c890ed", new Object[]{this});
        }
        return this.d;
    }

    public final l83 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l83) ipChange.ipc$dispatch("2a5e5790", new Object[]{this});
        }
        return this.c;
    }

    public final RectF d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("5e2f5c84", new Object[]{this});
        }
        if (this.g == null) {
            this.g = trl.e(this.f28562a, 1, 1);
        }
        return this.g;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2d0d516", new Object[]{this});
        }
        return this.f28562a;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42195b3f", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("30b5a016", new Object[]{this});
        }
        return this.e;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53494e2", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void i(y73 y73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af788bbd", new Object[]{this, y73Var});
        } else {
            this.d = y73Var;
        }
    }

    public final void j(l83 l83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c36940", new Object[]{this, l83Var});
        } else {
            this.c = l83Var;
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e91aab", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9b49c6", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }
}
