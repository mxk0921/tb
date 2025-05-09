package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.netutil.SecurityUtils;
import org.android.spdy.QuicCacher;
import org.android.spdy.SpdyAgent;
import org.android.spdy.spduLog;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class u8n implements QuicCacher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f29230a;
    public static Context b;

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
        } else if (f29230a == null) {
            Context context = b;
            if (context == null) {
                context = SpdyAgent.getContext();
            }
            init(context);
        }
    }

    @Override // org.android.spdy.QuicCacher
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (l0r.Q() && f29230a == null) {
            if (context == null) {
                context = SpdyAgent.getContext();
            }
            if (context != null && f29230a == null) {
                b = context;
                f29230a = context.getSharedPreferences("tnet_session_cache", 0);
            }
        }
    }

    @Override // org.android.spdy.QuicCacher
    public byte[] load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("86e330c6", new Object[]{this, str});
        }
        try {
            a();
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.QuicSecureSpCache", null, "load except, key=" + str, th);
        }
        if (f29230a != null && !TextUtils.isEmpty(str)) {
            String string = f29230a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            String optString = new JSONObject(string).optString("cache");
            if (!TextUtils.isEmpty(optString)) {
                String decrypt = SecurityUtils.decrypt(str, optString);
                if (!TextUtils.isEmpty(decrypt)) {
                    return decrypt.getBytes();
                }
                f29230a.edit().remove(str).apply();
            }
            return null;
        }
        return null;
    }

    @Override // org.android.spdy.QuicCacher
    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        try {
            a();
            if (f29230a != null && !TextUtils.isEmpty(str)) {
                f29230a.edit().remove(str).apply();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // org.android.spdy.QuicCacher
    public boolean store(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87800600", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            a();
            if (f29230a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String encrypt = SecurityUtils.encrypt(str, str2);
                if (TextUtils.isEmpty(encrypt)) {
                    return false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", System.currentTimeMillis());
                jSONObject.put("cache", encrypt);
                f29230a.edit().putString(str, jSONObject.toString()).apply();
                return true;
            }
            return false;
        } catch (Throwable th) {
            spduLog.Tloge("tnetsdk.QuicSecureSpCache", null, "store except, key=" + str, th);
            return false;
        }
    }
}
