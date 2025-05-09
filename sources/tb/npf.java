package tb;

import kotlin.random.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class npf extends mpf {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static final a INSTANCE = new a();
        public static final Integer sdkVersion;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    @Override // tb.c5m
    public Random b() {
        if (d(34)) {
            return new g5m();
        }
        return super.b();
    }

    public final boolean d(int i) {
        Integer num = a.sdkVersion;
        if (num == null || num.intValue() >= i) {
            return true;
        }
        return false;
    }
}
