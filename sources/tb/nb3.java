package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import java.text.ParseException;
import java.util.Date;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nb3 INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f24613a = new JSONObject();

    static {
        t2o.a(479199564);
        nb3 nb3Var = new nb3();
        INSTANCE = nb3Var;
        nb3Var.f();
    }

    @JvmStatic
    public static final void g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3199619b", new Object[]{iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getKey() != null) {
            nb3 nb3Var = INSTANCE;
            String key = iDMComponent.getKey();
            ckf.f(key, "component.key");
            if (!nb3Var.a(key)) {
                cb4.K(iDMComponent);
            }
        }
    }

    @JvmStatic
    public static final void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a457b6a", new Object[]{str, new Long(j)});
            return;
        }
        ckf.g(str, "key");
        long time = new Date(new Date().getTime() + (j * 1000)).getTime();
        nb3 nb3Var = INSTANCE;
        SharedPreferences e = nb3Var.e();
        JSONObject c = nb3Var.c();
        c.put((JSONObject) str, (String) Long.valueOf(time));
        e.edit().putString("cartHideItems", c.toString()).apply();
        synchronized (nb3Var) {
            f24613a.put((JSONObject) str, (String) Long.valueOf(time));
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef332820", new Object[]{this, str})).booleanValue();
        }
        Long d = d(str);
        if (d == null) {
            return true;
        }
        try {
            if (new Date().getTime() > d.longValue()) {
                return true;
            }
            return false;
        } catch (ParseException unused) {
            return true;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709dcaef", new Object[]{this});
        }
        synchronized (this) {
            jSONObject = f24613a;
        }
        return jSONObject;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd872626", new Object[]{this});
        }
        String string = e().getString("cartHideItems", "");
        if (string == null || string.length() == 0) {
            return new JSONObject();
        }
        JSONObject parseObject = JSON.parseObject(string);
        ckf.f(parseObject, "JSONObject.parseObject(cartHideItemsStr)");
        return parseObject;
    }

    public final Long d(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("c2145047", new Object[]{this, str});
        }
        ckf.g(str, "key");
        synchronized (this) {
            l = f24613a.getLong(str);
        }
        return l;
    }

    public final SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("586de5b1", new Object[]{this});
        }
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("HideItem", 0);
        ckf.f(sharedPreferences, "Globals.getApplication()…m\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807b7cb3", new Object[]{this});
            return;
        }
        JSONObject c = c();
        for (String str : c.keySet()) {
            f24613a.put((JSONObject) str, (String) Long.valueOf(c.getLongValue(str)));
        }
    }
}
