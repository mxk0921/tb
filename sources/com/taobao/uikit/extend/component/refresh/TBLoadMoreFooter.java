package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class TBLoadMoreFooter extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.OnPushLoadMoreListener mPushLoadMoreListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum LoadMoreState {
        NONE,
        PUSH_TO_LOAD,
        RELEASE_TO_LOAD,
        LOADING;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LoadMoreState loadMoreState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBLoadMoreFooter$LoadMoreState");
        }

        public static LoadMoreState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadMoreState) ipChange.ipc$dispatch("e539cabb", new Object[]{str});
            }
            return (LoadMoreState) Enum.valueOf(LoadMoreState.class, str);
        }
    }

    static {
        t2o.a(932184112);
    }

    public TBLoadMoreFooter(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLoadMoreFooter tBLoadMoreFooter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBLoadMoreFooter");
    }

    public abstract void changeToState(LoadMoreState loadMoreState);

    public abstract LoadMoreState getCurrentState();

    public abstract TextView getLoadMoreTipView();

    public abstract void setLoadMoreTipColor(int i);

    public abstract void setLoadMoreTips(String[] strArr);

    public abstract void setProgress(float f);

    public void setPushLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40699777", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mPushLoadMoreListener = onPushLoadMoreListener;
        }
    }
}
