package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.bb2;
import tb.ly0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mb2 extends AbstractEventHandler implements ly0.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ly0 o;
    public long n = 0;
    public boolean p = false;

    static {
        t2o.a(87031853);
        t2o.a(87031842);
    }

    public mb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
        ly0 ly0Var = this.o;
        if (ly0Var == null) {
            this.o = ly0.b();
        } else {
            ly0Var.a();
        }
    }

    public static /* synthetic */ Object ipc$super(mb2 mb2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -189097425) {
            super.p((String) objArr[0], (Map) objArr[1], (fr8) objArr[2], (List) objArr[3], (bb2.g) objArr[4]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/core/internal/BindingXTimingHandler");
        }
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        A("end", System.currentTimeMillis() - this.n, new Object[0]);
        r();
        ly0 ly0Var = this.o;
        if (ly0Var != null) {
            ly0Var.a();
        }
        this.n = 0L;
        return true;
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        return true;
    }

    @Override // tb.ly0.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0baf29", new Object[]{this});
        } else {
            B();
        }
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        r();
        ly0 ly0Var = this.o;
        if (ly0Var != null) {
            ly0Var.d();
            this.o = null;
        }
        this.n = 0L;
    }

    public final void A(String str, long j, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795b8654", new Object[]{this, str, new Long(j), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("t", Long.valueOf(j));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + j + f7l.BRACKET_END_STR);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
            return;
        }
        super.p(str, map, fr8Var, list, gVar);
        if (this.o == null) {
            this.o = ly0.b();
        }
        A("start", 0L, new Object[0]);
        this.o.a();
        this.o.c(this);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
            return;
        }
        A("exit", (long) ((Double) map.get("t")).doubleValue(), new Object[0]);
        ly0 ly0Var = this.o;
        if (ly0Var != null) {
            ly0Var.a();
        }
        this.n = 0L;
        if (this.i != null && !TextUtils.isEmpty(this.g)) {
            ((bb2) this.i).a(this.g);
            this.i = null;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b240ffe", new Object[]{this});
            return;
        }
        long j = 0;
        if (this.n == 0) {
            this.n = AnimationUtils.currentAnimationTimeMillis();
            this.p = false;
        } else {
            j = AnimationUtils.currentAnimationTimeMillis() - this.n;
        }
        try {
            if (gfh.f19951a) {
                gfh.a(String.format(Locale.getDefault(), "[TimingHandler] timing elapsed. (t:%d)", Long.valueOf(j)));
            }
            JSMath.applyTimingValuesToScope(this.d, j);
            if (!this.p) {
                s(this.f2170a, this.d, "timing");
            }
            this.p = t(this.j, this.d);
        } catch (Exception e) {
            gfh.c("runtime error", e);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            A("interceptor", (long) ((Double) map.get("t")).doubleValue(), Collections.singletonMap("interceptor", str));
        }
    }
}
