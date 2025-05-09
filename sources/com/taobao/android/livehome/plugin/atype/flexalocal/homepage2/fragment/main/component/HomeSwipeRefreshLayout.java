package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.b0h;
import tb.oqc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeSwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = HomeSwipeRefreshLayout.class.getSimpleName();
    private b0h mLiveHomeContext;
    private oqc mRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            if (HomeSwipeRefreshLayout.access$100(HomeSwipeRefreshLayout.this) != null) {
                HomeSwipeRefreshLayout.access$100(HomeSwipeRefreshLayout.this).onPullDistance(i);
            }
            String access$000 = HomeSwipeRefreshLayout.access$000();
            TLog.loge(access$000, "initRefreshLayout onPullDistance：" + i);
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            } else {
                TLog.loge(HomeSwipeRefreshLayout.access$000(), "initRefreshLayout onRefresh");
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            String access$000 = HomeSwipeRefreshLayout.access$000();
            TLog.loge(access$000, "initRefreshLayout onRefreshStateChanged，old：" + refreshState + "，new：" + refreshState2);
            if (refreshState2 == TBRefreshHeader.RefreshState.REFRESHING && HomeSwipeRefreshLayout.access$200(HomeSwipeRefreshLayout.this) != null && HomeSwipeRefreshLayout.access$200(HomeSwipeRefreshLayout.this).l() != null) {
                HomeSwipeRefreshLayout.access$200(HomeSwipeRefreshLayout.this).l().v();
            }
        }
    }

    static {
        t2o.a(310378750);
    }

    public HomeSwipeRefreshLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ oqc access$100(HomeSwipeRefreshLayout homeSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqc) ipChange.ipc$dispatch("183309d7", new Object[]{homeSwipeRefreshLayout});
        }
        return homeSwipeRefreshLayout.mRefreshListener;
    }

    public static /* synthetic */ b0h access$200(HomeSwipeRefreshLayout homeSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("add3b882", new Object[]{homeSwipeRefreshLayout});
        }
        return homeSwipeRefreshLayout.mLiveHomeContext;
    }

    public static /* synthetic */ Object ipc$super(HomeSwipeRefreshLayout homeSwipeRefreshLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeSwipeRefreshLayout");
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setMaxPushDistance(100);
        enablePullRefresh(true);
        if (getRefresHeader() != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
            if (getRefresHeader() != null) {
                getRefresHeader().setBackgroundColor(Color.parseColor("#00000000"));
                getRefresHeader().setLayoutParams(layoutParams);
            }
        }
        setOnPullRefreshListener(new a());
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setLiveHomeContext(b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e78edcc", new Object[]{this, b0hVar});
        } else {
            this.mLiveHomeContext = b0hVar;
        }
    }

    public void setRefreshListener(oqc oqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aead3791", new Object[]{this, oqcVar});
        } else {
            this.mRefreshListener = oqcVar;
        }
    }

    public HomeSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
