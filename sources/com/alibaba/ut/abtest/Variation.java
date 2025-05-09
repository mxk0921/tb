package com.alibaba.ut.abtest;

import android.os.Parcelable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface Variation extends Parcelable {
    String getName();

    Object getValue(Object obj);

    boolean getValueAsBoolean(boolean z);

    double getValueAsDouble(double d);

    float getValueAsFloat(float f);

    int getValueAsInt(int i);

    long getValueAsLong(long j);

    short getValueAsShort(short s);

    String getValueAsString(String str);
}
