package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public @interface ProtoField {
    boolean deprecated() default false;

    Message.Label label() default Message.Label.OPTIONAL;

    boolean redacted() default false;

    int tag();

    Message.Datatype type() default Message.Datatype.MESSAGE;
}
