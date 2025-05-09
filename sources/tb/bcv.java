package tb;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bcv {

    /* renamed from: a  reason: collision with root package name */
    public final String f16323a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16324a = "";
        public String b = "";
        public String c = UltronTradeHybridStage.ON_RENDER_END;

        static {
            t2o.a(157286872);
        }

        public bcv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bcv) ipChange.ipc$dispatch("fc5383c0", new Object[]{this});
            }
            return new bcv(this.f16324a, this.b, this.c);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("99333e1", new Object[]{this, str});
            }
            this.f16324a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("261e2900", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("34dd4656", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(157286870);
    }

    public bcv(String str, String str2, String str3) {
        this.f16323a = str2;
        this.b = str3;
    }
}
