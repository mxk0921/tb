package com.taobao.message.kit.provider;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IMPLocalizedProvider {
    void batchTranslate(List<String> list, TranslateCallback<List<String>> translateCallback);

    String formatDate(long j);

    String formatDateTime(long j);

    String getCountry();

    String getLanguage();

    String getLanguageCountry();

    String getLanguageTag();

    String getLocation();

    int getMPLanguage();

    boolean isI18nEdition();

    boolean isSimplifiedChinese();

    String localizedExpressionText(String str);

    String localizedString(int i);

    String localizedString(String str);

    void setLocale(int i, String str);

    void translate(String str, TranslateCallback<String> translateCallback);
}
