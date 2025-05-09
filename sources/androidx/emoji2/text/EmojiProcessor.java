package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private EmojiCompat.GlyphChecker mGlyphChecker;
    private final MetadataRepo mMetadataRepo;
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CodepointIndexFinder {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bedec25a", new Object[]{charSequence, new Integer(i), new Integer(i2)})).intValue();
            }
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i >= 0) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6bda2eaa", new Object[]{charSequence, new Integer(i), new Integer(i2)})).intValue();
            }
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i < length) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i++;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            i++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            i++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EmojiCompat.SpanFactory mSpanFactory;
        public UnprecomputeTextOnModificationSpannable spannable;

        public EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e6b4897", new Object[]{this, charSequence, new Integer(i), new Integer(i2), typefaceEmojiRasterizer})).booleanValue();
            }
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof Spannable) {
                    spannable = (Spannable) charSequence;
                } else {
                    spannable = new SpannableString(charSequence);
                }
                this.spannable = new UnprecomputeTextOnModificationSpannable(spannable);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UnprecomputeTextOnModificationSpannable) ipChange.ipc$dispatch("357f2327", new Object[]{this}) : this.spannable;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        public EmojiProcessLookupCallback(int i) {
            this.mOffset = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EmojiProcessLookupCallback) ipChange.ipc$dispatch("aa09f390", new Object[]{this}) : this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e6b4897", new Object[]{this, charSequence, new Integer(i), new Integer(i2), typefaceEmojiRasterizer})).booleanValue();
            }
            int i3 = this.mOffset;
            if (i <= i3 && i3 < i2) {
                this.start = i;
                this.end = i2;
                return false;
            } else if (i2 <= i3) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mExclusion;

        public MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MarkExclusionCallback) ipChange.ipc$dispatch("21769c18", new Object[]{this}) : this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e6b4897", new Object[]{this, charSequence, new Integer(i), new Integer(i2), typefaceEmojiRasterizer})).booleanValue();
            }
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr, Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3261d65", new Object[]{editable, keyEvent, new Boolean(z)})).booleanValue();
        }
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf81197", new Object[]{inputConnection, editable, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
        }
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i, 0));
                i3 = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(i4, i3, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean handleOnKeyDown(Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab82bff7", new Object[]{editable, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 67) {
            z = delete(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = delete(editable, keyEvent, true);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean hasGlyph(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790b6e4b", new Object[]{this, charSequence, new Integer(i), new Integer(i2), typefaceEmojiRasterizer})).booleanValue();
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i, i2, typefaceEmojiRasterizer.getSdkAdded()));
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
            return true;
        }
        return false;
    }

    private static boolean hasInvalidSelection(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe39ffa", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == -1 || i2 == -1 || i != i2) {
            return true;
        }
        return false;
    }

    private static boolean hasModifiers(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37a00417", new Object[]{keyEvent})).booleanValue();
        }
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(Set<int[]> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736a17a3", new Object[]{this, set});
        } else if (!set.isEmpty()) {
            for (int[] iArr : set) {
                String str = new String(iArr, 0, iArr.length);
                process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }

    public int getEmojiEnd(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("851327e0", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, 1 + i, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i))).end;
    }

    public int getEmojiMatch(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c69fb3", new Object[]{this, charSequence})).intValue() : getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    public int getEmojiStart(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ef661b9", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, 1 + i, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i))).start;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:11:0x0054, B:14:0x0059, B:16:0x005d, B:18:0x006a, B:22:0x0075, B:24:0x007f, B:26:0x0087, B:28:0x008a, B:30:0x008e, B:32:0x009a, B:33:0x009d, B:36:0x00ac, B:42:0x00ba, B:44:0x00cb, B:46:0x00e1), top: B:59:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:11:0x0054, B:14:0x0059, B:16:0x005d, B:18:0x006a, B:22:0x0075, B:24:0x007f, B:26:0x0087, B:28:0x008a, B:30:0x008e, B:32:0x009a, B:33:0x009d, B:36:0x00ac, B:42:0x00ba, B:44:0x00cb, B:46:0x00e1), top: B:59:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence process(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ProcessorSm {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(MetadataRepo.Node node, boolean z, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isTextStyle(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8191d26", new Object[]{new Integer(i)})).booleanValue();
            }
            if (i == 65038) {
                return true;
            }
            return false;
        }

        private int reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("788e6249", new Object[]{this})).intValue();
            }
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        public TypefaceEmojiRasterizer getCurrentMetadata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypefaceEmojiRasterizer) ipChange.ipc$dispatch("21838be7", new Object[]{this});
            }
            return this.mCurrentNode.getData();
        }

        public TypefaceEmojiRasterizer getFlushMetadata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypefaceEmojiRasterizer) ipChange.ipc$dispatch("f3b3a23c", new Object[]{this});
            }
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bef6062d", new Object[]{this})).booleanValue();
            }
            if (this.mState != 2 || this.mCurrentNode.getData() == null) {
                return false;
            }
            if (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                return true;
            }
            return false;
        }

        private static boolean isEmojiStyle(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f646f6ab", new Object[]{new Integer(i)})).booleanValue();
            }
            return i == 65039;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d83c4542", new Object[]{this})).booleanValue();
            }
            if (!this.mCurrentNode.getData().isDefaultEmoji() && !isEmojiStyle(this.mLastCodepoint)) {
                return this.mUseEmojiAsDefaultStyle && (this.mEmojiAsDefaultStyleExceptions == null || Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0);
            }
            return true;
        }

        public int check(int i) {
            int i2 = 2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("de457f47", new Object[]{this, new Integer(i)})).intValue();
            }
            MetadataRepo.Node node = this.mCurrentNode.get(i);
            if (this.mState != 2) {
                if (node == null) {
                    i2 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i)) {
                i2 = reset();
            } else if (!isEmojiStyle(i)) {
                if (this.mCurrentNode.getData() != null) {
                    if (this.mCurrentDepth != 1) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        i2 = reset();
                    }
                    i2 = 3;
                } else {
                    i2 = reset();
                }
            }
            this.mLastCodepoint = i;
            return i2;
        }
    }

    public int getEmojiMatch(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("530dcb36", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int check = processorSm.check(codePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check == 1) {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            } else if (check == 2) {
                i2 += Character.charCount(codePointAt);
            } else if (check == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i) {
                    i3++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    private <T> T process(CharSequence charSequence, int i, int i2, int i3, boolean z, EmojiProcessCallback<T> emojiProcessCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4c2b0b79", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), emojiProcessCallback});
        }
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int i4 = i;
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        while (i < i2 && i5 < i3 && z2) {
            int check = processorSm.check(codePointAt);
            if (check == 1) {
                i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                if (i4 < i2) {
                    codePointAt = Character.codePointAt(charSequence, i4);
                }
                i = i4;
            } else if (check == 2) {
                i += Character.charCount(codePointAt);
                if (i < i2) {
                    codePointAt = Character.codePointAt(charSequence, i);
                }
            } else if (check == 3) {
                if (z || !hasGlyph(charSequence, i4, i, processorSm.getFlushMetadata())) {
                    z2 = emojiProcessCallback.handleEmoji(charSequence, i4, i, processorSm.getFlushMetadata());
                    i5++;
                }
                i4 = i;
            }
        }
        if (processorSm.isInFlushableState() && i5 < i3 && z2 && (z || !hasGlyph(charSequence, i4, i, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i4, i, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
