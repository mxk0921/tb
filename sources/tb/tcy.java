package tb;

import android.database.Cursor;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.retry.AdMonitorRetryType;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f28642a;
    public final String b;
    public final String c;
    public final String d;
    public final AdMonitorType e;
    public final String f;
    public bd0 g;
    public final int h;
    public final AtomicInteger i;
    public final long j;
    public final String k;
    public AdMonitorRetryType l;

    static {
        t2o.a(283115558);
    }

    public tcy(String str, String str2, AdMonitorType adMonitorType, String str3, String str4, int i) {
        this.f28642a = -1L;
        this.i = new AtomicInteger(0);
        this.l = AdMonitorRetryType.MEMORY;
        this.b = str;
        this.c = str2;
        this.e = adMonitorType;
        this.d = str3;
        this.f = str4;
        this.h = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.k = azv.a(currentTimeMillis, "yyyy-MM-dd");
        this.j = currentTimeMillis + 86400000;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e015be16", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0d14d96", new Object[]{this});
        }
        return this.k;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4f81963", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd23f8d9", new Object[]{this})).longValue();
        }
        return this.f28642a;
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75b9a7f", new Object[]{this, new Long(j)});
        } else {
            this.f28642a = j;
        }
    }

    public void f(AdMonitorRetryType adMonitorRetryType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea070e1", new Object[]{this, adMonitorRetryType});
        } else {
            this.l = adMonitorRetryType;
        }
    }

    public void g(bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b352", new Object[]{this, bd0Var});
        } else {
            this.g = bd0Var;
        }
    }

    public AtomicInteger h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("528e74fd", new Object[]{this});
        }
        return this.i;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4544c063", new Object[]{this});
        }
        return this.c;
    }

    public bd0 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd0) ipChange.ipc$dispatch("2e330344", new Object[]{this});
        }
        return this.g;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d848b109", new Object[]{this});
        }
        return this.b;
    }

    public AdMonitorType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorType) ipChange.ipc$dispatch("ce9a6eda", new Object[]{this});
        }
        return this.e;
    }

    public AdMonitorRetryType m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorRetryType) ipChange.ipc$dispatch("f00caa6c", new Object[]{this});
        }
        return this.l;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dffddfec", new Object[]{this});
        }
        return this.f;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("999776b1", new Object[]{this});
        }
        return this.d;
    }

    public tcy(Cursor cursor) {
        this.f28642a = -1L;
        this.i = new AtomicInteger(0);
        this.l = AdMonitorRetryType.MEMORY;
        this.f28642a = cursor.getLong(cursor.getColumnIndex("id"));
        this.e = AdMonitorType.valueOf(cursor.getString(cursor.getColumnIndex("monitor_type")));
        this.b = cursor.getString(cursor.getColumnIndex("monitor_url"));
        this.c = cursor.getString(cursor.getColumnIndex("monitor_original_url"));
        this.d = cursor.getString(cursor.getColumnIndex("monitor_url_host"));
        this.f = cursor.getString(cursor.getColumnIndex("monitor_url_hash"));
        this.i = new AtomicInteger(cursor.getInt(cursor.getColumnIndex("retry_times")));
        this.h = cursor.getInt(cursor.getColumnIndex("max_retry_times"));
        this.k = cursor.getString(cursor.getColumnIndex("date"));
        this.j = cursor.getLong(cursor.getColumnIndex(PushConstants.REGISTER_STATUS_EXPIRE_TIME));
        String string = cursor.getString(cursor.getColumnIndex("monitor_extra_params"));
        if (!TextUtils.isEmpty(string)) {
            try {
                this.g = new bd0(string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
