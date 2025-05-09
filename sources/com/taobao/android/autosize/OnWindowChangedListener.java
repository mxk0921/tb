package com.taobao.android.autosize;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface OnWindowChangedListener {
    public static final int REASON_DENSITY = 4;
    public static final int REASON_FORCE_REFRESH = 8;
    public static final int REASON_ORIENTATION = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_WINDOW_SIZE = 1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface WindowChangeReason {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6410a;
        public int b;
        public int c;
        public int d;
        public int e;
        public float f;
        public WindowType g;
        public int h;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ConfigChangedEvent{changeReason=" + this.f6410a + ", widthDp=" + this.b + ", heightDp=" + this.c + ", widthPx=" + this.d + ", heightPx=" + this.e + ", scalingRatio=" + this.f + ", windowType=" + this.g + ", orientation=" + this.h + '}';
        }
    }

    void a(a aVar);
}
