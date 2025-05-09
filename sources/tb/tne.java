package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ImagePreviewType;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tne {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f28822a;
    public String b;
    public final String c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337226);
        }

        public a() {
        }

        @JvmStatic
        public final tne a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tne) ipChange.ipc$dispatch("a9dfc832", new Object[]{this, str});
            }
            ckf.g(str, "type");
            tne tneVar = new tne((a07) null);
            try {
                String a2 = ImagePreviewType.Companion.a(str);
                if (a2 != null) {
                    tneVar.f28822a = a2;
                    return tneVar;
                }
                throw new RuntimeException("type 参数类型错误！");
            } catch (Throwable unused) {
                return null;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337225);
    }

    public tne() {
        this.f28822a = "";
    }

    @JvmStatic
    public static final tne a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tne) ipChange.ipc$dispatch("a9dfc832", new Object[]{str});
        }
        return Companion.a(str);
    }

    public /* synthetic */ tne(a07 a07Var) {
        this();
    }

    public tne(Map<String, ? extends Object> map) {
        this();
        String a2 = ImagePreviewType.Companion.a(MegaUtils.x(map, "type", null));
        if (a2 != null) {
            this.f28822a = a2;
            this.b = MegaUtils.x(map, "imageURL", null);
            this.c = MegaUtils.x(map, yj4.PUBLISH_VIDEO_TMP_PATH, null);
            this.d = MegaUtils.x(map, lf9.KEY_VIDEO_ID, null);
            return;
        }
        throw new RuntimeException("type 参数必传！");
    }
}
