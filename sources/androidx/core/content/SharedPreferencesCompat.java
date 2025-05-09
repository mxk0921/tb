package androidx.core.content;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SharedPreferencesCompat {

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class EditorCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static EditorCompat sInstance;
        private final Helper mHelper = new Helper();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Helper {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void apply(SharedPreferences.Editor editor) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1ae59190", new Object[]{this, editor});
                    return;
                }
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private EditorCompat() {
        }

        @Deprecated
        public static EditorCompat getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EditorCompat) ipChange.ipc$dispatch("488efd35", new Object[0]);
            }
            if (sInstance == null) {
                sInstance = new EditorCompat();
            }
            return sInstance;
        }

        @Deprecated
        public void apply(SharedPreferences.Editor editor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ae59190", new Object[]{this, editor});
            } else {
                this.mHelper.apply(editor);
            }
        }
    }

    private SharedPreferencesCompat() {
    }
}
