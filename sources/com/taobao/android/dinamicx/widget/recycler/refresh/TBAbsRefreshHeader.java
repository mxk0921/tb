package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class TBAbsRefreshHeader extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.j mPullRefreshListener;
    public RefreshState mState = RefreshState.NONE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RefreshHeaderStyle {
        NORMAL,
        DARK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RefreshHeaderStyle refreshHeaderStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBAbsRefreshHeader$RefreshHeaderStyle");
        }

        public static RefreshHeaderStyle valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RefreshHeaderStyle) ipChange.ipc$dispatch("b2514a0d", new Object[]{str});
            }
            return (RefreshHeaderStyle) Enum.valueOf(RefreshHeaderStyle.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBAbsRefreshHeader$RefreshState");
        }

        public static RefreshState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RefreshState) ipChange.ipc$dispatch("a82e9ec0", new Object[]{str});
            }
            return (RefreshState) Enum.valueOf(RefreshState.class, str);
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            switch (a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[ordinal()]) {
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState;

        static {
            int[] iArr = new int[RefreshState.values().length];
            $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState = iArr;
            try {
                iArr[RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$refresh$TBAbsRefreshHeader$RefreshState[RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        t2o.a(444597582);
    }

    public TBAbsRefreshHeader(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBAbsRefreshHeader tBAbsRefreshHeader, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBAbsRefreshHeader");
    }

    public abstract void changeToState(RefreshState refreshState);

    public RefreshState getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshState) ipChange.ipc$dispatch("8c02439c", new Object[]{this});
        }
        return this.mState;
    }

    public abstract View getRefreshView();

    public abstract View getSecondFloorView();

    public abstract void setProgress(float f);

    public void setPullRefreshListener(TBSwipeRefreshLayout.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7625b2", new Object[]{this, jVar});
        } else {
            this.mPullRefreshListener = jVar;
        }
    }

    public abstract void setRefreshAnimation(String[] strArr, String str);

    public abstract void setRefreshTipColor(int i);

    public abstract void setRefreshTips(String[] strArr);

    public abstract void setSecondFloorView(View view);

    public void switchStyle(RefreshHeaderStyle refreshHeaderStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33155d40", new Object[]{this, refreshHeaderStyle});
        }
    }
}
