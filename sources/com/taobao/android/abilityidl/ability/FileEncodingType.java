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
public @interface FileEncodingType {
    public static final String ASCII = "ASCII";
    public static final String BASE64 = "BASE64";
    public static final a Companion = a.$$INSTANCE;
    public static final String HEX = "HEX";
    public static final String LATIN1 = "LATIN1";
    public static final String UCS2 = "UCS2";
    public static final String UTF16 = "UTF16";
    public static final String UTF8 = "UTF8";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ASCII = "ASCII";
        public static final String BASE64 = "BASE64";
        public static final String HEX = "HEX";
        public static final String LATIN1 = "LATIN1";
        public static final String UCS2 = "UCS2";
        public static final String UTF16 = "UTF16";
        public static final String UTF8 = "UTF8";

        static {
            t2o.a(525336926);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -2056547891:
                        if (str.equals("LATIN1")) {
                            return "LATIN1";
                        }
                        break;
                    case 71419:
                        if (str.equals("HEX")) {
                            return "HEX";
                        }
                        break;
                    case 2599245:
                        if (str.equals("UCS2")) {
                            return "UCS2";
                        }
                        break;
                    case 2615185:
                        if (str.equals("UTF8")) {
                            return "UTF8";
                        }
                        break;
                    case 62568241:
                        if (str.equals("ASCII")) {
                            return "ASCII";
                        }
                        break;
                    case 81070572:
                        if (str.equals("UTF16")) {
                            return "UTF16";
                        }
                        break;
                    case 1952093519:
                        if (str.equals("BASE64")) {
                            return "BASE64";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
