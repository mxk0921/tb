package com.taobao.tao.tbmainfragment.anim;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<FragmentAnimator> CREATOR = new a();
    protected int enter;
    protected int exit;
    protected int popEnter;
    protected int popExit;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<FragmentAnimator> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FragmentAnimator createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentAnimator) ipChange.ipc$dispatch("9db0106b", new Object[]{this, parcel});
            }
            return new FragmentAnimator(parcel);
        }

        /* renamed from: b */
        public FragmentAnimator[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentAnimator[]) ipChange.ipc$dispatch("dd1ea522", new Object[]{this, new Integer(i)});
            }
            return new FragmentAnimator[i];
        }
    }

    static {
        t2o.a(775946402);
    }

    public FragmentAnimator() {
    }

    public FragmentAnimator copy() {
        return new FragmentAnimator(getEnter(), getExit(), getPopEnter(), getPopExit());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEnter() {
        return this.enter;
    }

    public int getExit() {
        return this.exit;
    }

    public int getPopEnter() {
        return this.popEnter;
    }

    public int getPopExit() {
        return this.popExit;
    }

    public FragmentAnimator setEnter(int i) {
        this.enter = i;
        return this;
    }

    public FragmentAnimator setExit(int i) {
        this.exit = i;
        return this;
    }

    public FragmentAnimator setPopEnter(int i) {
        this.popEnter = i;
        return this;
    }

    public FragmentAnimator setPopExit(int i) {
        this.popExit = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enter);
        parcel.writeInt(this.exit);
        parcel.writeInt(this.popEnter);
        parcel.writeInt(this.popExit);
    }

    public FragmentAnimator(int i, int i2) {
        this.enter = i;
        this.exit = i2;
    }

    public FragmentAnimator(int i, int i2, int i3, int i4) {
        this.enter = i;
        this.exit = i2;
        this.popEnter = i3;
        this.popExit = i4;
    }

    public FragmentAnimator(Parcel parcel) {
        this.enter = parcel.readInt();
        this.exit = parcel.readInt();
        this.popEnter = parcel.readInt();
        this.popExit = parcel.readInt();
    }
}
