package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WELCOME_NAME = "com.taobao.tao.welcome.Welcome";

    /* renamed from: a  reason: collision with root package name */
    public static a f16145a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f16146a;

        public a(b bVar) {
            this.f16146a = bVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac13492", new Object[]{this, sharedPreferences, str});
            } else if ("shouldcreateprovision".equals(str) && b2n.a(sharedPreferences)) {
                ((b8t) this.f16146a).q();
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    public static /* synthetic */ boolean a(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44a3dc11", new Object[]{sharedPreferences})).booleanValue();
        }
        return f(sharedPreferences);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b911068", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return c(context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0), str, z);
    }

    public static boolean c(SharedPreferences sharedPreferences, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2a6d4c", new Object[]{sharedPreferences, str, new Boolean(z)})).booleanValue();
        }
        return sharedPreferences.getBoolean(str, z);
    }

    public static void d(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff299b3", new Object[]{context, bVar});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        if (f16145a == null) {
            f16145a = new a(bVar);
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(f16145a);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b00f4bb", new Object[]{context})).booleanValue();
        }
        return !b(context, "shouldcreateprovision", true);
    }

    public static boolean f(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("613f5917", new Object[]{sharedPreferences})).booleanValue();
        }
        return !c(sharedPreferences, "shouldcreateprovision", true);
    }
}
