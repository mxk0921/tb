package com.taobao.android.trade.boost.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface MtopParams {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum RequestMethod {
        GET,
        POST;

        @Override // java.lang.Enum
        public String toString() {
            int i = a.$SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$RequestMethod[ordinal()];
            if (i == 1) {
                return "GET";
            }
            if (i == 2) {
                return "POST";
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum UnitStrategy {
        UNIT_TRADE,
        UNIT_GUIDE,
        UNIT_NULL;

        @Override // java.lang.Enum
        public String toString() {
            int i = a.$SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$UnitStrategy[ordinal()];
            if (i == 1) {
                return "UNIT_TRADE";
            }
            if (i == 2) {
                return "UNIT_GUIDE";
            }
            if (i == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$RequestMethod;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$UnitStrategy;

        static {
            int[] iArr = new int[UnitStrategy.values().length];
            $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$UnitStrategy = iArr;
            try {
                iArr[UnitStrategy.UNIT_TRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$UnitStrategy[UnitStrategy.UNIT_GUIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$UnitStrategy[UnitStrategy.UNIT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RequestMethod.values().length];
            $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$RequestMethod = iArr2;
            try {
                iArr2[RequestMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$boost$annotations$MtopParams$RequestMethod[RequestMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    String apiName();

    String apiVersion();

    String clientName() default "";

    boolean needEcode() default false;

    boolean needSession() default false;

    RequestMethod requestMethod() default RequestMethod.GET;

    UnitStrategy unitStrategy() default UnitStrategy.UNIT_NULL;

    boolean useWua() default false;
}
