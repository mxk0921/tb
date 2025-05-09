package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Deprecated(message = "Please migrate to kotlin.jvm.KotlinActual in kotlin-annotations-jvm. ImplicitlyActualizedByJvmDeclaration will be dropped in future versions of Kotlin. See https://youtrack.jetbrains.com/issue/KT-67202")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/ImplicitlyActualizedByJvmDeclaration;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Documented
@DeprecatedSinceKotlin(errorSince = "2.1")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public @interface ImplicitlyActualizedByJvmDeclaration {
}
