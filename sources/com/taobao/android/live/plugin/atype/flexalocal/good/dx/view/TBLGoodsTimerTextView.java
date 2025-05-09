package com.taobao.android.live.plugin.atype.flexalocal.good.dx.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.pfa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLGoodsTimerTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLGoodsTimerTextView";
    private b mIOnTimeListener;
    private long mStartTime;
    private final Handler mHandler = new Handler();
    private final Runnable mTimerTask = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TBLGoodsTimerTextView> f8493a;

        static {
            t2o.a(295698998);
        }

        @Override // java.lang.Runnable
        public void run() {
            b access$100;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f8493a.get() != null && (access$100 = TBLGoodsTimerTextView.access$100(this.f8493a.get())) != null) {
                access$100.a();
            }
        }

        private c(TBLGoodsTimerTextView tBLGoodsTimerTextView) {
            this.f8493a = new WeakReference<>(tBLGoodsTimerTextView);
        }
    }

    static {
        t2o.a(295698995);
    }

    public TBLGoodsTimerTextView(Context context) {
        super(context);
    }

    public static /* synthetic */ b access$100(TBLGoodsTimerTextView tBLGoodsTimerTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ffec5f79", new Object[]{tBLGoodsTimerTextView});
        }
        return tBLGoodsTimerTextView.mIOnTimeListener;
    }

    public static /* synthetic */ Object ipc$super(TBLGoodsTimerTextView tBLGoodsTimerTextView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/view/TBLGoodsTimerTextView");
    }

    public void setIOnTimeListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3d342e", new Object[]{this, bVar});
        } else {
            this.mIOnTimeListener = bVar;
        }
    }

    public void startCountDown(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa20c06e", new Object[]{this, new Long(j)});
            return;
        }
        this.mHandler.removeCallbacks(this.mTimerTask);
        this.mStartTime = j;
        long m = pfa.m();
        if (m > 0 && m <= j) {
            this.mHandler.postDelayed(this.mTimerTask, j - m);
        }
    }

    public void stopCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d27976", new Object[]{this});
        } else {
            this.mHandler.removeCallbacks(this.mTimerTask);
        }
    }

    public TBLGoodsTimerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBLGoodsTimerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
