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
public @interface CLDRFormatType {
    public static final a Companion = a.$$INSTANCE;
    public static final String DEFAULT = "DEFAULT";
    public static final String FULL = "FULL";
    public static final String LONG = "LONG";
    public static final String MEDIUM = "MEDIUM";
    public static final String SHORT = "SHORT";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DEFAULT = "DEFAULT";
        public static final String FULL = "FULL";
        public static final String LONG = "LONG";
        public static final String MEDIUM = "MEDIUM";
        public static final String SHORT = "SHORT";

        static {
            t2o.a(525336749);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -2032180703:
                        if (str.equals("DEFAULT")) {
                            return "DEFAULT";
                        }
                        break;
                    case -2024701067:
                        if (str.equals("MEDIUM")) {
                            return "MEDIUM";
                        }
                        break;
                    case 2169487:
                        if (str.equals("FULL")) {
                            return "FULL";
                        }
                        break;
                    case 2342524:
                        if (str.equals("LONG")) {
                            return "LONG";
                        }
                        break;
                    case 78875740:
                        if (str.equals("SHORT")) {
                            return "SHORT";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
