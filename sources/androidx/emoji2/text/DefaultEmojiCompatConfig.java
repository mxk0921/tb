package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DefaultEmojiCompatConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultEmojiCompatConfigHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProviderInfo) ipChange.ipc$dispatch("bfd18cc3", new Object[]{this, resolveInfo});
            }
            return resolveInfo.providerInfo;
        }

        public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Signature[]) ipChange.ipc$dispatch("70e94f4f", new Object[]{this, packageManager, str});
            }
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d7317bab", new Object[]{this, packageManager, intent, new Integer(i)});
            }
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DefaultEmojiCompatConfigHelper_API28 defaultEmojiCompatConfigHelper_API28, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28");
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Signature[]) ipChange.ipc$dispatch("70e94f4f", new Object[]{this, packageManager, str});
            }
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private DefaultEmojiCompatConfig() {
    }

    public static FontRequestEmojiCompatConfig create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontRequestEmojiCompatConfig) ipChange.ipc$dispatch("6ff6d507", new Object[]{context});
        }
        return (FontRequestEmojiCompatConfig) new DefaultEmojiCompatConfigFactory(null).create(context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultEmojiCompatConfigFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";
        private static final String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";
        private static final String TAG = "emoji2.text.DefaultEmojiConfig";
        private final DefaultEmojiCompatConfigHelper mHelper;

        public DefaultEmojiCompatConfigFactory(DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper) {
            this.mHelper = defaultEmojiCompatConfigHelper == null ? getHelperForApi() : defaultEmojiCompatConfigHelper;
        }

        private EmojiCompat.Config configOrNull(Context context, FontRequest fontRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmojiCompat.Config) ipChange.ipc$dispatch("8c6043c6", new Object[]{this, context, fontRequest});
            }
            if (fontRequest == null) {
                return null;
            }
            return new FontRequestEmojiCompatConfig(context, fontRequest);
        }

        private List<List<byte[]>> convertToByteArray(Signature[] signatureArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("84cc7ac9", new Object[]{this, signatureArr});
            }
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private FontRequest generateFontRequestFrom(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontRequest) ipChange.ipc$dispatch("9993bb25", new Object[]{this, providerInfo, packageManager});
            }
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new FontRequest(str, str2, DEFAULT_EMOJI_QUERY, convertToByteArray(this.mHelper.getSigningSignatures(packageManager, str2)));
        }

        private static DefaultEmojiCompatConfigHelper getHelperForApi() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultEmojiCompatConfigHelper) ipChange.ipc$dispatch("766e73c", new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return new DefaultEmojiCompatConfigHelper_API28();
            }
            return new DefaultEmojiCompatConfigHelper();
        }

        private ProviderInfo queryDefaultInstalledContentProvider(PackageManager packageManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProviderInfo) ipChange.ipc$dispatch("180918c4", new Object[]{this, packageManager});
            }
            for (ResolveInfo resolveInfo : this.mHelper.queryIntentContentProviders(packageManager, new Intent(INTENT_LOAD_EMOJI_FONT), 0)) {
                ProviderInfo providerInfo = this.mHelper.getProviderInfo(resolveInfo);
                if (hasFlagSystem(providerInfo)) {
                    return providerInfo;
                }
            }
            return null;
        }

        public EmojiCompat.Config create(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmojiCompat.Config) ipChange.ipc$dispatch("b54e6053", new Object[]{this, context});
            }
            return configOrNull(context, queryForDefaultFontRequest(context));
        }

        public FontRequest queryForDefaultFontRequest(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FontRequest) ipChange.ipc$dispatch("b5b0ba78", new Object[]{this, context});
            }
            PackageManager packageManager = context.getPackageManager();
            Preconditions.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo queryDefaultInstalledContentProvider = queryDefaultInstalledContentProvider(packageManager);
            if (queryDefaultInstalledContentProvider == null) {
                return null;
            }
            try {
                return generateFontRequestFrom(queryDefaultInstalledContentProvider, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(TAG, e);
                return null;
            }
        }

        private boolean hasFlagSystem(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f6ff606e", new Object[]{this, providerInfo})).booleanValue();
            }
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }
    }
}
