package tb;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class o7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o7m INSTANCE = new o7m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements hpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f25189a;
        public final /* synthetic */ int b;
        public final /* synthetic */ float c;
        public final /* synthetic */ int d;

        public a(int i, float f, int i2) {
            this.b = i;
            this.c = f;
            this.d = i2;
        }

        @Override // tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            } else {
                ckf.g(drawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
            }
        }

        @Override // tb.hpc.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
            }
        }

        @Override // tb.hpc.a
        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
                return;
            }
            ckf.g(obj, "tag");
            this.f25189a = obj;
        }

        @Override // tb.hpc.a
        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return (int) (this.d * this.c);
        }

        @Override // tb.hpc.a
        public Object getTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
            }
            Object obj = this.f25189a;
            ckf.d(obj);
            return obj;
        }

        @Override // tb.hpc.a
        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return (int) (this.b * this.c);
        }
    }

    static {
        t2o.a(481297637);
    }

    @JvmStatic
    public static final void a(String str, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1e40d2", new Object[]{str, new Integer(i), new Integer(i2), new Float(f)});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            hpc e = uvh.f().e();
            if (e instanceof hie) {
                ((hie) e).e(Globals.getApplication(), str, new a(i, f, i2), MUSImageQuality.AUTO);
            }
        }
    }
}
