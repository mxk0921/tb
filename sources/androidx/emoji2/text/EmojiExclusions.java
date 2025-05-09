package androidx.emoji2.text;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EmojiExclusions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiExclusions_Api34 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private EmojiExclusions_Api34() {
        }

        public static Set<int[]> getExclusions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("6984dbd1", new Object[0]);
            }
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiExclusions_Reflections {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private EmojiExclusions_Reflections() {
        }

        public static Set<int[]> getExclusions() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    private EmojiExclusions() {
    }

    public static Set<int[]> getEmojiExclusions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("40c4b80b", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return EmojiExclusions_Api34.getExclusions();
        }
        return EmojiExclusions_Reflections.getExclusions();
    }
}
