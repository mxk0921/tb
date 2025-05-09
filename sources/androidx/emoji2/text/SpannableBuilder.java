package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpannableBuilder extends SpannableStringBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Class<?> mWatcherClass;
    private final List<WatcherWrapper> mWatchers = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WatcherWrapper implements TextWatcher, SpanWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger mBlockCalls = new AtomicInteger(0);
        public final Object mObject;

        public WatcherWrapper(Object obj) {
            this.mObject = obj;
        }

        private boolean isEmojiSpan(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2fb57acd", new Object[]{this, obj})).booleanValue();
            }
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            } else {
                ((TextWatcher) this.mObject).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                ((TextWatcher) this.mObject).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        public final void blockCalls() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55698dcf", new Object[]{this});
            } else {
                this.mBlockCalls.incrementAndGet();
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd069bcd", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            } else if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3491016d", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            } else if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                ((TextWatcher) this.mObject).onTextChanged(charSequence, i, i2, i3);
            }
        }

        public final void unblockCalls() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95b9ca8", new Object[]{this});
            } else {
                this.mBlockCalls.decrementAndGet();
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3db47e1", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i = i;
                        i5 = 0;
                        ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i, i2, i5, i4);
                    }
                }
                i5 = i3;
                ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i, i2, i5, i4);
            }
        }
    }

    public SpannableBuilder(Class<?> cls) {
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    public static SpannableBuilder create(Class<?> cls, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableBuilder) ipChange.ipc$dispatch("967d622d", new Object[]{cls, charSequence});
        }
        return new SpannableBuilder(cls, charSequence);
    }

    private void fireWatchers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54999894", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    private WatcherWrapper getWatcherFor(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WatcherWrapper) ipChange.ipc$dispatch("c7d89ae6", new Object[]{this, obj});
        }
        for (int i = 0; i < this.mWatchers.size(); i++) {
            WatcherWrapper watcherWrapper = this.mWatchers.get(i);
            if (watcherWrapper.mObject == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(SpannableBuilder spannableBuilder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1845627361:
                return super.append(((Character) objArr[0]).charValue());
            case -1778409022:
                return super.replace(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (CharSequence) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            case -1617729238:
                return super.insert(((Number) objArr[0]).intValue(), (CharSequence) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            case -1453420699:
                return super.append((CharSequence) objArr[0], objArr[1], ((Number) objArr[2]).intValue());
            case -1046278700:
                super.setSpan(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -493084235:
                return super.delete(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            case -196743171:
                return new Integer(super.getSpanFlags(objArr[0]));
            case 175185816:
                return new Integer(super.getSpanStart(objArr[0]));
            case 190569297:
                return new Integer(super.getSpanEnd(objArr[0]));
            case 195705873:
                super.removeSpan(objArr[0]);
                return null;
            case 210642696:
                return super.append((CharSequence) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            case 373373079:
                return new Integer(super.nextSpanTransition(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Class) objArr[2]));
            case 404796706:
                return super.replace(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (CharSequence) objArr[2]);
            case 860829322:
                return super.insert(((Number) objArr[0]).intValue(), (CharSequence) objArr[1]);
            case 1223474308:
                return super.getSpans(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Class) objArr[2]);
            case 1492898792:
                return super.append((CharSequence) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/SpannableBuilder");
        }
    }

    private boolean isWatcher(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dd95059", new Object[]{this, obj})).booleanValue() : obj != null && isWatcher(obj.getClass());
    }

    private void unblockwatchers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61061ed2", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).unblockCalls();
        }
    }

    public void beginBatchEdit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40a10c2", new Object[]{this});
        } else {
            blockWatchers();
        }
    }

    public void endBatchEdit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca861d0", new Object[]{this});
            return;
        }
        unblockwatchers();
        fireWatchers();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        WatcherWrapper watcherFor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5bdb51", new Object[]{this, obj})).intValue();
        }
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        WatcherWrapper watcherFor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f445effd", new Object[]{this, obj})).intValue();
        }
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        WatcherWrapper watcherFor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a711f98", new Object[]{this, obj})).intValue();
        }
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (!isWatcher((Class<?>) cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i, i2, WatcherWrapper.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length));
        for (int i3 = 0; i3 < watcherWrapperArr.length; i3++) {
            tArr[i3] = watcherWrapperArr[i3].mObject;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16413897", new Object[]{this, new Integer(i), new Integer(i2), cls})).intValue();
        }
        if (cls == null || isWatcher((Class<?>) cls)) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        WatcherWrapper watcherWrapper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa3c11", new Object[]{this, obj});
            return;
        }
        if (isWatcher(obj)) {
            watcherWrapper = getWatcherFor(obj);
            if (watcherWrapper != null) {
                obj = watcherWrapper;
            }
        } else {
            watcherWrapper = null;
        }
        super.removeSpan(obj);
        if (watcherWrapper != null) {
            this.mWatchers.remove(watcherWrapper);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a30dd4", new Object[]{this, obj, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (isWatcher(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.mWatchers.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("45243232", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return new SpannableBuilder(this.mWatcherClass, this, i, i2);
    }

    private boolean isWatcher(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fad83a8", new Object[]{this, cls})).booleanValue() : this.mWatcherClass == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e29c21b5", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        super.delete(i, i2);
        return this;
    }

    private void blockWatchers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5439c6b", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).blockCalls();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("334f368a", new Object[]{this, new Integer(i), charSequence});
        }
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("1820b522", new Object[]{this, new Integer(i), new Integer(i2), charSequence});
        }
        blockWatchers();
        super.replace(i, i2, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("9f93692a", new Object[]{this, new Integer(i), charSequence, new Integer(i2), new Integer(i3)});
        }
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableBuilder(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("95ffa1c2", new Object[]{this, new Integer(i), new Integer(i2), charSequence, new Integer(i3), new Integer(i4)});
        }
        blockWatchers();
        super.replace(i, i2, charSequence, i3, i4);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("58fbd3e8", new Object[]{this, charSequence});
        }
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("91fdf61f", new Object[]{this, new Character(c)});
        }
        super.append(c);
        return this;
    }

    public SpannableBuilder(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("c8e2708", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
        }
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("a95e8f65", new Object[]{this, charSequence, obj, new Integer(i)});
        }
        super.append(charSequence, obj, i);
        return this;
    }
}
