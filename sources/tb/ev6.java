package tb;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ev6 {
    public static final void a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    public static final DebugMetadata b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    public static final int c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int i;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(BaseContinuationImpl baseContinuationImpl) {
        int i;
        String str;
        ckf.g(baseContinuationImpl, "<this>");
        DebugMetadata b = b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(baseContinuationImpl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.l()[c];
        }
        String b2 = lyi.INSTANCE.b(baseContinuationImpl);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + wh6.DIR + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
