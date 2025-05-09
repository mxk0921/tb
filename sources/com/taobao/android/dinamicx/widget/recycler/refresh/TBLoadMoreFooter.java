package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class TBLoadMoreFooter extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.k mPushLoadMoreListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum LoadMoreState {
        NONE,
        PUSH_TO_LOAD,
        RELEASE_TO_LOAD,
        LOADING;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LoadMoreState loadMoreState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBLoadMoreFooter$LoadMoreState");
        }

        public static LoadMoreState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadMoreState) ipChange.ipc$dispatch("47dbad0a", new Object[]{str});
            }
            return (LoadMoreState) Enum.valueOf(LoadMoreState.class, str);
        }
    }

    static {
        t2o.a(444597588);
    }

    public TBLoadMoreFooter(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLoadMoreFooter tBLoadMoreFooter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBLoadMoreFooter");
    }

    public abstract void changeToState(LoadMoreState loadMoreState);

    public abstract LoadMoreState getCurrentState();

    public abstract TextView getLoadMoreTipView();

    public abstract void setLoadMoreTipColor(int i);

    public abstract void setLoadMoreTips(String[] strArr);

    public abstract void setProgress(float f);

    public void setPushLoadMoreListener(TBSwipeRefreshLayout.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadf5f48", new Object[]{this, kVar});
        } else {
            this.mPushLoadMoreListener = kVar;
        }
    }
}
