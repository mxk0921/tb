package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.jsbridge.WVABGlobalApi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rk2 implements r1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<SharedPreferences> f27434a = new AtomicReference<>(null);

    static {
        fsw.h(WVABGlobalApi.PLUGIN_NAME, WVABGlobalApi.class);
    }

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        d(context);
        SharedPreferences sharedPreferences = this.f27434a.get();
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
        }
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        } else if (this.f27434a.get() == null) {
            sng.a(this.f27434a, null, context.getSharedPreferences("ABGlobalBridgeSwitches", 0));
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        d(context);
        SharedPreferences sharedPreferences = this.f27434a.get();
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return null;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        d(context);
        SharedPreferences sharedPreferences = this.f27434a.get();
        if (sharedPreferences != null) {
            try {
                Map<String, ?> all = sharedPreferences.getAll();
                ifj b = t2w.b(g(), -1L, -1L, -1L, -1L);
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    b.b(t2w.e(entry.getKey(), entry.getValue().toString(), g()));
                }
                return b;
            } catch (NullPointerException unused) {
            }
        }
        return tij.EMPTY;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "JSBridge";
    }
}
