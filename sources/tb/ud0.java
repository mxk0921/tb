package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.android.turbo.adapter.impl.ApplicationAdapter;
import com.taobao.android.turbo.adapter.impl.ConfigAdapter;
import com.taobao.android.turbo.adapter.impl.ImageLoaderAdapter;
import com.taobao.android.turbo.adapter.impl.LoginAdapter;
import com.taobao.android.turbo.adapter.impl.MtopAdapter;
import com.taobao.android.turbo.adapter.impl.StorageAdapter;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ud0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601162);
        }

        public a() {
        }

        @JvmStatic
        public final hhb a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhb) ipChange.ipc$dispatch("b4db3c5", new Object[]{this});
            }
            return ApplicationAdapter.Companion.a();
        }

        @JvmStatic
        public final lpb b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lpb) ipChange.ipc$dispatch("f38e227", new Object[]{this});
            }
            return ConfigAdapter.Companion.a();
        }

        @JvmStatic
        public final cec c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cec) ipChange.ipc$dispatch("de9960c7", new Object[]{this});
            }
            return ImageLoaderAdapter.Companion.a();
        }

        @JvmStatic
        public final foc d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (foc) ipChange.ipc$dispatch("1fab77f7", new Object[]{this});
            }
            return LoginAdapter.Companion.a();
        }

        @JvmStatic
        public final bwc e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bwc) ipChange.ipc$dispatch("c4186ba7", new Object[]{this});
            }
            return MtopAdapter.Companion.a();
        }

        @JvmStatic
        public final IStorageAdapter f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IStorageAdapter) ipChange.ipc$dispatch("70eaea1b", new Object[]{this});
            }
            return StorageAdapter.Companion.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601161);
    }

    @JvmStatic
    public static final IStorageAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorageAdapter) ipChange.ipc$dispatch("70eaea1b", new Object[0]);
        }
        return Companion.f();
    }
}
