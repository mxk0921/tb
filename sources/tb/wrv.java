package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wrv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f30881a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337659);
        }

        public a() {
        }

        @JvmStatic
        public final wrv a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wrv) ipChange.ipc$dispatch("cd203923", new Object[]{this, str, str2});
            }
            ckf.g(str, "bizID");
            ckf.g(str2, "key");
            wrv wrvVar = new wrv((a07) null);
            wrvVar.f30881a = str;
            wrvVar.b = str2;
            return wrvVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337658);
    }

    public wrv() {
        this.f30881a = "";
        this.b = "";
    }

    public /* synthetic */ wrv(a07 a07Var) {
        this();
    }

    public wrv(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizID", null);
        if (x != null) {
            this.f30881a = x;
            String x2 = MegaUtils.x(map, "key", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("key 参数必传！");
        }
        throw new RuntimeException("bizID 参数必传！");
    }
}
