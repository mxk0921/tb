package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.igo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gb2 extends AbstractEventHandler implements View.OnTouchListener, igo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final igo n = new igo(this);
    public double o;

    static {
        t2o.a(87031851);
        t2o.a(87031893);
    }

    public gb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(gb2 gb2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/BindingXRotationHandler");
    }

    public void D(igo igoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3afeb80", new Object[]{this, igoVar});
            return;
        }
        gfh.a("[RotationHandler] rotation gesture end");
        A("end", this.o, new Object[0]);
        this.o = vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
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

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        return this.n.d(motionEvent);
    }

    public final void A(String str, double d, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5239269a", new Object[]{this, str, new Double(d), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put(Key.ROTATION, Double.valueOf(d));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + d + f7l.BRACKET_END_STR);
        }
    }

    public void C(igo igoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9d788e", new Object[]{this, igoVar});
            return;
        }
        gfh.a("[RotationHandler] rotation gesture begin");
        A("start", vu3.b.GEO_NOT_SUPPORT, new Object[0]);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
        } else {
            A("exit", ((Double) map.get("r")).doubleValue(), new Object[0]);
        }
    }

    public void B(igo igoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09365df", new Object[]{this, igoVar});
            return;
        }
        try {
            this.o += igoVar.c();
            if (gfh.f19951a) {
                gfh.a(String.format(Locale.getDefault(), "[RotationHandler] current rotation in degrees: %f", Double.valueOf(this.o)));
            }
            JSMath.applyRotationInDegreesToScope(this.d, this.o);
            if (!t(this.j, this.d)) {
                s(this.f2170a, this.d, Key.ROTATION);
            }
        } catch (Exception e) {
            gfh.c("runtime error", e);
        }
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        View a2 = this.h.g().a(str, str3);
        gfh.a("remove touch listener success.[" + str + "," + str2 + "]");
        if (a2 == null) {
            return false;
        }
        ViewProxy.setOnTouchListener(a2, null);
        return true;
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        View a2 = this.h.g().a(str, str3);
        if (a2 == null) {
            gfh.b("[RotationHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        ViewProxy.setOnTouchListener(a2, this);
        gfh.a("[RotationHandler] onCreate success. {source:" + str + ",type:" + str2 + "}");
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            A("interceptor", ((Double) map.get("r")).doubleValue(), Collections.singletonMap("interceptor", str));
        }
    }
}
