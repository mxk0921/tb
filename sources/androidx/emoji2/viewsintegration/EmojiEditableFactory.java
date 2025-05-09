package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiEditableFactory extends Editable.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object INSTANCE_LOCK = new Object();
    private static volatile Editable.Factory sInstance;
    private static Class<?> sWatcherClass;

    private EmojiEditableFactory() {
        try {
            sWatcherClass = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editable.Factory) ipChange.ipc$dispatch("482ce4f7", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new EmojiEditableFactory();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static /* synthetic */ Object ipc$super(EmojiEditableFactory emojiEditableFactory, String str, Object... objArr) {
        if (str.hashCode() == 1057833978) {
            return super.newEditable((CharSequence) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/viewsintegration/EmojiEditableFactory");
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editable) ipChange.ipc$dispatch("3f0d43fa", new Object[]{this, charSequence});
        }
        Class<?> cls = sWatcherClass;
        if (cls != null) {
            return SpannableBuilder.create(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
