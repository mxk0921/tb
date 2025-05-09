package tb;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fcv {

    /* renamed from: a  reason: collision with root package name */
    public final String f19194a;
    public final pbv b;
    public final jcv c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public pbv b;
        public jcv c;
        public String e;
        public String f;
        public String g;

        /* renamed from: a  reason: collision with root package name */
        public String f19195a = "";
        public String d = UltronTradeHybridStage.ON_RENDER_END;
        public boolean h = false;
        public boolean i = true;

        static {
            t2o.a(157286876);
        }

        public fcv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("c0b4fb2e", new Object[]{this});
            }
            return new fcv(this.f19195a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f433f54f", new Object[]{this, str});
            }
            this.f19195a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9ce7f369", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("481e67fd", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public b e(pbv pbvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("288e48e1", new Object[]{this, pbvVar});
            }
            this.b = pbvVar;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1d08b4b5", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("622edcb2", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8d4d76ef", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("47e4cc4", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b j(jcv jcvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5b1ac715", new Object[]{this, jcvVar});
            }
            this.c = jcvVar;
            return this;
        }
    }

    static {
        t2o.a(157286874);
    }

    public fcv(String str, pbv pbvVar, jcv jcvVar, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f19194a = str;
        this.b = pbvVar;
        this.c = jcvVar;
        this.e = str2;
        this.f = str3;
        this.d = str4;
        this.g = str5;
        this.h = z;
        this.i = z2;
    }
}
