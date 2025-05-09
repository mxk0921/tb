package tb;

import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ug8 implements u2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093326);
        t2o.a(806355670);
    }

    @Override // tb.u2c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deec0ab1", new Object[]{this})).intValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(gq0.g().getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
    }

    @Override // tb.u2c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e1dad06", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.u2c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("756ac034", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
