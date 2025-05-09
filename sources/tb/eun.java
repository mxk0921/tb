package tb;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface eun {
    Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException;

    Field b(Class<?> cls, String str) throws NoSuchFieldException;

    Field[] c(Class<?> cls) throws SecurityException;
}
