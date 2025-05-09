package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface rud {
    void addFavoriteItem(String str, pud pudVar);

    void addFavoriteItemV2(String str, int i, Map map, Object obj, pud pudVar);

    void deleteFavoriteItem(String str, int i, Object obj, pud pudVar);

    void deleteFavoriteItem(String str, pud pudVar);

    void isFavoriteItem(String str, oud oudVar);

    void setBizCode(String str);
}
