package org.tensorflow.contrib.tmall.sqlite;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface Cursor {
    void close();

    int getColumnCount();

    int getColumnIndex(String str);

    int getCount();

    float getFloat(int i);

    int getInt(int i);

    long getLong(int i);

    String getString(int i);

    boolean moveToNext();
}
