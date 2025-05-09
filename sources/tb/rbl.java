package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(758120568);
        }

        public a() {
        }

        public static /* synthetic */ String h(a aVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8adeb467", new Object[]{aVar, str, str2, new Integer(i), obj});
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return aVar.g(str, str2);
        }

        @JvmStatic
        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7aec2487", new Object[]{this})).booleanValue();
            }
            return a("first_frame_tracker_enable", true);
        }

        @JvmStatic
        public final float d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c991409a", new Object[]{this})).floatValue();
            }
            return b("js_tracker_sample_rate", 0.07f);
        }

        @JvmStatic
        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1c936824", new Object[]{this});
            }
            return f("remote_degrade_url", "");
        }

        @JvmStatic
        public final String f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
            }
            return g(str, str2);
        }

        public final String g(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{this, str, str2});
            }
            return OrangeConfig.getInstance().getConfig("tb_ratepublish_android", str, str2);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            ckf.g(str, "key");
            return krq.b(h(this, str, null, 2, null), z);
        }

        @JvmStatic
        public final float b(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
            }
            ckf.g(str, "key");
            return krq.g(h(this, str, null, 2, null), f);
        }
    }

    static {
        t2o.a(758120567);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c936824", new Object[0]);
        }
        return Companion.e();
    }
}
