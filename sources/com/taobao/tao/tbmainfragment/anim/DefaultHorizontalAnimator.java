package com.taobao.tao.tbmainfragment.anim;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultHorizontalAnimator extends FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<DefaultHorizontalAnimator> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<DefaultHorizontalAnimator> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public DefaultHorizontalAnimator createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultHorizontalAnimator) ipChange.ipc$dispatch("373053a8", new Object[]{this, parcel});
            }
            return new DefaultHorizontalAnimator(parcel);
        }

        /* renamed from: b */
        public DefaultHorizontalAnimator[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultHorizontalAnimator[]) ipChange.ipc$dispatch("89681cd1", new Object[]{this, new Integer(i)});
            }
            return new DefaultHorizontalAnimator[i];
        }
    }

    static {
        t2o.a(775946400);
    }

    public DefaultHorizontalAnimator() {
        this.enter = R.anim.h_fragment_enter;
        this.exit = R.anim.h_fragment_exit;
        this.popEnter = R.anim.h_fragment_pop_enter;
        this.popExit = R.anim.h_fragment_pop_exit;
    }

    @Override // com.taobao.tao.tbmainfragment.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.taobao.tao.tbmainfragment.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public DefaultHorizontalAnimator(Parcel parcel) {
        super(parcel);
    }
}
