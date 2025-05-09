package tb;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface vyf<R> extends kyf {
    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    e1g getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
