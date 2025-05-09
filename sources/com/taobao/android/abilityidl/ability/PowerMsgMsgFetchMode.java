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
public @interface PowerMsgMsgFetchMode {
    public static final a Companion = a.$$INSTANCE;
    public static final String PULL_EXT = "PULL_EXT";
    public static final String PULL_ONLY = "PULL_ONLY";
    public static final String PULL_WHEN_DISCONNECT = "PULL_WHEN_DISCONNECT";
    public static final String PUSH_AND_PULL = "PUSH_AND_PULL";
    public static final String PUSH_ONLY = "PUSH_ONLY";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String PULL_EXT = "PULL_EXT";
        public static final String PULL_ONLY = "PULL_ONLY";
        public static final String PULL_WHEN_DISCONNECT = "PULL_WHEN_DISCONNECT";
        public static final String PUSH_AND_PULL = "PUSH_AND_PULL";
        public static final String PUSH_ONLY = "PUSH_ONLY";

        static {
            t2o.a(525337431);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1931790073:
                        if (str.equals("PULL_EXT")) {
                            return "PULL_EXT";
                        }
                        break;
                    case -573808441:
                        if (str.equals("PULL_WHEN_DISCONNECT")) {
                            return "PULL_WHEN_DISCONNECT";
                        }
                        break;
                    case 244338022:
                        if (str.equals("PULL_ONLY")) {
                            return "PULL_ONLY";
                        }
                        break;
                    case 249381714:
                        if (str.equals("PUSH_AND_PULL")) {
                            return "PUSH_AND_PULL";
                        }
                        break;
                    case 2047379889:
                        if (str.equals("PUSH_ONLY")) {
                            return "PUSH_ONLY";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
