package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = new FontProviderHelper();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long j) {
            this.mTotalMs = j;
        }

        public static /* synthetic */ Object ipc$super(ExponentialBackoffRetryPolicy exponentialBackoffRetryPolicy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy");
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39840bac", new Object[]{this})).longValue();
            }
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (uptimeMillis > this.mTotalMs) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.mTotalMs - uptimeMillis);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FontProviderHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Typeface buildTypeface(Context context, FontsContractCompat.FontInfo fontInfo) throws PackageManager.NameNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("bd79e7fe", new Object[]{this, context, fontInfo});
            }
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        public FontsContractCompat.FontFamilyResult fetchFonts(Context context, FontRequest fontRequest) throws PackageManager.NameNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontsContractCompat.FontFamilyResult) ipChange.ipc$dispatch("c1fab81b", new Object[]{this, context, fontRequest});
            }
            return FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public void registerObserver(Context context, Uri uri, ContentObserver contentObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36188713", new Object[]{this, context, uri, contentObserver});
            } else {
                context.getContentResolver().registerContentObserver(uri, false, contentObserver);
            }
        }

        public void unregisterObserver(Context context, ContentObserver contentObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d1a0923", new Object[]{this, context, contentObserver});
            } else {
                context.getContentResolver().unregisterContentObserver(contentObserver);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        public EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final Context mContext;
        private Executor mExecutor;
        private final FontProviderHelper mFontProviderHelper;
        private final Object mLock = new Object();
        private Handler mMainHandler;
        private Runnable mMainHandlerLoadCallback;
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        private ContentObserver mObserver;
        private final FontRequest mRequest;
        private RetryPolicy mRetryPolicy;

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) {
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = fontRequest;
            this.mFontProviderHelper = fontProviderHelper;
        }

        private void cleanUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
                return;
            }
            synchronized (this.mLock) {
                try {
                    this.mCallback = null;
                    ContentObserver contentObserver = this.mObserver;
                    if (contentObserver != null) {
                        this.mFontProviderHelper.unregisterObserver(this.mContext, contentObserver);
                        this.mObserver = null;
                    }
                    Handler handler = this.mMainHandler;
                    if (handler != null) {
                        handler.removeCallbacks(this.mMainHandlerLoadCallback);
                    }
                    this.mMainHandler = null;
                    ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.mExecutor = null;
                    this.mMyThreadPoolExecutor = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void scheduleRetry(Uri uri, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47f83eb5", new Object[]{this, uri, new Long(j)});
                return;
            }
            synchronized (this.mLock) {
                try {
                    Handler handler = this.mMainHandler;
                    if (handler == null) {
                        handler = ConcurrencyHelpers.mainHandlerAsync();
                        this.mMainHandler = handler;
                    }
                    if (this.mObserver == null) {
                        ContentObserver contentObserver = new ContentObserver(handler) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1");
                            }

                            @Override // android.database.ContentObserver
                            public void onChange(boolean z, Uri uri2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri2});
                                } else {
                                    FontRequestMetadataLoader.this.loadInternal();
                                }
                            }
                        };
                        this.mObserver = contentObserver;
                        this.mFontProviderHelper.registerObserver(this.mContext, uri, contentObserver);
                    }
                    if (this.mMainHandlerLoadCallback == null) {
                        this.mMainHandlerLoadCallback = new Runnable() { // from class: tb.vu9
                            @Override // java.lang.Runnable
                            public final void run() {
                                FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.loadInternal();
                            }
                        };
                    }
                    handler.postDelayed(this.mMainHandlerLoadCallback, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void createMetadata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c55f2b52", new Object[]{this});
                return;
            }
            synchronized (this.mLock) {
                try {
                    if (this.mCallback != null) {
                        try {
                            FontsContractCompat.FontInfo retrieveFontInfo = retrieveFontInfo();
                            int resultCode = retrieveFontInfo.getResultCode();
                            if (resultCode == 2) {
                                synchronized (this.mLock) {
                                    RetryPolicy retryPolicy = this.mRetryPolicy;
                                    if (retryPolicy != null) {
                                        long retryDelay = retryPolicy.getRetryDelay();
                                        if (retryDelay >= 0) {
                                            scheduleRetry(retrieveFontInfo.getUri(), retryDelay);
                                            return;
                                        }
                                    }
                                }
                            }
                            if (resultCode == 0) {
                                TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);
                                Typeface buildTypeface = this.mFontProviderHelper.buildTypeface(this.mContext, retrieveFontInfo);
                                ByteBuffer mmap = TypefaceCompatUtil.mmap(this.mContext, null, retrieveFontInfo.getUri());
                                if (mmap == null || buildTypeface == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                MetadataRepo create = MetadataRepo.create(buildTypeface, mmap);
                                TraceCompat.endSection();
                                synchronized (this.mLock) {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.mCallback;
                                    if (metadataRepoLoaderCallback != null) {
                                        metadataRepoLoaderCallback.onLoaded(create);
                                    }
                                }
                                cleanUp();
                                return;
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + f7l.BRACKET_END_STR);
                        } catch (Throwable th) {
                            synchronized (this.mLock) {
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.mCallback;
                                    if (metadataRepoLoaderCallback2 != null) {
                                        metadataRepoLoaderCallback2.onFailed(th);
                                    }
                                    cleanUp();
                                } finally {
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29eb0e7a", new Object[]{this, metadataRepoLoaderCallback});
                return;
            }
            Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = metadataRepoLoaderCallback;
            }
            loadInternal();
        }

        public void loadInternal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4d994ca", new Object[]{this});
                return;
            }
            synchronized (this.mLock) {
                try {
                    if (this.mCallback != null) {
                        if (this.mExecutor == null) {
                            ThreadPoolExecutor createBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                            this.mMyThreadPoolExecutor = createBackgroundPriorityExecutor;
                            this.mExecutor = createBackgroundPriorityExecutor;
                        }
                        this.mExecutor.execute(new Runnable() { // from class: tb.uu9
                            @Override // java.lang.Runnable
                            public final void run() {
                                FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.createMetadata();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setExecutor(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d983d3a", new Object[]{this, executor});
                return;
            }
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(RetryPolicy retryPolicy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8cdc09d", new Object[]{this, retryPolicy});
                return;
            }
            synchronized (this.mLock) {
                this.mRetryPolicy = retryPolicy;
            }
        }

        private FontsContractCompat.FontInfo retrieveFontInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontsContractCompat.FontInfo) ipChange.ipc$dispatch("df11f954", new Object[]{this});
            }
            try {
                FontsContractCompat.FontFamilyResult fetchFonts = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (fetchFonts.getStatusCode() == 0) {
                    FontsContractCompat.FontInfo[] fonts = fetchFonts.getFonts();
                    if (fonts != null && fonts.length != 0) {
                        return fonts[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + fetchFonts.getStatusCode() + f7l.BRACKET_END_STR);
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class RetryPolicy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract long getRetryDelay();
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest) {
        super(new FontRequestMetadataLoader(context, fontRequest, DEFAULT_FONTS_CONTRACT));
    }

    public static /* synthetic */ Object ipc$super(FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/FontRequestEmojiCompatConfig");
    }

    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontRequestEmojiCompatConfig) ipChange.ipc$dispatch("518f1fa1", new Object[]{this, handler});
        }
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public FontRequestEmojiCompatConfig setLoadingExecutor(Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontRequestEmojiCompatConfig) ipChange.ipc$dispatch("6d6bde44", new Object[]{this, executor});
        }
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    public FontRequestEmojiCompatConfig setRetryPolicy(RetryPolicy retryPolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontRequestEmojiCompatConfig) ipChange.ipc$dispatch("b17939ff", new Object[]{this, retryPolicy});
        }
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(retryPolicy);
        return this;
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, fontRequest, fontProviderHelper));
    }
}
