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
public @interface PermissionKeyType {
    public static final String ACTIVITY_MOTION = "ACTIVITY_MOTION";
    public static final String APP_TRACKING = "APP_TRACKING";
    public static final String COARSE_LOCATION = "COARSE_LOCATION";
    public static final a Companion = a.$$INSTANCE;
    public static final String DAILY_ACTIVITIES = "DAILY_ACTIVITIES";
    public static final String FINE_LOCATION = "FINE_LOCATION";
    public static final String READ_AUDIO = "READ_AUDIO";
    public static final String READ_CALENDAR = "READ_CALENDAR";
    public static final String READ_CONTACTS = "READ_CONTACTS";
    public static final String READ_IMAGES = "READ_IMAGES";
    public static final String READ_PASTEBOARD = "READ_PASTEBOARD";
    public static final String READ_VIDEO = "READ_VIDEO";
    public static final String RECORD_AUDIO = "RECORD_AUDIO";
    public static final String TAKE_CAMERA = "TAKE_CAMERA";
    public static final String WRITE_AUDIO = "WRITE_AUDIO";
    public static final String WRITE_CALENDAR = "WRITE_CALENDAR";
    public static final String WRITE_CONTACTS = "WRITE_CONTACTS";
    public static final String WRITE_IMAGES = "WRITE_IMAGES";
    public static final String WRITE_VIDEO = "WRITE_VIDEO";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTIVITY_MOTION = "ACTIVITY_MOTION";
        public static final String APP_TRACKING = "APP_TRACKING";
        public static final String COARSE_LOCATION = "COARSE_LOCATION";
        public static final String DAILY_ACTIVITIES = "DAILY_ACTIVITIES";
        public static final String FINE_LOCATION = "FINE_LOCATION";
        public static final String READ_AUDIO = "READ_AUDIO";
        public static final String READ_CALENDAR = "READ_CALENDAR";
        public static final String READ_CONTACTS = "READ_CONTACTS";
        public static final String READ_IMAGES = "READ_IMAGES";
        public static final String READ_PASTEBOARD = "READ_PASTEBOARD";
        public static final String READ_VIDEO = "READ_VIDEO";
        public static final String RECORD_AUDIO = "RECORD_AUDIO";
        public static final String TAKE_CAMERA = "TAKE_CAMERA";
        public static final String WRITE_AUDIO = "WRITE_AUDIO";
        public static final String WRITE_CALENDAR = "WRITE_CALENDAR";
        public static final String WRITE_CONTACTS = "WRITE_CONTACTS";
        public static final String WRITE_IMAGES = "WRITE_IMAGES";
        public static final String WRITE_VIDEO = "WRITE_VIDEO";

        static {
            t2o.a(525337371);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1072386312:
                        if (str.equals("WRITE_IMAGES")) {
                            return "WRITE_IMAGES";
                        }
                        break;
                    case -392540863:
                        if (str.equals("READ_IMAGES")) {
                            return "READ_IMAGES";
                        }
                        break;
                    case -46133530:
                        if (str.equals("ACTIVITY_MOTION")) {
                            return "ACTIVITY_MOTION";
                        }
                        break;
                    case 22403397:
                        if (str.equals("COARSE_LOCATION")) {
                            return "COARSE_LOCATION";
                        }
                        break;
                    case 63449724:
                        if (str.equals("READ_PASTEBOARD")) {
                            return "READ_PASTEBOARD";
                        }
                        break;
                    case 512449334:
                        if (str.equals("WRITE_AUDIO")) {
                            return "WRITE_AUDIO";
                        }
                        break;
                    case 521038035:
                        if (str.equals("WRITE_CONTACTS")) {
                            return "WRITE_CONTACTS";
                        }
                        break;
                    case 531485659:
                        if (str.equals("WRITE_VIDEO")) {
                            return "WRITE_VIDEO";
                        }
                        break;
                    case 910164926:
                        if (str.equals("WRITE_CALENDAR")) {
                            return "WRITE_CALENDAR";
                        }
                        break;
                    case 1017485532:
                        if (str.equals("READ_CONTACTS")) {
                            return "READ_CONTACTS";
                        }
                        break;
                    case 1107437128:
                        if (str.equals("RECORD_AUDIO")) {
                            return "RECORD_AUDIO";
                        }
                        break;
                    case 1146135706:
                        if (str.equals("FINE_LOCATION")) {
                            return "FINE_LOCATION";
                        }
                        break;
                    case 1227116493:
                        if (str.equals("READ_AUDIO")) {
                            return "READ_AUDIO";
                        }
                        break;
                    case 1246152818:
                        if (str.equals("READ_VIDEO")) {
                            return "READ_VIDEO";
                        }
                        break;
                    case 1380676405:
                        if (str.equals("APP_TRACKING")) {
                            return "APP_TRACKING";
                        }
                        break;
                    case 1406612423:
                        if (str.equals("READ_CALENDAR")) {
                            return "READ_CALENDAR";
                        }
                        break;
                    case 1760211421:
                        if (str.equals("TAKE_CAMERA")) {
                            return "TAKE_CAMERA";
                        }
                        break;
                    case 2000638451:
                        if (str.equals("DAILY_ACTIVITIES")) {
                            return "DAILY_ACTIVITIES";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
