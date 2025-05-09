package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import com.taobao.android.tbabilitykit.pop.StdPopContainerActivity;
import java.lang.ref.WeakReference;
import java.util.Stack;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class za0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final za0 INSTANCE = new za0();

    /* renamed from: a  reason: collision with root package name */
    public static final Stack<qlq> f32640a = new Stack<>();

    static {
        t2o.a(786432113);
    }

    @JvmStatic
    public static final qlq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlq) ipChange.ipc$dispatch("5af3a960", new Object[0]);
        }
        Stack<qlq> stack = f32640a;
        if (stack.empty()) {
            return null;
        }
        return stack.pop();
    }

    @JvmStatic
    public static final void c(n9 n9Var, qlq qlqVar, boolean z) {
        Object obj;
        Class cls;
        Integer integer;
        Uri data;
        ComponentName component;
        ComponentName component2;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafdeae6", new Object[]{n9Var, qlqVar, new Boolean(z)});
            return;
        }
        ckf.g(n9Var, "akCtx");
        ckf.g(qlqVar, "runnable");
        f32640a.push(qlqVar);
        h9 c = qlqVar.c();
        boolean z2 = n9Var instanceof nlq;
        Integer num = null;
        nlq nlqVar = (nlq) (!z2 ? null : n9Var);
        Intent o = nlqVar != null ? nlqVar.o() : null;
        if (z2) {
            WeakReference<Object> n = ((nlq) n9Var).n();
            obj = n != null ? n.get() : null;
        } else {
            obj = n9Var.d();
        }
        Fragment fragment = !(obj instanceof Fragment) ? null : obj;
        boolean z3 = obj instanceof Context;
        Context context = !z3 ? null : obj;
        if (context == null) {
            context = n9Var.d();
        }
        if (z) {
            cls = StdPopActivityGroup.class;
        } else {
            cls = StdPopContainerActivity.class;
        }
        Intent intent = new Intent(context, cls);
        try {
            intent.putExtra(Nav.NAV_TO_URL_START_UPTIME, SystemClock.uptimeMillis());
            intent.putExtra("NAV_TO_URL_START_TIME", System.currentTimeMillis());
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
        String str = c.e;
        if (str != null) {
            intent.setData(Uri.parse(str));
        }
        JSONObject jSONObject = c.g;
        if (jSONObject != null) {
            Bundle a2 = hp6.a(intent.getExtras(), jSONObject);
            if (!(o == null || (extras = o.getExtras()) == null)) {
                a2.putAll(extras);
            }
            intent.replaceExtras(a2);
        }
        intent.putExtra("std_pop_origin_component_cls_name", (o == null || (component2 = o.getComponent()) == null) ? null : component2.getClassName());
        intent.putExtra("std_pop_origin_component_pkg_name", (o == null || (component = o.getComponent()) == null) ? null : component.getPackageName());
        intent.putExtra("std_pop_to_page", (o == null || (data = o.getData()) == null) ? null : data.toString());
        boolean l = gxv.l(n9Var.d());
        INSTANCE.b(intent, o);
        JSONObject jSONObject2 = c.h;
        int intValue = (jSONObject2 == null || (integer = jSONObject2.getInteger("showNativeWithCode")) == null) ? -1 : integer.intValue();
        if (fragment != null && fragment.getActivity() != null) {
            if (l && z) {
                StdPopActivityGroup.a aVar = StdPopActivityGroup.Companion;
                h9 c2 = qlqVar.c();
                if (c2 != null) {
                    aVar.b(((a9) c2).f(), intent, o, fragment.getActivity());
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        num = Integer.valueOf(activity.getRequestedOrientation());
                    }
                    intent.putExtra(StdPopActivityGroup.KEY_ORIENTATION, num);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
            }
            if (intValue != -1) {
                fragment.startActivityForResult(intent, intValue);
            } else {
                fragment.startActivity(intent);
            }
        } else if (obj instanceof Activity) {
            if (l && z) {
                StdPopActivityGroup.a aVar2 = StdPopActivityGroup.Companion;
                h9 c3 = qlqVar.c();
                if (c3 != null) {
                    aVar2.b(((a9) c3).f(), intent, o, (Context) obj);
                    intent.putExtra(StdPopActivityGroup.KEY_ORIENTATION, ((Activity) obj).getRequestedOrientation());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
            }
            if (intValue != -1) {
                ((Activity) obj).startActivityForResult(intent, intValue);
            } else {
                ((Activity) obj).startActivity(intent);
            }
        } else {
            if (l && z) {
                StdPopActivityGroup.a aVar3 = StdPopActivityGroup.Companion;
                h9 c4 = qlqVar.c();
                if (c4 != null) {
                    aVar3.b(((a9) c4).f(), intent, o, !z3 ? null : obj);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
            }
            intent.addFlags(268435456);
            if (z3) {
                num = obj;
            }
            Context context2 = (Context) num;
            if (context2 != null) {
                context2.startActivity(intent);
            }
        }
    }

    public final void b(Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7950821", new Object[]{this, intent, intent2});
        } else if (intent2 != null) {
            intent.setFlags(intent2.getFlags() & (-608337921));
        }
    }
}
