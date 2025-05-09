package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface bw9<C> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a<C> implements bw9<C> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f16679a;
        public static final bw9<vlt> TEXT_MAP = new a("TEXT_MAP");
        public static final bw9<zlt> TEXT_MAP_INJECT = new a("TEXT_MAP_INJECT");
        public static final bw9<Object> TEXT_MAP_EXTRACT = new a("TEXT_MAP_EXTRACT");
        public static final bw9<vlt> HTTP_HEADERS = new a("HTTP_HEADERS");
        public static final bw9<ka2> BINARY = new a("BINARY");
        public static final bw9<oa2> BINARY_INJECT = new a("BINARY_INJECT");
        public static final bw9<na2> BINARY_EXTRACT = new a("BINARY_EXTRACT");

        static {
            t2o.a(315621393);
            t2o.a(315621392);
        }

        public a(String str) {
            this.f16679a = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return a.class.getSimpleName() + "." + this.f16679a;
        }
    }
}
