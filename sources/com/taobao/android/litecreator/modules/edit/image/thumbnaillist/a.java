package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview;
import java.util.List;
import tb.i0e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface a {
    void addItems(List<ThumbnailItem> list);

    void destroy();

    List<ThumbnailItem> getItems();

    void notifyDataChanged();

    void removeItem(int i);

    void setIThumbnailCallback(i0e i0eVar);

    void setItems(List<ThumbnailItem> list, ThumbnailRecyclerview.d dVar);

    void setSelectedIndex(int i);

    void updateCorrespondingItem(int i);
}
