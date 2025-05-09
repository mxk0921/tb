package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public @interface TBDrawType {
    public static final int BACKGROUND = 2;
    public static final int FOREGROUND_DRAWABLE = 1;
    public static final int FOREGROUND_TEXT = 0;
    public static final int UNSPECIFIED = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502267980);
        }

        public static String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7da1e767", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return "FOREGROUND_TEXT";
            }
            if (i == 1) {
                return "FOREGROUND_DRAWABLE";
            }
            if (i == 2) {
                return "BACKGROUND";
            }
            if (i != 3) {
                return "wtf unknown TBDrawType";
            }
            return "UNSPECIFIED";
        }
    }
}
