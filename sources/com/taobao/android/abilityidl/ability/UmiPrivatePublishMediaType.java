package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public @interface UmiPrivatePublishMediaType {
    public static final String ALL = "ALL";
    public static final a Companion = a.$$INSTANCE;
    public static final String PHOTO = "PHOTO";
    public static final String VIDEO = "VIDEO";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ALL = "ALL";
        public static final String PHOTO = "PHOTO";
        public static final String VIDEO = "VIDEO";

        static {
            t2o.a(525337631);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 64897) {
                    if (hashCode != 76105234) {
                        if (hashCode == 81665115 && str.equals("VIDEO")) {
                            return "VIDEO";
                        }
                    } else if (str.equals("PHOTO")) {
                        return "PHOTO";
                    }
                } else if (str.equals("ALL")) {
                    return "ALL";
                }
            }
            return null;
        }
    }
}
