package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class TBRefreshHeader extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.OnPullRefreshListener mPullRefreshListener;
    public RefreshState mState = RefreshState.NONE;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.refresh.TBRefreshHeader$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState;

        static {
            int[] iArr = new int[RefreshState.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState = iArr;
            try {
                iArr[RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum RefreshHeaderStyle {
        NORMAL,
        DARK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RefreshHeaderStyle refreshHeaderStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBRefreshHeader$RefreshHeaderStyle");
        }

        public static RefreshHeaderStyle valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RefreshHeaderStyle) ipChange.ipc$dispatch("daad829e", new Object[]{str});
            }
            return (RefreshHeaderStyle) Enum.valueOf(RefreshHeaderStyle.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum RefreshState {
        NONE,
        PULL_TO_REFRESH,
        RELEASE_TO_REFRESH,
        REFRESHING,
        PREPARE_TO_SECOND_FLOOR,
        SECOND_FLOOR_START,
        SECOND_FLOOR_END;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RefreshState refreshState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBRefreshHeader$RefreshState");
        }

        public static RefreshState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RefreshState) ipChange.ipc$dispatch("f600d811", new Object[]{str});
            }
            return (RefreshState) Enum.valueOf(RefreshState.class, str);
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            switch (AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[ordinal()]) {
                case 1:
                    return "NONE";
                case 2:
                    return "PULL_TO_REFRESH";
                case 3:
                    return "RELEASE_TO_REFRESH";
                case 4:
                    return "REFRESHING";
                case 5:
                    return "PREPARE_TO_SECOND_FLOOR";
                case 6:
                    return "SECOND_FLOOR_START";
                case 7:
                    return "SECOND_FLOOR_END";
                default:
                    return "";
            }
        }
    }

    static {
        t2o.a(932184116);
    }

    public TBRefreshHeader(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBRefreshHeader tBRefreshHeader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/refresh/TBRefreshHeader");
    }

    public abstract void changeToState(RefreshState refreshState);

    public RefreshState getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshState) ipChange.ipc$dispatch("89567db5", new Object[]{this});
        }
        return this.mState;
    }

    public abstract View getRefreshView();

    public abstract View getSecondFloorView();

    public abstract void setProgress(float f);

    public void setPullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f373e3", new Object[]{this, onPullRefreshListener});
        } else {
            this.mPullRefreshListener = onPullRefreshListener;
        }
    }

    public abstract void setRefreshAnimation(String[] strArr, String str);

    public abstract void setRefreshTipColor(int i);

    public abstract void setRefreshTips(String[] strArr);

    public abstract void setSecondFloorView(View view);

    public void switchStyle(RefreshHeaderStyle refreshHeaderStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbda9585", new Object[]{this, refreshHeaderStyle});
        }
    }
}
