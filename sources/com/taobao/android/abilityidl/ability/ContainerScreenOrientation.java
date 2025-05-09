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
public @interface ContainerScreenOrientation {
    public static final a Companion = a.$$INSTANCE;
    public static final String landscape = "landscape";
    public static final String portrait = "portrait";
    public static final String unknown = "unknown";
    public static final String unspecified = "unspecified";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String landscape = "landscape";
        public static final String portrait = "portrait";
        public static final String unknown = "unknown";
        public static final String unspecified = "unspecified";

        static {
            t2o.a(525336816);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1626174665:
                        if (str.equals("unspecified")) {
                            return "unspecified";
                        }
                        break;
                    case -284840886:
                        if (str.equals("unknown")) {
                            return "unknown";
                        }
                        break;
                    case 729267099:
                        if (str.equals("portrait")) {
                            return "portrait";
                        }
                        break;
                    case 1430647483:
                        if (str.equals("landscape")) {
                            return "landscape";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
