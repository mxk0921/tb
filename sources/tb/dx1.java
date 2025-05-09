package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.localization.UGCLocalizationManager;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705227);
        }

        public a() {
        }

        @JvmStatic
        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1981fe8d", new Object[]{this});
            }
            return UGCLocalizationManager.INSTANCE.a();
        }

        @JvmStatic
        public final String b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef325385", new Object[]{this, new Integer(i)});
            }
            return UGCLocalizationManager.INSTANCE.b(i);
        }

        @JvmStatic
        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue();
            }
            return UGCLocalizationManager.INSTANCE.c();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(511705226);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1981fe8d", new Object[0]);
        }
        return Companion.a();
    }

    @JvmStatic
    public static final String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef325385", new Object[]{new Integer(i)});
        }
        return Companion.b(i);
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[0])).booleanValue();
        }
        return Companion.c();
    }
}
