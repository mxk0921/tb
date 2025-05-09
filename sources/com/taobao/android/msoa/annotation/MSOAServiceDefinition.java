package com.taobao.android.msoa.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public @interface MSOAServiceDefinition {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Platform {
        ALL,
        NATIVE,
        WEEX,
        WINDVANE;

        public int value() {
            int i = a.$SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform[ordinal()];
            if (i == 1) {
                return 7;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 1;
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ProviderType {
        BUNDLE_INTERFACE,
        SERVICE_HUB,
        AIDL;

        @Override // java.lang.Enum
        public String toString() {
            int i = a.$SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$ProviderType[ordinal()];
            if (i == 1) {
                return "bundleInterface";
            }
            if (i == 2) {
                return "serviceHub";
            }
            if (i == 3) {
                return "bindService";
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$ProviderType;

        static {
            int[] iArr = new int[Platform.values().length];
            $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform = iArr;
            try {
                iArr[Platform.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform[Platform.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform[Platform.WEEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$Platform[Platform.WINDVANE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ProviderType.values().length];
            $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$ProviderType = iArr2;
            try {
                iArr2[ProviderType.BUNDLE_INTERFACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$ProviderType[ProviderType.SERVICE_HUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$msoa$annotation$MSOAServiceDefinition$ProviderType[ProviderType.AIDL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    String action() default "";

    String bizName();

    Platform platform() default Platform.ALL;

    ProviderType providerType() default ProviderType.BUNDLE_INTERFACE;

    String serviceId();

    boolean timeout() default false;

    String version() default "1.0";
}
