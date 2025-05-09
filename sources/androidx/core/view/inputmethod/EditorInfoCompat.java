package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.Preconditions;
import anet.channel.entity.EventType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EditorInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    public static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    public static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    private static final String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("81f864b2", new Object[]{editorInfo, new Integer(i)});
            }
            return editorInfo.getInitialSelectedText(i);
        }

        public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("c3664a80", new Object[]{editorInfo, new Integer(i), new Integer(i2)});
            }
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("7263e8f9", new Object[]{editorInfo, new Integer(i), new Integer(i2)});
            }
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60054e39", new Object[]{editorInfo, charSequence, new Integer(i)});
            } else {
                editorInfo.setInitialSurroundingSubText(charSequence, i);
            }
        }
    }

    public static String[] getContentMimeTypes(EditorInfo editorInfo) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fee658de", new Object[]{editorInfo});
        }
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : EMPTY_STRING_ARRAY;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return EMPTY_STRING_ARRAY;
        }
        String[] stringArray = bundle.getStringArray(CONTENT_MIME_TYPES_KEY);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(CONTENT_MIME_TYPES_INTEROP_KEY);
        }
        return stringArray != null ? stringArray : EMPTY_STRING_ARRAY;
    }

    public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("81f864b2", new Object[]{editorInfo, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialSelectedText(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int i4 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        if ((i & 1) != 0) {
            return charSequence.subSequence(i2, i3);
        }
        return TextUtils.substring(charSequence, i2, i3);
    }

    public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("c3664a80", new Object[]{editorInfo, new Integer(i), new Integer(i2)});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextAfterCursor(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int min = Math.min(i, charSequence.length() - i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, min + i3);
        }
        return TextUtils.substring(charSequence, i3, min + i3);
    }

    public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("7263e8f9", new Object[]{editorInfo, new Integer(i), new Integer(i2)});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextBeforeCursor(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int min = Math.min(i, i3);
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3 - min, i3);
        }
        return TextUtils.substring(charSequence, i3 - min, i3);
    }

    public static int getProtocol(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c8927d6", new Object[]{editorInfo})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(CONTENT_MIME_TYPES_KEY);
        boolean containsKey2 = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_INTEROP_KEY);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (containsKey2) {
            return 2;
        }
        return 0;
    }

    private static boolean isCutOnSurrogate(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5240c9f0", new Object[]{charSequence, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static boolean isPasswordInputType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6babc901", new Object[]{new Integer(i)})).booleanValue();
        }
        int i2 = i & EventType.ALL;
        if (i2 == 129 || i2 == 225 || i2 == 18) {
            return true;
        }
        return false;
    }

    public static boolean isStylusHandwritingEnabled(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7416b85", new Object[]{editorInfo})).booleanValue();
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(STYLUS_HANDWRITING_ENABLED_KEY);
    }

    public static void setContentMimeTypes(EditorInfo editorInfo, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3fcfc", new Object[]{editorInfo, strArr});
        } else if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_KEY, strArr);
            editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_INTEROP_KEY, strArr);
        }
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60054e39", new Object[]{editorInfo, charSequence, new Integer(i)});
            return;
        }
        Preconditions.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i2 = i5 - i;
        } else {
            i2 = i4 - i;
        }
        if (i4 > i5) {
            i3 = i4 - i;
        } else {
            i3 = i5 - i;
        }
        int length = charSequence.length();
        if (i < 0 || i2 < 0 || i3 > length) {
            setSurroundingText(editorInfo, null, 0, 0);
        } else if (isPasswordInputType(editorInfo.inputType)) {
            setSurroundingText(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i2, i3);
        } else {
            trimLongSurroundingText(editorInfo, charSequence, i2, i3);
        }
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c0c366", new Object[]{editorInfo, charSequence});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1299b8ab", new Object[]{editorInfo, new Boolean(z)});
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(STYLUS_HANDWRITING_ENABLED_KEY, z);
    }

    private static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b38626", new Object[]{editorInfo, charSequence, new Integer(i), new Integer(i2)});
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, spannableStringBuilder);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i2);
    }

    private static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence charSequence2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b099882", new Object[]{editorInfo, charSequence, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = i2 - i;
        if (i4 > 1024) {
            i3 = 0;
        } else {
            i3 = i4;
        }
        int i5 = 2048 - i3;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (isCutOnSurrogate(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (isCutOnSurrogate(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i3 + min;
        if (i3 != i4) {
            charSequence2 = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        setSurroundingText(editorInfo, charSequence2, min2, i3 + min2);
    }
}
