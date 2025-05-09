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
public @interface LocationExpires {
    public static final a Companion = a.$$INSTANCE;
    public static final String FIR_MIN = "FIR_MIN";
    public static final String FOR_MIN = "FOR_MIN";
    public static final String HALF_DAY = "HALF_DAY";
    public static final String HALF_HOUR = "HALF_HOUR";
    public static final String NO_CACHE = "NO_CACHE";
    public static final String ONE_DAY = "ONE_DAY";
    public static final String ONE_HOUR = "ONE_HOUR";
    public static final String ONE_MIN = "ONE_MIN";
    public static final String SEC_MIN = "SEC_MIN";
    public static final String THR_MIN = "THR_MIN";
    public static final String TWO_HOUR = "TWO_HOUR";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FIR_MIN = "FIR_MIN";
        public static final String FOR_MIN = "FOR_MIN";
        public static final String HALF_DAY = "HALF_DAY";
        public static final String HALF_HOUR = "HALF_HOUR";
        public static final String NO_CACHE = "NO_CACHE";
        public static final String ONE_DAY = "ONE_DAY";
        public static final String ONE_HOUR = "ONE_HOUR";
        public static final String ONE_MIN = "ONE_MIN";
        public static final String SEC_MIN = "SEC_MIN";
        public static final String THR_MIN = "THR_MIN";
        public static final String TWO_HOUR = "TWO_HOUR";

        static {
            t2o.a(525337262);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1672717289:
                        if (str.equals("TWO_HOUR")) {
                            return "TWO_HOUR";
                        }
                        break;
                    case -1617752220:
                        if (str.equals("NO_CACHE")) {
                            return "NO_CACHE";
                        }
                        break;
                    case -1606411996:
                        if (str.equals("SEC_MIN")) {
                            return "SEC_MIN";
                        }
                        break;
                    case -1480724419:
                        if (str.equals("ONE_HOUR")) {
                            return "ONE_HOUR";
                        }
                        break;
                    case -619168047:
                        if (str.equals("THR_MIN")) {
                            return "THR_MIN";
                        }
                        break;
                    case -601958909:
                        if (str.equals("ONE_DAY")) {
                            return "ONE_DAY";
                        }
                        break;
                    case -601950023:
                        if (str.equals("ONE_MIN")) {
                            return "ONE_MIN";
                        }
                        break;
                    case -130688542:
                        if (str.equals("FIR_MIN")) {
                            return "FIR_MIN";
                        }
                        break;
                    case 41086364:
                        if (str.equals("FOR_MIN")) {
                            return "FOR_MIN";
                        }
                        break;
                    case 729849200:
                        if (str.equals("HALF_DAY")) {
                            return "HALF_DAY";
                        }
                        break;
                    case 1150621296:
                        if (str.equals("HALF_HOUR")) {
                            return "HALF_HOUR";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
