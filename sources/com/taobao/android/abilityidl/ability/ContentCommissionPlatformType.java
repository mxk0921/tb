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
public @interface ContentCommissionPlatformType {
    public static final a Companion = a.$$INSTANCE;
    public static final String PLATFORM_PAD = "PLATFORM_PAD";
    public static final String PLATFORM_PC = "PLATFORM_PC";
    public static final String PLATFORM_PHONE = "PLATFORM_PHONE";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String PLATFORM_PAD = "PLATFORM_PAD";
        public static final String PLATFORM_PC = "PLATFORM_PC";
        public static final String PLATFORM_PHONE = "PLATFORM_PHONE";

        static {
            t2o.a(525336849);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1820833113) {
                    if (hashCode != -1768710526) {
                        if (hashCode == -890020545 && str.equals("PLATFORM_PC")) {
                            return "PLATFORM_PC";
                        }
                    } else if (str.equals("PLATFORM_PHONE")) {
                        return "PLATFORM_PHONE";
                    }
                } else if (str.equals("PLATFORM_PAD")) {
                    return "PLATFORM_PAD";
                }
            }
            return null;
        }
    }
}
