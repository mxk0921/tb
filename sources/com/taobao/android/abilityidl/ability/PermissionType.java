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
public @interface PermissionType {
    public static final String ACCESS_FINE_LOCATION = "ACCESS_FINE_LOCATION";
    public static final a Companion = a.$$INSTANCE;
    public static final String NFC = "NFC";
    public static final String READ_EXTERNAL_STORAGE = "READ_EXTERNAL_STORAGE";
    public static final String RECORD_AUDIO = "RECORD_AUDIO";
    public static final String WRITE_CALENDAR = "WRITE_CALENDAR";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACCESS_FINE_LOCATION = "ACCESS_FINE_LOCATION";
        public static final String NFC = "NFC";
        public static final String READ_EXTERNAL_STORAGE = "READ_EXTERNAL_STORAGE";
        public static final String RECORD_AUDIO = "RECORD_AUDIO";
        public static final String WRITE_CALENDAR = "WRITE_CALENDAR";

        static {
            t2o.a(525337383);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case 77195:
                        if (str.equals("NFC")) {
                            return "NFC";
                        }
                        break;
                    case 303398256:
                        if (str.equals("READ_EXTERNAL_STORAGE")) {
                            return "READ_EXTERNAL_STORAGE";
                        }
                        break;
                    case 766697727:
                        if (str.equals("ACCESS_FINE_LOCATION")) {
                            return "ACCESS_FINE_LOCATION";
                        }
                        break;
                    case 910164926:
                        if (str.equals("WRITE_CALENDAR")) {
                            return "WRITE_CALENDAR";
                        }
                        break;
                    case 1107437128:
                        if (str.equals("RECORD_AUDIO")) {
                            return "RECORD_AUDIO";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
