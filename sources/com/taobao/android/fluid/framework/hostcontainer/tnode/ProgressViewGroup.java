package com.taobao.android.fluid.framework.hostcontainer.tnode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ProgressViewGroup extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ProgressViewGroup";
    private Context mContext;
    private ProgressView mCurrentProgressView;
    private int mGap;
    private long mInterval;
    private int mItemHeight;
    private c mOnItemClickListener;
    private int mProgressCount;
    private List<ProgressView> mProgressViews;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (ProgressViewGroup.access$000(ProgressViewGroup.this) == null || ProgressViewGroup.access$000(ProgressViewGroup.this).size() == 0) {
                ProgressViewGroup.access$100(ProgressViewGroup.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7825a;

        public b(int i) {
            this.f7825a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (ProgressViewGroup.access$200(ProgressViewGroup.this) != null) {
                ProgressViewGroup.access$200(ProgressViewGroup.this).a(this.f7825a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(int i);
    }

    static {
        t2o.a(468714402);
    }

    public ProgressViewGroup(Context context) {
        super(context);
        initView(context);
    }

    public static /* synthetic */ List access$000(ProgressViewGroup progressViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca753496", new Object[]{progressViewGroup});
        }
        return progressViewGroup.mProgressViews;
    }

    public static /* synthetic */ void access$100(ProgressViewGroup progressViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb17f92", new Object[]{progressViewGroup});
        } else {
            progressViewGroup.relayoutChildren();
        }
    }

    public static /* synthetic */ c access$200(ProgressViewGroup progressViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9d772917", new Object[]{progressViewGroup});
        }
        return progressViewGroup.mOnItemClickListener;
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        setOrientation(0);
        this.mGap = pr9.c(this.mContext, 3);
        this.mItemHeight = pr9.c(this.mContext, 3);
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public static /* synthetic */ Object ipc$super(ProgressViewGroup progressViewGroup, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/ProgressViewGroup");
    }

    private void relayoutChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be61b2c3", new Object[]{this});
        } else if (this.mProgressCount > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0) {
                removeAllViews();
                this.mProgressViews = new ArrayList(this.mProgressCount);
                int i = this.mProgressCount;
                int max = Math.max((measuredWidth - ((i - 1) * this.mGap)) / i, 0);
                for (int i2 = 0; i2 < this.mProgressCount; i2++) {
                    ProgressView progressView = new ProgressView(this.mContext);
                    progressView.setDuration(this.mInterval);
                    progressView.setProgressHeight(this.mItemHeight);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.width = max;
                    layoutParams.height = measuredHeight;
                    layoutParams.rightMargin = this.mGap;
                    addView(progressView, layoutParams);
                    progressView.setOnClickListener(new b(i2));
                    this.mProgressViews.add(progressView);
                }
            }
        }
    }

    public void buildChildren(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce8d4ef", new Object[]{this, new Integer(i)});
        } else if (this.mProgressCount != i) {
            this.mProgressCount = i;
            relayoutChildren();
        }
    }

    public void pauseProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98afa14a", new Object[]{this});
            return;
        }
        ProgressView progressView = this.mCurrentProgressView;
        if (progressView != null) {
            progressView.pauseAnim();
        }
    }

    public void selectIndex(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692f9fae", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            startProgress(i, z, false);
        }
    }

    public void setInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af436", new Object[]{this, new Long(j)});
        } else {
            this.mInterval = j;
        }
    }

    public void setOnItemClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62f763", new Object[]{this, cVar});
        } else {
            this.mOnItemClickListener = cVar;
        }
    }

    public void startProgress(int i, boolean z, boolean z2) {
        List<ProgressView> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60fb74d", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (i >= 0 && (list = this.mProgressViews) != null && i < list.size()) {
            for (int i2 = 0; i2 < this.mProgressViews.size(); i2++) {
                ProgressView progressView = this.mProgressViews.get(i2);
                if (i2 < i) {
                    progressView.setProgressFull();
                } else if (i2 == i) {
                    if (z) {
                        progressView.setProgressFull();
                    } else if (z2) {
                        progressView.startAnim();
                    } else {
                        progressView.clearProgress();
                    }
                    this.mCurrentProgressView = progressView;
                } else {
                    progressView.clearProgress();
                }
            }
        }
    }

    public ProgressViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public void startProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a542c0d", new Object[]{this, new Integer(i)});
        } else {
            startProgress(i, false, true);
        }
    }
}
