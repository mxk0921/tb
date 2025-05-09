package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.DefaultEmojiCompatConfig;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EmojiCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean sHasDoneDefaultConfigLookup;
    private static volatile EmojiCompat sInstance;
    public final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final GlyphChecker mGlyphChecker;
    private final CompatInternal mHelper;
    private final Set<InitWithExecutor> mInitCallbacks;
    private final ReadWriteLock mInitLock = new ReentrantReadWriteLock();
    private volatile int mLoadState = 3;
    private final int mMetadataLoadStrategy;
    public final MetadataRepoLoader mMetadataLoader;
    public final boolean mReplaceAll;
    private final SpanFactory mSpanFactory;
    public final boolean mUseEmojiAsDefaultStyle;
    private static final Object INSTANCE_LOCK = new Object();
    private static final Object CONFIG_LOCK = new Object();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface CodepointSequenceMatchResult {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CompatInternal {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EmojiCompat mEmojiCompat;
        private volatile MetadataRepo mMetadataRepo;
        private volatile EmojiProcessor mProcessor;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }

        public static /* synthetic */ EmojiCompat access$000(CompatInternal compatInternal) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmojiCompat) ipChange.ipc$dispatch("fc24a038", new Object[]{compatInternal});
            }
            return compatInternal.mEmojiCompat;
        }

        public String getAssetSignature() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2d99751b", new Object[]{this});
            }
            String sourceSha = this.mMetadataRepo.getMetadataList().sourceSha();
            if (sourceSha == null) {
                return "";
            }
            return sourceSha;
        }

        public int getEmojiEnd(CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("851327e0", new Object[]{this, charSequence, new Integer(i)})).intValue();
            }
            return this.mProcessor.getEmojiEnd(charSequence, i);
        }

        public int getEmojiMatch(CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("530dcb36", new Object[]{this, charSequence, new Integer(i)})).intValue();
            }
            return this.mProcessor.getEmojiMatch(charSequence, i);
        }

        public int getEmojiStart(CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3ef661b9", new Object[]{this, charSequence, new Integer(i)})).intValue();
            }
            return this.mProcessor.getEmojiStart(charSequence, i);
        }

        public boolean hasEmojiGlyph(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("254306ef", new Object[]{this, charSequence})).booleanValue() : this.mProcessor.getEmojiMatch(charSequence) == 1;
        }

        public void loadMetadata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3853c03c", new Object[]{this});
                return;
            }
            try {
                this.mEmojiCompat.mMetadataLoader.load(new MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/EmojiCompat$CompatInternal$1");
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("36700252", new Object[]{this, th});
                        } else {
                            CompatInternal.access$000(CompatInternal.this).onMetadataLoadFailed(th);
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(MetadataRepo metadataRepo) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d64e0d0", new Object[]{this, metadataRepo});
                        } else {
                            CompatInternal.this.onMetadataLoadSuccess(metadataRepo);
                        }
                    }
                });
            } catch (Throwable th) {
                this.mEmojiCompat.onMetadataLoadFailed(th);
            }
        }

        public void onMetadataLoadSuccess(MetadataRepo metadataRepo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca50f005", new Object[]{this, metadataRepo});
            } else if (metadataRepo == null) {
                this.mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
            } else {
                this.mMetadataRepo = metadataRepo;
                MetadataRepo metadataRepo2 = this.mMetadataRepo;
                SpanFactory access$100 = EmojiCompat.access$100(this.mEmojiCompat);
                GlyphChecker access$200 = EmojiCompat.access$200(this.mEmojiCompat);
                EmojiCompat emojiCompat = this.mEmojiCompat;
                this.mProcessor = new EmojiProcessor(metadataRepo2, access$100, access$200, emojiCompat.mUseEmojiAsDefaultStyle, emojiCompat.mEmojiAsDefaultStyleExceptions, EmojiExclusions.getEmojiExclusions());
                this.mEmojiCompat.onMetadataLoadSuccess();
            }
        }

        public CharSequence process(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("87a675af", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            }
            return this.mProcessor.process(charSequence, i, i2, i3, z);
        }

        public void updateEditorInfoAttrs(EditorInfo editorInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73b6ac53", new Object[]{this, editorInfo});
                return;
            }
            editorInfo.extras.putInt(EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.mMetadataRepo.getMetadataVersion());
            editorInfo.extras.putBoolean(EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.mEmojiCompat.mReplaceAll);
        }

        public boolean hasEmojiGlyph(CharSequence charSequence, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("831e497c", new Object[]{this, charSequence, new Integer(i)})).booleanValue() : this.mProcessor.getEmojiMatch(charSequence, i) == 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Config {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int[] mEmojiAsDefaultStyleExceptions;
        public boolean mEmojiSpanIndicatorEnabled;
        public Set<InitWithExecutor> mInitCallbacks;
        public final MetadataRepoLoader mMetadataLoader;
        public boolean mReplaceAll;
        public SpanFactory mSpanFactory;
        public boolean mUseEmojiAsDefaultStyle;
        public int mEmojiSpanIndicatorColor = -16711936;
        public int mMetadataLoadStrategy = 0;
        public GlyphChecker mGlyphChecker = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.mMetadataLoader = metadataRepoLoader;
        }

        public final MetadataRepoLoader getMetadataRepoLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MetadataRepoLoader) ipChange.ipc$dispatch("2f59e0ad", new Object[]{this});
            }
            return this.mMetadataLoader;
        }

        public Config registerInitCallback(InitCallback initCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("8024c97a", new Object[]{this, initCallback});
            }
            registerInitCallback(ConcurrencyHelpers.mainThreadExecutor(), initCallback);
            return this;
        }

        public Config setEmojiSpanIndicatorColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("72cb1da8", new Object[]{this, new Integer(i)});
            }
            this.mEmojiSpanIndicatorColor = i;
            return this;
        }

        public Config setEmojiSpanIndicatorEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("5a16091b", new Object[]{this, new Boolean(z)});
            }
            this.mEmojiSpanIndicatorEnabled = z;
            return this;
        }

        public Config setGlyphChecker(GlyphChecker glyphChecker) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("1c113af3", new Object[]{this, glyphChecker});
            }
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.mGlyphChecker = glyphChecker;
            return this;
        }

        public Config setMetadataLoadStrategy(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("b1d8fc80", new Object[]{this, new Integer(i)});
            }
            this.mMetadataLoadStrategy = i;
            return this;
        }

        public Config setReplaceAll(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("64ac15ec", new Object[]{this, new Boolean(z)});
            }
            this.mReplaceAll = z;
            return this;
        }

        public Config setSpanFactory(SpanFactory spanFactory) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("8316d6c3", new Object[]{this, spanFactory});
            }
            this.mSpanFactory = spanFactory;
            return this;
        }

        public Config setUseEmojiAsDefaultStyle(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("733f2d98", new Object[]{this, new Boolean(z)}) : setUseEmojiAsDefaultStyle(z, null);
        }

        public Config unregisterInitCallback(InitCallback initCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("8fb401c1", new Object[]{this, initCallback});
            }
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks != null) {
                ArrayList arrayList = new ArrayList();
                for (InitWithExecutor initWithExecutor : this.mInitCallbacks) {
                    if (initWithExecutor.mInitCallback == initCallback) {
                        arrayList.add(initWithExecutor);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.mInitCallbacks.remove((InitWithExecutor) it.next());
                }
            }
            return this;
        }

        public Config registerInitCallback(Executor executor, InitCallback initCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("a63c60c2", new Object[]{this, executor, initCallback});
            }
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            Preconditions.checkNotNull(executor, "executor cannot be null");
            if (this.mInitCallbacks == null) {
                this.mInitCallbacks = new ArraySet();
            }
            this.mInitCallbacks.add(new InitWithExecutor(executor, initCallback));
            return this;
        }

        public Config setUseEmojiAsDefaultStyle(boolean z, List<Integer> list) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("2b3d2189", new Object[]{this, new Boolean(z), list});
            }
            this.mUseEmojiAsDefaultStyle = z;
            if (!z || list == null) {
                this.mEmojiAsDefaultStyleExceptions = null;
            } else {
                this.mEmojiAsDefaultStyleExceptions = new int[list.size()];
                for (Integer num : list) {
                    i++;
                    this.mEmojiAsDefaultStyleExceptions[i] = num.intValue();
                }
                Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultSpanFactory implements SpanFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public EmojiSpan createSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmojiSpan) ipChange.ipc$dispatch("6701aa83", new Object[]{this, typefaceEmojiRasterizer});
            }
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface GlyphChecker {
        boolean hasGlyph(CharSequence charSequence, int i, int i2, int i3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class InitCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void onFailed(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36700252", new Object[]{this, th});
            }
        }

        public void onInitialized() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class InitWithExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Executor mExecutor;
        public InitCallback mInitCallback;

        public InitWithExecutor(Executor executor, InitCallback initCallback) {
            this.mInitCallback = initCallback;
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatchFailed$1(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dfea18d", new Object[]{this, th});
            } else {
                this.mInitCallback.onFailed(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatchInitialized$0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("442322f0", new Object[]{this});
            } else {
                this.mInitCallback.onInitialized();
            }
        }

        public void dispatchFailed(final Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e906b857", new Object[]{this, th});
            } else {
                this.mExecutor.execute(new Runnable() { // from class: tb.fc8
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmojiCompat.InitWithExecutor.this.lambda$dispatchFailed$1(th);
                    }
                });
            }
        }

        public void dispatchInitialized() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaf85181", new Object[]{this});
            } else {
                this.mExecutor.execute(new Runnable() { // from class: tb.ec8
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmojiCompat.InitWithExecutor.this.lambda$dispatchInitialized$0();
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface LoadStrategy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface MetadataRepoLoader {
        void load(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class MetadataRepoLoaderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onFailed(Throwable th);

        public abstract void onLoaded(MetadataRepo metadataRepo);
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ReplaceStrategy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface SpanFactory {
        EmojiSpan createSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private EmojiCompat(Config config) {
        this.mReplaceAll = config.mReplaceAll;
        this.mUseEmojiAsDefaultStyle = config.mUseEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = config.mEmojiAsDefaultStyleExceptions;
        this.mEmojiSpanIndicatorEnabled = config.mEmojiSpanIndicatorEnabled;
        this.mEmojiSpanIndicatorColor = config.mEmojiSpanIndicatorColor;
        this.mMetadataLoader = config.mMetadataLoader;
        this.mMetadataLoadStrategy = config.mMetadataLoadStrategy;
        this.mGlyphChecker = config.mGlyphChecker;
        ArraySet arraySet = new ArraySet();
        this.mInitCallbacks = arraySet;
        SpanFactory spanFactory = config.mSpanFactory;
        this.mSpanFactory = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        Set<InitWithExecutor> set = config.mInitCallbacks;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(config.mInitCallbacks);
        }
        this.mHelper = new CompatInternal(this);
        loadMetadata();
    }

    public static /* synthetic */ SpanFactory access$100(EmojiCompat emojiCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpanFactory) ipChange.ipc$dispatch("72326c82", new Object[]{emojiCompat});
        }
        return emojiCompat.mSpanFactory;
    }

    public static /* synthetic */ GlyphChecker access$200(EmojiCompat emojiCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlyphChecker) ipChange.ipc$dispatch("46a85bec", new Object[]{emojiCompat});
        }
        return emojiCompat.mGlyphChecker;
    }

    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat) ipChange.ipc$dispatch("443365e5", new Object[0]);
        }
        synchronized (INSTANCE_LOCK) {
            emojiCompat = sInstance;
            if (emojiCompat != null) {
                z = true;
            }
            Preconditions.checkState(z, NOT_INITIALIZED_ERROR_TEXT);
        }
        return emojiCompat;
    }

    public static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf81197", new Object[]{inputConnection, editable, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
        }
        return EmojiProcessor.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
    }

    public static boolean handleOnKeyDown(Editable editable, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab82bff7", new Object[]{editable, new Integer(i), keyEvent})).booleanValue();
        }
        return EmojiProcessor.handleOnKeyDown(editable, i, keyEvent);
    }

    public static EmojiCompat init(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EmojiCompat) ipChange.ipc$dispatch("aa2a0331", new Object[]{context}) : init(context, null);
    }

    public static boolean isConfigured() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fbcb793", new Object[0])).booleanValue();
        }
        if (sInstance != null) {
            return true;
        }
        return false;
    }

    private boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        if (getLoadState() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    private void loadMetadata() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3853c03c", new Object[]{this});
            return;
        }
        this.mInitLock.writeLock().lock();
        try {
            if (this.mMetadataLoadStrategy == 0) {
                this.mLoadState = 0;
            }
            this.mInitLock.writeLock().unlock();
            if (getLoadState() == 0) {
                this.mHelper.loadMetadata();
            }
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    public static EmojiCompat reset(Config config) {
        EmojiCompat emojiCompat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat) ipChange.ipc$dispatch("d1cf78ba", new Object[]{config});
        }
        synchronized (INSTANCE_LOCK) {
            emojiCompat = new EmojiCompat(config);
            sInstance = emojiCompat;
        }
        return emojiCompat;
    }

    public static void skipDefaultConfigurationLookup(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb338ff", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (CONFIG_LOCK) {
            sHasDoneDefaultConfigLookup = z;
        }
    }

    public String getAssetSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d99751b", new Object[]{this});
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        return this.mHelper.getAssetSignature();
    }

    public int getEmojiEnd(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("851327e0", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiEnd(charSequence, i);
    }

    public int getEmojiMatch(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("530dcb36", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.getEmojiMatch(charSequence, i);
    }

    public int getEmojiSpanIndicatorColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("719ec8a8", new Object[]{this})).intValue();
        }
        return this.mEmojiSpanIndicatorColor;
    }

    public int getEmojiStart(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ef661b9", new Object[]{this, charSequence, new Integer(i)})).intValue();
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiStart(charSequence, i);
    }

    public int getLoadState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8510d28f", new Object[]{this})).intValue();
        }
        this.mInitLock.readLock().lock();
        try {
            return this.mLoadState;
        } finally {
            this.mInitLock.readLock().unlock();
        }
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("254306ef", new Object[]{this, charSequence})).booleanValue();
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence);
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0806183", new Object[]{this})).booleanValue();
        }
        return this.mEmojiSpanIndicatorEnabled;
    }

    public void load() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        if (this.mMetadataLoadStrategy != 1) {
            z = false;
        }
        Preconditions.checkState(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!isInitialized()) {
            this.mInitLock.writeLock().lock();
            try {
                if (this.mLoadState != 0) {
                    this.mLoadState = 0;
                    this.mInitLock.writeLock().unlock();
                    this.mHelper.loadMetadata();
                }
            } finally {
                this.mInitLock.writeLock().unlock();
            }
        }
    }

    public void onMetadataLoadFailed(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5ff55d", new Object[]{this, th});
            return;
        }
        Set<InitWithExecutor> set = this.mInitCallbacks;
        ArrayList arrayList = new ArrayList(set.size());
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 2;
            arrayList.addAll(set);
            set.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                ((InitWithExecutor) arrayList.get(i)).dispatchFailed(th);
            }
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public void onMetadataLoadSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63153a36", new Object[]{this});
            return;
        }
        Set<InitWithExecutor> set = this.mInitCallbacks;
        ArrayList arrayList = new ArrayList(set.size());
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 1;
            arrayList.addAll(set);
            set.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                ((InitWithExecutor) arrayList.get(i)).dispatchInitialized();
            }
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public CharSequence process(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("d402b460", new Object[]{this, charSequence});
        }
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void registerInitCallback(InitCallback initCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692389cc", new Object[]{this, initCallback});
        } else {
            registerInitCallback(ConcurrencyHelpers.mainThreadExecutor(), initCallback);
        }
    }

    public void unregisterInitCallback(InitCallback initCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dadd513", new Object[]{this, initCallback});
            return;
        }
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (InitWithExecutor initWithExecutor : this.mInitCallbacks) {
                if (initWithExecutor.mInitCallback == initCallback) {
                    arrayList.add(initWithExecutor);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.mInitCallbacks.remove((InitWithExecutor) it.next());
            }
            this.mInitLock.writeLock().unlock();
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    public void updateEditorInfo(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697f834d", new Object[]{this, editorInfo});
        } else if (isInitialized() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.mHelper.updateEditorInfoAttrs(editorInfo);
        }
    }

    public static EmojiCompat init(Context context, DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        EmojiCompat emojiCompat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat) ipChange.ipc$dispatch("567708dd", new Object[]{context, defaultEmojiCompatConfigFactory});
        }
        if (sHasDoneDefaultConfigLookup) {
            return sInstance;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        Config create = defaultEmojiCompatConfigFactory.create(context);
        synchronized (CONFIG_LOCK) {
            try {
                if (!sHasDoneDefaultConfigLookup) {
                    if (create != null) {
                        init(create);
                    }
                    sHasDoneDefaultConfigLookup = true;
                }
                emojiCompat = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    public void registerInitCallback(Executor executor, InitCallback initCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fada0914", new Object[]{this, executor, initCallback});
            return;
        }
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        Preconditions.checkNotNull(executor, "executor cannot be null");
        InitWithExecutor initWithExecutor = new InitWithExecutor(executor, initCallback);
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 1) {
                initWithExecutor.dispatchInitialized();
            } else if (this.mLoadState == 2) {
                initWithExecutor.dispatchFailed(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.mInitCallbacks.add(initWithExecutor);
            }
            this.mInitLock.writeLock().unlock();
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence process(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("e2d5680", new Object[]{this, charSequence, new Integer(i), new Integer(i2)}) : process(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("831e497c", new Object[]{this, charSequence, new Integer(i)})).booleanValue();
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence, i);
    }

    public CharSequence process(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("20fdab51", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)}) : process(charSequence, i, i2, i3, 0);
    }

    public CharSequence process(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("6837f0a0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(i, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(i2, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(i3, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(i <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.mReplaceAll : false;
        } else {
            z = true;
        }
        return this.mHelper.process(charSequence, i, i2, i3, z);
    }

    public static EmojiCompat reset(EmojiCompat emojiCompat) {
        EmojiCompat emojiCompat2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat) ipChange.ipc$dispatch("d0a4cc0", new Object[]{emojiCompat});
        }
        synchronized (INSTANCE_LOCK) {
            sInstance = emojiCompat;
            emojiCompat2 = sInstance;
        }
        return emojiCompat2;
    }

    public static EmojiCompat init(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat) ipChange.ipc$dispatch("cdd12bb", new Object[]{config});
        }
        EmojiCompat emojiCompat = sInstance;
        if (emojiCompat == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    emojiCompat = sInstance;
                    if (emojiCompat == null) {
                        emojiCompat = new EmojiCompat(config);
                        sInstance = emojiCompat;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emojiCompat;
    }
}
