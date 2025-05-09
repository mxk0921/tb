package com.alibaba.fastjson;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum PropertyNamingStrategy {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.fastjson.PropertyNamingStrategy$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy;

        static {
            int[] iArr = new int[PropertyNamingStrategy.values().length];
            $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy = iArr;
            try {
                iArr[PropertyNamingStrategy.SnakeCase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.KebabCase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.PascalCase.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.CamelCase.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String translate(String str) {
        int i = AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[ordinal()];
        int i2 = 0;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt < 'A' || charAt > 'Z') {
                    sb.append(charAt);
                } else {
                    char c = (char) (charAt + ' ');
                    if (i2 > 0) {
                        sb.append('_');
                    }
                    sb.append(c);
                }
                i2++;
            }
            return sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (i2 < str.length()) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 'A' || charAt2 > 'Z') {
                    sb2.append(charAt2);
                } else {
                    char c2 = (char) (charAt2 + ' ');
                    if (i2 > 0) {
                        sb2.append('-');
                    }
                    sb2.append(c2);
                }
                i2++;
            }
            return sb2.toString();
        } else if (i == 3) {
            char charAt3 = str.charAt(0);
            if (charAt3 < 'a' || charAt3 > 'z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] - ' ');
            return new String(charArray);
        } else if (i != 4) {
            return str;
        } else {
            char charAt4 = str.charAt(0);
            if (charAt4 < 'A' || charAt4 > 'Z') {
                return str;
            }
            char[] charArray2 = str.toCharArray();
            charArray2[0] = (char) (charArray2[0] + ' ');
            return new String(charArray2);
        }
    }
}
