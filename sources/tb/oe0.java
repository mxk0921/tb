package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oe0 extends hu<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150676);
    }

    public oe0(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(oe0 oe0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/AddCartNotifyProcessor");
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7bed8c2", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Boolean.TRUE.toString().equalsIgnoreCase(((JSONObject) JSON.parse(str)).getString("refreshImmediately"));
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b26344da", new Object[]{this, intent})).booleanValue();
        }
        String action = intent.getAction();
        if (!intent.hasExtra("cartWVAddCartNotify")) {
            return false;
        }
        if (intent.hasExtra("params")) {
            String stringExtra = intent.getStringExtra("params");
            boolean b = b(stringExtra);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("action", action);
                hashMap.put("params", stringExtra);
                hashMap.put("refreshImmediately", Boolean.valueOf(b));
                fdv.f("AddCartNotifyProcessor", "broadcast", hashMap);
            } catch (Exception unused) {
            }
            if (b) {
                if (!this.f20898a.R().isVisible() || !this.f20898a.R().isResumed()) {
                    return false;
                }
                this.f20898a.d().B().S(true);
                ((f8e) this.f20898a.T()).b();
                return true;
            }
        }
        this.f20898a.d().B().S(true);
        return true;
    }
}
