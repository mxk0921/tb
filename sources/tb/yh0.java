package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.android.external.UCPManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<String, Integer> f32083a = new ConcurrentHashMap();
    public String b;
    public long c;
    public final Context d;

    static {
        t2o.a(343933288);
    }

    public yh0(Context context) {
        if (context != null) {
            this.d = context.getApplicationContext();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1677dab1", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.b;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        return true;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204985b9", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.b = str;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5a64a8", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf83d559", new Object[]{this, str});
            return;
        }
        Integer num = (Integer) ((ConcurrentHashMap) this.f32083a).get(str);
        if (num == null || num.intValue() != 2) {
            ((ConcurrentHashMap) this.f32083a).put(str, 2);
            pu3.n(this.d, "AGOO_BIND", this.c, this.f32083a);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1cf487", new Object[]{this, str})).booleanValue();
        }
        if (((ConcurrentHashMap) this.f32083a).isEmpty()) {
            f();
        }
        Integer num = (Integer) ((ConcurrentHashMap) this.f32083a).get(str);
        ALog.i("AgooBindCache", "isAgooRegistered", "packageName", str, UCPManager.APP_STATUS, num, "agooBindStatus", this.f32083a);
        return !UtilityImpl.utdidChanged("Agoo_AppStore", this.d) && num != null && num.intValue() == 2;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10110dbb", new Object[]{this});
            return;
        }
        try {
            String string = APreferencesManager.getSharedPreferences(this.d, "AGOO_BIND", 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.c = jSONArray.getLong(0);
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.c;
            if (currentTimeMillis < 86400000 + j) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    ((ConcurrentHashMap) this.f32083a).put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt("s")));
                }
                ALog.i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f32083a);
                return;
            }
            ALog.i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(j));
            this.c = 0L;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
