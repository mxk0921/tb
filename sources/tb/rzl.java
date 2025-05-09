package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final rzl f27698a = new rzl();
    }

    public static rzl d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rzl) ipChange.ipc$dispatch("9ce27b95", new Object[0]);
        }
        return a.f27698a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        synchronized (rzl.class) {
            try {
                SharedPreferences h = h();
                if (h != null) {
                    h.edit().clear().apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("819aea2d", new Object[]{this});
        }
        SharedPreferences h = h();
        if (h != null) {
            String string = h.getString("permission_config", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                e.printStackTrace();
                Log.e("PermissionSP", "Could not parse malformed JSON: \"" + string + "\"");
            }
        }
        return null;
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e28af811", new Object[]{this, str});
        }
        SharedPreferences g = g();
        if (g == null) {
            return null;
        }
        return g.getString("permission_" + str, null);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c210191f", new Object[]{this});
        }
        SharedPreferences g = g();
        if (g == null) {
            return null;
        }
        return g.getString("permission_granted_record", "");
    }

    public synchronized void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aebe870", new Object[]{this, str});
            return;
        }
        SharedPreferences h = h();
        if (h != null) {
            h.edit().putString("permission_config", str).apply();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2976d65d", new Object[]{this})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return true;
        }
        return g.getBoolean("permission_permission_clip_board", true);
    }

    public final SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("dc839bb3", new Object[]{this});
        }
        if (vg8.a() != null) {
            return vg8.a().getSharedPreferences("permission_config_with_scene", 0);
        }
        return null;
    }

    public final SharedPreferences h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3bf3c6b6", new Object[]{this});
        }
        if (vg8.a() != null) {
            return vg8.a().getSharedPreferences("permission_config", 0);
        }
        return null;
    }

    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1069b976", new Object[]{this, str, str2})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        SharedPreferences.Editor edit = g.edit();
        edit.putString("permission_" + str, str2).apply();
        return true;
    }

    public boolean k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fb7d6ab", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        g.edit().putBoolean("permission_permission_clip_board", z).apply();
        return true;
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c4c63b", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        g.edit().putString("permission_granted_record", str).apply();
        return true;
    }
}
