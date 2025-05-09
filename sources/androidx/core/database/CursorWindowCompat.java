package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CursorWindowCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static CursorWindow createCursorWindow(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CursorWindow) ipChange.ipc$dispatch("c4b093c8", new Object[]{str, new Long(j)});
            }
            return new CursorWindow(str, j);
        }
    }

    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CursorWindow) ipChange.ipc$dispatch("5339b90e", new Object[]{str, new Long(j)});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createCursorWindow(str, j);
        }
        return new CursorWindow(str);
    }
}
