package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    public float currSelectedMax;
    public float currSelectedMin;
    public float maxValue;
    public float minValue;
    public float rangeInterval;
    public int tickNumber;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Parcelable.Creator<SavedState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public SavedState createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SavedState) ipChange.ipc$dispatch("c044e25c", new Object[]{this, parcel});
            }
            return new SavedState(parcel, null);
        }

        /* renamed from: b */
        public SavedState[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SavedState[]) ipChange.ipc$dispatch("515f9cd3", new Object[]{this, new Integer(i)});
            }
            return new SavedState[i];
        }
    }

    static {
        t2o.a(468714027);
    }

    public /* synthetic */ SavedState(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.minValue);
        parcel.writeFloat(this.maxValue);
        parcel.writeFloat(this.rangeInterval);
        parcel.writeInt(this.tickNumber);
        parcel.writeFloat(this.currSelectedMin);
        parcel.writeFloat(this.currSelectedMax);
    }

    public SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private SavedState(Parcel parcel) {
        super(parcel);
        this.minValue = parcel.readFloat();
        this.maxValue = parcel.readFloat();
        this.rangeInterval = parcel.readFloat();
        this.tickNumber = parcel.readInt();
        this.currSelectedMin = parcel.readFloat();
        this.currSelectedMax = parcel.readFloat();
    }
}
