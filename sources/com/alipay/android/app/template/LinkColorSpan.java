package com.alipay.android.app.template;

import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LinkColorSpan extends CharacterStyle implements UpdateAppearance, ParcelableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f3525a;

    public LinkColorSpan(int i) {
        this.f3525a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.text.ParcelableSpan
    public int getSpanTypeId() {
        return 0;
    }

    public int getSpanTypeIdInternal() {
        return 7;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.linkColor = this.f3525a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcelInternal(parcel, i);
    }

    public void writeToParcelInternal(Parcel parcel, int i) {
        parcel.writeInt(this.f3525a);
    }

    public LinkColorSpan(Parcel parcel) {
        this.f3525a = parcel.readInt();
    }
}
