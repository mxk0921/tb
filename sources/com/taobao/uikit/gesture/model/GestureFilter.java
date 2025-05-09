package com.taobao.uikit.gesture.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class GestureFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String mActivityName;
    public final int mGestureType;
    public final String mUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mActivityName;
        public int mGestureType;
        public String mUrl;

        static {
            t2o.a(933232673);
        }

        private boolean checkValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            if ((this.mActivityName == null && this.mUrl == null) || this.mGestureType == 0) {
                return false;
            }
            return true;
        }

        public GestureFilter build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GestureFilter) ipChange.ipc$dispatch("92abe19b", new Object[]{this});
            }
            if (checkValid()) {
                return new GestureFilter(this.mActivityName, this.mUrl, this.mGestureType);
            }
            return null;
        }

        public Builder setActivityName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ecfc3b4c", new Object[]{this, str});
            }
            this.mActivityName = str;
            return this;
        }

        public Builder setGestureType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e719fbe", new Object[]{this, new Integer(i)});
            }
            this.mGestureType = i;
            return this;
        }

        public Builder setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("933f84bb", new Object[]{this, str});
            }
            this.mUrl = str;
            return this;
        }
    }

    static {
        t2o.a(933232671);
    }

    public boolean matchContext(GestureContext gestureContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb3a962", new Object[]{this, gestureContext})).booleanValue();
        }
        if (gestureContext == null) {
            return false;
        }
        return TextUtils.equals(this.mActivityName, gestureContext.getActivityName());
    }

    public boolean matchGesture(GestureEvent gestureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac90cd7d", new Object[]{this, gestureEvent})).booleanValue();
        }
        if (this.mGestureType == gestureEvent.gestureType) {
            return true;
        }
        return false;
    }

    private GestureFilter(String str, String str2, int i) {
        this.mActivityName = str;
        this.mUrl = str2;
        this.mGestureType = i;
    }
}
